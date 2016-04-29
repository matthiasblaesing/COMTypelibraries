
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000C038C-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000C038C-0000-0000-C000-000000000046}")
public interface MsoDebugOptions_UTRunResult {
    /**
     * <p>id(0x60020000)</p>
     */
    @ComProperty(name = "Application", dispId = 0x60020000)
    com.sun.jna.platform.win32.COM.util.IDispatch getApplication();
            
    /**
     * <p>id(0x60020001)</p>
     */
    @ComProperty(name = "Creator", dispId = 0x60020001)
    Integer getCreator();
            
    /**
     * <p>id(0x0)</p>
     */
    @ComProperty(name = "Passed", dispId = 0x0)
    Boolean getPassed();
            
    /**
     * <p>id(0x1)</p>
     */
    @ComProperty(name = "ErrorString", dispId = 0x1)
    String getErrorString();
            
    
}