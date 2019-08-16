
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000244DF-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000244DF-0000-0000-C000-000000000046}")
public interface TimelineState extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x94)</p>
     * <p>vtableId(7)</p>
     */
    @ComProperty(name = "Application", dispId = 0x94)
    Application getApplication();
            
    /**
     * <p>id(0x95)</p>
     * <p>vtableId(8)</p>
     */
    @ComProperty(name = "Creator", dispId = 0x95)
    XlCreator getCreator();
            
    /**
     * <p>id(0x96)</p>
     * <p>vtableId(9)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x96)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * <p>id(0xc3d)</p>
     * <p>vtableId(10)</p>
     */
    @ComProperty(name = "StartDate", dispId = 0xc3d)
    Object getStartDate();
            
    /**
     * <p>id(0xc3e)</p>
     * <p>vtableId(11)</p>
     */
    @ComProperty(name = "EndDate", dispId = 0xc3e)
    Object getEndDate();
            
    /**
     * <p>id(0xa7e)</p>
     * <p>vtableId(12)</p>
     */
    @ComProperty(name = "FilterType", dispId = 0xa7e)
    XlPivotFilterType getFilterType();
            
    /**
     * <p>id(0xc3f)</p>
     * <p>vtableId(13)</p>
     */
    @ComProperty(name = "FilterValue1", dispId = 0xc3f)
    Object getFilterValue1();
            
    /**
     * <p>id(0xc40)</p>
     * <p>vtableId(14)</p>
     */
    @ComProperty(name = "FilterValue2", dispId = 0xc40)
    Object getFilterValue2();
            
    /**
     * <p>id(0xc41)</p>
     * <p>vtableId(15)</p>
     */
    @ComProperty(name = "SingleRangeFilterState", dispId = 0xc41)
    Boolean getSingleRangeFilterState();
            
    /**
     * <p>id(0xc42)</p>
     * <p>vtableId(16)</p>
     * @param StartDate [in] {@code Object}
     * @param EndDate [in] {@code Object}
     */
    @ComMethod(name = "SetFilterDateRange", dispId = 0xc42)
    XlFilterStatus SetFilterDateRange(Object StartDate,
            Object EndDate);
            
    
}