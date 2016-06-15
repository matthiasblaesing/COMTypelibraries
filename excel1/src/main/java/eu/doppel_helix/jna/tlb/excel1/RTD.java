
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({0002446E-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{0002446E-0000-0000-C000-000000000046}")
public interface RTD extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x8c0)</p>
     */
    @ComProperty(name = "ThrottleInterval", dispId = 0x8c0)
    Integer getThrottleInterval();
            
    /**
     * <p>id(0x8c0)</p>
     */
    @ComProperty(name = "ThrottleInterval", dispId = 0x8c0)
    void setThrottleInterval(Integer param0);
            
    /**
     * <p>id(0x8c1)</p>
     */
    @ComMethod(name = "RefreshData", dispId = 0x8c1)
    void RefreshData();
            
    /**
     * <p>id(0x8c2)</p>
     */
    @ComMethod(name = "RestartServers", dispId = 0x8c2)
    void RestartServers();
            
    
}