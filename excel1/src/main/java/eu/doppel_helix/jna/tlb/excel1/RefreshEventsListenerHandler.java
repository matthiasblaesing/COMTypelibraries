
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.AbstractComEventCallbackListener;
import com.sun.jna.platform.win32.COM.util.annotation.ComEventCallback;
import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({0002441B-0000-0000-C000-000000000046})</p>
 */
public abstract class RefreshEventsListenerHandler extends AbstractComEventCallbackListener implements RefreshEventsListener {
    @Override
    public void errorReceivingCallbackEvent(String string, Exception excptn) {
    }

    /**
     * <p>id(0x63c)</p>
     */
    @Override
    public void BeforeRefresh(VARIANT Cancel){
    }
            
    /**
     * <p>id(0x63d)</p>
     */
    @Override
    public void AfterRefresh(Boolean Success){
    }
            
    
}