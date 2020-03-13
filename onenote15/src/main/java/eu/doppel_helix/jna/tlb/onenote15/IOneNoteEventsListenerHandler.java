
package eu.doppel_helix.jna.tlb.onenote15;

import com.sun.jna.platform.win32.COM.util.AbstractComEventCallbackListener;
import com.sun.jna.platform.win32.COM.util.annotation.ComEventCallback;
import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * IOneNoteEvents Interface
 *
 * <p>uuid({E2E1511D-502D-4BD0-8B3A-8A89A05CDCAE})</p>
 */
public abstract class IOneNoteEventsListenerHandler extends AbstractComEventCallbackListener implements IOneNoteEventsListener {
    @Override
    public void errorReceivingCallbackEvent(java.lang.String string, java.lang.Exception excptn) {
    }

    /**
     * <p>id(0x1)</p>
     */
    @Override
    public void OnNavigate(){
    }
            
    /**
     * <p>id(0x2)</p>
     */
    @Override
    public void OnHierarchyChange(String bstrActivePageID){
    }
            
    
}