
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.AbstractComEventCallbackListener;
import com.sun.jna.platform.win32.COM.util.annotation.ComEventCallback;
import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000209F7-0000-0000-C000-000000000046})</p>
 */
public abstract class ApplicationEventsListenerHandler extends AbstractComEventCallbackListener implements ApplicationEventsListener {
    @Override
    public void errorReceivingCallbackEvent(java.lang.String string, java.lang.Exception excptn) {
    }

    /**
     * <p>id(0x1)</p>
     */
    @Override
    public void Startup(){
    }
            
    /**
     * <p>id(0x2)</p>
     */
    @Override
    public void Quit(){
    }
            
    /**
     * <p>id(0x3)</p>
     */
    @Override
    public void DocumentChange(){
    }
            
    
}