
package eu.doppel_helix.jna.tlb.vbide5;

import com.sun.jna.platform.win32.COM.util.AbstractComEventCallbackListener;
import com.sun.jna.platform.win32.COM.util.annotation.ComEventCallback;
import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({0002E131-0000-0000-C000-000000000046})</p>
 */
public abstract class _dispCommandBarControlEventsListenerHandler extends AbstractComEventCallbackListener implements _dispCommandBarControlEventsListener {
    @Override
    public void errorReceivingCallbackEvent(java.lang.String string, java.lang.Exception excptn) {
    }

    /**
     * <p>id(0x1)</p>
     */
    @Override
    public void Click(com.sun.jna.platform.win32.COM.util.IDispatch CommandBarControl,
            Boolean handled,
            Boolean CancelDefault){
    }
            
    
}