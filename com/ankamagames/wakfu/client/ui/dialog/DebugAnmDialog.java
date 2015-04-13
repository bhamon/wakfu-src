package com.ankamagames.wakfu.client.ui.dialog;

import java.util.*;
import com.ankamagames.xulor2.util.*;
import java.awt.*;
import com.ankamagames.xulor2.appearance.spacing.*;
import com.ankamagames.xulor2.layout.*;
import com.ankamagames.xulor2.core.*;
import com.ankamagames.xulor2.nongraphical.*;
import com.ankamagames.xulor2.event.listener.*;
import com.ankamagames.xulor2.core.renderer.*;
import com.ankamagames.xulor2.property.*;
import com.ankamagames.xulor2.component.*;
import com.ankamagames.xulor2.util.alignment.*;
import com.ankamagames.xulor2.appearance.*;

public class DebugAnmDialog implements BasicElementFactory
{
    private Stack<ElementMap> elementMaps;
    private Environment env;
    
    public DebugAnmDialog() {
        super();
        this.elementMaps = new Stack<ElementMap>();
    }
    
    @Override
    public BasicElement getElement(final Environment env, final ElementMap item) {
        this.env = env;
        this.elementMaps.push(item);
        final ElementMap elementMap = this.elementMaps.peek();
        final Window window = new Window();
        window.onCheckOut();
        window.setElementMap(elementMap);
        window.onAttributesInitialized();
        final StaticLayout element = new StaticLayout();
        element.onCheckOut();
        element.setAdaptToContentSize(true);
        window.addBasicElement(element);
        element.onAttributesInitialized();
        element.onChildrenAdded();
        final Container checkOut = Container.checkOut();
        checkOut.setElementMap(elementMap);
        window.addBasicElement(checkOut);
        checkOut.onAttributesInitialized();
        final StaticLayoutData element2 = new StaticLayoutData();
        element2.onCheckOut();
        element2.setElementMap(elementMap);
        element2.setSize(new Dimension(100.0f, 100.0f));
        checkOut.addBasicElement(element2);
        element2.onAttributesInitialized();
        element2.onChildrenAdded();
        checkOut.onChildrenAdded();
        final Container checkOut2 = Container.checkOut();
        checkOut2.setElementMap(elementMap);
        checkOut2.setStyle("windowNew");
        window.addBasicElement(checkOut2);
        checkOut2.onAttributesInitialized();
        final DecoratorAppearance appearance = checkOut2.getAppearance();
        appearance.setElementMap(elementMap);
        checkOut2.addBasicElement(appearance);
        appearance.onAttributesInitialized();
        final Padding element3 = new Padding();
        element3.onCheckOut();
        element3.setElementMap(elementMap);
        element3.setInsets(new Insets(10, 5, 12, 5));
        appearance.addBasicElement(element3);
        element3.onAttributesInitialized();
        element3.onChildrenAdded();
        appearance.onChildrenAdded();
        final StaticLayoutData element4 = new StaticLayoutData();
        element4.onCheckOut();
        element4.setElementMap(elementMap);
        element4.setSize(new Dimension(100.0f, 100.0f));
        checkOut2.addBasicElement(element4);
        element4.onAttributesInitialized();
        element4.onChildrenAdded();
        final RowLayout checkOut3 = RowLayout.checkOut();
        checkOut3.setHorizontal(false);
        checkOut3.setAlign(Alignment9.NORTH);
        checkOut2.addBasicElement(checkOut3);
        checkOut3.onAttributesInitialized();
        checkOut3.onChildrenAdded();
        final WindowMovePoint element5 = new WindowMovePoint();
        element5.onCheckOut();
        element5.setElementMap(elementMap);
        element5.setExpandable(false);
        checkOut2.addBasicElement(element5);
        element5.onAttributesInitialized();
        final DecoratorAppearance appearance2 = element5.getAppearance();
        appearance2.setElementMap(elementMap);
        element5.addBasicElement(appearance2);
        appearance2.onAttributesInitialized();
        final Margin checkOut4 = Margin.checkOut();
        checkOut4.setElementMap(elementMap);
        checkOut4.setInsets(new Insets(0, 10, 0, 10));
        appearance2.addBasicElement(checkOut4);
        checkOut4.onAttributesInitialized();
        checkOut4.onChildrenAdded();
        appearance2.onChildrenAdded();
        final Container checkOut5 = Container.checkOut();
        checkOut5.setElementMap(elementMap);
        checkOut5.setStyle("titleBar");
        element5.addBasicElement(checkOut5);
        checkOut5.onAttributesInitialized();
        final DecoratorAppearance appearance3 = checkOut5.getAppearance();
        appearance3.setElementMap(elementMap);
        checkOut5.addBasicElement(appearance3);
        appearance3.onAttributesInitialized();
        final Padding element6 = new Padding();
        element6.onCheckOut();
        element6.setElementMap(elementMap);
        element6.setInsets(new Insets(3, 20, 3, 20));
        appearance3.addBasicElement(element6);
        element6.onAttributesInitialized();
        element6.onChildrenAdded();
        appearance3.onChildrenAdded();
        final RowLayout checkOut6 = RowLayout.checkOut();
        checkOut6.setHorizontal(false);
        checkOut5.addBasicElement(checkOut6);
        checkOut6.onAttributesInitialized();
        checkOut6.onChildrenAdded();
        final Container checkOut7 = Container.checkOut();
        checkOut7.setElementMap(elementMap);
        checkOut7.setExpandable(false);
        checkOut5.addBasicElement(checkOut7);
        checkOut7.onAttributesInitialized();
        final RowLayoutData element7 = new RowLayoutData();
        element7.onCheckOut();
        element7.setElementMap(elementMap);
        element7.setAlign(Alignment9.CENTER);
        checkOut7.addBasicElement(element7);
        element7.onAttributesInitialized();
        element7.onChildrenAdded();
        final Label element8 = new Label();
        element8.onCheckOut();
        element8.setElementMap(elementMap);
        element8.setStyle("StyledBold16White");
        element8.setNonBlocking(true);
        element8.setText("Debug Anm");
        checkOut7.addBasicElement(element8);
        element8.onAttributesInitialized();
        final DecoratorAppearance appearance4 = element8.getAppearance();
        appearance4.setElementMap(elementMap);
        ((TextWidgetAppearance)appearance4).setAlignment(Alignment9.CENTER);
        element8.addBasicElement(appearance4);
        appearance4.onAttributesInitialized();
        appearance4.onChildrenAdded();
        element8.onChildrenAdded();
        checkOut7.onChildrenAdded();
        checkOut5.onChildrenAdded();
        element5.onChildrenAdded();
        final Container checkOut8 = Container.checkOut();
        checkOut8.setElementMap(elementMap);
        checkOut2.addBasicElement(checkOut8);
        checkOut8.onAttributesInitialized();
        final DecoratorAppearance appearance5 = checkOut8.getAppearance();
        appearance5.setElementMap(elementMap);
        checkOut8.addBasicElement(appearance5);
        appearance5.onAttributesInitialized();
        final Margin checkOut9 = Margin.checkOut();
        checkOut9.setElementMap(elementMap);
        checkOut9.setInsets(new Insets(0, 12, 0, 12));
        appearance5.addBasicElement(checkOut9);
        checkOut9.onAttributesInitialized();
        checkOut9.onChildrenAdded();
        appearance5.onChildrenAdded();
        final String id = "windowContentContainer";
        final Container checkOut10 = Container.checkOut();
        checkOut10.setElementMap(elementMap);
        if (elementMap != null && id != null) {
            elementMap.add(id, checkOut10);
        }
        checkOut8.addBasicElement(checkOut10);
        checkOut10.onAttributesInitialized();
        final RowLayout checkOut11 = RowLayout.checkOut();
        checkOut11.setHorizontal(false);
        checkOut10.addBasicElement(checkOut11);
        checkOut11.onAttributesInitialized();
        checkOut11.onChildrenAdded();
        final Container checkOut12 = Container.checkOut();
        checkOut12.setElementMap(elementMap);
        checkOut10.addBasicElement(checkOut12);
        checkOut12.onAttributesInitialized();
        final String id2 = "type";
        final RadioGroup radioGroup = new RadioGroup();
        radioGroup.onCheckOut();
        radioGroup.setElementMap(elementMap);
        if (elementMap != null && id2 != null) {
            elementMap.add(id2, radioGroup);
        }
        checkOut12.addBasicElement(radioGroup);
        radioGroup.onAttributesInitialized();
        final PropertyElement checkOut13 = PropertyElement.checkOut();
        checkOut13.setElementMap(elementMap);
        checkOut13.setAttribute("value");
        checkOut13.setName("debug.anm");
        checkOut13.setField("type");
        radioGroup.addBasicElement(checkOut13);
        checkOut13.onAttributesInitialized();
        checkOut13.onChildrenAdded();
        radioGroup.onChildrenAdded();
        final RadioButton element9 = new RadioButton();
        element9.onCheckOut();
        element9.setElementMap(elementMap);
        element9.setEnabled(true);
        element9.setText("player");
        element9.setGroupId("type");
        element9.setValue("players");
        final MouseReleasedListener onMouseRelease = new MouseReleasedListener();
        onMouseRelease.setCallBackFunc("wakfu.debugAnm:setType(players)");
        element9.setOnMouseRelease(onMouseRelease);
        checkOut12.addBasicElement(element9);
        element9.onAttributesInitialized();
        final DecoratorAppearance appearance6 = element9.getAppearance();
        appearance6.setElementMap(elementMap);
        element9.addBasicElement(appearance6);
        appearance6.onAttributesInitialized();
        final Margin checkOut14 = Margin.checkOut();
        checkOut14.setElementMap(elementMap);
        checkOut14.setInsets(new Insets(0, 2, 0, 2));
        appearance6.addBasicElement(checkOut14);
        checkOut14.onAttributesInitialized();
        checkOut14.onChildrenAdded();
        appearance6.onChildrenAdded();
        element9.onChildrenAdded();
        final RadioButton element10 = new RadioButton();
        element10.onCheckOut();
        element10.setElementMap(elementMap);
        element10.setEnabled(true);
        element10.setText("monstre");
        element10.setGroupId("type");
        element10.setValue("npcs");
        final MouseReleasedListener onMouseRelease2 = new MouseReleasedListener();
        onMouseRelease2.setCallBackFunc("wakfu.debugAnm:setType(npcs)");
        element10.setOnMouseRelease(onMouseRelease2);
        checkOut12.addBasicElement(element10);
        element10.onAttributesInitialized();
        final DecoratorAppearance appearance7 = element10.getAppearance();
        appearance7.setElementMap(elementMap);
        element10.addBasicElement(appearance7);
        appearance7.onAttributesInitialized();
        final Margin checkOut15 = Margin.checkOut();
        checkOut15.setElementMap(elementMap);
        checkOut15.setInsets(new Insets(0, 2, 0, 2));
        appearance7.addBasicElement(checkOut15);
        checkOut15.onAttributesInitialized();
        checkOut15.onChildrenAdded();
        appearance7.onChildrenAdded();
        element10.onChildrenAdded();
        final RadioButton element11 = new RadioButton();
        element11.onCheckOut();
        element11.setElementMap(elementMap);
        element11.setEnabled(true);
        element11.setText("pets");
        element11.setGroupId("type");
        element11.setValue("pets");
        final MouseReleasedListener onMouseRelease3 = new MouseReleasedListener();
        onMouseRelease3.setCallBackFunc("wakfu.debugAnm:setType(pets)");
        element11.setOnMouseRelease(onMouseRelease3);
        checkOut12.addBasicElement(element11);
        element11.onAttributesInitialized();
        final DecoratorAppearance appearance8 = element11.getAppearance();
        appearance8.setElementMap(elementMap);
        element11.addBasicElement(appearance8);
        appearance8.onAttributesInitialized();
        final Margin checkOut16 = Margin.checkOut();
        checkOut16.setElementMap(elementMap);
        checkOut16.setInsets(new Insets(0, 2, 0, 2));
        appearance8.addBasicElement(checkOut16);
        checkOut16.onAttributesInitialized();
        checkOut16.onChildrenAdded();
        appearance8.onChildrenAdded();
        element11.onChildrenAdded();
        final RadioButton element12 = new RadioButton();
        element12.onCheckOut();
        element12.setElementMap(elementMap);
        element12.setEnabled(true);
        element12.setText("interactif");
        element12.setGroupId("type");
        element12.setValue("interactives");
        final MouseReleasedListener onMouseRelease4 = new MouseReleasedListener();
        onMouseRelease4.setCallBackFunc("wakfu.debugAnm:setType(interactives)");
        element12.setOnMouseRelease(onMouseRelease4);
        checkOut12.addBasicElement(element12);
        element12.onAttributesInitialized();
        final DecoratorAppearance appearance9 = element12.getAppearance();
        appearance9.setElementMap(elementMap);
        element12.addBasicElement(appearance9);
        appearance9.onAttributesInitialized();
        final Margin checkOut17 = Margin.checkOut();
        checkOut17.setElementMap(elementMap);
        checkOut17.setInsets(new Insets(0, 2, 0, 2));
        appearance9.addBasicElement(checkOut17);
        checkOut17.onAttributesInitialized();
        checkOut17.onChildrenAdded();
        appearance9.onChildrenAdded();
        element12.onChildrenAdded();
        final RadioButton element13 = new RadioButton();
        element13.onCheckOut();
        element13.setElementMap(elementMap);
        element13.setEnabled(true);
        element13.setText("dynamique");
        element13.setGroupId("type");
        element13.setValue("dynamics");
        final MouseReleasedListener onMouseRelease5 = new MouseReleasedListener();
        onMouseRelease5.setCallBackFunc("wakfu.debugAnm:setType(dynamics)");
        element13.setOnMouseRelease(onMouseRelease5);
        checkOut12.addBasicElement(element13);
        element13.onAttributesInitialized();
        final DecoratorAppearance appearance10 = element13.getAppearance();
        appearance10.setElementMap(elementMap);
        element13.addBasicElement(appearance10);
        appearance10.onAttributesInitialized();
        final Margin checkOut18 = Margin.checkOut();
        checkOut18.setElementMap(elementMap);
        checkOut18.setInsets(new Insets(0, 2, 0, 2));
        appearance10.addBasicElement(checkOut18);
        checkOut18.onAttributesInitialized();
        checkOut18.onChildrenAdded();
        appearance10.onChildrenAdded();
        element13.onChildrenAdded();
        final RadioButton element14 = new RadioButton();
        element14.onCheckOut();
        element14.setElementMap(elementMap);
        element14.setEnabled(true);
        element14.setText("ressources");
        element14.setGroupId("type");
        element14.setValue("resources");
        final MouseReleasedListener onMouseRelease6 = new MouseReleasedListener();
        onMouseRelease6.setCallBackFunc("wakfu.debugAnm:setType(resources)");
        element14.setOnMouseRelease(onMouseRelease6);
        checkOut12.addBasicElement(element14);
        element14.onAttributesInitialized();
        final DecoratorAppearance appearance11 = element14.getAppearance();
        appearance11.setElementMap(elementMap);
        element14.addBasicElement(appearance11);
        appearance11.onAttributesInitialized();
        final Margin checkOut19 = Margin.checkOut();
        checkOut19.setElementMap(elementMap);
        checkOut19.setInsets(new Insets(0, 2, 0, 2));
        appearance11.addBasicElement(checkOut19);
        checkOut19.onAttributesInitialized();
        checkOut19.onChildrenAdded();
        appearance11.onChildrenAdded();
        element14.onChildrenAdded();
        checkOut12.onChildrenAdded();
        final Container checkOut20 = Container.checkOut();
        checkOut20.setElementMap(elementMap);
        checkOut10.addBasicElement(checkOut20);
        checkOut20.onAttributesInitialized();
        final String id3 = "gfxId";
        final TextEditor textEditor = new TextEditor();
        textEditor.onCheckOut();
        textEditor.setElementMap(elementMap);
        if (elementMap != null && id3 != null) {
            elementMap.add(id3, textEditor);
        }
        checkOut20.addBasicElement(textEditor);
        textEditor.onAttributesInitialized();
        textEditor.onChildrenAdded();
        final Button element15 = new Button();
        element15.onCheckOut();
        element15.setElementMap(elementMap);
        element15.setText("set skin");
        final MouseClickedListener onClick = new MouseClickedListener();
        onClick.setCallBackFunc("wakfu.debugAnm:setSkin(gfxId)");
        element15.setOnClick(onClick);
        element15.setExpandable(false);
        checkOut20.addBasicElement(element15);
        element15.onAttributesInitialized();
        element15.onChildrenAdded();
        checkOut20.onChildrenAdded();
        final Button element16 = new Button();
        element16.onCheckOut();
        element16.setElementMap(elementMap);
        element16.setText("Mettre \u00e0 jour les linkages");
        final MouseClickedListener onClick2 = new MouseClickedListener();
        onClick2.setCallBackFunc("wakfu.debugAnm:updateLinkageList");
        element16.setOnClick(onClick2);
        element16.setExpandable(false);
        checkOut10.addBasicElement(element16);
        element16.onAttributesInitialized();
        element16.onChildrenAdded();
        final ComboBox element17 = new ComboBox();
        element17.onCheckOut();
        element17.setElementMap(elementMap);
        element17.setExpandable(false);
        element17.setPrefSize(new Dimension(200, 15));
        final ListSelectionChangedListener onListSelectionChange = new ListSelectionChangedListener();
        onListSelectionChange.setCallBackFunc("wakfu.debugAnm:selectionChanged");
        element17.setOnListSelectionChange(onListSelectionChange);
        checkOut10.addBasicElement(element17);
        element17.onAttributesInitialized();
        final PropertyElement checkOut21 = PropertyElement.checkOut();
        checkOut21.setElementMap(elementMap);
        checkOut21.setAttribute("content");
        checkOut21.setName("debug.anm");
        checkOut21.setField("linkages");
        element17.addBasicElement(checkOut21);
        checkOut21.onAttributesInitialized();
        checkOut21.onChildrenAdded();
        final PropertyElement checkOut22 = PropertyElement.checkOut();
        checkOut22.setElementMap(elementMap);
        checkOut22.setAttribute("selectedValue");
        checkOut22.setName("debug.anm");
        checkOut22.setField("selectedLinkage");
        element17.addBasicElement(checkOut22);
        checkOut22.onAttributesInitialized();
        checkOut22.onChildrenAdded();
        final RenderableContainer element18 = new RenderableContainer();
        element18.onCheckOut();
        element18.setElementMap(elementMap);
        element17.addBasicElement(element18);
        element18.onAttributesInitialized();
        final ItemRenderer element19 = new ItemRenderer();
        element19.onCheckOut();
        element19.setElementMap(elementMap);
        element18.addBasicElement(element19);
        element19.onAttributesInitialized();
        final Label element20 = new Label();
        element20.onCheckOut();
        element20.setElementMap(elementMap);
        element20.setNonBlocking(true);
        element19.addBasicElement(element20);
        element20.onAttributesInitialized();
        final RowLayoutData element21 = new RowLayoutData();
        element21.onCheckOut();
        element21.setElementMap(elementMap);
        element21.setAlign(Alignment9.CENTER);
        element20.addBasicElement(element21);
        element21.onAttributesInitialized();
        element21.onChildrenAdded();
        final ItemElement element22 = new ItemElement();
        element22.onCheckOut();
        element22.setElementMap(elementMap);
        element22.setAttribute("text");
        element20.addBasicElement(element22);
        element22.onAttributesInitialized();
        element22.onChildrenAdded();
        element20.onChildrenAdded();
        element19.onChildrenAdded();
        element18.onChildrenAdded();
        final List element23 = new List();
        element23.onCheckOut();
        element23.setElementMap(elementMap);
        element23.setHorizontal(false);
        element23.setCellSize(new Dimension(100.0f, 16));
        element17.addBasicElement(element23);
        element23.onAttributesInitialized();
        final ItemRenderer element24 = new ItemRenderer();
        element24.onCheckOut();
        element24.setElementMap(elementMap);
        element23.addBasicElement(element24);
        element24.onAttributesInitialized();
        final Label element25 = new Label();
        element25.onCheckOut();
        element25.setElementMap(elementMap);
        element25.setNonBlocking(true);
        element24.addBasicElement(element25);
        element25.onAttributesInitialized();
        final ItemElement element26 = new ItemElement();
        element26.onCheckOut();
        element26.setElementMap(elementMap);
        element26.setAttribute("text");
        element25.addBasicElement(element26);
        element26.onAttributesInitialized();
        element26.onChildrenAdded();
        final DecoratorAppearance appearance12 = element25.getAppearance();
        appearance12.setElementMap(elementMap);
        element25.addBasicElement(appearance12);
        appearance12.onAttributesInitialized();
        final Margin checkOut23 = Margin.checkOut();
        checkOut23.setElementMap(elementMap);
        checkOut23.setInsets(new Insets(0, 10, 0, 0));
        appearance12.addBasicElement(checkOut23);
        checkOut23.onAttributesInitialized();
        checkOut23.onChildrenAdded();
        appearance12.onChildrenAdded();
        element25.onChildrenAdded();
        element24.onChildrenAdded();
        element23.onChildrenAdded();
        element17.onChildrenAdded();
        final Button element27 = new Button();
        element27.onCheckOut();
        element27.setElementMap(elementMap);
        element27.setText("Play");
        final MouseClickedListener onClick3 = new MouseClickedListener();
        onClick3.setCallBackFunc("wakfu.debugAnm:play");
        element27.setOnClick(onClick3);
        checkOut10.addBasicElement(element27);
        element27.onAttributesInitialized();
        element27.onChildrenAdded();
        checkOut10.onChildrenAdded();
        checkOut8.onChildrenAdded();
        checkOut2.onChildrenAdded();
        final Container checkOut24 = Container.checkOut();
        checkOut24.setElementMap(elementMap);
        window.addBasicElement(checkOut24);
        checkOut24.onAttributesInitialized();
        final StaticLayoutData element28 = new StaticLayoutData();
        element28.onCheckOut();
        element28.setElementMap(elementMap);
        element28.setSize(new Dimension(100.0f, 100.0f));
        checkOut24.addBasicElement(element28);
        element28.onAttributesInitialized();
        element28.onChildrenAdded();
        checkOut24.onChildrenAdded();
        final Button element29 = new Button();
        element29.onCheckOut();
        element29.setElementMap(elementMap);
        element29.setStyle("close");
        element29.setExpandable(false);
        final MouseClickedListener onClick4 = new MouseClickedListener();
        onClick4.setCallBackFunc("unloadDialog");
        element29.setOnClick(onClick4);
        window.addBasicElement(element29);
        element29.onAttributesInitialized();
        final StaticLayoutData element30 = new StaticLayoutData();
        element30.onCheckOut();
        element30.setElementMap(elementMap);
        element30.setSize(new Dimension(-2, -2));
        element30.setAlign(Alignment17.NORTH_EAST);
        element30.setXOffset(-18);
        element30.setYOffset(-12);
        element29.addBasicElement(element30);
        element30.onAttributesInitialized();
        element30.onChildrenAdded();
        element29.onChildrenAdded();
        this.method0(window);
        window.onChildrenAdded();
        return window;
    }
    
    public BasicElement method0(final BasicElement basicElement) {
        final ElementMap elementMap = this.elementMaps.peek();
        final StaticLayoutData element = new StaticLayoutData();
        element.onCheckOut();
        element.setElementMap(elementMap);
        element.setSize(new Dimension(-2, -2));
        element.setAlign(Alignment17.CENTER);
        element.setInitValue(true);
        basicElement.addBasicElement(element);
        element.onAttributesInitialized();
        element.onChildrenAdded();
        return element;
    }
}