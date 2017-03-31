
package eu.doppel_helix.jna.tlb.wbemdisp1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * A Datetime
 *
 * <p>uuid({5E97458A-CF77-11D3-B38F-00105A1F473A})</p>
 */
@ComInterface(iid="{5E97458A-CF77-11D3-B38F-00105A1F473A}")
public interface ISWbemDateTime extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * The DMTF datetime
     *
     * <p>id(0x0)</p>
     * <p>vtableId(7)</p>
     */
    @ComProperty(name = "Value", dispId = 0x0)
    String getValue();
            
    /**
     * The DMTF datetime
     *
     * <p>id(0x0)</p>
     * <p>vtableId(8)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "Value", dispId = 0x0)
    void setValue(String param0);
            
    /**
     * The Year component of the value (must be in the range 0-9999)
     *
     * <p>id(0x1)</p>
     * <p>vtableId(9)</p>
     */
    @ComProperty(name = "Year", dispId = 0x1)
    Integer getYear();
            
    /**
     * The Year component of the value (must be in the range 0-9999)
     *
     * <p>id(0x1)</p>
     * <p>vtableId(10)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "Year", dispId = 0x1)
    void setYear(Integer param0);
            
    /**
     * Whether the Year component is specified
     *
     * <p>id(0x2)</p>
     * <p>vtableId(11)</p>
     */
    @ComProperty(name = "YearSpecified", dispId = 0x2)
    Boolean getYearSpecified();
            
    /**
     * Whether the Year component is specified
     *
     * <p>id(0x2)</p>
     * <p>vtableId(12)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "YearSpecified", dispId = 0x2)
    void setYearSpecified(Boolean param0);
            
    /**
     * The Month component of the value (must be in the range 1-12)
     *
     * <p>id(0x3)</p>
     * <p>vtableId(13)</p>
     */
    @ComProperty(name = "Month", dispId = 0x3)
    Integer getMonth();
            
    /**
     * The Month component of the value (must be in the range 1-12)
     *
     * <p>id(0x3)</p>
     * <p>vtableId(14)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "Month", dispId = 0x3)
    void setMonth(Integer param0);
            
    /**
     * Whether the Month component is specified
     *
     * <p>id(0x4)</p>
     * <p>vtableId(15)</p>
     */
    @ComProperty(name = "MonthSpecified", dispId = 0x4)
    Boolean getMonthSpecified();
            
    /**
     * Whether the Month component is specified
     *
     * <p>id(0x4)</p>
     * <p>vtableId(16)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "MonthSpecified", dispId = 0x4)
    void setMonthSpecified(Boolean param0);
            
    /**
     * The Day component of the value (must be in the range 1-31, or 0-999999 for interval values)
     *
     * <p>id(0x5)</p>
     * <p>vtableId(17)</p>
     */
    @ComProperty(name = "Day", dispId = 0x5)
    Integer getDay();
            
    /**
     * The Day component of the value (must be in the range 1-31, or 0-999999 for interval values)
     *
     * <p>id(0x5)</p>
     * <p>vtableId(18)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "Day", dispId = 0x5)
    void setDay(Integer param0);
            
    /**
     * Whether the Day component is specified
     *
     * <p>id(0x6)</p>
     * <p>vtableId(19)</p>
     */
    @ComProperty(name = "DaySpecified", dispId = 0x6)
    Boolean getDaySpecified();
            
    /**
     * Whether the Day component is specified
     *
     * <p>id(0x6)</p>
     * <p>vtableId(20)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "DaySpecified", dispId = 0x6)
    void setDaySpecified(Boolean param0);
            
    /**
     * The Hours component of the value (must be in the range 0-23)
     *
     * <p>id(0x7)</p>
     * <p>vtableId(21)</p>
     */
    @ComProperty(name = "Hours", dispId = 0x7)
    Integer getHours();
            
    /**
     * The Hours component of the value (must be in the range 0-23)
     *
     * <p>id(0x7)</p>
     * <p>vtableId(22)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "Hours", dispId = 0x7)
    void setHours(Integer param0);
            
    /**
     * Whether the Hours component is specified
     *
     * <p>id(0x8)</p>
     * <p>vtableId(23)</p>
     */
    @ComProperty(name = "HoursSpecified", dispId = 0x8)
    Boolean getHoursSpecified();
            
    /**
     * Whether the Hours component is specified
     *
     * <p>id(0x8)</p>
     * <p>vtableId(24)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "HoursSpecified", dispId = 0x8)
    void setHoursSpecified(Boolean param0);
            
    /**
     * The Minutes component of the value (must be in the range 0-59)
     *
     * <p>id(0x9)</p>
     * <p>vtableId(25)</p>
     */
    @ComProperty(name = "Minutes", dispId = 0x9)
    Integer getMinutes();
            
    /**
     * The Minutes component of the value (must be in the range 0-59)
     *
     * <p>id(0x9)</p>
     * <p>vtableId(26)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "Minutes", dispId = 0x9)
    void setMinutes(Integer param0);
            
    /**
     * Whether the Minutes component is specified
     *
     * <p>id(0xa)</p>
     * <p>vtableId(27)</p>
     */
    @ComProperty(name = "MinutesSpecified", dispId = 0xa)
    Boolean getMinutesSpecified();
            
    /**
     * Whether the Minutes component is specified
     *
     * <p>id(0xa)</p>
     * <p>vtableId(28)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "MinutesSpecified", dispId = 0xa)
    void setMinutesSpecified(Boolean param0);
            
    /**
     * The Seconds component of the value (must be in the range 0-59)
     *
     * <p>id(0xb)</p>
     * <p>vtableId(29)</p>
     */
    @ComProperty(name = "Seconds", dispId = 0xb)
    Integer getSeconds();
            
    /**
     * The Seconds component of the value (must be in the range 0-59)
     *
     * <p>id(0xb)</p>
     * <p>vtableId(30)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "Seconds", dispId = 0xb)
    void setSeconds(Integer param0);
            
    /**
     * Whether the Seconds component is specified
     *
     * <p>id(0xc)</p>
     * <p>vtableId(31)</p>
     */
    @ComProperty(name = "SecondsSpecified", dispId = 0xc)
    Boolean getSecondsSpecified();
            
    /**
     * Whether the Seconds component is specified
     *
     * <p>id(0xc)</p>
     * <p>vtableId(32)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "SecondsSpecified", dispId = 0xc)
    void setSecondsSpecified(Boolean param0);
            
    /**
     * The Microseconds component of the value (must be in the range 0-999999)
     *
     * <p>id(0xd)</p>
     * <p>vtableId(33)</p>
     */
    @ComProperty(name = "Microseconds", dispId = 0xd)
    Integer getMicroseconds();
            
    /**
     * The Microseconds component of the value (must be in the range 0-999999)
     *
     * <p>id(0xd)</p>
     * <p>vtableId(34)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "Microseconds", dispId = 0xd)
    void setMicroseconds(Integer param0);
            
    /**
     * Whether the Microseconds component is specified
     *
     * <p>id(0xe)</p>
     * <p>vtableId(35)</p>
     */
    @ComProperty(name = "MicrosecondsSpecified", dispId = 0xe)
    Boolean getMicrosecondsSpecified();
            
    /**
     * Whether the Microseconds component is specified
     *
     * <p>id(0xe)</p>
     * <p>vtableId(36)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "MicrosecondsSpecified", dispId = 0xe)
    void setMicrosecondsSpecified(Boolean param0);
            
    /**
     * The UTC component of the value (must be in the range -720 to 720)
     *
     * <p>id(0xf)</p>
     * <p>vtableId(37)</p>
     */
    @ComProperty(name = "UTC", dispId = 0xf)
    Integer getUTC();
            
    /**
     * The UTC component of the value (must be in the range -720 to 720)
     *
     * <p>id(0xf)</p>
     * <p>vtableId(38)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "UTC", dispId = 0xf)
    void setUTC(Integer param0);
            
    /**
     * Whether the UTC component is specified
     *
     * <p>id(0x10)</p>
     * <p>vtableId(39)</p>
     */
    @ComProperty(name = "UTCSpecified", dispId = 0x10)
    Boolean getUTCSpecified();
            
    /**
     * Whether the UTC component is specified
     *
     * <p>id(0x10)</p>
     * <p>vtableId(40)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "UTCSpecified", dispId = 0x10)
    void setUTCSpecified(Boolean param0);
            
    /**
     * Indicates whether this value describes an absolute date and time or is an interval
     *
     * <p>id(0x11)</p>
     * <p>vtableId(41)</p>
     */
    @ComProperty(name = "IsInterval", dispId = 0x11)
    Boolean getIsInterval();
            
    /**
     * Indicates whether this value describes an absolute date and time or is an interval
     *
     * <p>id(0x11)</p>
     * <p>vtableId(42)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "IsInterval", dispId = 0x11)
    void setIsInterval(Boolean param0);
            
    /**
     * Retrieve value in Variant compatible (VT_DATE) format
     *
     * <p>id(0x12)</p>
     * <p>vtableId(43)</p>
     * @param bIsLocal [in, optional] {@code Boolean}
     */
    @ComMethod(name = "GetVarDate", dispId = 0x12)
    java.util.Date GetVarDate(Object bIsLocal);
            
    /**
     * Set the value using Variant compatible (VT_DATE) format
     *
     * <p>id(0x13)</p>
     * <p>vtableId(44)</p>
     * @param dVarDate [in] {@code java.util.Date}
     * @param bIsLocal [in, optional] {@code Boolean}
     */
    @ComMethod(name = "SetVarDate", dispId = 0x13)
    void SetVarDate(java.util.Date dVarDate,
            Object bIsLocal);
            
    /**
     * Retrieve value in FILETIME compatible string representation
     *
     * <p>id(0x14)</p>
     * <p>vtableId(45)</p>
     * @param bIsLocal [in, optional] {@code Boolean}
     */
    @ComMethod(name = "GetFileTime", dispId = 0x14)
    String GetFileTime(Object bIsLocal);
            
    /**
     * Set the value using FILETIME compatible string representation
     *
     * <p>id(0x15)</p>
     * <p>vtableId(46)</p>
     * @param strFileTime [in] {@code String}
     * @param bIsLocal [in, optional] {@code Boolean}
     */
    @ComMethod(name = "SetFileTime", dispId = 0x15)
    void SetFileTime(String strFileTime,
            Object bIsLocal);
            
    
}