
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
     */
    @ComProperty(name = "Application", dispId = 0x3e8)
    Application getApplication();
            
    /**
     * <p>id(0x3e9)</p>
     */
    @ComProperty(name = "Creator", dispId = 0x3e9)
    Integer getCreator();
            
    /**
     * <p>id(0x3ea)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x3ea)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * <p>id(0x0)</p>
     */
    @ComProperty(name = "Name", dispId = 0x0)
    String getName();
            
    /**
     * <p>id(0x6)</p>
     */
    @ComProperty(name = "Documents", dispId = 0x6)
    Documents getDocuments();
            
    /**
     * <p>id(0x2)</p>
     */
    @ComProperty(name = "Windows", dispId = 0x2)
    Windows getWindows();
            
    /**
     * <p>id(0x3)</p>
     */
    @ComProperty(name = "ActiveDocument", dispId = 0x3)
    Document getActiveDocument();
            
    /**
     * <p>id(0x4)</p>
     */
    @ComProperty(name = "ActiveWindow", dispId = 0x4)
    Window getActiveWindow();
            
    /**
     * <p>id(0x5)</p>
     */
    @ComProperty(name = "Selection", dispId = 0x5)
    Selection getSelection();
            
    /**
     * <p>id(0x1)</p>
     */
    @ComProperty(name = "WordBasic", dispId = 0x1)
    com.sun.jna.platform.win32.COM.util.IDispatch getWordBasic();
            
    /**
     * <p>id(0x7)</p>
     */
    @ComProperty(name = "RecentFiles", dispId = 0x7)
    RecentFiles getRecentFiles();
            
    /**
     * <p>id(0x8)</p>
     */
    @ComProperty(name = "NormalTemplate", dispId = 0x8)
    Template getNormalTemplate();
            
    /**
     * <p>id(0x9)</p>
     */
    @ComProperty(name = "System", dispId = 0x9)
    System getSystem();
            
    /**
     * <p>id(0xa)</p>
     */
    @ComProperty(name = "AutoCorrect", dispId = 0xa)
    AutoCorrect getAutoCorrect();
            
    /**
     * <p>id(0xb)</p>
     */
    @ComProperty(name = "FontNames", dispId = 0xb)
    FontNames getFontNames();
            
    /**
     * <p>id(0xc)</p>
     */
    @ComProperty(name = "LandscapeFontNames", dispId = 0xc)
    FontNames getLandscapeFontNames();
            
    /**
     * <p>id(0xd)</p>
     */
    @ComProperty(name = "PortraitFontNames", dispId = 0xd)
    FontNames getPortraitFontNames();
            
    /**
     * <p>id(0xe)</p>
     */
    @ComProperty(name = "Languages", dispId = 0xe)
    Languages getLanguages();
            
    /**
     * <p>id(0xf)</p>
     */
    @ComProperty(name = "Assistant", dispId = 0xf)
    eu.doppel_helix.jna.tlb.office2.Assistant getAssistant();
            
    /**
     * <p>id(0x10)</p>
     */
    @ComProperty(name = "Browser", dispId = 0x10)
    Browser getBrowser();
            
    /**
     * <p>id(0x11)</p>
     */
    @ComProperty(name = "FileConverters", dispId = 0x11)
    FileConverters getFileConverters();
            
    /**
     * <p>id(0x12)</p>
     */
    @ComProperty(name = "MailingLabel", dispId = 0x12)
    MailingLabel getMailingLabel();
            
    /**
     * <p>id(0x13)</p>
     */
    @ComProperty(name = "Dialogs", dispId = 0x13)
    Dialogs getDialogs();
            
    /**
     * <p>id(0x14)</p>
     */
    @ComProperty(name = "CaptionLabels", dispId = 0x14)
    CaptionLabels getCaptionLabels();
            
    /**
     * <p>id(0x15)</p>
     */
    @ComProperty(name = "AutoCaptions", dispId = 0x15)
    AutoCaptions getAutoCaptions();
            
    /**
     * <p>id(0x16)</p>
     */
    @ComProperty(name = "AddIns", dispId = 0x16)
    AddIns getAddIns();
            
    /**
     * <p>id(0x17)</p>
     */
    @ComProperty(name = "Visible", dispId = 0x17)
    Boolean getVisible();
            
    /**
     * <p>id(0x17)</p>
     */
    @ComProperty(name = "Visible", dispId = 0x17)
    void setVisible(Boolean param0);
            
    /**
     * <p>id(0x18)</p>
     */
    @ComProperty(name = "Version", dispId = 0x18)
    String getVersion();
            
    /**
     * <p>id(0x1a)</p>
     */
    @ComProperty(name = "ScreenUpdating", dispId = 0x1a)
    Boolean getScreenUpdating();
            
    /**
     * <p>id(0x1a)</p>
     */
    @ComProperty(name = "ScreenUpdating", dispId = 0x1a)
    void setScreenUpdating(Boolean param0);
            
    /**
     * <p>id(0x1b)</p>
     */
    @ComProperty(name = "PrintPreview", dispId = 0x1b)
    Boolean getPrintPreview();
            
    /**
     * <p>id(0x1b)</p>
     */
    @ComProperty(name = "PrintPreview", dispId = 0x1b)
    void setPrintPreview(Boolean param0);
            
    /**
     * <p>id(0x1c)</p>
     */
    @ComProperty(name = "Tasks", dispId = 0x1c)
    Tasks getTasks();
            
    /**
     * <p>id(0x1d)</p>
     */
    @ComProperty(name = "DisplayStatusBar", dispId = 0x1d)
    Boolean getDisplayStatusBar();
            
    /**
     * <p>id(0x1d)</p>
     */
    @ComProperty(name = "DisplayStatusBar", dispId = 0x1d)
    void setDisplayStatusBar(Boolean param0);
            
    /**
     * <p>id(0x1e)</p>
     */
    @ComProperty(name = "SpecialMode", dispId = 0x1e)
    Boolean getSpecialMode();
            
    /**
     * <p>id(0x21)</p>
     */
    @ComProperty(name = "UsableWidth", dispId = 0x21)
    Integer getUsableWidth();
            
    /**
     * <p>id(0x22)</p>
     */
    @ComProperty(name = "UsableHeight", dispId = 0x22)
    Integer getUsableHeight();
            
    /**
     * <p>id(0x24)</p>
     */
    @ComProperty(name = "MathCoprocessorAvailable", dispId = 0x24)
    Boolean getMathCoprocessorAvailable();
            
    /**
     * <p>id(0x25)</p>
     */
    @ComProperty(name = "MouseAvailable", dispId = 0x25)
    Boolean getMouseAvailable();
            
    /**
     * <p>id(0x2e)</p>
     */
    @ComProperty(name = "International", dispId = 0x2e)
    Object getInternational(WdInternationalIndex Index);
            
    /**
     * <p>id(0x2f)</p>
     */
    @ComProperty(name = "Build", dispId = 0x2f)
    String getBuild();
            
    /**
     * <p>id(0x30)</p>
     */
    @ComProperty(name = "CapsLock", dispId = 0x30)
    Boolean getCapsLock();
            
    /**
     * <p>id(0x31)</p>
     */
    @ComProperty(name = "NumLock", dispId = 0x31)
    Boolean getNumLock();
            
    /**
     * <p>id(0x34)</p>
     */
    @ComProperty(name = "UserName", dispId = 0x34)
    String getUserName();
            
    /**
     * <p>id(0x34)</p>
     */
    @ComProperty(name = "UserName", dispId = 0x34)
    void setUserName(String param0);
            
    /**
     * <p>id(0x35)</p>
     */
    @ComProperty(name = "UserInitials", dispId = 0x35)
    String getUserInitials();
            
    /**
     * <p>id(0x35)</p>
     */
    @ComProperty(name = "UserInitials", dispId = 0x35)
    void setUserInitials(String param0);
            
    /**
     * <p>id(0x36)</p>
     */
    @ComProperty(name = "UserAddress", dispId = 0x36)
    String getUserAddress();
            
    /**
     * <p>id(0x36)</p>
     */
    @ComProperty(name = "UserAddress", dispId = 0x36)
    void setUserAddress(String param0);
            
    /**
     * <p>id(0x37)</p>
     */
    @ComProperty(name = "MacroContainer", dispId = 0x37)
    com.sun.jna.platform.win32.COM.util.IDispatch getMacroContainer();
            
    /**
     * <p>id(0x38)</p>
     */
    @ComProperty(name = "DisplayRecentFiles", dispId = 0x38)
    Boolean getDisplayRecentFiles();
            
    /**
     * <p>id(0x38)</p>
     */
    @ComProperty(name = "DisplayRecentFiles", dispId = 0x38)
    void setDisplayRecentFiles(Boolean param0);
            
    /**
     * <p>id(0x39)</p>
     */
    @ComProperty(name = "CommandBars", dispId = 0x39)
    eu.doppel_helix.jna.tlb.office2.CommandBars getCommandBars();
            
    /**
     * <p>id(0x3b)</p>
     */
    @ComProperty(name = "SynonymInfo", dispId = 0x3b)
    SynonymInfo getSynonymInfo(String Word,
            Object LanguageID);
            
    /**
     * <p>id(0x3d)</p>
     */
    @ComProperty(name = "VBE", dispId = 0x3d)
    eu.doppel_helix.jna.tlb.vbide5.VBE getVBE();
            
    /**
     * <p>id(0x40)</p>
     */
    @ComProperty(name = "DefaultSaveFormat", dispId = 0x40)
    String getDefaultSaveFormat();
            
    /**
     * <p>id(0x40)</p>
     */
    @ComProperty(name = "DefaultSaveFormat", dispId = 0x40)
    void setDefaultSaveFormat(String param0);
            
    /**
     * <p>id(0x41)</p>
     */
    @ComProperty(name = "ListGalleries", dispId = 0x41)
    ListGalleries getListGalleries();
            
    /**
     * <p>id(0x42)</p>
     */
    @ComProperty(name = "ActivePrinter", dispId = 0x42)
    String getActivePrinter();
            
    /**
     * <p>id(0x42)</p>
     */
    @ComProperty(name = "ActivePrinter", dispId = 0x42)
    void setActivePrinter(String param0);
            
    /**
     * <p>id(0x43)</p>
     */
    @ComProperty(name = "Templates", dispId = 0x43)
    Templates getTemplates();
            
    /**
     * <p>id(0x44)</p>
     */
    @ComProperty(name = "CustomizationContext", dispId = 0x44)
    com.sun.jna.platform.win32.COM.util.IDispatch getCustomizationContext();
            
    /**
     * <p>id(0x44)</p>
     */
    @ComProperty(name = "CustomizationContext", dispId = 0x44)
    void setCustomizationContext(com.sun.jna.platform.win32.COM.util.IDispatch param0);
            
    /**
     * <p>id(0x45)</p>
     */
    @ComProperty(name = "KeyBindings", dispId = 0x45)
    KeyBindings getKeyBindings();
            
    /**
     * <p>id(0x46)</p>
     */
    @ComProperty(name = "KeysBoundTo", dispId = 0x46)
    KeysBoundTo getKeysBoundTo(WdKeyCategory KeyCategory,
            String Command,
            Object CommandParameter);
            
    /**
     * <p>id(0x47)</p>
     */
    @ComProperty(name = "FindKey", dispId = 0x47)
    KeyBinding getFindKey(Integer KeyCode,
            Object KeyCode2);
            
    /**
     * <p>id(0x50)</p>
     */
    @ComProperty(name = "Caption", dispId = 0x50)
    String getCaption();
            
    /**
     * <p>id(0x50)</p>
     */
    @ComProperty(name = "Caption", dispId = 0x50)
    void setCaption(String param0);
            
    /**
     * <p>id(0x51)</p>
     */
    @ComProperty(name = "Path", dispId = 0x51)
    String getPath();
            
    /**
     * <p>id(0x52)</p>
     */
    @ComProperty(name = "DisplayScrollBars", dispId = 0x52)
    Boolean getDisplayScrollBars();
            
    /**
     * <p>id(0x52)</p>
     */
    @ComProperty(name = "DisplayScrollBars", dispId = 0x52)
    void setDisplayScrollBars(Boolean param0);
            
    /**
     * <p>id(0x53)</p>
     */
    @ComProperty(name = "StartupPath", dispId = 0x53)
    String getStartupPath();
            
    /**
     * <p>id(0x53)</p>
     */
    @ComProperty(name = "StartupPath", dispId = 0x53)
    void setStartupPath(String param0);
            
    /**
     * <p>id(0x55)</p>
     */
    @ComProperty(name = "BackgroundSavingStatus", dispId = 0x55)
    Integer getBackgroundSavingStatus();
            
    /**
     * <p>id(0x56)</p>
     */
    @ComProperty(name = "BackgroundPrintingStatus", dispId = 0x56)
    Integer getBackgroundPrintingStatus();
            
    /**
     * <p>id(0x57)</p>
     */
    @ComProperty(name = "Left", dispId = 0x57)
    Integer getLeft();
            
    /**
     * <p>id(0x57)</p>
     */
    @ComProperty(name = "Left", dispId = 0x57)
    void setLeft(Integer param0);
            
    /**
     * <p>id(0x58)</p>
     */
    @ComProperty(name = "Top", dispId = 0x58)
    Integer getTop();
            
    /**
     * <p>id(0x58)</p>
     */
    @ComProperty(name = "Top", dispId = 0x58)
    void setTop(Integer param0);
            
    /**
     * <p>id(0x59)</p>
     */
    @ComProperty(name = "Width", dispId = 0x59)
    Integer getWidth();
            
    /**
     * <p>id(0x59)</p>
     */
    @ComProperty(name = "Width", dispId = 0x59)
    void setWidth(Integer param0);
            
    /**
     * <p>id(0x5a)</p>
     */
    @ComProperty(name = "Height", dispId = 0x5a)
    Integer getHeight();
            
    /**
     * <p>id(0x5a)</p>
     */
    @ComProperty(name = "Height", dispId = 0x5a)
    void setHeight(Integer param0);
            
    /**
     * <p>id(0x5b)</p>
     */
    @ComProperty(name = "WindowState", dispId = 0x5b)
    WdWindowState getWindowState();
            
    /**
     * <p>id(0x5b)</p>
     */
    @ComProperty(name = "WindowState", dispId = 0x5b)
    void setWindowState(WdWindowState param0);
            
    /**
     * <p>id(0x5c)</p>
     */
    @ComProperty(name = "DisplayAutoCompleteTips", dispId = 0x5c)
    Boolean getDisplayAutoCompleteTips();
            
    /**
     * <p>id(0x5c)</p>
     */
    @ComProperty(name = "DisplayAutoCompleteTips", dispId = 0x5c)
    void setDisplayAutoCompleteTips(Boolean param0);
            
    /**
     * <p>id(0x5d)</p>
     */
    @ComProperty(name = "Options", dispId = 0x5d)
    Options getOptions();
            
    /**
     * <p>id(0x5e)</p>
     */
    @ComProperty(name = "DisplayAlerts", dispId = 0x5e)
    WdAlertLevel getDisplayAlerts();
            
    /**
     * <p>id(0x5e)</p>
     */
    @ComProperty(name = "DisplayAlerts", dispId = 0x5e)
    void setDisplayAlerts(WdAlertLevel param0);
            
    /**
     * <p>id(0x5f)</p>
     */
    @ComProperty(name = "CustomDictionaries", dispId = 0x5f)
    Dictionaries getCustomDictionaries();
            
    /**
     * <p>id(0x60)</p>
     */
    @ComProperty(name = "PathSeparator", dispId = 0x60)
    String getPathSeparator();
            
    /**
     * <p>id(0x61)</p>
     */
    @ComProperty(name = "StatusBar", dispId = 0x61)
    void setStatusBar(String param0);
            
    /**
     * <p>id(0x62)</p>
     */
    @ComProperty(name = "MAPIAvailable", dispId = 0x62)
    Boolean getMAPIAvailable();
            
    /**
     * <p>id(0x63)</p>
     */
    @ComProperty(name = "DisplayScreenTips", dispId = 0x63)
    Boolean getDisplayScreenTips();
            
    /**
     * <p>id(0x63)</p>
     */
    @ComProperty(name = "DisplayScreenTips", dispId = 0x63)
    void setDisplayScreenTips(Boolean param0);
            
    /**
     * <p>id(0x64)</p>
     */
    @ComProperty(name = "EnableCancelKey", dispId = 0x64)
    WdEnableCancelKey getEnableCancelKey();
            
    /**
     * <p>id(0x64)</p>
     */
    @ComProperty(name = "EnableCancelKey", dispId = 0x64)
    void setEnableCancelKey(WdEnableCancelKey param0);
            
    /**
     * <p>id(0x65)</p>
     */
    @ComProperty(name = "UserControl", dispId = 0x65)
    Boolean getUserControl();
            
    /**
     * <p>id(0x67)</p>
     */
    @ComProperty(name = "FileSearch", dispId = 0x67)
    eu.doppel_helix.jna.tlb.office2.FileSearch getFileSearch();
            
    /**
     * <p>id(0x68)</p>
     */
    @ComProperty(name = "MailSystem", dispId = 0x68)
    WdMailSystem getMailSystem();
            
    /**
     * <p>id(0x69)</p>
     */
    @ComProperty(name = "DefaultTableSeparator", dispId = 0x69)
    String getDefaultTableSeparator();
            
    /**
     * <p>id(0x69)</p>
     */
    @ComProperty(name = "DefaultTableSeparator", dispId = 0x69)
    void setDefaultTableSeparator(String param0);
            
    /**
     * <p>id(0x6a)</p>
     */
    @ComProperty(name = "ShowVisualBasicEditor", dispId = 0x6a)
    Boolean getShowVisualBasicEditor();
            
    /**
     * <p>id(0x6a)</p>
     */
    @ComProperty(name = "ShowVisualBasicEditor", dispId = 0x6a)
    void setShowVisualBasicEditor(Boolean param0);
            
    /**
     * <p>id(0x6c)</p>
     */
    @ComProperty(name = "BrowseExtraFileTypes", dispId = 0x6c)
    String getBrowseExtraFileTypes();
            
    /**
     * <p>id(0x6c)</p>
     */
    @ComProperty(name = "BrowseExtraFileTypes", dispId = 0x6c)
    void setBrowseExtraFileTypes(String param0);
            
    /**
     * <p>id(0x6d)</p>
     */
    @ComProperty(name = "IsObjectValid", dispId = 0x6d)
    Boolean getIsObjectValid(com.sun.jna.platform.win32.COM.util.IDispatch Object);
            
    /**
     * <p>id(0x6e)</p>
     */
    @ComProperty(name = "HangulHanjaDictionaries", dispId = 0x6e)
    HangulHanjaConversionDictionaries getHangulHanjaDictionaries();
            
    /**
     * <p>id(0x15c)</p>
     */
    @ComProperty(name = "MailMessage", dispId = 0x15c)
    MailMessage getMailMessage();
            
    /**
     * <p>id(0x182)</p>
     */
    @ComProperty(name = "FocusInMailHeader", dispId = 0x182)
    Boolean getFocusInMailHeader();
            
    /**
     * <p>id(0x451)</p>
     */
    @ComMethod(name = "Quit", dispId = 0x451)
    void Quit(Object SaveChanges,
            Object OriginalFormat,
            Object RouteDocument);
            
    /**
     * <p>id(0x12d)</p>
     */
    @ComMethod(name = "ScreenRefresh", dispId = 0x12d)
    void ScreenRefresh();
            
    /**
     * <p>id(0x12e)</p>
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
     */
    @ComMethod(name = "LookupNameProperties", dispId = 0x12f)
    void LookupNameProperties(String Name);
            
    /**
     * <p>id(0x130)</p>
     */
    @ComMethod(name = "SubstituteFont", dispId = 0x130)
    void SubstituteFont(String UnavailableFont,
            String SubstituteFont);
            
    /**
     * <p>id(0x131)</p>
     */
    @ComMethod(name = "Repeat", dispId = 0x131)
    Boolean Repeat(Object Times);
            
    /**
     * <p>id(0x136)</p>
     */
    @ComMethod(name = "DDEExecute", dispId = 0x136)
    void DDEExecute(Integer Channel,
            String Command);
            
    /**
     * <p>id(0x137)</p>
     */
    @ComMethod(name = "DDEInitiate", dispId = 0x137)
    Integer DDEInitiate(String App,
            String Topic);
            
    /**
     * <p>id(0x138)</p>
     */
    @ComMethod(name = "DDEPoke", dispId = 0x138)
    void DDEPoke(Integer Channel,
            String Item,
            String Data);
            
    /**
     * <p>id(0x139)</p>
     */
    @ComMethod(name = "DDERequest", dispId = 0x139)
    String DDERequest(Integer Channel,
            String Item);
            
    /**
     * <p>id(0x13a)</p>
     */
    @ComMethod(name = "DDETerminate", dispId = 0x13a)
    void DDETerminate(Integer Channel);
            
    /**
     * <p>id(0x13b)</p>
     */
    @ComMethod(name = "DDETerminateAll", dispId = 0x13b)
    void DDETerminateAll();
            
    /**
     * <p>id(0x13c)</p>
     */
    @ComMethod(name = "BuildKeyCode", dispId = 0x13c)
    Integer BuildKeyCode(WdKey Arg1,
            Object Arg2,
            Object Arg3,
            Object Arg4);
            
    /**
     * <p>id(0x13d)</p>
     */
    @ComMethod(name = "KeyString", dispId = 0x13d)
    String KeyString(Integer KeyCode,
            Object KeyCode2);
            
    /**
     * <p>id(0x13e)</p>
     */
    @ComMethod(name = "OrganizerCopy", dispId = 0x13e)
    void OrganizerCopy(String Source,
            String Destination,
            String Name,
            WdOrganizerObject Object);
            
    /**
     * <p>id(0x13f)</p>
     */
    @ComMethod(name = "OrganizerDelete", dispId = 0x13f)
    void OrganizerDelete(String Source,
            String Name,
            WdOrganizerObject Object);
            
    /**
     * <p>id(0x140)</p>
     */
    @ComMethod(name = "OrganizerRename", dispId = 0x140)
    void OrganizerRename(String Source,
            String Name,
            String NewName,
            WdOrganizerObject Object);
            
    /**
     * <p>id(0x141)</p>
     */
    @ComMethod(name = "AddAddress", dispId = 0x141)
    void AddAddress(String TagID,
            String Value);
            
    /**
     * <p>id(0x142)</p>
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
     */
    @ComMethod(name = "CheckGrammar", dispId = 0x143)
    Boolean CheckGrammar(String String);
            
    /**
     * <p>id(0x144)</p>
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
     */
    @ComMethod(name = "ResetIgnoreAll", dispId = 0x146)
    void ResetIgnoreAll();
            
    /**
     * <p>id(0x147)</p>
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
     */
    @ComMethod(name = "GoBack", dispId = 0x148)
    void GoBack();
            
    /**
     * <p>id(0x149)</p>
     */
    @ComMethod(name = "Help", dispId = 0x149)
    void Help(Object HelpType);
            
    /**
     * <p>id(0x14a)</p>
     */
    @ComMethod(name = "AutomaticChange", dispId = 0x14a)
    void AutomaticChange();
            
    /**
     * <p>id(0x14b)</p>
     */
    @ComMethod(name = "ShowMe", dispId = 0x14b)
    void ShowMe();
            
    /**
     * <p>id(0x14c)</p>
     */
    @ComMethod(name = "HelpTool", dispId = 0x14c)
    void HelpTool();
            
    /**
     * <p>id(0x159)</p>
     */
    @ComMethod(name = "NewWindow", dispId = 0x159)
    Window NewWindow();
            
    /**
     * <p>id(0x15a)</p>
     */
    @ComMethod(name = "ListCommands", dispId = 0x15a)
    void ListCommands(Boolean ListAllCommands);
            
    /**
     * <p>id(0x15d)</p>
     */
    @ComMethod(name = "ShowClipboard", dispId = 0x15d)
    void ShowClipboard();
            
    /**
     * <p>id(0x15e)</p>
     */
    @ComMethod(name = "OnTime", dispId = 0x15e)
    void OnTime(Object When,
            String Name,
            Object Tolerance);
            
    /**
     * <p>id(0x15f)</p>
     */
    @ComMethod(name = "NextLetter", dispId = 0x15f)
    void NextLetter();
            
    /**
     * <p>id(0x161)</p>
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
     */
    @ComMethod(name = "CleanString", dispId = 0x162)
    String CleanString(String String);
            
    /**
     * <p>id(0x164)</p>
     */
    @ComMethod(name = "SendFax", dispId = 0x164)
    void SendFax();
            
    /**
     * <p>id(0x165)</p>
     */
    @ComMethod(name = "ChangeFileOpenDirectory", dispId = 0x165)
    void ChangeFileOpenDirectory(String Path);
            
    /**
     * <p>id(0x166)</p>
     */
    @ComMethod(name = "RunOld", dispId = 0x166)
    void RunOld(String MacroName);
            
    /**
     * <p>id(0x167)</p>
     */
    @ComMethod(name = "GoForward", dispId = 0x167)
    void GoForward();
            
    /**
     * <p>id(0x168)</p>
     */
    @ComMethod(name = "Move", dispId = 0x168)
    void Move(Integer Left,
            Integer Top);
            
    /**
     * <p>id(0x169)</p>
     */
    @ComMethod(name = "Resize", dispId = 0x169)
    void Resize(Integer Width,
            Integer Height);
            
    /**
     * <p>id(0x172)</p>
     */
    @ComMethod(name = "InchesToPoints", dispId = 0x172)
    Float InchesToPoints(Float Inches);
            
    /**
     * <p>id(0x173)</p>
     */
    @ComMethod(name = "CentimetersToPoints", dispId = 0x173)
    Float CentimetersToPoints(Float Centimeters);
            
    /**
     * <p>id(0x174)</p>
     */
    @ComMethod(name = "MillimetersToPoints", dispId = 0x174)
    Float MillimetersToPoints(Float Millimeters);
            
    /**
     * <p>id(0x175)</p>
     */
    @ComMethod(name = "PicasToPoints", dispId = 0x175)
    Float PicasToPoints(Float Picas);
            
    /**
     * <p>id(0x176)</p>
     */
    @ComMethod(name = "LinesToPoints", dispId = 0x176)
    Float LinesToPoints(Float Lines);
            
    /**
     * <p>id(0x17c)</p>
     */
    @ComMethod(name = "PointsToInches", dispId = 0x17c)
    Float PointsToInches(Float Points);
            
    /**
     * <p>id(0x17d)</p>
     */
    @ComMethod(name = "PointsToCentimeters", dispId = 0x17d)
    Float PointsToCentimeters(Float Points);
            
    /**
     * <p>id(0x17e)</p>
     */
    @ComMethod(name = "PointsToMillimeters", dispId = 0x17e)
    Float PointsToMillimeters(Float Points);
            
    /**
     * <p>id(0x17f)</p>
     */
    @ComMethod(name = "PointsToPicas", dispId = 0x17f)
    Float PointsToPicas(Float Points);
            
    /**
     * <p>id(0x180)</p>
     */
    @ComMethod(name = "PointsToLines", dispId = 0x180)
    Float PointsToLines(Float Points);
            
    /**
     * <p>id(0x181)</p>
     */
    @ComMethod(name = "Activate", dispId = 0x181)
    void Activate();
            
    /**
     * <p>id(0x183)</p>
     */
    @ComMethod(name = "PointsToPixels", dispId = 0x183)
    Float PointsToPixels(Float Points,
            Object fVertical);
            
    /**
     * <p>id(0x184)</p>
     */
    @ComMethod(name = "PixelsToPoints", dispId = 0x184)
    Float PixelsToPoints(Float Pixels,
            Object fVertical);
            
    /**
     * <p>id(0x190)</p>
     */
    @ComMethod(name = "KeyboardLatin", dispId = 0x190)
    void KeyboardLatin();
            
    /**
     * <p>id(0x191)</p>
     */
    @ComMethod(name = "KeyboardBidi", dispId = 0x191)
    void KeyboardBidi();
            
    /**
     * <p>id(0x192)</p>
     */
    @ComMethod(name = "ToggleKeyboard", dispId = 0x192)
    void ToggleKeyboard();
            
    /**
     * <p>id(0x1be)</p>
     */
    @ComMethod(name = "Keyboard", dispId = 0x1be)
    Integer Keyboard(Integer LangId);
            
    /**
     * <p>id(0x194)</p>
     */
    @ComMethod(name = "ProductCode", dispId = 0x194)
    String ProductCode();
            
    /**
     * <p>id(0x195)</p>
     */
    @ComMethod(name = "DefaultWebOptions", dispId = 0x195)
    DefaultWebOptions DefaultWebOptions();
            
    /**
     * <p>id(0x197)</p>
     */
    @ComMethod(name = "DiscussionSupport", dispId = 0x197)
    void DiscussionSupport(Object Range,
            Object cid,
            Object piCSE);
            
    /**
     * <p>id(0x19e)</p>
     */
    @ComMethod(name = "SetDefaultTheme", dispId = 0x19e)
    void SetDefaultTheme(String Name,
            WdDocumentMedium DocumentType);
            
    /**
     * <p>id(0x1a0)</p>
     */
    @ComMethod(name = "GetDefaultTheme", dispId = 0x1a0)
    String GetDefaultTheme(WdDocumentMedium DocumentType);
            
    /**
     * <p>id(0x185)</p>
     */
    @ComProperty(name = "EmailOptions", dispId = 0x185)
    EmailOptions getEmailOptions();
            
    /**
     * <p>id(0x187)</p>
     */
    @ComProperty(name = "Language", dispId = 0x187)
    eu.doppel_helix.jna.tlb.office2.MsoLanguageID getLanguage();
            
    /**
     * <p>id(0x6f)</p>
     */
    @ComProperty(name = "COMAddIns", dispId = 0x6f)
    eu.doppel_helix.jna.tlb.office2.COMAddIns getCOMAddIns();
            
    /**
     * <p>id(0x70)</p>
     */
    @ComProperty(name = "CheckLanguage", dispId = 0x70)
    Boolean getCheckLanguage();
            
    /**
     * <p>id(0x70)</p>
     */
    @ComProperty(name = "CheckLanguage", dispId = 0x70)
    void setCheckLanguage(Boolean param0);
            
    /**
     * <p>id(0x193)</p>
     */
    @ComProperty(name = "LanguageSettings", dispId = 0x193)
    eu.doppel_helix.jna.tlb.office2.LanguageSettings getLanguageSettings();
            
    /**
     * <p>id(0x196)</p>
     */
    @ComProperty(name = "Dummy1", dispId = 0x196)
    Boolean getDummy1();
            
    /**
     * <p>id(0x199)</p>
     */
    @ComProperty(name = "AnswerWizard", dispId = 0x199)
    eu.doppel_helix.jna.tlb.office2.AnswerWizard getAnswerWizard();
            
    /**
     * <p>id(0x1bf)</p>
     */
    @ComProperty(name = "FeatureInstall", dispId = 0x1bf)
    eu.doppel_helix.jna.tlb.office2.MsoFeatureInstall getFeatureInstall();
            
    /**
     * <p>id(0x1bf)</p>
     */
    @ComProperty(name = "FeatureInstall", dispId = 0x1bf)
    void setFeatureInstall(eu.doppel_helix.jna.tlb.office2.MsoFeatureInstall param0);
            
    /**
     * <p>id(0x1bc)</p>
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
     */
    @ComProperty(name = "AutomationSecurity", dispId = 0x1c1)
    eu.doppel_helix.jna.tlb.office2.MsoAutomationSecurity getAutomationSecurity();
            
    /**
     * <p>id(0x1c1)</p>
     */
    @ComProperty(name = "AutomationSecurity", dispId = 0x1c1)
    void setAutomationSecurity(eu.doppel_helix.jna.tlb.office2.MsoAutomationSecurity param0);
            
    /**
     * <p>id(0x1c2)</p>
     */
    @ComProperty(name = "FileDialog", dispId = 0x1c2)
    eu.doppel_helix.jna.tlb.office2.FileDialog getFileDialog(eu.doppel_helix.jna.tlb.office2.MsoFileDialogType FileDialogType);
            
    /**
     * <p>id(0x1c3)</p>
     */
    @ComProperty(name = "EmailTemplate", dispId = 0x1c3)
    String getEmailTemplate();
            
    /**
     * <p>id(0x1c3)</p>
     */
    @ComProperty(name = "EmailTemplate", dispId = 0x1c3)
    void setEmailTemplate(String param0);
            
    /**
     * <p>id(0x1c4)</p>
     */
    @ComProperty(name = "ShowWindowsInTaskbar", dispId = 0x1c4)
    Boolean getShowWindowsInTaskbar();
            
    /**
     * <p>id(0x1c4)</p>
     */
    @ComProperty(name = "ShowWindowsInTaskbar", dispId = 0x1c4)
    void setShowWindowsInTaskbar(Boolean param0);
            
    /**
     * <p>id(0x1c6)</p>
     */
    @ComProperty(name = "NewDocument", dispId = 0x1c6)
    eu.doppel_helix.jna.tlb.office2.NewFile getNewDocument();
            
    /**
     * <p>id(0x1c7)</p>
     */
    @ComProperty(name = "ShowStartupDialog", dispId = 0x1c7)
    Boolean getShowStartupDialog();
            
    /**
     * <p>id(0x1c7)</p>
     */
    @ComProperty(name = "ShowStartupDialog", dispId = 0x1c7)
    void setShowStartupDialog(Boolean param0);
            
    /**
     * <p>id(0x1c8)</p>
     */
    @ComProperty(name = "AutoCorrectEmail", dispId = 0x1c8)
    AutoCorrect getAutoCorrectEmail();
            
    /**
     * <p>id(0x1c9)</p>
     */
    @ComProperty(name = "TaskPanes", dispId = 0x1c9)
    TaskPanes getTaskPanes();
            
    /**
     * <p>id(0x1cb)</p>
     */
    @ComProperty(name = "DefaultLegalBlackline", dispId = 0x1cb)
    Boolean getDefaultLegalBlackline();
            
    /**
     * <p>id(0x1cb)</p>
     */
    @ComProperty(name = "DefaultLegalBlackline", dispId = 0x1cb)
    void setDefaultLegalBlackline(Boolean param0);
            
    /**
     * <p>id(0x1ca)</p>
     */
    @ComMethod(name = "Dummy2", dispId = 0x1ca)
    Boolean Dummy2();
            
    /**
     * <p>id(0x1cc)</p>
     */
    @ComProperty(name = "SmartTagRecognizers", dispId = 0x1cc)
    SmartTagRecognizers getSmartTagRecognizers();
            
    /**
     * <p>id(0x1cd)</p>
     */
    @ComProperty(name = "SmartTagTypes", dispId = 0x1cd)
    SmartTagTypes getSmartTagTypes();
            
    /**
     * <p>id(0x1cf)</p>
     */
    @ComProperty(name = "XMLNamespaces", dispId = 0x1cf)
    XMLNamespaces getXMLNamespaces();
            
    /**
     * <p>id(0x1d0)</p>
     */
    @ComMethod(name = "PutFocusInMailHeader", dispId = 0x1d0)
    void PutFocusInMailHeader();
            
    /**
     * <p>id(0x1d1)</p>
     */
    @ComProperty(name = "ArbitraryXMLSupportAvailable", dispId = 0x1d1)
    Boolean getArbitraryXMLSupportAvailable();
            
    /**
     * <p>id(0x1d2)</p>
     */
    @ComProperty(name = "BuildFull", dispId = 0x1d2)
    String getBuildFull();
            
    /**
     * <p>id(0x1d3)</p>
     */
    @ComProperty(name = "BuildFeatureCrew", dispId = 0x1d3)
    String getBuildFeatureCrew();
            
    /**
     * <p>id(0x1d5)</p>
     */
    @ComMethod(name = "LoadMasterList", dispId = 0x1d5)
    void LoadMasterList(String FileName);
            
    /**
     * <p>id(0x1d6)</p>
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
     */
    @ComProperty(name = "Bibliography", dispId = 0x1d8)
    Bibliography getBibliography();
            
    /**
     * <p>id(0x1d9)</p>
     */
    @ComProperty(name = "ShowStylePreviews", dispId = 0x1d9)
    Boolean getShowStylePreviews();
            
    /**
     * <p>id(0x1d9)</p>
     */
    @ComProperty(name = "ShowStylePreviews", dispId = 0x1d9)
    void setShowStylePreviews(Boolean param0);
            
    /**
     * <p>id(0x1da)</p>
     */
    @ComProperty(name = "RestrictLinkedStyles", dispId = 0x1da)
    Boolean getRestrictLinkedStyles();
            
    /**
     * <p>id(0x1da)</p>
     */
    @ComProperty(name = "RestrictLinkedStyles", dispId = 0x1da)
    void setRestrictLinkedStyles(Boolean param0);
            
    /**
     * <p>id(0x1db)</p>
     */
    @ComProperty(name = "OMathAutoCorrect", dispId = 0x1db)
    OMathAutoCorrect getOMathAutoCorrect();
            
    /**
     * <p>id(0x1dc)</p>
     */
    @ComProperty(name = "DisplayDocumentInformationPanel", dispId = 0x1dc)
    Boolean getDisplayDocumentInformationPanel();
            
    /**
     * <p>id(0x1dc)</p>
     */
    @ComProperty(name = "DisplayDocumentInformationPanel", dispId = 0x1dc)
    void setDisplayDocumentInformationPanel(Boolean param0);
            
    /**
     * <p>id(0x1dd)</p>
     */
    @ComProperty(name = "Assistance", dispId = 0x1dd)
    eu.doppel_helix.jna.tlb.office2.IAssistance getAssistance();
            
    /**
     * <p>id(0x1de)</p>
     */
    @ComProperty(name = "OpenAttachmentsInFullScreen", dispId = 0x1de)
    Boolean getOpenAttachmentsInFullScreen();
            
    /**
     * <p>id(0x1de)</p>
     */
    @ComProperty(name = "OpenAttachmentsInFullScreen", dispId = 0x1de)
    void setOpenAttachmentsInFullScreen(Boolean param0);
            
    /**
     * <p>id(0x1df)</p>
     */
    @ComProperty(name = "ActiveEncryptionSession", dispId = 0x1df)
    Integer getActiveEncryptionSession();
            
    /**
     * <p>id(0x1e0)</p>
     */
    @ComProperty(name = "DontResetInsertionPointProperties", dispId = 0x1e0)
    Boolean getDontResetInsertionPointProperties();
            
    /**
     * <p>id(0x1e0)</p>
     */
    @ComProperty(name = "DontResetInsertionPointProperties", dispId = 0x1e0)
    void setDontResetInsertionPointProperties(Boolean param0);
            
    /**
     * <p>id(0x1e1)</p>
     */
    @ComProperty(name = "SmartArtLayouts", dispId = 0x1e1)
    eu.doppel_helix.jna.tlb.office2.SmartArtLayouts getSmartArtLayouts();
            
    /**
     * <p>id(0x1e2)</p>
     */
    @ComProperty(name = "SmartArtQuickStyles", dispId = 0x1e2)
    eu.doppel_helix.jna.tlb.office2.SmartArtQuickStyles getSmartArtQuickStyles();
            
    /**
     * <p>id(0x1e3)</p>
     */
    @ComProperty(name = "SmartArtColors", dispId = 0x1e3)
    eu.doppel_helix.jna.tlb.office2.SmartArtColors getSmartArtColors();
            
    /**
     * <p>id(0x1e4)</p>
     */
    @ComMethod(name = "ThreeWayMerge", dispId = 0x1e4)
    void ThreeWayMerge(Document LocalDocument,
            Document ServerDocument,
            Document BaseDocument,
            Boolean FavorSource);
            
    /**
     * <p>id(0x1e5)</p>
     */
    @ComMethod(name = "Dummy4", dispId = 0x1e5)
    void Dummy4();
            
    /**
     * <p>id(0x1e6)</p>
     */
    @ComProperty(name = "UndoRecord", dispId = 0x1e6)
    UndoRecord getUndoRecord();
            
    /**
     * <p>id(0x1e9)</p>
     */
    @ComProperty(name = "PickerDialog", dispId = 0x1e9)
    eu.doppel_helix.jna.tlb.office2.PickerDialog getPickerDialog();
            
    /**
     * <p>id(0x1ea)</p>
     */
    @ComProperty(name = "ProtectedViewWindows", dispId = 0x1ea)
    ProtectedViewWindows getProtectedViewWindows();
            
    /**
     * <p>id(0x1eb)</p>
     */
    @ComProperty(name = "ActiveProtectedViewWindow", dispId = 0x1eb)
    ProtectedViewWindow getActiveProtectedViewWindow();
            
    /**
     * <p>id(0x1ec)</p>
     */
    @ComProperty(name = "IsSandboxed", dispId = 0x1ec)
    Boolean getIsSandboxed();
            
    /**
     * <p>id(0x1ed)</p>
     */
    @ComProperty(name = "FileValidation", dispId = 0x1ed)
    eu.doppel_helix.jna.tlb.office2.MsoFileValidationMode getFileValidation();
            
    /**
     * <p>id(0x1ed)</p>
     */
    @ComProperty(name = "FileValidation", dispId = 0x1ed)
    void setFileValidation(eu.doppel_helix.jna.tlb.office2.MsoFileValidationMode param0);
            
    /**
     * <p>id(0x1ee)</p>
     */
    @ComProperty(name = "ChartDataPointTrack", dispId = 0x1ee)
    Boolean getChartDataPointTrack();
            
    /**
     * <p>id(0x1ee)</p>
     */
    @ComProperty(name = "ChartDataPointTrack", dispId = 0x1ee)
    void setChartDataPointTrack(Boolean param0);
            
    /**
     * <p>id(0x1ef)</p>
     */
    @ComProperty(name = "ShowAnimation", dispId = 0x1ef)
    Boolean getShowAnimation();
            
    /**
     * <p>id(0x1ef)</p>
     */
    @ComProperty(name = "ShowAnimation", dispId = 0x1ef)
    void setShowAnimation(Boolean param0);
            
    
}