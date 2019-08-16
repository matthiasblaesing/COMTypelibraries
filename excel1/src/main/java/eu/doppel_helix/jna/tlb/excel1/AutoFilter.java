
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00024432-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{00024432-0000-0000-C000-000000000046}")
public interface AutoFilter extends IUnknown, IRawDispatchHandle, IDispatch {
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
     * <p>id(0xc5)</p>
     * <p>vtableId(10)</p>
     */
    @ComProperty(name = "Range", dispId = 0xc5)
    Range getRange();
            
    /**
     * <p>id(0x651)</p>
     * <p>vtableId(11)</p>
     */
    @ComProperty(name = "Filters", dispId = 0x651)
    Filters getFilters();
            
    /**
     * <p>id(0x320)</p>
     * <p>vtableId(12)</p>
     */
    @ComProperty(name = "FilterMode", dispId = 0x320)
    Boolean getFilterMode();
            
    /**
     * <p>id(0x370)</p>
     * <p>vtableId(13)</p>
     */
    @ComProperty(name = "Sort", dispId = 0x370)
    Sort getSort();
            
    /**
     * <p>id(0xa50)</p>
     * <p>vtableId(14)</p>
     */
    @ComMethod(name = "ApplyFilter", dispId = 0xa50)
    void ApplyFilter();
            
    /**
     * <p>id(0x31a)</p>
     * <p>vtableId(15)</p>
     */
    @ComMethod(name = "ShowAllData", dispId = 0x31a)
    void ShowAllData();
            
    
}