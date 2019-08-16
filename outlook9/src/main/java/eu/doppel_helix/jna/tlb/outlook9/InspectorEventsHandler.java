
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.util.AbstractComEventCallbackListener;
import com.sun.jna.platform.win32.COM.util.annotation.ComEventCallback;
import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({0006307D-0000-0000-C000-000000000046})</p>
 */
public abstract class InspectorEventsHandler extends AbstractComEventCallbackListener implements InspectorEvents {
    @Override
    public void errorReceivingCallbackEvent(java.lang.String string, java.lang.Exception excptn) {
    }

    /**
     * <p>id(0xf001)</p>
     */
    @Override
    public void Activate(){
    }
            
    /**
     * <p>id(0xf006)</p>
     */
    @Override
    public void Deactivate(){
    }
            
    /**
     * <p>id(0xf008)</p>
     */
    @Override
    public void Close(){
    }
            
    
}