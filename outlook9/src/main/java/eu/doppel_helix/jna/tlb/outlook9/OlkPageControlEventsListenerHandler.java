
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.util.AbstractComEventCallbackListener;
import com.sun.jna.platform.win32.COM.util.annotation.ComEventCallback;
import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000672F9-0000-0000-C000-000000000046})</p>
 */
public abstract class OlkPageControlEventsListenerHandler extends AbstractComEventCallbackListener implements OlkPageControlEventsListener {
    @Override
    public void errorReceivingCallbackEvent(java.lang.String string, java.lang.Exception excptn) {
    }

    
}