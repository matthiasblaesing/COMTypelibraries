
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00063096-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{00063096-0000-0000-C000-000000000046}")
public interface _TableView extends IUnknown, IRawDispatchHandle, IDispatch {
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
     * <p>id(0xfb55)</p>
     * <p>vtableId(30)</p>
     */
    @ComProperty(name = "ViewFields", dispId = 0xfb55)
    ViewFields getViewFields();
            
    /**
     * <p>id(0xfb58)</p>
     * <p>vtableId(31)</p>
     */
    @ComProperty(name = "GroupByFields", dispId = 0xfb58)
    OrderFields getGroupByFields();
            
    /**
     * <p>id(0xfb5a)</p>
     * <p>vtableId(32)</p>
     */
    @ComProperty(name = "SortFields", dispId = 0xfb5a)
    OrderFields getSortFields();
            
    /**
     * <p>id(0xfb5b)</p>
     * <p>vtableId(33)</p>
     */
    @ComProperty(name = "MaxLinesInMultiLineView", dispId = 0xfb5b)
    Integer getMaxLinesInMultiLineView();
            
    /**
     * <p>id(0xfb5b)</p>
     * <p>vtableId(34)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "MaxLinesInMultiLineView", dispId = 0xfb5b)
    void setMaxLinesInMultiLineView(Integer param0);
            
    /**
     * <p>id(0xfb59)</p>
     * <p>vtableId(35)</p>
     */
    @ComProperty(name = "AutomaticGrouping", dispId = 0xfb59)
    Boolean getAutomaticGrouping();
            
    /**
     * <p>id(0xfb59)</p>
     * <p>vtableId(36)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "AutomaticGrouping", dispId = 0xfb59)
    void setAutomaticGrouping(Boolean param0);
            
    /**
     * <p>id(0xfb80)</p>
     * <p>vtableId(37)</p>
     */
    @ComProperty(name = "DefaultExpandCollapseSetting", dispId = 0xfb80)
    OlDefaultExpandCollapseSetting getDefaultExpandCollapseSetting();
            
    /**
     * <p>id(0xfb80)</p>
     * <p>vtableId(38)</p>
     * @param param0 [in] {@code OlDefaultExpandCollapseSetting}
     */
    @ComProperty(name = "DefaultExpandCollapseSetting", dispId = 0xfb80)
    void setDefaultExpandCollapseSetting(OlDefaultExpandCollapseSetting param0);
            
    /**
     * <p>id(0xfb5c)</p>
     * <p>vtableId(39)</p>
     */
    @ComProperty(name = "AutomaticColumnSizing", dispId = 0xfb5c)
    Boolean getAutomaticColumnSizing();
            
    /**
     * <p>id(0xfb5c)</p>
     * <p>vtableId(40)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "AutomaticColumnSizing", dispId = 0xfb5c)
    void setAutomaticColumnSizing(Boolean param0);
            
    /**
     * <p>id(0xfb5d)</p>
     * <p>vtableId(41)</p>
     */
    @ComProperty(name = "MultiLine", dispId = 0xfb5d)
    OlMultiLine getMultiLine();
            
    /**
     * <p>id(0xfb5d)</p>
     * <p>vtableId(42)</p>
     * @param param0 [in] {@code OlMultiLine}
     */
    @ComProperty(name = "MultiLine", dispId = 0xfb5d)
    void setMultiLine(OlMultiLine param0);
            
    /**
     * <p>id(0xfb5e)</p>
     * <p>vtableId(43)</p>
     */
    @ComProperty(name = "MultiLineWidth", dispId = 0xfb5e)
    Integer getMultiLineWidth();
            
    /**
     * <p>id(0xfb5e)</p>
     * <p>vtableId(44)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "MultiLineWidth", dispId = 0xfb5e)
    void setMultiLineWidth(Integer param0);
            
    /**
     * <p>id(0xfb5f)</p>
     * <p>vtableId(45)</p>
     */
    @ComProperty(name = "AllowInCellEditing", dispId = 0xfb5f)
    Boolean getAllowInCellEditing();
            
    /**
     * <p>id(0xfb5f)</p>
     * <p>vtableId(46)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "AllowInCellEditing", dispId = 0xfb5f)
    void setAllowInCellEditing(Boolean param0);
            
    /**
     * <p>id(0xfb60)</p>
     * <p>vtableId(47)</p>
     */
    @ComProperty(name = "ShowNewItemRow", dispId = 0xfb60)
    Boolean getShowNewItemRow();
            
    /**
     * <p>id(0xfb60)</p>
     * <p>vtableId(48)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "ShowNewItemRow", dispId = 0xfb60)
    void setShowNewItemRow(Boolean param0);
            
    /**
     * <p>id(0xfb61)</p>
     * <p>vtableId(49)</p>
     */
    @ComProperty(name = "GridLineStyle", dispId = 0xfb61)
    OlGridLineStyle getGridLineStyle();
            
    /**
     * <p>id(0xfb61)</p>
     * <p>vtableId(50)</p>
     * @param param0 [in] {@code OlGridLineStyle}
     */
    @ComProperty(name = "GridLineStyle", dispId = 0xfb61)
    void setGridLineStyle(OlGridLineStyle param0);
            
    /**
     * <p>id(0xfb62)</p>
     * <p>vtableId(51)</p>
     */
    @ComProperty(name = "ShowItemsInGroups", dispId = 0xfb62)
    Boolean getShowItemsInGroups();
            
    /**
     * <p>id(0xfb62)</p>
     * <p>vtableId(52)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "ShowItemsInGroups", dispId = 0xfb62)
    void setShowItemsInGroups(Boolean param0);
            
    /**
     * <p>id(0xfb63)</p>
     * <p>vtableId(53)</p>
     */
    @ComProperty(name = "ShowReadingPane", dispId = 0xfb63)
    Boolean getShowReadingPane();
            
    /**
     * <p>id(0xfb63)</p>
     * <p>vtableId(54)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "ShowReadingPane", dispId = 0xfb63)
    void setShowReadingPane(Boolean param0);
            
    /**
     * <p>id(0xfb64)</p>
     * <p>vtableId(55)</p>
     */
    @ComProperty(name = "HideReadingPaneHeaderInfo", dispId = 0xfb64)
    Boolean getHideReadingPaneHeaderInfo();
            
    /**
     * <p>id(0xfb64)</p>
     * <p>vtableId(56)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "HideReadingPaneHeaderInfo", dispId = 0xfb64)
    void setHideReadingPaneHeaderInfo(Boolean param0);
            
    /**
     * <p>id(0xfb65)</p>
     * <p>vtableId(57)</p>
     */
    @ComProperty(name = "ShowUnreadAndFlaggedMessages", dispId = 0xfb65)
    Boolean getShowUnreadAndFlaggedMessages();
            
    /**
     * <p>id(0xfb65)</p>
     * <p>vtableId(58)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "ShowUnreadAndFlaggedMessages", dispId = 0xfb65)
    void setShowUnreadAndFlaggedMessages(Boolean param0);
            
    /**
     * <p>id(0xfb68)</p>
     * <p>vtableId(59)</p>
     */
    @ComProperty(name = "RowFont", dispId = 0xfb68)
    ViewFont getRowFont();
            
    /**
     * <p>id(0xfb67)</p>
     * <p>vtableId(60)</p>
     */
    @ComProperty(name = "ColumnFont", dispId = 0xfb67)
    ViewFont getColumnFont();
            
    /**
     * <p>id(0xfb69)</p>
     * <p>vtableId(61)</p>
     */
    @ComProperty(name = "AutoPreviewFont", dispId = 0xfb69)
    ViewFont getAutoPreviewFont();
            
    /**
     * <p>id(0xfb78)</p>
     * <p>vtableId(62)</p>
     */
    @ComProperty(name = "AutoPreview", dispId = 0xfb78)
    OlAutoPreview getAutoPreview();
            
    /**
     * <p>id(0xfb78)</p>
     * <p>vtableId(63)</p>
     * @param param0 [in] {@code OlAutoPreview}
     */
    @ComProperty(name = "AutoPreview", dispId = 0xfb78)
    void setAutoPreview(OlAutoPreview param0);
            
    /**
     * <p>id(0xfa3b)</p>
     * <p>vtableId(64)</p>
     */
    @ComProperty(name = "AutoFormatRules", dispId = 0xfa3b)
    AutoFormatRules getAutoFormatRules();
            
    /**
     * <p>id(0xfb1d)</p>
     * <p>vtableId(65)</p>
     */
    @ComMethod(name = "GetTable", dispId = 0xfb1d)
    Table GetTable();
            
    /**
     * <p>id(0xfc80)</p>
     * <p>vtableId(66)</p>
     */
    @ComProperty(name = "ShowConversationByDate", dispId = 0xfc80)
    Boolean getShowConversationByDate();
            
    /**
     * <p>id(0xfc80)</p>
     * <p>vtableId(67)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "ShowConversationByDate", dispId = 0xfc80)
    void setShowConversationByDate(Boolean param0);
            
    /**
     * <p>id(0xfc81)</p>
     * <p>vtableId(68)</p>
     */
    @ComProperty(name = "ShowFullConversations", dispId = 0xfc81)
    Boolean getShowFullConversations();
            
    /**
     * <p>id(0xfc81)</p>
     * <p>vtableId(69)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "ShowFullConversations", dispId = 0xfc81)
    void setShowFullConversations(Boolean param0);
            
    /**
     * <p>id(0xfc83)</p>
     * <p>vtableId(70)</p>
     */
    @ComProperty(name = "AlwaysExpandConversation", dispId = 0xfc83)
    Boolean getAlwaysExpandConversation();
            
    /**
     * <p>id(0xfc83)</p>
     * <p>vtableId(71)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "AlwaysExpandConversation", dispId = 0xfc83)
    void setAlwaysExpandConversation(Boolean param0);
            
    /**
     * <p>id(0xfc89)</p>
     * <p>vtableId(72)</p>
     */
    @ComProperty(name = "ShowConversationSendersAboveSubject", dispId = 0xfc89)
    Boolean getShowConversationSendersAboveSubject();
            
    /**
     * <p>id(0xfc89)</p>
     * <p>vtableId(73)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "ShowConversationSendersAboveSubject", dispId = 0xfc89)
    void setShowConversationSendersAboveSubject(Boolean param0);
            
    
}