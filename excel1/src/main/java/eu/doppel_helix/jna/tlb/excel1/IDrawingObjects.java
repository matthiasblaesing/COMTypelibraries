
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({0002086F-0001-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{0002086F-0001-0000-C000-000000000046}")
public interface IDrawingObjects extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x94)</p>
     */
    @ComProperty(name = "Application", dispId = 0x94)
    com.sun.jna.platform.win32.WinNT.HRESULT getApplication(VARIANT RHS);
            
    /**
     * <p>id(0x95)</p>
     */
    @ComProperty(name = "Creator", dispId = 0x95)
    com.sun.jna.platform.win32.WinNT.HRESULT getCreator(VARIANT RHS);
            
    /**
     * <p>id(0x96)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x96)
    com.sun.jna.platform.win32.WinNT.HRESULT getParent(VARIANT RHS);
            
    /**
     * <p>id(0x10003)</p>
     */
    @ComMethod(name = "_Dummy3", dispId = 0x10003)
    void _Dummy3();
            
    /**
     * <p>id(0x25a)</p>
     */
    @ComMethod(name = "BringToFront", dispId = 0x25a)
    com.sun.jna.platform.win32.WinNT.HRESULT BringToFront(VARIANT RHS);
            
    /**
     * <p>id(0x227)</p>
     */
    @ComMethod(name = "Copy", dispId = 0x227)
    com.sun.jna.platform.win32.WinNT.HRESULT Copy(VARIANT RHS);
            
    /**
     * <p>id(0xd5)</p>
     */
    @ComMethod(name = "CopyPicture", dispId = 0xd5)
    com.sun.jna.platform.win32.WinNT.HRESULT CopyPicture(XlPictureAppearance Appearance,
            XlCopyPictureFormat Format,
            VARIANT RHS);
            
    /**
     * <p>id(0x235)</p>
     */
    @ComMethod(name = "Cut", dispId = 0x235)
    com.sun.jna.platform.win32.WinNT.HRESULT Cut(VARIANT RHS);
            
    /**
     * <p>id(0x75)</p>
     */
    @ComMethod(name = "Delete", dispId = 0x75)
    com.sun.jna.platform.win32.WinNT.HRESULT Delete(VARIANT RHS);
            
    /**
     * <p>id(0x40f)</p>
     */
    @ComMethod(name = "Duplicate", dispId = 0x40f)
    com.sun.jna.platform.win32.WinNT.HRESULT Duplicate(VARIANT RHS);
            
    /**
     * <p>id(0x258)</p>
     */
    @ComProperty(name = "Enabled", dispId = 0x258)
    com.sun.jna.platform.win32.WinNT.HRESULT getEnabled(VARIANT RHS);
            
    /**
     * <p>id(0x258)</p>
     */
    @ComProperty(name = "Enabled", dispId = 0x258)
    com.sun.jna.platform.win32.WinNT.HRESULT setEnabled(Boolean RHS);
            
    /**
     * <p>id(0x7b)</p>
     */
    @ComProperty(name = "Height", dispId = 0x7b)
    com.sun.jna.platform.win32.WinNT.HRESULT getHeight(VARIANT RHS);
            
    /**
     * <p>id(0x7b)</p>
     */
    @ComProperty(name = "Height", dispId = 0x7b)
    com.sun.jna.platform.win32.WinNT.HRESULT setHeight(Double RHS);
            
    /**
     * <p>id(0x1000c)</p>
     */
    @ComMethod(name = "_Dummy12", dispId = 0x1000c)
    void _Dummy12();
            
    /**
     * <p>id(0x7f)</p>
     */
    @ComProperty(name = "Left", dispId = 0x7f)
    com.sun.jna.platform.win32.WinNT.HRESULT getLeft(VARIANT RHS);
            
    /**
     * <p>id(0x7f)</p>
     */
    @ComProperty(name = "Left", dispId = 0x7f)
    com.sun.jna.platform.win32.WinNT.HRESULT setLeft(Double RHS);
            
    /**
     * <p>id(0x10d)</p>
     */
    @ComProperty(name = "Locked", dispId = 0x10d)
    com.sun.jna.platform.win32.WinNT.HRESULT getLocked(VARIANT RHS);
            
    /**
     * <p>id(0x10d)</p>
     */
    @ComProperty(name = "Locked", dispId = 0x10d)
    com.sun.jna.platform.win32.WinNT.HRESULT setLocked(Boolean RHS);
            
    /**
     * <p>id(0x1000f)</p>
     */
    @ComMethod(name = "_Dummy15", dispId = 0x1000f)
    void _Dummy15();
            
    /**
     * <p>id(0x254)</p>
     */
    @ComProperty(name = "OnAction", dispId = 0x254)
    com.sun.jna.platform.win32.WinNT.HRESULT getOnAction(VARIANT RHS);
            
    /**
     * <p>id(0x254)</p>
     */
    @ComProperty(name = "OnAction", dispId = 0x254)
    com.sun.jna.platform.win32.WinNT.HRESULT setOnAction(String RHS);
            
    /**
     * <p>id(0x269)</p>
     */
    @ComProperty(name = "Placement", dispId = 0x269)
    com.sun.jna.platform.win32.WinNT.HRESULT getPlacement(VARIANT RHS);
            
    /**
     * <p>id(0x269)</p>
     */
    @ComProperty(name = "Placement", dispId = 0x269)
    com.sun.jna.platform.win32.WinNT.HRESULT setPlacement(Object RHS);
            
    /**
     * <p>id(0x26a)</p>
     */
    @ComProperty(name = "PrintObject", dispId = 0x26a)
    com.sun.jna.platform.win32.WinNT.HRESULT getPrintObject(VARIANT RHS);
            
    /**
     * <p>id(0x26a)</p>
     */
    @ComProperty(name = "PrintObject", dispId = 0x26a)
    com.sun.jna.platform.win32.WinNT.HRESULT setPrintObject(Boolean RHS);
            
    /**
     * <p>id(0xeb)</p>
     */
    @ComMethod(name = "Select", dispId = 0xeb)
    com.sun.jna.platform.win32.WinNT.HRESULT Select(Object Replace,
            VARIANT RHS);
            
    /**
     * <p>id(0x25d)</p>
     */
    @ComMethod(name = "SendToBack", dispId = 0x25d)
    com.sun.jna.platform.win32.WinNT.HRESULT SendToBack(VARIANT RHS);
            
    /**
     * <p>id(0x7e)</p>
     */
    @ComProperty(name = "Top", dispId = 0x7e)
    com.sun.jna.platform.win32.WinNT.HRESULT getTop(VARIANT RHS);
            
    /**
     * <p>id(0x7e)</p>
     */
    @ComProperty(name = "Top", dispId = 0x7e)
    com.sun.jna.platform.win32.WinNT.HRESULT setTop(Double RHS);
            
    /**
     * <p>id(0x10016)</p>
     */
    @ComMethod(name = "_Dummy22", dispId = 0x10016)
    void _Dummy22();
            
    /**
     * <p>id(0x22e)</p>
     */
    @ComProperty(name = "Visible", dispId = 0x22e)
    com.sun.jna.platform.win32.WinNT.HRESULT getVisible(VARIANT RHS);
            
    /**
     * <p>id(0x22e)</p>
     */
    @ComProperty(name = "Visible", dispId = 0x22e)
    com.sun.jna.platform.win32.WinNT.HRESULT setVisible(Boolean RHS);
            
    /**
     * <p>id(0x7a)</p>
     */
    @ComProperty(name = "Width", dispId = 0x7a)
    com.sun.jna.platform.win32.WinNT.HRESULT getWidth(VARIANT RHS);
            
    /**
     * <p>id(0x7a)</p>
     */
    @ComProperty(name = "Width", dispId = 0x7a)
    com.sun.jna.platform.win32.WinNT.HRESULT setWidth(Double RHS);
            
    /**
     * <p>id(0x26e)</p>
     */
    @ComProperty(name = "ZOrder", dispId = 0x26e)
    com.sun.jna.platform.win32.WinNT.HRESULT getZOrder(VARIANT RHS);
            
    /**
     * <p>id(0x5f8)</p>
     */
    @ComProperty(name = "ShapeRange", dispId = 0x5f8)
    com.sun.jna.platform.win32.WinNT.HRESULT getShapeRange(VARIANT RHS);
            
    /**
     * <p>id(0x34e)</p>
     */
    @ComProperty(name = "Accelerator", dispId = 0x34e)
    com.sun.jna.platform.win32.WinNT.HRESULT getAccelerator(VARIANT RHS);
            
    /**
     * <p>id(0x34e)</p>
     */
    @ComProperty(name = "Accelerator", dispId = 0x34e)
    com.sun.jna.platform.win32.WinNT.HRESULT setAccelerator(Object RHS);
            
    /**
     * <p>id(0x1001c)</p>
     */
    @ComMethod(name = "_Dummy28", dispId = 0x1001c)
    void _Dummy28();
            
    /**
     * <p>id(0x427)</p>
     */
    @ComProperty(name = "AddIndent", dispId = 0x427)
    com.sun.jna.platform.win32.WinNT.HRESULT getAddIndent(VARIANT RHS);
            
    /**
     * <p>id(0x427)</p>
     */
    @ComProperty(name = "AddIndent", dispId = 0x427)
    com.sun.jna.platform.win32.WinNT.HRESULT setAddIndent(Boolean RHS);
            
    /**
     * <p>id(0x353)</p>
     */
    @ComMethod(name = "AddItem", dispId = 0x353)
    com.sun.jna.platform.win32.WinNT.HRESULT AddItem(Object Text,
            Object Index,
            VARIANT RHS);
            
    /**
     * <p>id(0x263)</p>
     */
    @ComProperty(name = "ArrowHeadLength", dispId = 0x263)
    com.sun.jna.platform.win32.WinNT.HRESULT getArrowHeadLength(VARIANT RHS);
            
    /**
     * <p>id(0x263)</p>
     */
    @ComProperty(name = "ArrowHeadLength", dispId = 0x263)
    com.sun.jna.platform.win32.WinNT.HRESULT setArrowHeadLength(Object RHS);
            
    /**
     * <p>id(0x264)</p>
     */
    @ComProperty(name = "ArrowHeadStyle", dispId = 0x264)
    com.sun.jna.platform.win32.WinNT.HRESULT getArrowHeadStyle(VARIANT RHS);
            
    /**
     * <p>id(0x264)</p>
     */
    @ComProperty(name = "ArrowHeadStyle", dispId = 0x264)
    com.sun.jna.platform.win32.WinNT.HRESULT setArrowHeadStyle(Object RHS);
            
    /**
     * <p>id(0x265)</p>
     */
    @ComProperty(name = "ArrowHeadWidth", dispId = 0x265)
    com.sun.jna.platform.win32.WinNT.HRESULT getArrowHeadWidth(VARIANT RHS);
            
    /**
     * <p>id(0x265)</p>
     */
    @ComProperty(name = "ArrowHeadWidth", dispId = 0x265)
    com.sun.jna.platform.win32.WinNT.HRESULT setArrowHeadWidth(Object RHS);
            
    /**
     * <p>id(0x266)</p>
     */
    @ComProperty(name = "AutoSize", dispId = 0x266)
    com.sun.jna.platform.win32.WinNT.HRESULT getAutoSize(VARIANT RHS);
            
    /**
     * <p>id(0x266)</p>
     */
    @ComProperty(name = "AutoSize", dispId = 0x266)
    com.sun.jna.platform.win32.WinNT.HRESULT setAutoSize(Boolean RHS);
            
    /**
     * <p>id(0x80)</p>
     */
    @ComProperty(name = "Border", dispId = 0x80)
    com.sun.jna.platform.win32.WinNT.HRESULT getBorder(VARIANT RHS);
            
    /**
     * <p>id(0x35a)</p>
     */
    @ComProperty(name = "CancelButton", dispId = 0x35a)
    com.sun.jna.platform.win32.WinNT.HRESULT getCancelButton(VARIANT RHS);
            
    /**
     * <p>id(0x35a)</p>
     */
    @ComProperty(name = "CancelButton", dispId = 0x35a)
    com.sun.jna.platform.win32.WinNT.HRESULT setCancelButton(Boolean RHS);
            
    /**
     * <p>id(0x8b)</p>
     */
    @ComProperty(name = "Caption", dispId = 0x8b)
    com.sun.jna.platform.win32.WinNT.HRESULT getCaption(VARIANT RHS);
            
    /**
     * <p>id(0x8b)</p>
     */
    @ComProperty(name = "Caption", dispId = 0x8b)
    com.sun.jna.platform.win32.WinNT.HRESULT setCaption(String RHS);
            
    /**
     * <p>id(0x25b)</p>
     */
    @ComProperty(name = "Characters", dispId = 0x25b)
    com.sun.jna.platform.win32.WinNT.HRESULT getCharacters(Object Start,
            Object Length,
            VARIANT RHS);
            
    /**
     * <p>id(0x1f9)</p>
     */
    @ComMethod(name = "CheckSpelling", dispId = 0x1f9)
    com.sun.jna.platform.win32.WinNT.HRESULT CheckSpelling(Object CustomDictionary,
            Object IgnoreUppercase,
            Object AlwaysSuggest,
            Object SpellLang,
            VARIANT RHS);
            
    /**
     * <p>id(0x0)</p>
     */
    @ComProperty(name = "_Default", dispId = 0x0)
    com.sun.jna.platform.win32.WinNT.HRESULT get_Default(VARIANT RHS);
            
    /**
     * <p>id(0x0)</p>
     */
    @ComProperty(name = "_Default", dispId = 0x0)
    com.sun.jna.platform.win32.WinNT.HRESULT set_Default(Integer RHS);
            
    /**
     * <p>id(0x359)</p>
     */
    @ComProperty(name = "DefaultButton", dispId = 0x359)
    com.sun.jna.platform.win32.WinNT.HRESULT getDefaultButton(VARIANT RHS);
            
    /**
     * <p>id(0x359)</p>
     */
    @ComProperty(name = "DefaultButton", dispId = 0x359)
    com.sun.jna.platform.win32.WinNT.HRESULT setDefaultButton(Boolean RHS);
            
    /**
     * <p>id(0x35b)</p>
     */
    @ComProperty(name = "DismissButton", dispId = 0x35b)
    com.sun.jna.platform.win32.WinNT.HRESULT getDismissButton(VARIANT RHS);
            
    /**
     * <p>id(0x35b)</p>
     */
    @ComProperty(name = "DismissButton", dispId = 0x35b)
    com.sun.jna.platform.win32.WinNT.HRESULT setDismissButton(Boolean RHS);
            
    /**
     * <p>id(0x462)</p>
     */
    @ComProperty(name = "Display3DShading", dispId = 0x462)
    com.sun.jna.platform.win32.WinNT.HRESULT getDisplay3DShading(VARIANT RHS);
            
    /**
     * <p>id(0x462)</p>
     */
    @ComProperty(name = "Display3DShading", dispId = 0x462)
    com.sun.jna.platform.win32.WinNT.HRESULT setDisplay3DShading(Boolean RHS);
            
    /**
     * <p>id(0x39a)</p>
     */
    @ComProperty(name = "DisplayVerticalScrollBar", dispId = 0x39a)
    com.sun.jna.platform.win32.WinNT.HRESULT getDisplayVerticalScrollBar(VARIANT RHS);
            
    /**
     * <p>id(0x39a)</p>
     */
    @ComProperty(name = "DisplayVerticalScrollBar", dispId = 0x39a)
    com.sun.jna.platform.win32.WinNT.HRESULT setDisplayVerticalScrollBar(Boolean RHS);
            
    /**
     * <p>id(0x350)</p>
     */
    @ComProperty(name = "DropDownLines", dispId = 0x350)
    com.sun.jna.platform.win32.WinNT.HRESULT getDropDownLines(VARIANT RHS);
            
    /**
     * <p>id(0x350)</p>
     */
    @ComProperty(name = "DropDownLines", dispId = 0x350)
    com.sun.jna.platform.win32.WinNT.HRESULT setDropDownLines(Integer RHS);
            
    /**
     * <p>id(0x92)</p>
     */
    @ComProperty(name = "Font", dispId = 0x92)
    com.sun.jna.platform.win32.WinNT.HRESULT getFont(VARIANT RHS);
            
    /**
     * <p>id(0x1002f)</p>
     */
    @ComMethod(name = "_Dummy47", dispId = 0x1002f)
    void _Dummy47();
            
    /**
     * <p>id(0x35c)</p>
     */
    @ComProperty(name = "HelpButton", dispId = 0x35c)
    com.sun.jna.platform.win32.WinNT.HRESULT getHelpButton(VARIANT RHS);
            
    /**
     * <p>id(0x35c)</p>
     */
    @ComProperty(name = "HelpButton", dispId = 0x35c)
    com.sun.jna.platform.win32.WinNT.HRESULT setHelpButton(Boolean RHS);
            
    /**
     * <p>id(0x88)</p>
     */
    @ComProperty(name = "HorizontalAlignment", dispId = 0x88)
    com.sun.jna.platform.win32.WinNT.HRESULT getHorizontalAlignment(VARIANT RHS);
            
    /**
     * <p>id(0x88)</p>
     */
    @ComProperty(name = "HorizontalAlignment", dispId = 0x88)
    com.sun.jna.platform.win32.WinNT.HRESULT setHorizontalAlignment(Object RHS);
            
    /**
     * <p>id(0x356)</p>
     */
    @ComProperty(name = "InputType", dispId = 0x356)
    com.sun.jna.platform.win32.WinNT.HRESULT getInputType(VARIANT RHS);
            
    /**
     * <p>id(0x356)</p>
     */
    @ComProperty(name = "InputType", dispId = 0x356)
    com.sun.jna.platform.win32.WinNT.HRESULT setInputType(Integer RHS);
            
    /**
     * <p>id(0x81)</p>
     */
    @ComProperty(name = "Interior", dispId = 0x81)
    com.sun.jna.platform.win32.WinNT.HRESULT getInterior(VARIANT RHS);
            
    /**
     * <p>id(0x34d)</p>
     */
    @ComProperty(name = "LargeChange", dispId = 0x34d)
    com.sun.jna.platform.win32.WinNT.HRESULT getLargeChange(VARIANT RHS);
            
    /**
     * <p>id(0x34d)</p>
     */
    @ComProperty(name = "LargeChange", dispId = 0x34d)
    com.sun.jna.platform.win32.WinNT.HRESULT setLargeChange(Integer RHS);
            
    /**
     * <p>id(0x422)</p>
     */
    @ComProperty(name = "LinkedCell", dispId = 0x422)
    com.sun.jna.platform.win32.WinNT.HRESULT getLinkedCell(VARIANT RHS);
            
    /**
     * <p>id(0x422)</p>
     */
    @ComProperty(name = "LinkedCell", dispId = 0x422)
    com.sun.jna.platform.win32.WinNT.HRESULT setLinkedCell(String RHS);
            
    /**
     * <p>id(0x10036)</p>
     */
    @ComMethod(name = "_Dummy54", dispId = 0x10036)
    void _Dummy54();
            
    /**
     * <p>id(0x35d)</p>
     */
    @ComMethod(name = "List", dispId = 0x35d)
    com.sun.jna.platform.win32.WinNT.HRESULT List(Object Index,
            VARIANT RHS);
            
    /**
     * <p>id(0x10038)</p>
     */
    @ComMethod(name = "_Dummy56", dispId = 0x10038)
    void _Dummy56();
            
    /**
     * <p>id(0x34f)</p>
     */
    @ComProperty(name = "ListFillRange", dispId = 0x34f)
    com.sun.jna.platform.win32.WinNT.HRESULT getListFillRange(VARIANT RHS);
            
    /**
     * <p>id(0x34f)</p>
     */
    @ComProperty(name = "ListFillRange", dispId = 0x34f)
    com.sun.jna.platform.win32.WinNT.HRESULT setListFillRange(String RHS);
            
    /**
     * <p>id(0x352)</p>
     */
    @ComProperty(name = "ListIndex", dispId = 0x352)
    com.sun.jna.platform.win32.WinNT.HRESULT getListIndex(VARIANT RHS);
            
    /**
     * <p>id(0x352)</p>
     */
    @ComProperty(name = "ListIndex", dispId = 0x352)
    com.sun.jna.platform.win32.WinNT.HRESULT setListIndex(Integer RHS);
            
    /**
     * <p>id(0x268)</p>
     */
    @ComProperty(name = "LockedText", dispId = 0x268)
    com.sun.jna.platform.win32.WinNT.HRESULT getLockedText(VARIANT RHS);
            
    /**
     * <p>id(0x268)</p>
     */
    @ComProperty(name = "LockedText", dispId = 0x268)
    com.sun.jna.platform.win32.WinNT.HRESULT setLockedText(Boolean RHS);
            
    /**
     * <p>id(0x34a)</p>
     */
    @ComProperty(name = "Max", dispId = 0x34a)
    com.sun.jna.platform.win32.WinNT.HRESULT getMax(VARIANT RHS);
            
    /**
     * <p>id(0x34a)</p>
     */
    @ComProperty(name = "Max", dispId = 0x34a)
    com.sun.jna.platform.win32.WinNT.HRESULT setMax(Integer RHS);
            
    /**
     * <p>id(0x34b)</p>
     */
    @ComProperty(name = "Min", dispId = 0x34b)
    com.sun.jna.platform.win32.WinNT.HRESULT getMin(VARIANT RHS);
            
    /**
     * <p>id(0x34b)</p>
     */
    @ComProperty(name = "Min", dispId = 0x34b)
    com.sun.jna.platform.win32.WinNT.HRESULT setMin(Integer RHS);
            
    /**
     * <p>id(0x357)</p>
     */
    @ComProperty(name = "MultiLine", dispId = 0x357)
    com.sun.jna.platform.win32.WinNT.HRESULT getMultiLine(VARIANT RHS);
            
    /**
     * <p>id(0x357)</p>
     */
    @ComProperty(name = "MultiLine", dispId = 0x357)
    com.sun.jna.platform.win32.WinNT.HRESULT setMultiLine(Boolean RHS);
            
    /**
     * <p>id(0x20)</p>
     */
    @ComProperty(name = "MultiSelect", dispId = 0x20)
    com.sun.jna.platform.win32.WinNT.HRESULT getMultiSelect(VARIANT RHS);
            
    /**
     * <p>id(0x20)</p>
     */
    @ComProperty(name = "MultiSelect", dispId = 0x20)
    com.sun.jna.platform.win32.WinNT.HRESULT setMultiSelect(Boolean RHS);
            
    /**
     * <p>id(0x86)</p>
     */
    @ComProperty(name = "Orientation", dispId = 0x86)
    com.sun.jna.platform.win32.WinNT.HRESULT getOrientation(VARIANT RHS);
            
    /**
     * <p>id(0x86)</p>
     */
    @ComProperty(name = "Orientation", dispId = 0x86)
    com.sun.jna.platform.win32.WinNT.HRESULT setOrientation(Object RHS);
            
    /**
     * <p>id(0x461)</p>
     */
    @ComProperty(name = "PhoneticAccelerator", dispId = 0x461)
    com.sun.jna.platform.win32.WinNT.HRESULT getPhoneticAccelerator(VARIANT RHS);
            
    /**
     * <p>id(0x461)</p>
     */
    @ComProperty(name = "PhoneticAccelerator", dispId = 0x461)
    com.sun.jna.platform.win32.WinNT.HRESULT setPhoneticAccelerator(Object RHS);
            
    /**
     * <p>id(0x355)</p>
     */
    @ComMethod(name = "RemoveAllItems", dispId = 0x355)
    com.sun.jna.platform.win32.WinNT.HRESULT RemoveAllItems(VARIANT RHS);
            
    /**
     * <p>id(0x354)</p>
     */
    @ComMethod(name = "RemoveItem", dispId = 0x354)
    com.sun.jna.platform.win32.WinNT.HRESULT RemoveItem(Integer Index,
            Object Count,
            VARIANT RHS);
            
    /**
     * <p>id(0x25c)</p>
     */
    @ComMethod(name = "Reshape", dispId = 0x25c)
    com.sun.jna.platform.win32.WinNT.HRESULT Reshape(Integer Vertex,
            Object Insert,
            Object Left,
            Object Top,
            VARIANT RHS);
            
    /**
     * <p>id(0x26b)</p>
     */
    @ComProperty(name = "RoundedCorners", dispId = 0x26b)
    com.sun.jna.platform.win32.WinNT.HRESULT getRoundedCorners(VARIANT RHS);
            
    /**
     * <p>id(0x26b)</p>
     */
    @ComProperty(name = "RoundedCorners", dispId = 0x26b)
    com.sun.jna.platform.win32.WinNT.HRESULT setRoundedCorners(Boolean RHS);
            
    /**
     * <p>id(0x463)</p>
     */
    @ComMethod(name = "Selected", dispId = 0x463)
    com.sun.jna.platform.win32.WinNT.HRESULT Selected(Object Index,
            VARIANT RHS);
            
    /**
     * <p>id(0x67)</p>
     */
    @ComProperty(name = "Shadow", dispId = 0x67)
    com.sun.jna.platform.win32.WinNT.HRESULT getShadow(VARIANT RHS);
            
    /**
     * <p>id(0x67)</p>
     */
    @ComProperty(name = "Shadow", dispId = 0x67)
    com.sun.jna.platform.win32.WinNT.HRESULT setShadow(Boolean RHS);
            
    /**
     * <p>id(0x34c)</p>
     */
    @ComProperty(name = "SmallChange", dispId = 0x34c)
    com.sun.jna.platform.win32.WinNT.HRESULT getSmallChange(VARIANT RHS);
            
    /**
     * <p>id(0x34c)</p>
     */
    @ComProperty(name = "SmallChange", dispId = 0x34c)
    com.sun.jna.platform.win32.WinNT.HRESULT setSmallChange(Integer RHS);
            
    /**
     * <p>id(0x8a)</p>
     */
    @ComProperty(name = "Text", dispId = 0x8a)
    com.sun.jna.platform.win32.WinNT.HRESULT getText(VARIANT RHS);
            
    /**
     * <p>id(0x8a)</p>
     */
    @ComProperty(name = "Text", dispId = 0x8a)
    com.sun.jna.platform.win32.WinNT.HRESULT setText(String RHS);
            
    /**
     * <p>id(0xf4)</p>
     */
    @ComMethod(name = "Ungroup", dispId = 0xf4)
    com.sun.jna.platform.win32.WinNT.HRESULT Ungroup(VARIANT RHS);
            
    /**
     * <p>id(0x6)</p>
     */
    @ComProperty(name = "Value", dispId = 0x6)
    com.sun.jna.platform.win32.WinNT.HRESULT getValue(VARIANT RHS);
            
    /**
     * <p>id(0x6)</p>
     */
    @ComProperty(name = "Value", dispId = 0x6)
    com.sun.jna.platform.win32.WinNT.HRESULT setValue(Integer RHS);
            
    /**
     * <p>id(0x89)</p>
     */
    @ComProperty(name = "VerticalAlignment", dispId = 0x89)
    com.sun.jna.platform.win32.WinNT.HRESULT getVerticalAlignment(VARIANT RHS);
            
    /**
     * <p>id(0x89)</p>
     */
    @ComProperty(name = "VerticalAlignment", dispId = 0x89)
    com.sun.jna.platform.win32.WinNT.HRESULT setVerticalAlignment(Object RHS);
            
    /**
     * <p>id(0x26d)</p>
     */
    @ComMethod(name = "Vertices", dispId = 0x26d)
    com.sun.jna.platform.win32.WinNT.HRESULT Vertices(Object Index1,
            Object Index2,
            VARIANT RHS);
            
    /**
     * <p>id(0x3cf)</p>
     */
    @ComProperty(name = "ReadingOrder", dispId = 0x3cf)
    com.sun.jna.platform.win32.WinNT.HRESULT getReadingOrder(VARIANT RHS);
            
    /**
     * <p>id(0x3cf)</p>
     */
    @ComProperty(name = "ReadingOrder", dispId = 0x3cf)
    com.sun.jna.platform.win32.WinNT.HRESULT setReadingOrder(Integer RHS);
            
    /**
     * <p>id(0x76)</p>
     */
    @ComProperty(name = "Count", dispId = 0x76)
    com.sun.jna.platform.win32.WinNT.HRESULT getCount(VARIANT RHS);
            
    /**
     * <p>id(0xaa)</p>
     */
    @ComMethod(name = "Item", dispId = 0xaa)
    com.sun.jna.platform.win32.WinNT.HRESULT Item(Object Index,
            VARIANT RHS);
            
    /**
     * <p>id(0x2e)</p>
     */
    @ComMethod(name = "Group", dispId = 0x2e)
    com.sun.jna.platform.win32.WinNT.HRESULT Group(VARIANT RHS);
            
    /**
     * <p>id(0x358)</p>
     */
    @ComMethod(name = "LinkCombo", dispId = 0x358)
    com.sun.jna.platform.win32.WinNT.HRESULT LinkCombo(Object Link,
            VARIANT RHS);
            
    
}