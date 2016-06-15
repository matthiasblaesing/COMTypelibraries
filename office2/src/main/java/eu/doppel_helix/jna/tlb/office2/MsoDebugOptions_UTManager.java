
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000C0389-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000C0389-0000-0000-C000-000000000046}")
public interface MsoDebugOptions_UTManager extends IUnknown, IRawDispatchHandle, IDispatch {
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
    @ComProperty(name = "UnitTests", dispId = 0x0)
    MsoDebugOptions_UTs getUnitTests();
            
    /**
     * <p>id(0x1)</p>
     */
    @ComMethod(name = "NotifyStartOfTestSuiteRun", dispId = 0x1)
    void NotifyStartOfTestSuiteRun();
            
    /**
     * <p>id(0x2)</p>
     */
    @ComMethod(name = "NotifyEndOfTestSuiteRun", dispId = 0x2)
    void NotifyEndOfTestSuiteRun();
            
    /**
     * <p>id(0x3)</p>
     */
    @ComProperty(name = "ReportErrors", dispId = 0x3)
    Boolean getReportErrors();
            
    /**
     * <p>id(0x3)</p>
     */
    @ComProperty(name = "ReportErrors", dispId = 0x3)
    void setReportErrors(Boolean param0);
            
    
}