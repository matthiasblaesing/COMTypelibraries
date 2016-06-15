
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000244A9-0001-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000244A9-0001-0000-C000-000000000046}")
public interface ISortField extends IUnknown, IRawDispatchHandle, IDispatch {
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
     * <p>id(0xab5)</p>
     */
    @ComProperty(name = "SortOn", dispId = 0xab5)
    com.sun.jna.platform.win32.WinNT.HRESULT getSortOn(VARIANT RHS);
            
    /**
     * <p>id(0xab5)</p>
     */
    @ComProperty(name = "SortOn", dispId = 0xab5)
    com.sun.jna.platform.win32.WinNT.HRESULT setSortOn(XlSortOn RHS);
            
    /**
     * <p>id(0xab6)</p>
     */
    @ComProperty(name = "SortOnValue", dispId = 0xab6)
    com.sun.jna.platform.win32.WinNT.HRESULT getSortOnValue(VARIANT RHS);
            
    /**
     * <p>id(0x9b)</p>
     */
    @ComProperty(name = "Key", dispId = 0x9b)
    com.sun.jna.platform.win32.WinNT.HRESULT getKey(VARIANT RHS);
            
    /**
     * <p>id(0xc0)</p>
     */
    @ComProperty(name = "Order", dispId = 0xc0)
    com.sun.jna.platform.win32.WinNT.HRESULT getOrder(VARIANT RHS);
            
    /**
     * <p>id(0xc0)</p>
     */
    @ComProperty(name = "Order", dispId = 0xc0)
    com.sun.jna.platform.win32.WinNT.HRESULT setOrder(XlSortOrder RHS);
            
    /**
     * <p>id(0xab7)</p>
     */
    @ComProperty(name = "CustomOrder", dispId = 0xab7)
    com.sun.jna.platform.win32.WinNT.HRESULT getCustomOrder(VARIANT RHS);
            
    /**
     * <p>id(0xab7)</p>
     */
    @ComProperty(name = "CustomOrder", dispId = 0xab7)
    com.sun.jna.platform.win32.WinNT.HRESULT setCustomOrder(Object RHS);
            
    /**
     * <p>id(0xab8)</p>
     */
    @ComProperty(name = "DataOption", dispId = 0xab8)
    com.sun.jna.platform.win32.WinNT.HRESULT getDataOption(VARIANT RHS);
            
    /**
     * <p>id(0xab8)</p>
     */
    @ComProperty(name = "DataOption", dispId = 0xab8)
    com.sun.jna.platform.win32.WinNT.HRESULT setDataOption(XlSortDataOption RHS);
            
    /**
     * <p>id(0x3d9)</p>
     */
    @ComProperty(name = "Priority", dispId = 0x3d9)
    com.sun.jna.platform.win32.WinNT.HRESULT getPriority(VARIANT RHS);
            
    /**
     * <p>id(0x3d9)</p>
     */
    @ComProperty(name = "Priority", dispId = 0x3d9)
    com.sun.jna.platform.win32.WinNT.HRESULT setPriority(Integer RHS);
            
    /**
     * <p>id(0x75)</p>
     */
    @ComMethod(name = "Delete", dispId = 0x75)
    com.sun.jna.platform.win32.WinNT.HRESULT Delete();
            
    /**
     * <p>id(0xab9)</p>
     */
    @ComMethod(name = "ModifyKey", dispId = 0xab9)
    com.sun.jna.platform.win32.WinNT.HRESULT ModifyKey(Range Key);
            
    /**
     * <p>id(0xaba)</p>
     */
    @ComMethod(name = "SetIcon", dispId = 0xaba)
    com.sun.jna.platform.win32.WinNT.HRESULT SetIcon(Icon Icon);
            
    
}