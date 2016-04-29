
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.util.annotation.ComEventCallback;
import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({0006308C-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{0006308C-0000-0000-C000-000000000046}")
public interface NameSpaceEventsListener {
    /**
     * <p>id(0xf005)</p>
     */
    @ComEventCallback(dispid = 0xf005)
    void OptionsPagesAdd(PropertyPages Pages,
            MAPIFolder Folder);
            
    /**
     * <p>id(0xfc2d)</p>
     */
    @ComEventCallback(dispid = 0xfc2d)
    void AutoDiscoverComplete();
            
    
}