
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00024496-0001-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{00024496-0001-0000-C000-000000000046}")
public interface IDatabar extends IUnknown, IRawDispatchHandle, IDispatch {
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
     * <p>id(0xa42)</p>
     */
    @ComProperty(name = "AppliesTo", dispId = 0xa42)
    com.sun.jna.platform.win32.WinNT.HRESULT getAppliesTo(VARIANT RHS);
            
    /**
     * <p>id(0xa9e)</p>
     */
    @ComProperty(name = "MinPoint", dispId = 0xa9e)
    com.sun.jna.platform.win32.WinNT.HRESULT getMinPoint(VARIANT RHS);
            
    /**
     * <p>id(0xa9f)</p>
     */
    @ComProperty(name = "MaxPoint", dispId = 0xa9f)
    com.sun.jna.platform.win32.WinNT.HRESULT getMaxPoint(VARIANT RHS);
            
    /**
     * <p>id(0xaa0)</p>
     */
    @ComProperty(name = "PercentMin", dispId = 0xaa0)
    com.sun.jna.platform.win32.WinNT.HRESULT getPercentMin(VARIANT RHS);
            
    /**
     * <p>id(0xaa0)</p>
     */
    @ComProperty(name = "PercentMin", dispId = 0xaa0)
    com.sun.jna.platform.win32.WinNT.HRESULT setPercentMin(Integer RHS);
            
    /**
     * <p>id(0xaa1)</p>
     */
    @ComProperty(name = "PercentMax", dispId = 0xaa1)
    com.sun.jna.platform.win32.WinNT.HRESULT getPercentMax(VARIANT RHS);
            
    /**
     * <p>id(0xaa1)</p>
     */
    @ComProperty(name = "PercentMax", dispId = 0xaa1)
    com.sun.jna.platform.win32.WinNT.HRESULT setPercentMax(Integer RHS);
            
    /**
     * <p>id(0xaa2)</p>
     */
    @ComProperty(name = "BarColor", dispId = 0xaa2)
    com.sun.jna.platform.win32.WinNT.HRESULT getBarColor(VARIANT RHS);
            
    /**
     * <p>id(0x7e8)</p>
     */
    @ComProperty(name = "ShowValue", dispId = 0x7e8)
    com.sun.jna.platform.win32.WinNT.HRESULT getShowValue(VARIANT RHS);
            
    /**
     * <p>id(0x7e8)</p>
     */
    @ComProperty(name = "ShowValue", dispId = 0x7e8)
    com.sun.jna.platform.win32.WinNT.HRESULT setShowValue(Boolean RHS);
            
    /**
     * <p>id(0x105)</p>
     */
    @ComProperty(name = "Formula", dispId = 0x105)
    com.sun.jna.platform.win32.WinNT.HRESULT getFormula(VARIANT RHS);
            
    /**
     * <p>id(0x105)</p>
     */
    @ComProperty(name = "Formula", dispId = 0x105)
    com.sun.jna.platform.win32.WinNT.HRESULT setFormula(String RHS);
            
    /**
     * <p>id(0x6c)</p>
     */
    @ComProperty(name = "Type", dispId = 0x6c)
    com.sun.jna.platform.win32.WinNT.HRESULT getType(VARIANT RHS);
            
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
     * <p>id(0x75)</p>
     */
    @ComMethod(name = "Delete", dispId = 0x75)
    com.sun.jna.platform.win32.WinNT.HRESULT Delete();
            
    /**
     * <p>id(0xa43)</p>
     */
    @ComMethod(name = "ModifyAppliesToRange", dispId = 0xa43)
    com.sun.jna.platform.win32.WinNT.HRESULT ModifyAppliesToRange(Range Range);
            
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
            
    /**
     * <p>id(0xa8)</p>
     */
    @ComProperty(name = "Direction", dispId = 0xa8)
    com.sun.jna.platform.win32.WinNT.HRESULT getDirection(VARIANT RHS);
            
    /**
     * <p>id(0xa8)</p>
     */
    @ComProperty(name = "Direction", dispId = 0xa8)
    com.sun.jna.platform.win32.WinNT.HRESULT setDirection(Integer RHS);
            
    /**
     * <p>id(0xb7d)</p>
     */
    @ComProperty(name = "BarFillType", dispId = 0xb7d)
    com.sun.jna.platform.win32.WinNT.HRESULT getBarFillType(VARIANT RHS);
            
    /**
     * <p>id(0xb7d)</p>
     */
    @ComProperty(name = "BarFillType", dispId = 0xb7d)
    com.sun.jna.platform.win32.WinNT.HRESULT setBarFillType(XlDataBarFillType RHS);
            
    /**
     * <p>id(0xb7e)</p>
     */
    @ComProperty(name = "AxisPosition", dispId = 0xb7e)
    com.sun.jna.platform.win32.WinNT.HRESULT getAxisPosition(VARIANT RHS);
            
    /**
     * <p>id(0xb7e)</p>
     */
    @ComProperty(name = "AxisPosition", dispId = 0xb7e)
    com.sun.jna.platform.win32.WinNT.HRESULT setAxisPosition(XlDataBarAxisPosition RHS);
            
    /**
     * <p>id(0xb7f)</p>
     */
    @ComProperty(name = "AxisColor", dispId = 0xb7f)
    com.sun.jna.platform.win32.WinNT.HRESULT getAxisColor(VARIANT RHS);
            
    /**
     * <p>id(0xb80)</p>
     */
    @ComProperty(name = "BarBorder", dispId = 0xb80)
    com.sun.jna.platform.win32.WinNT.HRESULT getBarBorder(VARIANT RHS);
            
    /**
     * <p>id(0xb81)</p>
     */
    @ComProperty(name = "NegativeBarFormat", dispId = 0xb81)
    com.sun.jna.platform.win32.WinNT.HRESULT getNegativeBarFormat(VARIANT RHS);
            
    
}