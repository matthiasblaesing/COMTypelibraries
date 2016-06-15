
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00024497-0001-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{00024497-0001-0000-C000-000000000046}")
public interface IIconSetCondition extends IUnknown, IRawDispatchHandle, IDispatch {
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
     * <p>id(0x6c)</p>
     */
    @ComProperty(name = "Type", dispId = 0x6c)
    com.sun.jna.platform.win32.WinNT.HRESULT getType(VARIANT RHS);
            
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
     * <p>id(0xaa3)</p>
     */
    @ComProperty(name = "ReverseOrder", dispId = 0xaa3)
    com.sun.jna.platform.win32.WinNT.HRESULT getReverseOrder(VARIANT RHS);
            
    /**
     * <p>id(0xaa3)</p>
     */
    @ComProperty(name = "ReverseOrder", dispId = 0xaa3)
    com.sun.jna.platform.win32.WinNT.HRESULT setReverseOrder(Boolean RHS);
            
    /**
     * <p>id(0xaa4)</p>
     */
    @ComProperty(name = "PercentileValues", dispId = 0xaa4)
    com.sun.jna.platform.win32.WinNT.HRESULT getPercentileValues(VARIANT RHS);
            
    /**
     * <p>id(0xaa4)</p>
     */
    @ComProperty(name = "PercentileValues", dispId = 0xaa4)
    com.sun.jna.platform.win32.WinNT.HRESULT setPercentileValues(Boolean RHS);
            
    /**
     * <p>id(0xaa5)</p>
     */
    @ComProperty(name = "ShowIconOnly", dispId = 0xaa5)
    com.sun.jna.platform.win32.WinNT.HRESULT getShowIconOnly(VARIANT RHS);
            
    /**
     * <p>id(0xaa5)</p>
     */
    @ComProperty(name = "ShowIconOnly", dispId = 0xaa5)
    com.sun.jna.platform.win32.WinNT.HRESULT setShowIconOnly(Boolean RHS);
            
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
     * <p>id(0xaa6)</p>
     */
    @ComProperty(name = "IconSet", dispId = 0xaa6)
    com.sun.jna.platform.win32.WinNT.HRESULT getIconSet(VARIANT RHS);
            
    /**
     * <p>id(0xaa6)</p>
     */
    @ComProperty(name = "IconSet", dispId = 0xaa6)
    com.sun.jna.platform.win32.WinNT.HRESULT setIconSet(Object RHS);
            
    /**
     * <p>id(0xaa7)</p>
     */
    @ComProperty(name = "IconCriteria", dispId = 0xaa7)
    com.sun.jna.platform.win32.WinNT.HRESULT getIconCriteria(VARIANT RHS);
            
    
}