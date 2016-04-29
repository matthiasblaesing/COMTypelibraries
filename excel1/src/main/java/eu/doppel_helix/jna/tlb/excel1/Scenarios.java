
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00020896-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{00020896-0000-0000-C000-000000000046}")
public interface Scenarios {
    /**
     * <p>id(0x94)</p>
     */
    @ComProperty(name = "Application", dispId = 0x94)
    Application getApplication();
            
    /**
     * <p>id(0x95)</p>
     */
    @ComProperty(name = "Creator", dispId = 0x95)
    XlCreator getCreator();
            
    /**
     * <p>id(0x96)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x96)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * <p>id(0xb5)</p>
     */
    @ComMethod(name = "Add", dispId = 0xb5)
    Scenario Add(String Name,
            Object ChangingCells,
            Object Values,
            Object Comment,
            Object Locked,
            Object Hidden);
            
    /**
     * <p>id(0x76)</p>
     */
    @ComProperty(name = "Count", dispId = 0x76)
    Integer getCount();
            
    /**
     * <p>id(0x391)</p>
     */
    @ComMethod(name = "CreateSummary", dispId = 0x391)
    Object CreateSummary(XlSummaryReportType ReportType,
            Object ResultCells);
            
    /**
     * <p>id(0xaa)</p>
     */
    @ComMethod(name = "Item", dispId = 0xaa)
    Scenario Item(Object Index);
            
    /**
     * <p>id(0x234)</p>
     */
    @ComMethod(name = "Merge", dispId = 0x234)
    Object Merge(Object Source);
            
    
}