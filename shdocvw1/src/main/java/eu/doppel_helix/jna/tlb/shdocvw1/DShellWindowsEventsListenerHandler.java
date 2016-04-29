
package eu.doppel_helix.jna.tlb.shdocvw1;

import com.sun.jna.platform.win32.COM.util.AbstractComEventCallbackListener;
import com.sun.jna.platform.win32.COM.util.annotation.ComEventCallback;
import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * Event interface for IShellWindows
 *
 * <p>uuid({FE4106E0-399A-11D0-A48C-00A0C90A8F39})</p>
 */
public abstract class DShellWindowsEventsListenerHandler extends AbstractComEventCallbackListener implements DShellWindowsEventsListener {
    @Override
    public void errorReceivingCallbackEvent(String string, Exception excptn) {
    }

    /**
     * A new window was registered.
     *
     * <p>id(0xc8)</p>
     */
    @Override
    public void WindowRegistered(Integer lCookie){
    }
            
    /**
     * A new window was revoked.
     *
     * <p>id(0xc9)</p>
     */
    @Override
    public void WindowRevoked(Integer lCookie){
    }
            
    
}