
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.util.AbstractComEventCallbackListener;
import com.sun.jna.platform.win32.COM.util.annotation.ComEventCallback;
import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00063085-0000-0000-C000-000000000046})</p>
 */
public abstract class SyncObjectEventsHandler extends AbstractComEventCallbackListener implements SyncObjectEvents {
    @Override
    public void errorReceivingCallbackEvent(java.lang.String string, java.lang.Exception excptn) {
    }

    /**
     * <p>id(0xf001)</p>
     */
    @Override
    public void SyncStart(){
    }
            
    /**
     * <p>id(0xf002)</p>
     */
    @Override
    public void Progress(OlSyncState State,
            String Description,
            Integer Value,
            Integer Max){
    }
            
    /**
     * <p>id(0xf003)</p>
     */
    @Override
    public void OnError(Integer Code,
            String Description){
    }
            
    /**
     * <p>id(0xf004)</p>
     */
    @Override
    public void SyncEnd(){
    }
            
    
}