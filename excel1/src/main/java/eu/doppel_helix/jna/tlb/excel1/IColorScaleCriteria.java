
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00024494-0001-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{00024494-0001-0000-C000-000000000046}")
public interface IColorScaleCriteria extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x76)</p>
     */
    @ComProperty(name = "Count", dispId = 0x76)
    com.sun.jna.platform.win32.WinNT.HRESULT getCount(VARIANT RHS);
            
    /**
     * <p>id(0x0)</p>
     */
    @ComProperty(name = "_Default", dispId = 0x0)
    com.sun.jna.platform.win32.WinNT.HRESULT get_Default(Object Index,
            VARIANT RHS);
            
    /**
     * <p>id(0xaa)</p>
     */
    @ComProperty(name = "Item", dispId = 0xaa)
    com.sun.jna.platform.win32.WinNT.HRESULT getItem(Object Index,
            VARIANT RHS);
            
    
}