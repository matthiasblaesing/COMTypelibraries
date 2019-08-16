
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00020970-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{00020970-0000-0000-C000-000000000046}")
public interface _Application extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x3e8)</p>
     * <p>vtableId(7)</p>
     */
    @ComProperty(name = "Application", dispId = 0x3e8)
    Application getApplication();
            
    /**
     * <p>id(0x3e9)</p>
     * <p>vtableId(8)</p>
     */
    @ComProperty(name = "Creator", dispId = 0x3e9)
    Integer getCreator();
            
    /**
     * <p>id(0x3ea)</p>
     * <p>vtableId(9)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x3ea)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * <p>id(0x0)</p>
     * <p>vtableId(10)</p>
     */
    @ComProperty(name = "Name", dispId = 0x0)
    String getName();
            
    /**
     * <p>id(0x6)</p>
     * <p>vtableId(11)</p>
     */
    @ComProperty(name = "Documents", dispId = 0x6)
    Documents getDocuments();
            
    /**
     * <p>id(0x2)</p>
     * <p>vtableId(12)</p>
     */
    @ComProperty(name = "Windows", dispId = 0x2)
    Windows getWindows();
            
    /**
     * <p>id(0x3)</p>
     * <p>vtableId(13)</p>
     */
    @ComProperty(name = "ActiveDocument", dispId = 0x3)
    Document getActiveDocument();
            
    /**
     * <p>id(0x4)</p>
     * <p>vtableId(14)</p>
     */
    @ComProperty(name = "ActiveWindow", dispId = 0x4)
    Window getActiveWindow();
            
    /**
     * <p>id(0x5)</p>
     * <p>vtableId(15)</p>
     */
    @ComProperty(name = "Selection", dispId = 0x5)
    Selection getSelection();
            
    /**
     * <p>id(0x1)</p>
     * <p>vtableId(16)</p>
     */
    @ComProperty(name = "WordBasic", dispId = 0x1)
    com.sun.jna.platform.win32.COM.util.IDispatch getWordBasic();
            
    /**
     * <p>id(0x7)</p>
     * <p>vtableId(17)</p>
     */
    @ComProperty(name = "RecentFiles", dispId = 0x7)
    RecentFiles getRecentFiles();
            
    /**
     * <p>id(0x8)</p>
     * <p>vtableId(18)</p>
     */
    @ComProperty(name = "NormalTemplate", dispId = 0x8)
    Template getNormalTemplate();
            
    /**
     * <p>id(0x9)</p>
     * <p>vtableId(19)</p>
     */
    @ComProperty(name = "System", dispId = 0x9)
    System getSystem();
            
    /**
     * <p>id(0xa)</p>
     * <p>vtableId(20)</p>
     */
    @ComProperty(name = "AutoCorrect", dispId = 0xa)
    AutoCorrect getAutoCorrect();
            
    /**
     * <p>id(0xb)</p>
     * <p>vtableId(21)</p>
     */
    @ComProperty(name = "FontNames", dispId = 0xb)
    FontNames getFontNames();
            
    /**
     * <p>id(0xc)</p>
     * <p>vtableId(22)</p>
     */
    @ComProperty(name = "LandscapeFontNames", dispId = 0xc)
    FontNames getLandscapeFontNames();
            
    /**
     * <p>id(0xd)</p>
     * <p>vtableId(23)</p>
     */
    @ComProperty(name = "PortraitFontNames", dispId = 0xd)
    FontNames getPortraitFontNames();
            
    /**
     * <p>id(0xe)</p>
     * <p>vtableId(24)</p>
     */
    @ComProperty(name = "Languages", dispId = 0xe)
    Languages getLanguages();
            
    /**
     * <p>id(0xf)</p>
     * <p>vtableId(25)</p>
     */
    @ComProperty(name = "Assistant", dispId = 0xf)
    eu.doppel_helix.jna.tlb.office2.Assistant getAssistant();
            
    /**
     * <p>id(0x10)</p>
     * <p>vtableId(26)</p>
     */
    @ComProperty(name = "Browser", dispId = 0x10)
    Browser getBrowser();
            
    /**
     * <p>id(0x11)</p>
     * <p>vtableId(27)</p>
     */
    @ComProperty(name = "FileConverters", dispId = 0x11)
    FileConverters getFileConverters();
            
    /**
     * <p>id(0x12)</p>
     * <p>vtableId(28)</p>
     */
    @ComProperty(name = "MailingLabel", dispId = 0x12)
    MailingLabel getMailingLabel();
            
    /**
     * <p>id(0x13)</p>
     * <p>vtableId(29)</p>
     */
    @ComProperty(name = "Dialogs", dispId = 0x13)
    Dialogs getDialogs();
            
    /**
     * <p>id(0x14)</p>
     * <p>vtableId(30)</p>
     */
    @ComProperty(name = "CaptionLabels", dispId = 0x14)
    CaptionLabels getCaptionLabels();
            
    /**
     * <p>id(0x15)</p>
     * <p>vtableId(31)</p>
     */
    @ComProperty(name = "AutoCaptions", dispId = 0x15)
    AutoCaptions getAutoCaptions();
            
    /**
     * <p>id(0x16)</p>
     * <p>vtableId(32)</p>
     */
    @ComProperty(name = "AddIns", dispId = 0x16)
    AddIns getAddIns();
            
    /**
     * <p>id(0x17)</p>
     * <p>vtableId(33)</p>
     */
    @ComProperty(name = "Visible", dispId = 0x17)
    Boolean getVisible();
            
    /**
     * <p>id(0x17)</p>
     * <p>vtableId(34)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "Visible", dispId = 0x17)
    void setVisible(Boolean param0);
            
    /**
     * <p>id(0x18)</p>
     * <p>vtableId(35)</p>
     */
    @ComProperty(name = "Version", dispId = 0x18)
    String getVersion();
            
    /**
     * <p>id(0x1a)</p>
     * <p>vtableId(36)</p>
     */
    @ComProperty(name = "ScreenUpdating", dispId = 0x1a)
    Boolean getScreenUpdating();
            
    /**
     * <p>id(0x1a)</p>
     * <p>vtableId(37)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "ScreenUpdating", dispId = 0x1a)
    void setScreenUpdating(Boolean param0);
            
    /**
     * <p>id(0x1b)</p>
     * <p>vtableId(38)</p>
     */
    @ComProperty(name = "PrintPreview", dispId = 0x1b)
    Boolean getPrintPreview();
            
    /**
     * <p>id(0x1b)</p>
     * <p>vtableId(39)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "PrintPreview", dispId = 0x1b)
    void setPrintPreview(Boolean param0);
            
    /**
     * <p>id(0x1c)</p>
     * <p>vtableId(40)</p>
     */
    @ComProperty(name = "Tasks", dispId = 0x1c)
    Tasks getTasks();
            
    /**
     * <p>id(0x1d)</p>
     * <p>vtableId(41)</p>
     */
    @ComProperty(name = "DisplayStatusBar", dispId = 0x1d)
    Boolean getDisplayStatusBar();
            
    /**
     * <p>id(0x1d)</p>
     * <p>vtableId(42)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "DisplayStatusBar", dispId = 0x1d)
    void setDisplayStatusBar(Boolean param0);
            
    /**
     * <p>id(0x1e)</p>
     * <p>vtableId(43)</p>
     */
    @ComProperty(name = "SpecialMode", dispId = 0x1e)
    Boolean getSpecialMode();
            
    /**
     * <p>id(0x21)</p>
     * <p>vtableId(44)</p>
     */
    @ComProperty(name = "UsableWidth", dispId = 0x21)
    Integer getUsableWidth();
            
    /**
     * <p>id(0x22)</p>
     * <p>vtableId(45)</p>
     */
    @ComProperty(name = "UsableHeight", dispId = 0x22)
    Integer getUsableHeight();
            
    /**
     * <p>id(0x24)</p>
     * <p>vtableId(46)</p>
     */
    @ComProperty(name = "MathCoprocessorAvailable", dispId = 0x24)
    Boolean getMathCoprocessorAvailable();
            
    /**
     * <p>id(0x25)</p>
     * <p>vtableId(47)</p>
     */
    @ComProperty(name = "MouseAvailable", dispId = 0x25)
    Boolean getMouseAvailable();
            
    /**
     * <p>id(0x2e)</p>
     * <p>vtableId(48)</p>
     * @param Index [in] {@code WdInternationalIndex}
     */
    @ComProperty(name = "International", dispId = 0x2e)
    Object getInternational(WdInternationalIndex Index);
            
    /**
     * <p>id(0x2f)</p>
     * <p>vtableId(49)</p>
     */
    @ComProperty(name = "Build", dispId = 0x2f)
    String getBuild();
            
    /**
     * <p>id(0x30)</p>
     * <p>vtableId(50)</p>
     */
    @ComProperty(name = "CapsLock", dispId = 0x30)
    Boolean getCapsLock();
            
    /**
     * <p>id(0x31)</p>
     * <p>vtableId(51)</p>
     */
    @ComProperty(name = "NumLock", dispId = 0x31)
    Boolean getNumLock();
            
    /**
     * <p>id(0x34)</p>
     * <p>vtableId(52)</p>
     */
    @ComProperty(name = "UserName", dispId = 0x34)
    String getUserName();
            
    /**
     * <p>id(0x34)</p>
     * <p>vtableId(53)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "UserName", dispId = 0x34)
    void setUserName(String param0);
            
    /**
     * <p>id(0x35)</p>
     * <p>vtableId(54)</p>
     */
    @ComProperty(name = "UserInitials", dispId = 0x35)
    String getUserInitials();
            
    /**
     * <p>id(0x35)</p>
     * <p>vtableId(55)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "UserInitials", dispId = 0x35)
    void setUserInitials(String param0);
            
    /**
     * <p>id(0x36)</p>
     * <p>vtableId(56)</p>
     */
    @ComProperty(name = "UserAddress", dispId = 0x36)
    String getUserAddress();
            
    /**
     * <p>id(0x36)</p>
     * <p>vtableId(57)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "UserAddress", dispId = 0x36)
    void setUserAddress(String param0);
            
    /**
     * <p>id(0x37)</p>
     * <p>vtableId(58)</p>
     */
    @ComProperty(name = "MacroContainer", dispId = 0x37)
    com.sun.jna.platform.win32.COM.util.IDispatch getMacroContainer();
            
    /**
     * <p>id(0x38)</p>
     * <p>vtableId(59)</p>
     */
    @ComProperty(name = "DisplayRecentFiles", dispId = 0x38)
    Boolean getDisplayRecentFiles();
            
    /**
     * <p>id(0x38)</p>
     * <p>vtableId(60)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "DisplayRecentFiles", dispId = 0x38)
    void setDisplayRecentFiles(Boolean param0);
            
    /**
     * <p>id(0x39)</p>
     * <p>vtableId(61)</p>
     */
    @ComProperty(name = "CommandBars", dispId = 0x39)
    eu.doppel_helix.jna.tlb.office2.CommandBars getCommandBars();
            
    /**
     * <p>id(0x3b)</p>
     * <p>vtableId(62)</p>
     * @param Word [in] {@code String}
     * @param LanguageID [in, optional] {@code Object}
     */
    @ComProperty(name = "SynonymInfo", dispId = 0x3b)
    SynonymInfo getSynonymInfo(String Word,
            Object LanguageID);
            
    /**
     * <p>id(0x3d)</p>
     * <p>vtableId(63)</p>
     */
    @ComProperty(name = "VBE", dispId = 0x3d)
    eu.doppel_helix.jna.tlb.vbide5.VBE getVBE();
            
    /**
     * <p>id(0x40)</p>
     * <p>vtableId(64)</p>
     */
    @ComProperty(name = "DefaultSaveFormat", dispId = 0x40)
    String getDefaultSaveFormat();
            
    /**
     * <p>id(0x40)</p>
     * <p>vtableId(65)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "DefaultSaveFormat", dispId = 0x40)
    void setDefaultSaveFormat(String param0);
            
    /**
     * <p>id(0x41)</p>
     * <p>vtableId(66)</p>
     */
    @ComProperty(name = "ListGalleries", dispId = 0x41)
    ListGalleries getListGalleries();
            
    /**
     * <p>id(0x42)</p>
     * <p>vtableId(67)</p>
     */
    @ComProperty(name = "ActivePrinter", dispId = 0x42)
    String getActivePrinter();
            
    /**
     * <p>id(0x42)</p>
     * <p>vtableId(68)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "ActivePrinter", dispId = 0x42)
    void setActivePrinter(String param0);
            
    /**
     * <p>id(0x43)</p>
     * <p>vtableId(69)</p>
     */
    @ComProperty(name = "Templates", dispId = 0x43)
    Templates getTemplates();
            
    /**
     * <p>id(0x44)</p>
     * <p>vtableId(70)</p>
     */
    @ComProperty(name = "CustomizationContext", dispId = 0x44)
    com.sun.jna.platform.win32.COM.util.IDispatch getCustomizationContext();
            
    /**
     * <p>id(0x44)</p>
     * <p>vtableId(71)</p>
     * @param param0 [in] {@code com.sun.jna.platform.win32.COM.util.IDispatch}
     */
    @ComProperty(name = "CustomizationContext", dispId = 0x44)
    void setCustomizationContext(com.sun.jna.platform.win32.COM.util.IDispatch param0);
            
    /**
     * <p>id(0x45)</p>
     * <p>vtableId(72)</p>
     */
    @ComProperty(name = "KeyBindings", dispId = 0x45)
    KeyBindings getKeyBindings();
            
    /**
     * <p>id(0x46)</p>
     * <p>vtableId(73)</p>
     * @param KeyCategory [in] {@code WdKeyCategory}
     * @param Command [in] {@code String}
     * @param CommandParameter [in, optional] {@code Object}
     */
    @ComProperty(name = "KeysBoundTo", dispId = 0x46)
    KeysBoundTo getKeysBoundTo(WdKeyCategory KeyCategory,
            String Command,
            Object CommandParameter);
            
    /**
     * <p>id(0x47)</p>
     * <p>vtableId(74)</p>
     * @param KeyCode [in] {@code Integer}
     * @param KeyCode2 [in, optional] {@code Object}
     */
    @ComProperty(name = "FindKey", dispId = 0x47)
    KeyBinding getFindKey(Integer KeyCode,
            Object KeyCode2);
            
    /**
     * <p>id(0x50)</p>
     * <p>vtableId(75)</p>
     */
    @ComProperty(name = "Caption", dispId = 0x50)
    String getCaption();
            
    /**
     * <p>id(0x50)</p>
     * <p>vtableId(76)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "Caption", dispId = 0x50)
    void setCaption(String param0);
            
    /**
     * <p>id(0x51)</p>
     * <p>vtableId(77)</p>
     */
    @ComProperty(name = "Path", dispId = 0x51)
    String getPath();
            
    /**
     * <p>id(0x52)</p>
     * <p>vtableId(78)</p>
     */
    @ComProperty(name = "DisplayScrollBars", dispId = 0x52)
    Boolean getDisplayScrollBars();
            
    /**
     * <p>id(0x52)</p>
     * <p>vtableId(79)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "DisplayScrollBars", dispId = 0x52)
    void setDisplayScrollBars(Boolean param0);
            
    /**
     * <p>id(0x53)</p>
     * <p>vtableId(80)</p>
     */
    @ComProperty(name = "StartupPath", dispId = 0x53)
    String getStartupPath();
            
    /**
     * <p>id(0x53)</p>
     * <p>vtableId(81)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "StartupPath", dispId = 0x53)
    void setStartupPath(String param0);
            
    /**
     * <p>id(0x55)</p>
     * <p>vtableId(82)</p>
     */
    @ComProperty(name = "BackgroundSavingStatus", dispId = 0x55)
    Integer getBackgroundSavingStatus();
            
    /**
     * <p>id(0x56)</p>
     * <p>vtableId(83)</p>
     */
    @ComProperty(name = "BackgroundPrintingStatus", dispId = 0x56)
    Integer getBackgroundPrintingStatus();
            
    /**
     * <p>id(0x57)</p>
     * <p>vtableId(84)</p>
     */
    @ComProperty(name = "Left", dispId = 0x57)
    Integer getLeft();
            
    /**
     * <p>id(0x57)</p>
     * <p>vtableId(85)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "Left", dispId = 0x57)
    void setLeft(Integer param0);
            
    /**
     * <p>id(0x58)</p>
     * <p>vtableId(86)</p>
     */
    @ComProperty(name = "Top", dispId = 0x58)
    Integer getTop();
            
    /**
     * <p>id(0x58)</p>
     * <p>vtableId(87)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "Top", dispId = 0x58)
    void setTop(Integer param0);
            
    /**
     * <p>id(0x59)</p>
     * <p>vtableId(88)</p>
     */
    @ComProperty(name = "Width", dispId = 0x59)
    Integer getWidth();
            
    /**
     * <p>id(0x59)</p>
     * <p>vtableId(89)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "Width", dispId = 0x59)
    void setWidth(Integer param0);
            
    /**
     * <p>id(0x5a)</p>
     * <p>vtableId(90)</p>
     */
    @ComProperty(name = "Height", dispId = 0x5a)
    Integer getHeight();
            
    /**
     * <p>id(0x5a)</p>
     * <p>vtableId(91)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "Height", dispId = 0x5a)
    void setHeight(Integer param0);
            
    /**
     * <p>id(0x5b)</p>
     * <p>vtableId(92)</p>
     */
    @ComProperty(name = "WindowState", dispId = 0x5b)
    WdWindowState getWindowState();
            
    /**
     * <p>id(0x5b)</p>
     * <p>vtableId(93)</p>
     * @param param0 [in] {@code WdWindowState}
     */
    @ComProperty(name = "WindowState", dispId = 0x5b)
    void setWindowState(WdWindowState param0);
            
    /**
     * <p>id(0x5c)</p>
     * <p>vtableId(94)</p>
     */
    @ComProperty(name = "DisplayAutoCompleteTips", dispId = 0x5c)
    Boolean getDisplayAutoCompleteTips();
            
    /**
     * <p>id(0x5c)</p>
     * <p>vtableId(95)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "DisplayAutoCompleteTips", dispId = 0x5c)
    void setDisplayAutoCompleteTips(Boolean param0);
            
    /**
     * <p>id(0x5d)</p>
     * <p>vtableId(96)</p>
     */
    @ComProperty(name = "Options", dispId = 0x5d)
    Options getOptions();
            
    /**
     * <p>id(0x5e)</p>
     * <p>vtableId(97)</p>
     */
    @ComProperty(name = "DisplayAlerts", dispId = 0x5e)
    WdAlertLevel getDisplayAlerts();
            
    /**
     * <p>id(0x5e)</p>
     * <p>vtableId(98)</p>
     * @param param0 [in] {@code WdAlertLevel}
     */
    @ComProperty(name = "DisplayAlerts", dispId = 0x5e)
    void setDisplayAlerts(WdAlertLevel param0);
            
    /**
     * <p>id(0x5f)</p>
     * <p>vtableId(99)</p>
     */
    @ComProperty(name = "CustomDictionaries", dispId = 0x5f)
    Dictionaries getCustomDictionaries();
            
    /**
     * <p>id(0x60)</p>
     * <p>vtableId(100)</p>
     */
    @ComProperty(name = "PathSeparator", dispId = 0x60)
    String getPathSeparator();
            
    /**
     * <p>id(0x61)</p>
     * <p>vtableId(101)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "StatusBar", dispId = 0x61)
    void setStatusBar(String param0);
            
    /**
     * <p>id(0x62)</p>
     * <p>vtableId(102)</p>
     */
    @ComProperty(name = "MAPIAvailable", dispId = 0x62)
    Boolean getMAPIAvailable();
            
    /**
     * <p>id(0x63)</p>
     * <p>vtableId(103)</p>
     */
    @ComProperty(name = "DisplayScreenTips", dispId = 0x63)
    Boolean getDisplayScreenTips();
            
    /**
     * <p>id(0x63)</p>
     * <p>vtableId(104)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "DisplayScreenTips", dispId = 0x63)
    void setDisplayScreenTips(Boolean param0);
            
    /**
     * <p>id(0x64)</p>
     * <p>vtableId(105)</p>
     */
    @ComProperty(name = "EnableCancelKey", dispId = 0x64)
    WdEnableCancelKey getEnableCancelKey();
            
    /**
     * <p>id(0x64)</p>
     * <p>vtableId(106)</p>
     * @param param0 [in] {@code WdEnableCancelKey}
     */
    @ComProperty(name = "EnableCancelKey", dispId = 0x64)
    void setEnableCancelKey(WdEnableCancelKey param0);
            
    /**
     * <p>id(0x65)</p>
     * <p>vtableId(107)</p>
     */
    @ComProperty(name = "UserControl", dispId = 0x65)
    Boolean getUserControl();
            
    /**
     * <p>id(0x67)</p>
     * <p>vtableId(108)</p>
     */
    @ComProperty(name = "FileSearch", dispId = 0x67)
    eu.doppel_helix.jna.tlb.office2.FileSearch getFileSearch();
            
    /**
     * <p>id(0x68)</p>
     * <p>vtableId(109)</p>
     */
    @ComProperty(name = "MailSystem", dispId = 0x68)
    WdMailSystem getMailSystem();
            
    /**
     * <p>id(0x69)</p>
     * <p>vtableId(110)</p>
     */
    @ComProperty(name = "DefaultTableSeparator", dispId = 0x69)
    String getDefaultTableSeparator();
            
    /**
     * <p>id(0x69)</p>
     * <p>vtableId(111)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "DefaultTableSeparator", dispId = 0x69)
    void setDefaultTableSeparator(String param0);
            
    /**
     * <p>id(0x6a)</p>
     * <p>vtableId(112)</p>
     */
    @ComProperty(name = "ShowVisualBasicEditor", dispId = 0x6a)
    Boolean getShowVisualBasicEditor();
            
    /**
     * <p>id(0x6a)</p>
     * <p>vtableId(113)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "ShowVisualBasicEditor", dispId = 0x6a)
    void setShowVisualBasicEditor(Boolean param0);
            
    /**
     * <p>id(0x6c)</p>
     * <p>vtableId(114)</p>
     */
    @ComProperty(name = "BrowseExtraFileTypes", dispId = 0x6c)
    String getBrowseExtraFileTypes();
            
    /**
     * <p>id(0x6c)</p>
     * <p>vtableId(115)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "BrowseExtraFileTypes", dispId = 0x6c)
    void setBrowseExtraFileTypes(String param0);
            
    /**
     * <p>id(0x6d)</p>
     * <p>vtableId(116)</p>
     * @param Object [in] {@code com.sun.jna.platform.win32.COM.util.IDispatch}
     */
    @ComProperty(name = "IsObjectValid", dispId = 0x6d)
    Boolean getIsObjectValid(com.sun.jna.platform.win32.COM.util.IDispatch Object);
            
    /**
     * <p>id(0x6e)</p>
     * <p>vtableId(117)</p>
     */
    @ComProperty(name = "HangulHanjaDictionaries", dispId = 0x6e)
    HangulHanjaConversionDictionaries getHangulHanjaDictionaries();
            
    /**
     * <p>id(0x15c)</p>
     * <p>vtableId(118)</p>
     */
    @ComProperty(name = "MailMessage", dispId = 0x15c)
    MailMessage getMailMessage();
            
    /**
     * <p>id(0x182)</p>
     * <p>vtableId(119)</p>
     */
    @ComProperty(name = "FocusInMailHeader", dispId = 0x182)
    Boolean getFocusInMailHeader();
            
    /**
     * <p>id(0x451)</p>
     * <p>vtableId(120)</p>
     * @param SaveChanges [in, optional] {@code Object}
     * @param OriginalFormat [in, optional] {@code Object}
     * @param RouteDocument [in, optional] {@code Object}
     */
    @ComMethod(name = "Quit", dispId = 0x451)
    void Quit(Object SaveChanges,
            Object OriginalFormat,
            Object RouteDocument);
            
    /**
     * <p>id(0x12d)</p>
     * <p>vtableId(121)</p>
     */
    @ComMethod(name = "ScreenRefresh", dispId = 0x12d)
    void ScreenRefresh();
            
    /**
     * <p>id(0x12e)</p>
     * <p>vtableId(122)</p>
     * @param Background [in, optional] {@code Object}
     * @param Append [in, optional] {@code Object}
     * @param Range [in, optional] {@code Object}
     * @param OutputFileName [in, optional] {@code Object}
     * @param From [in, optional] {@code Object}
     * @param To [in, optional] {@code Object}
     * @param Item [in, optional] {@code Object}
     * @param Copies [in, optional] {@code Object}
     * @param Pages [in, optional] {@code Object}
     * @param PageType [in, optional] {@code Object}
     * @param PrintToFile [in, optional] {@code Object}
     * @param Collate [in, optional] {@code Object}
     * @param FileName [in, optional] {@code Object}
     * @param ActivePrinterMacGX [in, optional] {@code Object}
     * @param ManualDuplexPrint [in, optional] {@code Object}
     */
    @ComMethod(name = "PrintOutOld", dispId = 0x12e)
    void PrintOutOld(Object Background,
            Object Append,
            Object Range,
            Object OutputFileName,
            Object From,
            Object To,
            Object Item,
            Object Copies,
            Object Pages,
            Object PageType,
            Object PrintToFile,
            Object Collate,
            Object FileName,
            Object ActivePrinterMacGX,
            Object ManualDuplexPrint);
            
    /**
     * <p>id(0x12f)</p>
     * <p>vtableId(123)</p>
     * @param Name [in] {@code String}
     */
    @ComMethod(name = "LookupNameProperties", dispId = 0x12f)
    void LookupNameProperties(String Name);
            
    /**
     * <p>id(0x130)</p>
     * <p>vtableId(124)</p>
     * @param UnavailableFont [in] {@code String}
     * @param SubstituteFont [in] {@code String}
     */
    @ComMethod(name = "SubstituteFont", dispId = 0x130)
    void SubstituteFont(String UnavailableFont,
            String SubstituteFont);
            
    /**
     * <p>id(0x131)</p>
     * <p>vtableId(125)</p>
     * @param Times [in, optional] {@code Object}
     */
    @ComMethod(name = "Repeat", dispId = 0x131)
    Boolean Repeat(Object Times);
            
    /**
     * <p>id(0x136)</p>
     * <p>vtableId(126)</p>
     * @param Channel [in] {@code Integer}
     * @param Command [in] {@code String}
     */
    @ComMethod(name = "DDEExecute", dispId = 0x136)
    void DDEExecute(Integer Channel,
            String Command);
            
    /**
     * <p>id(0x137)</p>
     * <p>vtableId(127)</p>
     * @param App [in] {@code String}
     * @param Topic [in] {@code String}
     */
    @ComMethod(name = "DDEInitiate", dispId = 0x137)
    Integer DDEInitiate(String App,
            String Topic);
            
    /**
     * <p>id(0x138)</p>
     * <p>vtableId(128)</p>
     * @param Channel [in] {@code Integer}
     * @param Item [in] {@code String}
     * @param Data [in] {@code String}
     */
    @ComMethod(name = "DDEPoke", dispId = 0x138)
    void DDEPoke(Integer Channel,
            String Item,
            String Data);
            
    /**
     * <p>id(0x139)</p>
     * <p>vtableId(129)</p>
     * @param Channel [in] {@code Integer}
     * @param Item [in] {@code String}
     */
    @ComMethod(name = "DDERequest", dispId = 0x139)
    String DDERequest(Integer Channel,
            String Item);
            
    /**
     * <p>id(0x13a)</p>
     * <p>vtableId(130)</p>
     * @param Channel [in] {@code Integer}
     */
    @ComMethod(name = "DDETerminate", dispId = 0x13a)
    void DDETerminate(Integer Channel);
            
    /**
     * <p>id(0x13b)</p>
     * <p>vtableId(131)</p>
     */
    @ComMethod(name = "DDETerminateAll", dispId = 0x13b)
    void DDETerminateAll();
            
    /**
     * <p>id(0x13c)</p>
     * <p>vtableId(132)</p>
     * @param Arg1 [in] {@code WdKey}
     * @param Arg2 [in, optional] {@code Object}
     * @param Arg3 [in, optional] {@code Object}
     * @param Arg4 [in, optional] {@code Object}
     */
    @ComMethod(name = "BuildKeyCode", dispId = 0x13c)
    Integer BuildKeyCode(WdKey Arg1,
            Object Arg2,
            Object Arg3,
            Object Arg4);
            
    /**
     * <p>id(0x13d)</p>
     * <p>vtableId(133)</p>
     * @param KeyCode [in] {@code Integer}
     * @param KeyCode2 [in, optional] {@code Object}
     */
    @ComMethod(name = "KeyString", dispId = 0x13d)
    String KeyString(Integer KeyCode,
            Object KeyCode2);
            
    /**
     * <p>id(0x13e)</p>
     * <p>vtableId(134)</p>
     * @param Source [in] {@code String}
     * @param Destination [in] {@code String}
     * @param Name [in] {@code String}
     * @param Object [in] {@code WdOrganizerObject}
     */
    @ComMethod(name = "OrganizerCopy", dispId = 0x13e)
    void OrganizerCopy(String Source,
            String Destination,
            String Name,
            WdOrganizerObject Object);
            
    /**
     * <p>id(0x13f)</p>
     * <p>vtableId(135)</p>
     * @param Source [in] {@code String}
     * @param Name [in] {@code String}
     * @param Object [in] {@code WdOrganizerObject}
     */
    @ComMethod(name = "OrganizerDelete", dispId = 0x13f)
    void OrganizerDelete(String Source,
            String Name,
            WdOrganizerObject Object);
            
    /**
     * <p>id(0x140)</p>
     * <p>vtableId(136)</p>
     * @param Source [in] {@code String}
     * @param Name [in] {@code String}
     * @param NewName [in] {@code String}
     * @param Object [in] {@code WdOrganizerObject}
     */
    @ComMethod(name = "OrganizerRename", dispId = 0x140)
    void OrganizerRename(String Source,
            String Name,
            String NewName,
            WdOrganizerObject Object);
            
    /**
     * <p>id(0x141)</p>
     * <p>vtableId(137)</p>
     * @param TagID [in] {@code String}
     * @param Value [in] {@code String}
     */
    @ComMethod(name = "AddAddress", dispId = 0x141)
    void AddAddress(String TagID,
            String Value);
            
    /**
     * <p>id(0x142)</p>
     * <p>vtableId(138)</p>
     * @param Name [in, optional] {@code Object}
     * @param AddressProperties [in, optional] {@code Object}
     * @param UseAutoText [in, optional] {@code Object}
     * @param DisplaySelectDialog [in, optional] {@code Object}
     * @param SelectDialog [in, optional] {@code Object}
     * @param CheckNamesDialog [in, optional] {@code Object}
     * @param RecentAddressesChoice [in, optional] {@code Object}
     * @param UpdateRecentAddresses [in, optional] {@code Object}
     */
    @ComMethod(name = "GetAddress", dispId = 0x142)
    String GetAddress(Object Name,
            Object AddressProperties,
            Object UseAutoText,
            Object DisplaySelectDialog,
            Object SelectDialog,
            Object CheckNamesDialog,
            Object RecentAddressesChoice,
            Object UpdateRecentAddresses);
            
    /**
     * <p>id(0x143)</p>
     * <p>vtableId(139)</p>
     * @param String [in] {@code String}
     */
    @ComMethod(name = "CheckGrammar", dispId = 0x143)
    Boolean CheckGrammar(String String);
            
    /**
     * <p>id(0x144)</p>
     * <p>vtableId(140)</p>
     * @param Word [in] {@code String}
     * @param CustomDictionary [in, optional] {@code Object}
     * @param IgnoreUppercase [in, optional] {@code Object}
     * @param MainDictionary [in, optional] {@code Object}
     * @param CustomDictionary2 [in, optional] {@code Object}
     * @param CustomDictionary3 [in, optional] {@code Object}
     * @param CustomDictionary4 [in, optional] {@code Object}
     * @param CustomDictionary5 [in, optional] {@code Object}
     * @param CustomDictionary6 [in, optional] {@code Object}
     * @param CustomDictionary7 [in, optional] {@code Object}
     * @param CustomDictionary8 [in, optional] {@code Object}
     * @param CustomDictionary9 [in, optional] {@code Object}
     * @param CustomDictionary10 [in, optional] {@code Object}
     */
    @ComMethod(name = "CheckSpelling", dispId = 0x144)
    Boolean CheckSpelling(String Word,
            Object CustomDictionary,
            Object IgnoreUppercase,
            Object MainDictionary,
            Object CustomDictionary2,
            Object CustomDictionary3,
            Object CustomDictionary4,
            Object CustomDictionary5,
            Object CustomDictionary6,
            Object CustomDictionary7,
            Object CustomDictionary8,
            Object CustomDictionary9,
            Object CustomDictionary10);
            
    /**
     * <p>id(0x146)</p>
     * <p>vtableId(141)</p>
     */
    @ComMethod(name = "ResetIgnoreAll", dispId = 0x146)
    void ResetIgnoreAll();
            
    /**
     * <p>id(0x147)</p>
     * <p>vtableId(142)</p>
     * @param Word [in] {@code String}
     * @param CustomDictionary [in, optional] {@code Object}
     * @param IgnoreUppercase [in, optional] {@code Object}
     * @param MainDictionary [in, optional] {@code Object}
     * @param SuggestionMode [in, optional] {@code Object}
     * @param CustomDictionary2 [in, optional] {@code Object}
     * @param CustomDictionary3 [in, optional] {@code Object}
     * @param CustomDictionary4 [in, optional] {@code Object}
     * @param CustomDictionary5 [in, optional] {@code Object}
     * @param CustomDictionary6 [in, optional] {@code Object}
     * @param CustomDictionary7 [in, optional] {@code Object}
     * @param CustomDictionary8 [in, optional] {@code Object}
     * @param CustomDictionary9 [in, optional] {@code Object}
     * @param CustomDictionary10 [in, optional] {@code Object}
     */
    @ComMethod(name = "GetSpellingSuggestions", dispId = 0x147)
    SpellingSuggestions GetSpellingSuggestions(String Word,
            Object CustomDictionary,
            Object IgnoreUppercase,
            Object MainDictionary,
            Object SuggestionMode,
            Object CustomDictionary2,
            Object CustomDictionary3,
            Object CustomDictionary4,
            Object CustomDictionary5,
            Object CustomDictionary6,
            Object CustomDictionary7,
            Object CustomDictionary8,
            Object CustomDictionary9,
            Object CustomDictionary10);
            
    /**
     * <p>id(0x148)</p>
     * <p>vtableId(143)</p>
     */
    @ComMethod(name = "GoBack", dispId = 0x148)
    void GoBack();
            
    /**
     * <p>id(0x149)</p>
     * <p>vtableId(144)</p>
     * @param HelpType [in] {@code Object}
     */
    @ComMethod(name = "Help", dispId = 0x149)
    void Help(Object HelpType);
            
    /**
     * <p>id(0x14a)</p>
     * <p>vtableId(145)</p>
     */
    @ComMethod(name = "AutomaticChange", dispId = 0x14a)
    void AutomaticChange();
            
    /**
     * <p>id(0x14b)</p>
     * <p>vtableId(146)</p>
     */
    @ComMethod(name = "ShowMe", dispId = 0x14b)
    void ShowMe();
            
    /**
     * <p>id(0x14c)</p>
     * <p>vtableId(147)</p>
     */
    @ComMethod(name = "HelpTool", dispId = 0x14c)
    void HelpTool();
            
    /**
     * <p>id(0x159)</p>
     * <p>vtableId(148)</p>
     */
    @ComMethod(name = "NewWindow", dispId = 0x159)
    Window NewWindow();
            
    /**
     * <p>id(0x15a)</p>
     * <p>vtableId(149)</p>
     * @param ListAllCommands [in] {@code Boolean}
     */
    @ComMethod(name = "ListCommands", dispId = 0x15a)
    void ListCommands(Boolean ListAllCommands);
            
    /**
     * <p>id(0x15d)</p>
     * <p>vtableId(150)</p>
     */
    @ComMethod(name = "ShowClipboard", dispId = 0x15d)
    void ShowClipboard();
            
    /**
     * <p>id(0x15e)</p>
     * <p>vtableId(151)</p>
     * @param When [in] {@code Object}
     * @param Name [in] {@code String}
     * @param Tolerance [in, optional] {@code Object}
     */
    @ComMethod(name = "OnTime", dispId = 0x15e)
    void OnTime(Object When,
            String Name,
            Object Tolerance);
            
    /**
     * <p>id(0x15f)</p>
     * <p>vtableId(152)</p>
     */
    @ComMethod(name = "NextLetter", dispId = 0x15f)
    void NextLetter();
            
    /**
     * <p>id(0x161)</p>
     * <p>vtableId(153)</p>
     * @param Zone [in] {@code String}
     * @param Server [in] {@code String}
     * @param Volume [in] {@code String}
     * @param User [in, optional] {@code Object}
     * @param UserPassword [in, optional] {@code Object}
     * @param VolumePassword [in, optional] {@code Object}
     */
    @ComMethod(name = "MountVolume", dispId = 0x161)
    Short MountVolume(String Zone,
            String Server,
            String Volume,
            Object User,
            Object UserPassword,
            Object VolumePassword);
            
    /**
     * <p>id(0x162)</p>
     * <p>vtableId(154)</p>
     * @param String [in] {@code String}
     */
    @ComMethod(name = "CleanString", dispId = 0x162)
    String CleanString(String String);
            
    /**
     * <p>id(0x164)</p>
     * <p>vtableId(155)</p>
     */
    @ComMethod(name = "SendFax", dispId = 0x164)
    void SendFax();
            
    /**
     * <p>id(0x165)</p>
     * <p>vtableId(156)</p>
     * @param Path [in] {@code String}
     */
    @ComMethod(name = "ChangeFileOpenDirectory", dispId = 0x165)
    void ChangeFileOpenDirectory(String Path);
            
    /**
     * <p>id(0x166)</p>
     * <p>vtableId(157)</p>
     * @param MacroName [in] {@code String}
     */
    @ComMethod(name = "RunOld", dispId = 0x166)
    void RunOld(String MacroName);
            
    /**
     * <p>id(0x167)</p>
     * <p>vtableId(158)</p>
     */
    @ComMethod(name = "GoForward", dispId = 0x167)
    void GoForward();
            
    /**
     * <p>id(0x168)</p>
     * <p>vtableId(159)</p>
     * @param Left [in] {@code Integer}
     * @param Top [in] {@code Integer}
     */
    @ComMethod(name = "Move", dispId = 0x168)
    void Move(Integer Left,
            Integer Top);
            
    /**
     * <p>id(0x169)</p>
     * <p>vtableId(160)</p>
     * @param Width [in] {@code Integer}
     * @param Height [in] {@code Integer}
     */
    @ComMethod(name = "Resize", dispId = 0x169)
    void Resize(Integer Width,
            Integer Height);
            
    /**
     * <p>id(0x172)</p>
     * <p>vtableId(161)</p>
     * @param Inches [in] {@code Float}
     */
    @ComMethod(name = "InchesToPoints", dispId = 0x172)
    Float InchesToPoints(Float Inches);
            
    /**
     * <p>id(0x173)</p>
     * <p>vtableId(162)</p>
     * @param Centimeters [in] {@code Float}
     */
    @ComMethod(name = "CentimetersToPoints", dispId = 0x173)
    Float CentimetersToPoints(Float Centimeters);
            
    /**
     * <p>id(0x174)</p>
     * <p>vtableId(163)</p>
     * @param Millimeters [in] {@code Float}
     */
    @ComMethod(name = "MillimetersToPoints", dispId = 0x174)
    Float MillimetersToPoints(Float Millimeters);
            
    /**
     * <p>id(0x175)</p>
     * <p>vtableId(164)</p>
     * @param Picas [in] {@code Float}
     */
    @ComMethod(name = "PicasToPoints", dispId = 0x175)
    Float PicasToPoints(Float Picas);
            
    /**
     * <p>id(0x176)</p>
     * <p>vtableId(165)</p>
     * @param Lines [in] {@code Float}
     */
    @ComMethod(name = "LinesToPoints", dispId = 0x176)
    Float LinesToPoints(Float Lines);
            
    /**
     * <p>id(0x17c)</p>
     * <p>vtableId(166)</p>
     * @param Points [in] {@code Float}
     */
    @ComMethod(name = "PointsToInches", dispId = 0x17c)
    Float PointsToInches(Float Points);
            
    /**
     * <p>id(0x17d)</p>
     * <p>vtableId(167)</p>
     * @param Points [in] {@code Float}
     */
    @ComMethod(name = "PointsToCentimeters", dispId = 0x17d)
    Float PointsToCentimeters(Float Points);
            
    /**
     * <p>id(0x17e)</p>
     * <p>vtableId(168)</p>
     * @param Points [in] {@code Float}
     */
    @ComMethod(name = "PointsToMillimeters", dispId = 0x17e)
    Float PointsToMillimeters(Float Points);
            
    /**
     * <p>id(0x17f)</p>
     * <p>vtableId(169)</p>
     * @param Points [in] {@code Float}
     */
    @ComMethod(name = "PointsToPicas", dispId = 0x17f)
    Float PointsToPicas(Float Points);
            
    /**
     * <p>id(0x180)</p>
     * <p>vtableId(170)</p>
     * @param Points [in] {@code Float}
     */
    @ComMethod(name = "PointsToLines", dispId = 0x180)
    Float PointsToLines(Float Points);
            
    /**
     * <p>id(0x181)</p>
     * <p>vtableId(171)</p>
     */
    @ComMethod(name = "Activate", dispId = 0x181)
    void Activate();
            
    /**
     * <p>id(0x183)</p>
     * <p>vtableId(172)</p>
     * @param Points [in] {@code Float}
     * @param fVertical [in, optional] {@code Object}
     */
    @ComMethod(name = "PointsToPixels", dispId = 0x183)
    Float PointsToPixels(Float Points,
            Object fVertical);
            
    /**
     * <p>id(0x184)</p>
     * <p>vtableId(173)</p>
     * @param Pixels [in] {@code Float}
     * @param fVertical [in, optional] {@code Object}
     */
    @ComMethod(name = "PixelsToPoints", dispId = 0x184)
    Float PixelsToPoints(Float Pixels,
            Object fVertical);
            
    /**
     * <p>id(0x190)</p>
     * <p>vtableId(174)</p>
     */
    @ComMethod(name = "KeyboardLatin", dispId = 0x190)
    void KeyboardLatin();
            
    /**
     * <p>id(0x191)</p>
     * <p>vtableId(175)</p>
     */
    @ComMethod(name = "KeyboardBidi", dispId = 0x191)
    void KeyboardBidi();
            
    /**
     * <p>id(0x192)</p>
     * <p>vtableId(176)</p>
     */
    @ComMethod(name = "ToggleKeyboard", dispId = 0x192)
    void ToggleKeyboard();
            
    /**
     * <p>id(0x1be)</p>
     * <p>vtableId(177)</p>
     * @param LangId [in, optional] {@code Integer}
     */
    @ComMethod(name = "Keyboard", dispId = 0x1be)
    Integer Keyboard(Integer LangId);
            
    /**
     * <p>id(0x194)</p>
     * <p>vtableId(178)</p>
     */
    @ComMethod(name = "ProductCode", dispId = 0x194)
    String ProductCode();
            
    /**
     * <p>id(0x195)</p>
     * <p>vtableId(179)</p>
     */
    @ComMethod(name = "DefaultWebOptions", dispId = 0x195)
    DefaultWebOptions DefaultWebOptions();
            
    /**
     * <p>id(0x197)</p>
     * <p>vtableId(180)</p>
     * @param Range [in] {@code Object}
     * @param cid [in] {@code Object}
     * @param piCSE [in] {@code Object}
     */
    @ComMethod(name = "DiscussionSupport", dispId = 0x197)
    void DiscussionSupport(Object Range,
            Object cid,
            Object piCSE);
            
    /**
     * <p>id(0x19e)</p>
     * <p>vtableId(181)</p>
     * @param Name [in] {@code String}
     * @param DocumentType [in] {@code WdDocumentMedium}
     */
    @ComMethod(name = "SetDefaultTheme", dispId = 0x19e)
    void SetDefaultTheme(String Name,
            WdDocumentMedium DocumentType);
            
    /**
     * <p>id(0x1a0)</p>
     * <p>vtableId(182)</p>
     * @param DocumentType [in] {@code WdDocumentMedium}
     */
    @ComMethod(name = "GetDefaultTheme", dispId = 0x1a0)
    String GetDefaultTheme(WdDocumentMedium DocumentType);
            
    /**
     * <p>id(0x185)</p>
     * <p>vtableId(183)</p>
     */
    @ComProperty(name = "EmailOptions", dispId = 0x185)
    EmailOptions getEmailOptions();
            
    /**
     * <p>id(0x187)</p>
     * <p>vtableId(184)</p>
     */
    @ComProperty(name = "Language", dispId = 0x187)
    eu.doppel_helix.jna.tlb.office2.MsoLanguageID getLanguage();
            
    /**
     * <p>id(0x6f)</p>
     * <p>vtableId(185)</p>
     */
    @ComProperty(name = "COMAddIns", dispId = 0x6f)
    eu.doppel_helix.jna.tlb.office2.COMAddIns getCOMAddIns();
            
    /**
     * <p>id(0x70)</p>
     * <p>vtableId(186)</p>
     */
    @ComProperty(name = "CheckLanguage", dispId = 0x70)
    Boolean getCheckLanguage();
            
    /**
     * <p>id(0x70)</p>
     * <p>vtableId(187)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "CheckLanguage", dispId = 0x70)
    void setCheckLanguage(Boolean param0);
            
    /**
     * <p>id(0x193)</p>
     * <p>vtableId(188)</p>
     */
    @ComProperty(name = "LanguageSettings", dispId = 0x193)
    eu.doppel_helix.jna.tlb.office2.LanguageSettings getLanguageSettings();
            
    /**
     * <p>id(0x196)</p>
     * <p>vtableId(189)</p>
     */
    @ComProperty(name = "Dummy1", dispId = 0x196)
    Boolean getDummy1();
            
    /**
     * <p>id(0x199)</p>
     * <p>vtableId(190)</p>
     */
    @ComProperty(name = "AnswerWizard", dispId = 0x199)
    eu.doppel_helix.jna.tlb.office2.AnswerWizard getAnswerWizard();
            
    /**
     * <p>id(0x1bf)</p>
     * <p>vtableId(191)</p>
     */
    @ComProperty(name = "FeatureInstall", dispId = 0x1bf)
    eu.doppel_helix.jna.tlb.office2.MsoFeatureInstall getFeatureInstall();
            
    /**
     * <p>id(0x1bf)</p>
     * <p>vtableId(192)</p>
     * @param param0 [in] {@code eu.doppel_helix.jna.tlb.office2.MsoFeatureInstall}
     */
    @ComProperty(name = "FeatureInstall", dispId = 0x1bf)
    void setFeatureInstall(eu.doppel_helix.jna.tlb.office2.MsoFeatureInstall param0);
            
    /**
     * <p>id(0x1bc)</p>
     * <p>vtableId(193)</p>
     * @param Background [in, optional] {@code Object}
     * @param Append [in, optional] {@code Object}
     * @param Range [in, optional] {@code Object}
     * @param OutputFileName [in, optional] {@code Object}
     * @param From [in, optional] {@code Object}
     * @param To [in, optional] {@code Object}
     * @param Item [in, optional] {@code Object}
     * @param Copies [in, optional] {@code Object}
     * @param Pages [in, optional] {@code Object}
     * @param PageType [in, optional] {@code Object}
     * @param PrintToFile [in, optional] {@code Object}
     * @param Collate [in, optional] {@code Object}
     * @param FileName [in, optional] {@code Object}
     * @param ActivePrinterMacGX [in, optional] {@code Object}
     * @param ManualDuplexPrint [in, optional] {@code Object}
     * @param PrintZoomColumn [in, optional] {@code Object}
     * @param PrintZoomRow [in, optional] {@code Object}
     * @param PrintZoomPaperWidth [in, optional] {@code Object}
     * @param PrintZoomPaperHeight [in, optional] {@code Object}
     */
    @ComMethod(name = "PrintOut2000", dispId = 0x1bc)
    void PrintOut2000(Object Background,
            Object Append,
            Object Range,
            Object OutputFileName,
            Object From,
            Object To,
            Object Item,
            Object Copies,
            Object Pages,
            Object PageType,
            Object PrintToFile,
            Object Collate,
            Object FileName,
            Object ActivePrinterMacGX,
            Object ManualDuplexPrint,
            Object PrintZoomColumn,
            Object PrintZoomRow,
            Object PrintZoomPaperWidth,
            Object PrintZoomPaperHeight);
            
    /**
     * <p>id(0x1bd)</p>
     * <p>vtableId(194)</p>
     * @param MacroName [in] {@code String}
     * @param varg1 [in, optional] {@code Object}
     * @param varg2 [in, optional] {@code Object}
     * @param varg3 [in, optional] {@code Object}
     * @param varg4 [in, optional] {@code Object}
     * @param varg5 [in, optional] {@code Object}
     * @param varg6 [in, optional] {@code Object}
     * @param varg7 [in, optional] {@code Object}
     * @param varg8 [in, optional] {@code Object}
     * @param varg9 [in, optional] {@code Object}
     * @param varg10 [in, optional] {@code Object}
     * @param varg11 [in, optional] {@code Object}
     * @param varg12 [in, optional] {@code Object}
     * @param varg13 [in, optional] {@code Object}
     * @param varg14 [in, optional] {@code Object}
     * @param varg15 [in, optional] {@code Object}
     * @param varg16 [in, optional] {@code Object}
     * @param varg17 [in, optional] {@code Object}
     * @param varg18 [in, optional] {@code Object}
     * @param varg19 [in, optional] {@code Object}
     * @param varg20 [in, optional] {@code Object}
     * @param varg21 [in, optional] {@code Object}
     * @param varg22 [in, optional] {@code Object}
     * @param varg23 [in, optional] {@code Object}
     * @param varg24 [in, optional] {@code Object}
     * @param varg25 [in, optional] {@code Object}
     * @param varg26 [in, optional] {@code Object}
     * @param varg27 [in, optional] {@code Object}
     * @param varg28 [in, optional] {@code Object}
     * @param varg29 [in, optional] {@code Object}
     * @param varg30 [in, optional] {@code Object}
     */
    @ComMethod(name = "Run", dispId = 0x1bd)
    Object Run(String MacroName,
            Object varg1,
            Object varg2,
            Object varg3,
            Object varg4,
            Object varg5,
            Object varg6,
            Object varg7,
            Object varg8,
            Object varg9,
            Object varg10,
            Object varg11,
            Object varg12,
            Object varg13,
            Object varg14,
            Object varg15,
            Object varg16,
            Object varg17,
            Object varg18,
            Object varg19,
            Object varg20,
            Object varg21,
            Object varg22,
            Object varg23,
            Object varg24,
            Object varg25,
            Object varg26,
            Object varg27,
            Object varg28,
            Object varg29,
            Object varg30);
            
    /**
     * <p>id(0x1c0)</p>
     * <p>vtableId(195)</p>
     * @param Background [in, optional] {@code Object}
     * @param Append [in, optional] {@code Object}
     * @param Range [in, optional] {@code Object}
     * @param OutputFileName [in, optional] {@code Object}
     * @param From [in, optional] {@code Object}
     * @param To [in, optional] {@code Object}
     * @param Item [in, optional] {@code Object}
     * @param Copies [in, optional] {@code Object}
     * @param Pages [in, optional] {@code Object}
     * @param PageType [in, optional] {@code Object}
     * @param PrintToFile [in, optional] {@code Object}
     * @param Collate [in, optional] {@code Object}
     * @param FileName [in, optional] {@code Object}
     * @param ActivePrinterMacGX [in, optional] {@code Object}
     * @param ManualDuplexPrint [in, optional] {@code Object}
     * @param PrintZoomColumn [in, optional] {@code Object}
     * @param PrintZoomRow [in, optional] {@code Object}
     * @param PrintZoomPaperWidth [in, optional] {@code Object}
     * @param PrintZoomPaperHeight [in, optional] {@code Object}
     */
    @ComMethod(name = "PrintOut", dispId = 0x1c0)
    void PrintOut(Object Background,
            Object Append,
            Object Range,
            Object OutputFileName,
            Object From,
            Object To,
            Object Item,
            Object Copies,
            Object Pages,
            Object PageType,
            Object PrintToFile,
            Object Collate,
            Object FileName,
            Object ActivePrinterMacGX,
            Object ManualDuplexPrint,
            Object PrintZoomColumn,
            Object PrintZoomRow,
            Object PrintZoomPaperWidth,
            Object PrintZoomPaperHeight);
            
    /**
     * <p>id(0x1c1)</p>
     * <p>vtableId(196)</p>
     */
    @ComProperty(name = "AutomationSecurity", dispId = 0x1c1)
    eu.doppel_helix.jna.tlb.office2.MsoAutomationSecurity getAutomationSecurity();
            
    /**
     * <p>id(0x1c1)</p>
     * <p>vtableId(197)</p>
     * @param param0 [in] {@code eu.doppel_helix.jna.tlb.office2.MsoAutomationSecurity}
     */
    @ComProperty(name = "AutomationSecurity", dispId = 0x1c1)
    void setAutomationSecurity(eu.doppel_helix.jna.tlb.office2.MsoAutomationSecurity param0);
            
    /**
     * <p>id(0x1c2)</p>
     * <p>vtableId(198)</p>
     * @param FileDialogType [in] {@code eu.doppel_helix.jna.tlb.office2.MsoFileDialogType}
     */
    @ComProperty(name = "FileDialog", dispId = 0x1c2)
    eu.doppel_helix.jna.tlb.office2.FileDialog getFileDialog(eu.doppel_helix.jna.tlb.office2.MsoFileDialogType FileDialogType);
            
    /**
     * <p>id(0x1c3)</p>
     * <p>vtableId(199)</p>
     */
    @ComProperty(name = "EmailTemplate", dispId = 0x1c3)
    String getEmailTemplate();
            
    /**
     * <p>id(0x1c3)</p>
     * <p>vtableId(200)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "EmailTemplate", dispId = 0x1c3)
    void setEmailTemplate(String param0);
            
    /**
     * <p>id(0x1c4)</p>
     * <p>vtableId(201)</p>
     */
    @ComProperty(name = "ShowWindowsInTaskbar", dispId = 0x1c4)
    Boolean getShowWindowsInTaskbar();
            
    /**
     * <p>id(0x1c4)</p>
     * <p>vtableId(202)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "ShowWindowsInTaskbar", dispId = 0x1c4)
    void setShowWindowsInTaskbar(Boolean param0);
            
    /**
     * <p>id(0x1c6)</p>
     * <p>vtableId(203)</p>
     */
    @ComProperty(name = "NewDocument", dispId = 0x1c6)
    eu.doppel_helix.jna.tlb.office2.NewFile getNewDocument();
            
    /**
     * <p>id(0x1c7)</p>
     * <p>vtableId(204)</p>
     */
    @ComProperty(name = "ShowStartupDialog", dispId = 0x1c7)
    Boolean getShowStartupDialog();
            
    /**
     * <p>id(0x1c7)</p>
     * <p>vtableId(205)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "ShowStartupDialog", dispId = 0x1c7)
    void setShowStartupDialog(Boolean param0);
            
    /**
     * <p>id(0x1c8)</p>
     * <p>vtableId(206)</p>
     */
    @ComProperty(name = "AutoCorrectEmail", dispId = 0x1c8)
    AutoCorrect getAutoCorrectEmail();
            
    /**
     * <p>id(0x1c9)</p>
     * <p>vtableId(207)</p>
     */
    @ComProperty(name = "TaskPanes", dispId = 0x1c9)
    TaskPanes getTaskPanes();
            
    /**
     * <p>id(0x1cb)</p>
     * <p>vtableId(208)</p>
     */
    @ComProperty(name = "DefaultLegalBlackline", dispId = 0x1cb)
    Boolean getDefaultLegalBlackline();
            
    /**
     * <p>id(0x1cb)</p>
     * <p>vtableId(209)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "DefaultLegalBlackline", dispId = 0x1cb)
    void setDefaultLegalBlackline(Boolean param0);
            
    /**
     * <p>id(0x1ca)</p>
     * <p>vtableId(210)</p>
     */
    @ComMethod(name = "Dummy2", dispId = 0x1ca)
    Boolean Dummy2();
            
    /**
     * <p>id(0x1cc)</p>
     * <p>vtableId(211)</p>
     */
    @ComProperty(name = "SmartTagRecognizers", dispId = 0x1cc)
    SmartTagRecognizers getSmartTagRecognizers();
            
    /**
     * <p>id(0x1cd)</p>
     * <p>vtableId(212)</p>
     */
    @ComProperty(name = "SmartTagTypes", dispId = 0x1cd)
    SmartTagTypes getSmartTagTypes();
            
    /**
     * <p>id(0x1cf)</p>
     * <p>vtableId(213)</p>
     */
    @ComProperty(name = "XMLNamespaces", dispId = 0x1cf)
    XMLNamespaces getXMLNamespaces();
            
    /**
     * <p>id(0x1d0)</p>
     * <p>vtableId(214)</p>
     */
    @ComMethod(name = "PutFocusInMailHeader", dispId = 0x1d0)
    void PutFocusInMailHeader();
            
    /**
     * <p>id(0x1d1)</p>
     * <p>vtableId(215)</p>
     */
    @ComProperty(name = "ArbitraryXMLSupportAvailable", dispId = 0x1d1)
    Boolean getArbitraryXMLSupportAvailable();
            
    /**
     * <p>id(0x1d2)</p>
     * <p>vtableId(216)</p>
     */
    @ComProperty(name = "BuildFull", dispId = 0x1d2)
    String getBuildFull();
            
    /**
     * <p>id(0x1d3)</p>
     * <p>vtableId(217)</p>
     */
    @ComProperty(name = "BuildFeatureCrew", dispId = 0x1d3)
    String getBuildFeatureCrew();
            
    /**
     * <p>id(0x1d5)</p>
     * <p>vtableId(218)</p>
     * @param FileName [in] {@code String}
     */
    @ComMethod(name = "LoadMasterList", dispId = 0x1d5)
    void LoadMasterList(String FileName);
            
    /**
     * <p>id(0x1d6)</p>
     * <p>vtableId(219)</p>
     * @param OriginalDocument [in] {@code Document}
     * @param RevisedDocument [in] {@code Document}
     * @param Destination [in, optional] {@code WdCompareDestination}
     * @param Granularity [in, optional] {@code WdGranularity}
     * @param CompareFormatting [in, optional] {@code Boolean}
     * @param CompareCaseChanges [in, optional] {@code Boolean}
     * @param CompareWhitespace [in, optional] {@code Boolean}
     * @param CompareTables [in, optional] {@code Boolean}
     * @param CompareHeaders [in, optional] {@code Boolean}
     * @param CompareFootnotes [in, optional] {@code Boolean}
     * @param CompareTextboxes [in, optional] {@code Boolean}
     * @param CompareFields [in, optional] {@code Boolean}
     * @param CompareComments [in, optional] {@code Boolean}
     * @param CompareMoves [in, optional] {@code Boolean}
     * @param RevisedAuthor [in, optional] {@code String}
     * @param IgnoreAllComparisonWarnings [in, optional] {@code Boolean}
     */
    @ComMethod(name = "CompareDocuments", dispId = 0x1d6)
    Document CompareDocuments(Document OriginalDocument,
            Document RevisedDocument,
            WdCompareDestination Destination,
            WdGranularity Granularity,
            Boolean CompareFormatting,
            Boolean CompareCaseChanges,
            Boolean CompareWhitespace,
            Boolean CompareTables,
            Boolean CompareHeaders,
            Boolean CompareFootnotes,
            Boolean CompareTextboxes,
            Boolean CompareFields,
            Boolean CompareComments,
            Boolean CompareMoves,
            String RevisedAuthor,
            Boolean IgnoreAllComparisonWarnings);
            
    /**
     * <p>id(0x1d7)</p>
     * <p>vtableId(220)</p>
     * @param OriginalDocument [in] {@code Document}
     * @param RevisedDocument [in] {@code Document}
     * @param Destination [in, optional] {@code WdCompareDestination}
     * @param Granularity [in, optional] {@code WdGranularity}
     * @param CompareFormatting [in, optional] {@code Boolean}
     * @param CompareCaseChanges [in, optional] {@code Boolean}
     * @param CompareWhitespace [in, optional] {@code Boolean}
     * @param CompareTables [in, optional] {@code Boolean}
     * @param CompareHeaders [in, optional] {@code Boolean}
     * @param CompareFootnotes [in, optional] {@code Boolean}
     * @param CompareTextboxes [in, optional] {@code Boolean}
     * @param CompareFields [in, optional] {@code Boolean}
     * @param CompareComments [in, optional] {@code Boolean}
     * @param CompareMoves [in, optional] {@code Boolean}
     * @param OriginalAuthor [in, optional] {@code String}
     * @param RevisedAuthor [in, optional] {@code String}
     * @param FormatFrom [in, optional] {@code WdMergeFormatFrom}
     */
    @ComMethod(name = "MergeDocuments", dispId = 0x1d7)
    Document MergeDocuments(Document OriginalDocument,
            Document RevisedDocument,
            WdCompareDestination Destination,
            WdGranularity Granularity,
            Boolean CompareFormatting,
            Boolean CompareCaseChanges,
            Boolean CompareWhitespace,
            Boolean CompareTables,
            Boolean CompareHeaders,
            Boolean CompareFootnotes,
            Boolean CompareTextboxes,
            Boolean CompareFields,
            Boolean CompareComments,
            Boolean CompareMoves,
            String OriginalAuthor,
            String RevisedAuthor,
            WdMergeFormatFrom FormatFrom);
            
    /**
     * <p>id(0x1d8)</p>
     * <p>vtableId(221)</p>
     */
    @ComProperty(name = "Bibliography", dispId = 0x1d8)
    Bibliography getBibliography();
            
    /**
     * <p>id(0x1d9)</p>
     * <p>vtableId(222)</p>
     */
    @ComProperty(name = "ShowStylePreviews", dispId = 0x1d9)
    Boolean getShowStylePreviews();
            
    /**
     * <p>id(0x1d9)</p>
     * <p>vtableId(223)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "ShowStylePreviews", dispId = 0x1d9)
    void setShowStylePreviews(Boolean param0);
            
    /**
     * <p>id(0x1da)</p>
     * <p>vtableId(224)</p>
     */
    @ComProperty(name = "RestrictLinkedStyles", dispId = 0x1da)
    Boolean getRestrictLinkedStyles();
            
    /**
     * <p>id(0x1da)</p>
     * <p>vtableId(225)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "RestrictLinkedStyles", dispId = 0x1da)
    void setRestrictLinkedStyles(Boolean param0);
            
    /**
     * <p>id(0x1db)</p>
     * <p>vtableId(226)</p>
     */
    @ComProperty(name = "OMathAutoCorrect", dispId = 0x1db)
    OMathAutoCorrect getOMathAutoCorrect();
            
    /**
     * <p>id(0x1dc)</p>
     * <p>vtableId(227)</p>
     */
    @ComProperty(name = "DisplayDocumentInformationPanel", dispId = 0x1dc)
    Boolean getDisplayDocumentInformationPanel();
            
    /**
     * <p>id(0x1dc)</p>
     * <p>vtableId(228)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "DisplayDocumentInformationPanel", dispId = 0x1dc)
    void setDisplayDocumentInformationPanel(Boolean param0);
            
    /**
     * <p>id(0x1dd)</p>
     * <p>vtableId(229)</p>
     */
    @ComProperty(name = "Assistance", dispId = 0x1dd)
    eu.doppel_helix.jna.tlb.office2.IAssistance getAssistance();
            
    /**
     * <p>id(0x1de)</p>
     * <p>vtableId(230)</p>
     */
    @ComProperty(name = "OpenAttachmentsInFullScreen", dispId = 0x1de)
    Boolean getOpenAttachmentsInFullScreen();
            
    /**
     * <p>id(0x1de)</p>
     * <p>vtableId(231)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "OpenAttachmentsInFullScreen", dispId = 0x1de)
    void setOpenAttachmentsInFullScreen(Boolean param0);
            
    /**
     * <p>id(0x1df)</p>
     * <p>vtableId(232)</p>
     */
    @ComProperty(name = "ActiveEncryptionSession", dispId = 0x1df)
    Integer getActiveEncryptionSession();
            
    /**
     * <p>id(0x1e0)</p>
     * <p>vtableId(233)</p>
     */
    @ComProperty(name = "DontResetInsertionPointProperties", dispId = 0x1e0)
    Boolean getDontResetInsertionPointProperties();
            
    /**
     * <p>id(0x1e0)</p>
     * <p>vtableId(234)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "DontResetInsertionPointProperties", dispId = 0x1e0)
    void setDontResetInsertionPointProperties(Boolean param0);
            
    /**
     * <p>id(0x1e1)</p>
     * <p>vtableId(235)</p>
     */
    @ComProperty(name = "SmartArtLayouts", dispId = 0x1e1)
    eu.doppel_helix.jna.tlb.office2.SmartArtLayouts getSmartArtLayouts();
            
    /**
     * <p>id(0x1e2)</p>
     * <p>vtableId(236)</p>
     */
    @ComProperty(name = "SmartArtQuickStyles", dispId = 0x1e2)
    eu.doppel_helix.jna.tlb.office2.SmartArtQuickStyles getSmartArtQuickStyles();
            
    /**
     * <p>id(0x1e3)</p>
     * <p>vtableId(237)</p>
     */
    @ComProperty(name = "SmartArtColors", dispId = 0x1e3)
    eu.doppel_helix.jna.tlb.office2.SmartArtColors getSmartArtColors();
            
    /**
     * <p>id(0x1e4)</p>
     * <p>vtableId(238)</p>
     * @param LocalDocument [in] {@code Document}
     * @param ServerDocument [in] {@code Document}
     * @param BaseDocument [in] {@code Document}
     * @param FavorSource [in] {@code Boolean}
     */
    @ComMethod(name = "ThreeWayMerge", dispId = 0x1e4)
    void ThreeWayMerge(Document LocalDocument,
            Document ServerDocument,
            Document BaseDocument,
            Boolean FavorSource);
            
    /**
     * <p>id(0x1e5)</p>
     * <p>vtableId(239)</p>
     */
    @ComMethod(name = "Dummy4", dispId = 0x1e5)
    void Dummy4();
            
    /**
     * <p>id(0x1e6)</p>
     * <p>vtableId(240)</p>
     */
    @ComProperty(name = "UndoRecord", dispId = 0x1e6)
    UndoRecord getUndoRecord();
            
    /**
     * <p>id(0x1e9)</p>
     * <p>vtableId(241)</p>
     */
    @ComProperty(name = "PickerDialog", dispId = 0x1e9)
    eu.doppel_helix.jna.tlb.office2.PickerDialog getPickerDialog();
            
    /**
     * <p>id(0x1ea)</p>
     * <p>vtableId(242)</p>
     */
    @ComProperty(name = "ProtectedViewWindows", dispId = 0x1ea)
    ProtectedViewWindows getProtectedViewWindows();
            
    /**
     * <p>id(0x1eb)</p>
     * <p>vtableId(243)</p>
     */
    @ComProperty(name = "ActiveProtectedViewWindow", dispId = 0x1eb)
    ProtectedViewWindow getActiveProtectedViewWindow();
            
    /**
     * <p>id(0x1ec)</p>
     * <p>vtableId(244)</p>
     */
    @ComProperty(name = "IsSandboxed", dispId = 0x1ec)
    Boolean getIsSandboxed();
            
    /**
     * <p>id(0x1ed)</p>
     * <p>vtableId(245)</p>
     */
    @ComProperty(name = "FileValidation", dispId = 0x1ed)
    eu.doppel_helix.jna.tlb.office2.MsoFileValidationMode getFileValidation();
            
    /**
     * <p>id(0x1ed)</p>
     * <p>vtableId(246)</p>
     * @param param0 [in] {@code eu.doppel_helix.jna.tlb.office2.MsoFileValidationMode}
     */
    @ComProperty(name = "FileValidation", dispId = 0x1ed)
    void setFileValidation(eu.doppel_helix.jna.tlb.office2.MsoFileValidationMode param0);
            
    /**
     * <p>id(0x1ee)</p>
     * <p>vtableId(247)</p>
     */
    @ComProperty(name = "ChartDataPointTrack", dispId = 0x1ee)
    Boolean getChartDataPointTrack();
            
    /**
     * <p>id(0x1ee)</p>
     * <p>vtableId(248)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "ChartDataPointTrack", dispId = 0x1ee)
    void setChartDataPointTrack(Boolean param0);
            
    /**
     * <p>id(0x1ef)</p>
     * <p>vtableId(249)</p>
     */
    @ComProperty(name = "ShowAnimation", dispId = 0x1ef)
    Boolean getShowAnimation();
            
    /**
     * <p>id(0x1ef)</p>
     * <p>vtableId(250)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "ShowAnimation", dispId = 0x1ef)
    void setShowAnimation(Boolean param0);
            
    
}