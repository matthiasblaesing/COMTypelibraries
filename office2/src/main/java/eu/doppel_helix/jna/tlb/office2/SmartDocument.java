
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000C0377-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000C0377-0000-0000-C000-000000000046}")
public interface SmartDocument {
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
     * <p>id(0x1)</p>
     */
    @ComProperty(name = "SolutionID", dispId = 0x1)
    String getSolutionID();
            
    /**
     * <p>id(0x1)</p>
     */
    @ComProperty(name = "SolutionID", dispId = 0x1)
    void setSolutionID(String param0);
            
    /**
     * <p>id(0x2)</p>
     */
    @ComProperty(name = "SolutionURL", dispId = 0x2)
    String getSolutionURL();
            
    /**
     * <p>id(0x2)</p>
     */
    @ComProperty(name = "SolutionURL", dispId = 0x2)
    void setSolutionURL(String param0);
            
    /**
     * <p>id(0x3)</p>
     */
    @ComMethod(name = "PickSolution", dispId = 0x3)
    void PickSolution(Boolean ConsiderAllSchemas);
            
    /**
     * <p>id(0x4)</p>
     */
    @ComMethod(name = "RefreshPane", dispId = 0x4)
    void RefreshPane();
            
    
}