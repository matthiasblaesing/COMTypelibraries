
package eu.doppel_helix.jna.tlb.vbide5;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({0002E167-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{0002E167-0000-0000-C000-000000000046}")
public interface Events {
    /**
     * <p>id(0xca)</p>
     */
    @ComProperty(name = "ReferencesEvents", dispId = 0xca)
    ReferencesEvents getReferencesEvents(VBProject VBProject);
            
    /**
     * <p>id(0xcd)</p>
     */
    @ComProperty(name = "CommandBarEvents", dispId = 0xcd)
    CommandBarEvents getCommandBarEvents(com.sun.jna.platform.win32.COM.util.IDispatch CommandBarControl);
            
    
}