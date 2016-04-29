
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.util.AbstractComEventCallbackListener;
import com.sun.jna.platform.win32.COM.util.annotation.ComEventCallback;
import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({0006308C-0000-0000-C000-000000000046})</p>
 */
public abstract class NameSpaceEventsListenerHandler extends AbstractComEventCallbackListener implements NameSpaceEventsListener {
    @Override
    public void errorReceivingCallbackEvent(java.lang.String string, java.lang.Exception excptn) {
    }

    /**
     * <p>id(0xf005)</p>
     */
    @Override
    public void OptionsPagesAdd(PropertyPages Pages,
            MAPIFolder Folder){
    }
            
    /**
     * <p>id(0xfc2d)</p>
     */
    @Override
    public void AutoDiscoverComplete(){
    }
            
    
}