
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000630A5-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000630A5-0000-0000-C000-000000000046}")
public interface _ViewsEvents {
    /**
     * <p>id(0x190)</p>
     */
    @ComMethod(name = "ViewAdd", dispId = 0x190)
    void ViewAdd(View View);
            
    /**
     * <p>id(0xfa47)</p>
     */
    @ComMethod(name = "ViewRemove", dispId = 0xfa47)
    void ViewRemove(View View);
            
    
}