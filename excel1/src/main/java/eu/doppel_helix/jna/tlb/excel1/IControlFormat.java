
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
     * <p>id(0x353)</p>
     */
    @ComMethod(name = "AddItem", dispId = 0x353)
    com.sun.jna.platform.win32.WinNT.HRESULT AddItem(String Text,
            Object Index);
            
    /**
     * <p>id(0x355)</p>
     */
    @ComMethod(name = "RemoveAllItems", dispId = 0x355)
    com.sun.jna.platform.win32.WinNT.HRESULT RemoveAllItems();
            
    /**
     * <p>id(0x354)</p>
     */
    @ComMethod(name = "RemoveItem", dispId = 0x354)
    com.sun.jna.platform.win32.WinNT.HRESULT RemoveItem(Integer Index,
            Object Count);
            
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
     * <p>id(0x35d)</p>
     */
    @ComMethod(name = "List", dispId = 0x35d)
    com.sun.jna.platform.win32.WinNT.HRESULT List(Object Index,
            VARIANT RHS);
            
    /**
     * <p>id(0x351)</p>
     */
    @ComProperty(name = "ListCount", dispId = 0x351)
    com.sun.jna.platform.win32.WinNT.HRESULT getListCount(VARIANT RHS);
            
    /**
     * <p>id(0x351)</p>
     */
    @ComProperty(name = "ListCount", dispId = 0x351)
    com.sun.jna.platform.win32.WinNT.HRESULT setListCount(Integer RHS);
            
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
     * <p>id(0x20)</p>
     */
    @ComProperty(name = "MultiSelect", dispId = 0x20)
    com.sun.jna.platform.win32.WinNT.HRESULT getMultiSelect(VARIANT RHS);
            
    /**
     * <p>id(0x20)</p>
     */
    @ComProperty(name = "MultiSelect", dispId = 0x20)
    com.sun.jna.platform.win32.WinNT.HRESULT setMultiSelect(Integer RHS);
            
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
     * <p>id(0x6)</p>
     */
    @ComProperty(name = "Value", dispId = 0x6)
    com.sun.jna.platform.win32.WinNT.HRESULT getValue(VARIANT RHS);
            
    /**
     * <p>id(0x6)</p>
     */
    @ComProperty(name = "Value", dispId = 0x6)
    com.sun.jna.platform.win32.WinNT.HRESULT setValue(Integer RHS);
            
    
}