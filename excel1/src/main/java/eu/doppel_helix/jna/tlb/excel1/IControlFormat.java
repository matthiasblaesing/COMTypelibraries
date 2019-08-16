
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00024440-0001-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{00024440-0001-0000-C000-000000000046}")
public interface IControlFormat extends IUnknown, IRawDispatchHandle, IDispatch {
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
     * <p>id(0x353)</p>
     * <p>vtableId(10)</p>
     * @param Text [in] {@code String}
     * @param Index [in, optional] {@code Object}
     */
    @ComMethod(name = "AddItem", dispId = 0x353)
    com.sun.jna.platform.win32.WinNT.HRESULT AddItem(String Text,
            Object Index);
            
    /**
     * <p>id(0x355)</p>
     * <p>vtableId(11)</p>
     */
    @ComMethod(name = "RemoveAllItems", dispId = 0x355)
    com.sun.jna.platform.win32.WinNT.HRESULT RemoveAllItems();
            
    /**
     * <p>id(0x354)</p>
     * <p>vtableId(12)</p>
     * @param Index [in] {@code Integer}
     * @param Count [in, optional] {@code Object}
     */
    @ComMethod(name = "RemoveItem", dispId = 0x354)
    com.sun.jna.platform.win32.WinNT.HRESULT RemoveItem(Integer Index,
            Object Count);
            
    /**
     * <p>id(0x350)</p>
     * <p>vtableId(13)</p>
     * @param RHS [out] {@code Integer}
     */
    @ComProperty(name = "DropDownLines", dispId = 0x350)
    com.sun.jna.platform.win32.WinNT.HRESULT getDropDownLines(VARIANT RHS);
            
    /**
     * <p>id(0x350)</p>
     * <p>vtableId(14)</p>
     * @param RHS [in] {@code Integer}
     */
    @ComProperty(name = "DropDownLines", dispId = 0x350)
    com.sun.jna.platform.win32.WinNT.HRESULT setDropDownLines(Integer RHS);
            
    /**
     * <p>id(0x258)</p>
     * <p>vtableId(15)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "Enabled", dispId = 0x258)
    com.sun.jna.platform.win32.WinNT.HRESULT getEnabled(VARIANT RHS);
            
    /**
     * <p>id(0x258)</p>
     * <p>vtableId(16)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "Enabled", dispId = 0x258)
    com.sun.jna.platform.win32.WinNT.HRESULT setEnabled(Boolean RHS);
            
    /**
     * <p>id(0x34d)</p>
     * <p>vtableId(17)</p>
     * @param RHS [out] {@code Integer}
     */
    @ComProperty(name = "LargeChange", dispId = 0x34d)
    com.sun.jna.platform.win32.WinNT.HRESULT getLargeChange(VARIANT RHS);
            
    /**
     * <p>id(0x34d)</p>
     * <p>vtableId(18)</p>
     * @param RHS [in] {@code Integer}
     */
    @ComProperty(name = "LargeChange", dispId = 0x34d)
    com.sun.jna.platform.win32.WinNT.HRESULT setLargeChange(Integer RHS);
            
    /**
     * <p>id(0x422)</p>
     * <p>vtableId(19)</p>
     * @param RHS [out] {@code String}
     */
    @ComProperty(name = "LinkedCell", dispId = 0x422)
    com.sun.jna.platform.win32.WinNT.HRESULT getLinkedCell(VARIANT RHS);
            
    /**
     * <p>id(0x422)</p>
     * <p>vtableId(20)</p>
     * @param RHS [in] {@code String}
     */
    @ComProperty(name = "LinkedCell", dispId = 0x422)
    com.sun.jna.platform.win32.WinNT.HRESULT setLinkedCell(String RHS);
            
    /**
     * <p>id(0x35d)</p>
     * <p>vtableId(21)</p>
     * @param Index [in, optional] {@code Object}
     * @param RHS [out] {@code Object}
     */
    @ComMethod(name = "List", dispId = 0x35d)
    com.sun.jna.platform.win32.WinNT.HRESULT List(Object Index,
            VARIANT RHS);
            
    /**
     * <p>id(0x351)</p>
     * <p>vtableId(22)</p>
     * @param RHS [out] {@code Integer}
     */
    @ComProperty(name = "ListCount", dispId = 0x351)
    com.sun.jna.platform.win32.WinNT.HRESULT getListCount(VARIANT RHS);
            
    /**
     * <p>id(0x351)</p>
     * <p>vtableId(23)</p>
     * @param RHS [in] {@code Integer}
     */
    @ComProperty(name = "ListCount", dispId = 0x351)
    com.sun.jna.platform.win32.WinNT.HRESULT setListCount(Integer RHS);
            
    /**
     * <p>id(0x34f)</p>
     * <p>vtableId(24)</p>
     * @param RHS [out] {@code String}
     */
    @ComProperty(name = "ListFillRange", dispId = 0x34f)
    com.sun.jna.platform.win32.WinNT.HRESULT getListFillRange(VARIANT RHS);
            
    /**
     * <p>id(0x34f)</p>
     * <p>vtableId(25)</p>
     * @param RHS [in] {@code String}
     */
    @ComProperty(name = "ListFillRange", dispId = 0x34f)
    com.sun.jna.platform.win32.WinNT.HRESULT setListFillRange(String RHS);
            
    /**
     * <p>id(0x352)</p>
     * <p>vtableId(26)</p>
     * @param RHS [out] {@code Integer}
     */
    @ComProperty(name = "ListIndex", dispId = 0x352)
    com.sun.jna.platform.win32.WinNT.HRESULT getListIndex(VARIANT RHS);
            
    /**
     * <p>id(0x352)</p>
     * <p>vtableId(27)</p>
     * @param RHS [in] {@code Integer}
     */
    @ComProperty(name = "ListIndex", dispId = 0x352)
    com.sun.jna.platform.win32.WinNT.HRESULT setListIndex(Integer RHS);
            
    /**
     * <p>id(0x268)</p>
     * <p>vtableId(28)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "LockedText", dispId = 0x268)
    com.sun.jna.platform.win32.WinNT.HRESULT getLockedText(VARIANT RHS);
            
    /**
     * <p>id(0x268)</p>
     * <p>vtableId(29)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "LockedText", dispId = 0x268)
    com.sun.jna.platform.win32.WinNT.HRESULT setLockedText(Boolean RHS);
            
    /**
     * <p>id(0x34a)</p>
     * <p>vtableId(30)</p>
     * @param RHS [out] {@code Integer}
     */
    @ComProperty(name = "Max", dispId = 0x34a)
    com.sun.jna.platform.win32.WinNT.HRESULT getMax(VARIANT RHS);
            
    /**
     * <p>id(0x34a)</p>
     * <p>vtableId(31)</p>
     * @param RHS [in] {@code Integer}
     */
    @ComProperty(name = "Max", dispId = 0x34a)
    com.sun.jna.platform.win32.WinNT.HRESULT setMax(Integer RHS);
            
    /**
     * <p>id(0x34b)</p>
     * <p>vtableId(32)</p>
     * @param RHS [out] {@code Integer}
     */
    @ComProperty(name = "Min", dispId = 0x34b)
    com.sun.jna.platform.win32.WinNT.HRESULT getMin(VARIANT RHS);
            
    /**
     * <p>id(0x34b)</p>
     * <p>vtableId(33)</p>
     * @param RHS [in] {@code Integer}
     */
    @ComProperty(name = "Min", dispId = 0x34b)
    com.sun.jna.platform.win32.WinNT.HRESULT setMin(Integer RHS);
            
    /**
     * <p>id(0x20)</p>
     * <p>vtableId(34)</p>
     * @param RHS [out] {@code Integer}
     */
    @ComProperty(name = "MultiSelect", dispId = 0x20)
    com.sun.jna.platform.win32.WinNT.HRESULT getMultiSelect(VARIANT RHS);
            
    /**
     * <p>id(0x20)</p>
     * <p>vtableId(35)</p>
     * @param RHS [in] {@code Integer}
     */
    @ComProperty(name = "MultiSelect", dispId = 0x20)
    com.sun.jna.platform.win32.WinNT.HRESULT setMultiSelect(Integer RHS);
            
    /**
     * <p>id(0x26a)</p>
     * <p>vtableId(36)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "PrintObject", dispId = 0x26a)
    com.sun.jna.platform.win32.WinNT.HRESULT getPrintObject(VARIANT RHS);
            
    /**
     * <p>id(0x26a)</p>
     * <p>vtableId(37)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "PrintObject", dispId = 0x26a)
    com.sun.jna.platform.win32.WinNT.HRESULT setPrintObject(Boolean RHS);
            
    /**
     * <p>id(0x34c)</p>
     * <p>vtableId(38)</p>
     * @param RHS [out] {@code Integer}
     */
    @ComProperty(name = "SmallChange", dispId = 0x34c)
    com.sun.jna.platform.win32.WinNT.HRESULT getSmallChange(VARIANT RHS);
            
    /**
     * <p>id(0x34c)</p>
     * <p>vtableId(39)</p>
     * @param RHS [in] {@code Integer}
     */
    @ComProperty(name = "SmallChange", dispId = 0x34c)
    com.sun.jna.platform.win32.WinNT.HRESULT setSmallChange(Integer RHS);
            
    /**
     * <p>id(0x0)</p>
     * <p>vtableId(40)</p>
     * @param RHS [out] {@code Integer}
     */
    @ComProperty(name = "_Default", dispId = 0x0)
    com.sun.jna.platform.win32.WinNT.HRESULT get_Default(VARIANT RHS);
            
    /**
     * <p>id(0x0)</p>
     * <p>vtableId(41)</p>
     * @param RHS [in] {@code Integer}
     */
    @ComProperty(name = "_Default", dispId = 0x0)
    com.sun.jna.platform.win32.WinNT.HRESULT set_Default(Integer RHS);
            
    /**
     * <p>id(0x6)</p>
     * <p>vtableId(42)</p>
     * @param RHS [out] {@code Integer}
     */
    @ComProperty(name = "Value", dispId = 0x6)
    com.sun.jna.platform.win32.WinNT.HRESULT getValue(VARIANT RHS);
            
    /**
     * <p>id(0x6)</p>
     * <p>vtableId(43)</p>
     * @param RHS [in] {@code Integer}
     */
    @ComProperty(name = "Value", dispId = 0x6)
    com.sun.jna.platform.win32.WinNT.HRESULT setValue(Integer RHS);
            
    
}