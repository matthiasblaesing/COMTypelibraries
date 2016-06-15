
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
     * <p>id(0x1)</p>
     */
    @ComProperty(name = "Documents", dispId = 0x1)
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
     * <p>id(0x6)</p>
     */
    @ComProperty(name = "WordBasic", dispId = 0x6)
    com.sun.jna.platform.win32.COM.util.IDispatch getWordBasic();
            
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
     * <p>id(0x11)</p>
     */
    @ComProperty(name = "FileConverters", dispId = 0x11)
    FileConverters getFileConverters();
            
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
     * <p>id(0x1c)</p>
     */
    @ComProperty(name = "Tasks", dispId = 0x1c)
    Tasks getTasks();
            
    /**
     * <p>id(0x37)</p>
     */
    @ComProperty(name = "MacroContainer", dispId = 0x37)
    com.sun.jna.platform.win32.COM.util.IDispatch getMacroContainer();
            
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
     * <p>id(0x5d)</p>
     */
    @ComProperty(name = "Options", dispId = 0x5d)
    Options getOptions();
            
    /**
     * <p>id(0x5f)</p>
     */
    @ComProperty(name = "CustomDictionaries", dispId = 0x5f)
    Dictionaries getCustomDictionaries();
            
    /**
     * <p>id(0x61)</p>
     */
    @ComProperty(name = "StatusBar", dispId = 0x61)
    void setStatusBar(String param0);
            
    /**
     * <p>id(0x68)</p>
     */
    @ComProperty(name = "ShowVisualBasicEditor", dispId = 0x68)
    Boolean getShowVisualBasicEditor();
            
    /**
     * <p>id(0x68)</p>
     */
    @ComProperty(name = "ShowVisualBasicEditor", dispId = 0x68)
    void setShowVisualBasicEditor(Boolean param0);
            
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
     * <p>id(0x149)</p>
     */
    @ComMethod(name = "Help", dispId = 0x149)
    void Help(Object HelpType);
            
    /**
     * <p>id(0x159)</p>
     */
    @ComMethod(name = "NewWindow", dispId = 0x159)
    Window NewWindow();
            
    /**
     * <p>id(0x162)</p>
     */
    @ComMethod(name = "CleanString", dispId = 0x162)
    String CleanString(String String);
            
    /**
     * <p>id(0x163)</p>
     */
    @ComMethod(name = "ChangeFileOpenDirectory", dispId = 0x163)
    void ChangeFileOpenDirectory(String Path);
            
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
    @ComMethod(name = "PointsToPixels", dispId = 0x181)
    Float PointsToPixels(Float Points,
            Object fVertical);
            
    /**
     * <p>id(0x182)</p>
     */
    @ComMethod(name = "PixelsToPoints", dispId = 0x182)
    Float PixelsToPoints(Float Pixels,
            Object fVertical);
            
    /**
     * <p>id(0x6f)</p>
     */
    @ComProperty(name = "LanguageSettings", dispId = 0x6f)
    eu.doppel_helix.jna.tlb.office2.LanguageSettings getLanguageSettings();
            
    /**
     * <p>id(0x70)</p>
     */
    @ComProperty(name = "AnswerWizard", dispId = 0x70)
    eu.doppel_helix.jna.tlb.office2.AnswerWizard getAnswerWizard();
            
    /**
     * <p>id(0x71)</p>
     */
    @ComProperty(name = "AutoCorrectEmail", dispId = 0x71)
    AutoCorrect getAutoCorrectEmail();
            
    /**
     * <p>id(0x72)</p>
     */
    @ComProperty(name = "ProtectedViewWindows", dispId = 0x72)
    ProtectedViewWindows getProtectedViewWindows();
            
    /**
     * <p>id(0x73)</p>
     */
    @ComProperty(name = "ActiveProtectedViewWindow", dispId = 0x73)
    ProtectedViewWindow getActiveProtectedViewWindow();
            
    /**
     * <p>id(0x74)</p>
     */
    @ComProperty(name = "IsSandboxed", dispId = 0x74)
    Boolean getIsSandboxed();
            
    
}