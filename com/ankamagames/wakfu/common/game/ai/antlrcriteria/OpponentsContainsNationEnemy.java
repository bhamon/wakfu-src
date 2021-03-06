package com.ankamagames.wakfu.common.game.ai.antlrcriteria;

import com.ankamagames.framework.ai.criteria.antlrcriteria.*;
import com.ankamagames.wakfu.common.datas.*;
import com.ankamagames.wakfu.common.game.fight.*;
import java.util.*;

public final class OpponentsContainsNationEnemy extends FunctionCriterion
{
    private static ArrayList<ParserType[]> signatures;
    private boolean m_target;
    
    @Override
    protected List<ParserType[]> getSignatures() {
        return OpponentsContainsNationEnemy.signatures;
    }
    
    public OpponentsContainsNationEnemy(final ArrayList<ParserObject> args) {
        super();
        this.m_target = (this.checkType(args) == 0 && args.get(0).getValue().equalsIgnoreCase("target"));
    }
    
    @Override
    public int getValidity(final Object criterionUser, final Object criterionTarget, final Object criterionContent, final Object criterionContext) {
        final BasicCharacterInfo character = CriteriaUtils.getTargetCharacterInfoFromParameters(this.m_target, criterionUser, criterionTarget, criterionContext, criterionContent);
        if (character == null) {
            return -1;
        }
        final BasicFight<?> fight = (BasicFight<?>)character.getCurrentFight();
        if (fight == null) {
            return -1;
        }
        final Collection<? extends BasicCharacterInfo> opponents = (Collection<? extends BasicCharacterInfo>)fight.getFightersNotInTeam(character.getTeamId());
        for (final BasicCharacterInfo opponent : opponents) {
            if (opponent.getCitizenComportment().isNationEnemy()) {
                return 0;
            }
        }
        return -1;
    }
    
    @Override
    public Enum getEnum() {
        return WakfuCriterionIds.OPPONENTS_CONTAINS_NATION_ENEMY;
    }
    
    static {
        OpponentsContainsNationEnemy.signatures = new ArrayList<ParserType[]>();
        ParserType[] sig = { ParserType.STRING };
        OpponentsContainsNationEnemy.signatures.add(sig);
        sig = new ParserType[0];
        OpponentsContainsNationEnemy.signatures.add(sig);
    }
}
