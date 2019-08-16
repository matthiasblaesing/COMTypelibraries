
package eu.doppel_helix.jna.tlb.stdole2;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * Event interface for the Font object
 *
 * <p>uuid({4EF6100A-AF88-11D0-9846-00C04FC29993})</p>
 */
@ComInterface(iid="{4EF6100A-AF88-11D0-9846-00C04FC29993}")
public interface IFontEventsDisp extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x9)</p>
     * @param PropertyName [in] {@code String}
     */
    @ComMethod(name = "FontChanged", dispId = 0x9)
    void FontChanged(String PropertyName);
            
    
}