
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComEventCallback;
import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({0002441B-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{0002441B-0000-0000-C000-000000000046}")
public interface RefreshEventsListener {
    /**
     * <p>id(0x63c)</p>
     */
    @ComEventCallback(dispid = 0x63c)
    void BeforeRefresh(VARIANT Cancel);
            
    /**
     * <p>id(0x63d)</p>
     */
    @ComEventCallback(dispid = 0x63d)
    void AfterRefresh(Boolean Success);
            
    
}