
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.util.annotation.ComEventCallback;
import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000630F8-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000630F8-0000-0000-C000-000000000046}")
public interface StoresEvents_12Listener {
    /**
     * <p>id(0xfbb1)</p>
     */
    @ComEventCallback(dispid = 0xfbb1)
    void BeforeStoreRemove(_Store Store,
            VARIANT Cancel);
            
    /**
     * <p>id(0xf001)</p>
     */
    @ComEventCallback(dispid = 0xf001)
    void StoreAdd(_Store Store);
            
    
}