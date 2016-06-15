
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
     * <p>id(0xfb55)</p>
     */
    @ComProperty(name = "ViewFields", dispId = 0xfb55)
    ViewFields getViewFields();
            
    /**
     * <p>id(0xfb58)</p>
     */
    @ComProperty(name = "GroupByFields", dispId = 0xfb58)
    OrderFields getGroupByFields();
            
    /**
     * <p>id(0xfb5a)</p>
     */
    @ComProperty(name = "SortFields", dispId = 0xfb5a)
    OrderFields getSortFields();
            
    /**
     * <p>id(0xfb5b)</p>
     */
    @ComProperty(name = "MaxLinesInMultiLineView", dispId = 0xfb5b)
    Integer getMaxLinesInMultiLineView();
            
    /**
     * <p>id(0xfb5b)</p>
     */
    @ComProperty(name = "MaxLinesInMultiLineView", dispId = 0xfb5b)
    void setMaxLinesInMultiLineView(Integer param0);
            
    /**
     * <p>id(0xfb59)</p>
     */
    @ComProperty(name = "AutomaticGrouping", dispId = 0xfb59)
    Boolean getAutomaticGrouping();
            
    /**
     * <p>id(0xfb59)</p>
     */
    @ComProperty(name = "AutomaticGrouping", dispId = 0xfb59)
    void setAutomaticGrouping(Boolean param0);
            
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
     * <p>id(0xfb5c)</p>
     */
    @ComProperty(name = "AutomaticColumnSizing", dispId = 0xfb5c)
    Boolean getAutomaticColumnSizing();
            
    /**
     * <p>id(0xfb5c)</p>
     */
    @ComProperty(name = "AutomaticColumnSizing", dispId = 0xfb5c)
    void setAutomaticColumnSizing(Boolean param0);
            
    /**
     * <p>id(0xfb5d)</p>
     */
    @ComProperty(name = "MultiLine", dispId = 0xfb5d)
    OlMultiLine getMultiLine();
            
    /**
     * <p>id(0xfb5d)</p>
     */
    @ComProperty(name = "MultiLine", dispId = 0xfb5d)
    void setMultiLine(OlMultiLine param0);
            
    /**
     * <p>id(0xfb5e)</p>
     */
    @ComProperty(name = "MultiLineWidth", dispId = 0xfb5e)
    Integer getMultiLineWidth();
            
    /**
     * <p>id(0xfb5e)</p>
     */
    @ComProperty(name = "MultiLineWidth", dispId = 0xfb5e)
    void setMultiLineWidth(Integer param0);
            
    /**
     * <p>id(0xfb5f)</p>
     */
    @ComProperty(name = "AllowInCellEditing", dispId = 0xfb5f)
    Boolean getAllowInCellEditing();
            
    /**
     * <p>id(0xfb5f)</p>
     */
    @ComProperty(name = "AllowInCellEditing", dispId = 0xfb5f)
    void setAllowInCellEditing(Boolean param0);
            
    /**
     * <p>id(0xfb60)</p>
     */
    @ComProperty(name = "ShowNewItemRow", dispId = 0xfb60)
    Boolean getShowNewItemRow();
            
    /**
     * <p>id(0xfb60)</p>
     */
    @ComProperty(name = "ShowNewItemRow", dispId = 0xfb60)
    void setShowNewItemRow(Boolean param0);
            
    /**
     * <p>id(0xfb61)</p>
     */
    @ComProperty(name = "GridLineStyle", dispId = 0xfb61)
    OlGridLineStyle getGridLineStyle();
            
    /**
     * <p>id(0xfb61)</p>
     */
    @ComProperty(name = "GridLineStyle", dispId = 0xfb61)
    void setGridLineStyle(OlGridLineStyle param0);
            
    /**
     * <p>id(0xfb62)</p>
     */
    @ComProperty(name = "ShowItemsInGroups", dispId = 0xfb62)
    Boolean getShowItemsInGroups();
            
    /**
     * <p>id(0xfb62)</p>
     */
    @ComProperty(name = "ShowItemsInGroups", dispId = 0xfb62)
    void setShowItemsInGroups(Boolean param0);
            
    /**
     * <p>id(0xfb63)</p>
     */
    @ComProperty(name = "ShowReadingPane", dispId = 0xfb63)
    Boolean getShowReadingPane();
            
    /**
     * <p>id(0xfb63)</p>
     */
    @ComProperty(name = "ShowReadingPane", dispId = 0xfb63)
    void setShowReadingPane(Boolean param0);
            
    /**
     * <p>id(0xfb64)</p>
     */
    @ComProperty(name = "HideReadingPaneHeaderInfo", dispId = 0xfb64)
    Boolean getHideReadingPaneHeaderInfo();
            
    /**
     * <p>id(0xfb64)</p>
     */
    @ComProperty(name = "HideReadingPaneHeaderInfo", dispId = 0xfb64)
    void setHideReadingPaneHeaderInfo(Boolean param0);
            
    /**
     * <p>id(0xfb65)</p>
     */
    @ComProperty(name = "ShowUnreadAndFlaggedMessages", dispId = 0xfb65)
    Boolean getShowUnreadAndFlaggedMessages();
            
    /**
     * <p>id(0xfb65)</p>
     */
    @ComProperty(name = "ShowUnreadAndFlaggedMessages", dispId = 0xfb65)
    void setShowUnreadAndFlaggedMessages(Boolean param0);
            
    /**
     * <p>id(0xfb68)</p>
     */
    @ComProperty(name = "RowFont", dispId = 0xfb68)
    ViewFont getRowFont();
            
    /**
     * <p>id(0xfb67)</p>
     */
    @ComProperty(name = "ColumnFont", dispId = 0xfb67)
    ViewFont getColumnFont();
            
    /**
     * <p>id(0xfb69)</p>
     */
    @ComProperty(name = "AutoPreviewFont", dispId = 0xfb69)
    ViewFont getAutoPreviewFont();
            
    /**
     * <p>id(0xfb78)</p>
     */
    @ComProperty(name = "AutoPreview", dispId = 0xfb78)
    OlAutoPreview getAutoPreview();
            
    /**
     * <p>id(0xfb78)</p>
     */
    @ComProperty(name = "AutoPreview", dispId = 0xfb78)
    void setAutoPreview(OlAutoPreview param0);
            
    /**
     * <p>id(0xfa3b)</p>
     */
    @ComProperty(name = "AutoFormatRules", dispId = 0xfa3b)
    AutoFormatRules getAutoFormatRules();
            
    /**
     * <p>id(0xfb1d)</p>
     */
    @ComMethod(name = "GetTable", dispId = 0xfb1d)
    Table GetTable();
            
    /**
     * <p>id(0xfc80)</p>
     */
    @ComProperty(name = "ShowConversationByDate", dispId = 0xfc80)
    Boolean getShowConversationByDate();
            
    /**
     * <p>id(0xfc80)</p>
     */
    @ComProperty(name = "ShowConversationByDate", dispId = 0xfc80)
    void setShowConversationByDate(Boolean param0);
            
    /**
     * <p>id(0xfc81)</p>
     */
    @ComProperty(name = "ShowFullConversations", dispId = 0xfc81)
    Boolean getShowFullConversations();
            
    /**
     * <p>id(0xfc81)</p>
     */
    @ComProperty(name = "ShowFullConversations", dispId = 0xfc81)
    void setShowFullConversations(Boolean param0);
            
    /**
     * <p>id(0xfc83)</p>
     */
    @ComProperty(name = "AlwaysExpandConversation", dispId = 0xfc83)
    Boolean getAlwaysExpandConversation();
            
    /**
     * <p>id(0xfc83)</p>
     */
    @ComProperty(name = "AlwaysExpandConversation", dispId = 0xfc83)
    void setAlwaysExpandConversation(Boolean param0);
            
    /**
     * <p>id(0xfc89)</p>
     */
    @ComProperty(name = "ShowConversationSendersAboveSubject", dispId = 0xfc89)
    Boolean getShowConversationSendersAboveSubject();
            
    /**
     * <p>id(0xfc89)</p>
     */
    @ComProperty(name = "ShowConversationSendersAboveSubject", dispId = 0xfc89)
    void setShowConversationSendersAboveSubject(Boolean param0);
            
    
}