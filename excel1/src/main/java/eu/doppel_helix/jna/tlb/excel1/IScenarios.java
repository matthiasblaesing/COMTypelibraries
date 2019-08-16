
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00020896-0001-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{00020896-0001-0000-C000-000000000046}")
public interface IScenarios extends IUnknown, IRawDispatchHandle, IDispatch {
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
     * <p>id(0xb5)</p>
     * <p>vtableId(10)</p>
     * @param Name [in] {@code String}
     * @param ChangingCells [in] {@code Object}
     * @param Values [in, optional] {@code Object}
     * @param Comment [in, optional] {@code Object}
     * @param Locked [in, optional] {@code Object}
     * @param Hidden [in, optional] {@code Object}
     * @param RHS [out] {@code Scenario}
     */
    @ComMethod(name = "Add", dispId = 0xb5)
    com.sun.jna.platform.win32.WinNT.HRESULT Add(String Name,
            Object ChangingCells,
            Object Values,
            Object Comment,
            Object Locked,
            Object Hidden,
            VARIANT RHS);
            
    /**
     * <p>id(0x76)</p>
     * <p>vtableId(11)</p>
     * @param RHS [out] {@code Integer}
     */
    @ComProperty(name = "Count", dispId = 0x76)
    com.sun.jna.platform.win32.WinNT.HRESULT getCount(VARIANT RHS);
            
    /**
     * <p>id(0x391)</p>
     * <p>vtableId(12)</p>
     * @param ReportType [in, optional] {@code XlSummaryReportType}
     * @param ResultCells [in, optional] {@code Object}
     * @param RHS [out] {@code Object}
     */
    @ComMethod(name = "CreateSummary", dispId = 0x391)
    com.sun.jna.platform.win32.WinNT.HRESULT CreateSummary(XlSummaryReportType ReportType,
            Object ResultCells,
            VARIANT RHS);
            
    /**
     * <p>id(0xaa)</p>
     * <p>vtableId(13)</p>
     * @param Index [in] {@code Object}
     * @param RHS [out] {@code Scenario}
     */
    @ComMethod(name = "Item", dispId = 0xaa)
    com.sun.jna.platform.win32.WinNT.HRESULT Item(Object Index,
            VARIANT RHS);
            
    /**
     * <p>id(0x234)</p>
     * <p>vtableId(14)</p>
     * @param Source [in] {@code Object}
     * @param RHS [out] {@code Object}
     */
    @ComMethod(name = "Merge", dispId = 0x234)
    com.sun.jna.platform.win32.WinNT.HRESULT Merge(Object Source,
            VARIANT RHS);
            
    
}