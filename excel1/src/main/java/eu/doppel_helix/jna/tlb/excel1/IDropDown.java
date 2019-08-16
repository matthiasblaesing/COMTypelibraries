
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({0002088B-0001-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{0002088B-0001-0000-C000-000000000046}")
public interface IDropDown extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x94)</p>
     * <p>vtableId(7)</p>
     * @param RHS [out] {@code Application}
     */
    @ComProperty(name = "Application", dispId = 0x94)
    com.sun.jna.platform.win32.WinNT.HRESULT getApplication(VARIANT RHS);
            
    /**
     * <p>id(0x95)</p>
     * <p>vtableId(8)</p>
     * @param RHS [out] {@code XlCreator}
     */
    @ComProperty(name = "Creator", dispId = 0x95)
    com.sun.jna.platform.win32.WinNT.HRESULT getCreator(VARIANT RHS);
            
    /**
     * <p>id(0x96)</p>
     * <p>vtableId(9)</p>
     * @param RHS [out] {@code com.sun.jna.platform.win32.COM.util.IDispatch}
     */
    @ComProperty(name = "Parent", dispId = 0x96)
    com.sun.jna.platform.win32.WinNT.HRESULT getParent(VARIANT RHS);
            
    /**
     * <p>id(0x267)</p>
     * <p>vtableId(10)</p>
     * @param RHS [out] {@code Range}
     */
    @ComProperty(name = "BottomRightCell", dispId = 0x267)
    com.sun.jna.platform.win32.WinNT.HRESULT getBottomRightCell(VARIANT RHS);
            
    /**
     * <p>id(0x25a)</p>
     * <p>vtableId(11)</p>
     * @param RHS [out] {@code Object}
     */
    @ComMethod(name = "BringToFront", dispId = 0x25a)
    com.sun.jna.platform.win32.WinNT.HRESULT BringToFront(VARIANT RHS);
            
    /**
     * <p>id(0x227)</p>
     * <p>vtableId(12)</p>
     * @param RHS [out] {@code Object}
     */
    @ComMethod(name = "Copy", dispId = 0x227)
    com.sun.jna.platform.win32.WinNT.HRESULT Copy(VARIANT RHS);
            
    /**
     * <p>id(0xd5)</p>
     * <p>vtableId(13)</p>
     * @param Appearance [in, optional] {@code XlPictureAppearance}
     * @param Format [in, optional] {@code XlCopyPictureFormat}
     * @param RHS [out] {@code Object}
     */
    @ComMethod(name = "CopyPicture", dispId = 0xd5)
    com.sun.jna.platform.win32.WinNT.HRESULT CopyPicture(XlPictureAppearance Appearance,
            XlCopyPictureFormat Format,
            VARIANT RHS);
            
    /**
     * <p>id(0x235)</p>
     * <p>vtableId(14)</p>
     * @param RHS [out] {@code Object}
     */
    @ComMethod(name = "Cut", dispId = 0x235)
    com.sun.jna.platform.win32.WinNT.HRESULT Cut(VARIANT RHS);
            
    /**
     * <p>id(0x75)</p>
     * <p>vtableId(15)</p>
     * @param RHS [out] {@code Object}
     */
    @ComMethod(name = "Delete", dispId = 0x75)
    com.sun.jna.platform.win32.WinNT.HRESULT Delete(VARIANT RHS);
            
    /**
     * <p>id(0x40f)</p>
     * <p>vtableId(16)</p>
     * @param RHS [out] {@code com.sun.jna.platform.win32.COM.util.IDispatch}
     */
    @ComMethod(name = "Duplicate", dispId = 0x40f)
    com.sun.jna.platform.win32.WinNT.HRESULT Duplicate(VARIANT RHS);
            
    /**
     * <p>id(0x258)</p>
     * <p>vtableId(17)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "Enabled", dispId = 0x258)
    com.sun.jna.platform.win32.WinNT.HRESULT getEnabled(VARIANT RHS);
            
    /**
     * <p>id(0x258)</p>
     * <p>vtableId(18)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "Enabled", dispId = 0x258)
    com.sun.jna.platform.win32.WinNT.HRESULT setEnabled(Boolean RHS);
            
    /**
     * <p>id(0x7b)</p>
     * <p>vtableId(19)</p>
     * @param RHS [out] {@code Double}
     */
    @ComProperty(name = "Height", dispId = 0x7b)
    com.sun.jna.platform.win32.WinNT.HRESULT getHeight(VARIANT RHS);
            
    /**
     * <p>id(0x7b)</p>
     * <p>vtableId(20)</p>
     * @param RHS [in] {@code Double}
     */
    @ComProperty(name = "Height", dispId = 0x7b)
    com.sun.jna.platform.win32.WinNT.HRESULT setHeight(Double RHS);
            
    /**
     * <p>id(0x1e6)</p>
     * <p>vtableId(21)</p>
     * @param RHS [out] {@code Integer}
     */
    @ComProperty(name = "Index", dispId = 0x1e6)
    com.sun.jna.platform.win32.WinNT.HRESULT getIndex(VARIANT RHS);
            
    /**
     * <p>id(0x7f)</p>
     * <p>vtableId(22)</p>
     * @param RHS [out] {@code Double}
     */
    @ComProperty(name = "Left", dispId = 0x7f)
    com.sun.jna.platform.win32.WinNT.HRESULT getLeft(VARIANT RHS);
            
    /**
     * <p>id(0x7f)</p>
     * <p>vtableId(23)</p>
     * @param RHS [in] {@code Double}
     */
    @ComProperty(name = "Left", dispId = 0x7f)
    com.sun.jna.platform.win32.WinNT.HRESULT setLeft(Double RHS);
            
    /**
     * <p>id(0x10d)</p>
     * <p>vtableId(24)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "Locked", dispId = 0x10d)
    com.sun.jna.platform.win32.WinNT.HRESULT getLocked(VARIANT RHS);
            
    /**
     * <p>id(0x10d)</p>
     * <p>vtableId(25)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "Locked", dispId = 0x10d)
    com.sun.jna.platform.win32.WinNT.HRESULT setLocked(Boolean RHS);
            
    /**
     * <p>id(0x6e)</p>
     * <p>vtableId(26)</p>
     * @param RHS [out] {@code String}
     */
    @ComProperty(name = "Name", dispId = 0x6e)
    com.sun.jna.platform.win32.WinNT.HRESULT getName(VARIANT RHS);
            
    /**
     * <p>id(0x6e)</p>
     * <p>vtableId(27)</p>
     * @param RHS [in] {@code String}
     */
    @ComProperty(name = "Name", dispId = 0x6e)
    com.sun.jna.platform.win32.WinNT.HRESULT setName(String RHS);
            
    /**
     * <p>id(0x254)</p>
     * <p>vtableId(28)</p>
     * @param RHS [out] {@code String}
     */
    @ComProperty(name = "OnAction", dispId = 0x254)
    com.sun.jna.platform.win32.WinNT.HRESULT getOnAction(VARIANT RHS);
            
    /**
     * <p>id(0x254)</p>
     * <p>vtableId(29)</p>
     * @param RHS [in] {@code String}
     */
    @ComProperty(name = "OnAction", dispId = 0x254)
    com.sun.jna.platform.win32.WinNT.HRESULT setOnAction(String RHS);
            
    /**
     * <p>id(0x269)</p>
     * <p>vtableId(30)</p>
     * @param RHS [out] {@code Object}
     */
    @ComProperty(name = "Placement", dispId = 0x269)
    com.sun.jna.platform.win32.WinNT.HRESULT getPlacement(VARIANT RHS);
            
    /**
     * <p>id(0x269)</p>
     * <p>vtableId(31)</p>
     * @param RHS [in] {@code Object}
     */
    @ComProperty(name = "Placement", dispId = 0x269)
    com.sun.jna.platform.win32.WinNT.HRESULT setPlacement(Object RHS);
            
    /**
     * <p>id(0x26a)</p>
     * <p>vtableId(32)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "PrintObject", dispId = 0x26a)
    com.sun.jna.platform.win32.WinNT.HRESULT getPrintObject(VARIANT RHS);
            
    /**
     * <p>id(0x26a)</p>
     * <p>vtableId(33)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "PrintObject", dispId = 0x26a)
    com.sun.jna.platform.win32.WinNT.HRESULT setPrintObject(Boolean RHS);
            
    /**
     * <p>id(0xeb)</p>
     * <p>vtableId(34)</p>
     * @param Replace [in, optional] {@code Object}
     * @param RHS [out] {@code Object}
     */
    @ComMethod(name = "Select", dispId = 0xeb)
    com.sun.jna.platform.win32.WinNT.HRESULT Select(Object Replace,
            VARIANT RHS);
            
    /**
     * <p>id(0x25d)</p>
     * <p>vtableId(35)</p>
     * @param RHS [out] {@code Object}
     */
    @ComMethod(name = "SendToBack", dispId = 0x25d)
    com.sun.jna.platform.win32.WinNT.HRESULT SendToBack(VARIANT RHS);
            
    /**
     * <p>id(0x7e)</p>
     * <p>vtableId(36)</p>
     * @param RHS [out] {@code Double}
     */
    @ComProperty(name = "Top", dispId = 0x7e)
    com.sun.jna.platform.win32.WinNT.HRESULT getTop(VARIANT RHS);
            
    /**
     * <p>id(0x7e)</p>
     * <p>vtableId(37)</p>
     * @param RHS [in] {@code Double}
     */
    @ComProperty(name = "Top", dispId = 0x7e)
    com.sun.jna.platform.win32.WinNT.HRESULT setTop(Double RHS);
            
    /**
     * <p>id(0x26c)</p>
     * <p>vtableId(38)</p>
     * @param RHS [out] {@code Range}
     */
    @ComProperty(name = "TopLeftCell", dispId = 0x26c)
    com.sun.jna.platform.win32.WinNT.HRESULT getTopLeftCell(VARIANT RHS);
            
    /**
     * <p>id(0x22e)</p>
     * <p>vtableId(39)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "Visible", dispId = 0x22e)
    com.sun.jna.platform.win32.WinNT.HRESULT getVisible(VARIANT RHS);
            
    /**
     * <p>id(0x22e)</p>
     * <p>vtableId(40)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "Visible", dispId = 0x22e)
    com.sun.jna.platform.win32.WinNT.HRESULT setVisible(Boolean RHS);
            
    /**
     * <p>id(0x7a)</p>
     * <p>vtableId(41)</p>
     * @param RHS [out] {@code Double}
     */
    @ComProperty(name = "Width", dispId = 0x7a)
    com.sun.jna.platform.win32.WinNT.HRESULT getWidth(VARIANT RHS);
            
    /**
     * <p>id(0x7a)</p>
     * <p>vtableId(42)</p>
     * @param RHS [in] {@code Double}
     */
    @ComProperty(name = "Width", dispId = 0x7a)
    com.sun.jna.platform.win32.WinNT.HRESULT setWidth(Double RHS);
            
    /**
     * <p>id(0x26e)</p>
     * <p>vtableId(43)</p>
     * @param RHS [out] {@code Integer}
     */
    @ComProperty(name = "ZOrder", dispId = 0x26e)
    com.sun.jna.platform.win32.WinNT.HRESULT getZOrder(VARIANT RHS);
            
    /**
     * <p>id(0x5f8)</p>
     * <p>vtableId(44)</p>
     * @param RHS [out] {@code ShapeRange}
     */
    @ComProperty(name = "ShapeRange", dispId = 0x5f8)
    com.sun.jna.platform.win32.WinNT.HRESULT getShapeRange(VARIANT RHS);
            
    /**
     * <p>id(0x353)</p>
     * <p>vtableId(45)</p>
     * @param Text [in] {@code Object}
     * @param Index [in, optional] {@code Object}
     * @param RHS [out] {@code Object}
     */
    @ComMethod(name = "AddItem", dispId = 0x353)
    com.sun.jna.platform.win32.WinNT.HRESULT AddItem(Object Text,
            Object Index,
            VARIANT RHS);
            
    /**
     * <p>id(0x462)</p>
     * <p>vtableId(46)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "Display3DShading", dispId = 0x462)
    com.sun.jna.platform.win32.WinNT.HRESULT getDisplay3DShading(VARIANT RHS);
            
    /**
     * <p>id(0x462)</p>
     * <p>vtableId(47)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "Display3DShading", dispId = 0x462)
    com.sun.jna.platform.win32.WinNT.HRESULT setDisplay3DShading(Boolean RHS);
            
    /**
     * <p>id(0x0)</p>
     * <p>vtableId(48)</p>
     * @param RHS [out] {@code Integer}
     */
    @ComProperty(name = "_Default", dispId = 0x0)
    com.sun.jna.platform.win32.WinNT.HRESULT get_Default(VARIANT RHS);
            
    /**
     * <p>id(0x0)</p>
     * <p>vtableId(49)</p>
     * @param RHS [in] {@code Integer}
     */
    @ComProperty(name = "_Default", dispId = 0x0)
    com.sun.jna.platform.win32.WinNT.HRESULT set_Default(Integer RHS);
            
    /**
     * <p>id(0x422)</p>
     * <p>vtableId(50)</p>
     * @param RHS [out] {@code String}
     */
    @ComProperty(name = "LinkedCell", dispId = 0x422)
    com.sun.jna.platform.win32.WinNT.HRESULT getLinkedCell(VARIANT RHS);
            
    /**
     * <p>id(0x422)</p>
     * <p>vtableId(51)</p>
     * @param RHS [in] {@code String}
     */
    @ComProperty(name = "LinkedCell", dispId = 0x422)
    com.sun.jna.platform.win32.WinNT.HRESULT setLinkedCell(String RHS);
            
    /**
     * <p>id(0x35e)</p>
     * <p>vtableId(52)</p>
     * @param RHS [out] {@code Object}
     */
    @ComProperty(name = "LinkedObject", dispId = 0x35e)
    com.sun.jna.platform.win32.WinNT.HRESULT getLinkedObject(VARIANT RHS);
            
    /**
     * <p>id(0x35d)</p>
     * <p>vtableId(53)</p>
     * @param Index [in, optional] {@code Object}
     * @param RHS [out] {@code Object}
     */
    @ComProperty(name = "List", dispId = 0x35d)
    com.sun.jna.platform.win32.WinNT.HRESULT getList(Object Index,
            VARIANT RHS);
            
    /**
     * <p>id(0x35d)</p>
     * <p>vtableId(54)</p>
     * @param Index [in, optional] {@code Object}
     * @param RHS [in] {@code Object}
     */
    @ComProperty(name = "List", dispId = 0x35d)
    com.sun.jna.platform.win32.WinNT.HRESULT setList(Object Index,
            Object RHS);
            
    /**
     * <p>id(0x351)</p>
     * <p>vtableId(55)</p>
     * @param RHS [out] {@code Integer}
     */
    @ComProperty(name = "ListCount", dispId = 0x351)
    com.sun.jna.platform.win32.WinNT.HRESULT getListCount(VARIANT RHS);
            
    /**
     * <p>id(0x34f)</p>
     * <p>vtableId(56)</p>
     * @param RHS [out] {@code String}
     */
    @ComProperty(name = "ListFillRange", dispId = 0x34f)
    com.sun.jna.platform.win32.WinNT.HRESULT getListFillRange(VARIANT RHS);
            
    /**
     * <p>id(0x34f)</p>
     * <p>vtableId(57)</p>
     * @param RHS [in] {@code String}
     */
    @ComProperty(name = "ListFillRange", dispId = 0x34f)
    com.sun.jna.platform.win32.WinNT.HRESULT setListFillRange(String RHS);
            
    /**
     * <p>id(0x352)</p>
     * <p>vtableId(58)</p>
     * @param RHS [out] {@code Integer}
     */
    @ComProperty(name = "ListIndex", dispId = 0x352)
    com.sun.jna.platform.win32.WinNT.HRESULT getListIndex(VARIANT RHS);
            
    /**
     * <p>id(0x352)</p>
     * <p>vtableId(59)</p>
     * @param RHS [in] {@code Integer}
     */
    @ComProperty(name = "ListIndex", dispId = 0x352)
    com.sun.jna.platform.win32.WinNT.HRESULT setListIndex(Integer RHS);
            
    /**
     * <p>id(0x10024)</p>
     * <p>vtableId(60)</p>
     */
    @ComMethod(name = "_Dummy36", dispId = 0x10024)
    void _Dummy36();
            
    /**
     * <p>id(0x355)</p>
     * <p>vtableId(61)</p>
     * @param RHS [out] {@code Object}
     */
    @ComMethod(name = "RemoveAllItems", dispId = 0x355)
    com.sun.jna.platform.win32.WinNT.HRESULT RemoveAllItems(VARIANT RHS);
            
    /**
     * <p>id(0x354)</p>
     * <p>vtableId(62)</p>
     * @param Index [in] {@code Integer}
     * @param Count [in, optional] {@code Object}
     * @param RHS [out] {@code Object}
     */
    @ComMethod(name = "RemoveItem", dispId = 0x354)
    com.sun.jna.platform.win32.WinNT.HRESULT RemoveItem(Integer Index,
            Object Count,
            VARIANT RHS);
            
    /**
     * <p>id(0x463)</p>
     * <p>vtableId(63)</p>
     * @param Index [in, optional] {@code Object}
     * @param RHS [out] {@code Object}
     */
    @ComProperty(name = "Selected", dispId = 0x463)
    com.sun.jna.platform.win32.WinNT.HRESULT getSelected(Object Index,
            VARIANT RHS);
            
    /**
     * <p>id(0x463)</p>
     * <p>vtableId(64)</p>
     * @param Index [in, optional] {@code Object}
     * @param RHS [in] {@code Object}
     */
    @ComProperty(name = "Selected", dispId = 0x463)
    com.sun.jna.platform.win32.WinNT.HRESULT setSelected(Object Index,
            Object RHS);
            
    /**
     * <p>id(0x6)</p>
     * <p>vtableId(65)</p>
     * @param RHS [out] {@code Integer}
     */
    @ComProperty(name = "Value", dispId = 0x6)
    com.sun.jna.platform.win32.WinNT.HRESULT getValue(VARIANT RHS);
            
    /**
     * <p>id(0x6)</p>
     * <p>vtableId(66)</p>
     * @param RHS [in] {@code Integer}
     */
    @ComProperty(name = "Value", dispId = 0x6)
    com.sun.jna.platform.win32.WinNT.HRESULT setValue(Integer RHS);
            
    /**
     * <p>id(0x8b)</p>
     * <p>vtableId(67)</p>
     * @param RHS [out] {@code String}
     */
    @ComProperty(name = "Caption", dispId = 0x8b)
    com.sun.jna.platform.win32.WinNT.HRESULT getCaption(VARIANT RHS);
            
    /**
     * <p>id(0x8b)</p>
     * <p>vtableId(68)</p>
     * @param RHS [in] {@code String}
     */
    @ComProperty(name = "Caption", dispId = 0x8b)
    com.sun.jna.platform.win32.WinNT.HRESULT setCaption(String RHS);
            
    /**
     * <p>id(0x25b)</p>
     * <p>vtableId(69)</p>
     * @param Start [in, optional] {@code Object}
     * @param Length [in, optional] {@code Object}
     * @param RHS [out] {@code Characters}
     */
    @ComProperty(name = "Characters", dispId = 0x25b)
    com.sun.jna.platform.win32.WinNT.HRESULT getCharacters(Object Start,
            Object Length,
            VARIANT RHS);
            
    /**
     * <p>id(0x350)</p>
     * <p>vtableId(70)</p>
     * @param RHS [out] {@code Integer}
     */
    @ComProperty(name = "DropDownLines", dispId = 0x350)
    com.sun.jna.platform.win32.WinNT.HRESULT getDropDownLines(VARIANT RHS);
            
    /**
     * <p>id(0x350)</p>
     * <p>vtableId(71)</p>
     * @param RHS [in] {@code Integer}
     */
    @ComProperty(name = "DropDownLines", dispId = 0x350)
    com.sun.jna.platform.win32.WinNT.HRESULT setDropDownLines(Integer RHS);
            
    /**
     * <p>id(0x8a)</p>
     * <p>vtableId(72)</p>
     * @param RHS [out] {@code String}
     */
    @ComProperty(name = "Text", dispId = 0x8a)
    com.sun.jna.platform.win32.WinNT.HRESULT getText(VARIANT RHS);
            
    /**
     * <p>id(0x8a)</p>
     * <p>vtableId(73)</p>
     * @param RHS [in] {@code String}
     */
    @ComProperty(name = "Text", dispId = 0x8a)
    com.sun.jna.platform.win32.WinNT.HRESULT setText(String RHS);
            
    
}