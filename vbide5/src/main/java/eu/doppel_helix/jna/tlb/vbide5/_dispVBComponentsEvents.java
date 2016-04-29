
package eu.doppel_helix.jna.tlb.vbide5;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({0002E116-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{0002E116-0000-0000-C000-000000000046}")
public interface _dispVBComponentsEvents {
    /**
     * <p>id(0x1)</p>
     */
    @ComMethod(name = "ItemAdded", dispId = 0x1)
    void ItemAdded(VBComponent VBComponent);
            
    /**
     * <p>id(0x2)</p>
     */
    @ComMethod(name = "ItemRemoved", dispId = 0x2)
    void ItemRemoved(VBComponent VBComponent);
            
    /**
     * <p>id(0x3)</p>
     */
    @ComMethod(name = "ItemRenamed", dispId = 0x3)
    void ItemRenamed(VBComponent VBComponent,
            String OldName);
            
    /**
     * <p>id(0x4)</p>
     */
    @ComMethod(name = "ItemSelected", dispId = 0x4)
    void ItemSelected(VBComponent VBComponent);
            
    /**
     * <p>id(0x5)</p>
     */
    @ComMethod(name = "ItemActivated", dispId = 0x5)
    void ItemActivated(VBComponent VBComponent);
            
    /**
     * <p>id(0x6)</p>
     */
    @ComMethod(name = "ItemReloaded", dispId = 0x6)
    void ItemReloaded(VBComponent VBComponent);
            
    
}