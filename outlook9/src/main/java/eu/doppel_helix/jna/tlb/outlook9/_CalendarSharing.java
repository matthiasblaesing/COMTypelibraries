
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000630E2-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000630E2-0000-0000-C000-000000000046}")
public interface _CalendarSharing extends IUnknown, IRawDispatchHandle, IDispatch {
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
     * <p>id(0xfb98)</p>
     * <p>vtableId(11)</p>
     * @param Path [in] {@code String}
     */
    @ComMethod(name = "SaveAsICal", dispId = 0xfb98)
    void SaveAsICal(String Path);
            
    /**
     * <p>id(0xfb99)</p>
     * <p>vtableId(12)</p>
     * @param MailFormat [in] {@code OlCalendarMailFormat}
     */
    @ComMethod(name = "ForwardAsICal", dispId = 0xfb99)
    MailItem ForwardAsICal(OlCalendarMailFormat MailFormat);
            
    /**
     * <p>id(0xfb9a)</p>
     * <p>vtableId(13)</p>
     */
    @ComProperty(name = "CalendarDetail", dispId = 0xfb9a)
    OlCalendarDetail getCalendarDetail();
            
    /**
     * <p>id(0xfb9a)</p>
     * <p>vtableId(14)</p>
     * @param param0 [in] {@code OlCalendarDetail}
     */
    @ComProperty(name = "CalendarDetail", dispId = 0xfb9a)
    void setCalendarDetail(OlCalendarDetail param0);
            
    /**
     * <p>id(0xfb9b)</p>
     * <p>vtableId(15)</p>
     */
    @ComProperty(name = "EndDate", dispId = 0xfb9b)
    java.util.Date getEndDate();
            
    /**
     * <p>id(0xfb9b)</p>
     * <p>vtableId(16)</p>
     * @param param0 [in] {@code java.util.Date}
     */
    @ComProperty(name = "EndDate", dispId = 0xfb9b)
    void setEndDate(java.util.Date param0);
            
    /**
     * <p>id(0xfb9c)</p>
     * <p>vtableId(17)</p>
     */
    @ComProperty(name = "Folder", dispId = 0xfb9c)
    MAPIFolder getFolder();
            
    /**
     * <p>id(0xfb9d)</p>
     * <p>vtableId(18)</p>
     */
    @ComProperty(name = "IncludeAttachments", dispId = 0xfb9d)
    Boolean getIncludeAttachments();
            
    /**
     * <p>id(0xfb9d)</p>
     * <p>vtableId(19)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "IncludeAttachments", dispId = 0xfb9d)
    void setIncludeAttachments(Boolean param0);
            
    /**
     * <p>id(0xfb9e)</p>
     * <p>vtableId(20)</p>
     */
    @ComProperty(name = "IncludePrivateDetails", dispId = 0xfb9e)
    Boolean getIncludePrivateDetails();
            
    /**
     * <p>id(0xfb9e)</p>
     * <p>vtableId(21)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "IncludePrivateDetails", dispId = 0xfb9e)
    void setIncludePrivateDetails(Boolean param0);
            
    /**
     * <p>id(0xfb9f)</p>
     * <p>vtableId(22)</p>
     */
    @ComProperty(name = "RestrictToWorkingHours", dispId = 0xfb9f)
    Boolean getRestrictToWorkingHours();
            
    /**
     * <p>id(0xfb9f)</p>
     * <p>vtableId(23)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "RestrictToWorkingHours", dispId = 0xfb9f)
    void setRestrictToWorkingHours(Boolean param0);
            
    /**
     * <p>id(0xfba0)</p>
     * <p>vtableId(24)</p>
     */
    @ComProperty(name = "StartDate", dispId = 0xfba0)
    java.util.Date getStartDate();
            
    /**
     * <p>id(0xfba0)</p>
     * <p>vtableId(25)</p>
     * @param param0 [in] {@code java.util.Date}
     */
    @ComProperty(name = "StartDate", dispId = 0xfba0)
    void setStartDate(java.util.Date param0);
            
    /**
     * <p>id(0xfba1)</p>
     * <p>vtableId(26)</p>
     */
    @ComProperty(name = "IncludeWholeCalendar", dispId = 0xfba1)
    Boolean getIncludeWholeCalendar();
            
    /**
     * <p>id(0xfba1)</p>
     * <p>vtableId(27)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "IncludeWholeCalendar", dispId = 0xfba1)
    void setIncludeWholeCalendar(Boolean param0);
            
    
}