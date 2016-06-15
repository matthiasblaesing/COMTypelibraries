
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000208DA-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000208DA-0000-0000-C000-000000000046}")
public interface _Workbook extends IUnknown, IRawDispatchHandle, IDispatch {
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
     * <p>id(0x5a1)</p>
     */
    @ComProperty(name = "AcceptLabelsInFormulas", dispId = 0x5a1)
    Boolean getAcceptLabelsInFormulas();
            
    /**
     * <p>id(0x5a1)</p>
     */
    @ComProperty(name = "AcceptLabelsInFormulas", dispId = 0x5a1)
    void setAcceptLabelsInFormulas(Boolean param0);
            
    /**
     * <p>id(0x130)</p>
     */
    @ComMethod(name = "Activate", dispId = 0x130)
    void Activate();
            
    /**
     * <p>id(0xb7)</p>
     */
    @ComProperty(name = "ActiveChart", dispId = 0xb7)
    Chart getActiveChart();
            
    /**
     * <p>id(0x133)</p>
     */
    @ComProperty(name = "ActiveSheet", dispId = 0x133)
    com.sun.jna.platform.win32.COM.util.IDispatch getActiveSheet();
            
    /**
     * <p>id(0x23e)</p>
     */
    @ComProperty(name = "Author", dispId = 0x23e)
    String getAuthor();
            
    /**
     * <p>id(0x23e)</p>
     */
    @ComProperty(name = "Author", dispId = 0x23e)
    void setAuthor(String param0);
            
    /**
     * <p>id(0x5a2)</p>
     */
    @ComProperty(name = "AutoUpdateFrequency", dispId = 0x5a2)
    Integer getAutoUpdateFrequency();
            
    /**
     * <p>id(0x5a2)</p>
     */
    @ComProperty(name = "AutoUpdateFrequency", dispId = 0x5a2)
    void setAutoUpdateFrequency(Integer param0);
            
    /**
     * <p>id(0x5a3)</p>
     */
    @ComProperty(name = "AutoUpdateSaveChanges", dispId = 0x5a3)
    Boolean getAutoUpdateSaveChanges();
            
    /**
     * <p>id(0x5a3)</p>
     */
    @ComProperty(name = "AutoUpdateSaveChanges", dispId = 0x5a3)
    void setAutoUpdateSaveChanges(Boolean param0);
            
    /**
     * <p>id(0x5a4)</p>
     */
    @ComProperty(name = "ChangeHistoryDuration", dispId = 0x5a4)
    Integer getChangeHistoryDuration();
            
    /**
     * <p>id(0x5a4)</p>
     */
    @ComProperty(name = "ChangeHistoryDuration", dispId = 0x5a4)
    void setChangeHistoryDuration(Integer param0);
            
    /**
     * <p>id(0x498)</p>
     */
    @ComProperty(name = "BuiltinDocumentProperties", dispId = 0x498)
    com.sun.jna.platform.win32.COM.util.IDispatch getBuiltinDocumentProperties();
            
    /**
     * <p>id(0x3dd)</p>
     */
    @ComMethod(name = "ChangeFileAccess", dispId = 0x3dd)
    void ChangeFileAccess(XlFileAccess Mode,
            Object WritePassword,
            Object Notify);
            
    /**
     * <p>id(0x322)</p>
     */
    @ComMethod(name = "ChangeLink", dispId = 0x322)
    void ChangeLink(String Name,
            String NewName,
            XlLinkType Type);
            
    /**
     * <p>id(0x79)</p>
     */
    @ComProperty(name = "Charts", dispId = 0x79)
    Sheets getCharts();
            
    /**
     * <p>id(0x115)</p>
     */
    @ComMethod(name = "Close", dispId = 0x115)
    void Close(Object SaveChanges,
            Object Filename,
            Object RouteWorkbook);
            
    /**
     * <p>id(0x55d)</p>
     */
    @ComProperty(name = "CodeName", dispId = 0x55d)
    String getCodeName();
            
    /**
     * <p>id(0x80010000)</p>
     */
    @ComProperty(name = "_CodeName", dispId = 0x80010000)
    String get_CodeName();
            
    /**
     * <p>id(0x80010000)</p>
     */
    @ComProperty(name = "_CodeName", dispId = 0x80010000)
    void set_CodeName(String param0);
            
    /**
     * <p>id(0x11e)</p>
     */
    @ComProperty(name = "Colors", dispId = 0x11e)
    Object getColors(Object Index);
            
    /**
     * <p>id(0x11e)</p>
     */
    @ComProperty(name = "Colors", dispId = 0x11e)
    void setColors(Object Index,
            Object param1);
            
    /**
     * <p>id(0x59f)</p>
     */
    @ComProperty(name = "CommandBars", dispId = 0x59f)
    eu.doppel_helix.jna.tlb.office2.CommandBars getCommandBars();
            
    /**
     * <p>id(0x23f)</p>
     */
    @ComProperty(name = "Comments", dispId = 0x23f)
    String getComments();
            
    /**
     * <p>id(0x23f)</p>
     */
    @ComProperty(name = "Comments", dispId = 0x23f)
    void setComments(String param0);
            
    /**
     * <p>id(0x497)</p>
     */
    @ComProperty(name = "ConflictResolution", dispId = 0x497)
    XlSaveConflictResolution getConflictResolution();
            
    /**
     * <p>id(0x497)</p>
     */
    @ComProperty(name = "ConflictResolution", dispId = 0x497)
    void setConflictResolution(XlSaveConflictResolution param0);
            
    /**
     * <p>id(0x4a6)</p>
     */
    @ComProperty(name = "Container", dispId = 0x4a6)
    com.sun.jna.platform.win32.COM.util.IDispatch getContainer();
            
    /**
     * <p>id(0x11f)</p>
     */
    @ComProperty(name = "CreateBackup", dispId = 0x11f)
    Boolean getCreateBackup();
            
    /**
     * <p>id(0x499)</p>
     */
    @ComProperty(name = "CustomDocumentProperties", dispId = 0x499)
    com.sun.jna.platform.win32.COM.util.IDispatch getCustomDocumentProperties();
            
    /**
     * <p>id(0x193)</p>
     */
    @ComProperty(name = "Date1904", dispId = 0x193)
    Boolean getDate1904();
            
    /**
     * <p>id(0x193)</p>
     */
    @ComProperty(name = "Date1904", dispId = 0x193)
    void setDate1904(Boolean param0);
            
    /**
     * <p>id(0x18d)</p>
     */
    @ComMethod(name = "DeleteNumberFormat", dispId = 0x18d)
    void DeleteNumberFormat(String NumberFormat);
            
    /**
     * <p>id(0x2fc)</p>
     */
    @ComProperty(name = "DialogSheets", dispId = 0x2fc)
    Sheets getDialogSheets();
            
    /**
     * <p>id(0x194)</p>
     */
    @ComProperty(name = "DisplayDrawingObjects", dispId = 0x194)
    XlDisplayDrawingObjects getDisplayDrawingObjects();
            
    /**
     * <p>id(0x194)</p>
     */
    @ComProperty(name = "DisplayDrawingObjects", dispId = 0x194)
    void setDisplayDrawingObjects(XlDisplayDrawingObjects param0);
            
    /**
     * <p>id(0x490)</p>
     */
    @ComMethod(name = "ExclusiveAccess", dispId = 0x490)
    Boolean ExclusiveAccess();
            
    /**
     * <p>id(0x120)</p>
     */
    @ComProperty(name = "FileFormat", dispId = 0x120)
    XlFileFormat getFileFormat();
            
    /**
     * <p>id(0x3cd)</p>
     */
    @ComMethod(name = "ForwardMailer", dispId = 0x3cd)
    void ForwardMailer();
            
    /**
     * <p>id(0x121)</p>
     */
    @ComProperty(name = "FullName", dispId = 0x121)
    String getFullName();
            
    /**
     * <p>id(0x3d0)</p>
     */
    @ComProperty(name = "HasMailer", dispId = 0x3d0)
    Boolean getHasMailer();
            
    /**
     * <p>id(0x3d0)</p>
     */
    @ComProperty(name = "HasMailer", dispId = 0x3d0)
    void setHasMailer(Boolean param0);
            
    /**
     * <p>id(0x122)</p>
     */
    @ComProperty(name = "HasPassword", dispId = 0x122)
    Boolean getHasPassword();
            
    /**
     * <p>id(0x3b6)</p>
     */
    @ComProperty(name = "HasRoutingSlip", dispId = 0x3b6)
    Boolean getHasRoutingSlip();
            
    /**
     * <p>id(0x3b6)</p>
     */
    @ComProperty(name = "HasRoutingSlip", dispId = 0x3b6)
    void setHasRoutingSlip(Boolean param0);
            
    /**
     * <p>id(0x5a5)</p>
     */
    @ComProperty(name = "IsAddin", dispId = 0x5a5)
    Boolean getIsAddin();
            
    /**
     * <p>id(0x5a5)</p>
     */
    @ComProperty(name = "IsAddin", dispId = 0x5a5)
    void setIsAddin(Boolean param0);
            
    /**
     * <p>id(0x241)</p>
     */
    @ComProperty(name = "Keywords", dispId = 0x241)
    String getKeywords();
            
    /**
     * <p>id(0x241)</p>
     */
    @ComProperty(name = "Keywords", dispId = 0x241)
    void setKeywords(String param0);
            
    /**
     * <p>id(0x327)</p>
     */
    @ComMethod(name = "LinkInfo", dispId = 0x327)
    Object LinkInfo(String Name,
            XlLinkInfo LinkInfo,
            Object Type,
            Object EditionRef);
            
    /**
     * <p>id(0x328)</p>
     */
    @ComMethod(name = "LinkSources", dispId = 0x328)
    Object LinkSources(Object Type);
            
    /**
     * <p>id(0x3d3)</p>
     */
    @ComProperty(name = "Mailer", dispId = 0x3d3)
    Mailer getMailer();
            
    /**
     * <p>id(0x5a6)</p>
     */
    @ComMethod(name = "MergeWorkbook", dispId = 0x5a6)
    void MergeWorkbook(Object Filename);
            
    /**
     * <p>id(0x246)</p>
     */
    @ComProperty(name = "Modules", dispId = 0x246)
    Sheets getModules();
            
    /**
     * <p>id(0x491)</p>
     */
    @ComProperty(name = "MultiUserEditing", dispId = 0x491)
    Boolean getMultiUserEditing();
            
    /**
     * <p>id(0x6e)</p>
     */
    @ComProperty(name = "Name", dispId = 0x6e)
    String getName();
            
    /**
     * <p>id(0x1ba)</p>
     */
    @ComProperty(name = "Names", dispId = 0x1ba)
    Names getNames();
            
    /**
     * <p>id(0x118)</p>
     */
    @ComMethod(name = "NewWindow", dispId = 0x118)
    Window NewWindow();
            
    /**
     * <p>id(0x49a)</p>
     */
    @ComProperty(name = "OnSave", dispId = 0x49a)
    String getOnSave();
            
    /**
     * <p>id(0x49a)</p>
     */
    @ComProperty(name = "OnSave", dispId = 0x49a)
    void setOnSave(String param0);
            
    /**
     * <p>id(0x407)</p>
     */
    @ComProperty(name = "OnSheetActivate", dispId = 0x407)
    String getOnSheetActivate();
            
    /**
     * <p>id(0x407)</p>
     */
    @ComProperty(name = "OnSheetActivate", dispId = 0x407)
    void setOnSheetActivate(String param0);
            
    /**
     * <p>id(0x439)</p>
     */
    @ComProperty(name = "OnSheetDeactivate", dispId = 0x439)
    String getOnSheetDeactivate();
            
    /**
     * <p>id(0x439)</p>
     */
    @ComProperty(name = "OnSheetDeactivate", dispId = 0x439)
    void setOnSheetDeactivate(String param0);
            
    /**
     * <p>id(0x323)</p>
     */
    @ComMethod(name = "OpenLinks", dispId = 0x323)
    void OpenLinks(String Name,
            Object ReadOnly,
            Object Type);
            
    /**
     * <p>id(0x123)</p>
     */
    @ComProperty(name = "Path", dispId = 0x123)
    String getPath();
            
    /**
     * <p>id(0x5a7)</p>
     */
    @ComProperty(name = "PersonalViewListSettings", dispId = 0x5a7)
    Boolean getPersonalViewListSettings();
            
    /**
     * <p>id(0x5a7)</p>
     */
    @ComProperty(name = "PersonalViewListSettings", dispId = 0x5a7)
    void setPersonalViewListSettings(Boolean param0);
            
    /**
     * <p>id(0x5a8)</p>
     */
    @ComProperty(name = "PersonalViewPrintSettings", dispId = 0x5a8)
    Boolean getPersonalViewPrintSettings();
            
    /**
     * <p>id(0x5a8)</p>
     */
    @ComProperty(name = "PersonalViewPrintSettings", dispId = 0x5a8)
    void setPersonalViewPrintSettings(Boolean param0);
            
    /**
     * <p>id(0x5a9)</p>
     */
    @ComMethod(name = "PivotCaches", dispId = 0x5a9)
    PivotCaches PivotCaches();
            
    /**
     * <p>id(0x48e)</p>
     */
    @ComMethod(name = "Post", dispId = 0x48e)
    void Post(Object DestName);
            
    /**
     * <p>id(0x195)</p>
     */
    @ComProperty(name = "PrecisionAsDisplayed", dispId = 0x195)
    Boolean getPrecisionAsDisplayed();
            
    /**
     * <p>id(0x195)</p>
     */
    @ComProperty(name = "PrecisionAsDisplayed", dispId = 0x195)
    void setPrecisionAsDisplayed(Boolean param0);
            
    /**
     * <p>id(0x389)</p>
     */
    @ComMethod(name = "__PrintOut", dispId = 0x389)
    void __PrintOut(Object From,
            Object To,
            Object Copies,
            Object Preview,
            Object ActivePrinter,
            Object PrintToFile,
            Object Collate);
            
    /**
     * <p>id(0x119)</p>
     */
    @ComMethod(name = "PrintPreview", dispId = 0x119)
    void PrintPreview(Object EnableChanges);
            
    /**
     * <p>id(0x11a)</p>
     */
    @ComMethod(name = "_Protect", dispId = 0x11a)
    void _Protect(Object Password,
            Object Structure,
            Object Windows);
            
    /**
     * <p>id(0x5aa)</p>
     */
    @ComMethod(name = "_ProtectSharing", dispId = 0x5aa)
    void _ProtectSharing(Object Filename,
            Object Password,
            Object WriteResPassword,
            Object ReadOnlyRecommended,
            Object CreateBackup,
            Object SharingPassword);
            
    /**
     * <p>id(0x24c)</p>
     */
    @ComProperty(name = "ProtectStructure", dispId = 0x24c)
    Boolean getProtectStructure();
            
    /**
     * <p>id(0x127)</p>
     */
    @ComProperty(name = "ProtectWindows", dispId = 0x127)
    Boolean getProtectWindows();
            
    /**
     * <p>id(0x128)</p>
     */
    @ComProperty(name = "ReadOnly", dispId = 0x128)
    Boolean getReadOnly();
            
    /**
     * <p>id(0x129)</p>
     */
    @ComProperty(name = "_ReadOnlyRecommended", dispId = 0x129)
    Boolean get_ReadOnlyRecommended();
            
    /**
     * <p>id(0x5ac)</p>
     */
    @ComMethod(name = "RefreshAll", dispId = 0x5ac)
    void RefreshAll();
            
    /**
     * <p>id(0x3d1)</p>
     */
    @ComMethod(name = "Reply", dispId = 0x3d1)
    void Reply();
            
    /**
     * <p>id(0x3d2)</p>
     */
    @ComMethod(name = "ReplyAll", dispId = 0x3d2)
    void ReplyAll();
            
    /**
     * <p>id(0x5ad)</p>
     */
    @ComMethod(name = "RemoveUser", dispId = 0x5ad)
    void RemoveUser(Integer Index);
            
    /**
     * <p>id(0x494)</p>
     */
    @ComProperty(name = "RevisionNumber", dispId = 0x494)
    Integer getRevisionNumber();
            
    /**
     * <p>id(0x3b2)</p>
     */
    @ComMethod(name = "Route", dispId = 0x3b2)
    void Route();
            
    /**
     * <p>id(0x3b7)</p>
     */
    @ComProperty(name = "Routed", dispId = 0x3b7)
    Boolean getRouted();
            
    /**
     * <p>id(0x3b5)</p>
     */
    @ComProperty(name = "RoutingSlip", dispId = 0x3b5)
    RoutingSlip getRoutingSlip();
            
    /**
     * <p>id(0x27a)</p>
     */
    @ComMethod(name = "RunAutoMacros", dispId = 0x27a)
    void RunAutoMacros(XlRunAutoMacro Which);
            
    /**
     * <p>id(0x11b)</p>
     */
    @ComMethod(name = "Save", dispId = 0x11b)
    void Save();
            
    /**
     * <p>id(0x11c)</p>
     */
    @ComMethod(name = "_SaveAs", dispId = 0x11c)
    void _SaveAs(Object Filename,
            Object FileFormat,
            Object Password,
            Object WriteResPassword,
            Object ReadOnlyRecommended,
            Object CreateBackup,
            XlSaveAsAccessMode AccessMode,
            Object ConflictResolution,
            Object AddToMru,
            Object TextCodepage,
            Object TextVisualLayout);
            
    /**
     * <p>id(0xaf)</p>
     */
    @ComMethod(name = "SaveCopyAs", dispId = 0xaf)
    void SaveCopyAs(Object Filename);
            
    /**
     * <p>id(0x12a)</p>
     */
    @ComProperty(name = "Saved", dispId = 0x12a)
    Boolean getSaved();
            
    /**
     * <p>id(0x12a)</p>
     */
    @ComProperty(name = "Saved", dispId = 0x12a)
    void setSaved(Boolean param0);
            
    /**
     * <p>id(0x196)</p>
     */
    @ComProperty(name = "SaveLinkValues", dispId = 0x196)
    Boolean getSaveLinkValues();
            
    /**
     * <p>id(0x196)</p>
     */
    @ComProperty(name = "SaveLinkValues", dispId = 0x196)
    void setSaveLinkValues(Boolean param0);
            
    /**
     * <p>id(0x3b3)</p>
     */
    @ComMethod(name = "SendMail", dispId = 0x3b3)
    void SendMail(Object Recipients,
            Object Subject,
            Object ReturnReceipt);
            
    /**
     * <p>id(0x3d4)</p>
     */
    @ComMethod(name = "SendMailer", dispId = 0x3d4)
    void SendMailer(Object FileFormat,
            XlPriority Priority);
            
    /**
     * <p>id(0x329)</p>
     */
    @ComMethod(name = "SetLinkOnData", dispId = 0x329)
    void SetLinkOnData(String Name,
            Object Procedure);
            
    /**
     * <p>id(0x1e5)</p>
     */
    @ComProperty(name = "Sheets", dispId = 0x1e5)
    Sheets getSheets();
            
    /**
     * <p>id(0x493)</p>
     */
    @ComProperty(name = "ShowConflictHistory", dispId = 0x493)
    Boolean getShowConflictHistory();
            
    /**
     * <p>id(0x493)</p>
     */
    @ComProperty(name = "ShowConflictHistory", dispId = 0x493)
    void setShowConflictHistory(Boolean param0);
            
    /**
     * <p>id(0x1ed)</p>
     */
    @ComProperty(name = "Styles", dispId = 0x1ed)
    Styles getStyles();
            
    /**
     * <p>id(0x3b9)</p>
     */
    @ComProperty(name = "Subject", dispId = 0x3b9)
    String getSubject();
            
    /**
     * <p>id(0x3b9)</p>
     */
    @ComProperty(name = "Subject", dispId = 0x3b9)
    void setSubject(String param0);
            
    /**
     * <p>id(0xc7)</p>
     */
    @ComProperty(name = "Title", dispId = 0xc7)
    String getTitle();
            
    /**
     * <p>id(0xc7)</p>
     */
    @ComProperty(name = "Title", dispId = 0xc7)
    void setTitle(String param0);
            
    /**
     * <p>id(0x11d)</p>
     */
    @ComMethod(name = "Unprotect", dispId = 0x11d)
    void Unprotect(Object Password);
            
    /**
     * <p>id(0x5af)</p>
     */
    @ComMethod(name = "UnprotectSharing", dispId = 0x5af)
    void UnprotectSharing(Object SharingPassword);
            
    /**
     * <p>id(0x3e3)</p>
     */
    @ComMethod(name = "UpdateFromFile", dispId = 0x3e3)
    void UpdateFromFile();
            
    /**
     * <p>id(0x324)</p>
     */
    @ComMethod(name = "UpdateLink", dispId = 0x324)
    void UpdateLink(Object Name,
            Object Type);
            
    /**
     * <p>id(0x19b)</p>
     */
    @ComProperty(name = "UpdateRemoteReferences", dispId = 0x19b)
    Boolean getUpdateRemoteReferences();
            
    /**
     * <p>id(0x19b)</p>
     */
    @ComProperty(name = "UpdateRemoteReferences", dispId = 0x19b)
    void setUpdateRemoteReferences(Boolean param0);
            
    /**
     * <p>id(0x4ba)</p>
     */
    @ComProperty(name = "UserControl", dispId = 0x4ba)
    Boolean getUserControl();
            
    /**
     * <p>id(0x4ba)</p>
     */
    @ComProperty(name = "UserControl", dispId = 0x4ba)
    void setUserControl(Boolean param0);
            
    /**
     * <p>id(0x495)</p>
     */
    @ComProperty(name = "UserStatus", dispId = 0x495)
    Object getUserStatus();
            
    /**
     * <p>id(0x5b0)</p>
     */
    @ComProperty(name = "CustomViews", dispId = 0x5b0)
    CustomViews getCustomViews();
            
    /**
     * <p>id(0x1ae)</p>
     */
    @ComProperty(name = "Windows", dispId = 0x1ae)
    Windows getWindows();
            
    /**
     * <p>id(0x1ee)</p>
     */
    @ComProperty(name = "Worksheets", dispId = 0x1ee)
    Sheets getWorksheets();
            
    /**
     * <p>id(0x12b)</p>
     */
    @ComProperty(name = "WriteReserved", dispId = 0x12b)
    Boolean getWriteReserved();
            
    /**
     * <p>id(0x12c)</p>
     */
    @ComProperty(name = "WriteReservedBy", dispId = 0x12c)
    String getWriteReservedBy();
            
    /**
     * <p>id(0x245)</p>
     */
    @ComProperty(name = "Excel4IntlMacroSheets", dispId = 0x245)
    Sheets getExcel4IntlMacroSheets();
            
    /**
     * <p>id(0x243)</p>
     */
    @ComProperty(name = "Excel4MacroSheets", dispId = 0x243)
    Sheets getExcel4MacroSheets();
            
    /**
     * <p>id(0x5b1)</p>
     */
    @ComProperty(name = "TemplateRemoveExtData", dispId = 0x5b1)
    Boolean getTemplateRemoveExtData();
            
    /**
     * <p>id(0x5b1)</p>
     */
    @ComProperty(name = "TemplateRemoveExtData", dispId = 0x5b1)
    void setTemplateRemoveExtData(Boolean param0);
            
    /**
     * <p>id(0x5b2)</p>
     */
    @ComMethod(name = "HighlightChangesOptions", dispId = 0x5b2)
    void HighlightChangesOptions(Object When,
            Object Who,
            Object Where);
            
    /**
     * <p>id(0x5b5)</p>
     */
    @ComProperty(name = "HighlightChangesOnScreen", dispId = 0x5b5)
    Boolean getHighlightChangesOnScreen();
            
    /**
     * <p>id(0x5b5)</p>
     */
    @ComProperty(name = "HighlightChangesOnScreen", dispId = 0x5b5)
    void setHighlightChangesOnScreen(Boolean param0);
            
    /**
     * <p>id(0x5b6)</p>
     */
    @ComProperty(name = "KeepChangeHistory", dispId = 0x5b6)
    Boolean getKeepChangeHistory();
            
    /**
     * <p>id(0x5b6)</p>
     */
    @ComProperty(name = "KeepChangeHistory", dispId = 0x5b6)
    void setKeepChangeHistory(Boolean param0);
            
    /**
     * <p>id(0x5b7)</p>
     */
    @ComProperty(name = "ListChangesOnNewSheet", dispId = 0x5b7)
    Boolean getListChangesOnNewSheet();
            
    /**
     * <p>id(0x5b7)</p>
     */
    @ComProperty(name = "ListChangesOnNewSheet", dispId = 0x5b7)
    void setListChangesOnNewSheet(Boolean param0);
            
    /**
     * <p>id(0x5b8)</p>
     */
    @ComMethod(name = "PurgeChangeHistoryNow", dispId = 0x5b8)
    void PurgeChangeHistoryNow(Integer Days,
            Object SharingPassword);
            
    /**
     * <p>id(0x5ba)</p>
     */
    @ComMethod(name = "AcceptAllChanges", dispId = 0x5ba)
    void AcceptAllChanges(Object When,
            Object Who,
            Object Where);
            
    /**
     * <p>id(0x5bb)</p>
     */
    @ComMethod(name = "RejectAllChanges", dispId = 0x5bb)
    void RejectAllChanges(Object When,
            Object Who,
            Object Where);
            
    /**
     * <p>id(0x2ac)</p>
     */
    @ComMethod(name = "PivotTableWizard", dispId = 0x2ac)
    void PivotTableWizard(Object SourceType,
            Object SourceData,
            Object TableDestination,
            Object TableName,
            Object RowGrand,
            Object ColumnGrand,
            Object SaveData,
            Object HasAutoFormat,
            Object AutoPage,
            Object Reserved,
            Object BackgroundQuery,
            Object OptimizeCache,
            Object PageFieldOrder,
            Object PageFieldWrapCount,
            Object ReadData,
            Object Connection);
            
    /**
     * <p>id(0x5bc)</p>
     */
    @ComMethod(name = "ResetColors", dispId = 0x5bc)
    void ResetColors();
            
    /**
     * <p>id(0x5bd)</p>
     */
    @ComProperty(name = "VBProject", dispId = 0x5bd)
    eu.doppel_helix.jna.tlb.vbide5.VBProject getVBProject();
            
    /**
     * <p>id(0x5be)</p>
     */
    @ComMethod(name = "FollowHyperlink", dispId = 0x5be)
    void FollowHyperlink(String Address,
            Object SubAddress,
            Object NewWindow,
            Object AddHistory,
            Object ExtraInfo,
            Object Method,
            Object HeaderInfo);
            
    /**
     * <p>id(0x5c4)</p>
     */
    @ComMethod(name = "AddToFavorites", dispId = 0x5c4)
    void AddToFavorites();
            
    /**
     * <p>id(0x6e9)</p>
     */
    @ComProperty(name = "IsInplace", dispId = 0x6e9)
    Boolean getIsInplace();
            
    /**
     * <p>id(0x6ec)</p>
     */
    @ComMethod(name = "_PrintOut", dispId = 0x6ec)
    void _PrintOut(Object From,
            Object To,
            Object Copies,
            Object Preview,
            Object ActivePrinter,
            Object PrintToFile,
            Object Collate,
            Object PrToFileName);
            
    /**
     * <p>id(0x71a)</p>
     */
    @ComMethod(name = "WebPagePreview", dispId = 0x71a)
    void WebPagePreview();
            
    /**
     * <p>id(0x71b)</p>
     */
    @ComProperty(name = "PublishObjects", dispId = 0x71b)
    PublishObjects getPublishObjects();
            
    /**
     * <p>id(0x71c)</p>
     */
    @ComProperty(name = "WebOptions", dispId = 0x71c)
    WebOptions getWebOptions();
            
    /**
     * <p>id(0x71d)</p>
     */
    @ComMethod(name = "ReloadAs", dispId = 0x71d)
    void ReloadAs(eu.doppel_helix.jna.tlb.office2.MsoEncoding Encoding);
            
    /**
     * <p>id(0x71f)</p>
     */
    @ComProperty(name = "HTMLProject", dispId = 0x71f)
    eu.doppel_helix.jna.tlb.office2.HTMLProject getHTMLProject();
            
    /**
     * <p>id(0x720)</p>
     */
    @ComProperty(name = "EnvelopeVisible", dispId = 0x720)
    Boolean getEnvelopeVisible();
            
    /**
     * <p>id(0x720)</p>
     */
    @ComProperty(name = "EnvelopeVisible", dispId = 0x720)
    void setEnvelopeVisible(Boolean param0);
            
    /**
     * <p>id(0x70e)</p>
     */
    @ComProperty(name = "CalculationVersion", dispId = 0x70e)
    Integer getCalculationVersion();
            
    /**
     * <p>id(0x7fc)</p>
     */
    @ComMethod(name = "Dummy17", dispId = 0x7fc)
    void Dummy17(Integer calcid);
            
    /**
     * <p>id(0x722)</p>
     */
    @ComMethod(name = "sblt", dispId = 0x722)
    void sblt(String s);
            
    /**
     * <p>id(0x724)</p>
     */
    @ComProperty(name = "VBASigned", dispId = 0x724)
    Boolean getVBASigned();
            
    /**
     * <p>id(0x7fe)</p>
     */
    @ComProperty(name = "ShowPivotTableFieldList", dispId = 0x7fe)
    Boolean getShowPivotTableFieldList();
            
    /**
     * <p>id(0x7fe)</p>
     */
    @ComProperty(name = "ShowPivotTableFieldList", dispId = 0x7fe)
    void setShowPivotTableFieldList(Boolean param0);
            
    /**
     * <p>id(0x360)</p>
     */
    @ComProperty(name = "UpdateLinks", dispId = 0x360)
    XlUpdateLinks getUpdateLinks();
            
    /**
     * <p>id(0x360)</p>
     */
    @ComProperty(name = "UpdateLinks", dispId = 0x360)
    void setUpdateLinks(XlUpdateLinks param0);
            
    /**
     * <p>id(0x7ff)</p>
     */
    @ComMethod(name = "BreakLink", dispId = 0x7ff)
    void BreakLink(String Name,
            XlLinkType Type);
            
    /**
     * <p>id(0x800)</p>
     */
    @ComMethod(name = "Dummy16", dispId = 0x800)
    void Dummy16();
            
    /**
     * <p>id(0x785)</p>
     */
    @ComMethod(name = "SaveAs", dispId = 0x785)
    void SaveAs(Object Filename,
            Object FileFormat,
            Object Password,
            Object WriteResPassword,
            Object ReadOnlyRecommended,
            Object CreateBackup,
            XlSaveAsAccessMode AccessMode,
            Object ConflictResolution,
            Object AddToMru,
            Object TextCodepage,
            Object TextVisualLayout,
            Object Local);
            
    /**
     * <p>id(0x801)</p>
     */
    @ComProperty(name = "EnableAutoRecover", dispId = 0x801)
    Boolean getEnableAutoRecover();
            
    /**
     * <p>id(0x801)</p>
     */
    @ComProperty(name = "EnableAutoRecover", dispId = 0x801)
    void setEnableAutoRecover(Boolean param0);
            
    /**
     * <p>id(0x802)</p>
     */
    @ComProperty(name = "RemovePersonalInformation", dispId = 0x802)
    Boolean getRemovePersonalInformation();
            
    /**
     * <p>id(0x802)</p>
     */
    @ComProperty(name = "RemovePersonalInformation", dispId = 0x802)
    void setRemovePersonalInformation(Boolean param0);
            
    /**
     * <p>id(0x787)</p>
     */
    @ComProperty(name = "FullNameURLEncoded", dispId = 0x787)
    String getFullNameURLEncoded();
            
    /**
     * <p>id(0x803)</p>
     */
    @ComMethod(name = "CheckIn", dispId = 0x803)
    void CheckIn(Object SaveChanges,
            Object Comments,
            Object MakePublic);
            
    /**
     * <p>id(0x805)</p>
     */
    @ComMethod(name = "CanCheckIn", dispId = 0x805)
    Boolean CanCheckIn();
            
    /**
     * <p>id(0x806)</p>
     */
    @ComMethod(name = "SendForReview", dispId = 0x806)
    void SendForReview(Object Recipients,
            Object Subject,
            Object ShowMessage,
            Object IncludeAttachment);
            
    /**
     * <p>id(0x809)</p>
     */
    @ComMethod(name = "ReplyWithChanges", dispId = 0x809)
    void ReplyWithChanges(Object ShowMessage);
            
    /**
     * <p>id(0x80a)</p>
     */
    @ComMethod(name = "EndReview", dispId = 0x80a)
    void EndReview();
            
    /**
     * <p>id(0x1ad)</p>
     */
    @ComProperty(name = "Password", dispId = 0x1ad)
    String getPassword();
            
    /**
     * <p>id(0x1ad)</p>
     */
    @ComProperty(name = "Password", dispId = 0x1ad)
    void setPassword(String param0);
            
    /**
     * <p>id(0x468)</p>
     */
    @ComProperty(name = "WritePassword", dispId = 0x468)
    String getWritePassword();
            
    /**
     * <p>id(0x468)</p>
     */
    @ComProperty(name = "WritePassword", dispId = 0x468)
    void setWritePassword(String param0);
            
    /**
     * <p>id(0x80b)</p>
     */
    @ComProperty(name = "PasswordEncryptionProvider", dispId = 0x80b)
    String getPasswordEncryptionProvider();
            
    /**
     * <p>id(0x80c)</p>
     */
    @ComProperty(name = "PasswordEncryptionAlgorithm", dispId = 0x80c)
    String getPasswordEncryptionAlgorithm();
            
    /**
     * <p>id(0x80d)</p>
     */
    @ComProperty(name = "PasswordEncryptionKeyLength", dispId = 0x80d)
    Integer getPasswordEncryptionKeyLength();
            
    /**
     * <p>id(0x80e)</p>
     */
    @ComMethod(name = "SetPasswordEncryptionOptions", dispId = 0x80e)
    void SetPasswordEncryptionOptions(Object PasswordEncryptionProvider,
            Object PasswordEncryptionAlgorithm,
            Object PasswordEncryptionKeyLength,
            Object PasswordEncryptionFileProperties);
            
    /**
     * <p>id(0x80f)</p>
     */
    @ComProperty(name = "PasswordEncryptionFileProperties", dispId = 0x80f)
    Boolean getPasswordEncryptionFileProperties();
            
    /**
     * <p>id(0x7d5)</p>
     */
    @ComProperty(name = "ReadOnlyRecommended", dispId = 0x7d5)
    Boolean getReadOnlyRecommended();
            
    /**
     * <p>id(0x7d5)</p>
     */
    @ComProperty(name = "ReadOnlyRecommended", dispId = 0x7d5)
    void setReadOnlyRecommended(Boolean param0);
            
    /**
     * <p>id(0x7ed)</p>
     */
    @ComMethod(name = "Protect", dispId = 0x7ed)
    void Protect(Object Password,
            Object Structure,
            Object Windows);
            
    /**
     * <p>id(0x810)</p>
     */
    @ComProperty(name = "SmartTagOptions", dispId = 0x810)
    SmartTagOptions getSmartTagOptions();
            
    /**
     * <p>id(0x811)</p>
     */
    @ComMethod(name = "RecheckSmartTags", dispId = 0x811)
    void RecheckSmartTags();
            
    /**
     * <p>id(0x8d8)</p>
     */
    @ComProperty(name = "Permission", dispId = 0x8d8)
    eu.doppel_helix.jna.tlb.office2.Permission getPermission();
            
    /**
     * <p>id(0x8d9)</p>
     */
    @ComProperty(name = "SharedWorkspace", dispId = 0x8d9)
    eu.doppel_helix.jna.tlb.office2.SharedWorkspace getSharedWorkspace();
            
    /**
     * <p>id(0x8da)</p>
     */
    @ComProperty(name = "Sync", dispId = 0x8da)
    eu.doppel_helix.jna.tlb.office2.Sync getSync();
            
    /**
     * <p>id(0x8db)</p>
     */
    @ComMethod(name = "SendFaxOverInternet", dispId = 0x8db)
    void SendFaxOverInternet(Object Recipients,
            Object Subject,
            Object ShowMessage);
            
    /**
     * <p>id(0x8dc)</p>
     */
    @ComProperty(name = "XmlNamespaces", dispId = 0x8dc)
    XmlNamespaces getXmlNamespaces();
            
    /**
     * <p>id(0x8dd)</p>
     */
    @ComProperty(name = "XmlMaps", dispId = 0x8dd)
    XmlMaps getXmlMaps();
            
    /**
     * <p>id(0x8de)</p>
     */
    @ComMethod(name = "XmlImport", dispId = 0x8de)
    XlXmlImportResult XmlImport(String Url,
            VARIANT ImportMap,
            Object Overwrite,
            Object Destination);
            
    /**
     * <p>id(0x8e1)</p>
     */
    @ComProperty(name = "SmartDocument", dispId = 0x8e1)
    eu.doppel_helix.jna.tlb.office2.SmartDocument getSmartDocument();
            
    /**
     * <p>id(0x8e2)</p>
     */
    @ComProperty(name = "DocumentLibraryVersions", dispId = 0x8e2)
    eu.doppel_helix.jna.tlb.office2.DocumentLibraryVersions getDocumentLibraryVersions();
            
    /**
     * <p>id(0x8e3)</p>
     */
    @ComProperty(name = "InactiveListBorderVisible", dispId = 0x8e3)
    Boolean getInactiveListBorderVisible();
            
    /**
     * <p>id(0x8e3)</p>
     */
    @ComProperty(name = "InactiveListBorderVisible", dispId = 0x8e3)
    void setInactiveListBorderVisible(Boolean param0);
            
    /**
     * <p>id(0x8e4)</p>
     */
    @ComProperty(name = "DisplayInkComments", dispId = 0x8e4)
    Boolean getDisplayInkComments();
            
    /**
     * <p>id(0x8e4)</p>
     */
    @ComProperty(name = "DisplayInkComments", dispId = 0x8e4)
    void setDisplayInkComments(Boolean param0);
            
    /**
     * <p>id(0x8e5)</p>
     */
    @ComMethod(name = "XmlImportXml", dispId = 0x8e5)
    XlXmlImportResult XmlImportXml(String Data,
            VARIANT ImportMap,
            Object Overwrite,
            Object Destination);
            
    /**
     * <p>id(0x8e6)</p>
     */
    @ComMethod(name = "SaveAsXMLData", dispId = 0x8e6)
    void SaveAsXMLData(String Filename,
            XmlMap Map);
            
    /**
     * <p>id(0x8e7)</p>
     */
    @ComMethod(name = "ToggleFormsDesign", dispId = 0x8e7)
    void ToggleFormsDesign();
            
    /**
     * <p>id(0x9d0)</p>
     */
    @ComProperty(name = "ContentTypeProperties", dispId = 0x9d0)
    eu.doppel_helix.jna.tlb.office2.MetaProperties getContentTypeProperties();
            
    /**
     * <p>id(0x9d1)</p>
     */
    @ComProperty(name = "Connections", dispId = 0x9d1)
    Connections getConnections();
            
    /**
     * <p>id(0x9d2)</p>
     */
    @ComMethod(name = "RemoveDocumentInformation", dispId = 0x9d2)
    void RemoveDocumentInformation(XlRemoveDocInfoType RemoveDocInfoType);
            
    /**
     * <p>id(0x9d4)</p>
     */
    @ComProperty(name = "Signatures", dispId = 0x9d4)
    eu.doppel_helix.jna.tlb.office2.SignatureSet getSignatures();
            
    /**
     * <p>id(0x9d5)</p>
     */
    @ComMethod(name = "CheckInWithVersion", dispId = 0x9d5)
    void CheckInWithVersion(Object SaveChanges,
            Object Comments,
            Object MakePublic,
            Object VersionType);
            
    /**
     * <p>id(0x9d7)</p>
     */
    @ComProperty(name = "ServerPolicy", dispId = 0x9d7)
    eu.doppel_helix.jna.tlb.office2.ServerPolicy getServerPolicy();
            
    /**
     * <p>id(0x9d8)</p>
     */
    @ComMethod(name = "LockServerFile", dispId = 0x9d8)
    void LockServerFile();
            
    /**
     * <p>id(0x9d9)</p>
     */
    @ComProperty(name = "DocumentInspectors", dispId = 0x9d9)
    eu.doppel_helix.jna.tlb.office2.DocumentInspectors getDocumentInspectors();
            
    /**
     * <p>id(0x9da)</p>
     */
    @ComMethod(name = "GetWorkflowTasks", dispId = 0x9da)
    eu.doppel_helix.jna.tlb.office2.WorkflowTasks GetWorkflowTasks();
            
    /**
     * <p>id(0x9db)</p>
     */
    @ComMethod(name = "GetWorkflowTemplates", dispId = 0x9db)
    eu.doppel_helix.jna.tlb.office2.WorkflowTemplates GetWorkflowTemplates();
            
    /**
     * <p>id(0x939)</p>
     */
    @ComMethod(name = "PrintOut", dispId = 0x939)
    void PrintOut(Object From,
            Object To,
            Object Copies,
            Object Preview,
            Object ActivePrinter,
            Object PrintToFile,
            Object Collate,
            Object PrToFileName,
            Object IgnorePrintAreas);
            
    /**
     * <p>id(0x9dc)</p>
     */
    @ComProperty(name = "ServerViewableItems", dispId = 0x9dc)
    ServerViewableItems getServerViewableItems();
            
    /**
     * <p>id(0x9dd)</p>
     */
    @ComProperty(name = "TableStyles", dispId = 0x9dd)
    TableStyles getTableStyles();
            
    /**
     * <p>id(0x9de)</p>
     */
    @ComProperty(name = "DefaultTableStyle", dispId = 0x9de)
    Object getDefaultTableStyle();
            
    /**
     * <p>id(0x9de)</p>
     */
    @ComProperty(name = "DefaultTableStyle", dispId = 0x9de)
    void setDefaultTableStyle(Object param0);
            
    /**
     * <p>id(0x9df)</p>
     */
    @ComProperty(name = "DefaultPivotTableStyle", dispId = 0x9df)
    Object getDefaultPivotTableStyle();
            
    /**
     * <p>id(0x9df)</p>
     */
    @ComProperty(name = "DefaultPivotTableStyle", dispId = 0x9df)
    void setDefaultPivotTableStyle(Object param0);
            
    /**
     * <p>id(0x9e0)</p>
     */
    @ComProperty(name = "CheckCompatibility", dispId = 0x9e0)
    Boolean getCheckCompatibility();
            
    /**
     * <p>id(0x9e0)</p>
     */
    @ComProperty(name = "CheckCompatibility", dispId = 0x9e0)
    void setCheckCompatibility(Boolean param0);
            
    /**
     * <p>id(0x9e1)</p>
     */
    @ComProperty(name = "HasVBProject", dispId = 0x9e1)
    Boolean getHasVBProject();
            
    /**
     * <p>id(0x9e2)</p>
     */
    @ComProperty(name = "CustomXMLParts", dispId = 0x9e2)
    eu.doppel_helix.jna.tlb.office2.CustomXMLParts getCustomXMLParts();
            
    /**
     * <p>id(0x9e3)</p>
     */
    @ComProperty(name = "Final", dispId = 0x9e3)
    Boolean get_Final();
            
    /**
     * <p>id(0x9e3)</p>
     */
    @ComProperty(name = "Final", dispId = 0x9e3)
    void set_Final(Boolean param0);
            
    /**
     * <p>id(0x9e4)</p>
     */
    @ComProperty(name = "Research", dispId = 0x9e4)
    Research getResearch();
            
    /**
     * <p>id(0x9e5)</p>
     */
    @ComProperty(name = "Theme", dispId = 0x9e5)
    eu.doppel_helix.jna.tlb.office2.OfficeTheme getTheme();
            
    /**
     * <p>id(0x9e6)</p>
     */
    @ComMethod(name = "ApplyTheme", dispId = 0x9e6)
    void ApplyTheme(String Filename);
            
    /**
     * <p>id(0x9e7)</p>
     */
    @ComProperty(name = "Excel8CompatibilityMode", dispId = 0x9e7)
    Boolean getExcel8CompatibilityMode();
            
    /**
     * <p>id(0x9e8)</p>
     */
    @ComProperty(name = "ConnectionsDisabled", dispId = 0x9e8)
    Boolean getConnectionsDisabled();
            
    /**
     * <p>id(0x9e9)</p>
     */
    @ComMethod(name = "EnableConnections", dispId = 0x9e9)
    void EnableConnections();
            
    /**
     * <p>id(0x9ea)</p>
     */
    @ComProperty(name = "ShowPivotChartActiveFields", dispId = 0x9ea)
    Boolean getShowPivotChartActiveFields();
            
    /**
     * <p>id(0x9ea)</p>
     */
    @ComProperty(name = "ShowPivotChartActiveFields", dispId = 0x9ea)
    void setShowPivotChartActiveFields(Boolean param0);
            
    /**
     * <p>id(0x9bd)</p>
     */
    @ComMethod(name = "ExportAsFixedFormat", dispId = 0x9bd)
    void ExportAsFixedFormat(XlFixedFormatType Type,
            Object Filename,
            Object Quality,
            Object IncludeDocProperties,
            Object IgnorePrintAreas,
            Object From,
            Object To,
            Object OpenAfterPublish,
            Object FixedFormatExtClassPtr);
            
    /**
     * <p>id(0x9eb)</p>
     */
    @ComProperty(name = "IconSets", dispId = 0x9eb)
    IconSets getIconSets();
            
    /**
     * <p>id(0x9ec)</p>
     */
    @ComProperty(name = "EncryptionProvider", dispId = 0x9ec)
    String getEncryptionProvider();
            
    /**
     * <p>id(0x9ec)</p>
     */
    @ComProperty(name = "EncryptionProvider", dispId = 0x9ec)
    void setEncryptionProvider(String param0);
            
    /**
     * <p>id(0x9ed)</p>
     */
    @ComProperty(name = "DoNotPromptForConvert", dispId = 0x9ed)
    Boolean getDoNotPromptForConvert();
            
    /**
     * <p>id(0x9ed)</p>
     */
    @ComProperty(name = "DoNotPromptForConvert", dispId = 0x9ed)
    void setDoNotPromptForConvert(Boolean param0);
            
    /**
     * <p>id(0x9ee)</p>
     */
    @ComProperty(name = "ForceFullCalculation", dispId = 0x9ee)
    Boolean getForceFullCalculation();
            
    /**
     * <p>id(0x9ee)</p>
     */
    @ComProperty(name = "ForceFullCalculation", dispId = 0x9ee)
    void setForceFullCalculation(Boolean param0);
            
    /**
     * <p>id(0x9ef)</p>
     */
    @ComMethod(name = "ProtectSharing", dispId = 0x9ef)
    void ProtectSharing(Object Filename,
            Object Password,
            Object WriteResPassword,
            Object ReadOnlyRecommended,
            Object CreateBackup,
            Object SharingPassword,
            Object FileFormat);
            
    /**
     * <p>id(0xb32)</p>
     */
    @ComProperty(name = "SlicerCaches", dispId = 0xb32)
    SlicerCaches getSlicerCaches();
            
    /**
     * <p>id(0xb33)</p>
     */
    @ComProperty(name = "ActiveSlicer", dispId = 0xb33)
    Slicer getActiveSlicer();
            
    /**
     * <p>id(0xb34)</p>
     */
    @ComProperty(name = "DefaultSlicerStyle", dispId = 0xb34)
    Object getDefaultSlicerStyle();
            
    /**
     * <p>id(0xb34)</p>
     */
    @ComProperty(name = "DefaultSlicerStyle", dispId = 0xb34)
    void setDefaultSlicerStyle(Object param0);
            
    /**
     * <p>id(0xb35)</p>
     */
    @ComMethod(name = "Dummy26", dispId = 0xb35)
    void Dummy26();
            
    /**
     * <p>id(0xb36)</p>
     */
    @ComMethod(name = "Dummy27", dispId = 0xb36)
    void Dummy27();
            
    /**
     * <p>id(0xb37)</p>
     */
    @ComProperty(name = "AccuracyVersion", dispId = 0xb37)
    Integer getAccuracyVersion();
            
    /**
     * <p>id(0xb37)</p>
     */
    @ComProperty(name = "AccuracyVersion", dispId = 0xb37)
    void setAccuracyVersion(Integer param0);
            
    /**
     * <p>id(0xbf0)</p>
     */
    @ComProperty(name = "CaseSensitive", dispId = 0xbf0)
    Boolean getCaseSensitive();
            
    /**
     * <p>id(0xbf1)</p>
     */
    @ComProperty(name = "UseWholeCellCriteria", dispId = 0xbf1)
    Boolean getUseWholeCellCriteria();
            
    /**
     * <p>id(0xbf2)</p>
     */
    @ComProperty(name = "UseWildcards", dispId = 0xbf2)
    Boolean getUseWildcards();
            
    /**
     * <p>id(0x2b2)</p>
     */
    @ComProperty(name = "PivotTables", dispId = 0x2b2)
    com.sun.jna.platform.win32.COM.util.IDispatch getPivotTables();
            
    /**
     * <p>id(0xbf3)</p>
     */
    @ComProperty(name = "Model", dispId = 0xbf3)
    Model getModel();
            
    /**
     * <p>id(0xbb6)</p>
     */
    @ComProperty(name = "ChartDataPointTrack", dispId = 0xbb6)
    Boolean getChartDataPointTrack();
            
    /**
     * <p>id(0xbb6)</p>
     */
    @ComProperty(name = "ChartDataPointTrack", dispId = 0xbb6)
    void setChartDataPointTrack(Boolean param0);
            
    /**
     * <p>id(0xbf4)</p>
     */
    @ComProperty(name = "DefaultTimelineStyle", dispId = 0xbf4)
    Object getDefaultTimelineStyle();
            
    /**
     * <p>id(0xbf4)</p>
     */
    @ComProperty(name = "DefaultTimelineStyle", dispId = 0xbf4)
    void setDefaultTimelineStyle(Object param0);
            
    
}