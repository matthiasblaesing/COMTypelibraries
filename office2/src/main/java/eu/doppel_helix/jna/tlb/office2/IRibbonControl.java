
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000C0395-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000C0395-0000-0000-C000-000000000046}")
public interface IRibbonControl {
    /**
     * <p>id(0x1)</p>
     */
    @ComProperty(name = "Id", dispId = 0x1)
    String getId();
            
    /**
     * <p>id(0x2)</p>
     */
    @ComProperty(name = "Context", dispId = 0x2)
    com.sun.jna.platform.win32.COM.util.IDispatch getContext();
            
    /**
     * <p>id(0x3)</p>
     */
    @ComProperty(name = "Tag", dispId = 0x3)
    String getTag();
            
    
}