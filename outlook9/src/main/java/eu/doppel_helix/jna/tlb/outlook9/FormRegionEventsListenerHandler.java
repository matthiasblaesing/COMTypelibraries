
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.util.AbstractComEventCallbackListener;
import com.sun.jna.platform.win32.COM.util.annotation.ComEventCallback;
import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({0006305B-0000-0000-C000-000000000046})</p>
 */
public abstract class FormRegionEventsListenerHandler extends AbstractComEventCallbackListener implements FormRegionEventsListener {
    @Override
    public void errorReceivingCallbackEvent(java.lang.String string, java.lang.Exception excptn) {
    }

    /**
     * <p>id(0xfb38)</p>
     */
    @Override
    public void Expanded(Boolean Expand){
    }
            
    /**
     * <p>id(0xf004)</p>
     */
    @Override
    public void Close(){
    }
            
    
}