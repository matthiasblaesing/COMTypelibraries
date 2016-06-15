
package eu.doppel_helix.jna.tlb.vbide5;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({CDDE3804-2064-11CF-867F-00AA005FF34A})</p>
 */
@ComInterface(iid="{CDDE3804-2064-11CF-867F-00AA005FF34A}")
public interface _dispReferences_Events extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x0)</p>
     */
    @ComMethod(name = "ItemAdded", dispId = 0x0)
    void ItemAdded(Reference Reference);
            
    /**
     * <p>id(0x1)</p>
     */
    @ComMethod(name = "ItemRemoved", dispId = 0x1)
    void ItemRemoved(Reference Reference);
            
    
}