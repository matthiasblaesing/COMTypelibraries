
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({0002088C-0001-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{0002088C-0001-0000-C000-000000000046}")
public interface IDropDowns extends IUnknown, IRawDispatchHandle, IDispatch {
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
     * <p>id(0x353)</p>
     */
    @ComMethod(name = "AddItem", dispId = 0x353)
    com.sun.jna.platform.win32.WinNT.HRESULT AddItem(Object Text,
            Object Index,
            VARIANT RHS);
            
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
     * <p>id(0x1001f)</p>
     */
    @ComMethod(name = "_Dummy31", dispId = 0x1001f)
    void _Dummy31();
            
    /**
     * <p>id(0x35d)</p>
     */
    @ComProperty(name = "List", dispId = 0x35d)
    com.sun.jna.platform.win32.WinNT.HRESULT getList(Object Index,
            VARIANT RHS);
            
    /**
     * <p>id(0x35d)</p>
     */
    @ComProperty(name = "List", dispId = 0x35d)
    com.sun.jna.platform.win32.WinNT.HRESULT setList(Object Index,
            Object RHS);
            
    /**
     * <p>id(0x10021)</p>
     */
    @ComMethod(name = "_Dummy33", dispId = 0x10021)
    void _Dummy33();
            
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
     * <p>id(0x10024)</p>
     */
    @ComMethod(name = "_Dummy36", dispId = 0x10024)
    void _Dummy36();
            
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
     * <p>id(0x463)</p>
     */
    @ComProperty(name = "Selected", dispId = 0x463)
    com.sun.jna.platform.win32.WinNT.HRESULT getSelected(Object Index,
            VARIANT RHS);
            
    /**
     * <p>id(0x463)</p>
     */
    @ComProperty(name = "Selected", dispId = 0x463)
    com.sun.jna.platform.win32.WinNT.HRESULT setSelected(Object Index,
            Object RHS);
            
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
     * <p>id(0xb5)</p>
     */
    @ComMethod(name = "Add", dispId = 0xb5)
    com.sun.jna.platform.win32.WinNT.HRESULT Add(Double Left,
            Double Top,
            Double Width,
            Double Height,
            Object Editable,
            VARIANT RHS);
            
    /**
     * <p>id(0x76)</p>
     */
    @ComProperty(name = "Count", dispId = 0x76)
    com.sun.jna.platform.win32.WinNT.HRESULT getCount(VARIANT RHS);
            
    /**
     * <p>id(0x2e)</p>
     */
    @ComMethod(name = "Group", dispId = 0x2e)
    com.sun.jna.platform.win32.WinNT.HRESULT Group(VARIANT RHS);
            
    /**
     * <p>id(0xaa)</p>
     */
    @ComMethod(name = "Item", dispId = 0xaa)
    com.sun.jna.platform.win32.WinNT.HRESULT Item(Object Index,
            VARIANT RHS);
            
    
}