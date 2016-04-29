
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({0002086F-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{0002086F-0000-0000-C000-000000000046}")
public interface DrawingObjects {
    /**
     * <p>id(0x94)</p>
     */
    @ComProperty(name = "Application", dispId = 0x94)
    Application getApplication();
            
    /**
     * <p>id(0x95)</p>
     */
    @ComProperty(name = "Creator", dispId = 0x95)
    XlCreator getCreator();
            
    /**
     * <p>id(0x96)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x96)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * <p>id(0x10003)</p>
     */
    @ComMethod(name = "_Dummy3", dispId = 0x10003)
    void _Dummy3();
            
    /**
     * <p>id(0x25a)</p>
     */
    @ComMethod(name = "BringToFront", dispId = 0x25a)
    Object BringToFront();
            
    /**
     * <p>id(0x227)</p>
     */
    @ComMethod(name = "Copy", dispId = 0x227)
    Object Copy();
            
    /**
     * <p>id(0xd5)</p>
     */
    @ComMethod(name = "CopyPicture", dispId = 0xd5)
    Object CopyPicture(XlPictureAppearance Appearance,
            XlCopyPictureFormat Format);
            
    /**
     * <p>id(0x235)</p>
     */
    @ComMethod(name = "Cut", dispId = 0x235)
    Object Cut();
            
    /**
     * <p>id(0x75)</p>
     */
    @ComMethod(name = "Delete", dispId = 0x75)
    Object Delete();
            
    /**
     * <p>id(0x40f)</p>
     */
    @ComMethod(name = "Duplicate", dispId = 0x40f)
    com.sun.jna.platform.win32.COM.util.IDispatch Duplicate();
            
    /**
     * <p>id(0x258)</p>
     */
    @ComProperty(name = "Enabled", dispId = 0x258)
    Boolean getEnabled();
            
    /**
     * <p>id(0x258)</p>
     */
    @ComProperty(name = "Enabled", dispId = 0x258)
    void setEnabled(Boolean param0);
            
    /**
     * <p>id(0x7b)</p>
     */
    @ComProperty(name = "Height", dispId = 0x7b)
    Double getHeight();
            
    /**
     * <p>id(0x7b)</p>
     */
    @ComProperty(name = "Height", dispId = 0x7b)
    void setHeight(Double param0);
            
    /**
     * <p>id(0x1000c)</p>
     */
    @ComMethod(name = "_Dummy12", dispId = 0x1000c)
    void _Dummy12();
            
    /**
     * <p>id(0x7f)</p>
     */
    @ComProperty(name = "Left", dispId = 0x7f)
    Double getLeft();
            
    /**
     * <p>id(0x7f)</p>
     */
    @ComProperty(name = "Left", dispId = 0x7f)
    void setLeft(Double param0);
            
    /**
     * <p>id(0x10d)</p>
     */
    @ComProperty(name = "Locked", dispId = 0x10d)
    Boolean getLocked();
            
    /**
     * <p>id(0x10d)</p>
     */
    @ComProperty(name = "Locked", dispId = 0x10d)
    void setLocked(Boolean param0);
            
    /**
     * <p>id(0x1000f)</p>
     */
    @ComMethod(name = "_Dummy15", dispId = 0x1000f)
    void _Dummy15();
            
    /**
     * <p>id(0x254)</p>
     */
    @ComProperty(name = "OnAction", dispId = 0x254)
    String getOnAction();
            
    /**
     * <p>id(0x254)</p>
     */
    @ComProperty(name = "OnAction", dispId = 0x254)
    void setOnAction(String param0);
            
    /**
     * <p>id(0x269)</p>
     */
    @ComProperty(name = "Placement", dispId = 0x269)
    Object getPlacement();
            
    /**
     * <p>id(0x269)</p>
     */
    @ComProperty(name = "Placement", dispId = 0x269)
    void setPlacement(Object param0);
            
    /**
     * <p>id(0x26a)</p>
     */
    @ComProperty(name = "PrintObject", dispId = 0x26a)
    Boolean getPrintObject();
            
    /**
     * <p>id(0x26a)</p>
     */
    @ComProperty(name = "PrintObject", dispId = 0x26a)
    void setPrintObject(Boolean param0);
            
    /**
     * <p>id(0xeb)</p>
     */
    @ComMethod(name = "Select", dispId = 0xeb)
    Object Select(Object Replace);
            
    /**
     * <p>id(0x25d)</p>
     */
    @ComMethod(name = "SendToBack", dispId = 0x25d)
    Object SendToBack();
            
    /**
     * <p>id(0x7e)</p>
     */
    @ComProperty(name = "Top", dispId = 0x7e)
    Double getTop();
            
    /**
     * <p>id(0x7e)</p>
     */
    @ComProperty(name = "Top", dispId = 0x7e)
    void setTop(Double param0);
            
    /**
     * <p>id(0x10016)</p>
     */
    @ComMethod(name = "_Dummy22", dispId = 0x10016)
    void _Dummy22();
            
    /**
     * <p>id(0x22e)</p>
     */
    @ComProperty(name = "Visible", dispId = 0x22e)
    Boolean getVisible();
            
    /**
     * <p>id(0x22e)</p>
     */
    @ComProperty(name = "Visible", dispId = 0x22e)
    void setVisible(Boolean param0);
            
    /**
     * <p>id(0x7a)</p>
     */
    @ComProperty(name = "Width", dispId = 0x7a)
    Double getWidth();
            
    /**
     * <p>id(0x7a)</p>
     */
    @ComProperty(name = "Width", dispId = 0x7a)
    void setWidth(Double param0);
            
    /**
     * <p>id(0x26e)</p>
     */
    @ComProperty(name = "ZOrder", dispId = 0x26e)
    Integer getZOrder();
            
    /**
     * <p>id(0x5f8)</p>
     */
    @ComProperty(name = "ShapeRange", dispId = 0x5f8)
    ShapeRange getShapeRange();
            
    /**
     * <p>id(0x34e)</p>
     */
    @ComProperty(name = "Accelerator", dispId = 0x34e)
    Object getAccelerator();
            
    /**
     * <p>id(0x34e)</p>
     */
    @ComProperty(name = "Accelerator", dispId = 0x34e)
    void setAccelerator(Object param0);
            
    /**
     * <p>id(0x1001c)</p>
     */
    @ComMethod(name = "_Dummy28", dispId = 0x1001c)
    void _Dummy28();
            
    /**
     * <p>id(0x427)</p>
     */
    @ComProperty(name = "AddIndent", dispId = 0x427)
    Boolean getAddIndent();
            
    /**
     * <p>id(0x427)</p>
     */
    @ComProperty(name = "AddIndent", dispId = 0x427)
    void setAddIndent(Boolean param0);
            
    /**
     * <p>id(0x353)</p>
     */
    @ComMethod(name = "AddItem", dispId = 0x353)
    Object AddItem(Object Text,
            Object Index);
            
    /**
     * <p>id(0x263)</p>
     */
    @ComProperty(name = "ArrowHeadLength", dispId = 0x263)
    Object getArrowHeadLength();
            
    /**
     * <p>id(0x263)</p>
     */
    @ComProperty(name = "ArrowHeadLength", dispId = 0x263)
    void setArrowHeadLength(Object param0);
            
    /**
     * <p>id(0x264)</p>
     */
    @ComProperty(name = "ArrowHeadStyle", dispId = 0x264)
    Object getArrowHeadStyle();
            
    /**
     * <p>id(0x264)</p>
     */
    @ComProperty(name = "ArrowHeadStyle", dispId = 0x264)
    void setArrowHeadStyle(Object param0);
            
    /**
     * <p>id(0x265)</p>
     */
    @ComProperty(name = "ArrowHeadWidth", dispId = 0x265)
    Object getArrowHeadWidth();
            
    /**
     * <p>id(0x265)</p>
     */
    @ComProperty(name = "ArrowHeadWidth", dispId = 0x265)
    void setArrowHeadWidth(Object param0);
            
    /**
     * <p>id(0x266)</p>
     */
    @ComProperty(name = "AutoSize", dispId = 0x266)
    Boolean getAutoSize();
            
    /**
     * <p>id(0x266)</p>
     */
    @ComProperty(name = "AutoSize", dispId = 0x266)
    void setAutoSize(Boolean param0);
            
    /**
     * <p>id(0x80)</p>
     */
    @ComProperty(name = "Border", dispId = 0x80)
    Border getBorder();
            
    /**
     * <p>id(0x35a)</p>
     */
    @ComProperty(name = "CancelButton", dispId = 0x35a)
    Boolean getCancelButton();
            
    /**
     * <p>id(0x35a)</p>
     */
    @ComProperty(name = "CancelButton", dispId = 0x35a)
    void setCancelButton(Boolean param0);
            
    /**
     * <p>id(0x8b)</p>
     */
    @ComProperty(name = "Caption", dispId = 0x8b)
    String getCaption();
            
    /**
     * <p>id(0x8b)</p>
     */
    @ComProperty(name = "Caption", dispId = 0x8b)
    void setCaption(String param0);
            
    /**
     * <p>id(0x25b)</p>
     */
    @ComProperty(name = "Characters", dispId = 0x25b)
    Characters getCharacters(Object Start,
            Object Length);
            
    /**
     * <p>id(0x1f9)</p>
     */
    @ComMethod(name = "CheckSpelling", dispId = 0x1f9)
    Object CheckSpelling(Object CustomDictionary,
            Object IgnoreUppercase,
            Object AlwaysSuggest,
            Object SpellLang);
            
    /**
     * <p>id(0x0)</p>
     */
    @ComProperty(name = "_Default", dispId = 0x0)
    Integer get_Default();
            
    /**
     * <p>id(0x0)</p>
     */
    @ComProperty(name = "_Default", dispId = 0x0)
    void set_Default(Integer param0);
            
    /**
     * <p>id(0x359)</p>
     */
    @ComProperty(name = "DefaultButton", dispId = 0x359)
    Boolean getDefaultButton();
            
    /**
     * <p>id(0x359)</p>
     */
    @ComProperty(name = "DefaultButton", dispId = 0x359)
    void setDefaultButton(Boolean param0);
            
    /**
     * <p>id(0x35b)</p>
     */
    @ComProperty(name = "DismissButton", dispId = 0x35b)
    Boolean getDismissButton();
            
    /**
     * <p>id(0x35b)</p>
     */
    @ComProperty(name = "DismissButton", dispId = 0x35b)
    void setDismissButton(Boolean param0);
            
    /**
     * <p>id(0x462)</p>
     */
    @ComProperty(name = "Display3DShading", dispId = 0x462)
    Boolean getDisplay3DShading();
            
    /**
     * <p>id(0x462)</p>
     */
    @ComProperty(name = "Display3DShading", dispId = 0x462)
    void setDisplay3DShading(Boolean param0);
            
    /**
     * <p>id(0x39a)</p>
     */
    @ComProperty(name = "DisplayVerticalScrollBar", dispId = 0x39a)
    Boolean getDisplayVerticalScrollBar();
            
    /**
     * <p>id(0x39a)</p>
     */
    @ComProperty(name = "DisplayVerticalScrollBar", dispId = 0x39a)
    void setDisplayVerticalScrollBar(Boolean param0);
            
    /**
     * <p>id(0x350)</p>
     */
    @ComProperty(name = "DropDownLines", dispId = 0x350)
    Integer getDropDownLines();
            
    /**
     * <p>id(0x350)</p>
     */
    @ComProperty(name = "DropDownLines", dispId = 0x350)
    void setDropDownLines(Integer param0);
            
    /**
     * <p>id(0x92)</p>
     */
    @ComProperty(name = "Font", dispId = 0x92)
    Font getFont();
            
    /**
     * <p>id(0x1002f)</p>
     */
    @ComMethod(name = "_Dummy47", dispId = 0x1002f)
    void _Dummy47();
            
    /**
     * <p>id(0x35c)</p>
     */
    @ComProperty(name = "HelpButton", dispId = 0x35c)
    Boolean getHelpButton();
            
    /**
     * <p>id(0x35c)</p>
     */
    @ComProperty(name = "HelpButton", dispId = 0x35c)
    void setHelpButton(Boolean param0);
            
    /**
     * <p>id(0x88)</p>
     */
    @ComProperty(name = "HorizontalAlignment", dispId = 0x88)
    Object getHorizontalAlignment();
            
    /**
     * <p>id(0x88)</p>
     */
    @ComProperty(name = "HorizontalAlignment", dispId = 0x88)
    void setHorizontalAlignment(Object param0);
            
    /**
     * <p>id(0x356)</p>
     */
    @ComProperty(name = "InputType", dispId = 0x356)
    Integer getInputType();
            
    /**
     * <p>id(0x356)</p>
     */
    @ComProperty(name = "InputType", dispId = 0x356)
    void setInputType(Integer param0);
            
    /**
     * <p>id(0x81)</p>
     */
    @ComProperty(name = "Interior", dispId = 0x81)
    Interior getInterior();
            
    /**
     * <p>id(0x34d)</p>
     */
    @ComProperty(name = "LargeChange", dispId = 0x34d)
    Integer getLargeChange();
            
    /**
     * <p>id(0x34d)</p>
     */
    @ComProperty(name = "LargeChange", dispId = 0x34d)
    void setLargeChange(Integer param0);
            
    /**
     * <p>id(0x422)</p>
     */
    @ComProperty(name = "LinkedCell", dispId = 0x422)
    String getLinkedCell();
            
    /**
     * <p>id(0x422)</p>
     */
    @ComProperty(name = "LinkedCell", dispId = 0x422)
    void setLinkedCell(String param0);
            
    /**
     * <p>id(0x10036)</p>
     */
    @ComMethod(name = "_Dummy54", dispId = 0x10036)
    void _Dummy54();
            
    /**
     * <p>id(0x35d)</p>
     */
    @ComMethod(name = "List", dispId = 0x35d)
    Object List(Object Index);
            
    /**
     * <p>id(0x10038)</p>
     */
    @ComMethod(name = "_Dummy56", dispId = 0x10038)
    void _Dummy56();
            
    /**
     * <p>id(0x34f)</p>
     */
    @ComProperty(name = "ListFillRange", dispId = 0x34f)
    String getListFillRange();
            
    /**
     * <p>id(0x34f)</p>
     */
    @ComProperty(name = "ListFillRange", dispId = 0x34f)
    void setListFillRange(String param0);
            
    /**
     * <p>id(0x352)</p>
     */
    @ComProperty(name = "ListIndex", dispId = 0x352)
    Integer getListIndex();
            
    /**
     * <p>id(0x352)</p>
     */
    @ComProperty(name = "ListIndex", dispId = 0x352)
    void setListIndex(Integer param0);
            
    /**
     * <p>id(0x268)</p>
     */
    @ComProperty(name = "LockedText", dispId = 0x268)
    Boolean getLockedText();
            
    /**
     * <p>id(0x268)</p>
     */
    @ComProperty(name = "LockedText", dispId = 0x268)
    void setLockedText(Boolean param0);
            
    /**
     * <p>id(0x34a)</p>
     */
    @ComProperty(name = "Max", dispId = 0x34a)
    Integer getMax();
            
    /**
     * <p>id(0x34a)</p>
     */
    @ComProperty(name = "Max", dispId = 0x34a)
    void setMax(Integer param0);
            
    /**
     * <p>id(0x34b)</p>
     */
    @ComProperty(name = "Min", dispId = 0x34b)
    Integer getMin();
            
    /**
     * <p>id(0x34b)</p>
     */
    @ComProperty(name = "Min", dispId = 0x34b)
    void setMin(Integer param0);
            
    /**
     * <p>id(0x357)</p>
     */
    @ComProperty(name = "MultiLine", dispId = 0x357)
    Boolean getMultiLine();
            
    /**
     * <p>id(0x357)</p>
     */
    @ComProperty(name = "MultiLine", dispId = 0x357)
    void setMultiLine(Boolean param0);
            
    /**
     * <p>id(0x20)</p>
     */
    @ComProperty(name = "MultiSelect", dispId = 0x20)
    Boolean getMultiSelect();
            
    /**
     * <p>id(0x20)</p>
     */
    @ComProperty(name = "MultiSelect", dispId = 0x20)
    void setMultiSelect(Boolean param0);
            
    /**
     * <p>id(0x86)</p>
     */
    @ComProperty(name = "Orientation", dispId = 0x86)
    Object getOrientation();
            
    /**
     * <p>id(0x86)</p>
     */
    @ComProperty(name = "Orientation", dispId = 0x86)
    void setOrientation(Object param0);
            
    /**
     * <p>id(0x461)</p>
     */
    @ComProperty(name = "PhoneticAccelerator", dispId = 0x461)
    Object getPhoneticAccelerator();
            
    /**
     * <p>id(0x461)</p>
     */
    @ComProperty(name = "PhoneticAccelerator", dispId = 0x461)
    void setPhoneticAccelerator(Object param0);
            
    /**
     * <p>id(0x355)</p>
     */
    @ComMethod(name = "RemoveAllItems", dispId = 0x355)
    Object RemoveAllItems();
            
    /**
     * <p>id(0x354)</p>
     */
    @ComMethod(name = "RemoveItem", dispId = 0x354)
    Object RemoveItem(Integer Index,
            Object Count);
            
    /**
     * <p>id(0x25c)</p>
     */
    @ComMethod(name = "Reshape", dispId = 0x25c)
    Object Reshape(Integer Vertex,
            Object Insert,
            Object Left,
            Object Top);
            
    /**
     * <p>id(0x26b)</p>
     */
    @ComProperty(name = "RoundedCorners", dispId = 0x26b)
    Boolean getRoundedCorners();
            
    /**
     * <p>id(0x26b)</p>
     */
    @ComProperty(name = "RoundedCorners", dispId = 0x26b)
    void setRoundedCorners(Boolean param0);
            
    /**
     * <p>id(0x463)</p>
     */
    @ComMethod(name = "Selected", dispId = 0x463)
    Object Selected(Object Index);
            
    /**
     * <p>id(0x67)</p>
     */
    @ComProperty(name = "Shadow", dispId = 0x67)
    Boolean getShadow();
            
    /**
     * <p>id(0x67)</p>
     */
    @ComProperty(name = "Shadow", dispId = 0x67)
    void setShadow(Boolean param0);
            
    /**
     * <p>id(0x34c)</p>
     */
    @ComProperty(name = "SmallChange", dispId = 0x34c)
    Integer getSmallChange();
            
    /**
     * <p>id(0x34c)</p>
     */
    @ComProperty(name = "SmallChange", dispId = 0x34c)
    void setSmallChange(Integer param0);
            
    /**
     * <p>id(0x8a)</p>
     */
    @ComProperty(name = "Text", dispId = 0x8a)
    String getText();
            
    /**
     * <p>id(0x8a)</p>
     */
    @ComProperty(name = "Text", dispId = 0x8a)
    void setText(String param0);
            
    /**
     * <p>id(0xf4)</p>
     */
    @ComMethod(name = "Ungroup", dispId = 0xf4)
    com.sun.jna.platform.win32.COM.util.IDispatch Ungroup();
            
    /**
     * <p>id(0x6)</p>
     */
    @ComProperty(name = "Value", dispId = 0x6)
    Integer getValue();
            
    /**
     * <p>id(0x6)</p>
     */
    @ComProperty(name = "Value", dispId = 0x6)
    void setValue(Integer param0);
            
    /**
     * <p>id(0x89)</p>
     */
    @ComProperty(name = "VerticalAlignment", dispId = 0x89)
    Object getVerticalAlignment();
            
    /**
     * <p>id(0x89)</p>
     */
    @ComProperty(name = "VerticalAlignment", dispId = 0x89)
    void setVerticalAlignment(Object param0);
            
    /**
     * <p>id(0x26d)</p>
     */
    @ComMethod(name = "Vertices", dispId = 0x26d)
    Object Vertices(Object Index1,
            Object Index2);
            
    /**
     * <p>id(0x3cf)</p>
     */
    @ComProperty(name = "ReadingOrder", dispId = 0x3cf)
    Integer getReadingOrder();
            
    /**
     * <p>id(0x3cf)</p>
     */
    @ComProperty(name = "ReadingOrder", dispId = 0x3cf)
    void setReadingOrder(Integer param0);
            
    /**
     * <p>id(0x76)</p>
     */
    @ComProperty(name = "Count", dispId = 0x76)
    Integer getCount();
            
    /**
     * <p>id(0xaa)</p>
     */
    @ComMethod(name = "Item", dispId = 0xaa)
    com.sun.jna.platform.win32.COM.util.IDispatch Item(Object Index);
            
    /**
     * <p>id(0x2e)</p>
     */
    @ComMethod(name = "Group", dispId = 0x2e)
    GroupObject Group();
            
    /**
     * <p>id(0x358)</p>
     */
    @ComMethod(name = "LinkCombo", dispId = 0x358)
    Object LinkCombo(Object Link);
            
    
}