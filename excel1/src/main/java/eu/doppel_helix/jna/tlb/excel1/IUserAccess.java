
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({0002446D-0001-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{0002446D-0001-0000-C000-000000000046}")
public interface IUserAccess extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x6e)</p>
     * <p>vtableId(7)</p>
     * @param RHS [out] {@code String}
     */
    @ComProperty(name = "Name", dispId = 0x6e)
    com.sun.jna.platform.win32.WinNT.HRESULT getName(VARIANT RHS);
            
    /**
     * <p>id(0x7e4)</p>
     * <p>vtableId(8)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "AllowEdit", dispId = 0x7e4)
    com.sun.jna.platform.win32.WinNT.HRESULT getAllowEdit(VARIANT RHS);
            
    /**
     * <p>id(0x7e4)</p>
     * <p>vtableId(9)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "AllowEdit", dispId = 0x7e4)
    com.sun.jna.platform.win32.WinNT.HRESULT setAllowEdit(Boolean RHS);
            
    /**
     * <p>id(0x75)</p>
     * <p>vtableId(10)</p>
     */
    @ComMethod(name = "Delete", dispId = 0x75)
    com.sun.jna.platform.win32.WinNT.HRESULT Delete();
            
    
}