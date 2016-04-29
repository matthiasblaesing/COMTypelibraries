
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000208D9-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000208D9-0000-0000-C000-000000000046}")
public interface _Global {
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
    Application getParent();
            
    /**
     * <p>id(0x131)</p>
     */
    @ComProperty(name = "ActiveCell", dispId = 0x131)
    Range getActiveCell();
            
    /**
     * <p>id(0xb7)</p>
     */
    @ComProperty(name = "ActiveChart", dispId = 0xb7)
    Chart getActiveChart();
            
    /**
     * <p>id(0x32f)</p>
     */
    @ComProperty(name = "ActiveDialog", dispId = 0x32f)
    DialogSheet getActiveDialog();
            
    /**
     * <p>id(0x2f6)</p>
     */
    @ComProperty(name = "ActiveMenuBar", dispId = 0x2f6)
    MenuBar getActiveMenuBar();
            
    /**
     * <p>id(0x132)</p>
     */
    @ComProperty(name = "ActivePrinter", dispId = 0x132)
    String getActivePrinter();
            
    /**
     * <p>id(0x132)</p>
     */
    @ComProperty(name = "ActivePrinter", dispId = 0x132)
    void setActivePrinter(String param0);
            
    /**
     * <p>id(0x133)</p>
     */
    @ComProperty(name = "ActiveSheet", dispId = 0x133)
    com.sun.jna.platform.win32.COM.util.IDispatch getActiveSheet();
            
    /**
     * <p>id(0x2f7)</p>
     */
    @ComProperty(name = "ActiveWindow", dispId = 0x2f7)
    Window getActiveWindow();
            
    /**
     * <p>id(0x134)</p>
     */
    @ComProperty(name = "ActiveWorkbook", dispId = 0x134)
    Workbook getActiveWorkbook();
            
    /**
     * <p>id(0x225)</p>
     */
    @ComProperty(name = "AddIns", dispId = 0x225)
    AddIns getAddIns();
            
    /**
     * <p>id(0x59e)</p>
     */
    @ComProperty(name = "Assistant", dispId = 0x59e)
    eu.doppel_helix.jna.tlb.office2.Assistant getAssistant();
            
    /**
     * <p>id(0x117)</p>
     */
    @ComMethod(name = "Calculate", dispId = 0x117)
    void Calculate();
            
    /**
     * <p>id(0xee)</p>
     */
    @ComProperty(name = "Cells", dispId = 0xee)
    Range getCells();
            
    /**
     * <p>id(0x79)</p>
     */
    @ComProperty(name = "Charts", dispId = 0x79)
    Sheets getCharts();
            
    /**
     * <p>id(0xf1)</p>
     */
    @ComProperty(name = "Columns", dispId = 0xf1)
    Range getColumns();
            
    /**
     * <p>id(0x59f)</p>
     */
    @ComProperty(name = "CommandBars", dispId = 0x59f)
    eu.doppel_helix.jna.tlb.office2.CommandBars getCommandBars();
            
    /**
     * <p>id(0x14c)</p>
     */
    @ComProperty(name = "DDEAppReturnCode", dispId = 0x14c)
    Integer getDDEAppReturnCode();
            
    /**
     * <p>id(0x14d)</p>
     */
    @ComMethod(name = "DDEExecute", dispId = 0x14d)
    void DDEExecute(Integer Channel,
            String String);
            
    /**
     * <p>id(0x14e)</p>
     */
    @ComMethod(name = "DDEInitiate", dispId = 0x14e)
    Integer DDEInitiate(String App,
            String Topic);
            
    /**
     * <p>id(0x14f)</p>
     */
    @ComMethod(name = "DDEPoke", dispId = 0x14f)
    void DDEPoke(Integer Channel,
            Object Item,
            Object Data);
            
    /**
     * <p>id(0x150)</p>
     */
    @ComMethod(name = "DDERequest", dispId = 0x150)
    Object DDERequest(Integer Channel,
            String Item);
            
    /**
     * <p>id(0x151)</p>
     */
    @ComMethod(name = "DDETerminate", dispId = 0x151)
    void DDETerminate(Integer Channel);
            
    /**
     * <p>id(0x2fc)</p>
     */
    @ComProperty(name = "DialogSheets", dispId = 0x2fc)
    Sheets getDialogSheets();
            
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
     * <p>id(0x15e)</p>
     */
    @ComMethod(name = "ExecuteExcel4Macro", dispId = 0x15e)
    Object ExecuteExcel4Macro(String String);
            
    /**
     * <p>id(0x2fe)</p>
     */
    @ComMethod(name = "Intersect", dispId = 0x2fe)
    Range Intersect(Range Arg1,
            Range Arg2,
            Object Arg3,
            Object Arg4,
            Object Arg5,
            Object Arg6,
            Object Arg7,
            Object Arg8,
            Object Arg9,
            Object Arg10,
            Object Arg11,
            Object Arg12,
            Object Arg13,
            Object Arg14,
            Object Arg15,
            Object Arg16,
            Object Arg17,
            Object Arg18,
            Object Arg19,
            Object Arg20,
            Object Arg21,
            Object Arg22,
            Object Arg23,
            Object Arg24,
            Object Arg25,
            Object Arg26,
            Object Arg27,
            Object Arg28,
            Object Arg29,
            Object Arg30);
            
    /**
     * <p>id(0x24d)</p>
     */
    @ComProperty(name = "MenuBars", dispId = 0x24d)
    MenuBars getMenuBars();
            
    /**
     * <p>id(0x246)</p>
     */
    @ComProperty(name = "Modules", dispId = 0x246)
    Modules getModules();
            
    /**
     * <p>id(0x1ba)</p>
     */
    @ComProperty(name = "Names", dispId = 0x1ba)
    Names getNames();
            
    /**
     * <p>id(0xc5)</p>
     */
    @ComProperty(name = "Range", dispId = 0xc5)
    Range getRange(Object Cell1,
            Object Cell2);
            
    /**
     * <p>id(0x102)</p>
     */
    @ComProperty(name = "Rows", dispId = 0x102)
    Range getRows();
            
    /**
     * <p>id(0x103)</p>
     */
    @ComMethod(name = "Run", dispId = 0x103)
    Object Run(Object Macro,
            Object Arg1,
            Object Arg2,
            Object Arg3,
            Object Arg4,
            Object Arg5,
            Object Arg6,
            Object Arg7,
            Object Arg8,
            Object Arg9,
            Object Arg10,
            Object Arg11,
            Object Arg12,
            Object Arg13,
            Object Arg14,
            Object Arg15,
            Object Arg16,
            Object Arg17,
            Object Arg18,
            Object Arg19,
            Object Arg20,
            Object Arg21,
            Object Arg22,
            Object Arg23,
            Object Arg24,
            Object Arg25,
            Object Arg26,
            Object Arg27,
            Object Arg28,
            Object Arg29,
            Object Arg30);
            
    /**
     * <p>id(0x326)</p>
     */
    @ComMethod(name = "_Run2", dispId = 0x326)
    Object _Run2(Object Macro,
            Object Arg1,
            Object Arg2,
            Object Arg3,
            Object Arg4,
            Object Arg5,
            Object Arg6,
            Object Arg7,
            Object Arg8,
            Object Arg9,
            Object Arg10,
            Object Arg11,
            Object Arg12,
            Object Arg13,
            Object Arg14,
            Object Arg15,
            Object Arg16,
            Object Arg17,
            Object Arg18,
            Object Arg19,
            Object Arg20,
            Object Arg21,
            Object Arg22,
            Object Arg23,
            Object Arg24,
            Object Arg25,
            Object Arg26,
            Object Arg27,
            Object Arg28,
            Object Arg29,
            Object Arg30);
            
    /**
     * <p>id(0x93)</p>
     */
    @ComProperty(name = "Selection", dispId = 0x93)
    com.sun.jna.platform.win32.COM.util.IDispatch getSelection();
            
    /**
     * <p>id(0x17f)</p>
     */
    @ComMethod(name = "SendKeys", dispId = 0x17f)
    void SendKeys(Object Keys,
            Object Wait);
            
    /**
     * <p>id(0x1e5)</p>
     */
    @ComProperty(name = "Sheets", dispId = 0x1e5)
    Sheets getSheets();
            
    /**
     * <p>id(0x308)</p>
     */
    @ComProperty(name = "ShortcutMenus", dispId = 0x308)
    Menu getShortcutMenus(Integer Index);
            
    /**
     * <p>id(0x30a)</p>
     */
    @ComProperty(name = "ThisWorkbook", dispId = 0x30a)
    Workbook getThisWorkbook();
            
    /**
     * <p>id(0x228)</p>
     */
    @ComProperty(name = "Toolbars", dispId = 0x228)
    Toolbars getToolbars();
            
    /**
     * <p>id(0x30b)</p>
     */
    @ComMethod(name = "Union", dispId = 0x30b)
    Range Union(Range Arg1,
            Range Arg2,
            Object Arg3,
            Object Arg4,
            Object Arg5,
            Object Arg6,
            Object Arg7,
            Object Arg8,
            Object Arg9,
            Object Arg10,
            Object Arg11,
            Object Arg12,
            Object Arg13,
            Object Arg14,
            Object Arg15,
            Object Arg16,
            Object Arg17,
            Object Arg18,
            Object Arg19,
            Object Arg20,
            Object Arg21,
            Object Arg22,
            Object Arg23,
            Object Arg24,
            Object Arg25,
            Object Arg26,
            Object Arg27,
            Object Arg28,
            Object Arg29,
            Object Arg30);
            
    /**
     * <p>id(0x1ae)</p>
     */
    @ComProperty(name = "Windows", dispId = 0x1ae)
    Windows getWindows();
            
    /**
     * <p>id(0x23c)</p>
     */
    @ComProperty(name = "Workbooks", dispId = 0x23c)
    Workbooks getWorkbooks();
            
    /**
     * <p>id(0x5a0)</p>
     */
    @ComProperty(name = "WorksheetFunction", dispId = 0x5a0)
    WorksheetFunction getWorksheetFunction();
            
    /**
     * <p>id(0x1ee)</p>
     */
    @ComProperty(name = "Worksheets", dispId = 0x1ee)
    Sheets getWorksheets();
            
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
            
    
}