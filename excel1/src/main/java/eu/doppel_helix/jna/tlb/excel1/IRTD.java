
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({0002446E-0001-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{0002446E-0001-0000-C000-000000000046}")
public interface IRTD extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x8c0)</p>
     */
    @ComProperty(name = "ThrottleInterval", dispId = 0x8c0)
    com.sun.jna.platform.win32.WinNT.HRESULT getThrottleInterval(VARIANT RHS);
            
    /**
     * <p>id(0x8c0)</p>
     */
    @ComProperty(name = "ThrottleInterval", dispId = 0x8c0)
    com.sun.jna.platform.win32.WinNT.HRESULT setThrottleInterval(Integer RHS);
            
    /**
     * <p>id(0x8c1)</p>
     */
    @ComMethod(name = "RefreshData", dispId = 0x8c1)
    com.sun.jna.platform.win32.WinNT.HRESULT RefreshData();
            
    /**
     * <p>id(0x8c2)</p>
     */
    @ComMethod(name = "RestartServers", dispId = 0x8c2)
    com.sun.jna.platform.win32.WinNT.HRESULT RestartServers();
            
    
}