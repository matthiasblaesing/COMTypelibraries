
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00024497-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{00024497-0000-0000-C000-000000000046}")
public interface IconSetCondition extends IUnknown, IRawDispatchHandle, IDispatch {
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
     * <p>id(0x3d9)</p>
     * <p>vtableId(10)</p>
     */
    @ComProperty(name = "Priority", dispId = 0x3d9)
    Integer getPriority();
            
    /**
     * <p>id(0x3d9)</p>
     * <p>vtableId(11)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "Priority", dispId = 0x3d9)
    void setPriority(Integer param0);
            
    /**
     * <p>id(0xa41)</p>
     * <p>vtableId(12)</p>
     */
    @ComProperty(name = "StopIfTrue", dispId = 0xa41)
    Boolean getStopIfTrue();
            
    /**
     * <p>id(0xa42)</p>
     * <p>vtableId(13)</p>
     */
    @ComProperty(name = "AppliesTo", dispId = 0xa42)
    Range getAppliesTo();
            
    /**
     * <p>id(0x6c)</p>
     * <p>vtableId(14)</p>
     */
    @ComProperty(name = "Type", dispId = 0x6c)
    Integer getType();
            
    /**
     * <p>id(0xa43)</p>
     * <p>vtableId(15)</p>
     * @param Range [in] {@code Range}
     */
    @ComMethod(name = "ModifyAppliesToRange", dispId = 0xa43)
    void ModifyAppliesToRange(Range Range);
            
    /**
     * <p>id(0xa47)</p>
     * <p>vtableId(16)</p>
     */
    @ComProperty(name = "PTCondition", dispId = 0xa47)
    Boolean getPTCondition();
            
    /**
     * <p>id(0xa37)</p>
     * <p>vtableId(17)</p>
     */
    @ComProperty(name = "ScopeType", dispId = 0xa37)
    XlPivotConditionScope getScopeType();
            
    /**
     * <p>id(0xa37)</p>
     * <p>vtableId(18)</p>
     * @param param0 [in] {@code XlPivotConditionScope}
     */
    @ComProperty(name = "ScopeType", dispId = 0xa37)
    void setScopeType(XlPivotConditionScope param0);
            
    /**
     * <p>id(0xa45)</p>
     * <p>vtableId(19)</p>
     */
    @ComMethod(name = "SetFirstPriority", dispId = 0xa45)
    void SetFirstPriority();
            
    /**
     * <p>id(0xa46)</p>
     * <p>vtableId(20)</p>
     */
    @ComMethod(name = "SetLastPriority", dispId = 0xa46)
    void SetLastPriority();
            
    /**
     * <p>id(0x75)</p>
     * <p>vtableId(21)</p>
     */
    @ComMethod(name = "Delete", dispId = 0x75)
    void Delete();
            
    /**
     * <p>id(0xaa3)</p>
     * <p>vtableId(22)</p>
     */
    @ComProperty(name = "ReverseOrder", dispId = 0xaa3)
    Boolean getReverseOrder();
            
    /**
     * <p>id(0xaa3)</p>
     * <p>vtableId(23)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "ReverseOrder", dispId = 0xaa3)
    void setReverseOrder(Boolean param0);
            
    /**
     * <p>id(0xaa4)</p>
     * <p>vtableId(24)</p>
     */
    @ComProperty(name = "PercentileValues", dispId = 0xaa4)
    Boolean getPercentileValues();
            
    /**
     * <p>id(0xaa4)</p>
     * <p>vtableId(25)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "PercentileValues", dispId = 0xaa4)
    void setPercentileValues(Boolean param0);
            
    /**
     * <p>id(0xaa5)</p>
     * <p>vtableId(26)</p>
     */
    @ComProperty(name = "ShowIconOnly", dispId = 0xaa5)
    Boolean getShowIconOnly();
            
    /**
     * <p>id(0xaa5)</p>
     * <p>vtableId(27)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "ShowIconOnly", dispId = 0xaa5)
    void setShowIconOnly(Boolean param0);
            
    /**
     * <p>id(0x105)</p>
     * <p>vtableId(28)</p>
     */
    @ComProperty(name = "Formula", dispId = 0x105)
    String getFormula();
            
    /**
     * <p>id(0x105)</p>
     * <p>vtableId(29)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "Formula", dispId = 0x105)
    void setFormula(String param0);
            
    /**
     * <p>id(0xaa6)</p>
     * <p>vtableId(30)</p>
     */
    @ComProperty(name = "IconSet", dispId = 0xaa6)
    Object getIconSet();
            
    /**
     * <p>id(0xaa6)</p>
     * <p>vtableId(31)</p>
     * @param param0 [in] {@code Object}
     */
    @ComProperty(name = "IconSet", dispId = 0xaa6)
    void setIconSet(Object param0);
            
    /**
     * <p>id(0xaa7)</p>
     * <p>vtableId(32)</p>
     */
    @ComProperty(name = "IconCriteria", dispId = 0xaa7)
    IconCriteria getIconCriteria();
            
    
}