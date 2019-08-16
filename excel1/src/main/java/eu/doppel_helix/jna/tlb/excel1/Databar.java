
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00024496-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{00024496-0000-0000-C000-000000000046}")
public interface Databar extends IUnknown, IRawDispatchHandle, IDispatch {
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
     * <p>id(0xa9e)</p>
     * <p>vtableId(14)</p>
     */
    @ComProperty(name = "MinPoint", dispId = 0xa9e)
    ConditionValue getMinPoint();
            
    /**
     * <p>id(0xa9f)</p>
     * <p>vtableId(15)</p>
     */
    @ComProperty(name = "MaxPoint", dispId = 0xa9f)
    ConditionValue getMaxPoint();
            
    /**
     * <p>id(0xaa0)</p>
     * <p>vtableId(16)</p>
     */
    @ComProperty(name = "PercentMin", dispId = 0xaa0)
    Integer getPercentMin();
            
    /**
     * <p>id(0xaa0)</p>
     * <p>vtableId(17)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "PercentMin", dispId = 0xaa0)
    void setPercentMin(Integer param0);
            
    /**
     * <p>id(0xaa1)</p>
     * <p>vtableId(18)</p>
     */
    @ComProperty(name = "PercentMax", dispId = 0xaa1)
    Integer getPercentMax();
            
    /**
     * <p>id(0xaa1)</p>
     * <p>vtableId(19)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "PercentMax", dispId = 0xaa1)
    void setPercentMax(Integer param0);
            
    /**
     * <p>id(0xaa2)</p>
     * <p>vtableId(20)</p>
     */
    @ComProperty(name = "BarColor", dispId = 0xaa2)
    com.sun.jna.platform.win32.COM.util.IDispatch getBarColor();
            
    /**
     * <p>id(0x7e8)</p>
     * <p>vtableId(21)</p>
     */
    @ComProperty(name = "ShowValue", dispId = 0x7e8)
    Boolean getShowValue();
            
    /**
     * <p>id(0x7e8)</p>
     * <p>vtableId(22)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "ShowValue", dispId = 0x7e8)
    void setShowValue(Boolean param0);
            
    /**
     * <p>id(0x105)</p>
     * <p>vtableId(23)</p>
     */
    @ComProperty(name = "Formula", dispId = 0x105)
    String getFormula();
            
    /**
     * <p>id(0x105)</p>
     * <p>vtableId(24)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "Formula", dispId = 0x105)
    void setFormula(String param0);
            
    /**
     * <p>id(0x6c)</p>
     * <p>vtableId(25)</p>
     */
    @ComProperty(name = "Type", dispId = 0x6c)
    Integer getType();
            
    /**
     * <p>id(0xa45)</p>
     * <p>vtableId(26)</p>
     */
    @ComMethod(name = "SetFirstPriority", dispId = 0xa45)
    void SetFirstPriority();
            
    /**
     * <p>id(0xa46)</p>
     * <p>vtableId(27)</p>
     */
    @ComMethod(name = "SetLastPriority", dispId = 0xa46)
    void SetLastPriority();
            
    /**
     * <p>id(0x75)</p>
     * <p>vtableId(28)</p>
     */
    @ComMethod(name = "Delete", dispId = 0x75)
    void Delete();
            
    /**
     * <p>id(0xa43)</p>
     * <p>vtableId(29)</p>
     * @param Range [in] {@code Range}
     */
    @ComMethod(name = "ModifyAppliesToRange", dispId = 0xa43)
    void ModifyAppliesToRange(Range Range);
            
    /**
     * <p>id(0xa47)</p>
     * <p>vtableId(30)</p>
     */
    @ComProperty(name = "PTCondition", dispId = 0xa47)
    Boolean getPTCondition();
            
    /**
     * <p>id(0xa37)</p>
     * <p>vtableId(31)</p>
     */
    @ComProperty(name = "ScopeType", dispId = 0xa37)
    XlPivotConditionScope getScopeType();
            
    /**
     * <p>id(0xa37)</p>
     * <p>vtableId(32)</p>
     * @param param0 [in] {@code XlPivotConditionScope}
     */
    @ComProperty(name = "ScopeType", dispId = 0xa37)
    void setScopeType(XlPivotConditionScope param0);
            
    /**
     * <p>id(0xa8)</p>
     * <p>vtableId(33)</p>
     */
    @ComProperty(name = "Direction", dispId = 0xa8)
    Integer getDirection();
            
    /**
     * <p>id(0xa8)</p>
     * <p>vtableId(34)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "Direction", dispId = 0xa8)
    void setDirection(Integer param0);
            
    /**
     * <p>id(0xb7d)</p>
     * <p>vtableId(35)</p>
     */
    @ComProperty(name = "BarFillType", dispId = 0xb7d)
    XlDataBarFillType getBarFillType();
            
    /**
     * <p>id(0xb7d)</p>
     * <p>vtableId(36)</p>
     * @param param0 [in] {@code XlDataBarFillType}
     */
    @ComProperty(name = "BarFillType", dispId = 0xb7d)
    void setBarFillType(XlDataBarFillType param0);
            
    /**
     * <p>id(0xb7e)</p>
     * <p>vtableId(37)</p>
     */
    @ComProperty(name = "AxisPosition", dispId = 0xb7e)
    XlDataBarAxisPosition getAxisPosition();
            
    /**
     * <p>id(0xb7e)</p>
     * <p>vtableId(38)</p>
     * @param param0 [in] {@code XlDataBarAxisPosition}
     */
    @ComProperty(name = "AxisPosition", dispId = 0xb7e)
    void setAxisPosition(XlDataBarAxisPosition param0);
            
    /**
     * <p>id(0xb7f)</p>
     * <p>vtableId(39)</p>
     */
    @ComProperty(name = "AxisColor", dispId = 0xb7f)
    com.sun.jna.platform.win32.COM.util.IDispatch getAxisColor();
            
    /**
     * <p>id(0xb80)</p>
     * <p>vtableId(40)</p>
     */
    @ComProperty(name = "BarBorder", dispId = 0xb80)
    DataBarBorder getBarBorder();
            
    /**
     * <p>id(0xb81)</p>
     * <p>vtableId(41)</p>
     */
    @ComProperty(name = "NegativeBarFormat", dispId = 0xb81)
    NegativeBarFormat getNegativeBarFormat();
            
    
}