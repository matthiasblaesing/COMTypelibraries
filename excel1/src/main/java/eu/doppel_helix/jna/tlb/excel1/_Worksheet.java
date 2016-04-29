
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000208D8-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000208D8-0000-0000-C000-000000000046}")
public interface _Worksheet {
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
     * <p>id(0x130)</p>
     */
    @ComMethod(name = "Activate", dispId = 0x130)
    void Activate();
            
    /**
     * <p>id(0x227)</p>
     */
    @ComMethod(name = "Copy", dispId = 0x227)
    void Copy(Object Before,
            Object After);
            
    /**
     * <p>id(0x75)</p>
     */
    @ComMethod(name = "Delete", dispId = 0x75)
    void Delete();
            
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
     * <p>id(0x1e6)</p>
     */
    @ComProperty(name = "Index", dispId = 0x1e6)
    Integer getIndex();
            
    /**
     * <p>id(0x27d)</p>
     */
    @ComMethod(name = "Move", dispId = 0x27d)
    void Move(Object Before,
            Object After);
            
    /**
     * <p>id(0x6e)</p>
     */
    @ComProperty(name = "Name", dispId = 0x6e)
    String getName();
            
    /**
     * <p>id(0x6e)</p>
     */
    @ComProperty(name = "Name", dispId = 0x6e)
    void setName(String param0);
            
    /**
     * <p>id(0x1f6)</p>
     */
    @ComProperty(name = "Next", dispId = 0x1f6)
    com.sun.jna.platform.win32.COM.util.IDispatch getNext();
            
    /**
     * <p>id(0x274)</p>
     */
    @ComProperty(name = "OnDoubleClick", dispId = 0x274)
    String getOnDoubleClick();
            
    /**
     * <p>id(0x274)</p>
     */
    @ComProperty(name = "OnDoubleClick", dispId = 0x274)
    void setOnDoubleClick(String param0);
            
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
     * <p>id(0x3e6)</p>
     */
    @ComProperty(name = "PageSetup", dispId = 0x3e6)
    PageSetup getPageSetup();
            
    /**
     * <p>id(0x1f7)</p>
     */
    @ComProperty(name = "Previous", dispId = 0x1f7)
    com.sun.jna.platform.win32.COM.util.IDispatch getPrevious();
            
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
            Object DrawingObjects,
            Object Contents,
            Object Scenarios,
            Object UserInterfaceOnly);
            
    /**
     * <p>id(0x124)</p>
     */
    @ComProperty(name = "ProtectContents", dispId = 0x124)
    Boolean getProtectContents();
            
    /**
     * <p>id(0x125)</p>
     */
    @ComProperty(name = "ProtectDrawingObjects", dispId = 0x125)
    Boolean getProtectDrawingObjects();
            
    /**
     * <p>id(0x487)</p>
     */
    @ComProperty(name = "ProtectionMode", dispId = 0x487)
    Boolean getProtectionMode();
            
    /**
     * <p>id(0x126)</p>
     */
    @ComProperty(name = "ProtectScenarios", dispId = 0x126)
    Boolean getProtectScenarios();
            
    /**
     * <p>id(0x11c)</p>
     */
    @ComMethod(name = "_SaveAs", dispId = 0x11c)
    void _SaveAs(String Filename,
            Object FileFormat,
            Object Password,
            Object WriteResPassword,
            Object ReadOnlyRecommended,
            Object CreateBackup,
            Object AddToMru,
            Object TextCodepage,
            Object TextVisualLayout);
            
    /**
     * <p>id(0xeb)</p>
     */
    @ComMethod(name = "Select", dispId = 0xeb)
    void Select(Object Replace);
            
    /**
     * <p>id(0x11d)</p>
     */
    @ComMethod(name = "Unprotect", dispId = 0x11d)
    void Unprotect(Object Password);
            
    /**
     * <p>id(0x22e)</p>
     */
    @ComProperty(name = "Visible", dispId = 0x22e)
    XlSheetVisibility getVisible();
            
    /**
     * <p>id(0x22e)</p>
     */
    @ComProperty(name = "Visible", dispId = 0x22e)
    void setVisible(XlSheetVisibility param0);
            
    /**
     * <p>id(0x561)</p>
     */
    @ComProperty(name = "Shapes", dispId = 0x561)
    Shapes getShapes();
            
    /**
     * <p>id(0x191)</p>
     */
    @ComProperty(name = "TransitionExpEval", dispId = 0x191)
    Boolean getTransitionExpEval();
            
    /**
     * <p>id(0x191)</p>
     */
    @ComProperty(name = "TransitionExpEval", dispId = 0x191)
    void setTransitionExpEval(Boolean param0);
            
    /**
     * <p>id(0x2f8)</p>
     */
    @ComMethod(name = "Arcs", dispId = 0x2f8)
    com.sun.jna.platform.win32.COM.util.IDispatch Arcs(Object Index);
            
    /**
     * <p>id(0x318)</p>
     */
    @ComProperty(name = "AutoFilterMode", dispId = 0x318)
    Boolean getAutoFilterMode();
            
    /**
     * <p>id(0x318)</p>
     */
    @ComProperty(name = "AutoFilterMode", dispId = 0x318)
    void setAutoFilterMode(Boolean param0);
            
    /**
     * <p>id(0x4a4)</p>
     */
    @ComMethod(name = "SetBackgroundPicture", dispId = 0x4a4)
    void SetBackgroundPicture(String Filename);
            
    /**
     * <p>id(0x22d)</p>
     */
    @ComMethod(name = "Buttons", dispId = 0x22d)
    com.sun.jna.platform.win32.COM.util.IDispatch Buttons(Object Index);
            
    /**
     * <p>id(0x117)</p>
     */
    @ComMethod(name = "Calculate", dispId = 0x117)
    void Calculate();
            
    /**
     * <p>id(0x590)</p>
     */
    @ComProperty(name = "EnableCalculation", dispId = 0x590)
    Boolean getEnableCalculation();
            
    /**
     * <p>id(0x590)</p>
     */
    @ComProperty(name = "EnableCalculation", dispId = 0x590)
    void setEnableCalculation(Boolean param0);
            
    /**
     * <p>id(0xee)</p>
     */
    @ComProperty(name = "Cells", dispId = 0xee)
    Range getCells();
            
    /**
     * <p>id(0x424)</p>
     */
    @ComMethod(name = "ChartObjects", dispId = 0x424)
    com.sun.jna.platform.win32.COM.util.IDispatch ChartObjects(Object Index);
            
    /**
     * <p>id(0x338)</p>
     */
    @ComMethod(name = "CheckBoxes", dispId = 0x338)
    com.sun.jna.platform.win32.COM.util.IDispatch CheckBoxes(Object Index);
            
    /**
     * <p>id(0x1f9)</p>
     */
    @ComMethod(name = "CheckSpelling", dispId = 0x1f9)
    void CheckSpelling(Object CustomDictionary,
            Object IgnoreUppercase,
            Object AlwaysSuggest,
            Object SpellLang);
            
    /**
     * <p>id(0x42d)</p>
     */
    @ComProperty(name = "CircularReference", dispId = 0x42d)
    Range getCircularReference();
            
    /**
     * <p>id(0x3ca)</p>
     */
    @ComMethod(name = "ClearArrows", dispId = 0x3ca)
    void ClearArrows();
            
    /**
     * <p>id(0xf1)</p>
     */
    @ComProperty(name = "Columns", dispId = 0xf1)
    Range getColumns();
            
    /**
     * <p>id(0x315)</p>
     */
    @ComProperty(name = "ConsolidationFunction", dispId = 0x315)
    XlConsolidationFunction getConsolidationFunction();
            
    /**
     * <p>id(0x316)</p>
     */
    @ComProperty(name = "ConsolidationOptions", dispId = 0x316)
    Object getConsolidationOptions();
            
    /**
     * <p>id(0x317)</p>
     */
    @ComProperty(name = "ConsolidationSources", dispId = 0x317)
    Object getConsolidationSources();
            
    /**
     * <p>id(0x283)</p>
     */
    @ComProperty(name = "DisplayAutomaticPageBreaks", dispId = 0x283)
    Boolean getDisplayAutomaticPageBreaks();
            
    /**
     * <p>id(0x283)</p>
     */
    @ComProperty(name = "DisplayAutomaticPageBreaks", dispId = 0x283)
    void setDisplayAutomaticPageBreaks(Boolean param0);
            
    /**
     * <p>id(0x304)</p>
     */
    @ComMethod(name = "Drawings", dispId = 0x304)
    com.sun.jna.platform.win32.COM.util.IDispatch Drawings(Object Index);
            
    /**
     * <p>id(0x58)</p>
     */
    @ComMethod(name = "DrawingObjects", dispId = 0x58)
    com.sun.jna.platform.win32.COM.util.IDispatch DrawingObjects(Object Index);
            
    /**
     * <p>id(0x344)</p>
     */
    @ComMethod(name = "DropDowns", dispId = 0x344)
    com.sun.jna.platform.win32.COM.util.IDispatch DropDowns(Object Index);
            
    /**
     * <p>id(0x484)</p>
     */
    @ComProperty(name = "EnableAutoFilter", dispId = 0x484)
    Boolean getEnableAutoFilter();
            
    /**
     * <p>id(0x484)</p>
     */
    @ComProperty(name = "EnableAutoFilter", dispId = 0x484)
    void setEnableAutoFilter(Boolean param0);
            
    /**
     * <p>id(0x591)</p>
     */
    @ComProperty(name = "EnableSelection", dispId = 0x591)
    XlEnableSelection getEnableSelection();
            
    /**
     * <p>id(0x591)</p>
     */
    @ComProperty(name = "EnableSelection", dispId = 0x591)
    void setEnableSelection(XlEnableSelection param0);
            
    /**
     * <p>id(0x485)</p>
     */
    @ComProperty(name = "EnableOutlining", dispId = 0x485)
    Boolean getEnableOutlining();
            
    /**
     * <p>id(0x485)</p>
     */
    @ComProperty(name = "EnableOutlining", dispId = 0x485)
    void setEnableOutlining(Boolean param0);
            
    /**
     * <p>id(0x486)</p>
     */
    @ComProperty(name = "EnablePivotTable", dispId = 0x486)
    Boolean getEnablePivotTable();
            
    /**
     * <p>id(0x486)</p>
     */
    @ComProperty(name = "EnablePivotTable", dispId = 0x486)
    void setEnablePivotTable(Boolean param0);
            
    /**
     * <p>id(0x1)</p>
     */
    @ComMethod(name = "Evaluate", dispId = 0x1)
    Object Evaluate(Object Name);
            
    /**
     * <p>id(0xfffffffb)</p>
     */
    @ComMethod(name = "_Evaluate", dispId = 0xfffffffb)
    Object _Evaluate(Object Name);
            
    /**
     * <p>id(0x320)</p>
     */
    @ComProperty(name = "FilterMode", dispId = 0x320)
    Boolean getFilterMode();
            
    /**
     * <p>id(0x592)</p>
     */
    @ComMethod(name = "ResetAllPageBreaks", dispId = 0x592)
    void ResetAllPageBreaks();
            
    /**
     * <p>id(0x342)</p>
     */
    @ComMethod(name = "GroupBoxes", dispId = 0x342)
    com.sun.jna.platform.win32.COM.util.IDispatch GroupBoxes(Object Index);
            
    /**
     * <p>id(0x459)</p>
     */
    @ComMethod(name = "GroupObjects", dispId = 0x459)
    com.sun.jna.platform.win32.COM.util.IDispatch GroupObjects(Object Index);
            
    /**
     * <p>id(0x349)</p>
     */
    @ComMethod(name = "Labels", dispId = 0x349)
    com.sun.jna.platform.win32.COM.util.IDispatch Labels(Object Index);
            
    /**
     * <p>id(0x2ff)</p>
     */
    @ComMethod(name = "Lines", dispId = 0x2ff)
    com.sun.jna.platform.win32.COM.util.IDispatch Lines(Object Index);
            
    /**
     * <p>id(0x340)</p>
     */
    @ComMethod(name = "ListBoxes", dispId = 0x340)
    com.sun.jna.platform.win32.COM.util.IDispatch ListBoxes(Object Index);
            
    /**
     * <p>id(0x1ba)</p>
     */
    @ComProperty(name = "Names", dispId = 0x1ba)
    Names getNames();
            
    /**
     * <p>id(0x31f)</p>
     */
    @ComMethod(name = "OLEObjects", dispId = 0x31f)
    com.sun.jna.platform.win32.COM.util.IDispatch OLEObjects(Object Index);
            
    /**
     * <p>id(0x271)</p>
     */
    @ComProperty(name = "OnCalculate", dispId = 0x271)
    String getOnCalculate();
            
    /**
     * <p>id(0x271)</p>
     */
    @ComProperty(name = "OnCalculate", dispId = 0x271)
    void setOnCalculate(String param0);
            
    /**
     * <p>id(0x275)</p>
     */
    @ComProperty(name = "OnData", dispId = 0x275)
    String getOnData();
            
    /**
     * <p>id(0x275)</p>
     */
    @ComProperty(name = "OnData", dispId = 0x275)
    void setOnData(String param0);
            
    /**
     * <p>id(0x273)</p>
     */
    @ComProperty(name = "OnEntry", dispId = 0x273)
    String getOnEntry();
            
    /**
     * <p>id(0x273)</p>
     */
    @ComProperty(name = "OnEntry", dispId = 0x273)
    void setOnEntry(String param0);
            
    /**
     * <p>id(0x33a)</p>
     */
    @ComMethod(name = "OptionButtons", dispId = 0x33a)
    com.sun.jna.platform.win32.COM.util.IDispatch OptionButtons(Object Index);
            
    /**
     * <p>id(0x66)</p>
     */
    @ComProperty(name = "Outline", dispId = 0x66)
    Outline getOutline();
            
    /**
     * <p>id(0x321)</p>
     */
    @ComMethod(name = "Ovals", dispId = 0x321)
    com.sun.jna.platform.win32.COM.util.IDispatch Ovals(Object Index);
            
    /**
     * <p>id(0xd3)</p>
     */
    @ComMethod(name = "Paste", dispId = 0xd3)
    void Paste(Object Destination,
            Object Link);
            
    /**
     * <p>id(0x403)</p>
     */
    @ComMethod(name = "_PasteSpecial", dispId = 0x403)
    void _PasteSpecial(Object Format,
            Object Link,
            Object DisplayAsIcon,
            Object IconFileName,
            Object IconIndex,
            Object IconLabel);
            
    /**
     * <p>id(0x303)</p>
     */
    @ComMethod(name = "Pictures", dispId = 0x303)
    com.sun.jna.platform.win32.COM.util.IDispatch Pictures(Object Index);
            
    /**
     * <p>id(0x2b2)</p>
     */
    @ComMethod(name = "PivotTables", dispId = 0x2b2)
    com.sun.jna.platform.win32.COM.util.IDispatch PivotTables(Object Index);
            
    /**
     * <p>id(0x2ac)</p>
     */
    @ComMethod(name = "PivotTableWizard", dispId = 0x2ac)
    PivotTable PivotTableWizard(Object SourceType,
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
     * <p>id(0xc5)</p>
     */
    @ComProperty(name = "Range", dispId = 0xc5)
    Range getRange(Object Cell1,
            Object Cell2);
            
    /**
     * <p>id(0x306)</p>
     */
    @ComMethod(name = "Rectangles", dispId = 0x306)
    com.sun.jna.platform.win32.COM.util.IDispatch Rectangles(Object Index);
            
    /**
     * <p>id(0x102)</p>
     */
    @ComProperty(name = "Rows", dispId = 0x102)
    Range getRows();
            
    /**
     * <p>id(0x38c)</p>
     */
    @ComMethod(name = "Scenarios", dispId = 0x38c)
    com.sun.jna.platform.win32.COM.util.IDispatch Scenarios(Object Index);
            
    /**
     * <p>id(0x599)</p>
     */
    @ComProperty(name = "ScrollArea", dispId = 0x599)
    String getScrollArea();
            
    /**
     * <p>id(0x599)</p>
     */
    @ComProperty(name = "ScrollArea", dispId = 0x599)
    void setScrollArea(String param0);
            
    /**
     * <p>id(0x33e)</p>
     */
    @ComMethod(name = "ScrollBars", dispId = 0x33e)
    com.sun.jna.platform.win32.COM.util.IDispatch ScrollBars(Object Index);
            
    /**
     * <p>id(0x31a)</p>
     */
    @ComMethod(name = "ShowAllData", dispId = 0x31a)
    void ShowAllData();
            
    /**
     * <p>id(0x199)</p>
     */
    @ComMethod(name = "ShowDataForm", dispId = 0x199)
    void ShowDataForm();
            
    /**
     * <p>id(0x346)</p>
     */
    @ComMethod(name = "Spinners", dispId = 0x346)
    com.sun.jna.platform.win32.COM.util.IDispatch Spinners(Object Index);
            
    /**
     * <p>id(0x197)</p>
     */
    @ComProperty(name = "StandardHeight", dispId = 0x197)
    Double getStandardHeight();
            
    /**
     * <p>id(0x198)</p>
     */
    @ComProperty(name = "StandardWidth", dispId = 0x198)
    Double getStandardWidth();
            
    /**
     * <p>id(0x198)</p>
     */
    @ComProperty(name = "StandardWidth", dispId = 0x198)
    void setStandardWidth(Double param0);
            
    /**
     * <p>id(0x309)</p>
     */
    @ComMethod(name = "TextBoxes", dispId = 0x309)
    com.sun.jna.platform.win32.COM.util.IDispatch TextBoxes(Object Index);
            
    /**
     * <p>id(0x192)</p>
     */
    @ComProperty(name = "TransitionFormEntry", dispId = 0x192)
    Boolean getTransitionFormEntry();
            
    /**
     * <p>id(0x192)</p>
     */
    @ComProperty(name = "TransitionFormEntry", dispId = 0x192)
    void setTransitionFormEntry(Boolean param0);
            
    /**
     * <p>id(0x6c)</p>
     */
    @ComProperty(name = "Type", dispId = 0x6c)
    XlSheetType getType();
            
    /**
     * <p>id(0x19c)</p>
     */
    @ComProperty(name = "UsedRange", dispId = 0x19c)
    Range getUsedRange();
            
    /**
     * <p>id(0x58a)</p>
     */
    @ComProperty(name = "HPageBreaks", dispId = 0x58a)
    HPageBreaks getHPageBreaks();
            
    /**
     * <p>id(0x58b)</p>
     */
    @ComProperty(name = "VPageBreaks", dispId = 0x58b)
    VPageBreaks getVPageBreaks();
            
    /**
     * <p>id(0x59a)</p>
     */
    @ComProperty(name = "QueryTables", dispId = 0x59a)
    QueryTables getQueryTables();
            
    /**
     * <p>id(0x59b)</p>
     */
    @ComProperty(name = "DisplayPageBreaks", dispId = 0x59b)
    Boolean getDisplayPageBreaks();
            
    /**
     * <p>id(0x59b)</p>
     */
    @ComProperty(name = "DisplayPageBreaks", dispId = 0x59b)
    void setDisplayPageBreaks(Boolean param0);
            
    /**
     * <p>id(0x23f)</p>
     */
    @ComProperty(name = "Comments", dispId = 0x23f)
    Comments getComments();
            
    /**
     * <p>id(0x571)</p>
     */
    @ComProperty(name = "Hyperlinks", dispId = 0x571)
    Hyperlinks getHyperlinks();
            
    /**
     * <p>id(0x59c)</p>
     */
    @ComMethod(name = "ClearCircles", dispId = 0x59c)
    void ClearCircles();
            
    /**
     * <p>id(0x59d)</p>
     */
    @ComMethod(name = "CircleInvalid", dispId = 0x59d)
    void CircleInvalid();
            
    /**
     * <p>id(0x288)</p>
     */
    @ComProperty(name = "_DisplayRightToLeft", dispId = 0x288)
    Integer get_DisplayRightToLeft();
            
    /**
     * <p>id(0x288)</p>
     */
    @ComProperty(name = "_DisplayRightToLeft", dispId = 0x288)
    void set_DisplayRightToLeft(Integer param0);
            
    /**
     * <p>id(0x319)</p>
     */
    @ComProperty(name = "AutoFilter", dispId = 0x319)
    AutoFilter getAutoFilter();
            
    /**
     * <p>id(0x6ee)</p>
     */
    @ComProperty(name = "DisplayRightToLeft", dispId = 0x6ee)
    Boolean getDisplayRightToLeft();
            
    /**
     * <p>id(0x6ee)</p>
     */
    @ComProperty(name = "DisplayRightToLeft", dispId = 0x6ee)
    void setDisplayRightToLeft(Boolean param0);
            
    /**
     * <p>id(0x718)</p>
     */
    @ComProperty(name = "Scripts", dispId = 0x718)
    eu.doppel_helix.jna.tlb.office2.Scripts getScripts();
            
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
     * <p>id(0x719)</p>
     */
    @ComMethod(name = "_CheckSpelling", dispId = 0x719)
    void _CheckSpelling(Object CustomDictionary,
            Object IgnoreUppercase,
            Object AlwaysSuggest,
            Object SpellLang,
            Object IgnoreFinalYaa,
            Object SpellScript);
            
    /**
     * <p>id(0x411)</p>
     */
    @ComProperty(name = "Tab", dispId = 0x411)
    Tab getTab();
            
    /**
     * <p>id(0x7e5)</p>
     */
    @ComProperty(name = "MailEnvelope", dispId = 0x7e5)
    eu.doppel_helix.jna.tlb.office2.MsoEnvelope getMailEnvelope();
            
    /**
     * <p>id(0x785)</p>
     */
    @ComMethod(name = "SaveAs", dispId = 0x785)
    void SaveAs(String Filename,
            Object FileFormat,
            Object Password,
            Object WriteResPassword,
            Object ReadOnlyRecommended,
            Object CreateBackup,
            Object AddToMru,
            Object TextCodepage,
            Object TextVisualLayout,
            Object Local);
            
    /**
     * <p>id(0x7ee)</p>
     */
    @ComProperty(name = "CustomProperties", dispId = 0x7ee)
    CustomProperties getCustomProperties();
            
    /**
     * <p>id(0x7e0)</p>
     */
    @ComProperty(name = "SmartTags", dispId = 0x7e0)
    SmartTags getSmartTags();
            
    /**
     * <p>id(0xb0)</p>
     */
    @ComProperty(name = "Protection", dispId = 0xb0)
    Protection getProtection();
            
    /**
     * <p>id(0x788)</p>
     */
    @ComMethod(name = "PasteSpecial", dispId = 0x788)
    void PasteSpecial(Object Format,
            Object Link,
            Object DisplayAsIcon,
            Object IconFileName,
            Object IconIndex,
            Object IconLabel,
            Object NoHTMLFormatting);
            
    /**
     * <p>id(0x7ed)</p>
     */
    @ComMethod(name = "Protect", dispId = 0x7ed)
    void Protect(Object Password,
            Object DrawingObjects,
            Object Contents,
            Object Scenarios,
            Object UserInterfaceOnly,
            Object AllowFormattingCells,
            Object AllowFormattingColumns,
            Object AllowFormattingRows,
            Object AllowInsertingColumns,
            Object AllowInsertingRows,
            Object AllowInsertingHyperlinks,
            Object AllowDeletingColumns,
            Object AllowDeletingRows,
            Object AllowSorting,
            Object AllowFiltering,
            Object AllowUsingPivotTables);
            
    /**
     * <p>id(0x8d3)</p>
     */
    @ComProperty(name = "ListObjects", dispId = 0x8d3)
    ListObjects getListObjects();
            
    /**
     * <p>id(0x8d4)</p>
     */
    @ComMethod(name = "XmlDataQuery", dispId = 0x8d4)
    Range XmlDataQuery(String XPath,
            Object SelectionNamespaces,
            Object Map);
            
    /**
     * <p>id(0x8d7)</p>
     */
    @ComMethod(name = "XmlMapQuery", dispId = 0x8d7)
    Range XmlMapQuery(String XPath,
            Object SelectionNamespaces,
            Object Map);
            
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
     * <p>id(0x9cf)</p>
     */
    @ComProperty(name = "EnableFormatConditionsCalculation", dispId = 0x9cf)
    Boolean getEnableFormatConditionsCalculation();
            
    /**
     * <p>id(0x9cf)</p>
     */
    @ComProperty(name = "EnableFormatConditionsCalculation", dispId = 0x9cf)
    void setEnableFormatConditionsCalculation(Boolean param0);
            
    /**
     * <p>id(0x370)</p>
     */
    @ComProperty(name = "Sort", dispId = 0x370)
    Sort getSort();
            
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
     * <p>id(0xb29)</p>
     */
    @ComProperty(name = "PrintedCommentPages", dispId = 0xb29)
    Integer getPrintedCommentPages();
            
    
}