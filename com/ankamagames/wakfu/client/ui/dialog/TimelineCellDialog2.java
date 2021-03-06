package com.ankamagames.wakfu.client.ui.dialog;

import java.util.*;
import com.ankamagames.xulor2.core.*;
import com.ankamagames.xulor2.util.alignment.*;
import com.ankamagames.xulor2.property.*;
import com.ankamagames.xulor2.appearance.spacing.*;
import java.awt.*;
import com.ankamagames.xulor2.core.renderer.condition.*;
import com.ankamagames.xulor2.util.*;
import com.ankamagames.framework.graphics.image.*;
import com.ankamagames.xulor2.component.*;
import com.ankamagames.xulor2.layout.*;
import com.ankamagames.xulor2.decorator.*;
import com.ankamagames.xulor2.decorator.mesh.*;
import com.ankamagames.xulor2.appearance.*;

public class TimelineCellDialog2 implements BasicElementFactory
{
    private Stack<ElementMap> elementMaps;
    private Environment env;
    
    public TimelineCellDialog2() {
        super();
        this.elementMaps = new Stack<ElementMap>();
    }
    
    @Override
    public BasicElement getElement(final Environment env, final ElementMap item) {
        this.env = env;
        this.elementMaps.push(item);
        final ElementMap elementMap = this.elementMaps.peek();
        final String id = "watcherContainer";
        final WatcherContainer element = new WatcherContainer();
        element.onCheckOut();
        element.setElementMap(elementMap);
        if (elementMap != null && id != null) {
            elementMap.add(id, element);
        }
        element.setPack(true);
        element.setAlign(Alignment9.NORTH);
        element.onAttributesInitialized();
        final Container checkOut = Container.checkOut();
        checkOut.setElementMap(elementMap);
        checkOut.setExpandable(false);
        checkOut.setNonBlocking(true);
        element.addBasicElement(checkOut);
        checkOut.onAttributesInitialized();
        final PropertyElement checkOut2 = PropertyElement.checkOut();
        checkOut2.setElementMap(elementMap);
        checkOut2.setName("timeline.displayHPBar");
        checkOut2.setAttribute("visible");
        checkOut.addBasicElement(checkOut2);
        checkOut2.onAttributesInitialized();
        final ConditionResult element2 = new ConditionResult();
        element2.onCheckOut();
        element2.setElementMap(elementMap);
        checkOut2.addBasicElement(element2);
        element2.onAttributesInitialized();
        final AndCondition element3 = new AndCondition();
        element3.onCheckOut();
        element3.setElementMap(elementMap);
        element2.addBasicElement(element3);
        element3.onAttributesInitialized();
        final TrueCondition element4 = new TrueCondition();
        element4.onCheckOut();
        element4.setElementMap(elementMap);
        element3.addBasicElement(element4);
        element4.onAttributesInitialized();
        element4.onChildrenAdded();
        final GreaterCondition element5 = new GreaterCondition();
        element5.onCheckOut();
        element5.setElementMap(elementMap);
        element5.setValue("0");
        element3.addBasicElement(element5);
        element5.onAttributesInitialized();
        final PropertyElement checkOut3 = PropertyElement.checkOut();
        checkOut3.setElementMap(elementMap);
        checkOut3.setLocal(true);
        checkOut3.setAttribute("comparedValue");
        checkOut3.setName("timeline.fighter");
        checkOut3.setField("characValue");
        element5.addBasicElement(checkOut3);
        checkOut3.onAttributesInitialized();
        checkOut3.onChildrenAdded();
        element5.onChildrenAdded();
        element3.onChildrenAdded();
        element2.onChildrenAdded();
        checkOut2.onChildrenAdded();
        final DecoratorAppearance appearance = checkOut.getAppearance();
        appearance.setElementMap(elementMap);
        checkOut.addBasicElement(appearance);
        appearance.onAttributesInitialized();
        final Margin checkOut4 = Margin.checkOut();
        checkOut4.setElementMap(elementMap);
        checkOut4.setInsets(new Insets(0, 0, 10, 0));
        appearance.addBasicElement(checkOut4);
        checkOut4.onAttributesInitialized();
        checkOut4.onChildrenAdded();
        appearance.onChildrenAdded();
        final Container checkOut5 = Container.checkOut();
        checkOut5.setElementMap(elementMap);
        checkOut5.setExpandable(false);
        checkOut5.setNonBlocking(true);
        checkOut.addBasicElement(checkOut5);
        checkOut5.onAttributesInitialized();
        final PropertyElement checkOut6 = PropertyElement.checkOut();
        checkOut6.setElementMap(elementMap);
        checkOut6.setLocal(true);
        checkOut6.setAttribute("visible");
        checkOut6.setName("timeline.fighter");
        checkOut6.setField("isHp");
        checkOut5.addBasicElement(checkOut6);
        checkOut6.onAttributesInitialized();
        final ConditionResult element6 = new ConditionResult();
        element6.onCheckOut();
        element6.setElementMap(elementMap);
        checkOut6.addBasicElement(element6);
        element6.onAttributesInitialized();
        final FalseCondition element7 = new FalseCondition();
        element7.onCheckOut();
        element7.setElementMap(elementMap);
        element6.addBasicElement(element7);
        element7.onAttributesInitialized();
        element7.onChildrenAdded();
        element6.onChildrenAdded();
        checkOut6.onChildrenAdded();
        final Label element8 = new Label();
        element8.onCheckOut();
        element8.setElementMap(elementMap);
        element8.setStyle("bigTitle");
        element8.setExpandable(false);
        element8.setNonBlocking(true);
        checkOut5.addBasicElement(element8);
        element8.onAttributesInitialized();
        final RowLayoutData element9 = new RowLayoutData();
        element9.onCheckOut();
        element9.setElementMap(elementMap);
        element9.setAlign(Alignment9.CENTER);
        element8.addBasicElement(element9);
        element9.onAttributesInitialized();
        element9.onChildrenAdded();
        final PropertyElement checkOut7 = PropertyElement.checkOut();
        checkOut7.setElementMap(elementMap);
        checkOut7.setLocal(true);
        checkOut7.setAttribute("text");
        checkOut7.setName("timeline.fighter");
        checkOut7.setField("characValue");
        element8.addBasicElement(checkOut7);
        checkOut7.onAttributesInitialized();
        checkOut7.onChildrenAdded();
        element8.onChildrenAdded();
        final Image element10 = new Image();
        element10.onCheckOut();
        element10.setElementMap(elementMap);
        element10.setExpandable(false);
        element10.setStyle("smallTimer");
        element10.setNonBlocking(true);
        element10.setDisplaySize(new Dimension(20, 20));
        checkOut5.addBasicElement(element10);
        element10.onAttributesInitialized();
        final RowLayoutData element11 = new RowLayoutData();
        element11.onCheckOut();
        element11.setElementMap(elementMap);
        element11.setAlign(Alignment9.CENTER);
        element10.addBasicElement(element11);
        element11.onAttributesInitialized();
        element11.onChildrenAdded();
        element10.onChildrenAdded();
        checkOut5.onChildrenAdded();
        final Container checkOut8 = Container.checkOut();
        checkOut8.setElementMap(elementMap);
        checkOut8.setExpandable(false);
        checkOut8.setNonBlocking(true);
        checkOut.addBasicElement(checkOut8);
        checkOut8.onAttributesInitialized();
        final PropertyElement checkOut9 = PropertyElement.checkOut();
        checkOut9.setElementMap(elementMap);
        checkOut9.setLocal(true);
        checkOut9.setAttribute("visible");
        checkOut9.setName("timeline.fighter");
        checkOut9.setField("isHp");
        checkOut8.addBasicElement(checkOut9);
        checkOut9.onAttributesInitialized();
        checkOut9.onChildrenAdded();
        final DecoratorAppearance appearance2 = checkOut8.getAppearance();
        appearance2.setElementMap(elementMap);
        checkOut8.addBasicElement(appearance2);
        appearance2.onAttributesInitialized();
        final PlainBorder element12 = new PlainBorder();
        element12.onCheckOut();
        element12.setElementMap(elementMap);
        element12.setInsets(new Insets(1, 1, 1, 1));
        element12.setColor(new Color(0.0f, 0.0f, 0.0f, 1.0f));
        appearance2.addBasicElement(element12);
        element12.onAttributesInitialized();
        element12.onChildrenAdded();
        final PlainBackground element13 = new PlainBackground();
        element13.onCheckOut();
        element13.setElementMap(elementMap);
        element13.setColor(new Color(1.0f, 1.0f, 1.0f, 0.5f));
        appearance2.addBasicElement(element13);
        element13.onAttributesInitialized();
        element13.onChildrenAdded();
        appearance2.onChildrenAdded();
        final StaticLayout element14 = new StaticLayout();
        element14.onCheckOut();
        element14.setAdaptToContentSize(true);
        checkOut8.addBasicElement(element14);
        element14.onAttributesInitialized();
        element14.onChildrenAdded();
        final ProgressBar element15 = new ProgressBar();
        element15.onCheckOut();
        element15.setElementMap(elementMap);
        element15.setStyle("hp");
        element15.setUseIncreaseProgressTween(true);
        element15.setUseDecreaseProgressTween(true);
        element15.setPrefSize(new Dimension(45, 6));
        element15.setNonBlocking(true);
        checkOut8.addBasicElement(element15);
        element15.onAttributesInitialized();
        final PropertyElement checkOut10 = PropertyElement.checkOut();
        checkOut10.setElementMap(elementMap);
        checkOut10.setLocal(true);
        checkOut10.setAttribute("maxBound");
        checkOut10.setName("timeline.fighter");
        checkOut10.setField("characMaxValue");
        element15.addBasicElement(checkOut10);
        checkOut10.onAttributesInitialized();
        checkOut10.onChildrenAdded();
        final PropertyElement checkOut11 = PropertyElement.checkOut();
        checkOut11.setElementMap(elementMap);
        checkOut11.setLocal(true);
        checkOut11.setAttribute("value");
        checkOut11.setName("timeline.fighter");
        checkOut11.setField("characValue");
        element15.addBasicElement(checkOut11);
        checkOut11.onAttributesInitialized();
        checkOut11.onChildrenAdded();
        final StaticLayoutData element16 = new StaticLayoutData();
        element16.onCheckOut();
        element16.setElementMap(elementMap);
        element16.setSize(new Dimension(100.0f, 100.0f));
        element15.addBasicElement(element16);
        element16.onAttributesInitialized();
        element16.onChildrenAdded();
        element15.onChildrenAdded();
        final Container checkOut12 = Container.checkOut();
        checkOut12.setElementMap(elementMap);
        checkOut12.setNonBlocking(true);
        checkOut8.addBasicElement(checkOut12);
        checkOut12.onAttributesInitialized();
        final StaticLayoutData element17 = new StaticLayoutData();
        element17.onCheckOut();
        element17.setElementMap(elementMap);
        element17.setSize(new Dimension(100.0f, 100.0f));
        checkOut12.addBasicElement(element17);
        element17.onAttributesInitialized();
        element17.onChildrenAdded();
        final DecoratorAppearance appearance3 = checkOut12.getAppearance();
        appearance3.setElementMap(elementMap);
        checkOut12.addBasicElement(appearance3);
        appearance3.onAttributesInitialized();
        final GradientBackground element18 = new GradientBackground();
        element18.onCheckOut();
        element18.setElementMap(elementMap);
        appearance3.addBasicElement(element18);
        element18.onAttributesInitialized();
        final ColorElement checkOut13 = ColorElement.checkOut();
        checkOut13.setElementMap(elementMap);
        checkOut13.setPosition(GradientBackgroundMesh.GradientBackgroundColorAlign.NORTH_WEST);
        checkOut13.setColor(new Color(1.0f, 1.0f, 1.0f, 0.45f));
        element18.addBasicElement(checkOut13);
        checkOut13.onAttributesInitialized();
        checkOut13.onChildrenAdded();
        final ColorElement checkOut14 = ColorElement.checkOut();
        checkOut14.setElementMap(elementMap);
        checkOut14.setPosition(GradientBackgroundMesh.GradientBackgroundColorAlign.NORTH_EAST);
        checkOut14.setColor(new Color(1.0f, 1.0f, 1.0f, 0.45f));
        element18.addBasicElement(checkOut14);
        checkOut14.onAttributesInitialized();
        checkOut14.onChildrenAdded();
        final ColorElement checkOut15 = ColorElement.checkOut();
        checkOut15.setElementMap(elementMap);
        checkOut15.setPosition(GradientBackgroundMesh.GradientBackgroundColorAlign.SOUTH_WEST);
        checkOut15.setColor(new Color(1.0f, 1.0f, 1.0f, 0.0f));
        element18.addBasicElement(checkOut15);
        checkOut15.onAttributesInitialized();
        checkOut15.onChildrenAdded();
        final ColorElement checkOut16 = ColorElement.checkOut();
        checkOut16.setElementMap(elementMap);
        checkOut16.setPosition(GradientBackgroundMesh.GradientBackgroundColorAlign.SOUTH_EAST);
        checkOut16.setColor(new Color(1.0f, 1.0f, 1.0f, 0.0f));
        element18.addBasicElement(checkOut16);
        checkOut16.onAttributesInitialized();
        checkOut16.onChildrenAdded();
        element18.onChildrenAdded();
        appearance3.onChildrenAdded();
        checkOut12.onChildrenAdded();
        checkOut8.onChildrenAdded();
        checkOut.onChildrenAdded();
        element.onChildrenAdded();
        return element;
    }
}
