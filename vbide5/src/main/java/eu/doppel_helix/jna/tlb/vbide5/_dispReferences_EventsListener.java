
package eu.doppel_helix.jna.tlb.vbide5;

import com.sun.jna.platform.win32.COM.util.annotation.ComEventCallback;
import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({CDDE3804-2064-11CF-867F-00AA005FF34A})</p>
 */
@ComInterface(iid="{CDDE3804-2064-11CF-867F-00AA005FF34A}")
public interface _dispReferences_EventsListener {
    /**
     * <p>id(0x0)</p>
     */
    @ComEventCallback(dispid = 0x0)
    void ItemAdded(Reference Reference);
            
    /**
     * <p>id(0x1)</p>
     */
    @ComEventCallback(dispid = 0x1)
    void ItemRemoved(Reference Reference);
            
    
}