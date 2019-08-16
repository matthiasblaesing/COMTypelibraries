
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000C0377-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000C0377-0000-0000-C000-000000000046}")
public interface SmartDocument extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x60020000)</p>
     * <p>vtableId(7)</p>
     */
    @ComProperty(name = "Application", dispId = 0x60020000)
    com.sun.jna.platform.win32.COM.util.IDispatch getApplication();
            
    /**
     * <p>id(0x60020001)</p>
     * <p>vtableId(8)</p>
     */
    @ComProperty(name = "Creator", dispId = 0x60020001)
    Integer getCreator();
            
    /**
     * <p>id(0x1)</p>
     * <p>vtableId(9)</p>
     */
    @ComProperty(name = "SolutionID", dispId = 0x1)
    String getSolutionID();
            
    /**
     * <p>id(0x1)</p>
     * <p>vtableId(10)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "SolutionID", dispId = 0x1)
    void setSolutionID(String param0);
            
    /**
     * <p>id(0x2)</p>
     * <p>vtableId(11)</p>
     */
    @ComProperty(name = "SolutionURL", dispId = 0x2)
    String getSolutionURL();
            
    /**
     * <p>id(0x2)</p>
     * <p>vtableId(12)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "SolutionURL", dispId = 0x2)
    void setSolutionURL(String param0);
            
    /**
     * <p>id(0x3)</p>
     * <p>vtableId(13)</p>
     * @param ConsiderAllSchemas [in, optional] {@code Boolean}
     */
    @ComMethod(name = "PickSolution", dispId = 0x3)
    void PickSolution(Boolean ConsiderAllSchemas);
            
    /**
     * <p>id(0x4)</p>
     * <p>vtableId(14)</p>
     */
    @ComMethod(name = "RefreshPane", dispId = 0x4)
    void RefreshPane();
            
    
}