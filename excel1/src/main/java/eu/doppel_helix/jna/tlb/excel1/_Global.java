
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000208D9-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000208D9-0000-0000-C000-000000000046}")
public interface _Global extends IUnknown, IRawDispatchHandle, IDispatch {
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
    Application getParent();
            
    /**
     * <p>id(0x131)</p>
     * <p>vtableId(10)</p>
     */
    @ComProperty(name = "ActiveCell", dispId = 0x131)
    Range getActiveCell();
            
    /**
     * <p>id(0xb7)</p>
     * <p>vtableId(11)</p>
     */
    @ComProperty(name = "ActiveChart", dispId = 0xb7)
    Chart getActiveChart();
            
    /**
     * <p>id(0x32f)</p>
     * <p>vtableId(12)</p>
     */
    @ComProperty(name = "ActiveDialog", dispId = 0x32f)
    DialogSheet getActiveDialog();
            
    /**
     * <p>id(0x2f6)</p>
     * <p>vtableId(13)</p>
     */
    @ComProperty(name = "ActiveMenuBar", dispId = 0x2f6)
    MenuBar getActiveMenuBar();
            
    /**
     * <p>id(0x132)</p>
     * <p>vtableId(14)</p>
     */
    @ComProperty(name = "ActivePrinter", dispId = 0x132)
    String getActivePrinter();
            
    /**
     * <p>id(0x132)</p>
     * <p>vtableId(15)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "ActivePrinter", dispId = 0x132)
    void setActivePrinter(String param0);
            
    /**
     * <p>id(0x133)</p>
     * <p>vtableId(16)</p>
     */
    @ComProperty(name = "ActiveSheet", dispId = 0x133)
    com.sun.jna.platform.win32.COM.util.IDispatch getActiveSheet();
            
    /**
     * <p>id(0x2f7)</p>
     * <p>vtableId(17)</p>
     */
    @ComProperty(name = "ActiveWindow", dispId = 0x2f7)
    Window getActiveWindow();
            
    /**
     * <p>id(0x134)</p>
     * <p>vtableId(18)</p>
     */
    @ComProperty(name = "ActiveWorkbook", dispId = 0x134)
    Workbook getActiveWorkbook();
            
    /**
     * <p>id(0x225)</p>
     * <p>vtableId(19)</p>
     */
    @ComProperty(name = "AddIns", dispId = 0x225)
    AddIns getAddIns();
            
    /**
     * <p>id(0x59e)</p>
     * <p>vtableId(20)</p>
     */
    @ComProperty(name = "Assistant", dispId = 0x59e)
    eu.doppel_helix.jna.tlb.office2.Assistant getAssistant();
            
    /**
     * <p>id(0x117)</p>
     * <p>vtableId(21)</p>
     */
    @ComMethod(name = "Calculate", dispId = 0x117)
    void Calculate();
            
    /**
     * <p>id(0xee)</p>
     * <p>vtableId(22)</p>
     */
    @ComProperty(name = "Cells", dispId = 0xee)
    Range getCells();
            
    /**
     * <p>id(0x79)</p>
     * <p>vtableId(23)</p>
     */
    @ComProperty(name = "Charts", dispId = 0x79)
    Sheets getCharts();
            
    /**
     * <p>id(0xf1)</p>
     * <p>vtableId(24)</p>
     */
    @ComProperty(name = "Columns", dispId = 0xf1)
    Range getColumns();
            
    /**
     * <p>id(0x59f)</p>
     * <p>vtableId(25)</p>
     */
    @ComProperty(name = "CommandBars", dispId = 0x59f)
    eu.doppel_helix.jna.tlb.office2.CommandBars getCommandBars();
            
    /**
     * <p>id(0x14c)</p>
     * <p>vtableId(26)</p>
     */
    @ComProperty(name = "DDEAppReturnCode", dispId = 0x14c)
    Integer getDDEAppReturnCode();
            
    /**
     * <p>id(0x14d)</p>
     * <p>vtableId(27)</p>
     * @param Channel [in] {@code Integer}
     * @param String [in] {@code String}
     */
    @ComMethod(name = "DDEExecute", dispId = 0x14d)
    void DDEExecute(Integer Channel,
            String String);
            
    /**
     * <p>id(0x14e)</p>
     * <p>vtableId(28)</p>
     * @param App [in] {@code String}
     * @param Topic [in] {@code String}
     */
    @ComMethod(name = "DDEInitiate", dispId = 0x14e)
    Integer DDEInitiate(String App,
            String Topic);
            
    /**
     * <p>id(0x14f)</p>
     * <p>vtableId(29)</p>
     * @param Channel [in] {@code Integer}
     * @param Item [in] {@code Object}
     * @param Data [in] {@code Object}
     */
    @ComMethod(name = "DDEPoke", dispId = 0x14f)
    void DDEPoke(Integer Channel,
            Object Item,
            Object Data);
            
    /**
     * <p>id(0x150)</p>
     * <p>vtableId(30)</p>
     * @param Channel [in] {@code Integer}
     * @param Item [in] {@code String}
     */
    @ComMethod(name = "DDERequest", dispId = 0x150)
    Object DDERequest(Integer Channel,
            String Item);
            
    /**
     * <p>id(0x151)</p>
     * <p>vtableId(31)</p>
     * @param Channel [in] {@code Integer}
     */
    @ComMethod(name = "DDETerminate", dispId = 0x151)
    void DDETerminate(Integer Channel);
            
    /**
     * <p>id(0x2fc)</p>
     * <p>vtableId(32)</p>
     */
    @ComProperty(name = "DialogSheets", dispId = 0x2fc)
    Sheets getDialogSheets();
            
    /**
     * <p>id(0x1)</p>
     * <p>vtableId(33)</p>
     * @param Name [in] {@code Object}
     */
    @ComMethod(name = "Evaluate", dispId = 0x1)
    Object Evaluate(Object Name);
            
    /**
     * <p>id(0xfffffffb)</p>
     * <p>vtableId(34)</p>
     * @param Name [in] {@code Object}
     */
    @ComMethod(name = "_Evaluate", dispId = 0xfffffffb)
    Object _Evaluate(Object Name);
            
    /**
     * <p>id(0x15e)</p>
     * <p>vtableId(35)</p>
     * @param String [in] {@code String}
     */
    @ComMethod(name = "ExecuteExcel4Macro", dispId = 0x15e)
    Object ExecuteExcel4Macro(String String);
            
    /**
     * <p>id(0x2fe)</p>
     * <p>vtableId(36)</p>
     * @param Arg1 [in] {@code Range}
     * @param Arg2 [in] {@code Range}
     * @param Arg3 [in, optional] {@code Object}
     * @param Arg4 [in, optional] {@code Object}
     * @param Arg5 [in, optional] {@code Object}
     * @param Arg6 [in, optional] {@code Object}
     * @param Arg7 [in, optional] {@code Object}
     * @param Arg8 [in, optional] {@code Object}
     * @param Arg9 [in, optional] {@code Object}
     * @param Arg10 [in, optional] {@code Object}
     * @param Arg11 [in, optional] {@code Object}
     * @param Arg12 [in, optional] {@code Object}
     * @param Arg13 [in, optional] {@code Object}
     * @param Arg14 [in, optional] {@code Object}
     * @param Arg15 [in, optional] {@code Object}
     * @param Arg16 [in, optional] {@code Object}
     * @param Arg17 [in, optional] {@code Object}
     * @param Arg18 [in, optional] {@code Object}
     * @param Arg19 [in, optional] {@code Object}
     * @param Arg20 [in, optional] {@code Object}
     * @param Arg21 [in, optional] {@code Object}
     * @param Arg22 [in, optional] {@code Object}
     * @param Arg23 [in, optional] {@code Object}
     * @param Arg24 [in, optional] {@code Object}
     * @param Arg25 [in, optional] {@code Object}
     * @param Arg26 [in, optional] {@code Object}
     * @param Arg27 [in, optional] {@code Object}
     * @param Arg28 [in, optional] {@code Object}
     * @param Arg29 [in, optional] {@code Object}
     * @param Arg30 [in, optional] {@code Object}
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
     * <p>vtableId(37)</p>
     */
    @ComProperty(name = "MenuBars", dispId = 0x24d)
    MenuBars getMenuBars();
            
    /**
     * <p>id(0x246)</p>
     * <p>vtableId(38)</p>
     */
    @ComProperty(name = "Modules", dispId = 0x246)
    Modules getModules();
            
    /**
     * <p>id(0x1ba)</p>
     * <p>vtableId(39)</p>
     */
    @ComProperty(name = "Names", dispId = 0x1ba)
    Names getNames();
            
    /**
     * <p>id(0xc5)</p>
     * <p>vtableId(40)</p>
     * @param Cell1 [in] {@code Object}
     * @param Cell2 [in, optional] {@code Object}
     */
    @ComProperty(name = "Range", dispId = 0xc5)
    Range getRange(Object Cell1,
            Object Cell2);
            
    /**
     * <p>id(0x102)</p>
     * <p>vtableId(41)</p>
     */
    @ComProperty(name = "Rows", dispId = 0x102)
    Range getRows();
            
    /**
     * <p>id(0x103)</p>
     * <p>vtableId(42)</p>
     * @param Macro [in, optional] {@code Object}
     * @param Arg1 [in, optional] {@code Object}
     * @param Arg2 [in, optional] {@code Object}
     * @param Arg3 [in, optional] {@code Object}
     * @param Arg4 [in, optional] {@code Object}
     * @param Arg5 [in, optional] {@code Object}
     * @param Arg6 [in, optional] {@code Object}
     * @param Arg7 [in, optional] {@code Object}
     * @param Arg8 [in, optional] {@code Object}
     * @param Arg9 [in, optional] {@code Object}
     * @param Arg10 [in, optional] {@code Object}
     * @param Arg11 [in, optional] {@code Object}
     * @param Arg12 [in, optional] {@code Object}
     * @param Arg13 [in, optional] {@code Object}
     * @param Arg14 [in, optional] {@code Object}
     * @param Arg15 [in, optional] {@code Object}
     * @param Arg16 [in, optional] {@code Object}
     * @param Arg17 [in, optional] {@code Object}
     * @param Arg18 [in, optional] {@code Object}
     * @param Arg19 [in, optional] {@code Object}
     * @param Arg20 [in, optional] {@code Object}
     * @param Arg21 [in, optional] {@code Object}
     * @param Arg22 [in, optional] {@code Object}
     * @param Arg23 [in, optional] {@code Object}
     * @param Arg24 [in, optional] {@code Object}
     * @param Arg25 [in, optional] {@code Object}
     * @param Arg26 [in, optional] {@code Object}
     * @param Arg27 [in, optional] {@code Object}
     * @param Arg28 [in, optional] {@code Object}
     * @param Arg29 [in, optional] {@code Object}
     * @param Arg30 [in, optional] {@code Object}
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
     * <p>vtableId(43)</p>
     * @param Macro [in, optional] {@code Object}
     * @param Arg1 [in, optional] {@code Object}
     * @param Arg2 [in, optional] {@code Object}
     * @param Arg3 [in, optional] {@code Object}
     * @param Arg4 [in, optional] {@code Object}
     * @param Arg5 [in, optional] {@code Object}
     * @param Arg6 [in, optional] {@code Object}
     * @param Arg7 [in, optional] {@code Object}
     * @param Arg8 [in, optional] {@code Object}
     * @param Arg9 [in, optional] {@code Object}
     * @param Arg10 [in, optional] {@code Object}
     * @param Arg11 [in, optional] {@code Object}
     * @param Arg12 [in, optional] {@code Object}
     * @param Arg13 [in, optional] {@code Object}
     * @param Arg14 [in, optional] {@code Object}
     * @param Arg15 [in, optional] {@code Object}
     * @param Arg16 [in, optional] {@code Object}
     * @param Arg17 [in, optional] {@code Object}
     * @param Arg18 [in, optional] {@code Object}
     * @param Arg19 [in, optional] {@code Object}
     * @param Arg20 [in, optional] {@code Object}
     * @param Arg21 [in, optional] {@code Object}
     * @param Arg22 [in, optional] {@code Object}
     * @param Arg23 [in, optional] {@code Object}
     * @param Arg24 [in, optional] {@code Object}
     * @param Arg25 [in, optional] {@code Object}
     * @param Arg26 [in, optional] {@code Object}
     * @param Arg27 [in, optional] {@code Object}
     * @param Arg28 [in, optional] {@code Object}
     * @param Arg29 [in, optional] {@code Object}
     * @param Arg30 [in, optional] {@code Object}
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
     * <p>vtableId(44)</p>
     */
    @ComProperty(name = "Selection", dispId = 0x93)
    com.sun.jna.platform.win32.COM.util.IDispatch getSelection();
            
    /**
     * <p>id(0x17f)</p>
     * <p>vtableId(45)</p>
     * @param Keys [in] {@code Object}
     * @param Wait [in, optional] {@code Object}
     */
    @ComMethod(name = "SendKeys", dispId = 0x17f)
    void SendKeys(Object Keys,
            Object Wait);
            
    /**
     * <p>id(0x1e5)</p>
     * <p>vtableId(46)</p>
     */
    @ComProperty(name = "Sheets", dispId = 0x1e5)
    Sheets getSheets();
            
    /**
     * <p>id(0x308)</p>
     * <p>vtableId(47)</p>
     * @param Index [in] {@code Integer}
     */
    @ComProperty(name = "ShortcutMenus", dispId = 0x308)
    Menu getShortcutMenus(Integer Index);
            
    /**
     * <p>id(0x30a)</p>
     * <p>vtableId(48)</p>
     */
    @ComProperty(name = "ThisWorkbook", dispId = 0x30a)
    Workbook getThisWorkbook();
            
    /**
     * <p>id(0x228)</p>
     * <p>vtableId(49)</p>
     */
    @ComProperty(name = "Toolbars", dispId = 0x228)
    Toolbars getToolbars();
            
    /**
     * <p>id(0x30b)</p>
     * <p>vtableId(50)</p>
     * @param Arg1 [in] {@code Range}
     * @param Arg2 [in] {@code Range}
     * @param Arg3 [in, optional] {@code Object}
     * @param Arg4 [in, optional] {@code Object}
     * @param Arg5 [in, optional] {@code Object}
     * @param Arg6 [in, optional] {@code Object}
     * @param Arg7 [in, optional] {@code Object}
     * @param Arg8 [in, optional] {@code Object}
     * @param Arg9 [in, optional] {@code Object}
     * @param Arg10 [in, optional] {@code Object}
     * @param Arg11 [in, optional] {@code Object}
     * @param Arg12 [in, optional] {@code Object}
     * @param Arg13 [in, optional] {@code Object}
     * @param Arg14 [in, optional] {@code Object}
     * @param Arg15 [in, optional] {@code Object}
     * @param Arg16 [in, optional] {@code Object}
     * @param Arg17 [in, optional] {@code Object}
     * @param Arg18 [in, optional] {@code Object}
     * @param Arg19 [in, optional] {@code Object}
     * @param Arg20 [in, optional] {@code Object}
     * @param Arg21 [in, optional] {@code Object}
     * @param Arg22 [in, optional] {@code Object}
     * @param Arg23 [in, optional] {@code Object}
     * @param Arg24 [in, optional] {@code Object}
     * @param Arg25 [in, optional] {@code Object}
     * @param Arg26 [in, optional] {@code Object}
     * @param Arg27 [in, optional] {@code Object}
     * @param Arg28 [in, optional] {@code Object}
     * @param Arg29 [in, optional] {@code Object}
     * @param Arg30 [in, optional] {@code Object}
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
     * <p>vtableId(51)</p>
     */
    @ComProperty(name = "Windows", dispId = 0x1ae)
    Windows getWindows();
            
    /**
     * <p>id(0x23c)</p>
     * <p>vtableId(52)</p>
     */
    @ComProperty(name = "Workbooks", dispId = 0x23c)
    Workbooks getWorkbooks();
            
    /**
     * <p>id(0x5a0)</p>
     * <p>vtableId(53)</p>
     */
    @ComProperty(name = "WorksheetFunction", dispId = 0x5a0)
    WorksheetFunction getWorksheetFunction();
            
    /**
     * <p>id(0x1ee)</p>
     * <p>vtableId(54)</p>
     */
    @ComProperty(name = "Worksheets", dispId = 0x1ee)
    Sheets getWorksheets();
            
    /**
     * <p>id(0x245)</p>
     * <p>vtableId(55)</p>
     */
    @ComProperty(name = "Excel4IntlMacroSheets", dispId = 0x245)
    Sheets getExcel4IntlMacroSheets();
            
    /**
     * <p>id(0x243)</p>
     * <p>vtableId(56)</p>
     */
    @ComProperty(name = "Excel4MacroSheets", dispId = 0x243)
    Sheets getExcel4MacroSheets();
            
    
}