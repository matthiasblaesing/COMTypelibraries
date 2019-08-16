
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
     * <p>id(0x5a1)</p>
     * <p>vtableId(10)</p>
     */
    @ComProperty(name = "AcceptLabelsInFormulas", dispId = 0x5a1)
    Boolean getAcceptLabelsInFormulas();
            
    /**
     * <p>id(0x5a1)</p>
     * <p>vtableId(11)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "AcceptLabelsInFormulas", dispId = 0x5a1)
    void setAcceptLabelsInFormulas(Boolean param0);
            
    /**
     * <p>id(0x130)</p>
     * <p>vtableId(12)</p>
     */
    @ComMethod(name = "Activate", dispId = 0x130)
    void Activate();
            
    /**
     * <p>id(0xb7)</p>
     * <p>vtableId(13)</p>
     */
    @ComProperty(name = "ActiveChart", dispId = 0xb7)
    Chart getActiveChart();
            
    /**
     * <p>id(0x133)</p>
     * <p>vtableId(14)</p>
     */
    @ComProperty(name = "ActiveSheet", dispId = 0x133)
    com.sun.jna.platform.win32.COM.util.IDispatch getActiveSheet();
            
    /**
     * <p>id(0x23e)</p>
     * <p>vtableId(15)</p>
     */
    @ComProperty(name = "Author", dispId = 0x23e)
    String getAuthor();
            
    /**
     * <p>id(0x23e)</p>
     * <p>vtableId(16)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "Author", dispId = 0x23e)
    void setAuthor(String param0);
            
    /**
     * <p>id(0x5a2)</p>
     * <p>vtableId(17)</p>
     */
    @ComProperty(name = "AutoUpdateFrequency", dispId = 0x5a2)
    Integer getAutoUpdateFrequency();
            
    /**
     * <p>id(0x5a2)</p>
     * <p>vtableId(18)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "AutoUpdateFrequency", dispId = 0x5a2)
    void setAutoUpdateFrequency(Integer param0);
            
    /**
     * <p>id(0x5a3)</p>
     * <p>vtableId(19)</p>
     */
    @ComProperty(name = "AutoUpdateSaveChanges", dispId = 0x5a3)
    Boolean getAutoUpdateSaveChanges();
            
    /**
     * <p>id(0x5a3)</p>
     * <p>vtableId(20)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "AutoUpdateSaveChanges", dispId = 0x5a3)
    void setAutoUpdateSaveChanges(Boolean param0);
            
    /**
     * <p>id(0x5a4)</p>
     * <p>vtableId(21)</p>
     */
    @ComProperty(name = "ChangeHistoryDuration", dispId = 0x5a4)
    Integer getChangeHistoryDuration();
            
    /**
     * <p>id(0x5a4)</p>
     * <p>vtableId(22)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "ChangeHistoryDuration", dispId = 0x5a4)
    void setChangeHistoryDuration(Integer param0);
            
    /**
     * <p>id(0x498)</p>
     * <p>vtableId(23)</p>
     */
    @ComProperty(name = "BuiltinDocumentProperties", dispId = 0x498)
    com.sun.jna.platform.win32.COM.util.IDispatch getBuiltinDocumentProperties();
            
    /**
     * <p>id(0x3dd)</p>
     * <p>vtableId(24)</p>
     * @param Mode [in] {@code XlFileAccess}
     * @param WritePassword [in, optional] {@code Object}
     * @param Notify [in, optional] {@code Object}
     */
    @ComMethod(name = "ChangeFileAccess", dispId = 0x3dd)
    void ChangeFileAccess(XlFileAccess Mode,
            Object WritePassword,
            Object Notify);
            
    /**
     * <p>id(0x322)</p>
     * <p>vtableId(25)</p>
     * @param Name [in] {@code String}
     * @param NewName [in] {@code String}
     * @param Type [in, optional] {@code XlLinkType}
     */
    @ComMethod(name = "ChangeLink", dispId = 0x322)
    void ChangeLink(String Name,
            String NewName,
            XlLinkType Type);
            
    /**
     * <p>id(0x79)</p>
     * <p>vtableId(26)</p>
     */
    @ComProperty(name = "Charts", dispId = 0x79)
    Sheets getCharts();
            
    /**
     * <p>id(0x115)</p>
     * <p>vtableId(27)</p>
     * @param SaveChanges [in, optional] {@code Object}
     * @param Filename [in, optional] {@code Object}
     * @param RouteWorkbook [in, optional] {@code Object}
     */
    @ComMethod(name = "Close", dispId = 0x115)
    void Close(Object SaveChanges,
            Object Filename,
            Object RouteWorkbook);
            
    /**
     * <p>id(0x55d)</p>
     * <p>vtableId(28)</p>
     */
    @ComProperty(name = "CodeName", dispId = 0x55d)
    String getCodeName();
            
    /**
     * <p>id(0x80010000)</p>
     * <p>vtableId(29)</p>
     */
    @ComProperty(name = "_CodeName", dispId = 0x80010000)
    String get_CodeName();
            
    /**
     * <p>id(0x80010000)</p>
     * <p>vtableId(30)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "_CodeName", dispId = 0x80010000)
    void set_CodeName(String param0);
            
    /**
     * <p>id(0x11e)</p>
     * <p>vtableId(31)</p>
     * @param Index [in, optional] {@code Object}
     */
    @ComProperty(name = "Colors", dispId = 0x11e)
    Object getColors(Object Index);
            
    /**
     * <p>id(0x11e)</p>
     * <p>vtableId(32)</p>
     * @param Index [in, optional] {@code Object}
     * @param param1 [in] {@code Object}
     */
    @ComProperty(name = "Colors", dispId = 0x11e)
    void setColors(Object Index,
            Object param1);
            
    /**
     * <p>id(0x59f)</p>
     * <p>vtableId(33)</p>
     */
    @ComProperty(name = "CommandBars", dispId = 0x59f)
    eu.doppel_helix.jna.tlb.office2.CommandBars getCommandBars();
            
    /**
     * <p>id(0x23f)</p>
     * <p>vtableId(34)</p>
     */
    @ComProperty(name = "Comments", dispId = 0x23f)
    String getComments();
            
    /**
     * <p>id(0x23f)</p>
     * <p>vtableId(35)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "Comments", dispId = 0x23f)
    void setComments(String param0);
            
    /**
     * <p>id(0x497)</p>
     * <p>vtableId(36)</p>
     */
    @ComProperty(name = "ConflictResolution", dispId = 0x497)
    XlSaveConflictResolution getConflictResolution();
            
    /**
     * <p>id(0x497)</p>
     * <p>vtableId(37)</p>
     * @param param0 [in] {@code XlSaveConflictResolution}
     */
    @ComProperty(name = "ConflictResolution", dispId = 0x497)
    void setConflictResolution(XlSaveConflictResolution param0);
            
    /**
     * <p>id(0x4a6)</p>
     * <p>vtableId(38)</p>
     */
    @ComProperty(name = "Container", dispId = 0x4a6)
    com.sun.jna.platform.win32.COM.util.IDispatch getContainer();
            
    /**
     * <p>id(0x11f)</p>
     * <p>vtableId(39)</p>
     */
    @ComProperty(name = "CreateBackup", dispId = 0x11f)
    Boolean getCreateBackup();
            
    /**
     * <p>id(0x499)</p>
     * <p>vtableId(40)</p>
     */
    @ComProperty(name = "CustomDocumentProperties", dispId = 0x499)
    com.sun.jna.platform.win32.COM.util.IDispatch getCustomDocumentProperties();
            
    /**
     * <p>id(0x193)</p>
     * <p>vtableId(41)</p>
     */
    @ComProperty(name = "Date1904", dispId = 0x193)
    Boolean getDate1904();
            
    /**
     * <p>id(0x193)</p>
     * <p>vtableId(42)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "Date1904", dispId = 0x193)
    void setDate1904(Boolean param0);
            
    /**
     * <p>id(0x18d)</p>
     * <p>vtableId(43)</p>
     * @param NumberFormat [in] {@code String}
     */
    @ComMethod(name = "DeleteNumberFormat", dispId = 0x18d)
    void DeleteNumberFormat(String NumberFormat);
            
    /**
     * <p>id(0x2fc)</p>
     * <p>vtableId(44)</p>
     */
    @ComProperty(name = "DialogSheets", dispId = 0x2fc)
    Sheets getDialogSheets();
            
    /**
     * <p>id(0x194)</p>
     * <p>vtableId(45)</p>
     */
    @ComProperty(name = "DisplayDrawingObjects", dispId = 0x194)
    XlDisplayDrawingObjects getDisplayDrawingObjects();
            
    /**
     * <p>id(0x194)</p>
     * <p>vtableId(46)</p>
     * @param param0 [in] {@code XlDisplayDrawingObjects}
     */
    @ComProperty(name = "DisplayDrawingObjects", dispId = 0x194)
    void setDisplayDrawingObjects(XlDisplayDrawingObjects param0);
            
    /**
     * <p>id(0x490)</p>
     * <p>vtableId(47)</p>
     */
    @ComMethod(name = "ExclusiveAccess", dispId = 0x490)
    Boolean ExclusiveAccess();
            
    /**
     * <p>id(0x120)</p>
     * <p>vtableId(48)</p>
     */
    @ComProperty(name = "FileFormat", dispId = 0x120)
    XlFileFormat getFileFormat();
            
    /**
     * <p>id(0x3cd)</p>
     * <p>vtableId(49)</p>
     */
    @ComMethod(name = "ForwardMailer", dispId = 0x3cd)
    void ForwardMailer();
            
    /**
     * <p>id(0x121)</p>
     * <p>vtableId(50)</p>
     */
    @ComProperty(name = "FullName", dispId = 0x121)
    String getFullName();
            
    /**
     * <p>id(0x3d0)</p>
     * <p>vtableId(51)</p>
     */
    @ComProperty(name = "HasMailer", dispId = 0x3d0)
    Boolean getHasMailer();
            
    /**
     * <p>id(0x3d0)</p>
     * <p>vtableId(52)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "HasMailer", dispId = 0x3d0)
    void setHasMailer(Boolean param0);
            
    /**
     * <p>id(0x122)</p>
     * <p>vtableId(53)</p>
     */
    @ComProperty(name = "HasPassword", dispId = 0x122)
    Boolean getHasPassword();
            
    /**
     * <p>id(0x3b6)</p>
     * <p>vtableId(54)</p>
     */
    @ComProperty(name = "HasRoutingSlip", dispId = 0x3b6)
    Boolean getHasRoutingSlip();
            
    /**
     * <p>id(0x3b6)</p>
     * <p>vtableId(55)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "HasRoutingSlip", dispId = 0x3b6)
    void setHasRoutingSlip(Boolean param0);
            
    /**
     * <p>id(0x5a5)</p>
     * <p>vtableId(56)</p>
     */
    @ComProperty(name = "IsAddin", dispId = 0x5a5)
    Boolean getIsAddin();
            
    /**
     * <p>id(0x5a5)</p>
     * <p>vtableId(57)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "IsAddin", dispId = 0x5a5)
    void setIsAddin(Boolean param0);
            
    /**
     * <p>id(0x241)</p>
     * <p>vtableId(58)</p>
     */
    @ComProperty(name = "Keywords", dispId = 0x241)
    String getKeywords();
            
    /**
     * <p>id(0x241)</p>
     * <p>vtableId(59)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "Keywords", dispId = 0x241)
    void setKeywords(String param0);
            
    /**
     * <p>id(0x327)</p>
     * <p>vtableId(60)</p>
     * @param Name [in] {@code String}
     * @param LinkInfo [in] {@code XlLinkInfo}
     * @param Type [in, optional] {@code Object}
     * @param EditionRef [in, optional] {@code Object}
     */
    @ComMethod(name = "LinkInfo", dispId = 0x327)
    Object LinkInfo(String Name,
            XlLinkInfo LinkInfo,
            Object Type,
            Object EditionRef);
            
    /**
     * <p>id(0x328)</p>
     * <p>vtableId(61)</p>
     * @param Type [in, optional] {@code Object}
     */
    @ComMethod(name = "LinkSources", dispId = 0x328)
    Object LinkSources(Object Type);
            
    /**
     * <p>id(0x3d3)</p>
     * <p>vtableId(62)</p>
     */
    @ComProperty(name = "Mailer", dispId = 0x3d3)
    Mailer getMailer();
            
    /**
     * <p>id(0x5a6)</p>
     * <p>vtableId(63)</p>
     * @param Filename [in] {@code Object}
     */
    @ComMethod(name = "MergeWorkbook", dispId = 0x5a6)
    void MergeWorkbook(Object Filename);
            
    /**
     * <p>id(0x246)</p>
     * <p>vtableId(64)</p>
     */
    @ComProperty(name = "Modules", dispId = 0x246)
    Sheets getModules();
            
    /**
     * <p>id(0x491)</p>
     * <p>vtableId(65)</p>
     */
    @ComProperty(name = "MultiUserEditing", dispId = 0x491)
    Boolean getMultiUserEditing();
            
    /**
     * <p>id(0x6e)</p>
     * <p>vtableId(66)</p>
     */
    @ComProperty(name = "Name", dispId = 0x6e)
    String getName();
            
    /**
     * <p>id(0x1ba)</p>
     * <p>vtableId(67)</p>
     */
    @ComProperty(name = "Names", dispId = 0x1ba)
    Names getNames();
            
    /**
     * <p>id(0x118)</p>
     * <p>vtableId(68)</p>
     */
    @ComMethod(name = "NewWindow", dispId = 0x118)
    Window NewWindow();
            
    /**
     * <p>id(0x49a)</p>
     * <p>vtableId(69)</p>
     */
    @ComProperty(name = "OnSave", dispId = 0x49a)
    String getOnSave();
            
    /**
     * <p>id(0x49a)</p>
     * <p>vtableId(70)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "OnSave", dispId = 0x49a)
    void setOnSave(String param0);
            
    /**
     * <p>id(0x407)</p>
     * <p>vtableId(71)</p>
     */
    @ComProperty(name = "OnSheetActivate", dispId = 0x407)
    String getOnSheetActivate();
            
    /**
     * <p>id(0x407)</p>
     * <p>vtableId(72)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "OnSheetActivate", dispId = 0x407)
    void setOnSheetActivate(String param0);
            
    /**
     * <p>id(0x439)</p>
     * <p>vtableId(73)</p>
     */
    @ComProperty(name = "OnSheetDeactivate", dispId = 0x439)
    String getOnSheetDeactivate();
            
    /**
     * <p>id(0x439)</p>
     * <p>vtableId(74)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "OnSheetDeactivate", dispId = 0x439)
    void setOnSheetDeactivate(String param0);
            
    /**
     * <p>id(0x323)</p>
     * <p>vtableId(75)</p>
     * @param Name [in] {@code String}
     * @param ReadOnly [in, optional] {@code Object}
     * @param Type [in, optional] {@code Object}
     */
    @ComMethod(name = "OpenLinks", dispId = 0x323)
    void OpenLinks(String Name,
            Object ReadOnly,
            Object Type);
            
    /**
     * <p>id(0x123)</p>
     * <p>vtableId(76)</p>
     */
    @ComProperty(name = "Path", dispId = 0x123)
    String getPath();
            
    /**
     * <p>id(0x5a7)</p>
     * <p>vtableId(77)</p>
     */
    @ComProperty(name = "PersonalViewListSettings", dispId = 0x5a7)
    Boolean getPersonalViewListSettings();
            
    /**
     * <p>id(0x5a7)</p>
     * <p>vtableId(78)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "PersonalViewListSettings", dispId = 0x5a7)
    void setPersonalViewListSettings(Boolean param0);
            
    /**
     * <p>id(0x5a8)</p>
     * <p>vtableId(79)</p>
     */
    @ComProperty(name = "PersonalViewPrintSettings", dispId = 0x5a8)
    Boolean getPersonalViewPrintSettings();
            
    /**
     * <p>id(0x5a8)</p>
     * <p>vtableId(80)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "PersonalViewPrintSettings", dispId = 0x5a8)
    void setPersonalViewPrintSettings(Boolean param0);
            
    /**
     * <p>id(0x5a9)</p>
     * <p>vtableId(81)</p>
     */
    @ComMethod(name = "PivotCaches", dispId = 0x5a9)
    PivotCaches PivotCaches();
            
    /**
     * <p>id(0x48e)</p>
     * <p>vtableId(82)</p>
     * @param DestName [in, optional] {@code Object}
     */
    @ComMethod(name = "Post", dispId = 0x48e)
    void Post(Object DestName);
            
    /**
     * <p>id(0x195)</p>
     * <p>vtableId(83)</p>
     */
    @ComProperty(name = "PrecisionAsDisplayed", dispId = 0x195)
    Boolean getPrecisionAsDisplayed();
            
    /**
     * <p>id(0x195)</p>
     * <p>vtableId(84)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "PrecisionAsDisplayed", dispId = 0x195)
    void setPrecisionAsDisplayed(Boolean param0);
            
    /**
     * <p>id(0x389)</p>
     * <p>vtableId(85)</p>
     * @param From [in, optional] {@code Object}
     * @param To [in, optional] {@code Object}
     * @param Copies [in, optional] {@code Object}
     * @param Preview [in, optional] {@code Object}
     * @param ActivePrinter [in, optional] {@code Object}
     * @param PrintToFile [in, optional] {@code Object}
     * @param Collate [in, optional] {@code Object}
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
     * <p>vtableId(86)</p>
     * @param EnableChanges [in, optional] {@code Object}
     */
    @ComMethod(name = "PrintPreview", dispId = 0x119)
    void PrintPreview(Object EnableChanges);
            
    /**
     * <p>id(0x11a)</p>
     * <p>vtableId(87)</p>
     * @param Password [in, optional] {@code Object}
     * @param Structure [in, optional] {@code Object}
     * @param Windows [in, optional] {@code Object}
     */
    @ComMethod(name = "_Protect", dispId = 0x11a)
    void _Protect(Object Password,
            Object Structure,
            Object Windows);
            
    /**
     * <p>id(0x5aa)</p>
     * <p>vtableId(88)</p>
     * @param Filename [in, optional] {@code Object}
     * @param Password [in, optional] {@code Object}
     * @param WriteResPassword [in, optional] {@code Object}
     * @param ReadOnlyRecommended [in, optional] {@code Object}
     * @param CreateBackup [in, optional] {@code Object}
     * @param SharingPassword [in, optional] {@code Object}
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
     * <p>vtableId(89)</p>
     */
    @ComProperty(name = "ProtectStructure", dispId = 0x24c)
    Boolean getProtectStructure();
            
    /**
     * <p>id(0x127)</p>
     * <p>vtableId(90)</p>
     */
    @ComProperty(name = "ProtectWindows", dispId = 0x127)
    Boolean getProtectWindows();
            
    /**
     * <p>id(0x128)</p>
     * <p>vtableId(91)</p>
     */
    @ComProperty(name = "ReadOnly", dispId = 0x128)
    Boolean getReadOnly();
            
    /**
     * <p>id(0x129)</p>
     * <p>vtableId(92)</p>
     */
    @ComProperty(name = "_ReadOnlyRecommended", dispId = 0x129)
    Boolean get_ReadOnlyRecommended();
            
    /**
     * <p>id(0x5ac)</p>
     * <p>vtableId(93)</p>
     */
    @ComMethod(name = "RefreshAll", dispId = 0x5ac)
    void RefreshAll();
            
    /**
     * <p>id(0x3d1)</p>
     * <p>vtableId(94)</p>
     */
    @ComMethod(name = "Reply", dispId = 0x3d1)
    void Reply();
            
    /**
     * <p>id(0x3d2)</p>
     * <p>vtableId(95)</p>
     */
    @ComMethod(name = "ReplyAll", dispId = 0x3d2)
    void ReplyAll();
            
    /**
     * <p>id(0x5ad)</p>
     * <p>vtableId(96)</p>
     * @param Index [in] {@code Integer}
     */
    @ComMethod(name = "RemoveUser", dispId = 0x5ad)
    void RemoveUser(Integer Index);
            
    /**
     * <p>id(0x494)</p>
     * <p>vtableId(97)</p>
     */
    @ComProperty(name = "RevisionNumber", dispId = 0x494)
    Integer getRevisionNumber();
            
    /**
     * <p>id(0x3b2)</p>
     * <p>vtableId(98)</p>
     */
    @ComMethod(name = "Route", dispId = 0x3b2)
    void Route();
            
    /**
     * <p>id(0x3b7)</p>
     * <p>vtableId(99)</p>
     */
    @ComProperty(name = "Routed", dispId = 0x3b7)
    Boolean getRouted();
            
    /**
     * <p>id(0x3b5)</p>
     * <p>vtableId(100)</p>
     */
    @ComProperty(name = "RoutingSlip", dispId = 0x3b5)
    RoutingSlip getRoutingSlip();
            
    /**
     * <p>id(0x27a)</p>
     * <p>vtableId(101)</p>
     * @param Which [in] {@code XlRunAutoMacro}
     */
    @ComMethod(name = "RunAutoMacros", dispId = 0x27a)
    void RunAutoMacros(XlRunAutoMacro Which);
            
    /**
     * <p>id(0x11b)</p>
     * <p>vtableId(102)</p>
     */
    @ComMethod(name = "Save", dispId = 0x11b)
    void Save();
            
    /**
     * <p>id(0x11c)</p>
     * <p>vtableId(103)</p>
     * @param Filename [in, optional] {@code Object}
     * @param FileFormat [in, optional] {@code Object}
     * @param Password [in, optional] {@code Object}
     * @param WriteResPassword [in, optional] {@code Object}
     * @param ReadOnlyRecommended [in, optional] {@code Object}
     * @param CreateBackup [in, optional] {@code Object}
     * @param AccessMode [in, optional] {@code XlSaveAsAccessMode}
     * @param ConflictResolution [in, optional] {@code Object}
     * @param AddToMru [in, optional] {@code Object}
     * @param TextCodepage [in, optional] {@code Object}
     * @param TextVisualLayout [in, optional] {@code Object}
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
     * <p>vtableId(104)</p>
     * @param Filename [in, optional] {@code Object}
     */
    @ComMethod(name = "SaveCopyAs", dispId = 0xaf)
    void SaveCopyAs(Object Filename);
            
    /**
     * <p>id(0x12a)</p>
     * <p>vtableId(105)</p>
     */
    @ComProperty(name = "Saved", dispId = 0x12a)
    Boolean getSaved();
            
    /**
     * <p>id(0x12a)</p>
     * <p>vtableId(106)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "Saved", dispId = 0x12a)
    void setSaved(Boolean param0);
            
    /**
     * <p>id(0x196)</p>
     * <p>vtableId(107)</p>
     */
    @ComProperty(name = "SaveLinkValues", dispId = 0x196)
    Boolean getSaveLinkValues();
            
    /**
     * <p>id(0x196)</p>
     * <p>vtableId(108)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "SaveLinkValues", dispId = 0x196)
    void setSaveLinkValues(Boolean param0);
            
    /**
     * <p>id(0x3b3)</p>
     * <p>vtableId(109)</p>
     * @param Recipients [in] {@code Object}
     * @param Subject [in, optional] {@code Object}
     * @param ReturnReceipt [in, optional] {@code Object}
     */
    @ComMethod(name = "SendMail", dispId = 0x3b3)
    void SendMail(Object Recipients,
            Object Subject,
            Object ReturnReceipt);
            
    /**
     * <p>id(0x3d4)</p>
     * <p>vtableId(110)</p>
     * @param FileFormat [in, optional] {@code Object}
     * @param Priority [in, optional] {@code XlPriority}
     */
    @ComMethod(name = "SendMailer", dispId = 0x3d4)
    void SendMailer(Object FileFormat,
            XlPriority Priority);
            
    /**
     * <p>id(0x329)</p>
     * <p>vtableId(111)</p>
     * @param Name [in] {@code String}
     * @param Procedure [in, optional] {@code Object}
     */
    @ComMethod(name = "SetLinkOnData", dispId = 0x329)
    void SetLinkOnData(String Name,
            Object Procedure);
            
    /**
     * <p>id(0x1e5)</p>
     * <p>vtableId(112)</p>
     */
    @ComProperty(name = "Sheets", dispId = 0x1e5)
    Sheets getSheets();
            
    /**
     * <p>id(0x493)</p>
     * <p>vtableId(113)</p>
     */
    @ComProperty(name = "ShowConflictHistory", dispId = 0x493)
    Boolean getShowConflictHistory();
            
    /**
     * <p>id(0x493)</p>
     * <p>vtableId(114)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "ShowConflictHistory", dispId = 0x493)
    void setShowConflictHistory(Boolean param0);
            
    /**
     * <p>id(0x1ed)</p>
     * <p>vtableId(115)</p>
     */
    @ComProperty(name = "Styles", dispId = 0x1ed)
    Styles getStyles();
            
    /**
     * <p>id(0x3b9)</p>
     * <p>vtableId(116)</p>
     */
    @ComProperty(name = "Subject", dispId = 0x3b9)
    String getSubject();
            
    /**
     * <p>id(0x3b9)</p>
     * <p>vtableId(117)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "Subject", dispId = 0x3b9)
    void setSubject(String param0);
            
    /**
     * <p>id(0xc7)</p>
     * <p>vtableId(118)</p>
     */
    @ComProperty(name = "Title", dispId = 0xc7)
    String getTitle();
            
    /**
     * <p>id(0xc7)</p>
     * <p>vtableId(119)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "Title", dispId = 0xc7)
    void setTitle(String param0);
            
    /**
     * <p>id(0x11d)</p>
     * <p>vtableId(120)</p>
     * @param Password [in, optional] {@code Object}
     */
    @ComMethod(name = "Unprotect", dispId = 0x11d)
    void Unprotect(Object Password);
            
    /**
     * <p>id(0x5af)</p>
     * <p>vtableId(121)</p>
     * @param SharingPassword [in, optional] {@code Object}
     */
    @ComMethod(name = "UnprotectSharing", dispId = 0x5af)
    void UnprotectSharing(Object SharingPassword);
            
    /**
     * <p>id(0x3e3)</p>
     * <p>vtableId(122)</p>
     */
    @ComMethod(name = "UpdateFromFile", dispId = 0x3e3)
    void UpdateFromFile();
            
    /**
     * <p>id(0x324)</p>
     * <p>vtableId(123)</p>
     * @param Name [in, optional] {@code Object}
     * @param Type [in, optional] {@code Object}
     */
    @ComMethod(name = "UpdateLink", dispId = 0x324)
    void UpdateLink(Object Name,
            Object Type);
            
    /**
     * <p>id(0x19b)</p>
     * <p>vtableId(124)</p>
     */
    @ComProperty(name = "UpdateRemoteReferences", dispId = 0x19b)
    Boolean getUpdateRemoteReferences();
            
    /**
     * <p>id(0x19b)</p>
     * <p>vtableId(125)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "UpdateRemoteReferences", dispId = 0x19b)
    void setUpdateRemoteReferences(Boolean param0);
            
    /**
     * <p>id(0x4ba)</p>
     * <p>vtableId(126)</p>
     */
    @ComProperty(name = "UserControl", dispId = 0x4ba)
    Boolean getUserControl();
            
    /**
     * <p>id(0x4ba)</p>
     * <p>vtableId(127)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "UserControl", dispId = 0x4ba)
    void setUserControl(Boolean param0);
            
    /**
     * <p>id(0x495)</p>
     * <p>vtableId(128)</p>
     */
    @ComProperty(name = "UserStatus", dispId = 0x495)
    Object getUserStatus();
            
    /**
     * <p>id(0x5b0)</p>
     * <p>vtableId(129)</p>
     */
    @ComProperty(name = "CustomViews", dispId = 0x5b0)
    CustomViews getCustomViews();
            
    /**
     * <p>id(0x1ae)</p>
     * <p>vtableId(130)</p>
     */
    @ComProperty(name = "Windows", dispId = 0x1ae)
    Windows getWindows();
            
    /**
     * <p>id(0x1ee)</p>
     * <p>vtableId(131)</p>
     */
    @ComProperty(name = "Worksheets", dispId = 0x1ee)
    Sheets getWorksheets();
            
    /**
     * <p>id(0x12b)</p>
     * <p>vtableId(132)</p>
     */
    @ComProperty(name = "WriteReserved", dispId = 0x12b)
    Boolean getWriteReserved();
            
    /**
     * <p>id(0x12c)</p>
     * <p>vtableId(133)</p>
     */
    @ComProperty(name = "WriteReservedBy", dispId = 0x12c)
    String getWriteReservedBy();
            
    /**
     * <p>id(0x245)</p>
     * <p>vtableId(134)</p>
     */
    @ComProperty(name = "Excel4IntlMacroSheets", dispId = 0x245)
    Sheets getExcel4IntlMacroSheets();
            
    /**
     * <p>id(0x243)</p>
     * <p>vtableId(135)</p>
     */
    @ComProperty(name = "Excel4MacroSheets", dispId = 0x243)
    Sheets getExcel4MacroSheets();
            
    /**
     * <p>id(0x5b1)</p>
     * <p>vtableId(136)</p>
     */
    @ComProperty(name = "TemplateRemoveExtData", dispId = 0x5b1)
    Boolean getTemplateRemoveExtData();
            
    /**
     * <p>id(0x5b1)</p>
     * <p>vtableId(137)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "TemplateRemoveExtData", dispId = 0x5b1)
    void setTemplateRemoveExtData(Boolean param0);
            
    /**
     * <p>id(0x5b2)</p>
     * <p>vtableId(138)</p>
     * @param When [in, optional] {@code Object}
     * @param Who [in, optional] {@code Object}
     * @param Where [in, optional] {@code Object}
     */
    @ComMethod(name = "HighlightChangesOptions", dispId = 0x5b2)
    void HighlightChangesOptions(Object When,
            Object Who,
            Object Where);
            
    /**
     * <p>id(0x5b5)</p>
     * <p>vtableId(139)</p>
     */
    @ComProperty(name = "HighlightChangesOnScreen", dispId = 0x5b5)
    Boolean getHighlightChangesOnScreen();
            
    /**
     * <p>id(0x5b5)</p>
     * <p>vtableId(140)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "HighlightChangesOnScreen", dispId = 0x5b5)
    void setHighlightChangesOnScreen(Boolean param0);
            
    /**
     * <p>id(0x5b6)</p>
     * <p>vtableId(141)</p>
     */
    @ComProperty(name = "KeepChangeHistory", dispId = 0x5b6)
    Boolean getKeepChangeHistory();
            
    /**
     * <p>id(0x5b6)</p>
     * <p>vtableId(142)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "KeepChangeHistory", dispId = 0x5b6)
    void setKeepChangeHistory(Boolean param0);
            
    /**
     * <p>id(0x5b7)</p>
     * <p>vtableId(143)</p>
     */
    @ComProperty(name = "ListChangesOnNewSheet", dispId = 0x5b7)
    Boolean getListChangesOnNewSheet();
            
    /**
     * <p>id(0x5b7)</p>
     * <p>vtableId(144)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "ListChangesOnNewSheet", dispId = 0x5b7)
    void setListChangesOnNewSheet(Boolean param0);
            
    /**
     * <p>id(0x5b8)</p>
     * <p>vtableId(145)</p>
     * @param Days [in] {@code Integer}
     * @param SharingPassword [in, optional] {@code Object}
     */
    @ComMethod(name = "PurgeChangeHistoryNow", dispId = 0x5b8)
    void PurgeChangeHistoryNow(Integer Days,
            Object SharingPassword);
            
    /**
     * <p>id(0x5ba)</p>
     * <p>vtableId(146)</p>
     * @param When [in, optional] {@code Object}
     * @param Who [in, optional] {@code Object}
     * @param Where [in, optional] {@code Object}
     */
    @ComMethod(name = "AcceptAllChanges", dispId = 0x5ba)
    void AcceptAllChanges(Object When,
            Object Who,
            Object Where);
            
    /**
     * <p>id(0x5bb)</p>
     * <p>vtableId(147)</p>
     * @param When [in, optional] {@code Object}
     * @param Who [in, optional] {@code Object}
     * @param Where [in, optional] {@code Object}
     */
    @ComMethod(name = "RejectAllChanges", dispId = 0x5bb)
    void RejectAllChanges(Object When,
            Object Who,
            Object Where);
            
    /**
     * <p>id(0x2ac)</p>
     * <p>vtableId(148)</p>
     * @param SourceType [in, optional] {@code Object}
     * @param SourceData [in, optional] {@code Object}
     * @param TableDestination [in, optional] {@code Object}
     * @param TableName [in, optional] {@code Object}
     * @param RowGrand [in, optional] {@code Object}
     * @param ColumnGrand [in, optional] {@code Object}
     * @param SaveData [in, optional] {@code Object}
     * @param HasAutoFormat [in, optional] {@code Object}
     * @param AutoPage [in, optional] {@code Object}
     * @param Reserved [in, optional] {@code Object}
     * @param BackgroundQuery [in, optional] {@code Object}
     * @param OptimizeCache [in, optional] {@code Object}
     * @param PageFieldOrder [in, optional] {@code Object}
     * @param PageFieldWrapCount [in, optional] {@code Object}
     * @param ReadData [in, optional] {@code Object}
     * @param Connection [in, optional] {@code Object}
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
     * <p>vtableId(149)</p>
     */
    @ComMethod(name = "ResetColors", dispId = 0x5bc)
    void ResetColors();
            
    /**
     * <p>id(0x5bd)</p>
     * <p>vtableId(150)</p>
     */
    @ComProperty(name = "VBProject", dispId = 0x5bd)
    eu.doppel_helix.jna.tlb.vbide5.VBProject getVBProject();
            
    /**
     * <p>id(0x5be)</p>
     * <p>vtableId(151)</p>
     * @param Address [in] {@code String}
     * @param SubAddress [in, optional] {@code Object}
     * @param NewWindow [in, optional] {@code Object}
     * @param AddHistory [in, optional] {@code Object}
     * @param ExtraInfo [in, optional] {@code Object}
     * @param Method [in, optional] {@code Object}
     * @param HeaderInfo [in, optional] {@code Object}
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
     * <p>vtableId(152)</p>
     */
    @ComMethod(name = "AddToFavorites", dispId = 0x5c4)
    void AddToFavorites();
            
    /**
     * <p>id(0x6e9)</p>
     * <p>vtableId(153)</p>
     */
    @ComProperty(name = "IsInplace", dispId = 0x6e9)
    Boolean getIsInplace();
            
    /**
     * <p>id(0x6ec)</p>
     * <p>vtableId(154)</p>
     * @param From [in, optional] {@code Object}
     * @param To [in, optional] {@code Object}
     * @param Copies [in, optional] {@code Object}
     * @param Preview [in, optional] {@code Object}
     * @param ActivePrinter [in, optional] {@code Object}
     * @param PrintToFile [in, optional] {@code Object}
     * @param Collate [in, optional] {@code Object}
     * @param PrToFileName [in, optional] {@code Object}
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
     * <p>vtableId(155)</p>
     */
    @ComMethod(name = "WebPagePreview", dispId = 0x71a)
    void WebPagePreview();
            
    /**
     * <p>id(0x71b)</p>
     * <p>vtableId(156)</p>
     */
    @ComProperty(name = "PublishObjects", dispId = 0x71b)
    PublishObjects getPublishObjects();
            
    /**
     * <p>id(0x71c)</p>
     * <p>vtableId(157)</p>
     */
    @ComProperty(name = "WebOptions", dispId = 0x71c)
    WebOptions getWebOptions();
            
    /**
     * <p>id(0x71d)</p>
     * <p>vtableId(158)</p>
     * @param Encoding [in] {@code eu.doppel_helix.jna.tlb.office2.MsoEncoding}
     */
    @ComMethod(name = "ReloadAs", dispId = 0x71d)
    void ReloadAs(eu.doppel_helix.jna.tlb.office2.MsoEncoding Encoding);
            
    /**
     * <p>id(0x71f)</p>
     * <p>vtableId(159)</p>
     */
    @ComProperty(name = "HTMLProject", dispId = 0x71f)
    eu.doppel_helix.jna.tlb.office2.HTMLProject getHTMLProject();
            
    /**
     * <p>id(0x720)</p>
     * <p>vtableId(160)</p>
     */
    @ComProperty(name = "EnvelopeVisible", dispId = 0x720)
    Boolean getEnvelopeVisible();
            
    /**
     * <p>id(0x720)</p>
     * <p>vtableId(161)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "EnvelopeVisible", dispId = 0x720)
    void setEnvelopeVisible(Boolean param0);
            
    /**
     * <p>id(0x70e)</p>
     * <p>vtableId(162)</p>
     */
    @ComProperty(name = "CalculationVersion", dispId = 0x70e)
    Integer getCalculationVersion();
            
    /**
     * <p>id(0x7fc)</p>
     * <p>vtableId(163)</p>
     * @param calcid [in] {@code Integer}
     */
    @ComMethod(name = "Dummy17", dispId = 0x7fc)
    void Dummy17(Integer calcid);
            
    /**
     * <p>id(0x722)</p>
     * <p>vtableId(164)</p>
     * @param s [in] {@code String}
     */
    @ComMethod(name = "sblt", dispId = 0x722)
    void sblt(String s);
            
    /**
     * <p>id(0x724)</p>
     * <p>vtableId(165)</p>
     */
    @ComProperty(name = "VBASigned", dispId = 0x724)
    Boolean getVBASigned();
            
    /**
     * <p>id(0x7fe)</p>
     * <p>vtableId(166)</p>
     */
    @ComProperty(name = "ShowPivotTableFieldList", dispId = 0x7fe)
    Boolean getShowPivotTableFieldList();
            
    /**
     * <p>id(0x7fe)</p>
     * <p>vtableId(167)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "ShowPivotTableFieldList", dispId = 0x7fe)
    void setShowPivotTableFieldList(Boolean param0);
            
    /**
     * <p>id(0x360)</p>
     * <p>vtableId(168)</p>
     */
    @ComProperty(name = "UpdateLinks", dispId = 0x360)
    XlUpdateLinks getUpdateLinks();
            
    /**
     * <p>id(0x360)</p>
     * <p>vtableId(169)</p>
     * @param param0 [in] {@code XlUpdateLinks}
     */
    @ComProperty(name = "UpdateLinks", dispId = 0x360)
    void setUpdateLinks(XlUpdateLinks param0);
            
    /**
     * <p>id(0x7ff)</p>
     * <p>vtableId(170)</p>
     * @param Name [in] {@code String}
     * @param Type [in] {@code XlLinkType}
     */
    @ComMethod(name = "BreakLink", dispId = 0x7ff)
    void BreakLink(String Name,
            XlLinkType Type);
            
    /**
     * <p>id(0x800)</p>
     * <p>vtableId(171)</p>
     */
    @ComMethod(name = "Dummy16", dispId = 0x800)
    void Dummy16();
            
    /**
     * <p>id(0x785)</p>
     * <p>vtableId(172)</p>
     * @param Filename [in, optional] {@code Object}
     * @param FileFormat [in, optional] {@code Object}
     * @param Password [in, optional] {@code Object}
     * @param WriteResPassword [in, optional] {@code Object}
     * @param ReadOnlyRecommended [in, optional] {@code Object}
     * @param CreateBackup [in, optional] {@code Object}
     * @param AccessMode [in, optional] {@code XlSaveAsAccessMode}
     * @param ConflictResolution [in, optional] {@code Object}
     * @param AddToMru [in, optional] {@code Object}
     * @param TextCodepage [in, optional] {@code Object}
     * @param TextVisualLayout [in, optional] {@code Object}
     * @param Local [in, optional] {@code Object}
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
     * <p>vtableId(173)</p>
     */
    @ComProperty(name = "EnableAutoRecover", dispId = 0x801)
    Boolean getEnableAutoRecover();
            
    /**
     * <p>id(0x801)</p>
     * <p>vtableId(174)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "EnableAutoRecover", dispId = 0x801)
    void setEnableAutoRecover(Boolean param0);
            
    /**
     * <p>id(0x802)</p>
     * <p>vtableId(175)</p>
     */
    @ComProperty(name = "RemovePersonalInformation", dispId = 0x802)
    Boolean getRemovePersonalInformation();
            
    /**
     * <p>id(0x802)</p>
     * <p>vtableId(176)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "RemovePersonalInformation", dispId = 0x802)
    void setRemovePersonalInformation(Boolean param0);
            
    /**
     * <p>id(0x787)</p>
     * <p>vtableId(177)</p>
     */
    @ComProperty(name = "FullNameURLEncoded", dispId = 0x787)
    String getFullNameURLEncoded();
            
    /**
     * <p>id(0x803)</p>
     * <p>vtableId(178)</p>
     * @param SaveChanges [in, optional] {@code Object}
     * @param Comments [in, optional] {@code Object}
     * @param MakePublic [in, optional] {@code Object}
     */
    @ComMethod(name = "CheckIn", dispId = 0x803)
    void CheckIn(Object SaveChanges,
            Object Comments,
            Object MakePublic);
            
    /**
     * <p>id(0x805)</p>
     * <p>vtableId(179)</p>
     */
    @ComMethod(name = "CanCheckIn", dispId = 0x805)
    Boolean CanCheckIn();
            
    /**
     * <p>id(0x806)</p>
     * <p>vtableId(180)</p>
     * @param Recipients [in, optional] {@code Object}
     * @param Subject [in, optional] {@code Object}
     * @param ShowMessage [in, optional] {@code Object}
     * @param IncludeAttachment [in, optional] {@code Object}
     */
    @ComMethod(name = "SendForReview", dispId = 0x806)
    void SendForReview(Object Recipients,
            Object Subject,
            Object ShowMessage,
            Object IncludeAttachment);
            
    /**
     * <p>id(0x809)</p>
     * <p>vtableId(181)</p>
     * @param ShowMessage [in, optional] {@code Object}
     */
    @ComMethod(name = "ReplyWithChanges", dispId = 0x809)
    void ReplyWithChanges(Object ShowMessage);
            
    /**
     * <p>id(0x80a)</p>
     * <p>vtableId(182)</p>
     */
    @ComMethod(name = "EndReview", dispId = 0x80a)
    void EndReview();
            
    /**
     * <p>id(0x1ad)</p>
     * <p>vtableId(183)</p>
     */
    @ComProperty(name = "Password", dispId = 0x1ad)
    String getPassword();
            
    /**
     * <p>id(0x1ad)</p>
     * <p>vtableId(184)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "Password", dispId = 0x1ad)
    void setPassword(String param0);
            
    /**
     * <p>id(0x468)</p>
     * <p>vtableId(185)</p>
     */
    @ComProperty(name = "WritePassword", dispId = 0x468)
    String getWritePassword();
            
    /**
     * <p>id(0x468)</p>
     * <p>vtableId(186)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "WritePassword", dispId = 0x468)
    void setWritePassword(String param0);
            
    /**
     * <p>id(0x80b)</p>
     * <p>vtableId(187)</p>
     */
    @ComProperty(name = "PasswordEncryptionProvider", dispId = 0x80b)
    String getPasswordEncryptionProvider();
            
    /**
     * <p>id(0x80c)</p>
     * <p>vtableId(188)</p>
     */
    @ComProperty(name = "PasswordEncryptionAlgorithm", dispId = 0x80c)
    String getPasswordEncryptionAlgorithm();
            
    /**
     * <p>id(0x80d)</p>
     * <p>vtableId(189)</p>
     */
    @ComProperty(name = "PasswordEncryptionKeyLength", dispId = 0x80d)
    Integer getPasswordEncryptionKeyLength();
            
    /**
     * <p>id(0x80e)</p>
     * <p>vtableId(190)</p>
     * @param PasswordEncryptionProvider [in, optional] {@code Object}
     * @param PasswordEncryptionAlgorithm [in, optional] {@code Object}
     * @param PasswordEncryptionKeyLength [in, optional] {@code Object}
     * @param PasswordEncryptionFileProperties [in, optional] {@code Object}
     */
    @ComMethod(name = "SetPasswordEncryptionOptions", dispId = 0x80e)
    void SetPasswordEncryptionOptions(Object PasswordEncryptionProvider,
            Object PasswordEncryptionAlgorithm,
            Object PasswordEncryptionKeyLength,
            Object PasswordEncryptionFileProperties);
            
    /**
     * <p>id(0x80f)</p>
     * <p>vtableId(191)</p>
     */
    @ComProperty(name = "PasswordEncryptionFileProperties", dispId = 0x80f)
    Boolean getPasswordEncryptionFileProperties();
            
    /**
     * <p>id(0x7d5)</p>
     * <p>vtableId(192)</p>
     */
    @ComProperty(name = "ReadOnlyRecommended", dispId = 0x7d5)
    Boolean getReadOnlyRecommended();
            
    /**
     * <p>id(0x7d5)</p>
     * <p>vtableId(193)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "ReadOnlyRecommended", dispId = 0x7d5)
    void setReadOnlyRecommended(Boolean param0);
            
    /**
     * <p>id(0x7ed)</p>
     * <p>vtableId(194)</p>
     * @param Password [in, optional] {@code Object}
     * @param Structure [in, optional] {@code Object}
     * @param Windows [in, optional] {@code Object}
     */
    @ComMethod(name = "Protect", dispId = 0x7ed)
    void Protect(Object Password,
            Object Structure,
            Object Windows);
            
    /**
     * <p>id(0x810)</p>
     * <p>vtableId(195)</p>
     */
    @ComProperty(name = "SmartTagOptions", dispId = 0x810)
    SmartTagOptions getSmartTagOptions();
            
    /**
     * <p>id(0x811)</p>
     * <p>vtableId(196)</p>
     */
    @ComMethod(name = "RecheckSmartTags", dispId = 0x811)
    void RecheckSmartTags();
            
    /**
     * <p>id(0x8d8)</p>
     * <p>vtableId(197)</p>
     */
    @ComProperty(name = "Permission", dispId = 0x8d8)
    eu.doppel_helix.jna.tlb.office2.Permission getPermission();
            
    /**
     * <p>id(0x8d9)</p>
     * <p>vtableId(198)</p>
     */
    @ComProperty(name = "SharedWorkspace", dispId = 0x8d9)
    eu.doppel_helix.jna.tlb.office2.SharedWorkspace getSharedWorkspace();
            
    /**
     * <p>id(0x8da)</p>
     * <p>vtableId(199)</p>
     */
    @ComProperty(name = "Sync", dispId = 0x8da)
    eu.doppel_helix.jna.tlb.office2.Sync getSync();
            
    /**
     * <p>id(0x8db)</p>
     * <p>vtableId(200)</p>
     * @param Recipients [in, optional] {@code Object}
     * @param Subject [in, optional] {@code Object}
     * @param ShowMessage [in, optional] {@code Object}
     */
    @ComMethod(name = "SendFaxOverInternet", dispId = 0x8db)
    void SendFaxOverInternet(Object Recipients,
            Object Subject,
            Object ShowMessage);
            
    /**
     * <p>id(0x8dc)</p>
     * <p>vtableId(201)</p>
     */
    @ComProperty(name = "XmlNamespaces", dispId = 0x8dc)
    XmlNamespaces getXmlNamespaces();
            
    /**
     * <p>id(0x8dd)</p>
     * <p>vtableId(202)</p>
     */
    @ComProperty(name = "XmlMaps", dispId = 0x8dd)
    XmlMaps getXmlMaps();
            
    /**
     * <p>id(0x8de)</p>
     * <p>vtableId(203)</p>
     * @param Url [in] {@code String}
     * @param ImportMap [out] {@code XmlMap}
     * @param Overwrite [in, optional] {@code Object}
     * @param Destination [in, optional] {@code Object}
     */
    @ComMethod(name = "XmlImport", dispId = 0x8de)
    XlXmlImportResult XmlImport(String Url,
            VARIANT ImportMap,
            Object Overwrite,
            Object Destination);
            
    /**
     * <p>id(0x8e1)</p>
     * <p>vtableId(204)</p>
     */
    @ComProperty(name = "SmartDocument", dispId = 0x8e1)
    eu.doppel_helix.jna.tlb.office2.SmartDocument getSmartDocument();
            
    /**
     * <p>id(0x8e2)</p>
     * <p>vtableId(205)</p>
     */
    @ComProperty(name = "DocumentLibraryVersions", dispId = 0x8e2)
    eu.doppel_helix.jna.tlb.office2.DocumentLibraryVersions getDocumentLibraryVersions();
            
    /**
     * <p>id(0x8e3)</p>
     * <p>vtableId(206)</p>
     */
    @ComProperty(name = "InactiveListBorderVisible", dispId = 0x8e3)
    Boolean getInactiveListBorderVisible();
            
    /**
     * <p>id(0x8e3)</p>
     * <p>vtableId(207)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "InactiveListBorderVisible", dispId = 0x8e3)
    void setInactiveListBorderVisible(Boolean param0);
            
    /**
     * <p>id(0x8e4)</p>
     * <p>vtableId(208)</p>
     */
    @ComProperty(name = "DisplayInkComments", dispId = 0x8e4)
    Boolean getDisplayInkComments();
            
    /**
     * <p>id(0x8e4)</p>
     * <p>vtableId(209)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "DisplayInkComments", dispId = 0x8e4)
    void setDisplayInkComments(Boolean param0);
            
    /**
     * <p>id(0x8e5)</p>
     * <p>vtableId(210)</p>
     * @param Data [in] {@code String}
     * @param ImportMap [out] {@code XmlMap}
     * @param Overwrite [in, optional] {@code Object}
     * @param Destination [in, optional] {@code Object}
     */
    @ComMethod(name = "XmlImportXml", dispId = 0x8e5)
    XlXmlImportResult XmlImportXml(String Data,
            VARIANT ImportMap,
            Object Overwrite,
            Object Destination);
            
    /**
     * <p>id(0x8e6)</p>
     * <p>vtableId(211)</p>
     * @param Filename [in] {@code String}
     * @param Map [in] {@code XmlMap}
     */
    @ComMethod(name = "SaveAsXMLData", dispId = 0x8e6)
    void SaveAsXMLData(String Filename,
            XmlMap Map);
            
    /**
     * <p>id(0x8e7)</p>
     * <p>vtableId(212)</p>
     */
    @ComMethod(name = "ToggleFormsDesign", dispId = 0x8e7)
    void ToggleFormsDesign();
            
    /**
     * <p>id(0x9d0)</p>
     * <p>vtableId(213)</p>
     */
    @ComProperty(name = "ContentTypeProperties", dispId = 0x9d0)
    eu.doppel_helix.jna.tlb.office2.MetaProperties getContentTypeProperties();
            
    /**
     * <p>id(0x9d1)</p>
     * <p>vtableId(214)</p>
     */
    @ComProperty(name = "Connections", dispId = 0x9d1)
    Connections getConnections();
            
    /**
     * <p>id(0x9d2)</p>
     * <p>vtableId(215)</p>
     * @param RemoveDocInfoType [in] {@code XlRemoveDocInfoType}
     */
    @ComMethod(name = "RemoveDocumentInformation", dispId = 0x9d2)
    void RemoveDocumentInformation(XlRemoveDocInfoType RemoveDocInfoType);
            
    /**
     * <p>id(0x9d4)</p>
     * <p>vtableId(216)</p>
     */
    @ComProperty(name = "Signatures", dispId = 0x9d4)
    eu.doppel_helix.jna.tlb.office2.SignatureSet getSignatures();
            
    /**
     * <p>id(0x9d5)</p>
     * <p>vtableId(217)</p>
     * @param SaveChanges [in, optional] {@code Object}
     * @param Comments [in, optional] {@code Object}
     * @param MakePublic [in, optional] {@code Object}
     * @param VersionType [in, optional] {@code Object}
     */
    @ComMethod(name = "CheckInWithVersion", dispId = 0x9d5)
    void CheckInWithVersion(Object SaveChanges,
            Object Comments,
            Object MakePublic,
            Object VersionType);
            
    /**
     * <p>id(0x9d7)</p>
     * <p>vtableId(218)</p>
     */
    @ComProperty(name = "ServerPolicy", dispId = 0x9d7)
    eu.doppel_helix.jna.tlb.office2.ServerPolicy getServerPolicy();
            
    /**
     * <p>id(0x9d8)</p>
     * <p>vtableId(219)</p>
     */
    @ComMethod(name = "LockServerFile", dispId = 0x9d8)
    void LockServerFile();
            
    /**
     * <p>id(0x9d9)</p>
     * <p>vtableId(220)</p>
     */
    @ComProperty(name = "DocumentInspectors", dispId = 0x9d9)
    eu.doppel_helix.jna.tlb.office2.DocumentInspectors getDocumentInspectors();
            
    /**
     * <p>id(0x9da)</p>
     * <p>vtableId(221)</p>
     */
    @ComMethod(name = "GetWorkflowTasks", dispId = 0x9da)
    eu.doppel_helix.jna.tlb.office2.WorkflowTasks GetWorkflowTasks();
            
    /**
     * <p>id(0x9db)</p>
     * <p>vtableId(222)</p>
     */
    @ComMethod(name = "GetWorkflowTemplates", dispId = 0x9db)
    eu.doppel_helix.jna.tlb.office2.WorkflowTemplates GetWorkflowTemplates();
            
    /**
     * <p>id(0x939)</p>
     * <p>vtableId(223)</p>
     * @param From [in, optional] {@code Object}
     * @param To [in, optional] {@code Object}
     * @param Copies [in, optional] {@code Object}
     * @param Preview [in, optional] {@code Object}
     * @param ActivePrinter [in, optional] {@code Object}
     * @param PrintToFile [in, optional] {@code Object}
     * @param Collate [in, optional] {@code Object}
     * @param PrToFileName [in, optional] {@code Object}
     * @param IgnorePrintAreas [in, optional] {@code Object}
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
     * <p>vtableId(224)</p>
     */
    @ComProperty(name = "ServerViewableItems", dispId = 0x9dc)
    ServerViewableItems getServerViewableItems();
            
    /**
     * <p>id(0x9dd)</p>
     * <p>vtableId(225)</p>
     */
    @ComProperty(name = "TableStyles", dispId = 0x9dd)
    TableStyles getTableStyles();
            
    /**
     * <p>id(0x9de)</p>
     * <p>vtableId(226)</p>
     */
    @ComProperty(name = "DefaultTableStyle", dispId = 0x9de)
    Object getDefaultTableStyle();
            
    /**
     * <p>id(0x9de)</p>
     * <p>vtableId(227)</p>
     * @param param0 [in] {@code Object}
     */
    @ComProperty(name = "DefaultTableStyle", dispId = 0x9de)
    void setDefaultTableStyle(Object param0);
            
    /**
     * <p>id(0x9df)</p>
     * <p>vtableId(228)</p>
     */
    @ComProperty(name = "DefaultPivotTableStyle", dispId = 0x9df)
    Object getDefaultPivotTableStyle();
            
    /**
     * <p>id(0x9df)</p>
     * <p>vtableId(229)</p>
     * @param param0 [in] {@code Object}
     */
    @ComProperty(name = "DefaultPivotTableStyle", dispId = 0x9df)
    void setDefaultPivotTableStyle(Object param0);
            
    /**
     * <p>id(0x9e0)</p>
     * <p>vtableId(230)</p>
     */
    @ComProperty(name = "CheckCompatibility", dispId = 0x9e0)
    Boolean getCheckCompatibility();
            
    /**
     * <p>id(0x9e0)</p>
     * <p>vtableId(231)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "CheckCompatibility", dispId = 0x9e0)
    void setCheckCompatibility(Boolean param0);
            
    /**
     * <p>id(0x9e1)</p>
     * <p>vtableId(232)</p>
     */
    @ComProperty(name = "HasVBProject", dispId = 0x9e1)
    Boolean getHasVBProject();
            
    /**
     * <p>id(0x9e2)</p>
     * <p>vtableId(233)</p>
     */
    @ComProperty(name = "CustomXMLParts", dispId = 0x9e2)
    eu.doppel_helix.jna.tlb.office2.CustomXMLParts getCustomXMLParts();
            
    /**
     * <p>id(0x9e3)</p>
     * <p>vtableId(234)</p>
     */
    @ComProperty(name = "Final", dispId = 0x9e3)
    Boolean get_Final();
            
    /**
     * <p>id(0x9e3)</p>
     * <p>vtableId(235)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "Final", dispId = 0x9e3)
    void set_Final(Boolean param0);
            
    /**
     * <p>id(0x9e4)</p>
     * <p>vtableId(236)</p>
     */
    @ComProperty(name = "Research", dispId = 0x9e4)
    Research getResearch();
            
    /**
     * <p>id(0x9e5)</p>
     * <p>vtableId(237)</p>
     */
    @ComProperty(name = "Theme", dispId = 0x9e5)
    eu.doppel_helix.jna.tlb.office2.OfficeTheme getTheme();
            
    /**
     * <p>id(0x9e6)</p>
     * <p>vtableId(238)</p>
     * @param Filename [in] {@code String}
     */
    @ComMethod(name = "ApplyTheme", dispId = 0x9e6)
    void ApplyTheme(String Filename);
            
    /**
     * <p>id(0x9e7)</p>
     * <p>vtableId(239)</p>
     */
    @ComProperty(name = "Excel8CompatibilityMode", dispId = 0x9e7)
    Boolean getExcel8CompatibilityMode();
            
    /**
     * <p>id(0x9e8)</p>
     * <p>vtableId(240)</p>
     */
    @ComProperty(name = "ConnectionsDisabled", dispId = 0x9e8)
    Boolean getConnectionsDisabled();
            
    /**
     * <p>id(0x9e9)</p>
     * <p>vtableId(241)</p>
     */
    @ComMethod(name = "EnableConnections", dispId = 0x9e9)
    void EnableConnections();
            
    /**
     * <p>id(0x9ea)</p>
     * <p>vtableId(242)</p>
     */
    @ComProperty(name = "ShowPivotChartActiveFields", dispId = 0x9ea)
    Boolean getShowPivotChartActiveFields();
            
    /**
     * <p>id(0x9ea)</p>
     * <p>vtableId(243)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "ShowPivotChartActiveFields", dispId = 0x9ea)
    void setShowPivotChartActiveFields(Boolean param0);
            
    /**
     * <p>id(0x9bd)</p>
     * <p>vtableId(244)</p>
     * @param Type [in] {@code XlFixedFormatType}
     * @param Filename [in, optional] {@code Object}
     * @param Quality [in, optional] {@code Object}
     * @param IncludeDocProperties [in, optional] {@code Object}
     * @param IgnorePrintAreas [in, optional] {@code Object}
     * @param From [in, optional] {@code Object}
     * @param To [in, optional] {@code Object}
     * @param OpenAfterPublish [in, optional] {@code Object}
     * @param FixedFormatExtClassPtr [in, optional] {@code Object}
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
     * <p>vtableId(245)</p>
     */
    @ComProperty(name = "IconSets", dispId = 0x9eb)
    IconSets getIconSets();
            
    /**
     * <p>id(0x9ec)</p>
     * <p>vtableId(246)</p>
     */
    @ComProperty(name = "EncryptionProvider", dispId = 0x9ec)
    String getEncryptionProvider();
            
    /**
     * <p>id(0x9ec)</p>
     * <p>vtableId(247)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "EncryptionProvider", dispId = 0x9ec)
    void setEncryptionProvider(String param0);
            
    /**
     * <p>id(0x9ed)</p>
     * <p>vtableId(248)</p>
     */
    @ComProperty(name = "DoNotPromptForConvert", dispId = 0x9ed)
    Boolean getDoNotPromptForConvert();
            
    /**
     * <p>id(0x9ed)</p>
     * <p>vtableId(249)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "DoNotPromptForConvert", dispId = 0x9ed)
    void setDoNotPromptForConvert(Boolean param0);
            
    /**
     * <p>id(0x9ee)</p>
     * <p>vtableId(250)</p>
     */
    @ComProperty(name = "ForceFullCalculation", dispId = 0x9ee)
    Boolean getForceFullCalculation();
            
    /**
     * <p>id(0x9ee)</p>
     * <p>vtableId(251)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "ForceFullCalculation", dispId = 0x9ee)
    void setForceFullCalculation(Boolean param0);
            
    /**
     * <p>id(0x9ef)</p>
     * <p>vtableId(252)</p>
     * @param Filename [in, optional] {@code Object}
     * @param Password [in, optional] {@code Object}
     * @param WriteResPassword [in, optional] {@code Object}
     * @param ReadOnlyRecommended [in, optional] {@code Object}
     * @param CreateBackup [in, optional] {@code Object}
     * @param SharingPassword [in, optional] {@code Object}
     * @param FileFormat [in, optional] {@code Object}
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
     * <p>vtableId(253)</p>
     */
    @ComProperty(name = "SlicerCaches", dispId = 0xb32)
    SlicerCaches getSlicerCaches();
            
    /**
     * <p>id(0xb33)</p>
     * <p>vtableId(254)</p>
     */
    @ComProperty(name = "ActiveSlicer", dispId = 0xb33)
    Slicer getActiveSlicer();
            
    /**
     * <p>id(0xb34)</p>
     * <p>vtableId(255)</p>
     */
    @ComProperty(name = "DefaultSlicerStyle", dispId = 0xb34)
    Object getDefaultSlicerStyle();
            
    /**
     * <p>id(0xb34)</p>
     * <p>vtableId(256)</p>
     * @param param0 [in] {@code Object}
     */
    @ComProperty(name = "DefaultSlicerStyle", dispId = 0xb34)
    void setDefaultSlicerStyle(Object param0);
            
    /**
     * <p>id(0xb35)</p>
     * <p>vtableId(257)</p>
     */
    @ComMethod(name = "Dummy26", dispId = 0xb35)
    void Dummy26();
            
    /**
     * <p>id(0xb36)</p>
     * <p>vtableId(258)</p>
     */
    @ComMethod(name = "Dummy27", dispId = 0xb36)
    void Dummy27();
            
    /**
     * <p>id(0xb37)</p>
     * <p>vtableId(259)</p>
     */
    @ComProperty(name = "AccuracyVersion", dispId = 0xb37)
    Integer getAccuracyVersion();
            
    /**
     * <p>id(0xb37)</p>
     * <p>vtableId(260)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "AccuracyVersion", dispId = 0xb37)
    void setAccuracyVersion(Integer param0);
            
    /**
     * <p>id(0xbf0)</p>
     * <p>vtableId(261)</p>
     */
    @ComProperty(name = "CaseSensitive", dispId = 0xbf0)
    Boolean getCaseSensitive();
            
    /**
     * <p>id(0xbf1)</p>
     * <p>vtableId(262)</p>
     */
    @ComProperty(name = "UseWholeCellCriteria", dispId = 0xbf1)
    Boolean getUseWholeCellCriteria();
            
    /**
     * <p>id(0xbf2)</p>
     * <p>vtableId(263)</p>
     */
    @ComProperty(name = "UseWildcards", dispId = 0xbf2)
    Boolean getUseWildcards();
            
    /**
     * <p>id(0x2b2)</p>
     * <p>vtableId(264)</p>
     */
    @ComProperty(name = "PivotTables", dispId = 0x2b2)
    com.sun.jna.platform.win32.COM.util.IDispatch getPivotTables();
            
    /**
     * <p>id(0xbf3)</p>
     * <p>vtableId(265)</p>
     */
    @ComProperty(name = "Model", dispId = 0xbf3)
    Model getModel();
            
    /**
     * <p>id(0xbb6)</p>
     * <p>vtableId(266)</p>
     */
    @ComProperty(name = "ChartDataPointTrack", dispId = 0xbb6)
    Boolean getChartDataPointTrack();
            
    /**
     * <p>id(0xbb6)</p>
     * <p>vtableId(267)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "ChartDataPointTrack", dispId = 0xbb6)
    void setChartDataPointTrack(Boolean param0);
            
    /**
     * <p>id(0xbf4)</p>
     * <p>vtableId(268)</p>
     */
    @ComProperty(name = "DefaultTimelineStyle", dispId = 0xbf4)
    Object getDefaultTimelineStyle();
            
    /**
     * <p>id(0xbf4)</p>
     * <p>vtableId(269)</p>
     * @param param0 [in] {@code Object}
     */
    @ComProperty(name = "DefaultTimelineStyle", dispId = 0xbf4)
    void setDefaultTimelineStyle(Object param0);
            
    
}