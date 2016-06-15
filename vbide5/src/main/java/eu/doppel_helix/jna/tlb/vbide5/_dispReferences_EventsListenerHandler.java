
package eu.doppel_helix.jna.tlb.vbide5;

import com.sun.jna.platform.win32.COM.util.AbstractComEventCallbackListener;
import com.sun.jna.platform.win32.COM.util.annotation.ComEventCallback;
import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({CDDE3804-2064-11CF-867F-00AA005FF34A})</p>
 */
public abstract class _dispReferences_EventsListenerHandler extends AbstractComEventCallbackListener implements _dispReferences_EventsListener {
    @Override
    public void errorReceivingCallbackEvent(java.lang.String string, java.lang.Exception excptn) {
    }

    /**
     * <p>id(0x0)</p>
     */
    @Override
    public void ItemAdded(Reference Reference){
    }
            
    /**
     * <p>id(0x1)</p>
     */
    @Override
    public void ItemRemoved(Reference Reference){
    }
            
    
}