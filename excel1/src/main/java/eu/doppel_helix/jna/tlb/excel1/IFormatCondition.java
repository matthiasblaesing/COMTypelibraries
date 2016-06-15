
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
     * <p>id(0xa3f)</p>
     */
    @ComMethod(name = "_Modify", dispId = 0xa3f)
    com.sun.jna.platform.win32.WinNT.HRESULT _Modify(XlFormatConditionType Type,
            Object Operator,
            Object Formula1,
            Object Formula2);
            
    /**
     * <p>id(0x6c)</p>
     */
    @ComProperty(name = "Type", dispId = 0x6c)
    com.sun.jna.platform.win32.WinNT.HRESULT getType(VARIANT RHS);
            
    /**
     * <p>id(0x31d)</p>
     */
    @ComProperty(name = "Operator", dispId = 0x31d)
    com.sun.jna.platform.win32.WinNT.HRESULT getOperator(VARIANT RHS);
            
    /**
     * <p>id(0x62b)</p>
     */
    @ComProperty(name = "Formula1", dispId = 0x62b)
    com.sun.jna.platform.win32.WinNT.HRESULT getFormula1(VARIANT RHS);
            
    /**
     * <p>id(0x62c)</p>
     */
    @ComProperty(name = "Formula2", dispId = 0x62c)
    com.sun.jna.platform.win32.WinNT.HRESULT getFormula2(VARIANT RHS);
            
    /**
     * <p>id(0x81)</p>
     */
    @ComProperty(name = "Interior", dispId = 0x81)
    com.sun.jna.platform.win32.WinNT.HRESULT getInterior(VARIANT RHS);
            
    /**
     * <p>id(0x1b3)</p>
     */
    @ComProperty(name = "Borders", dispId = 0x1b3)
    com.sun.jna.platform.win32.WinNT.HRESULT getBorders(VARIANT RHS);
            
    /**
     * <p>id(0x92)</p>
     */
    @ComProperty(name = "Font", dispId = 0x92)
    com.sun.jna.platform.win32.WinNT.HRESULT getFont(VARIANT RHS);
            
    /**
     * <p>id(0x75)</p>
     */
    @ComMethod(name = "Delete", dispId = 0x75)
    com.sun.jna.platform.win32.WinNT.HRESULT Delete();
            
    /**
     * <p>id(0x62d)</p>
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
     */
    @ComProperty(name = "Text", dispId = 0x8a)
    com.sun.jna.platform.win32.WinNT.HRESULT getText(VARIANT RHS);
            
    /**
     * <p>id(0x8a)</p>
     */
    @ComProperty(name = "Text", dispId = 0x8a)
    com.sun.jna.platform.win32.WinNT.HRESULT setText(String RHS);
            
    /**
     * <p>id(0xa35)</p>
     */
    @ComProperty(name = "TextOperator", dispId = 0xa35)
    com.sun.jna.platform.win32.WinNT.HRESULT getTextOperator(VARIANT RHS);
            
    /**
     * <p>id(0xa35)</p>
     */
    @ComProperty(name = "TextOperator", dispId = 0xa35)
    com.sun.jna.platform.win32.WinNT.HRESULT setTextOperator(XlContainsOperator RHS);
            
    /**
     * <p>id(0xa36)</p>
     */
    @ComProperty(name = "DateOperator", dispId = 0xa36)
    com.sun.jna.platform.win32.WinNT.HRESULT getDateOperator(VARIANT RHS);
            
    /**
     * <p>id(0xa36)</p>
     */
    @ComProperty(name = "DateOperator", dispId = 0xa36)
    com.sun.jna.platform.win32.WinNT.HRESULT setDateOperator(XlTimePeriods RHS);
            
    /**
     * <p>id(0xc1)</p>
     */
    @ComProperty(name = "NumberFormat", dispId = 0xc1)
    com.sun.jna.platform.win32.WinNT.HRESULT getNumberFormat(VARIANT RHS);
            
    /**
     * <p>id(0xc1)</p>
     */
    @ComProperty(name = "NumberFormat", dispId = 0xc1)
    com.sun.jna.platform.win32.WinNT.HRESULT setNumberFormat(Object RHS);
            
    /**
     * <p>id(0x3d9)</p>
     */
    @ComProperty(name = "Priority", dispId = 0x3d9)
    com.sun.jna.platform.win32.WinNT.HRESULT getPriority(VARIANT RHS);
            
    /**
     * <p>id(0x3d9)</p>
     */
    @ComProperty(name = "Priority", dispId = 0x3d9)
    com.sun.jna.platform.win32.WinNT.HRESULT setPriority(Integer RHS);
            
    /**
     * <p>id(0xa41)</p>
     */
    @ComProperty(name = "StopIfTrue", dispId = 0xa41)
    com.sun.jna.platform.win32.WinNT.HRESULT getStopIfTrue(VARIANT RHS);
            
    /**
     * <p>id(0xa41)</p>
     */
    @ComProperty(name = "StopIfTrue", dispId = 0xa41)
    com.sun.jna.platform.win32.WinNT.HRESULT setStopIfTrue(Boolean RHS);
            
    /**
     * <p>id(0xa42)</p>
     */
    @ComProperty(name = "AppliesTo", dispId = 0xa42)
    com.sun.jna.platform.win32.WinNT.HRESULT getAppliesTo(VARIANT RHS);
            
    /**
     * <p>id(0xa43)</p>
     */
    @ComMethod(name = "ModifyAppliesToRange", dispId = 0xa43)
    com.sun.jna.platform.win32.WinNT.HRESULT ModifyAppliesToRange(Range Range);
            
    /**
     * <p>id(0xa45)</p>
     */
    @ComMethod(name = "SetFirstPriority", dispId = 0xa45)
    com.sun.jna.platform.win32.WinNT.HRESULT SetFirstPriority();
            
    /**
     * <p>id(0xa46)</p>
     */
    @ComMethod(name = "SetLastPriority", dispId = 0xa46)
    com.sun.jna.platform.win32.WinNT.HRESULT SetLastPriority();
            
    /**
     * <p>id(0xa47)</p>
     */
    @ComProperty(name = "PTCondition", dispId = 0xa47)
    com.sun.jna.platform.win32.WinNT.HRESULT getPTCondition(VARIANT RHS);
            
    /**
     * <p>id(0xa37)</p>
     */
    @ComProperty(name = "ScopeType", dispId = 0xa37)
    com.sun.jna.platform.win32.WinNT.HRESULT getScopeType(VARIANT RHS);
            
    /**
     * <p>id(0xa37)</p>
     */
    @ComProperty(name = "ScopeType", dispId = 0xa37)
    com.sun.jna.platform.win32.WinNT.HRESULT setScopeType(XlPivotConditionScope RHS);
            
    
}