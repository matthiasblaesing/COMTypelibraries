
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.AbstractComEventCallbackListener;
import com.sun.jna.platform.win32.COM.util.annotation.ComEventCallback;
import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000209F3-0000-0000-C000-000000000046})</p>
 */
public abstract class OCXEventsListenerHandler extends AbstractComEventCallbackListener implements OCXEventsListener {
    @Override
    public void errorReceivingCallbackEvent(java.lang.String string, java.lang.Exception excptn) {
    }

    /**
     * <p>id(0x800100e0)</p>
     */
    @Override
    public void GotFocus(){
    }
            
    /**
     * <p>id(0x800100e1)</p>
     */
    @Override
    public void LostFocus(){
    }
            
    
}