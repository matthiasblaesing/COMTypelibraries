
package eu.doppel_helix.jna.tlb.shdocvw1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * Event interface for IShellWindows
 *
 * <p>uuid({FE4106E0-399A-11D0-A48C-00A0C90A8F39})</p>
 */
@ComInterface(iid="{FE4106E0-399A-11D0-A48C-00A0C90A8F39}")
public interface DShellWindowsEvents {
    /**
     * A new window was registered.
     *
     * <p>id(0xc8)</p>
     */
    @ComMethod(name = "WindowRegistered", dispId = 0xc8)
    void WindowRegistered(Integer lCookie);
            
    /**
     * A new window was revoked.
     *
     * <p>id(0xc9)</p>
     */
    @ComMethod(name = "WindowRevoked", dispId = 0xc9)
    void WindowRevoked(Integer lCookie);
            
    
}