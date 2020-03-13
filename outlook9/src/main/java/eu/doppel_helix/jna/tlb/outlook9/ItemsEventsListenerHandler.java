
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.util.AbstractComEventCallbackListener;
import com.sun.jna.platform.win32.COM.util.annotation.ComEventCallback;
import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00063077-0000-0000-C000-000000000046})</p>
 */
public abstract class ItemsEventsListenerHandler extends AbstractComEventCallbackListener implements ItemsEventsListener {
    @Override
    public void errorReceivingCallbackEvent(java.lang.String string, java.lang.Exception excptn) {
    }

    /**
     * <p>id(0xf001)</p>
     */
    @Override
    public void ItemAdd(com.sun.jna.platform.win32.COM.util.IDispatch Item){
    }
            
    /**
     * <p>id(0xf002)</p>
     */
    @Override
    public void ItemChange(com.sun.jna.platform.win32.COM.util.IDispatch Item){
    }
            
    /**
     * <p>id(0xf003)</p>
     */
    @Override
    public void ItemRemove(){
    }
            
    
}