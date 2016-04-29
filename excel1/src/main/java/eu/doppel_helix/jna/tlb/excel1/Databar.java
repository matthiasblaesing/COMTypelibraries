
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00024496-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{00024496-0000-0000-C000-000000000046}")
public interface Databar {
    /**
     * <p>id(0x94)</p>
     */
    @ComProperty(name = "Application", dispId = 0x94)
    Application getApplication();
            
    /**
     * <p>id(0x95)</p>
     */
    @ComProperty(name = "Creator", dispId = 0x95)
    XlCreator getCreator();
            
    /**
     * <p>id(0x96)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x96)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * <p>id(0x3d9)</p>
     */
    @ComProperty(name = "Priority", dispId = 0x3d9)
    Integer getPriority();
            
    /**
     * <p>id(0x3d9)</p>
     */
    @ComProperty(name = "Priority", dispId = 0x3d9)
    void setPriority(Integer param0);
            
    /**
     * <p>id(0xa41)</p>
     */
    @ComProperty(name = "StopIfTrue", dispId = 0xa41)
    Boolean getStopIfTrue();
            
    /**
     * <p>id(0xa42)</p>
     */
    @ComProperty(name = "AppliesTo", dispId = 0xa42)
    Range getAppliesTo();
            
    /**
     * <p>id(0xa9e)</p>
     */
    @ComProperty(name = "MinPoint", dispId = 0xa9e)
    ConditionValue getMinPoint();
            
    /**
     * <p>id(0xa9f)</p>
     */
    @ComProperty(name = "MaxPoint", dispId = 0xa9f)
    ConditionValue getMaxPoint();
            
    /**
     * <p>id(0xaa0)</p>
     */
    @ComProperty(name = "PercentMin", dispId = 0xaa0)
    Integer getPercentMin();
            
    /**
     * <p>id(0xaa0)</p>
     */
    @ComProperty(name = "PercentMin", dispId = 0xaa0)
    void setPercentMin(Integer param0);
            
    /**
     * <p>id(0xaa1)</p>
     */
    @ComProperty(name = "PercentMax", dispId = 0xaa1)
    Integer getPercentMax();
            
    /**
     * <p>id(0xaa1)</p>
     */
    @ComProperty(name = "PercentMax", dispId = 0xaa1)
    void setPercentMax(Integer param0);
            
    /**
     * <p>id(0xaa2)</p>
     */
    @ComProperty(name = "BarColor", dispId = 0xaa2)
    com.sun.jna.platform.win32.COM.util.IDispatch getBarColor();
            
    /**
     * <p>id(0x7e8)</p>
     */
    @ComProperty(name = "ShowValue", dispId = 0x7e8)
    Boolean getShowValue();
            
    /**
     * <p>id(0x7e8)</p>
     */
    @ComProperty(name = "ShowValue", dispId = 0x7e8)
    void setShowValue(Boolean param0);
            
    /**
     * <p>id(0x105)</p>
     */
    @ComProperty(name = "Formula", dispId = 0x105)
    String getFormula();
            
    /**
     * <p>id(0x105)</p>
     */
    @ComProperty(name = "Formula", dispId = 0x105)
    void setFormula(String param0);
            
    /**
     * <p>id(0x6c)</p>
     */
    @ComProperty(name = "Type", dispId = 0x6c)
    Integer getType();
            
    /**
     * <p>id(0xa45)</p>
     */
    @ComMethod(name = "SetFirstPriority", dispId = 0xa45)
    void SetFirstPriority();
            
    /**
     * <p>id(0xa46)</p>
     */
    @ComMethod(name = "SetLastPriority", dispId = 0xa46)
    void SetLastPriority();
            
    /**
     * <p>id(0x75)</p>
     */
    @ComMethod(name = "Delete", dispId = 0x75)
    void Delete();
            
    /**
     * <p>id(0xa43)</p>
     */
    @ComMethod(name = "ModifyAppliesToRange", dispId = 0xa43)
    void ModifyAppliesToRange(Range Range);
            
    /**
     * <p>id(0xa47)</p>
     */
    @ComProperty(name = "PTCondition", dispId = 0xa47)
    Boolean getPTCondition();
            
    /**
     * <p>id(0xa37)</p>
     */
    @ComProperty(name = "ScopeType", dispId = 0xa37)
    XlPivotConditionScope getScopeType();
            
    /**
     * <p>id(0xa37)</p>
     */
    @ComProperty(name = "ScopeType", dispId = 0xa37)
    void setScopeType(XlPivotConditionScope param0);
            
    /**
     * <p>id(0xa8)</p>
     */
    @ComProperty(name = "Direction", dispId = 0xa8)
    Integer getDirection();
            
    /**
     * <p>id(0xa8)</p>
     */
    @ComProperty(name = "Direction", dispId = 0xa8)
    void setDirection(Integer param0);
            
    /**
     * <p>id(0xb7d)</p>
     */
    @ComProperty(name = "BarFillType", dispId = 0xb7d)
    XlDataBarFillType getBarFillType();
            
    /**
     * <p>id(0xb7d)</p>
     */
    @ComProperty(name = "BarFillType", dispId = 0xb7d)
    void setBarFillType(XlDataBarFillType param0);
            
    /**
     * <p>id(0xb7e)</p>
     */
    @ComProperty(name = "AxisPosition", dispId = 0xb7e)
    XlDataBarAxisPosition getAxisPosition();
            
    /**
     * <p>id(0xb7e)</p>
     */
    @ComProperty(name = "AxisPosition", dispId = 0xb7e)
    void setAxisPosition(XlDataBarAxisPosition param0);
            
    /**
     * <p>id(0xb7f)</p>
     */
    @ComProperty(name = "AxisColor", dispId = 0xb7f)
    com.sun.jna.platform.win32.COM.util.IDispatch getAxisColor();
            
    /**
     * <p>id(0xb80)</p>
     */
    @ComProperty(name = "BarBorder", dispId = 0xb80)
    DataBarBorder getBarBorder();
            
    /**
     * <p>id(0xb81)</p>
     */
    @ComProperty(name = "NegativeBarFormat", dispId = 0xb81)
    NegativeBarFormat getNegativeBarFormat();
            
    
}