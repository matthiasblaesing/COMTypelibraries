
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000244DF-0001-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000244DF-0001-0000-C000-000000000046}")
public interface ITimelineState {
    /**
     * <p>id(0x94)</p>
     */
    @ComProperty(name = "Application", dispId = 0x94)
    com.sun.jna.platform.win32.WinNT.HRESULT getApplication(VARIANT RHS);
            
    /**
     * <p>id(0x95)</p>
     */
    @ComProperty(name = "Creator", dispId = 0x95)
    com.sun.jna.platform.win32.WinNT.HRESULT getCreator(VARIANT RHS);
            
    /**
     * <p>id(0x96)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x96)
    com.sun.jna.platform.win32.WinNT.HRESULT getParent(VARIANT RHS);
            
    /**
     * <p>id(0xc3d)</p>
     */
    @ComProperty(name = "StartDate", dispId = 0xc3d)
    com.sun.jna.platform.win32.WinNT.HRESULT getStartDate(VARIANT RHS);
            
    /**
     * <p>id(0xc3e)</p>
     */
    @ComProperty(name = "EndDate", dispId = 0xc3e)
    com.sun.jna.platform.win32.WinNT.HRESULT getEndDate(VARIANT RHS);
            
    /**
     * <p>id(0xa7e)</p>
     */
    @ComProperty(name = "FilterType", dispId = 0xa7e)
    com.sun.jna.platform.win32.WinNT.HRESULT getFilterType(VARIANT RHS);
            
    /**
     * <p>id(0xc3f)</p>
     */
    @ComProperty(name = "FilterValue1", dispId = 0xc3f)
    com.sun.jna.platform.win32.WinNT.HRESULT getFilterValue1(VARIANT RHS);
            
    /**
     * <p>id(0xc40)</p>
     */
    @ComProperty(name = "FilterValue2", dispId = 0xc40)
    com.sun.jna.platform.win32.WinNT.HRESULT getFilterValue2(VARIANT RHS);
            
    /**
     * <p>id(0xc41)</p>
     */
    @ComProperty(name = "SingleRangeFilterState", dispId = 0xc41)
    com.sun.jna.platform.win32.WinNT.HRESULT getSingleRangeFilterState(VARIANT RHS);
            
    /**
     * <p>id(0xc42)</p>
     */
    @ComMethod(name = "SetFilterDateRange", dispId = 0xc42)
    com.sun.jna.platform.win32.WinNT.HRESULT SetFilterDateRange(Object StartDate,
            Object EndDate,
            VARIANT RHS);
            
    
}