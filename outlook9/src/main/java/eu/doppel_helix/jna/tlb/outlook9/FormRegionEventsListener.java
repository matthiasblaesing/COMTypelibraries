
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({0006305B-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{0006305B-0000-0000-C000-000000000046}")
public interface FormRegionEventsListener {
    /**
     * <p>id(0xfb38)</p>
     */
    @ComMethod(name = "Expanded", dispId = 0xfb38)
    void Expanded(Boolean Expand);
            
    /**
     * <p>id(0xf004)</p>
     */
    @ComMethod(name = "Close", dispId = 0xf004)
    void Close();
            
    
}