
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00063085-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{00063085-0000-0000-C000-000000000046}")
public interface SyncObjectEvents {
    /**
     * <p>id(0xf001)</p>
     */
    @ComMethod(name = "SyncStart", dispId = 0xf001)
    void SyncStart();
            
    /**
     * <p>id(0xf002)</p>
     */
    @ComMethod(name = "Progress", dispId = 0xf002)
    void Progress(OlSyncState State,
            String Description,
            Integer Value,
            Integer Max);
            
    /**
     * <p>id(0xf003)</p>
     */
    @ComMethod(name = "OnError", dispId = 0xf003)
    void OnError(Integer Code,
            String Description);
            
    /**
     * <p>id(0xf004)</p>
     */
    @ComMethod(name = "SyncEnd", dispId = 0xf004)
    void SyncEnd();
            
    
}