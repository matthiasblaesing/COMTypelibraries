
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00024425-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{00024425-0000-0000-C000-000000000046}")
public interface FormatCondition extends IUnknown, IRawDispatchHandle, IDispatch {
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
     * <p>id(0xa3f)</p>
     * <p>vtableId(10)</p>
     * @param Type [in] {@code XlFormatConditionType}
     * @param Operator [in, optional] {@code Object}
     * @param Formula1 [in, optional] {@code Object}
     * @param Formula2 [in, optional] {@code Object}
     */
    @ComMethod(name = "_Modify", dispId = 0xa3f)
    void _Modify(XlFormatConditionType Type,
            Object Operator,
            Object Formula1,
            Object Formula2);
            
    /**
     * <p>id(0x6c)</p>
     * <p>vtableId(11)</p>
     */
    @ComProperty(name = "Type", dispId = 0x6c)
    Integer getType();
            
    /**
     * <p>id(0x31d)</p>
     * <p>vtableId(12)</p>
     */
    @ComProperty(name = "Operator", dispId = 0x31d)
    Integer getOperator();
            
    /**
     * <p>id(0x62b)</p>
     * <p>vtableId(13)</p>
     */
    @ComProperty(name = "Formula1", dispId = 0x62b)
    String getFormula1();
            
    /**
     * <p>id(0x62c)</p>
     * <p>vtableId(14)</p>
     */
    @ComProperty(name = "Formula2", dispId = 0x62c)
    String getFormula2();
            
    /**
     * <p>id(0x81)</p>
     * <p>vtableId(15)</p>
     */
    @ComProperty(name = "Interior", dispId = 0x81)
    Interior getInterior();
            
    /**
     * <p>id(0x1b3)</p>
     * <p>vtableId(16)</p>
     */
    @ComProperty(name = "Borders", dispId = 0x1b3)
    Borders getBorders();
            
    /**
     * <p>id(0x92)</p>
     * <p>vtableId(17)</p>
     */
    @ComProperty(name = "Font", dispId = 0x92)
    Font getFont();
            
    /**
     * <p>id(0x75)</p>
     * <p>vtableId(18)</p>
     */
    @ComMethod(name = "Delete", dispId = 0x75)
    void Delete();
            
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
    void Modify(XlFormatConditionType Type,
            Object Operator,
            Object Formula1,
            Object Formula2,
            Object String,
            Object Operator2);
            
    /**
     * <p>id(0x8a)</p>
     * <p>vtableId(20)</p>
     */
    @ComProperty(name = "Text", dispId = 0x8a)
    String getText();
            
    /**
     * <p>id(0x8a)</p>
     * <p>vtableId(21)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "Text", dispId = 0x8a)
    void setText(String param0);
            
    /**
     * <p>id(0xa35)</p>
     * <p>vtableId(22)</p>
     */
    @ComProperty(name = "TextOperator", dispId = 0xa35)
    XlContainsOperator getTextOperator();
            
    /**
     * <p>id(0xa35)</p>
     * <p>vtableId(23)</p>
     * @param param0 [in] {@code XlContainsOperator}
     */
    @ComProperty(name = "TextOperator", dispId = 0xa35)
    void setTextOperator(XlContainsOperator param0);
            
    /**
     * <p>id(0xa36)</p>
     * <p>vtableId(24)</p>
     */
    @ComProperty(name = "DateOperator", dispId = 0xa36)
    XlTimePeriods getDateOperator();
            
    /**
     * <p>id(0xa36)</p>
     * <p>vtableId(25)</p>
     * @param param0 [in] {@code XlTimePeriods}
     */
    @ComProperty(name = "DateOperator", dispId = 0xa36)
    void setDateOperator(XlTimePeriods param0);
            
    /**
     * <p>id(0xc1)</p>
     * <p>vtableId(26)</p>
     */
    @ComProperty(name = "NumberFormat", dispId = 0xc1)
    Object getNumberFormat();
            
    /**
     * <p>id(0xc1)</p>
     * <p>vtableId(27)</p>
     * @param param0 [in] {@code Object}
     */
    @ComProperty(name = "NumberFormat", dispId = 0xc1)
    void setNumberFormat(Object param0);
            
    /**
     * <p>id(0x3d9)</p>
     * <p>vtableId(28)</p>
     */
    @ComProperty(name = "Priority", dispId = 0x3d9)
    Integer getPriority();
            
    /**
     * <p>id(0x3d9)</p>
     * <p>vtableId(29)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "Priority", dispId = 0x3d9)
    void setPriority(Integer param0);
            
    /**
     * <p>id(0xa41)</p>
     * <p>vtableId(30)</p>
     */
    @ComProperty(name = "StopIfTrue", dispId = 0xa41)
    Boolean getStopIfTrue();
            
    /**
     * <p>id(0xa41)</p>
     * <p>vtableId(31)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "StopIfTrue", dispId = 0xa41)
    void setStopIfTrue(Boolean param0);
            
    /**
     * <p>id(0xa42)</p>
     * <p>vtableId(32)</p>
     */
    @ComProperty(name = "AppliesTo", dispId = 0xa42)
    Range getAppliesTo();
            
    /**
     * <p>id(0xa43)</p>
     * <p>vtableId(33)</p>
     * @param Range [in] {@code Range}
     */
    @ComMethod(name = "ModifyAppliesToRange", dispId = 0xa43)
    void ModifyAppliesToRange(Range Range);
            
    /**
     * <p>id(0xa45)</p>
     * <p>vtableId(34)</p>
     */
    @ComMethod(name = "SetFirstPriority", dispId = 0xa45)
    void SetFirstPriority();
            
    /**
     * <p>id(0xa46)</p>
     * <p>vtableId(35)</p>
     */
    @ComMethod(name = "SetLastPriority", dispId = 0xa46)
    void SetLastPriority();
            
    /**
     * <p>id(0xa47)</p>
     * <p>vtableId(36)</p>
     */
    @ComProperty(name = "PTCondition", dispId = 0xa47)
    Boolean getPTCondition();
            
    /**
     * <p>id(0xa37)</p>
     * <p>vtableId(37)</p>
     */
    @ComProperty(name = "ScopeType", dispId = 0xa37)
    XlPivotConditionScope getScopeType();
            
    /**
     * <p>id(0xa37)</p>
     * <p>vtableId(38)</p>
     * @param param0 [in] {@code XlPivotConditionScope}
     */
    @ComProperty(name = "ScopeType", dispId = 0xa37)
    void setScopeType(XlPivotConditionScope param0);
            
    
}