
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
     * <p>id(0x197)</p>
     * <p>vtableId(11)</p>
     */
    @ComMethod(name = "Apply", dispId = 0x197)
    void Apply();
            
    /**
     * <p>id(0xf032)</p>
     * <p>vtableId(12)</p>
     * @param Name [in] {@code String}
     * @param SaveOption [in, optional] {@code OlViewSaveOption}
     */
    @ComMethod(name = "Copy", dispId = 0xf032)
    View Copy(String Name,
            OlViewSaveOption SaveOption);
            
    /**
     * <p>id(0xf04a)</p>
     * <p>vtableId(13)</p>
     */
    @ComMethod(name = "Delete", dispId = 0xf04a)
    void Delete();
            
    /**
     * <p>id(0xfa44)</p>
     * <p>vtableId(14)</p>
     */
    @ComMethod(name = "Reset", dispId = 0xfa44)
    void Reset();
            
    /**
     * <p>id(0xf048)</p>
     * <p>vtableId(15)</p>
     */
    @ComMethod(name = "Save", dispId = 0xf048)
    void Save();
            
    /**
     * <p>id(0xfa41)</p>
     * <p>vtableId(16)</p>
     */
    @ComProperty(name = "Language", dispId = 0xfa41)
    String getLanguage();
            
    /**
     * <p>id(0xfa41)</p>
     * <p>vtableId(17)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "Language", dispId = 0xfa41)
    void setLanguage(String param0);
            
    /**
     * <p>id(0xfa40)</p>
     * <p>vtableId(18)</p>
     */
    @ComProperty(name = "LockUserChanges", dispId = 0xfa40)
    Boolean getLockUserChanges();
            
    /**
     * <p>id(0xfa40)</p>
     * <p>vtableId(19)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "LockUserChanges", dispId = 0xfa40)
    void setLockUserChanges(Boolean param0);
            
    /**
     * <p>id(0x0)</p>
     * <p>vtableId(20)</p>
     */
    @ComProperty(name = "Name", dispId = 0x0)
    String getName();
            
    /**
     * <p>id(0x0)</p>
     * <p>vtableId(21)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "Name", dispId = 0x0)
    void setName(String param0);
            
    /**
     * <p>id(0xfa3f)</p>
     * <p>vtableId(22)</p>
     */
    @ComProperty(name = "SaveOption", dispId = 0xfa3f)
    OlViewSaveOption getSaveOption();
            
    /**
     * <p>id(0xfa3e)</p>
     * <p>vtableId(23)</p>
     */
    @ComProperty(name = "Standard", dispId = 0xfa3e)
    Boolean getStandard();
            
    /**
     * <p>id(0x194)</p>
     * <p>vtableId(24)</p>
     */
    @ComProperty(name = "ViewType", dispId = 0x194)
    OlViewType getViewType();
            
    /**
     * <p>id(0xfa3c)</p>
     * <p>vtableId(25)</p>
     */
    @ComProperty(name = "XML", dispId = 0xfa3c)
    String getXML();
            
    /**
     * <p>id(0xfa3c)</p>
     * <p>vtableId(26)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "XML", dispId = 0xfa3c)
    void setXML(String param0);
            
    /**
     * <p>id(0xfa36)</p>
     * <p>vtableId(27)</p>
     * @param Date [in] {@code java.util.Date}
     */
    @ComMethod(name = "GoToDate", dispId = 0xfa36)
    void GoToDate(java.util.Date Date);
            
    /**
     * <p>id(0x199)</p>
     * <p>vtableId(28)</p>
     */
    @ComProperty(name = "Filter", dispId = 0x199)
    String getFilter();
            
    /**
     * <p>id(0x199)</p>
     * <p>vtableId(29)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "Filter", dispId = 0x199)
    void setFilter(String param0);
            
    /**
     * <p>id(0x2101)</p>
     * <p>vtableId(30)</p>
     */
    @ComProperty(name = "StartField", dispId = 0x2101)
    String getStartField();
            
    /**
     * <p>id(0x2101)</p>
     * <p>vtableId(31)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "StartField", dispId = 0x2101)
    void setStartField(String param0);
            
    /**
     * <p>id(0xfb7b)</p>
     * <p>vtableId(32)</p>
     */
    @ComProperty(name = "EndField", dispId = 0xfb7b)
    String getEndField();
            
    /**
     * <p>id(0xfb7b)</p>
     * <p>vtableId(33)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "EndField", dispId = 0xfb7b)
    void setEndField(String param0);
            
    /**
     * <p>id(0xfb58)</p>
     * <p>vtableId(34)</p>
     */
    @ComProperty(name = "GroupByFields", dispId = 0xfb58)
    OrderFields getGroupByFields();
            
    /**
     * <p>id(0xfb80)</p>
     * <p>vtableId(35)</p>
     */
    @ComProperty(name = "DefaultExpandCollapseSetting", dispId = 0xfb80)
    OlDefaultExpandCollapseSetting getDefaultExpandCollapseSetting();
            
    /**
     * <p>id(0xfb80)</p>
     * <p>vtableId(36)</p>
     * @param param0 [in] {@code OlDefaultExpandCollapseSetting}
     */
    @ComProperty(name = "DefaultExpandCollapseSetting", dispId = 0xfb80)
    void setDefaultExpandCollapseSetting(OlDefaultExpandCollapseSetting param0);
            
    /**
     * <p>id(0xfb75)</p>
     * <p>vtableId(37)</p>
     */
    @ComProperty(name = "ShowWeekNumbers", dispId = 0xfb75)
    Boolean getShowWeekNumbers();
            
    /**
     * <p>id(0xfb75)</p>
     * <p>vtableId(38)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "ShowWeekNumbers", dispId = 0xfb75)
    void setShowWeekNumbers(Boolean param0);
            
    /**
     * <p>id(0xfa2b)</p>
     * <p>vtableId(39)</p>
     */
    @ComProperty(name = "MaxLabelWidth", dispId = 0xfa2b)
    Integer getMaxLabelWidth();
            
    /**
     * <p>id(0xfa2b)</p>
     * <p>vtableId(40)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "MaxLabelWidth", dispId = 0xfa2b)
    void setMaxLabelWidth(Integer param0);
            
    /**
     * <p>id(0xfb74)</p>
     * <p>vtableId(41)</p>
     */
    @ComProperty(name = "ShowLabelWhenViewingByMonth", dispId = 0xfb74)
    Boolean getShowLabelWhenViewingByMonth();
            
    /**
     * <p>id(0xfb74)</p>
     * <p>vtableId(42)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "ShowLabelWhenViewingByMonth", dispId = 0xfb74)
    void setShowLabelWhenViewingByMonth(Boolean param0);
            
    /**
     * <p>id(0xfa28)</p>
     * <p>vtableId(43)</p>
     */
    @ComProperty(name = "UpperScaleFont", dispId = 0xfa28)
    ViewFont getUpperScaleFont();
            
    /**
     * <p>id(0xfa2c)</p>
     * <p>vtableId(44)</p>
     */
    @ComProperty(name = "LowerScaleFont", dispId = 0xfa2c)
    ViewFont getLowerScaleFont();
            
    /**
     * <p>id(0xfa2d)</p>
     * <p>vtableId(45)</p>
     */
    @ComProperty(name = "ItemFont", dispId = 0xfa2d)
    ViewFont getItemFont();
            
    /**
     * <p>id(0xfb88)</p>
     * <p>vtableId(46)</p>
     */
    @ComProperty(name = "TimelineViewMode", dispId = 0xfb88)
    OlTimelineViewMode getTimelineViewMode();
            
    /**
     * <p>id(0xfb88)</p>
     * <p>vtableId(47)</p>
     * @param param0 [in] {@code OlTimelineViewMode}
     */
    @ComProperty(name = "TimelineViewMode", dispId = 0xfb88)
    void setTimelineViewMode(OlTimelineViewMode param0);
            
    
}