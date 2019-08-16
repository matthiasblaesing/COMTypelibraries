
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000244DF-0001-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000244DF-0001-0000-C000-000000000046}")
public interface ITimelineState extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x94)</p>
     * <p>vtableId(7)</p>
     * @param RHS [out] {@code Application}
     */
    @ComProperty(name = "Application", dispId = 0x94)
    com.sun.jna.platform.win32.WinNT.HRESULT getApplication(VARIANT RHS);
            
    /**
     * <p>id(0x95)</p>
     * <p>vtableId(8)</p>
     * @param RHS [out] {@code XlCreator}
     */
    @ComProperty(name = "Creator", dispId = 0x95)
    com.sun.jna.platform.win32.WinNT.HRESULT getCreator(VARIANT RHS);
            
    /**
     * <p>id(0x96)</p>
     * <p>vtableId(9)</p>
     * @param RHS [out] {@code com.sun.jna.platform.win32.COM.util.IDispatch}
     */
    @ComProperty(name = "Parent", dispId = 0x96)
    com.sun.jna.platform.win32.WinNT.HRESULT getParent(VARIANT RHS);
            
    /**
     * <p>id(0xc3d)</p>
     * <p>vtableId(10)</p>
     * @param RHS [out] {@code Object}
     */
    @ComProperty(name = "StartDate", dispId = 0xc3d)
    com.sun.jna.platform.win32.WinNT.HRESULT getStartDate(VARIANT RHS);
            
    /**
     * <p>id(0xc3e)</p>
     * <p>vtableId(11)</p>
     * @param RHS [out] {@code Object}
     */
    @ComProperty(name = "EndDate", dispId = 0xc3e)
    com.sun.jna.platform.win32.WinNT.HRESULT getEndDate(VARIANT RHS);
            
    /**
     * <p>id(0xa7e)</p>
     * <p>vtableId(12)</p>
     * @param RHS [out] {@code XlPivotFilterType}
     */
    @ComProperty(name = "FilterType", dispId = 0xa7e)
    com.sun.jna.platform.win32.WinNT.HRESULT getFilterType(VARIANT RHS);
            
    /**
     * <p>id(0xc3f)</p>
     * <p>vtableId(13)</p>
     * @param RHS [out] {@code Object}
     */
    @ComProperty(name = "FilterValue1", dispId = 0xc3f)
    com.sun.jna.platform.win32.WinNT.HRESULT getFilterValue1(VARIANT RHS);
            
    /**
     * <p>id(0xc40)</p>
     * <p>vtableId(14)</p>
     * @param RHS [out] {@code Object}
     */
    @ComProperty(name = "FilterValue2", dispId = 0xc40)
    com.sun.jna.platform.win32.WinNT.HRESULT getFilterValue2(VARIANT RHS);
            
    /**
     * <p>id(0xc41)</p>
     * <p>vtableId(15)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "SingleRangeFilterState", dispId = 0xc41)
    com.sun.jna.platform.win32.WinNT.HRESULT getSingleRangeFilterState(VARIANT RHS);
            
    /**
     * <p>id(0xc42)</p>
     * <p>vtableId(16)</p>
     * @param StartDate [in] {@code Object}
     * @param EndDate [in] {@code Object}
     * @param RHS [out] {@code XlFilterStatus}
     */
    @ComMethod(name = "SetFilterDateRange", dispId = 0xc42)
    com.sun.jna.platform.win32.WinNT.HRESULT SetFilterDateRange(Object StartDate,
            Object EndDate,
            VARIANT RHS);
            
    
}