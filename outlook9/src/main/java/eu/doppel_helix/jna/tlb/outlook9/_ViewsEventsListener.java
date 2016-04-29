
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.util.annotation.ComEventCallback;
import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000630A5-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000630A5-0000-0000-C000-000000000046}")
public interface _ViewsEventsListener {
    /**
     * <p>id(0x190)</p>
     */
    @ComEventCallback(dispid = 0x190)
    void ViewAdd(View View);
            
    /**
     * <p>id(0xfa47)</p>
     */
    @ComEventCallback(dispid = 0xfa47)
    void ViewRemove(View View);
            
    
}