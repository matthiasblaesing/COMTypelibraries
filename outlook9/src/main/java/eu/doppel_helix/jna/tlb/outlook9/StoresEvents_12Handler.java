
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.util.AbstractComEventCallbackListener;
import com.sun.jna.platform.win32.COM.util.annotation.ComEventCallback;
import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000630F8-0000-0000-C000-000000000046})</p>
 */
public abstract class StoresEvents_12Handler extends AbstractComEventCallbackListener implements StoresEvents_12 {
    @Override
    public void errorReceivingCallbackEvent(java.lang.String string, java.lang.Exception excptn) {
    }

    /**
     * <p>id(0xfbb1)</p>
     */
    @Override
    public void BeforeStoreRemove(_Store Store,
            VARIANT Cancel){
    }
            
    /**
     * <p>id(0xf001)</p>
     */
    @Override
    public void StoreAdd(_Store Store){
    }
            
    
}