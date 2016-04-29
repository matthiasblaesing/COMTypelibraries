
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComEventCallback;
import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00024410-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{00024410-0000-0000-C000-000000000046}")
public interface OLEObjectEventsListener {
    /**
     * <p>id(0x605)</p>
     */
    @ComEventCallback(dispid = 0x605)
    void GotFocus();
            
    /**
     * <p>id(0x606)</p>
     */
    @ComEventCallback(dispid = 0x606)
    void LostFocus();
            
    
}