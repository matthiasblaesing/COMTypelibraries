
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000208AF-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000208AF-0000-0000-C000-000000000046}")
public interface DialogSheet extends IUnknown, IRawDispatchHandle, IDispatch {
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
     * <p>id(0x1001d)</p>
     */
    @ComMethod(name = "_Dummy29", dispId = 0x1001d)
    void _Dummy29();
            
    /**
     * <p>id(0x2f8)</p>
     */
    @ComMethod(name = "Arcs", dispId = 0x2f8)
    com.sun.jna.platform.win32.COM.util.IDispatch Arcs(Object Index);
            
    /**
     * <p>id(0x1001f)</p>
     */
    @ComMethod(name = "_Dummy31", dispId = 0x1001f)
    void _Dummy31();
            
    /**
     * <p>id(0x10020)</p>
     */
    @ComMethod(name = "_Dummy32", dispId = 0x10020)
    void _Dummy32();
            
    /**
     * <p>id(0x22d)</p>
     */
    @ComMethod(name = "Buttons", dispId = 0x22d)
    com.sun.jna.platform.win32.COM.util.IDispatch Buttons(Object Index);
            
    /**
     * <p>id(0x10022)</p>
     */
    @ComMethod(name = "_Dummy34", dispId = 0x10022)
    void _Dummy34();
            
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
     * <p>id(0x10024)</p>
     */
    @ComMethod(name = "_Dummy36", dispId = 0x10024)
    void _Dummy36();
            
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
     * <p>id(0x10028)</p>
     */
    @ComMethod(name = "_Dummy40", dispId = 0x10028)
    void _Dummy40();
            
    /**
     * <p>id(0x10029)</p>
     */
    @ComMethod(name = "_Dummy41", dispId = 0x10029)
    void _Dummy41();
            
    /**
     * <p>id(0x1002a)</p>
     */
    @ComMethod(name = "_Dummy42", dispId = 0x1002a)
    void _Dummy42();
            
    /**
     * <p>id(0x1002b)</p>
     */
    @ComMethod(name = "_Dummy43", dispId = 0x1002b)
    void _Dummy43();
            
    /**
     * <p>id(0x1002c)</p>
     */
    @ComMethod(name = "_Dummy44", dispId = 0x1002c)
    void _Dummy44();
            
    /**
     * <p>id(0x1002d)</p>
     */
    @ComMethod(name = "_Dummy45", dispId = 0x1002d)
    void _Dummy45();
            
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
     * <p>id(0x10038)</p>
     */
    @ComMethod(name = "_Dummy56", dispId = 0x10038)
    void _Dummy56();
            
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
     * <p>id(0x10041)</p>
     */
    @ComMethod(name = "_Dummy65", dispId = 0x10041)
    void _Dummy65();
            
    /**
     * <p>id(0x10042)</p>
     */
    @ComMethod(name = "_Dummy66", dispId = 0x10042)
    void _Dummy66();
            
    /**
     * <p>id(0x10043)</p>
     */
    @ComMethod(name = "_Dummy67", dispId = 0x10043)
    void _Dummy67();
            
    /**
     * <p>id(0x33a)</p>
     */
    @ComMethod(name = "OptionButtons", dispId = 0x33a)
    com.sun.jna.platform.win32.COM.util.IDispatch OptionButtons(Object Index);
            
    /**
     * <p>id(0x10045)</p>
     */
    @ComMethod(name = "_Dummy69", dispId = 0x10045)
    void _Dummy69();
            
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
     * <p>id(0x1004a)</p>
     */
    @ComMethod(name = "_Dummy74", dispId = 0x1004a)
    void _Dummy74();
            
    /**
     * <p>id(0x1004b)</p>
     */
    @ComMethod(name = "_Dummy75", dispId = 0x1004b)
    void _Dummy75();
            
    /**
     * <p>id(0x1004c)</p>
     */
    @ComMethod(name = "_Dummy76", dispId = 0x1004c)
    void _Dummy76();
            
    /**
     * <p>id(0x306)</p>
     */
    @ComMethod(name = "Rectangles", dispId = 0x306)
    com.sun.jna.platform.win32.COM.util.IDispatch Rectangles(Object Index);
            
    /**
     * <p>id(0x1004e)</p>
     */
    @ComMethod(name = "_Dummy78", dispId = 0x1004e)
    void _Dummy78();
            
    /**
     * <p>id(0x1004f)</p>
     */
    @ComMethod(name = "_Dummy79", dispId = 0x1004f)
    void _Dummy79();
            
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
     * <p>id(0x10052)</p>
     */
    @ComMethod(name = "_Dummy82", dispId = 0x10052)
    void _Dummy82();
            
    /**
     * <p>id(0x10053)</p>
     */
    @ComMethod(name = "_Dummy83", dispId = 0x10053)
    void _Dummy83();
            
    /**
     * <p>id(0x346)</p>
     */
    @ComMethod(name = "Spinners", dispId = 0x346)
    com.sun.jna.platform.win32.COM.util.IDispatch Spinners(Object Index);
            
    /**
     * <p>id(0x10055)</p>
     */
    @ComMethod(name = "_Dummy85", dispId = 0x10055)
    void _Dummy85();
            
    /**
     * <p>id(0x10056)</p>
     */
    @ComMethod(name = "_Dummy86", dispId = 0x10056)
    void _Dummy86();
            
    /**
     * <p>id(0x309)</p>
     */
    @ComMethod(name = "TextBoxes", dispId = 0x309)
    com.sun.jna.platform.win32.COM.util.IDispatch TextBoxes(Object Index);
            
    /**
     * <p>id(0x10058)</p>
     */
    @ComMethod(name = "_Dummy88", dispId = 0x10058)
    void _Dummy88();
            
    /**
     * <p>id(0x10059)</p>
     */
    @ComMethod(name = "_Dummy89", dispId = 0x10059)
    void _Dummy89();
            
    /**
     * <p>id(0x1005a)</p>
     */
    @ComMethod(name = "_Dummy90", dispId = 0x1005a)
    void _Dummy90();
            
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
     * <p>id(0x10071)</p>
     */
    @ComMethod(name = "_Dummy113", dispId = 0x10071)
    void _Dummy113();
            
    /**
     * <p>id(0x10072)</p>
     */
    @ComMethod(name = "_Dummy114", dispId = 0x10072)
    void _Dummy114();
            
    /**
     * <p>id(0x10073)</p>
     */
    @ComMethod(name = "_Dummy115", dispId = 0x10073)
    void _Dummy115();
            
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
            Object PrToFileName);
            
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
            
    /**
     * <p>id(0x359)</p>
     */
    @ComProperty(name = "DefaultButton", dispId = 0x359)
    Object getDefaultButton();
            
    /**
     * <p>id(0x359)</p>
     */
    @ComProperty(name = "DefaultButton", dispId = 0x359)
    void setDefaultButton(Object param0);
            
    /**
     * <p>id(0x347)</p>
     */
    @ComProperty(name = "DialogFrame", dispId = 0x347)
    DialogFrame getDialogFrame();
            
    /**
     * <p>id(0x33c)</p>
     */
    @ComMethod(name = "EditBoxes", dispId = 0x33c)
    com.sun.jna.platform.win32.COM.util.IDispatch EditBoxes(Object Index);
            
    /**
     * <p>id(0x32e)</p>
     */
    @ComProperty(name = "Focus", dispId = 0x32e)
    Object getFocus();
            
    /**
     * <p>id(0x32e)</p>
     */
    @ComProperty(name = "Focus", dispId = 0x32e)
    void setFocus(Object param0);
            
    /**
     * <p>id(0x32d)</p>
     */
    @ComMethod(name = "Hide", dispId = 0x32d)
    Boolean Hide(Object Cancel);
            
    /**
     * <p>id(0x1f0)</p>
     */
    @ComMethod(name = "Show", dispId = 0x1f0)
    Boolean Show();
            
    
}