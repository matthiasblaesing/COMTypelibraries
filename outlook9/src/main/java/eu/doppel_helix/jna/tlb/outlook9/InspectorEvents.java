
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({0006307D-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{0006307D-0000-0000-C000-000000000046}")
public interface InspectorEvents {
    /**
     * <p>id(0xf001)</p>
     */
    @ComMethod(name = "Activate", dispId = 0xf001)
    void Activate();
            
    /**
     * <p>id(0xf006)</p>
     */
    @ComMethod(name = "Deactivate", dispId = 0xf006)
    void Deactivate();
            
    /**
     * <p>id(0xf008)</p>
     */
    @ComMethod(name = "Close", dispId = 0xf008)
    void Close();
            
    
}