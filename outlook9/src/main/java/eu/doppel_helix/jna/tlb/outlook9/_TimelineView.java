
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({0006309C-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{0006309C-0000-0000-C000-000000000046}")
public interface _TimelineView extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0xf000)</p>
     */
    @ComProperty(name = "Application", dispId = 0xf000)
    _Application getApplication();
            
    /**
     * <p>id(0xf00a)</p>
     */
    @ComProperty(name = "Class", dispId = 0xf00a)
    OlObjectClass get_Class();
            
    /**
     * <p>id(0xf00b)</p>
     */
    @ComProperty(name = "Session", dispId = 0xf00b)
    _NameSpace getSession();
            
    /**
     * <p>id(0xf001)</p>
     */
    @ComProperty(name = "Parent", dispId = 0xf001)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * <p>id(0x197)</p>
     */
    @ComMethod(name = "Apply", dispId = 0x197)
    void Apply();
            
    /**
     * <p>id(0xf032)</p>
     */
    @ComMethod(name = "Copy", dispId = 0xf032)
    View Copy(String Name,
            OlViewSaveOption SaveOption);
            
    /**
     * <p>id(0xf04a)</p>
     */
    @ComMethod(name = "Delete", dispId = 0xf04a)
    void Delete();
            
    /**
     * <p>id(0xfa44)</p>
     */
    @ComMethod(name = "Reset", dispId = 0xfa44)
    void Reset();
            
    /**
     * <p>id(0xf048)</p>
     */
    @ComMethod(name = "Save", dispId = 0xf048)
    void Save();
            
    /**
     * <p>id(0xfa41)</p>
     */
    @ComProperty(name = "Language", dispId = 0xfa41)
    String getLanguage();
            
    /**
     * <p>id(0xfa41)</p>
     */
    @ComProperty(name = "Language", dispId = 0xfa41)
    void setLanguage(String param0);
            
    /**
     * <p>id(0xfa40)</p>
     */
    @ComProperty(name = "LockUserChanges", dispId = 0xfa40)
    Boolean getLockUserChanges();
            
    /**
     * <p>id(0xfa40)</p>
     */
    @ComProperty(name = "LockUserChanges", dispId = 0xfa40)
    void setLockUserChanges(Boolean param0);
            
    /**
     * <p>id(0x0)</p>
     */
    @ComProperty(name = "Name", dispId = 0x0)
    String getName();
            
    /**
     * <p>id(0x0)</p>
     */
    @ComProperty(name = "Name", dispId = 0x0)
    void setName(String param0);
            
    /**
     * <p>id(0xfa3f)</p>
     */
    @ComProperty(name = "SaveOption", dispId = 0xfa3f)
    OlViewSaveOption getSaveOption();
            
    /**
     * <p>id(0xfa3e)</p>
     */
    @ComProperty(name = "Standard", dispId = 0xfa3e)
    Boolean getStandard();
            
    /**
     * <p>id(0x194)</p>
     */
    @ComProperty(name = "ViewType", dispId = 0x194)
    OlViewType getViewType();
            
    /**
     * <p>id(0xfa3c)</p>
     */
    @ComProperty(name = "XML", dispId = 0xfa3c)
    String getXML();
            
    /**
     * <p>id(0xfa3c)</p>
     */
    @ComProperty(name = "XML", dispId = 0xfa3c)
    void setXML(String param0);
            
    /**
     * <p>id(0xfa36)</p>
     */
    @ComMethod(name = "GoToDate", dispId = 0xfa36)
    void GoToDate(java.util.Date Date);
            
    /**
     * <p>id(0x199)</p>
     */
    @ComProperty(name = "Filter", dispId = 0x199)
    String getFilter();
            
    /**
     * <p>id(0x199)</p>
     */
    @ComProperty(name = "Filter", dispId = 0x199)
    void setFilter(String param0);
            
    /**
     * <p>id(0x2101)</p>
     */
    @ComProperty(name = "StartField", dispId = 0x2101)
    String getStartField();
            
    /**
     * <p>id(0x2101)</p>
     */
    @ComProperty(name = "StartField", dispId = 0x2101)
    void setStartField(String param0);
            
    /**
     * <p>id(0xfb7b)</p>
     */
    @ComProperty(name = "EndField", dispId = 0xfb7b)
    String getEndField();
            
    /**
     * <p>id(0xfb7b)</p>
     */
    @ComProperty(name = "EndField", dispId = 0xfb7b)
    void setEndField(String param0);
            
    /**
     * <p>id(0xfb58)</p>
     */
    @ComProperty(name = "GroupByFields", dispId = 0xfb58)
    OrderFields getGroupByFields();
            
    /**
     * <p>id(0xfb80)</p>
     */
    @ComProperty(name = "DefaultExpandCollapseSetting", dispId = 0xfb80)
    OlDefaultExpandCollapseSetting getDefaultExpandCollapseSetting();
            
    /**
     * <p>id(0xfb80)</p>
     */
    @ComProperty(name = "DefaultExpandCollapseSetting", dispId = 0xfb80)
    void setDefaultExpandCollapseSetting(OlDefaultExpandCollapseSetting param0);
            
    /**
     * <p>id(0xfb75)</p>
     */
    @ComProperty(name = "ShowWeekNumbers", dispId = 0xfb75)
    Boolean getShowWeekNumbers();
            
    /**
     * <p>id(0xfb75)</p>
     */
    @ComProperty(name = "ShowWeekNumbers", dispId = 0xfb75)
    void setShowWeekNumbers(Boolean param0);
            
    /**
     * <p>id(0xfa2b)</p>
     */
    @ComProperty(name = "MaxLabelWidth", dispId = 0xfa2b)
    Integer getMaxLabelWidth();
            
    /**
     * <p>id(0xfa2b)</p>
     */
    @ComProperty(name = "MaxLabelWidth", dispId = 0xfa2b)
    void setMaxLabelWidth(Integer param0);
            
    /**
     * <p>id(0xfb74)</p>
     */
    @ComProperty(name = "ShowLabelWhenViewingByMonth", dispId = 0xfb74)
    Boolean getShowLabelWhenViewingByMonth();
            
    /**
     * <p>id(0xfb74)</p>
     */
    @ComProperty(name = "ShowLabelWhenViewingByMonth", dispId = 0xfb74)
    void setShowLabelWhenViewingByMonth(Boolean param0);
            
    /**
     * <p>id(0xfa28)</p>
     */
    @ComProperty(name = "UpperScaleFont", dispId = 0xfa28)
    ViewFont getUpperScaleFont();
            
    /**
     * <p>id(0xfa2c)</p>
     */
    @ComProperty(name = "LowerScaleFont", dispId = 0xfa2c)
    ViewFont getLowerScaleFont();
            
    /**
     * <p>id(0xfa2d)</p>
     */
    @ComProperty(name = "ItemFont", dispId = 0xfa2d)
    ViewFont getItemFont();
            
    /**
     * <p>id(0xfb88)</p>
     */
    @ComProperty(name = "TimelineViewMode", dispId = 0xfb88)
    OlTimelineViewMode getTimelineViewMode();
            
    /**
     * <p>id(0xfb88)</p>
     */
    @ComProperty(name = "TimelineViewMode", dispId = 0xfb88)
    void setTimelineViewMode(OlTimelineViewMode param0);
            
    
}