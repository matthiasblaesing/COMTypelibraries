
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00024425-0001-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{00024425-0001-0000-C000-000000000046}")
public interface IFormatCondition extends IUnknown, IRawDispatchHandle, IDispatch {
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
     * <p>id(0xa3f)</p>
     * <p>vtableId(10)</p>
     * @param Type [in] {@code XlFormatConditionType}
     * @param Operator [in, optional] {@code Object}
     * @param Formula1 [in, optional] {@code Object}
     * @param Formula2 [in, optional] {@code Object}
     */
    @ComMethod(name = "_Modify", dispId = 0xa3f)
    com.sun.jna.platform.win32.WinNT.HRESULT _Modify(XlFormatConditionType Type,
            Object Operator,
            Object Formula1,
            Object Formula2);
            
    /**
     * <p>id(0x6c)</p>
     * <p>vtableId(11)</p>
     * @param RHS [out] {@code Integer}
     */
    @ComProperty(name = "Type", dispId = 0x6c)
    com.sun.jna.platform.win32.WinNT.HRESULT getType(VARIANT RHS);
            
    /**
     * <p>id(0x31d)</p>
     * <p>vtableId(12)</p>
     * @param RHS [out] {@code Integer}
     */
    @ComProperty(name = "Operator", dispId = 0x31d)
    com.sun.jna.platform.win32.WinNT.HRESULT getOperator(VARIANT RHS);
            
    /**
     * <p>id(0x62b)</p>
     * <p>vtableId(13)</p>
     * @param RHS [out] {@code String}
     */
    @ComProperty(name = "Formula1", dispId = 0x62b)
    com.sun.jna.platform.win32.WinNT.HRESULT getFormula1(VARIANT RHS);
            
    /**
     * <p>id(0x62c)</p>
     * <p>vtableId(14)</p>
     * @param RHS [out] {@code String}
     */
    @ComProperty(name = "Formula2", dispId = 0x62c)
    com.sun.jna.platform.win32.WinNT.HRESULT getFormula2(VARIANT RHS);
            
    /**
     * <p>id(0x81)</p>
     * <p>vtableId(15)</p>
     * @param RHS [out] {@code Interior}
     */
    @ComProperty(name = "Interior", dispId = 0x81)
    com.sun.jna.platform.win32.WinNT.HRESULT getInterior(VARIANT RHS);
            
    /**
     * <p>id(0x1b3)</p>
     * <p>vtableId(16)</p>
     * @param RHS [out] {@code Borders}
     */
    @ComProperty(name = "Borders", dispId = 0x1b3)
    com.sun.jna.platform.win32.WinNT.HRESULT getBorders(VARIANT RHS);
            
    /**
     * <p>id(0x92)</p>
     * <p>vtableId(17)</p>
     * @param RHS [out] {@code Font}
     */
    @ComProperty(name = "Font", dispId = 0x92)
    com.sun.jna.platform.win32.WinNT.HRESULT getFont(VARIANT RHS);
            
    /**
     * <p>id(0x75)</p>
     * <p>vtableId(18)</p>
     */
    @ComMethod(name = "Delete", dispId = 0x75)
    com.sun.jna.platform.win32.WinNT.HRESULT Delete();
            
    /**
     * <p>id(0x62d)</p>
     * <p>vtableId(19)</p>
     * @param Type [in] {@code XlFormatConditionType}
     * @param Operator [in, optional] {@code Object}
     * @param Formula1 [in, optional] {@code Object}
     * @param Formula2 [in, optional] {@code Object}
     * @param String [in, optional] {@code Object}
     * @param Operator2 [in, optional] {@code Object}
     */
    @ComMethod(name = "Modify", dispId = 0x62d)
    com.sun.jna.platform.win32.WinNT.HRESULT Modify(XlFormatConditionType Type,
            Object Operator,
            Object Formula1,
            Object Formula2,
            Object String,
            Object Operator2);
            
    /**
     * <p>id(0x8a)</p>
     * <p>vtableId(20)</p>
     * @param RHS [out] {@code String}
     */
    @ComProperty(name = "Text", dispId = 0x8a)
    com.sun.jna.platform.win32.WinNT.HRESULT getText(VARIANT RHS);
            
    /**
     * <p>id(0x8a)</p>
     * <p>vtableId(21)</p>
     * @param RHS [in] {@code String}
     */
    @ComProperty(name = "Text", dispId = 0x8a)
    com.sun.jna.platform.win32.WinNT.HRESULT setText(String RHS);
            
    /**
     * <p>id(0xa35)</p>
     * <p>vtableId(22)</p>
     * @param RHS [out] {@code XlContainsOperator}
     */
    @ComProperty(name = "TextOperator", dispId = 0xa35)
    com.sun.jna.platform.win32.WinNT.HRESULT getTextOperator(VARIANT RHS);
            
    /**
     * <p>id(0xa35)</p>
     * <p>vtableId(23)</p>
     * @param RHS [in] {@code XlContainsOperator}
     */
    @ComProperty(name = "TextOperator", dispId = 0xa35)
    com.sun.jna.platform.win32.WinNT.HRESULT setTextOperator(XlContainsOperator RHS);
            
    /**
     * <p>id(0xa36)</p>
     * <p>vtableId(24)</p>
     * @param RHS [out] {@code XlTimePeriods}
     */
    @ComProperty(name = "DateOperator", dispId = 0xa36)
    com.sun.jna.platform.win32.WinNT.HRESULT getDateOperator(VARIANT RHS);
            
    /**
     * <p>id(0xa36)</p>
     * <p>vtableId(25)</p>
     * @param RHS [in] {@code XlTimePeriods}
     */
    @ComProperty(name = "DateOperator", dispId = 0xa36)
    com.sun.jna.platform.win32.WinNT.HRESULT setDateOperator(XlTimePeriods RHS);
            
    /**
     * <p>id(0xc1)</p>
     * <p>vtableId(26)</p>
     * @param RHS [out] {@code Object}
     */
    @ComProperty(name = "NumberFormat", dispId = 0xc1)
    com.sun.jna.platform.win32.WinNT.HRESULT getNumberFormat(VARIANT RHS);
            
    /**
     * <p>id(0xc1)</p>
     * <p>vtableId(27)</p>
     * @param RHS [in] {@code Object}
     */
    @ComProperty(name = "NumberFormat", dispId = 0xc1)
    com.sun.jna.platform.win32.WinNT.HRESULT setNumberFormat(Object RHS);
            
    /**
     * <p>id(0x3d9)</p>
     * <p>vtableId(28)</p>
     * @param RHS [out] {@code Integer}
     */
    @ComProperty(name = "Priority", dispId = 0x3d9)
    com.sun.jna.platform.win32.WinNT.HRESULT getPriority(VARIANT RHS);
            
    /**
     * <p>id(0x3d9)</p>
     * <p>vtableId(29)</p>
     * @param RHS [in] {@code Integer}
     */
    @ComProperty(name = "Priority", dispId = 0x3d9)
    com.sun.jna.platform.win32.WinNT.HRESULT setPriority(Integer RHS);
            
    /**
     * <p>id(0xa41)</p>
     * <p>vtableId(30)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "StopIfTrue", dispId = 0xa41)
    com.sun.jna.platform.win32.WinNT.HRESULT getStopIfTrue(VARIANT RHS);
            
    /**
     * <p>id(0xa41)</p>
     * <p>vtableId(31)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "StopIfTrue", dispId = 0xa41)
    com.sun.jna.platform.win32.WinNT.HRESULT setStopIfTrue(Boolean RHS);
            
    /**
     * <p>id(0xa42)</p>
     * <p>vtableId(32)</p>
     * @param RHS [out] {@code Range}
     */
    @ComProperty(name = "AppliesTo", dispId = 0xa42)
    com.sun.jna.platform.win32.WinNT.HRESULT getAppliesTo(VARIANT RHS);
            
    /**
     * <p>id(0xa43)</p>
     * <p>vtableId(33)</p>
     * @param Range [in] {@code Range}
     */
    @ComMethod(name = "ModifyAppliesToRange", dispId = 0xa43)
    com.sun.jna.platform.win32.WinNT.HRESULT ModifyAppliesToRange(Range Range);
            
    /**
     * <p>id(0xa45)</p>
     * <p>vtableId(34)</p>
     */
    @ComMethod(name = "SetFirstPriority", dispId = 0xa45)
    com.sun.jna.platform.win32.WinNT.HRESULT SetFirstPriority();
            
    /**
     * <p>id(0xa46)</p>
     * <p>vtableId(35)</p>
     */
    @ComMethod(name = "SetLastPriority", dispId = 0xa46)
    com.sun.jna.platform.win32.WinNT.HRESULT SetLastPriority();
            
    /**
     * <p>id(0xa47)</p>
     * <p>vtableId(36)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "PTCondition", dispId = 0xa47)
    com.sun.jna.platform.win32.WinNT.HRESULT getPTCondition(VARIANT RHS);
            
    /**
     * <p>id(0xa37)</p>
     * <p>vtableId(37)</p>
     * @param RHS [out] {@code XlPivotConditionScope}
     */
    @ComProperty(name = "ScopeType", dispId = 0xa37)
    com.sun.jna.platform.win32.WinNT.HRESULT getScopeType(VARIANT RHS);
            
    /**
     * <p>id(0xa37)</p>
     * <p>vtableId(38)</p>
     * @param RHS [in] {@code XlPivotConditionScope}
     */
    @ComProperty(name = "ScopeType", dispId = 0xa37)
    com.sun.jna.platform.win32.WinNT.HRESULT setScopeType(XlPivotConditionScope RHS);
            
    
}