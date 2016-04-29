
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.util.AbstractComEventCallbackListener;
import com.sun.jna.platform.win32.COM.util.annotation.ComEventCallback;
import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({0006307C-0000-0000-C000-000000000046})</p>
 */
public abstract class OutlookBarShortcutsEventsListenerHandler extends AbstractComEventCallbackListener implements OutlookBarShortcutsEventsListener {
    @Override
    public void errorReceivingCallbackEvent(java.lang.String string, java.lang.Exception excptn) {
    }

    /**
     * <p>id(0xf001)</p>
     */
    @Override
    public void ShortcutAdd(OutlookBarShortcut NewShortcut){
    }
            
    /**
     * <p>id(0xf002)</p>
     */
    @Override
    public void BeforeShortcutAdd(VARIANT Cancel){
    }
            
    /**
     * <p>id(0xf003)</p>
     */
    @Override
    public void BeforeShortcutRemove(OutlookBarShortcut Shortcut,
            VARIANT Cancel){
    }
            
    
}