
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.util.annotation.ComEventCallback;
import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000630F3-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000630F3-0000-0000-C000-000000000046}")
public interface NavigationPaneEvents_12Listener {
    /**
     * <p>id(0xfbc9)</p>
     */
    @ComEventCallback(dispid = 0xfbc9)
    void ModuleSwitch(NavigationModule CurrentModule);
            
    
}