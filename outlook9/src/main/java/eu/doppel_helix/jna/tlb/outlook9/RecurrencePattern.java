
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00063044-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{00063044-0000-0000-C000-000000000046}")
public interface RecurrencePattern extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0xf000)</p>
     * <p>vtableId(7)</p>
     */
    @ComProperty(name = "Application", dispId = 0xf000)
    _Application getApplication();
            
    /**
     * <p>id(0xf00a)</p>
     * <p>vtableId(8)</p>
     */
    @ComProperty(name = "Class", dispId = 0xf00a)
    OlObjectClass get_Class();
            
    /**
     * <p>id(0xf00b)</p>
     * <p>vtableId(9)</p>
     */
    @ComProperty(name = "Session", dispId = 0xf00b)
    _NameSpace getSession();
            
    /**
     * <p>id(0xf001)</p>
     * <p>vtableId(10)</p>
     */
    @ComProperty(name = "Parent", dispId = 0xf001)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * <p>id(0x1000)</p>
     * <p>vtableId(11)</p>
     */
    @ComProperty(name = "DayOfMonth", dispId = 0x1000)
    Integer getDayOfMonth();
            
    /**
     * <p>id(0x1000)</p>
     * <p>vtableId(12)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "DayOfMonth", dispId = 0x1000)
    void setDayOfMonth(Integer param0);
            
    /**
     * <p>id(0x1001)</p>
     * <p>vtableId(13)</p>
     */
    @ComProperty(name = "DayOfWeekMask", dispId = 0x1001)
    OlDaysOfWeek getDayOfWeekMask();
            
    /**
     * <p>id(0x1001)</p>
     * <p>vtableId(14)</p>
     * @param param0 [in] {@code OlDaysOfWeek}
     */
    @ComProperty(name = "DayOfWeekMask", dispId = 0x1001)
    void setDayOfWeekMask(OlDaysOfWeek param0);
            
    /**
     * <p>id(0x100d)</p>
     * <p>vtableId(15)</p>
     */
    @ComProperty(name = "Duration", dispId = 0x100d)
    Integer getDuration();
            
    /**
     * <p>id(0x100d)</p>
     * <p>vtableId(16)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "Duration", dispId = 0x100d)
    void setDuration(Integer param0);
            
    /**
     * <p>id(0x100c)</p>
     * <p>vtableId(17)</p>
     */
    @ComProperty(name = "EndTime", dispId = 0x100c)
    java.util.Date getEndTime();
            
    /**
     * <p>id(0x100c)</p>
     * <p>vtableId(18)</p>
     * @param param0 [in] {@code java.util.Date}
     */
    @ComProperty(name = "EndTime", dispId = 0x100c)
    void setEndTime(java.util.Date param0);
            
    /**
     * <p>id(0x100e)</p>
     * <p>vtableId(19)</p>
     */
    @ComProperty(name = "Exceptions", dispId = 0x100e)
    Exceptions getExceptions();
            
    /**
     * <p>id(0x1003)</p>
     * <p>vtableId(20)</p>
     */
    @ComProperty(name = "Instance", dispId = 0x1003)
    Integer getInstance();
            
    /**
     * <p>id(0x1003)</p>
     * <p>vtableId(21)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "Instance", dispId = 0x1003)
    void setInstance(Integer param0);
            
    /**
     * <p>id(0x1004)</p>
     * <p>vtableId(22)</p>
     */
    @ComProperty(name = "Interval", dispId = 0x1004)
    Integer getInterval();
            
    /**
     * <p>id(0x1004)</p>
     * <p>vtableId(23)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "Interval", dispId = 0x1004)
    void setInterval(Integer param0);
            
    /**
     * <p>id(0x1006)</p>
     * <p>vtableId(24)</p>
     */
    @ComProperty(name = "MonthOfYear", dispId = 0x1006)
    Integer getMonthOfYear();
            
    /**
     * <p>id(0x1006)</p>
     * <p>vtableId(25)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "MonthOfYear", dispId = 0x1006)
    void setMonthOfYear(Integer param0);
            
    /**
     * <p>id(0x100b)</p>
     * <p>vtableId(26)</p>
     */
    @ComProperty(name = "NoEndDate", dispId = 0x100b)
    Boolean getNoEndDate();
            
    /**
     * <p>id(0x100b)</p>
     * <p>vtableId(27)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "NoEndDate", dispId = 0x100b)
    void setNoEndDate(Boolean param0);
            
    /**
     * <p>id(0x1005)</p>
     * <p>vtableId(28)</p>
     */
    @ComProperty(name = "Occurrences", dispId = 0x1005)
    Integer getOccurrences();
            
    /**
     * <p>id(0x1005)</p>
     * <p>vtableId(29)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "Occurrences", dispId = 0x1005)
    void setOccurrences(Integer param0);
            
    /**
     * <p>id(0x1002)</p>
     * <p>vtableId(30)</p>
     */
    @ComProperty(name = "PatternEndDate", dispId = 0x1002)
    java.util.Date getPatternEndDate();
            
    /**
     * <p>id(0x1002)</p>
     * <p>vtableId(31)</p>
     * @param param0 [in] {@code java.util.Date}
     */
    @ComProperty(name = "PatternEndDate", dispId = 0x1002)
    void setPatternEndDate(java.util.Date param0);
            
    /**
     * <p>id(0x1008)</p>
     * <p>vtableId(32)</p>
     */
    @ComProperty(name = "PatternStartDate", dispId = 0x1008)
    java.util.Date getPatternStartDate();
            
    /**
     * <p>id(0x1008)</p>
     * <p>vtableId(33)</p>
     * @param param0 [in] {@code java.util.Date}
     */
    @ComProperty(name = "PatternStartDate", dispId = 0x1008)
    void setPatternStartDate(java.util.Date param0);
            
    /**
     * <p>id(0x1007)</p>
     * <p>vtableId(34)</p>
     */
    @ComProperty(name = "RecurrenceType", dispId = 0x1007)
    OlRecurrenceType getRecurrenceType();
            
    /**
     * <p>id(0x1007)</p>
     * <p>vtableId(35)</p>
     * @param param0 [in] {@code OlRecurrenceType}
     */
    @ComProperty(name = "RecurrenceType", dispId = 0x1007)
    void setRecurrenceType(OlRecurrenceType param0);
            
    /**
     * <p>id(0x100a)</p>
     * <p>vtableId(36)</p>
     */
    @ComProperty(name = "Regenerate", dispId = 0x100a)
    Boolean getRegenerate();
            
    /**
     * <p>id(0x100a)</p>
     * <p>vtableId(37)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "Regenerate", dispId = 0x100a)
    void setRegenerate(Boolean param0);
            
    /**
     * <p>id(0x1009)</p>
     * <p>vtableId(38)</p>
     */
    @ComProperty(name = "StartTime", dispId = 0x1009)
    java.util.Date getStartTime();
            
    /**
     * <p>id(0x1009)</p>
     * <p>vtableId(39)</p>
     * @param param0 [in] {@code java.util.Date}
     */
    @ComProperty(name = "StartTime", dispId = 0x1009)
    void setStartTime(java.util.Date param0);
            
    /**
     * <p>id(0x100f)</p>
     * <p>vtableId(40)</p>
     * @param StartDate [in] {@code java.util.Date}
     */
    @ComMethod(name = "GetOccurrence", dispId = 0x100f)
    AppointmentItem GetOccurrence(java.util.Date StartDate);
            
    
}