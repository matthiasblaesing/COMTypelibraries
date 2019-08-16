
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000209B9-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000209B9-0000-0000-C000-000000000046}")
public interface _Global extends IUnknown, IRawDispatchHandle, IDispatch {
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
     * <p>id(0x1)</p>
     * <p>vtableId(11)</p>
     */
    @ComProperty(name = "Documents", dispId = 0x1)
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
     * <p>id(0x6)</p>
     * <p>vtableId(16)</p>
     */
    @ComProperty(name = "WordBasic", dispId = 0x6)
    com.sun.jna.platform.win32.COM.util.IDispatch getWordBasic();
            
    /**
     * <p>id(0x1b)</p>
     * <p>vtableId(17)</p>
     */
    @ComProperty(name = "PrintPreview", dispId = 0x1b)
    Boolean getPrintPreview();
            
    /**
     * <p>id(0x1b)</p>
     * <p>vtableId(18)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "PrintPreview", dispId = 0x1b)
    void setPrintPreview(Boolean param0);
            
    /**
     * <p>id(0x7)</p>
     * <p>vtableId(19)</p>
     */
    @ComProperty(name = "RecentFiles", dispId = 0x7)
    RecentFiles getRecentFiles();
            
    /**
     * <p>id(0x8)</p>
     * <p>vtableId(20)</p>
     */
    @ComProperty(name = "NormalTemplate", dispId = 0x8)
    Template getNormalTemplate();
            
    /**
     * <p>id(0x9)</p>
     * <p>vtableId(21)</p>
     */
    @ComProperty(name = "System", dispId = 0x9)
    System getSystem();
            
    /**
     * <p>id(0xa)</p>
     * <p>vtableId(22)</p>
     */
    @ComProperty(name = "AutoCorrect", dispId = 0xa)
    AutoCorrect getAutoCorrect();
            
    /**
     * <p>id(0xb)</p>
     * <p>vtableId(23)</p>
     */
    @ComProperty(name = "FontNames", dispId = 0xb)
    FontNames getFontNames();
            
    /**
     * <p>id(0xc)</p>
     * <p>vtableId(24)</p>
     */
    @ComProperty(name = "LandscapeFontNames", dispId = 0xc)
    FontNames getLandscapeFontNames();
            
    /**
     * <p>id(0xd)</p>
     * <p>vtableId(25)</p>
     */
    @ComProperty(name = "PortraitFontNames", dispId = 0xd)
    FontNames getPortraitFontNames();
            
    /**
     * <p>id(0xe)</p>
     * <p>vtableId(26)</p>
     */
    @ComProperty(name = "Languages", dispId = 0xe)
    Languages getLanguages();
            
    /**
     * <p>id(0xf)</p>
     * <p>vtableId(27)</p>
     */
    @ComProperty(name = "Assistant", dispId = 0xf)
    eu.doppel_helix.jna.tlb.office2.Assistant getAssistant();
            
    /**
     * <p>id(0x11)</p>
     * <p>vtableId(28)</p>
     */
    @ComProperty(name = "FileConverters", dispId = 0x11)
    FileConverters getFileConverters();
            
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
     * <p>id(0x1c)</p>
     * <p>vtableId(33)</p>
     */
    @ComProperty(name = "Tasks", dispId = 0x1c)
    Tasks getTasks();
            
    /**
     * <p>id(0x37)</p>
     * <p>vtableId(34)</p>
     */
    @ComProperty(name = "MacroContainer", dispId = 0x37)
    com.sun.jna.platform.win32.COM.util.IDispatch getMacroContainer();
            
    /**
     * <p>id(0x39)</p>
     * <p>vtableId(35)</p>
     */
    @ComProperty(name = "CommandBars", dispId = 0x39)
    eu.doppel_helix.jna.tlb.office2.CommandBars getCommandBars();
            
    /**
     * <p>id(0x3b)</p>
     * <p>vtableId(36)</p>
     * @param Word [in] {@code String}
     * @param LanguageID [in, optional] {@code Object}
     */
    @ComProperty(name = "SynonymInfo", dispId = 0x3b)
    SynonymInfo getSynonymInfo(String Word,
            Object LanguageID);
            
    /**
     * <p>id(0x3d)</p>
     * <p>vtableId(37)</p>
     */
    @ComProperty(name = "VBE", dispId = 0x3d)
    eu.doppel_helix.jna.tlb.vbide5.VBE getVBE();
            
    /**
     * <p>id(0x41)</p>
     * <p>vtableId(38)</p>
     */
    @ComProperty(name = "ListGalleries", dispId = 0x41)
    ListGalleries getListGalleries();
            
    /**
     * <p>id(0x42)</p>
     * <p>vtableId(39)</p>
     */
    @ComProperty(name = "ActivePrinter", dispId = 0x42)
    String getActivePrinter();
            
    /**
     * <p>id(0x42)</p>
     * <p>vtableId(40)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "ActivePrinter", dispId = 0x42)
    void setActivePrinter(String param0);
            
    /**
     * <p>id(0x43)</p>
     * <p>vtableId(41)</p>
     */
    @ComProperty(name = "Templates", dispId = 0x43)
    Templates getTemplates();
            
    /**
     * <p>id(0x44)</p>
     * <p>vtableId(42)</p>
     */
    @ComProperty(name = "CustomizationContext", dispId = 0x44)
    com.sun.jna.platform.win32.COM.util.IDispatch getCustomizationContext();
            
    /**
     * <p>id(0x44)</p>
     * <p>vtableId(43)</p>
     * @param param0 [in] {@code com.sun.jna.platform.win32.COM.util.IDispatch}
     */
    @ComProperty(name = "CustomizationContext", dispId = 0x44)
    void setCustomizationContext(com.sun.jna.platform.win32.COM.util.IDispatch param0);
            
    /**
     * <p>id(0x45)</p>
     * <p>vtableId(44)</p>
     */
    @ComProperty(name = "KeyBindings", dispId = 0x45)
    KeyBindings getKeyBindings();
            
    /**
     * <p>id(0x46)</p>
     * <p>vtableId(45)</p>
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
     * <p>vtableId(46)</p>
     * @param KeyCode [in] {@code Integer}
     * @param KeyCode2 [in, optional] {@code Object}
     */
    @ComProperty(name = "FindKey", dispId = 0x47)
    KeyBinding getFindKey(Integer KeyCode,
            Object KeyCode2);
            
    /**
     * <p>id(0x5d)</p>
     * <p>vtableId(47)</p>
     */
    @ComProperty(name = "Options", dispId = 0x5d)
    Options getOptions();
            
    /**
     * <p>id(0x5f)</p>
     * <p>vtableId(48)</p>
     */
    @ComProperty(name = "CustomDictionaries", dispId = 0x5f)
    Dictionaries getCustomDictionaries();
            
    /**
     * <p>id(0x61)</p>
     * <p>vtableId(49)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "StatusBar", dispId = 0x61)
    void setStatusBar(String param0);
            
    /**
     * <p>id(0x68)</p>
     * <p>vtableId(50)</p>
     */
    @ComProperty(name = "ShowVisualBasicEditor", dispId = 0x68)
    Boolean getShowVisualBasicEditor();
            
    /**
     * <p>id(0x68)</p>
     * <p>vtableId(51)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "ShowVisualBasicEditor", dispId = 0x68)
    void setShowVisualBasicEditor(Boolean param0);
            
    /**
     * <p>id(0x6d)</p>
     * <p>vtableId(52)</p>
     * @param Object [in] {@code com.sun.jna.platform.win32.COM.util.IDispatch}
     */
    @ComProperty(name = "IsObjectValid", dispId = 0x6d)
    Boolean getIsObjectValid(com.sun.jna.platform.win32.COM.util.IDispatch Object);
            
    /**
     * <p>id(0x6e)</p>
     * <p>vtableId(53)</p>
     */
    @ComProperty(name = "HangulHanjaDictionaries", dispId = 0x6e)
    HangulHanjaConversionDictionaries getHangulHanjaDictionaries();
            
    /**
     * <p>id(0x131)</p>
     * <p>vtableId(54)</p>
     * @param Times [in, optional] {@code Object}
     */
    @ComMethod(name = "Repeat", dispId = 0x131)
    Boolean Repeat(Object Times);
            
    /**
     * <p>id(0x136)</p>
     * <p>vtableId(55)</p>
     * @param Channel [in] {@code Integer}
     * @param Command [in] {@code String}
     */
    @ComMethod(name = "DDEExecute", dispId = 0x136)
    void DDEExecute(Integer Channel,
            String Command);
            
    /**
     * <p>id(0x137)</p>
     * <p>vtableId(56)</p>
     * @param App [in] {@code String}
     * @param Topic [in] {@code String}
     */
    @ComMethod(name = "DDEInitiate", dispId = 0x137)
    Integer DDEInitiate(String App,
            String Topic);
            
    /**
     * <p>id(0x138)</p>
     * <p>vtableId(57)</p>
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
     * <p>vtableId(58)</p>
     * @param Channel [in] {@code Integer}
     * @param Item [in] {@code String}
     */
    @ComMethod(name = "DDERequest", dispId = 0x139)
    String DDERequest(Integer Channel,
            String Item);
            
    /**
     * <p>id(0x13a)</p>
     * <p>vtableId(59)</p>
     * @param Channel [in] {@code Integer}
     */
    @ComMethod(name = "DDETerminate", dispId = 0x13a)
    void DDETerminate(Integer Channel);
            
    /**
     * <p>id(0x13b)</p>
     * <p>vtableId(60)</p>
     */
    @ComMethod(name = "DDETerminateAll", dispId = 0x13b)
    void DDETerminateAll();
            
    /**
     * <p>id(0x13c)</p>
     * <p>vtableId(61)</p>
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
     * <p>vtableId(62)</p>
     * @param KeyCode [in] {@code Integer}
     * @param KeyCode2 [in, optional] {@code Object}
     */
    @ComMethod(name = "KeyString", dispId = 0x13d)
    String KeyString(Integer KeyCode,
            Object KeyCode2);
            
    /**
     * <p>id(0x144)</p>
     * <p>vtableId(63)</p>
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
     * <p>id(0x147)</p>
     * <p>vtableId(64)</p>
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
     * <p>id(0x149)</p>
     * <p>vtableId(65)</p>
     * @param HelpType [in] {@code Object}
     */
    @ComMethod(name = "Help", dispId = 0x149)
    void Help(Object HelpType);
            
    /**
     * <p>id(0x159)</p>
     * <p>vtableId(66)</p>
     */
    @ComMethod(name = "NewWindow", dispId = 0x159)
    Window NewWindow();
            
    /**
     * <p>id(0x162)</p>
     * <p>vtableId(67)</p>
     * @param String [in] {@code String}
     */
    @ComMethod(name = "CleanString", dispId = 0x162)
    String CleanString(String String);
            
    /**
     * <p>id(0x163)</p>
     * <p>vtableId(68)</p>
     * @param Path [in] {@code String}
     */
    @ComMethod(name = "ChangeFileOpenDirectory", dispId = 0x163)
    void ChangeFileOpenDirectory(String Path);
            
    /**
     * <p>id(0x172)</p>
     * <p>vtableId(69)</p>
     * @param Inches [in] {@code Float}
     */
    @ComMethod(name = "InchesToPoints", dispId = 0x172)
    Float InchesToPoints(Float Inches);
            
    /**
     * <p>id(0x173)</p>
     * <p>vtableId(70)</p>
     * @param Centimeters [in] {@code Float}
     */
    @ComMethod(name = "CentimetersToPoints", dispId = 0x173)
    Float CentimetersToPoints(Float Centimeters);
            
    /**
     * <p>id(0x174)</p>
     * <p>vtableId(71)</p>
     * @param Millimeters [in] {@code Float}
     */
    @ComMethod(name = "MillimetersToPoints", dispId = 0x174)
    Float MillimetersToPoints(Float Millimeters);
            
    /**
     * <p>id(0x175)</p>
     * <p>vtableId(72)</p>
     * @param Picas [in] {@code Float}
     */
    @ComMethod(name = "PicasToPoints", dispId = 0x175)
    Float PicasToPoints(Float Picas);
            
    /**
     * <p>id(0x176)</p>
     * <p>vtableId(73)</p>
     * @param Lines [in] {@code Float}
     */
    @ComMethod(name = "LinesToPoints", dispId = 0x176)
    Float LinesToPoints(Float Lines);
            
    /**
     * <p>id(0x17c)</p>
     * <p>vtableId(74)</p>
     * @param Points [in] {@code Float}
     */
    @ComMethod(name = "PointsToInches", dispId = 0x17c)
    Float PointsToInches(Float Points);
            
    /**
     * <p>id(0x17d)</p>
     * <p>vtableId(75)</p>
     * @param Points [in] {@code Float}
     */
    @ComMethod(name = "PointsToCentimeters", dispId = 0x17d)
    Float PointsToCentimeters(Float Points);
            
    /**
     * <p>id(0x17e)</p>
     * <p>vtableId(76)</p>
     * @param Points [in] {@code Float}
     */
    @ComMethod(name = "PointsToMillimeters", dispId = 0x17e)
    Float PointsToMillimeters(Float Points);
            
    /**
     * <p>id(0x17f)</p>
     * <p>vtableId(77)</p>
     * @param Points [in] {@code Float}
     */
    @ComMethod(name = "PointsToPicas", dispId = 0x17f)
    Float PointsToPicas(Float Points);
            
    /**
     * <p>id(0x180)</p>
     * <p>vtableId(78)</p>
     * @param Points [in] {@code Float}
     */
    @ComMethod(name = "PointsToLines", dispId = 0x180)
    Float PointsToLines(Float Points);
            
    /**
     * <p>id(0x181)</p>
     * <p>vtableId(79)</p>
     * @param Points [in] {@code Float}
     * @param fVertical [in, optional] {@code Object}
     */
    @ComMethod(name = "PointsToPixels", dispId = 0x181)
    Float PointsToPixels(Float Points,
            Object fVertical);
            
    /**
     * <p>id(0x182)</p>
     * <p>vtableId(80)</p>
     * @param Pixels [in] {@code Float}
     * @param fVertical [in, optional] {@code Object}
     */
    @ComMethod(name = "PixelsToPoints", dispId = 0x182)
    Float PixelsToPoints(Float Pixels,
            Object fVertical);
            
    /**
     * <p>id(0x6f)</p>
     * <p>vtableId(81)</p>
     */
    @ComProperty(name = "LanguageSettings", dispId = 0x6f)
    eu.doppel_helix.jna.tlb.office2.LanguageSettings getLanguageSettings();
            
    /**
     * <p>id(0x70)</p>
     * <p>vtableId(82)</p>
     */
    @ComProperty(name = "AnswerWizard", dispId = 0x70)
    eu.doppel_helix.jna.tlb.office2.AnswerWizard getAnswerWizard();
            
    /**
     * <p>id(0x71)</p>
     * <p>vtableId(83)</p>
     */
    @ComProperty(name = "AutoCorrectEmail", dispId = 0x71)
    AutoCorrect getAutoCorrectEmail();
            
    /**
     * <p>id(0x72)</p>
     * <p>vtableId(84)</p>
     */
    @ComProperty(name = "ProtectedViewWindows", dispId = 0x72)
    ProtectedViewWindows getProtectedViewWindows();
            
    /**
     * <p>id(0x73)</p>
     * <p>vtableId(85)</p>
     */
    @ComProperty(name = "ActiveProtectedViewWindow", dispId = 0x73)
    ProtectedViewWindow getActiveProtectedViewWindow();
            
    /**
     * <p>id(0x74)</p>
     * <p>vtableId(86)</p>
     */
    @ComProperty(name = "IsSandboxed", dispId = 0x74)
    Boolean getIsSandboxed();
            
    
}