
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.util.AbstractComEventCallbackListener;
import com.sun.jna.platform.win32.COM.util.annotation.ComEventCallback;
import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000672F7-0000-0000-C000-000000000046})</p>
 */
public abstract class OlkInfoBarEventsListenerHandler extends AbstractComEventCallbackListener implements OlkInfoBarEventsListener {
    @Override
    public void errorReceivingCallbackEvent(java.lang.String string, java.lang.Exception excptn) {
    }

    /**
     * <p>id(0xfffffda8)</p>
     */
    @Override
    public void Click(){
    }
            
    /**
     * <p>id(0xfffffda7)</p>
     */
    @Override
    public void DoubleClick(){
    }
            
    /**
     * <p>id(0xfffffda3)</p>
     */
    @Override
    public void MouseDown(OlMouseButton Button,
            OlShiftState Shift,
            Float X,
            Float Y){
    }
            
    /**
     * <p>id(0xfffffda2)</p>
     */
    @Override
    public void MouseMove(OlMouseButton Button,
            OlShiftState Shift,
            Float X,
            Float Y){
    }
            
    /**
     * <p>id(0xfffffda1)</p>
     */
    @Override
    public void MouseUp(OlMouseButton Button,
            OlShiftState Shift,
            Float X,
            Float Y){
    }
            
    
}