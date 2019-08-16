
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.util.AbstractComEventCallbackListener;
import com.sun.jna.platform.win32.COM.util.annotation.ComEventCallback;
import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000630A5-0000-0000-C000-000000000046})</p>
 */
public abstract class _ViewsEventsHandler extends AbstractComEventCallbackListener implements _ViewsEvents {
    @Override
    public void errorReceivingCallbackEvent(java.lang.String string, java.lang.Exception excptn) {
    }

    /**
     * <p>id(0x190)</p>
     */
    @Override
    public void ViewAdd(View View){
    }
            
    /**
     * <p>id(0xfa47)</p>
     */
    @Override
    public void ViewRemove(View View){
    }
            
    
}