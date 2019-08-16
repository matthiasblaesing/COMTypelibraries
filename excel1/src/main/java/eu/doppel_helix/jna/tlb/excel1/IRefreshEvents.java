
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({0002441B-0001-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{0002441B-0001-0000-C000-000000000046}")
public interface IRefreshEvents extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x63c)</p>
     * <p>vtableId(7)</p>
     * @param Cancel [inout] {@code Boolean}
     */
    @ComMethod(name = "BeforeRefresh", dispId = 0x63c)
    com.sun.jna.platform.win32.WinNT.HRESULT BeforeRefresh(VARIANT Cancel);
            
    /**
     * <p>id(0x63d)</p>
     * <p>vtableId(8)</p>
     * @param Success [in] {@code Boolean}
     */
    @ComMethod(name = "AfterRefresh", dispId = 0x63d)
    com.sun.jna.platform.win32.WinNT.HRESULT AfterRefresh(Boolean Success);
            
    
}