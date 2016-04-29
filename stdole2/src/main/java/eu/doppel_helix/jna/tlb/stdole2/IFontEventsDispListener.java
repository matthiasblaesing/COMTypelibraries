
package eu.doppel_helix.jna.tlb.stdole2;

import com.sun.jna.platform.win32.COM.util.annotation.ComEventCallback;
import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * Event interface for the Font object
 *
 * <p>uuid({4EF6100A-AF88-11D0-9846-00C04FC29993})</p>
 */
@ComInterface(iid="{4EF6100A-AF88-11D0-9846-00C04FC29993}")
public interface IFontEventsDispListener {
    /**
     * <p>id(0x9)</p>
     */
    @ComEventCallback(dispid = 0x9)
    void FontChanged(String PropertyName);
            
    
}