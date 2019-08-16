
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({0002449F-0001-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{0002449F-0001-0000-C000-000000000046}")
public interface IUniqueValues extends IUnknown, IRawDispatchHandle, IDispatch {
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
     * <p>id(0x3d9)</p>
     * <p>vtableId(10)</p>
     * @param RHS [out] {@code Integer}
     */
    @ComProperty(name = "Priority", dispId = 0x3d9)
    com.sun.jna.platform.win32.WinNT.HRESULT getPriority(VARIANT RHS);
            
    /**
     * <p>id(0x3d9)</p>
     * <p>vtableId(11)</p>
     * @param RHS [in] {@code Integer}
     */
    @ComProperty(name = "Priority", dispId = 0x3d9)
    com.sun.jna.platform.win32.WinNT.HRESULT setPriority(Integer RHS);
            
    /**
     * <p>id(0xa41)</p>
     * <p>vtableId(12)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "StopIfTrue", dispId = 0xa41)
    com.sun.jna.platform.win32.WinNT.HRESULT getStopIfTrue(VARIANT RHS);
            
    /**
     * <p>id(0xa41)</p>
     * <p>vtableId(13)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "StopIfTrue", dispId = 0xa41)
    com.sun.jna.platform.win32.WinNT.HRESULT setStopIfTrue(Boolean RHS);
            
    /**
     * <p>id(0xa42)</p>
     * <p>vtableId(14)</p>
     * @param RHS [out] {@code Range}
     */
    @ComProperty(name = "AppliesTo", dispId = 0xa42)
    com.sun.jna.platform.win32.WinNT.HRESULT getAppliesTo(VARIANT RHS);
            
    /**
     * <p>id(0xaad)</p>
     * <p>vtableId(15)</p>
     * @param RHS [out] {@code XlDupeUnique}
     */
    @ComProperty(name = "DupeUnique", dispId = 0xaad)
    com.sun.jna.platform.win32.WinNT.HRESULT getDupeUnique(VARIANT RHS);
            
    /**
     * <p>id(0xaad)</p>
     * <p>vtableId(16)</p>
     * @param RHS [in] {@code XlDupeUnique}
     */
    @ComProperty(name = "DupeUnique", dispId = 0xaad)
    com.sun.jna.platform.win32.WinNT.HRESULT setDupeUnique(XlDupeUnique RHS);
            
    /**
     * <p>id(0x81)</p>
     * <p>vtableId(17)</p>
     * @param RHS [out] {@code Interior}
     */
    @ComProperty(name = "Interior", dispId = 0x81)
    com.sun.jna.platform.win32.WinNT.HRESULT getInterior(VARIANT RHS);
            
    /**
     * <p>id(0x1b3)</p>
     * <p>vtableId(18)</p>
     * @param RHS [out] {@code Borders}
     */
    @ComProperty(name = "Borders", dispId = 0x1b3)
    com.sun.jna.platform.win32.WinNT.HRESULT getBorders(VARIANT RHS);
            
    /**
     * <p>id(0x92)</p>
     * <p>vtableId(19)</p>
     * @param RHS [out] {@code Font}
     */
    @ComProperty(name = "Font", dispId = 0x92)
    com.sun.jna.platform.win32.WinNT.HRESULT getFont(VARIANT RHS);
            
    /**
     * <p>id(0x6c)</p>
     * <p>vtableId(20)</p>
     * @param RHS [out] {@code Integer}
     */
    @ComProperty(name = "Type", dispId = 0x6c)
    com.sun.jna.platform.win32.WinNT.HRESULT getType(VARIANT RHS);
            
    /**
     * <p>id(0xc1)</p>
     * <p>vtableId(21)</p>
     * @param RHS [out] {@code Object}
     */
    @ComProperty(name = "NumberFormat", dispId = 0xc1)
    com.sun.jna.platform.win32.WinNT.HRESULT getNumberFormat(VARIANT RHS);
            
    /**
     * <p>id(0xc1)</p>
     * <p>vtableId(22)</p>
     * @param RHS [in] {@code Object}
     */
    @ComProperty(name = "NumberFormat", dispId = 0xc1)
    com.sun.jna.platform.win32.WinNT.HRESULT setNumberFormat(Object RHS);
            
    /**
     * <p>id(0xa45)</p>
     * <p>vtableId(23)</p>
     */
    @ComMethod(name = "SetFirstPriority", dispId = 0xa45)
    com.sun.jna.platform.win32.WinNT.HRESULT SetFirstPriority();
            
    /**
     * <p>id(0xa46)</p>
     * <p>vtableId(24)</p>
     */
    @ComMethod(name = "SetLastPriority", dispId = 0xa46)
    com.sun.jna.platform.win32.WinNT.HRESULT SetLastPriority();
            
    /**
     * <p>id(0x75)</p>
     * <p>vtableId(25)</p>
     */
    @ComMethod(name = "Delete", dispId = 0x75)
    com.sun.jna.platform.win32.WinNT.HRESULT Delete();
            
    /**
     * <p>id(0xa43)</p>
     * <p>vtableId(26)</p>
     * @param Range [in] {@code Range}
     */
    @ComMethod(name = "ModifyAppliesToRange", dispId = 0xa43)
    com.sun.jna.platform.win32.WinNT.HRESULT ModifyAppliesToRange(Range Range);
            
    /**
     * <p>id(0xa47)</p>
     * <p>vtableId(27)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "PTCondition", dispId = 0xa47)
    com.sun.jna.platform.win32.WinNT.HRESULT getPTCondition(VARIANT RHS);
            
    /**
     * <p>id(0xa37)</p>
     * <p>vtableId(28)</p>
     * @param RHS [out] {@code XlPivotConditionScope}
     */
    @ComProperty(name = "ScopeType", dispId = 0xa37)
    com.sun.jna.platform.win32.WinNT.HRESULT getScopeType(VARIANT RHS);
            
    /**
     * <p>id(0xa37)</p>
     * <p>vtableId(29)</p>
     * @param RHS [in] {@code XlPivotConditionScope}
     */
    @ComProperty(name = "ScopeType", dispId = 0xa37)
    com.sun.jna.platform.win32.WinNT.HRESULT setScopeType(XlPivotConditionScope RHS);
            
    
}