
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000208AF-0001-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000208AF-0001-0000-C000-000000000046}")
public interface IDialogSheet extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x94)</p>
     */
    @ComProperty(name = "Application", dispId = 0x94)
    com.sun.jna.platform.win32.WinNT.HRESULT getApplication(VARIANT RHS);
            
    /**
     * <p>id(0x95)</p>
     */
    @ComProperty(name = "Creator", dispId = 0x95)
    com.sun.jna.platform.win32.WinNT.HRESULT getCreator(VARIANT RHS);
            
    /**
     * <p>id(0x96)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x96)
    com.sun.jna.platform.win32.WinNT.HRESULT getParent(VARIANT RHS);
            
    /**
     * <p>id(0x130)</p>
     */
    @ComMethod(name = "Activate", dispId = 0x130)
    com.sun.jna.platform.win32.WinNT.HRESULT Activate(Integer lcid);
            
    /**
     * <p>id(0x227)</p>
     */
    @ComMethod(name = "Copy", dispId = 0x227)
    com.sun.jna.platform.win32.WinNT.HRESULT Copy(Object Before,
            Object After,
            Integer lcid);
            
    /**
     * <p>id(0x75)</p>
     */
    @ComMethod(name = "Delete", dispId = 0x75)
    com.sun.jna.platform.win32.WinNT.HRESULT Delete(Integer lcid);
            
    /**
     * <p>id(0x55d)</p>
     */
    @ComProperty(name = "CodeName", dispId = 0x55d)
    com.sun.jna.platform.win32.WinNT.HRESULT getCodeName(VARIANT RHS);
            
    /**
     * <p>id(0x80010000)</p>
     */
    @ComProperty(name = "_CodeName", dispId = 0x80010000)
    com.sun.jna.platform.win32.WinNT.HRESULT get_CodeName(VARIANT RHS);
            
    /**
     * <p>id(0x80010000)</p>
     */
    @ComProperty(name = "_CodeName", dispId = 0x80010000)
    com.sun.jna.platform.win32.WinNT.HRESULT set_CodeName(String RHS);
            
    /**
     * <p>id(0x1e6)</p>
     */
    @ComProperty(name = "Index", dispId = 0x1e6)
    com.sun.jna.platform.win32.WinNT.HRESULT getIndex(Integer lcid,
            VARIANT RHS);
            
    /**
     * <p>id(0x27d)</p>
     */
    @ComMethod(name = "Move", dispId = 0x27d)
    com.sun.jna.platform.win32.WinNT.HRESULT Move(Object Before,
            Object After,
            Integer lcid);
            
    /**
     * <p>id(0x6e)</p>
     */
    @ComProperty(name = "Name", dispId = 0x6e)
    com.sun.jna.platform.win32.WinNT.HRESULT getName(VARIANT RHS);
            
    /**
     * <p>id(0x6e)</p>
     */
    @ComProperty(name = "Name", dispId = 0x6e)
    com.sun.jna.platform.win32.WinNT.HRESULT setName(String RHS);
            
    /**
     * <p>id(0x1f6)</p>
     */
    @ComProperty(name = "Next", dispId = 0x1f6)
    com.sun.jna.platform.win32.WinNT.HRESULT getNext(VARIANT RHS);
            
    /**
     * <p>id(0x274)</p>
     */
    @ComProperty(name = "OnDoubleClick", dispId = 0x274)
    com.sun.jna.platform.win32.WinNT.HRESULT getOnDoubleClick(Integer lcid,
            VARIANT RHS);
            
    /**
     * <p>id(0x274)</p>
     */
    @ComProperty(name = "OnDoubleClick", dispId = 0x274)
    com.sun.jna.platform.win32.WinNT.HRESULT setOnDoubleClick(Integer lcid,
            String RHS);
            
    /**
     * <p>id(0x407)</p>
     */
    @ComProperty(name = "OnSheetActivate", dispId = 0x407)
    com.sun.jna.platform.win32.WinNT.HRESULT getOnSheetActivate(Integer lcid,
            VARIANT RHS);
            
    /**
     * <p>id(0x407)</p>
     */
    @ComProperty(name = "OnSheetActivate", dispId = 0x407)
    com.sun.jna.platform.win32.WinNT.HRESULT setOnSheetActivate(Integer lcid,
            String RHS);
            
    /**
     * <p>id(0x439)</p>
     */
    @ComProperty(name = "OnSheetDeactivate", dispId = 0x439)
    com.sun.jna.platform.win32.WinNT.HRESULT getOnSheetDeactivate(Integer lcid,
            VARIANT RHS);
            
    /**
     * <p>id(0x439)</p>
     */
    @ComProperty(name = "OnSheetDeactivate", dispId = 0x439)
    com.sun.jna.platform.win32.WinNT.HRESULT setOnSheetDeactivate(Integer lcid,
            String RHS);
            
    /**
     * <p>id(0x3e6)</p>
     */
    @ComProperty(name = "PageSetup", dispId = 0x3e6)
    com.sun.jna.platform.win32.WinNT.HRESULT getPageSetup(VARIANT RHS);
            
    /**
     * <p>id(0x1f7)</p>
     */
    @ComProperty(name = "Previous", dispId = 0x1f7)
    com.sun.jna.platform.win32.WinNT.HRESULT getPrevious(VARIANT RHS);
            
    /**
     * <p>id(0x389)</p>
     */
    @ComMethod(name = "__PrintOut", dispId = 0x389)
    com.sun.jna.platform.win32.WinNT.HRESULT __PrintOut(Object From,
            Object To,
            Object Copies,
            Object Preview,
            Object ActivePrinter,
            Object PrintToFile,
            Object Collate,
            Integer lcid);
            
    /**
     * <p>id(0x119)</p>
     */
    @ComMethod(name = "PrintPreview", dispId = 0x119)
    com.sun.jna.platform.win32.WinNT.HRESULT PrintPreview(Object EnableChanges,
            Integer lcid);
            
    /**
     * <p>id(0x11a)</p>
     */
    @ComMethod(name = "_Protect", dispId = 0x11a)
    com.sun.jna.platform.win32.WinNT.HRESULT _Protect(Object Password,
            Object DrawingObjects,
            Object Contents,
            Object Scenarios,
            Object UserInterfaceOnly,
            Integer lcid);
            
    /**
     * <p>id(0x124)</p>
     */
    @ComProperty(name = "ProtectContents", dispId = 0x124)
    com.sun.jna.platform.win32.WinNT.HRESULT getProtectContents(Integer lcid,
            VARIANT RHS);
            
    /**
     * <p>id(0x125)</p>
     */
    @ComProperty(name = "ProtectDrawingObjects", dispId = 0x125)
    com.sun.jna.platform.win32.WinNT.HRESULT getProtectDrawingObjects(Integer lcid,
            VARIANT RHS);
            
    /**
     * <p>id(0x487)</p>
     */
    @ComProperty(name = "ProtectionMode", dispId = 0x487)
    com.sun.jna.platform.win32.WinNT.HRESULT getProtectionMode(Integer lcid,
            VARIANT RHS);
            
    /**
     * <p>id(0x126)</p>
     */
    @ComProperty(name = "ProtectScenarios", dispId = 0x126)
    com.sun.jna.platform.win32.WinNT.HRESULT getProtectScenarios(Integer lcid,
            VARIANT RHS);
            
    /**
     * <p>id(0x11c)</p>
     */
    @ComMethod(name = "_SaveAs", dispId = 0x11c)
    com.sun.jna.platform.win32.WinNT.HRESULT _SaveAs(String Filename,
            Object FileFormat,
            Object Password,
            Object WriteResPassword,
            Object ReadOnlyRecommended,
            Object CreateBackup,
            Object AddToMru,
            Object TextCodepage,
            Object TextVisualLayout,
            Integer lcid);
            
    /**
     * <p>id(0xeb)</p>
     */
    @ComMethod(name = "Select", dispId = 0xeb)
    com.sun.jna.platform.win32.WinNT.HRESULT Select(Object Replace,
            Integer lcid);
            
    /**
     * <p>id(0x11d)</p>
     */
    @ComMethod(name = "Unprotect", dispId = 0x11d)
    com.sun.jna.platform.win32.WinNT.HRESULT Unprotect(Object Password,
            Integer lcid);
            
    /**
     * <p>id(0x22e)</p>
     */
    @ComProperty(name = "Visible", dispId = 0x22e)
    com.sun.jna.platform.win32.WinNT.HRESULT getVisible(Integer lcid,
            VARIANT RHS);
            
    /**
     * <p>id(0x22e)</p>
     */
    @ComProperty(name = "Visible", dispId = 0x22e)
    com.sun.jna.platform.win32.WinNT.HRESULT setVisible(Integer lcid,
            XlSheetVisibility RHS);
            
    /**
     * <p>id(0x561)</p>
     */
    @ComProperty(name = "Shapes", dispId = 0x561)
    com.sun.jna.platform.win32.WinNT.HRESULT getShapes(VARIANT RHS);
            
    /**
     * <p>id(0x1001d)</p>
     */
    @ComMethod(name = "_Dummy29", dispId = 0x1001d)
    void _Dummy29();
            
    /**
     * <p>id(0x2f8)</p>
     */
    @ComMethod(name = "Arcs", dispId = 0x2f8)
    com.sun.jna.platform.win32.WinNT.HRESULT Arcs(Object Index,
            Integer lcid,
            VARIANT RHS);
            
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
    com.sun.jna.platform.win32.WinNT.HRESULT Buttons(Object Index,
            Integer lcid,
            VARIANT RHS);
            
    /**
     * <p>id(0x10022)</p>
     */
    @ComMethod(name = "_Dummy34", dispId = 0x10022)
    void _Dummy34();
            
    /**
     * <p>id(0x590)</p>
     */
    @ComProperty(name = "EnableCalculation", dispId = 0x590)
    com.sun.jna.platform.win32.WinNT.HRESULT getEnableCalculation(VARIANT RHS);
            
    /**
     * <p>id(0x590)</p>
     */
    @ComProperty(name = "EnableCalculation", dispId = 0x590)
    com.sun.jna.platform.win32.WinNT.HRESULT setEnableCalculation(Boolean RHS);
            
    /**
     * <p>id(0x10024)</p>
     */
    @ComMethod(name = "_Dummy36", dispId = 0x10024)
    void _Dummy36();
            
    /**
     * <p>id(0x424)</p>
     */
    @ComMethod(name = "ChartObjects", dispId = 0x424)
    com.sun.jna.platform.win32.WinNT.HRESULT ChartObjects(Object Index,
            Integer lcid,
            VARIANT RHS);
            
    /**
     * <p>id(0x338)</p>
     */
    @ComMethod(name = "CheckBoxes", dispId = 0x338)
    com.sun.jna.platform.win32.WinNT.HRESULT CheckBoxes(Object Index,
            Integer lcid,
            VARIANT RHS);
            
    /**
     * <p>id(0x1f9)</p>
     */
    @ComMethod(name = "CheckSpelling", dispId = 0x1f9)
    com.sun.jna.platform.win32.WinNT.HRESULT CheckSpelling(Object CustomDictionary,
            Object IgnoreUppercase,
            Object AlwaysSuggest,
            Object SpellLang,
            Integer lcid);
            
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
    com.sun.jna.platform.win32.WinNT.HRESULT getDisplayAutomaticPageBreaks(Integer lcid,
            VARIANT RHS);
            
    /**
     * <p>id(0x283)</p>
     */
    @ComProperty(name = "DisplayAutomaticPageBreaks", dispId = 0x283)
    com.sun.jna.platform.win32.WinNT.HRESULT setDisplayAutomaticPageBreaks(Integer lcid,
            Boolean RHS);
            
    /**
     * <p>id(0x304)</p>
     */
    @ComMethod(name = "Drawings", dispId = 0x304)
    com.sun.jna.platform.win32.WinNT.HRESULT Drawings(Object Index,
            Integer lcid,
            VARIANT RHS);
            
    /**
     * <p>id(0x58)</p>
     */
    @ComMethod(name = "DrawingObjects", dispId = 0x58)
    com.sun.jna.platform.win32.WinNT.HRESULT DrawingObjects(Object Index,
            Integer lcid,
            VARIANT RHS);
            
    /**
     * <p>id(0x344)</p>
     */
    @ComMethod(name = "DropDowns", dispId = 0x344)
    com.sun.jna.platform.win32.WinNT.HRESULT DropDowns(Object Index,
            Integer lcid,
            VARIANT RHS);
            
    /**
     * <p>id(0x484)</p>
     */
    @ComProperty(name = "EnableAutoFilter", dispId = 0x484)
    com.sun.jna.platform.win32.WinNT.HRESULT getEnableAutoFilter(Integer lcid,
            VARIANT RHS);
            
    /**
     * <p>id(0x484)</p>
     */
    @ComProperty(name = "EnableAutoFilter", dispId = 0x484)
    com.sun.jna.platform.win32.WinNT.HRESULT setEnableAutoFilter(Integer lcid,
            Boolean RHS);
            
    /**
     * <p>id(0x591)</p>
     */
    @ComProperty(name = "EnableSelection", dispId = 0x591)
    com.sun.jna.platform.win32.WinNT.HRESULT getEnableSelection(VARIANT RHS);
            
    /**
     * <p>id(0x591)</p>
     */
    @ComProperty(name = "EnableSelection", dispId = 0x591)
    com.sun.jna.platform.win32.WinNT.HRESULT setEnableSelection(XlEnableSelection RHS);
            
    /**
     * <p>id(0x485)</p>
     */
    @ComProperty(name = "EnableOutlining", dispId = 0x485)
    com.sun.jna.platform.win32.WinNT.HRESULT getEnableOutlining(Integer lcid,
            VARIANT RHS);
            
    /**
     * <p>id(0x485)</p>
     */
    @ComProperty(name = "EnableOutlining", dispId = 0x485)
    com.sun.jna.platform.win32.WinNT.HRESULT setEnableOutlining(Integer lcid,
            Boolean RHS);
            
    /**
     * <p>id(0x486)</p>
     */
    @ComProperty(name = "EnablePivotTable", dispId = 0x486)
    com.sun.jna.platform.win32.WinNT.HRESULT getEnablePivotTable(Integer lcid,
            VARIANT RHS);
            
    /**
     * <p>id(0x486)</p>
     */
    @ComProperty(name = "EnablePivotTable", dispId = 0x486)
    com.sun.jna.platform.win32.WinNT.HRESULT setEnablePivotTable(Integer lcid,
            Boolean RHS);
            
    /**
     * <p>id(0x1)</p>
     */
    @ComMethod(name = "Evaluate", dispId = 0x1)
    com.sun.jna.platform.win32.WinNT.HRESULT Evaluate(Object Name,
            Integer lcid,
            VARIANT RHS);
            
    /**
     * <p>id(0xfffffffb)</p>
     */
    @ComMethod(name = "_Evaluate", dispId = 0xfffffffb)
    com.sun.jna.platform.win32.WinNT.HRESULT _Evaluate(Object Name,
            Integer lcid,
            VARIANT RHS);
            
    /**
     * <p>id(0x10038)</p>
     */
    @ComMethod(name = "_Dummy56", dispId = 0x10038)
    void _Dummy56();
            
    /**
     * <p>id(0x592)</p>
     */
    @ComMethod(name = "ResetAllPageBreaks", dispId = 0x592)
    com.sun.jna.platform.win32.WinNT.HRESULT ResetAllPageBreaks();
            
    /**
     * <p>id(0x342)</p>
     */
    @ComMethod(name = "GroupBoxes", dispId = 0x342)
    com.sun.jna.platform.win32.WinNT.HRESULT GroupBoxes(Object Index,
            Integer lcid,
            VARIANT RHS);
            
    /**
     * <p>id(0x459)</p>
     */
    @ComMethod(name = "GroupObjects", dispId = 0x459)
    com.sun.jna.platform.win32.WinNT.HRESULT GroupObjects(Object Index,
            Integer lcid,
            VARIANT RHS);
            
    /**
     * <p>id(0x349)</p>
     */
    @ComMethod(name = "Labels", dispId = 0x349)
    com.sun.jna.platform.win32.WinNT.HRESULT Labels(Object Index,
            Integer lcid,
            VARIANT RHS);
            
    /**
     * <p>id(0x2ff)</p>
     */
    @ComMethod(name = "Lines", dispId = 0x2ff)
    com.sun.jna.platform.win32.WinNT.HRESULT Lines(Object Index,
            Integer lcid,
            VARIANT RHS);
            
    /**
     * <p>id(0x340)</p>
     */
    @ComMethod(name = "ListBoxes", dispId = 0x340)
    com.sun.jna.platform.win32.WinNT.HRESULT ListBoxes(Object Index,
            Integer lcid,
            VARIANT RHS);
            
    /**
     * <p>id(0x1ba)</p>
     */
    @ComProperty(name = "Names", dispId = 0x1ba)
    com.sun.jna.platform.win32.WinNT.HRESULT getNames(VARIANT RHS);
            
    /**
     * <p>id(0x31f)</p>
     */
    @ComMethod(name = "OLEObjects", dispId = 0x31f)
    com.sun.jna.platform.win32.WinNT.HRESULT OLEObjects(Object Index,
            Integer lcid,
            VARIANT RHS);
            
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
    com.sun.jna.platform.win32.WinNT.HRESULT OptionButtons(Object Index,
            Integer lcid,
            VARIANT RHS);
            
    /**
     * <p>id(0x10045)</p>
     */
    @ComMethod(name = "_Dummy69", dispId = 0x10045)
    void _Dummy69();
            
    /**
     * <p>id(0x321)</p>
     */
    @ComMethod(name = "Ovals", dispId = 0x321)
    com.sun.jna.platform.win32.WinNT.HRESULT Ovals(Object Index,
            Integer lcid,
            VARIANT RHS);
            
    /**
     * <p>id(0xd3)</p>
     */
    @ComMethod(name = "Paste", dispId = 0xd3)
    com.sun.jna.platform.win32.WinNT.HRESULT Paste(Object Destination,
            Object Link,
            Integer lcid);
            
    /**
     * <p>id(0x403)</p>
     */
    @ComMethod(name = "_PasteSpecial", dispId = 0x403)
    com.sun.jna.platform.win32.WinNT.HRESULT _PasteSpecial(Object Format,
            Object Link,
            Object DisplayAsIcon,
            Object IconFileName,
            Object IconIndex,
            Object IconLabel,
            Integer lcid);
            
    /**
     * <p>id(0x303)</p>
     */
    @ComMethod(name = "Pictures", dispId = 0x303)
    com.sun.jna.platform.win32.WinNT.HRESULT Pictures(Object Index,
            Integer lcid,
            VARIANT RHS);
            
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
    com.sun.jna.platform.win32.WinNT.HRESULT Rectangles(Object Index,
            Integer lcid,
            VARIANT RHS);
            
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
    com.sun.jna.platform.win32.WinNT.HRESULT getScrollArea(VARIANT RHS);
            
    /**
     * <p>id(0x599)</p>
     */
    @ComProperty(name = "ScrollArea", dispId = 0x599)
    com.sun.jna.platform.win32.WinNT.HRESULT setScrollArea(String RHS);
            
    /**
     * <p>id(0x33e)</p>
     */
    @ComMethod(name = "ScrollBars", dispId = 0x33e)
    com.sun.jna.platform.win32.WinNT.HRESULT ScrollBars(Object Index,
            Integer lcid,
            VARIANT RHS);
            
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
    com.sun.jna.platform.win32.WinNT.HRESULT Spinners(Object Index,
            Integer lcid,
            VARIANT RHS);
            
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
    com.sun.jna.platform.win32.WinNT.HRESULT TextBoxes(Object Index,
            Integer lcid,
            VARIANT RHS);
            
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
    com.sun.jna.platform.win32.WinNT.HRESULT getHPageBreaks(VARIANT RHS);
            
    /**
     * <p>id(0x58b)</p>
     */
    @ComProperty(name = "VPageBreaks", dispId = 0x58b)
    com.sun.jna.platform.win32.WinNT.HRESULT getVPageBreaks(VARIANT RHS);
            
    /**
     * <p>id(0x59a)</p>
     */
    @ComProperty(name = "QueryTables", dispId = 0x59a)
    com.sun.jna.platform.win32.WinNT.HRESULT getQueryTables(VARIANT RHS);
            
    /**
     * <p>id(0x59b)</p>
     */
    @ComProperty(name = "DisplayPageBreaks", dispId = 0x59b)
    com.sun.jna.platform.win32.WinNT.HRESULT getDisplayPageBreaks(VARIANT RHS);
            
    /**
     * <p>id(0x59b)</p>
     */
    @ComProperty(name = "DisplayPageBreaks", dispId = 0x59b)
    com.sun.jna.platform.win32.WinNT.HRESULT setDisplayPageBreaks(Boolean RHS);
            
    /**
     * <p>id(0x23f)</p>
     */
    @ComProperty(name = "Comments", dispId = 0x23f)
    com.sun.jna.platform.win32.WinNT.HRESULT getComments(VARIANT RHS);
            
    /**
     * <p>id(0x571)</p>
     */
    @ComProperty(name = "Hyperlinks", dispId = 0x571)
    com.sun.jna.platform.win32.WinNT.HRESULT getHyperlinks(VARIANT RHS);
            
    /**
     * <p>id(0x59c)</p>
     */
    @ComMethod(name = "ClearCircles", dispId = 0x59c)
    com.sun.jna.platform.win32.WinNT.HRESULT ClearCircles();
            
    /**
     * <p>id(0x59d)</p>
     */
    @ComMethod(name = "CircleInvalid", dispId = 0x59d)
    com.sun.jna.platform.win32.WinNT.HRESULT CircleInvalid();
            
    /**
     * <p>id(0x288)</p>
     */
    @ComProperty(name = "_DisplayRightToLeft", dispId = 0x288)
    com.sun.jna.platform.win32.WinNT.HRESULT get_DisplayRightToLeft(Integer lcid,
            VARIANT RHS);
            
    /**
     * <p>id(0x288)</p>
     */
    @ComProperty(name = "_DisplayRightToLeft", dispId = 0x288)
    com.sun.jna.platform.win32.WinNT.HRESULT set_DisplayRightToLeft(Integer lcid,
            Integer RHS);
            
    /**
     * <p>id(0x319)</p>
     */
    @ComProperty(name = "AutoFilter", dispId = 0x319)
    com.sun.jna.platform.win32.WinNT.HRESULT getAutoFilter(VARIANT RHS);
            
    /**
     * <p>id(0x6ee)</p>
     */
    @ComProperty(name = "DisplayRightToLeft", dispId = 0x6ee)
    com.sun.jna.platform.win32.WinNT.HRESULT getDisplayRightToLeft(Integer lcid,
            VARIANT RHS);
            
    /**
     * <p>id(0x6ee)</p>
     */
    @ComProperty(name = "DisplayRightToLeft", dispId = 0x6ee)
    com.sun.jna.platform.win32.WinNT.HRESULT setDisplayRightToLeft(Integer lcid,
            Boolean RHS);
            
    /**
     * <p>id(0x718)</p>
     */
    @ComProperty(name = "Scripts", dispId = 0x718)
    com.sun.jna.platform.win32.WinNT.HRESULT getScripts(VARIANT RHS);
            
    /**
     * <p>id(0x6ec)</p>
     */
    @ComMethod(name = "_PrintOut", dispId = 0x6ec)
    com.sun.jna.platform.win32.WinNT.HRESULT _PrintOut(Object From,
            Object To,
            Object Copies,
            Object Preview,
            Object ActivePrinter,
            Object PrintToFile,
            Object Collate,
            Object PrToFileName,
            Integer lcid);
            
    /**
     * <p>id(0x719)</p>
     */
    @ComMethod(name = "_CheckSpelling", dispId = 0x719)
    com.sun.jna.platform.win32.WinNT.HRESULT _CheckSpelling(Object CustomDictionary,
            Object IgnoreUppercase,
            Object AlwaysSuggest,
            Object SpellLang,
            Object IgnoreFinalYaa,
            Object SpellScript,
            Integer lcid);
            
    /**
     * <p>id(0x411)</p>
     */
    @ComProperty(name = "Tab", dispId = 0x411)
    com.sun.jna.platform.win32.WinNT.HRESULT getTab(VARIANT RHS);
            
    /**
     * <p>id(0x7e5)</p>
     */
    @ComProperty(name = "MailEnvelope", dispId = 0x7e5)
    com.sun.jna.platform.win32.WinNT.HRESULT getMailEnvelope(VARIANT RHS);
            
    /**
     * <p>id(0x785)</p>
     */
    @ComMethod(name = "SaveAs", dispId = 0x785)
    com.sun.jna.platform.win32.WinNT.HRESULT SaveAs(String Filename,
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
    com.sun.jna.platform.win32.WinNT.HRESULT getCustomProperties(VARIANT RHS);
            
    /**
     * <p>id(0x7e0)</p>
     */
    @ComProperty(name = "SmartTags", dispId = 0x7e0)
    com.sun.jna.platform.win32.WinNT.HRESULT getSmartTags(VARIANT RHS);
            
    /**
     * <p>id(0xb0)</p>
     */
    @ComProperty(name = "Protection", dispId = 0xb0)
    com.sun.jna.platform.win32.WinNT.HRESULT getProtection(VARIANT RHS);
            
    /**
     * <p>id(0x788)</p>
     */
    @ComMethod(name = "PasteSpecial", dispId = 0x788)
    com.sun.jna.platform.win32.WinNT.HRESULT PasteSpecial(Object Format,
            Object Link,
            Object DisplayAsIcon,
            Object IconFileName,
            Object IconIndex,
            Object IconLabel,
            Object NoHTMLFormatting,
            Integer lcid);
            
    /**
     * <p>id(0x7ed)</p>
     */
    @ComMethod(name = "Protect", dispId = 0x7ed)
    com.sun.jna.platform.win32.WinNT.HRESULT Protect(Object Password,
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
    com.sun.jna.platform.win32.WinNT.HRESULT PrintOut(Object From,
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
    com.sun.jna.platform.win32.WinNT.HRESULT getEnableFormatConditionsCalculation(VARIANT RHS);
            
    /**
     * <p>id(0x9cf)</p>
     */
    @ComProperty(name = "EnableFormatConditionsCalculation", dispId = 0x9cf)
    com.sun.jna.platform.win32.WinNT.HRESULT setEnableFormatConditionsCalculation(Boolean RHS);
            
    /**
     * <p>id(0x370)</p>
     */
    @ComProperty(name = "Sort", dispId = 0x370)
    com.sun.jna.platform.win32.WinNT.HRESULT getSort(VARIANT RHS);
            
    /**
     * <p>id(0x9bd)</p>
     */
    @ComMethod(name = "ExportAsFixedFormat", dispId = 0x9bd)
    com.sun.jna.platform.win32.WinNT.HRESULT ExportAsFixedFormat(XlFixedFormatType Type,
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
    com.sun.jna.platform.win32.WinNT.HRESULT getPrintedCommentPages(VARIANT RHS);
            
    /**
     * <p>id(0x359)</p>
     */
    @ComProperty(name = "DefaultButton", dispId = 0x359)
    com.sun.jna.platform.win32.WinNT.HRESULT getDefaultButton(VARIANT RHS);
            
    /**
     * <p>id(0x359)</p>
     */
    @ComProperty(name = "DefaultButton", dispId = 0x359)
    com.sun.jna.platform.win32.WinNT.HRESULT setDefaultButton(Object RHS);
            
    /**
     * <p>id(0x347)</p>
     */
    @ComProperty(name = "DialogFrame", dispId = 0x347)
    com.sun.jna.platform.win32.WinNT.HRESULT getDialogFrame(VARIANT RHS);
            
    /**
     * <p>id(0x33c)</p>
     */
    @ComMethod(name = "EditBoxes", dispId = 0x33c)
    com.sun.jna.platform.win32.WinNT.HRESULT EditBoxes(Object Index,
            VARIANT RHS);
            
    /**
     * <p>id(0x32e)</p>
     */
    @ComProperty(name = "Focus", dispId = 0x32e)
    com.sun.jna.platform.win32.WinNT.HRESULT getFocus(VARIANT RHS);
            
    /**
     * <p>id(0x32e)</p>
     */
    @ComProperty(name = "Focus", dispId = 0x32e)
    com.sun.jna.platform.win32.WinNT.HRESULT setFocus(Object RHS);
            
    /**
     * <p>id(0x32d)</p>
     */
    @ComMethod(name = "Hide", dispId = 0x32d)
    com.sun.jna.platform.win32.WinNT.HRESULT Hide(Object Cancel,
            VARIANT RHS);
            
    /**
     * <p>id(0x1f0)</p>
     */
    @ComMethod(name = "Show", dispId = 0x1f0)
    com.sun.jna.platform.win32.WinNT.HRESULT Show(VARIANT RHS);
            
    
}