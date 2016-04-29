
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000C172F-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000C172F-0000-0000-C000-000000000046}")
public interface IMsoChartData {
    /**
     * <p>id(0x60020000)</p>
     */
    @ComProperty(name = "Workbook", dispId = 0x60020000)
    com.sun.jna.platform.win32.COM.util.IDispatch getWorkbook();
            
    /**
     * <p>id(0x60020001)</p>
     */
    @ComMethod(name = "Activate", dispId = 0x60020001)
    void Activate();
            
    /**
     * <p>id(0x60020002)</p>
     */
    @ComProperty(name = "IsLinked", dispId = 0x60020002)
    Boolean getIsLinked();
            
    /**
     * <p>id(0x60020003)</p>
     */
    @ComMethod(name = "BreakLink", dispId = 0x60020003)
    void BreakLink();
            
    /**
     * <p>id(0x60020004)</p>
     */
    @ComMethod(name = "ActivateChartDataWindow", dispId = 0x60020004)
    void ActivateChartDataWindow();
            
    
}