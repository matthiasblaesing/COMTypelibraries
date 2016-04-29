
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.util.annotation.ComEventCallback;
import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({0006300D-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{0006300D-0000-0000-C000-000000000046}")
public interface ResultsEventsListener {
    /**
     * <p>id(0xf001)</p>
     */
    @ComEventCallback(dispid = 0xf001)
    void ItemAdd(com.sun.jna.platform.win32.COM.util.IDispatch Item);
            
    /**
     * <p>id(0xf002)</p>
     */
    @ComEventCallback(dispid = 0xf002)
    void ItemChange(com.sun.jna.platform.win32.COM.util.IDispatch Item);
            
    /**
     * <p>id(0xf003)</p>
     */
    @ComEventCallback(dispid = 0xf003)
    void ItemRemove();
            
    
}