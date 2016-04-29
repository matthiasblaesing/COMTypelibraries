
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.AbstractComEventCallbackListener;
import com.sun.jna.platform.win32.COM.util.annotation.ComEventCallback;
import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00024410-0000-0000-C000-000000000046})</p>
 */
public abstract class OLEObjectEventsListenerHandler extends AbstractComEventCallbackListener implements OLEObjectEventsListener {
    @Override
    public void errorReceivingCallbackEvent(String string, Exception excptn) {
    }

    /**
     * <p>id(0x605)</p>
     */
    @Override
    public void GotFocus(){
    }
            
    /**
     * <p>id(0x606)</p>
     */
    @Override
    public void LostFocus(){
    }
            
    
}