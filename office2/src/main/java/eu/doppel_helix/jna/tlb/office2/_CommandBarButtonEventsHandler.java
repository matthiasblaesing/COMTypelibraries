
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.AbstractComEventCallbackListener;
import com.sun.jna.platform.win32.COM.util.annotation.ComEventCallback;
import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000C0351-0000-0000-C000-000000000046})</p>
 */
public abstract class _CommandBarButtonEventsHandler extends AbstractComEventCallbackListener implements _CommandBarButtonEvents {
    @Override
    public void errorReceivingCallbackEvent(java.lang.String string, java.lang.Exception excptn) {
    }

    /**
     * <p>id(0x1)</p>
     */
    @Override
    public void Click(CommandBarButton Ctrl,
            VARIANT CancelDefault){
    }
            
    
}