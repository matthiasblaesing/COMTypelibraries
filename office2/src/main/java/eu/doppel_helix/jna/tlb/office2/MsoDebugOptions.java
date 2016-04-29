
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000C035A-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000C035A-0000-0000-C000-000000000046}")
public interface MsoDebugOptions {
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
     * <p>id(0x4)</p>
     */
    @ComProperty(name = "FeatureReports", dispId = 0x4)
    Integer getFeatureReports();
            
    /**
     * <p>id(0x4)</p>
     */
    @ComProperty(name = "FeatureReports", dispId = 0x4)
    void setFeatureReports(Integer param0);
            
    /**
     * <p>id(0x5)</p>
     */
    @ComProperty(name = "OutputToDebugger", dispId = 0x5)
    Boolean getOutputToDebugger();
            
    /**
     * <p>id(0x5)</p>
     */
    @ComProperty(name = "OutputToDebugger", dispId = 0x5)
    void setOutputToDebugger(Boolean param0);
            
    /**
     * <p>id(0x6)</p>
     */
    @ComProperty(name = "OutputToFile", dispId = 0x6)
    Boolean getOutputToFile();
            
    /**
     * <p>id(0x6)</p>
     */
    @ComProperty(name = "OutputToFile", dispId = 0x6)
    void setOutputToFile(Boolean param0);
            
    /**
     * <p>id(0x7)</p>
     */
    @ComProperty(name = "OutputToMessageBox", dispId = 0x7)
    Boolean getOutputToMessageBox();
            
    /**
     * <p>id(0x7)</p>
     */
    @ComProperty(name = "OutputToMessageBox", dispId = 0x7)
    void setOutputToMessageBox(Boolean param0);
            
    /**
     * <p>id(0x8)</p>
     */
    @ComProperty(name = "UnitTestManager", dispId = 0x8)
    com.sun.jna.platform.win32.COM.util.IUnknown getUnitTestManager();
            
    /**
     * <p>id(0x9)</p>
     */
    @ComMethod(name = "AddIgnoredAssertTag", dispId = 0x9)
    void AddIgnoredAssertTag(String bstrTagToIgnore);
            
    /**
     * <p>id(0xa)</p>
     */
    @ComMethod(name = "RemoveIgnoredAssertTag", dispId = 0xa)
    void RemoveIgnoredAssertTag(String bstrTagToIgnore);
            
    
}