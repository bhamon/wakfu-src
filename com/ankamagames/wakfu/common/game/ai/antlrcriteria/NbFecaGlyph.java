package com.ankamagames.wakfu.common.game.ai.antlrcriteria;

import java.util.*;
import com.ankamagames.framework.ai.criteria.antlrcriteria.*;
import com.ankamagames.wakfu.common.game.effectArea.*;

public final class NbFecaGlyph extends NbAreas
{
    public NbFecaGlyph(final ArrayList<ParserObject> args) {
        super(args);
    }
    
    @Override
    protected int getAreaType() {
        return EffectAreaType.FECA_GLYPH.getTypeId();
    }
    
    @Override
    public Enum getEnum() {
        return WakfuCriterionIds.NB_FECA_GLYPH;
    }
}
