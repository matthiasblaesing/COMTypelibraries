
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000208D5-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000208D5-0000-0000-C000-000000000046}")
public interface _Application extends IUnknown, IRawDispatchHandle, IDispatch {
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
            
    /**
     * <p>id(0x447)</p>
     * <p>vtableId(57)</p>
     * @param Index [in] {@code XlMSApplication}
     */
    @ComMethod(name = "ActivateMicrosoftApp", dispId = 0x447)
    void ActivateMicrosoftApp(XlMSApplication Index);
            
    /**
     * <p>id(0xd8)</p>
     * <p>vtableId(58)</p>
     * @param Chart [in] {@code Object}
     * @param Name [in] {@code String}
     * @param Description [in, optional] {@code Object}
     */
    @ComMethod(name = "AddChartAutoFormat", dispId = 0xd8)
    void AddChartAutoFormat(Object Chart,
            String Name,
            Object Description);
            
    /**
     * <p>id(0x30c)</p>
     * <p>vtableId(59)</p>
     * @param ListArray [in] {@code Object}
     * @param ByRow [in, optional] {@code Object}
     */
    @ComMethod(name = "AddCustomList", dispId = 0x30c)
    void AddCustomList(Object ListArray,
            Object ByRow);
            
    /**
     * <p>id(0x3a2)</p>
     * <p>vtableId(60)</p>
     */
    @ComProperty(name = "AlertBeforeOverwriting", dispId = 0x3a2)
    Boolean getAlertBeforeOverwriting();
            
    /**
     * <p>id(0x3a2)</p>
     * <p>vtableId(61)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "AlertBeforeOverwriting", dispId = 0x3a2)
    void setAlertBeforeOverwriting(Boolean param0);
            
    /**
     * <p>id(0x139)</p>
     * <p>vtableId(62)</p>
     */
    @ComProperty(name = "AltStartupPath", dispId = 0x139)
    String getAltStartupPath();
            
    /**
     * <p>id(0x139)</p>
     * <p>vtableId(63)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "AltStartupPath", dispId = 0x139)
    void setAltStartupPath(String param0);
            
    /**
     * <p>id(0x3e0)</p>
     * <p>vtableId(64)</p>
     */
    @ComProperty(name = "AskToUpdateLinks", dispId = 0x3e0)
    Boolean getAskToUpdateLinks();
            
    /**
     * <p>id(0x3e0)</p>
     * <p>vtableId(65)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "AskToUpdateLinks", dispId = 0x3e0)
    void setAskToUpdateLinks(Boolean param0);
            
    /**
     * <p>id(0x49c)</p>
     * <p>vtableId(66)</p>
     */
    @ComProperty(name = "EnableAnimations", dispId = 0x49c)
    Boolean getEnableAnimations();
            
    /**
     * <p>id(0x49c)</p>
     * <p>vtableId(67)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "EnableAnimations", dispId = 0x49c)
    void setEnableAnimations(Boolean param0);
            
    /**
     * <p>id(0x479)</p>
     * <p>vtableId(68)</p>
     */
    @ComProperty(name = "AutoCorrect", dispId = 0x479)
    AutoCorrect getAutoCorrect();
            
    /**
     * <p>id(0x13a)</p>
     * <p>vtableId(69)</p>
     */
    @ComProperty(name = "Build", dispId = 0x13a)
    Integer getBuild();
            
    /**
     * <p>id(0x13b)</p>
     * <p>vtableId(70)</p>
     */
    @ComProperty(name = "CalculateBeforeSave", dispId = 0x13b)
    Boolean getCalculateBeforeSave();
            
    /**
     * <p>id(0x13b)</p>
     * <p>vtableId(71)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "CalculateBeforeSave", dispId = 0x13b)
    void setCalculateBeforeSave(Boolean param0);
            
    /**
     * <p>id(0x13c)</p>
     * <p>vtableId(72)</p>
     */
    @ComProperty(name = "Calculation", dispId = 0x13c)
    XlCalculation getCalculation();
            
    /**
     * <p>id(0x13c)</p>
     * <p>vtableId(73)</p>
     * @param param0 [in] {@code XlCalculation}
     */
    @ComProperty(name = "Calculation", dispId = 0x13c)
    void setCalculation(XlCalculation param0);
            
    /**
     * <p>id(0x13d)</p>
     * <p>vtableId(74)</p>
     * @param Index [in, optional] {@code Object}
     */
    @ComProperty(name = "Caller", dispId = 0x13d)
    Object getCaller(Object Index);
            
    /**
     * <p>id(0x13e)</p>
     * <p>vtableId(75)</p>
     */
    @ComProperty(name = "CanPlaySounds", dispId = 0x13e)
    Boolean getCanPlaySounds();
            
    /**
     * <p>id(0x13f)</p>
     * <p>vtableId(76)</p>
     */
    @ComProperty(name = "CanRecordSounds", dispId = 0x13f)
    Boolean getCanRecordSounds();
            
    /**
     * <p>id(0x8b)</p>
     * <p>vtableId(77)</p>
     */
    @ComProperty(name = "Caption", dispId = 0x8b)
    String getCaption();
            
    /**
     * <p>id(0x8b)</p>
     * <p>vtableId(78)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "Caption", dispId = 0x8b)
    void setCaption(String param0);
            
    /**
     * <p>id(0x140)</p>
     * <p>vtableId(79)</p>
     */
    @ComProperty(name = "CellDragAndDrop", dispId = 0x140)
    Boolean getCellDragAndDrop();
            
    /**
     * <p>id(0x140)</p>
     * <p>vtableId(80)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "CellDragAndDrop", dispId = 0x140)
    void setCellDragAndDrop(Boolean param0);
            
    /**
     * <p>id(0x43e)</p>
     * <p>vtableId(81)</p>
     * @param Centimeters [in] {@code Double}
     */
    @ComMethod(name = "CentimetersToPoints", dispId = 0x43e)
    Double CentimetersToPoints(Double Centimeters);
            
    /**
     * <p>id(0x1f9)</p>
     * <p>vtableId(82)</p>
     * @param Word [in] {@code String}
     * @param CustomDictionary [in, optional] {@code Object}
     * @param IgnoreUppercase [in, optional] {@code Object}
     */
    @ComMethod(name = "CheckSpelling", dispId = 0x1f9)
    Boolean CheckSpelling(String Word,
            Object CustomDictionary,
            Object IgnoreUppercase);
            
    /**
     * <p>id(0x141)</p>
     * <p>vtableId(83)</p>
     * @param Index [in, optional] {@code Object}
     */
    @ComProperty(name = "ClipboardFormats", dispId = 0x141)
    Object getClipboardFormats(Object Index);
            
    /**
     * <p>id(0x142)</p>
     * <p>vtableId(84)</p>
     */
    @ComProperty(name = "DisplayClipboardWindow", dispId = 0x142)
    Boolean getDisplayClipboardWindow();
            
    /**
     * <p>id(0x142)</p>
     * <p>vtableId(85)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "DisplayClipboardWindow", dispId = 0x142)
    void setDisplayClipboardWindow(Boolean param0);
            
    /**
     * <p>id(0x16d)</p>
     * <p>vtableId(86)</p>
     */
    @ComProperty(name = "ColorButtons", dispId = 0x16d)
    Boolean getColorButtons();
            
    /**
     * <p>id(0x16d)</p>
     * <p>vtableId(87)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "ColorButtons", dispId = 0x16d)
    void setColorButtons(Boolean param0);
            
    /**
     * <p>id(0x143)</p>
     * <p>vtableId(88)</p>
     */
    @ComProperty(name = "CommandUnderlines", dispId = 0x143)
    XlCommandUnderlines getCommandUnderlines();
            
    /**
     * <p>id(0x143)</p>
     * <p>vtableId(89)</p>
     * @param param0 [in] {@code XlCommandUnderlines}
     */
    @ComProperty(name = "CommandUnderlines", dispId = 0x143)
    void setCommandUnderlines(XlCommandUnderlines param0);
            
    /**
     * <p>id(0x144)</p>
     * <p>vtableId(90)</p>
     */
    @ComProperty(name = "ConstrainNumeric", dispId = 0x144)
    Boolean getConstrainNumeric();
            
    /**
     * <p>id(0x144)</p>
     * <p>vtableId(91)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "ConstrainNumeric", dispId = 0x144)
    void setConstrainNumeric(Boolean param0);
            
    /**
     * <p>id(0x145)</p>
     * <p>vtableId(92)</p>
     * @param Formula [in] {@code Object}
     * @param FromReferenceStyle [in] {@code XlReferenceStyle}
     * @param ToReferenceStyle [in, optional] {@code Object}
     * @param ToAbsolute [in, optional] {@code Object}
     * @param RelativeTo [in, optional] {@code Object}
     */
    @ComMethod(name = "ConvertFormula", dispId = 0x145)
    Object ConvertFormula(Object Formula,
            XlReferenceStyle FromReferenceStyle,
            Object ToReferenceStyle,
            Object ToAbsolute,
            Object RelativeTo);
            
    /**
     * <p>id(0x3df)</p>
     * <p>vtableId(93)</p>
     */
    @ComProperty(name = "CopyObjectsWithCells", dispId = 0x3df)
    Boolean getCopyObjectsWithCells();
            
    /**
     * <p>id(0x3df)</p>
     * <p>vtableId(94)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "CopyObjectsWithCells", dispId = 0x3df)
    void setCopyObjectsWithCells(Boolean param0);
            
    /**
     * <p>id(0x489)</p>
     * <p>vtableId(95)</p>
     */
    @ComProperty(name = "Cursor", dispId = 0x489)
    XlMousePointer getCursor();
            
    /**
     * <p>id(0x489)</p>
     * <p>vtableId(96)</p>
     * @param param0 [in] {@code XlMousePointer}
     */
    @ComProperty(name = "Cursor", dispId = 0x489)
    void setCursor(XlMousePointer param0);
            
    /**
     * <p>id(0x313)</p>
     * <p>vtableId(97)</p>
     */
    @ComProperty(name = "CustomListCount", dispId = 0x313)
    Integer getCustomListCount();
            
    /**
     * <p>id(0x14a)</p>
     * <p>vtableId(98)</p>
     */
    @ComProperty(name = "CutCopyMode", dispId = 0x14a)
    XlCutCopyMode getCutCopyMode();
            
    /**
     * <p>id(0x14a)</p>
     * <p>vtableId(99)</p>
     * @param param0 [in] {@code XlCutCopyMode}
     */
    @ComProperty(name = "CutCopyMode", dispId = 0x14a)
    void setCutCopyMode(XlCutCopyMode param0);
            
    /**
     * <p>id(0x14b)</p>
     * <p>vtableId(100)</p>
     */
    @ComProperty(name = "DataEntryMode", dispId = 0x14b)
    Integer getDataEntryMode();
            
    /**
     * <p>id(0x14b)</p>
     * <p>vtableId(101)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "DataEntryMode", dispId = 0x14b)
    void setDataEntryMode(Integer param0);
            
    /**
     * <p>id(0x6f6)</p>
     * <p>vtableId(102)</p>
     * @param Arg1 [in, optional] {@code Object}
     * @param Arg2 [in, optional] {@code Object}
     * @param Arg3 [in, optional] {@code Object}
     * @param Arg4 [in, optional] {@code Object}
     */
    @ComMethod(name = "Dummy1", dispId = 0x6f6)
    Object Dummy1(Object Arg1,
            Object Arg2,
            Object Arg3,
            Object Arg4);
            
    /**
     * <p>id(0x6f7)</p>
     * <p>vtableId(103)</p>
     * @param Arg1 [in, optional] {@code Object}
     * @param Arg2 [in, optional] {@code Object}
     * @param Arg3 [in, optional] {@code Object}
     * @param Arg4 [in, optional] {@code Object}
     * @param Arg5 [in, optional] {@code Object}
     * @param Arg6 [in, optional] {@code Object}
     * @param Arg7 [in, optional] {@code Object}
     * @param Arg8 [in, optional] {@code Object}
     */
    @ComMethod(name = "Dummy2", dispId = 0x6f7)
    Object Dummy2(Object Arg1,
            Object Arg2,
            Object Arg3,
            Object Arg4,
            Object Arg5,
            Object Arg6,
            Object Arg7,
            Object Arg8);
            
    /**
     * <p>id(0x6f8)</p>
     * <p>vtableId(104)</p>
     */
    @ComMethod(name = "Dummy3", dispId = 0x6f8)
    Object Dummy3();
            
    /**
     * <p>id(0x6f9)</p>
     * <p>vtableId(105)</p>
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
     */
    @ComMethod(name = "Dummy4", dispId = 0x6f9)
    Object Dummy4(Object Arg1,
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
            Object Arg15);
            
    /**
     * <p>id(0x6fa)</p>
     * <p>vtableId(106)</p>
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
     */
    @ComMethod(name = "Dummy5", dispId = 0x6fa)
    Object Dummy5(Object Arg1,
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
            Object Arg13);
            
    /**
     * <p>id(0x6fb)</p>
     * <p>vtableId(107)</p>
     */
    @ComMethod(name = "Dummy6", dispId = 0x6fb)
    Object Dummy6();
            
    /**
     * <p>id(0x6fc)</p>
     * <p>vtableId(108)</p>
     */
    @ComMethod(name = "Dummy7", dispId = 0x6fc)
    Object Dummy7();
            
    /**
     * <p>id(0x6fd)</p>
     * <p>vtableId(109)</p>
     * @param Arg1 [in, optional] {@code Object}
     */
    @ComMethod(name = "Dummy8", dispId = 0x6fd)
    Object Dummy8(Object Arg1);
            
    /**
     * <p>id(0x6fe)</p>
     * <p>vtableId(110)</p>
     */
    @ComMethod(name = "Dummy9", dispId = 0x6fe)
    Object Dummy9();
            
    /**
     * <p>id(0x6ff)</p>
     * <p>vtableId(111)</p>
     * @param arg [in, optional] {@code Object}
     */
    @ComMethod(name = "Dummy10", dispId = 0x6ff)
    Boolean Dummy10(Object arg);
            
    /**
     * <p>id(0x700)</p>
     * <p>vtableId(112)</p>
     */
    @ComMethod(name = "Dummy11", dispId = 0x700)
    void Dummy11();
            
    /**
     * <p>id(0x0)</p>
     * <p>vtableId(113)</p>
     */
    @ComProperty(name = "_Default", dispId = 0x0)
    String get_Default();
            
    /**
     * <p>id(0x40e)</p>
     * <p>vtableId(114)</p>
     */
    @ComProperty(name = "DefaultFilePath", dispId = 0x40e)
    String getDefaultFilePath();
            
    /**
     * <p>id(0x40e)</p>
     * <p>vtableId(115)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "DefaultFilePath", dispId = 0x40e)
    void setDefaultFilePath(String param0);
            
    /**
     * <p>id(0xd9)</p>
     * <p>vtableId(116)</p>
     * @param Name [in] {@code String}
     */
    @ComMethod(name = "DeleteChartAutoFormat", dispId = 0xd9)
    void DeleteChartAutoFormat(String Name);
            
    /**
     * <p>id(0x30f)</p>
     * <p>vtableId(117)</p>
     * @param ListNum [in] {@code Integer}
     */
    @ComMethod(name = "DeleteCustomList", dispId = 0x30f)
    void DeleteCustomList(Integer ListNum);
            
    /**
     * <p>id(0x2f9)</p>
     * <p>vtableId(118)</p>
     */
    @ComProperty(name = "Dialogs", dispId = 0x2f9)
    Dialogs getDialogs();
            
    /**
     * <p>id(0x157)</p>
     * <p>vtableId(119)</p>
     */
    @ComProperty(name = "DisplayAlerts", dispId = 0x157)
    Boolean getDisplayAlerts();
            
    /**
     * <p>id(0x157)</p>
     * <p>vtableId(120)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "DisplayAlerts", dispId = 0x157)
    void setDisplayAlerts(Boolean param0);
            
    /**
     * <p>id(0x158)</p>
     * <p>vtableId(121)</p>
     */
    @ComProperty(name = "DisplayFormulaBar", dispId = 0x158)
    Boolean getDisplayFormulaBar();
            
    /**
     * <p>id(0x158)</p>
     * <p>vtableId(122)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "DisplayFormulaBar", dispId = 0x158)
    void setDisplayFormulaBar(Boolean param0);
            
    /**
     * <p>id(0x425)</p>
     * <p>vtableId(123)</p>
     */
    @ComProperty(name = "DisplayFullScreen", dispId = 0x425)
    Boolean getDisplayFullScreen();
            
    /**
     * <p>id(0x425)</p>
     * <p>vtableId(124)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "DisplayFullScreen", dispId = 0x425)
    void setDisplayFullScreen(Boolean param0);
            
    /**
     * <p>id(0x159)</p>
     * <p>vtableId(125)</p>
     */
    @ComProperty(name = "DisplayNoteIndicator", dispId = 0x159)
    Boolean getDisplayNoteIndicator();
            
    /**
     * <p>id(0x159)</p>
     * <p>vtableId(126)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "DisplayNoteIndicator", dispId = 0x159)
    void setDisplayNoteIndicator(Boolean param0);
            
    /**
     * <p>id(0x4ac)</p>
     * <p>vtableId(127)</p>
     */
    @ComProperty(name = "DisplayCommentIndicator", dispId = 0x4ac)
    XlCommentDisplayMode getDisplayCommentIndicator();
            
    /**
     * <p>id(0x4ac)</p>
     * <p>vtableId(128)</p>
     * @param param0 [in] {@code XlCommentDisplayMode}
     */
    @ComProperty(name = "DisplayCommentIndicator", dispId = 0x4ac)
    void setDisplayCommentIndicator(XlCommentDisplayMode param0);
            
    /**
     * <p>id(0x39f)</p>
     * <p>vtableId(129)</p>
     */
    @ComProperty(name = "DisplayExcel4Menus", dispId = 0x39f)
    Boolean getDisplayExcel4Menus();
            
    /**
     * <p>id(0x39f)</p>
     * <p>vtableId(130)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "DisplayExcel4Menus", dispId = 0x39f)
    void setDisplayExcel4Menus(Boolean param0);
            
    /**
     * <p>id(0x39e)</p>
     * <p>vtableId(131)</p>
     */
    @ComProperty(name = "DisplayRecentFiles", dispId = 0x39e)
    Boolean getDisplayRecentFiles();
            
    /**
     * <p>id(0x39e)</p>
     * <p>vtableId(132)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "DisplayRecentFiles", dispId = 0x39e)
    void setDisplayRecentFiles(Boolean param0);
            
    /**
     * <p>id(0x15a)</p>
     * <p>vtableId(133)</p>
     */
    @ComProperty(name = "DisplayScrollBars", dispId = 0x15a)
    Boolean getDisplayScrollBars();
            
    /**
     * <p>id(0x15a)</p>
     * <p>vtableId(134)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "DisplayScrollBars", dispId = 0x15a)
    void setDisplayScrollBars(Boolean param0);
            
    /**
     * <p>id(0x15b)</p>
     * <p>vtableId(135)</p>
     */
    @ComProperty(name = "DisplayStatusBar", dispId = 0x15b)
    Boolean getDisplayStatusBar();
            
    /**
     * <p>id(0x15b)</p>
     * <p>vtableId(136)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "DisplayStatusBar", dispId = 0x15b)
    void setDisplayStatusBar(Boolean param0);
            
    /**
     * <p>id(0x15d)</p>
     * <p>vtableId(137)</p>
     */
    @ComMethod(name = "DoubleClick", dispId = 0x15d)
    void DoubleClick();
            
    /**
     * <p>id(0x3a1)</p>
     * <p>vtableId(138)</p>
     */
    @ComProperty(name = "EditDirectlyInCell", dispId = 0x3a1)
    Boolean getEditDirectlyInCell();
            
    /**
     * <p>id(0x3a1)</p>
     * <p>vtableId(139)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "EditDirectlyInCell", dispId = 0x3a1)
    void setEditDirectlyInCell(Boolean param0);
            
    /**
     * <p>id(0x49b)</p>
     * <p>vtableId(140)</p>
     */
    @ComProperty(name = "EnableAutoComplete", dispId = 0x49b)
    Boolean getEnableAutoComplete();
            
    /**
     * <p>id(0x49b)</p>
     * <p>vtableId(141)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "EnableAutoComplete", dispId = 0x49b)
    void setEnableAutoComplete(Boolean param0);
            
    /**
     * <p>id(0x448)</p>
     * <p>vtableId(142)</p>
     */
    @ComProperty(name = "EnableCancelKey", dispId = 0x448)
    XlEnableCancelKey getEnableCancelKey();
            
    /**
     * <p>id(0x448)</p>
     * <p>vtableId(143)</p>
     * @param param0 [in] {@code XlEnableCancelKey}
     */
    @ComProperty(name = "EnableCancelKey", dispId = 0x448)
    void setEnableCancelKey(XlEnableCancelKey param0);
            
    /**
     * <p>id(0x4ad)</p>
     * <p>vtableId(144)</p>
     */
    @ComProperty(name = "EnableSound", dispId = 0x4ad)
    Boolean getEnableSound();
            
    /**
     * <p>id(0x4ad)</p>
     * <p>vtableId(145)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "EnableSound", dispId = 0x4ad)
    void setEnableSound(Boolean param0);
            
    /**
     * <p>id(0x428)</p>
     * <p>vtableId(146)</p>
     */
    @ComProperty(name = "EnableTipWizard", dispId = 0x428)
    Boolean getEnableTipWizard();
            
    /**
     * <p>id(0x428)</p>
     * <p>vtableId(147)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "EnableTipWizard", dispId = 0x428)
    void setEnableTipWizard(Boolean param0);
            
    /**
     * <p>id(0x3a3)</p>
     * <p>vtableId(148)</p>
     * @param Index1 [in, optional] {@code Object}
     * @param Index2 [in, optional] {@code Object}
     */
    @ComProperty(name = "FileConverters", dispId = 0x3a3)
    Object getFileConverters(Object Index1,
            Object Index2);
            
    /**
     * <p>id(0x4b0)</p>
     * <p>vtableId(149)</p>
     */
    @ComProperty(name = "FileSearch", dispId = 0x4b0)
    eu.doppel_helix.jna.tlb.office2.FileSearch getFileSearch();
            
    /**
     * <p>id(0x4b1)</p>
     * <p>vtableId(150)</p>
     */
    @ComProperty(name = "FileFind", dispId = 0x4b1)
    eu.doppel_helix.jna.tlb.office2.IFind getFileFind();
            
    /**
     * <p>id(0x42c)</p>
     * <p>vtableId(151)</p>
     */
    @ComMethod(name = "_FindFile", dispId = 0x42c)
    void _FindFile();
            
    /**
     * <p>id(0x15f)</p>
     * <p>vtableId(152)</p>
     */
    @ComProperty(name = "FixedDecimal", dispId = 0x15f)
    Boolean getFixedDecimal();
            
    /**
     * <p>id(0x15f)</p>
     * <p>vtableId(153)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "FixedDecimal", dispId = 0x15f)
    void setFixedDecimal(Boolean param0);
            
    /**
     * <p>id(0x160)</p>
     * <p>vtableId(154)</p>
     */
    @ComProperty(name = "FixedDecimalPlaces", dispId = 0x160)
    Integer getFixedDecimalPlaces();
            
    /**
     * <p>id(0x160)</p>
     * <p>vtableId(155)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "FixedDecimalPlaces", dispId = 0x160)
    void setFixedDecimalPlaces(Integer param0);
            
    /**
     * <p>id(0x312)</p>
     * <p>vtableId(156)</p>
     * @param ListNum [in] {@code Integer}
     */
    @ComMethod(name = "GetCustomListContents", dispId = 0x312)
    Object GetCustomListContents(Integer ListNum);
            
    /**
     * <p>id(0x311)</p>
     * <p>vtableId(157)</p>
     * @param ListArray [in] {@code Object}
     */
    @ComMethod(name = "GetCustomListNum", dispId = 0x311)
    Integer GetCustomListNum(Object ListArray);
            
    /**
     * <p>id(0x433)</p>
     * <p>vtableId(158)</p>
     * @param FileFilter [in, optional] {@code Object}
     * @param FilterIndex [in, optional] {@code Object}
     * @param Title [in, optional] {@code Object}
     * @param ButtonText [in, optional] {@code Object}
     * @param MultiSelect [in, optional] {@code Object}
     */
    @ComMethod(name = "GetOpenFilename", dispId = 0x433)
    Object GetOpenFilename(Object FileFilter,
            Object FilterIndex,
            Object Title,
            Object ButtonText,
            Object MultiSelect);
            
    /**
     * <p>id(0x434)</p>
     * <p>vtableId(159)</p>
     * @param InitialFilename [in, optional] {@code Object}
     * @param FileFilter [in, optional] {@code Object}
     * @param FilterIndex [in, optional] {@code Object}
     * @param Title [in, optional] {@code Object}
     * @param ButtonText [in, optional] {@code Object}
     */
    @ComMethod(name = "GetSaveAsFilename", dispId = 0x434)
    Object GetSaveAsFilename(Object InitialFilename,
            Object FileFilter,
            Object FilterIndex,
            Object Title,
            Object ButtonText);
            
    /**
     * <p>id(0x1db)</p>
     * <p>vtableId(160)</p>
     * @param Reference [in, optional] {@code Object}
     * @param Scroll [in, optional] {@code Object}
     */
    @ComMethod(name = "Goto", dispId = 0x1db)
    void Goto(Object Reference,
            Object Scroll);
            
    /**
     * <p>id(0x7b)</p>
     * <p>vtableId(161)</p>
     */
    @ComProperty(name = "Height", dispId = 0x7b)
    Double getHeight();
            
    /**
     * <p>id(0x7b)</p>
     * <p>vtableId(162)</p>
     * @param param0 [in] {@code Double}
     */
    @ComProperty(name = "Height", dispId = 0x7b)
    void setHeight(Double param0);
            
    /**
     * <p>id(0x162)</p>
     * <p>vtableId(163)</p>
     * @param HelpFile [in, optional] {@code Object}
     * @param HelpContextID [in, optional] {@code Object}
     */
    @ComMethod(name = "Help", dispId = 0x162)
    void Help(Object HelpFile,
            Object HelpContextID);
            
    /**
     * <p>id(0x164)</p>
     * <p>vtableId(164)</p>
     */
    @ComProperty(name = "IgnoreRemoteRequests", dispId = 0x164)
    Boolean getIgnoreRemoteRequests();
            
    /**
     * <p>id(0x164)</p>
     * <p>vtableId(165)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "IgnoreRemoteRequests", dispId = 0x164)
    void setIgnoreRemoteRequests(Boolean param0);
            
    /**
     * <p>id(0x43f)</p>
     * <p>vtableId(166)</p>
     * @param Inches [in] {@code Double}
     */
    @ComMethod(name = "InchesToPoints", dispId = 0x43f)
    Double InchesToPoints(Double Inches);
            
    /**
     * <p>id(0x165)</p>
     * <p>vtableId(167)</p>
     * @param Prompt [in] {@code String}
     * @param Title [in, optional] {@code Object}
     * @param Default [in, optional] {@code Object}
     * @param Left [in, optional] {@code Object}
     * @param Top [in, optional] {@code Object}
     * @param HelpFile [in, optional] {@code Object}
     * @param HelpContextID [in, optional] {@code Object}
     * @param Type [in, optional] {@code Object}
     */
    @ComMethod(name = "InputBox", dispId = 0x165)
    Object InputBox(String Prompt,
            Object Title,
            Object Default,
            Object Left,
            Object Top,
            Object HelpFile,
            Object HelpContextID,
            Object Type);
            
    /**
     * <p>id(0x169)</p>
     * <p>vtableId(168)</p>
     */
    @ComProperty(name = "Interactive", dispId = 0x169)
    Boolean getInteractive();
            
    /**
     * <p>id(0x169)</p>
     * <p>vtableId(169)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "Interactive", dispId = 0x169)
    void setInteractive(Boolean param0);
            
    /**
     * <p>id(0x16a)</p>
     * <p>vtableId(170)</p>
     * @param Index [in, optional] {@code Object}
     */
    @ComProperty(name = "International", dispId = 0x16a)
    Object getInternational(Object Index);
            
    /**
     * <p>id(0x16b)</p>
     * <p>vtableId(171)</p>
     */
    @ComProperty(name = "Iteration", dispId = 0x16b)
    Boolean getIteration();
            
    /**
     * <p>id(0x16b)</p>
     * <p>vtableId(172)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "Iteration", dispId = 0x16b)
    void setIteration(Boolean param0);
            
    /**
     * <p>id(0x16c)</p>
     * <p>vtableId(173)</p>
     */
    @ComProperty(name = "LargeButtons", dispId = 0x16c)
    Boolean getLargeButtons();
            
    /**
     * <p>id(0x16c)</p>
     * <p>vtableId(174)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "LargeButtons", dispId = 0x16c)
    void setLargeButtons(Boolean param0);
            
    /**
     * <p>id(0x7f)</p>
     * <p>vtableId(175)</p>
     */
    @ComProperty(name = "Left", dispId = 0x7f)
    Double getLeft();
            
    /**
     * <p>id(0x7f)</p>
     * <p>vtableId(176)</p>
     * @param param0 [in] {@code Double}
     */
    @ComProperty(name = "Left", dispId = 0x7f)
    void setLeft(Double param0);
            
    /**
     * <p>id(0x16e)</p>
     * <p>vtableId(177)</p>
     */
    @ComProperty(name = "LibraryPath", dispId = 0x16e)
    String getLibraryPath();
            
    /**
     * <p>id(0x46f)</p>
     * <p>vtableId(178)</p>
     * @param Macro [in, optional] {@code Object}
     * @param Description [in, optional] {@code Object}
     * @param HasMenu [in, optional] {@code Object}
     * @param MenuText [in, optional] {@code Object}
     * @param HasShortcutKey [in, optional] {@code Object}
     * @param ShortcutKey [in, optional] {@code Object}
     * @param Category [in, optional] {@code Object}
     * @param StatusBar [in, optional] {@code Object}
     * @param HelpContextID [in, optional] {@code Object}
     * @param HelpFile [in, optional] {@code Object}
     */
    @ComMethod(name = "_MacroOptions", dispId = 0x46f)
    void _MacroOptions(Object Macro,
            Object Description,
            Object HasMenu,
            Object MenuText,
            Object HasShortcutKey,
            Object ShortcutKey,
            Object Category,
            Object StatusBar,
            Object HelpContextID,
            Object HelpFile);
            
    /**
     * <p>id(0x3b1)</p>
     * <p>vtableId(179)</p>
     */
    @ComMethod(name = "MailLogoff", dispId = 0x3b1)
    void MailLogoff();
            
    /**
     * <p>id(0x3af)</p>
     * <p>vtableId(180)</p>
     * @param Name [in, optional] {@code Object}
     * @param Password [in, optional] {@code Object}
     * @param DownloadNewMail [in, optional] {@code Object}
     */
    @ComMethod(name = "MailLogon", dispId = 0x3af)
    void MailLogon(Object Name,
            Object Password,
            Object DownloadNewMail);
            
    /**
     * <p>id(0x3ae)</p>
     * <p>vtableId(181)</p>
     */
    @ComProperty(name = "MailSession", dispId = 0x3ae)
    Object getMailSession();
            
    /**
     * <p>id(0x3cb)</p>
     * <p>vtableId(182)</p>
     */
    @ComProperty(name = "MailSystem", dispId = 0x3cb)
    XlMailSystem getMailSystem();
            
    /**
     * <p>id(0x16f)</p>
     * <p>vtableId(183)</p>
     */
    @ComProperty(name = "MathCoprocessorAvailable", dispId = 0x16f)
    Boolean getMathCoprocessorAvailable();
            
    /**
     * <p>id(0x170)</p>
     * <p>vtableId(184)</p>
     */
    @ComProperty(name = "MaxChange", dispId = 0x170)
    Double getMaxChange();
            
    /**
     * <p>id(0x170)</p>
     * <p>vtableId(185)</p>
     * @param param0 [in] {@code Double}
     */
    @ComProperty(name = "MaxChange", dispId = 0x170)
    void setMaxChange(Double param0);
            
    /**
     * <p>id(0x171)</p>
     * <p>vtableId(186)</p>
     */
    @ComProperty(name = "MaxIterations", dispId = 0x171)
    Integer getMaxIterations();
            
    /**
     * <p>id(0x171)</p>
     * <p>vtableId(187)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "MaxIterations", dispId = 0x171)
    void setMaxIterations(Integer param0);
            
    /**
     * <p>id(0x172)</p>
     * <p>vtableId(188)</p>
     */
    @ComProperty(name = "MemoryFree", dispId = 0x172)
    Integer getMemoryFree();
            
    /**
     * <p>id(0x173)</p>
     * <p>vtableId(189)</p>
     */
    @ComProperty(name = "MemoryTotal", dispId = 0x173)
    Integer getMemoryTotal();
            
    /**
     * <p>id(0x174)</p>
     * <p>vtableId(190)</p>
     */
    @ComProperty(name = "MemoryUsed", dispId = 0x174)
    Integer getMemoryUsed();
            
    /**
     * <p>id(0x175)</p>
     * <p>vtableId(191)</p>
     */
    @ComProperty(name = "MouseAvailable", dispId = 0x175)
    Boolean getMouseAvailable();
            
    /**
     * <p>id(0x176)</p>
     * <p>vtableId(192)</p>
     */
    @ComProperty(name = "MoveAfterReturn", dispId = 0x176)
    Boolean getMoveAfterReturn();
            
    /**
     * <p>id(0x176)</p>
     * <p>vtableId(193)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "MoveAfterReturn", dispId = 0x176)
    void setMoveAfterReturn(Boolean param0);
            
    /**
     * <p>id(0x478)</p>
     * <p>vtableId(194)</p>
     */
    @ComProperty(name = "MoveAfterReturnDirection", dispId = 0x478)
    XlDirection getMoveAfterReturnDirection();
            
    /**
     * <p>id(0x478)</p>
     * <p>vtableId(195)</p>
     * @param param0 [in] {@code XlDirection}
     */
    @ComProperty(name = "MoveAfterReturnDirection", dispId = 0x478)
    void setMoveAfterReturnDirection(XlDirection param0);
            
    /**
     * <p>id(0x4b2)</p>
     * <p>vtableId(196)</p>
     */
    @ComProperty(name = "RecentFiles", dispId = 0x4b2)
    RecentFiles getRecentFiles();
            
    /**
     * <p>id(0x6e)</p>
     * <p>vtableId(197)</p>
     */
    @ComProperty(name = "Name", dispId = 0x6e)
    String getName();
            
    /**
     * <p>id(0x3cc)</p>
     * <p>vtableId(198)</p>
     */
    @ComMethod(name = "NextLetter", dispId = 0x3cc)
    Workbook NextLetter();
            
    /**
     * <p>id(0x184)</p>
     * <p>vtableId(199)</p>
     */
    @ComProperty(name = "NetworkTemplatesPath", dispId = 0x184)
    String getNetworkTemplatesPath();
            
    /**
     * <p>id(0x4b3)</p>
     * <p>vtableId(200)</p>
     */
    @ComProperty(name = "ODBCErrors", dispId = 0x4b3)
    ODBCErrors getODBCErrors();
            
    /**
     * <p>id(0x4b4)</p>
     * <p>vtableId(201)</p>
     */
    @ComProperty(name = "ODBCTimeout", dispId = 0x4b4)
    Integer getODBCTimeout();
            
    /**
     * <p>id(0x4b4)</p>
     * <p>vtableId(202)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "ODBCTimeout", dispId = 0x4b4)
    void setODBCTimeout(Integer param0);
            
    /**
     * <p>id(0x271)</p>
     * <p>vtableId(203)</p>
     */
    @ComProperty(name = "OnCalculate", dispId = 0x271)
    String getOnCalculate();
            
    /**
     * <p>id(0x271)</p>
     * <p>vtableId(204)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "OnCalculate", dispId = 0x271)
    void setOnCalculate(String param0);
            
    /**
     * <p>id(0x275)</p>
     * <p>vtableId(205)</p>
     */
    @ComProperty(name = "OnData", dispId = 0x275)
    String getOnData();
            
    /**
     * <p>id(0x275)</p>
     * <p>vtableId(206)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "OnData", dispId = 0x275)
    void setOnData(String param0);
            
    /**
     * <p>id(0x274)</p>
     * <p>vtableId(207)</p>
     */
    @ComProperty(name = "OnDoubleClick", dispId = 0x274)
    String getOnDoubleClick();
            
    /**
     * <p>id(0x274)</p>
     * <p>vtableId(208)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "OnDoubleClick", dispId = 0x274)
    void setOnDoubleClick(String param0);
            
    /**
     * <p>id(0x273)</p>
     * <p>vtableId(209)</p>
     */
    @ComProperty(name = "OnEntry", dispId = 0x273)
    String getOnEntry();
            
    /**
     * <p>id(0x273)</p>
     * <p>vtableId(210)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "OnEntry", dispId = 0x273)
    void setOnEntry(String param0);
            
    /**
     * <p>id(0x272)</p>
     * <p>vtableId(211)</p>
     * @param Key [in] {@code String}
     * @param Procedure [in, optional] {@code Object}
     */
    @ComMethod(name = "OnKey", dispId = 0x272)
    void OnKey(String Key,
            Object Procedure);
            
    /**
     * <p>id(0x301)</p>
     * <p>vtableId(212)</p>
     * @param Text [in] {@code String}
     * @param Procedure [in] {@code String}
     */
    @ComMethod(name = "OnRepeat", dispId = 0x301)
    void OnRepeat(String Text,
            String Procedure);
            
    /**
     * <p>id(0x407)</p>
     * <p>vtableId(213)</p>
     */
    @ComProperty(name = "OnSheetActivate", dispId = 0x407)
    String getOnSheetActivate();
            
    /**
     * <p>id(0x407)</p>
     * <p>vtableId(214)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "OnSheetActivate", dispId = 0x407)
    void setOnSheetActivate(String param0);
            
    /**
     * <p>id(0x439)</p>
     * <p>vtableId(215)</p>
     */
    @ComProperty(name = "OnSheetDeactivate", dispId = 0x439)
    String getOnSheetDeactivate();
            
    /**
     * <p>id(0x439)</p>
     * <p>vtableId(216)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "OnSheetDeactivate", dispId = 0x439)
    void setOnSheetDeactivate(String param0);
            
    /**
     * <p>id(0x270)</p>
     * <p>vtableId(217)</p>
     * @param EarliestTime [in] {@code Object}
     * @param Procedure [in] {@code String}
     * @param LatestTime [in, optional] {@code Object}
     * @param Schedule [in, optional] {@code Object}
     */
    @ComMethod(name = "OnTime", dispId = 0x270)
    void OnTime(Object EarliestTime,
            String Procedure,
            Object LatestTime,
            Object Schedule);
            
    /**
     * <p>id(0x302)</p>
     * <p>vtableId(218)</p>
     * @param Text [in] {@code String}
     * @param Procedure [in] {@code String}
     */
    @ComMethod(name = "OnUndo", dispId = 0x302)
    void OnUndo(String Text,
            String Procedure);
            
    /**
     * <p>id(0x26f)</p>
     * <p>vtableId(219)</p>
     */
    @ComProperty(name = "OnWindow", dispId = 0x26f)
    String getOnWindow();
            
    /**
     * <p>id(0x26f)</p>
     * <p>vtableId(220)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "OnWindow", dispId = 0x26f)
    void setOnWindow(String param0);
            
    /**
     * <p>id(0x177)</p>
     * <p>vtableId(221)</p>
     */
    @ComProperty(name = "OperatingSystem", dispId = 0x177)
    String getOperatingSystem();
            
    /**
     * <p>id(0x178)</p>
     * <p>vtableId(222)</p>
     */
    @ComProperty(name = "OrganizationName", dispId = 0x178)
    String getOrganizationName();
            
    /**
     * <p>id(0x123)</p>
     * <p>vtableId(223)</p>
     */
    @ComProperty(name = "Path", dispId = 0x123)
    String getPath();
            
    /**
     * <p>id(0x179)</p>
     * <p>vtableId(224)</p>
     */
    @ComProperty(name = "PathSeparator", dispId = 0x179)
    String getPathSeparator();
            
    /**
     * <p>id(0x17a)</p>
     * <p>vtableId(225)</p>
     * @param Index [in, optional] {@code Object}
     */
    @ComProperty(name = "PreviousSelections", dispId = 0x17a)
    Object getPreviousSelections(Object Index);
            
    /**
     * <p>id(0x4b5)</p>
     * <p>vtableId(226)</p>
     */
    @ComProperty(name = "PivotTableSelection", dispId = 0x4b5)
    Boolean getPivotTableSelection();
            
    /**
     * <p>id(0x4b5)</p>
     * <p>vtableId(227)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "PivotTableSelection", dispId = 0x4b5)
    void setPivotTableSelection(Boolean param0);
            
    /**
     * <p>id(0x426)</p>
     * <p>vtableId(228)</p>
     */
    @ComProperty(name = "PromptForSummaryInfo", dispId = 0x426)
    Boolean getPromptForSummaryInfo();
            
    /**
     * <p>id(0x426)</p>
     * <p>vtableId(229)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "PromptForSummaryInfo", dispId = 0x426)
    void setPromptForSummaryInfo(Boolean param0);
            
    /**
     * <p>id(0x12e)</p>
     * <p>vtableId(230)</p>
     */
    @ComMethod(name = "Quit", dispId = 0x12e)
    void Quit();
            
    /**
     * <p>id(0x305)</p>
     * <p>vtableId(231)</p>
     * @param BasicCode [in, optional] {@code Object}
     * @param XlmCode [in, optional] {@code Object}
     */
    @ComMethod(name = "RecordMacro", dispId = 0x305)
    void RecordMacro(Object BasicCode,
            Object XlmCode);
            
    /**
     * <p>id(0x17b)</p>
     * <p>vtableId(232)</p>
     */
    @ComProperty(name = "RecordRelative", dispId = 0x17b)
    Boolean getRecordRelative();
            
    /**
     * <p>id(0x17c)</p>
     * <p>vtableId(233)</p>
     */
    @ComProperty(name = "ReferenceStyle", dispId = 0x17c)
    XlReferenceStyle getReferenceStyle();
            
    /**
     * <p>id(0x17c)</p>
     * <p>vtableId(234)</p>
     * @param param0 [in] {@code XlReferenceStyle}
     */
    @ComProperty(name = "ReferenceStyle", dispId = 0x17c)
    void setReferenceStyle(XlReferenceStyle param0);
            
    /**
     * <p>id(0x307)</p>
     * <p>vtableId(235)</p>
     * @param Index1 [in, optional] {@code Object}
     * @param Index2 [in, optional] {@code Object}
     */
    @ComProperty(name = "RegisteredFunctions", dispId = 0x307)
    Object getRegisteredFunctions(Object Index1,
            Object Index2);
            
    /**
     * <p>id(0x1e)</p>
     * <p>vtableId(236)</p>
     * @param Filename [in] {@code String}
     */
    @ComMethod(name = "RegisterXLL", dispId = 0x1e)
    Boolean RegisterXLL(String Filename);
            
    /**
     * <p>id(0x12d)</p>
     * <p>vtableId(237)</p>
     */
    @ComMethod(name = "Repeat", dispId = 0x12d)
    void Repeat();
            
    /**
     * <p>id(0x3a0)</p>
     * <p>vtableId(238)</p>
     */
    @ComMethod(name = "ResetTipWizard", dispId = 0x3a0)
    void ResetTipWizard();
            
    /**
     * <p>id(0x4b6)</p>
     * <p>vtableId(239)</p>
     */
    @ComProperty(name = "RollZoom", dispId = 0x4b6)
    Boolean getRollZoom();
            
    /**
     * <p>id(0x4b6)</p>
     * <p>vtableId(240)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "RollZoom", dispId = 0x4b6)
    void setRollZoom(Boolean param0);
            
    /**
     * <p>id(0x11b)</p>
     * <p>vtableId(241)</p>
     * @param Filename [in, optional] {@code Object}
     */
    @ComMethod(name = "Save", dispId = 0x11b)
    void Save(Object Filename);
            
    /**
     * <p>id(0xd4)</p>
     * <p>vtableId(242)</p>
     * @param Filename [in, optional] {@code Object}
     */
    @ComMethod(name = "SaveWorkspace", dispId = 0xd4)
    void SaveWorkspace(Object Filename);
            
    /**
     * <p>id(0x17e)</p>
     * <p>vtableId(243)</p>
     */
    @ComProperty(name = "ScreenUpdating", dispId = 0x17e)
    Boolean getScreenUpdating();
            
    /**
     * <p>id(0x17e)</p>
     * <p>vtableId(244)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "ScreenUpdating", dispId = 0x17e)
    void setScreenUpdating(Boolean param0);
            
    /**
     * <p>id(0xdb)</p>
     * <p>vtableId(245)</p>
     * @param FormatName [in, optional] {@code Object}
     * @param Gallery [in, optional] {@code Object}
     */
    @ComMethod(name = "SetDefaultChart", dispId = 0xdb)
    void SetDefaultChart(Object FormatName,
            Object Gallery);
            
    /**
     * <p>id(0x3e1)</p>
     * <p>vtableId(246)</p>
     */
    @ComProperty(name = "SheetsInNewWorkbook", dispId = 0x3e1)
    Integer getSheetsInNewWorkbook();
            
    /**
     * <p>id(0x3e1)</p>
     * <p>vtableId(247)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "SheetsInNewWorkbook", dispId = 0x3e1)
    void setSheetsInNewWorkbook(Integer param0);
            
    /**
     * <p>id(0x4b7)</p>
     * <p>vtableId(248)</p>
     */
    @ComProperty(name = "ShowChartTipNames", dispId = 0x4b7)
    Boolean getShowChartTipNames();
            
    /**
     * <p>id(0x4b7)</p>
     * <p>vtableId(249)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "ShowChartTipNames", dispId = 0x4b7)
    void setShowChartTipNames(Boolean param0);
            
    /**
     * <p>id(0x4b8)</p>
     * <p>vtableId(250)</p>
     */
    @ComProperty(name = "ShowChartTipValues", dispId = 0x4b8)
    Boolean getShowChartTipValues();
            
    /**
     * <p>id(0x4b8)</p>
     * <p>vtableId(251)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "ShowChartTipValues", dispId = 0x4b8)
    void setShowChartTipValues(Boolean param0);
            
    /**
     * <p>id(0x39c)</p>
     * <p>vtableId(252)</p>
     */
    @ComProperty(name = "StandardFont", dispId = 0x39c)
    String getStandardFont();
            
    /**
     * <p>id(0x39c)</p>
     * <p>vtableId(253)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "StandardFont", dispId = 0x39c)
    void setStandardFont(String param0);
            
    /**
     * <p>id(0x39d)</p>
     * <p>vtableId(254)</p>
     */
    @ComProperty(name = "StandardFontSize", dispId = 0x39d)
    Double getStandardFontSize();
            
    /**
     * <p>id(0x39d)</p>
     * <p>vtableId(255)</p>
     * @param param0 [in] {@code Double}
     */
    @ComProperty(name = "StandardFontSize", dispId = 0x39d)
    void setStandardFontSize(Double param0);
            
    /**
     * <p>id(0x181)</p>
     * <p>vtableId(256)</p>
     */
    @ComProperty(name = "StartupPath", dispId = 0x181)
    String getStartupPath();
            
    /**
     * <p>id(0x182)</p>
     * <p>vtableId(257)</p>
     */
    @ComProperty(name = "StatusBar", dispId = 0x182)
    Object getStatusBar();
            
    /**
     * <p>id(0x182)</p>
     * <p>vtableId(258)</p>
     * @param param0 [in] {@code Object}
     */
    @ComProperty(name = "StatusBar", dispId = 0x182)
    void setStatusBar(Object param0);
            
    /**
     * <p>id(0x17d)</p>
     * <p>vtableId(259)</p>
     */
    @ComProperty(name = "TemplatesPath", dispId = 0x17d)
    String getTemplatesPath();
            
    /**
     * <p>id(0x183)</p>
     * <p>vtableId(260)</p>
     */
    @ComProperty(name = "ShowToolTips", dispId = 0x183)
    Boolean getShowToolTips();
            
    /**
     * <p>id(0x183)</p>
     * <p>vtableId(261)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "ShowToolTips", dispId = 0x183)
    void setShowToolTips(Boolean param0);
            
    /**
     * <p>id(0x7e)</p>
     * <p>vtableId(262)</p>
     */
    @ComProperty(name = "Top", dispId = 0x7e)
    Double getTop();
            
    /**
     * <p>id(0x7e)</p>
     * <p>vtableId(263)</p>
     * @param param0 [in] {@code Double}
     */
    @ComProperty(name = "Top", dispId = 0x7e)
    void setTop(Double param0);
            
    /**
     * <p>id(0x4b9)</p>
     * <p>vtableId(264)</p>
     */
    @ComProperty(name = "DefaultSaveFormat", dispId = 0x4b9)
    XlFileFormat getDefaultSaveFormat();
            
    /**
     * <p>id(0x4b9)</p>
     * <p>vtableId(265)</p>
     * @param param0 [in] {@code XlFileFormat}
     */
    @ComProperty(name = "DefaultSaveFormat", dispId = 0x4b9)
    void setDefaultSaveFormat(XlFileFormat param0);
            
    /**
     * <p>id(0x136)</p>
     * <p>vtableId(266)</p>
     */
    @ComProperty(name = "TransitionMenuKey", dispId = 0x136)
    String getTransitionMenuKey();
            
    /**
     * <p>id(0x136)</p>
     * <p>vtableId(267)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "TransitionMenuKey", dispId = 0x136)
    void setTransitionMenuKey(String param0);
            
    /**
     * <p>id(0x137)</p>
     * <p>vtableId(268)</p>
     */
    @ComProperty(name = "TransitionMenuKeyAction", dispId = 0x137)
    Integer getTransitionMenuKeyAction();
            
    /**
     * <p>id(0x137)</p>
     * <p>vtableId(269)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "TransitionMenuKeyAction", dispId = 0x137)
    void setTransitionMenuKeyAction(Integer param0);
            
    /**
     * <p>id(0x138)</p>
     * <p>vtableId(270)</p>
     */
    @ComProperty(name = "TransitionNavigKeys", dispId = 0x138)
    Boolean getTransitionNavigKeys();
            
    /**
     * <p>id(0x138)</p>
     * <p>vtableId(271)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "TransitionNavigKeys", dispId = 0x138)
    void setTransitionNavigKeys(Boolean param0);
            
    /**
     * <p>id(0x12f)</p>
     * <p>vtableId(272)</p>
     */
    @ComMethod(name = "Undo", dispId = 0x12f)
    void Undo();
            
    /**
     * <p>id(0x185)</p>
     * <p>vtableId(273)</p>
     */
    @ComProperty(name = "UsableHeight", dispId = 0x185)
    Double getUsableHeight();
            
    /**
     * <p>id(0x186)</p>
     * <p>vtableId(274)</p>
     */
    @ComProperty(name = "UsableWidth", dispId = 0x186)
    Double getUsableWidth();
            
    /**
     * <p>id(0x4ba)</p>
     * <p>vtableId(275)</p>
     */
    @ComProperty(name = "UserControl", dispId = 0x4ba)
    Boolean getUserControl();
            
    /**
     * <p>id(0x4ba)</p>
     * <p>vtableId(276)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "UserControl", dispId = 0x4ba)
    void setUserControl(Boolean param0);
            
    /**
     * <p>id(0x187)</p>
     * <p>vtableId(277)</p>
     */
    @ComProperty(name = "UserName", dispId = 0x187)
    String getUserName();
            
    /**
     * <p>id(0x187)</p>
     * <p>vtableId(278)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "UserName", dispId = 0x187)
    void setUserName(String param0);
            
    /**
     * <p>id(0x6)</p>
     * <p>vtableId(279)</p>
     */
    @ComProperty(name = "Value", dispId = 0x6)
    String getValue();
            
    /**
     * <p>id(0x4bb)</p>
     * <p>vtableId(280)</p>
     */
    @ComProperty(name = "VBE", dispId = 0x4bb)
    eu.doppel_helix.jna.tlb.vbide5.VBE getVBE();
            
    /**
     * <p>id(0x188)</p>
     * <p>vtableId(281)</p>
     */
    @ComProperty(name = "Version", dispId = 0x188)
    String getVersion();
            
    /**
     * <p>id(0x22e)</p>
     * <p>vtableId(282)</p>
     */
    @ComProperty(name = "Visible", dispId = 0x22e)
    Boolean getVisible();
            
    /**
     * <p>id(0x22e)</p>
     * <p>vtableId(283)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "Visible", dispId = 0x22e)
    void setVisible(Boolean param0);
            
    /**
     * <p>id(0x314)</p>
     * <p>vtableId(284)</p>
     * @param Volatile [in, optional] {@code Object}
     */
    @ComMethod(name = "Volatile", dispId = 0x314)
    void Volatile(Object Volatile);
            
    /**
     * <p>id(0x189)</p>
     * <p>vtableId(285)</p>
     * @param Time [in] {@code Object}
     */
    @ComMethod(name = "_Wait", dispId = 0x189)
    void _Wait(Object Time);
            
    /**
     * <p>id(0x7a)</p>
     * <p>vtableId(286)</p>
     */
    @ComProperty(name = "Width", dispId = 0x7a)
    Double getWidth();
            
    /**
     * <p>id(0x7a)</p>
     * <p>vtableId(287)</p>
     * @param param0 [in] {@code Double}
     */
    @ComProperty(name = "Width", dispId = 0x7a)
    void setWidth(Double param0);
            
    /**
     * <p>id(0x18b)</p>
     * <p>vtableId(288)</p>
     */
    @ComProperty(name = "WindowsForPens", dispId = 0x18b)
    Boolean getWindowsForPens();
            
    /**
     * <p>id(0x18c)</p>
     * <p>vtableId(289)</p>
     */
    @ComProperty(name = "WindowState", dispId = 0x18c)
    XlWindowState getWindowState();
            
    /**
     * <p>id(0x18c)</p>
     * <p>vtableId(290)</p>
     * @param param0 [in] {@code XlWindowState}
     */
    @ComProperty(name = "WindowState", dispId = 0x18c)
    void setWindowState(XlWindowState param0);
            
    /**
     * <p>id(0x2)</p>
     * <p>vtableId(291)</p>
     */
    @ComProperty(name = "UILanguage", dispId = 0x2)
    Integer getUILanguage();
            
    /**
     * <p>id(0x2)</p>
     * <p>vtableId(292)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "UILanguage", dispId = 0x2)
    void setUILanguage(Integer param0);
            
    /**
     * <p>id(0xe5)</p>
     * <p>vtableId(293)</p>
     */
    @ComProperty(name = "DefaultSheetDirection", dispId = 0xe5)
    Integer getDefaultSheetDirection();
            
    /**
     * <p>id(0xe5)</p>
     * <p>vtableId(294)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "DefaultSheetDirection", dispId = 0xe5)
    void setDefaultSheetDirection(Integer param0);
            
    /**
     * <p>id(0xe8)</p>
     * <p>vtableId(295)</p>
     */
    @ComProperty(name = "CursorMovement", dispId = 0xe8)
    Integer getCursorMovement();
            
    /**
     * <p>id(0xe8)</p>
     * <p>vtableId(296)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "CursorMovement", dispId = 0xe8)
    void setCursorMovement(Integer param0);
            
    /**
     * <p>id(0xe9)</p>
     * <p>vtableId(297)</p>
     */
    @ComProperty(name = "ControlCharacters", dispId = 0xe9)
    Boolean getControlCharacters();
            
    /**
     * <p>id(0xe9)</p>
     * <p>vtableId(298)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "ControlCharacters", dispId = 0xe9)
    void setControlCharacters(Boolean param0);
            
    /**
     * <p>id(0xa9)</p>
     * <p>vtableId(299)</p>
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
    @ComMethod(name = "_WSFunction", dispId = 0xa9)
    Object _WSFunction(Object Arg1,
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
     * <p>id(0x4bc)</p>
     * <p>vtableId(300)</p>
     */
    @ComProperty(name = "EnableEvents", dispId = 0x4bc)
    Boolean getEnableEvents();
            
    /**
     * <p>id(0x4bc)</p>
     * <p>vtableId(301)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "EnableEvents", dispId = 0x4bc)
    void setEnableEvents(Boolean param0);
            
    /**
     * <p>id(0x4bd)</p>
     * <p>vtableId(302)</p>
     */
    @ComProperty(name = "DisplayInfoWindow", dispId = 0x4bd)
    Boolean getDisplayInfoWindow();
            
    /**
     * <p>id(0x4bd)</p>
     * <p>vtableId(303)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "DisplayInfoWindow", dispId = 0x4bd)
    void setDisplayInfoWindow(Boolean param0);
            
    /**
     * <p>id(0x6ea)</p>
     * <p>vtableId(304)</p>
     * @param Time [in] {@code Object}
     */
    @ComMethod(name = "Wait", dispId = 0x6ea)
    Boolean Wait(Object Time);
            
    /**
     * <p>id(0x701)</p>
     * <p>vtableId(305)</p>
     */
    @ComProperty(name = "ExtendList", dispId = 0x701)
    Boolean getExtendList();
            
    /**
     * <p>id(0x701)</p>
     * <p>vtableId(306)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "ExtendList", dispId = 0x701)
    void setExtendList(Boolean param0);
            
    /**
     * <p>id(0x702)</p>
     * <p>vtableId(307)</p>
     */
    @ComProperty(name = "OLEDBErrors", dispId = 0x702)
    OLEDBErrors getOLEDBErrors();
            
    /**
     * <p>id(0x703)</p>
     * <p>vtableId(308)</p>
     * @param Text [in, optional] {@code Object}
     */
    @ComMethod(name = "GetPhonetic", dispId = 0x703)
    String GetPhonetic(Object Text);
            
    /**
     * <p>id(0x704)</p>
     * <p>vtableId(309)</p>
     */
    @ComProperty(name = "COMAddIns", dispId = 0x704)
    eu.doppel_helix.jna.tlb.office2.COMAddIns getCOMAddIns();
            
    /**
     * <p>id(0x705)</p>
     * <p>vtableId(310)</p>
     */
    @ComProperty(name = "DefaultWebOptions", dispId = 0x705)
    DefaultWebOptions getDefaultWebOptions();
            
    /**
     * <p>id(0x706)</p>
     * <p>vtableId(311)</p>
     */
    @ComProperty(name = "ProductCode", dispId = 0x706)
    String getProductCode();
            
    /**
     * <p>id(0x707)</p>
     * <p>vtableId(312)</p>
     */
    @ComProperty(name = "UserLibraryPath", dispId = 0x707)
    String getUserLibraryPath();
            
    /**
     * <p>id(0x708)</p>
     * <p>vtableId(313)</p>
     */
    @ComProperty(name = "AutoPercentEntry", dispId = 0x708)
    Boolean getAutoPercentEntry();
            
    /**
     * <p>id(0x708)</p>
     * <p>vtableId(314)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "AutoPercentEntry", dispId = 0x708)
    void setAutoPercentEntry(Boolean param0);
            
    /**
     * <p>id(0x709)</p>
     * <p>vtableId(315)</p>
     */
    @ComProperty(name = "LanguageSettings", dispId = 0x709)
    eu.doppel_helix.jna.tlb.office2.LanguageSettings getLanguageSettings();
            
    /**
     * <p>id(0x70a)</p>
     * <p>vtableId(316)</p>
     */
    @ComProperty(name = "Dummy101", dispId = 0x70a)
    com.sun.jna.platform.win32.COM.util.IDispatch getDummy101();
            
    /**
     * <p>id(0x70b)</p>
     * <p>vtableId(317)</p>
     * @param p1 [in] {@code PivotTable}
     * @param p2 [in] {@code PivotTable}
     */
    @ComMethod(name = "Dummy12", dispId = 0x70b)
    void Dummy12(PivotTable p1,
            PivotTable p2);
            
    /**
     * <p>id(0x70c)</p>
     * <p>vtableId(318)</p>
     */
    @ComProperty(name = "AnswerWizard", dispId = 0x70c)
    eu.doppel_helix.jna.tlb.office2.AnswerWizard getAnswerWizard();
            
    /**
     * <p>id(0x70d)</p>
     * <p>vtableId(319)</p>
     */
    @ComMethod(name = "CalculateFull", dispId = 0x70d)
    void CalculateFull();
            
    /**
     * <p>id(0x6eb)</p>
     * <p>vtableId(320)</p>
     */
    @ComMethod(name = "FindFile", dispId = 0x6eb)
    Boolean FindFile();
            
    /**
     * <p>id(0x70e)</p>
     * <p>vtableId(321)</p>
     */
    @ComProperty(name = "CalculationVersion", dispId = 0x70e)
    Integer getCalculationVersion();
            
    /**
     * <p>id(0x70f)</p>
     * <p>vtableId(322)</p>
     */
    @ComProperty(name = "ShowWindowsInTaskbar", dispId = 0x70f)
    Boolean getShowWindowsInTaskbar();
            
    /**
     * <p>id(0x70f)</p>
     * <p>vtableId(323)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "ShowWindowsInTaskbar", dispId = 0x70f)
    void setShowWindowsInTaskbar(Boolean param0);
            
    /**
     * <p>id(0x710)</p>
     * <p>vtableId(324)</p>
     */
    @ComProperty(name = "FeatureInstall", dispId = 0x710)
    eu.doppel_helix.jna.tlb.office2.MsoFeatureInstall getFeatureInstall();
            
    /**
     * <p>id(0x710)</p>
     * <p>vtableId(325)</p>
     * @param param0 [in] {@code eu.doppel_helix.jna.tlb.office2.MsoFeatureInstall}
     */
    @ComProperty(name = "FeatureInstall", dispId = 0x710)
    void setFeatureInstall(eu.doppel_helix.jna.tlb.office2.MsoFeatureInstall param0);
            
    /**
     * <p>id(0x78c)</p>
     * <p>vtableId(326)</p>
     */
    @ComProperty(name = "Ready", dispId = 0x78c)
    Boolean getReady();
            
    /**
     * <p>id(0x78d)</p>
     * <p>vtableId(327)</p>
     * @param Arg1 [in] {@code Object}
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
    @ComMethod(name = "Dummy13", dispId = 0x78d)
    Object Dummy13(Object Arg1,
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
     * <p>id(0x78e)</p>
     * <p>vtableId(328)</p>
     */
    @ComProperty(name = "FindFormat", dispId = 0x78e)
    CellFormat getFindFormat();
            
    /**
     * <p>id(0x78f)</p>
     * <p>vtableId(330)</p>
     */
    @ComProperty(name = "ReplaceFormat", dispId = 0x78f)
    CellFormat getReplaceFormat();
            
    /**
     * <p>id(0x790)</p>
     * <p>vtableId(332)</p>
     */
    @ComProperty(name = "UsedObjects", dispId = 0x790)
    UsedObjects getUsedObjects();
            
    /**
     * <p>id(0x791)</p>
     * <p>vtableId(333)</p>
     */
    @ComProperty(name = "CalculationState", dispId = 0x791)
    XlCalculationState getCalculationState();
            
    /**
     * <p>id(0x792)</p>
     * <p>vtableId(334)</p>
     */
    @ComProperty(name = "CalculationInterruptKey", dispId = 0x792)
    XlCalculationInterruptKey getCalculationInterruptKey();
            
    /**
     * <p>id(0x792)</p>
     * <p>vtableId(335)</p>
     * @param param0 [in] {@code XlCalculationInterruptKey}
     */
    @ComProperty(name = "CalculationInterruptKey", dispId = 0x792)
    void setCalculationInterruptKey(XlCalculationInterruptKey param0);
            
    /**
     * <p>id(0x793)</p>
     * <p>vtableId(336)</p>
     */
    @ComProperty(name = "Watches", dispId = 0x793)
    Watches getWatches();
            
    /**
     * <p>id(0x794)</p>
     * <p>vtableId(337)</p>
     */
    @ComProperty(name = "DisplayFunctionToolTips", dispId = 0x794)
    Boolean getDisplayFunctionToolTips();
            
    /**
     * <p>id(0x794)</p>
     * <p>vtableId(338)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "DisplayFunctionToolTips", dispId = 0x794)
    void setDisplayFunctionToolTips(Boolean param0);
            
    /**
     * <p>id(0x795)</p>
     * <p>vtableId(339)</p>
     */
    @ComProperty(name = "AutomationSecurity", dispId = 0x795)
    eu.doppel_helix.jna.tlb.office2.MsoAutomationSecurity getAutomationSecurity();
            
    /**
     * <p>id(0x795)</p>
     * <p>vtableId(340)</p>
     * @param param0 [in] {@code eu.doppel_helix.jna.tlb.office2.MsoAutomationSecurity}
     */
    @ComProperty(name = "AutomationSecurity", dispId = 0x795)
    void setAutomationSecurity(eu.doppel_helix.jna.tlb.office2.MsoAutomationSecurity param0);
            
    /**
     * <p>id(0x796)</p>
     * <p>vtableId(341)</p>
     * @param fileDialogType [in] {@code eu.doppel_helix.jna.tlb.office2.MsoFileDialogType}
     */
    @ComProperty(name = "FileDialog", dispId = 0x796)
    eu.doppel_helix.jna.tlb.office2.FileDialog getFileDialog(eu.doppel_helix.jna.tlb.office2.MsoFileDialogType fileDialogType);
            
    /**
     * <p>id(0x798)</p>
     * <p>vtableId(342)</p>
     */
    @ComMethod(name = "Dummy14", dispId = 0x798)
    void Dummy14();
            
    /**
     * <p>id(0x799)</p>
     * <p>vtableId(343)</p>
     */
    @ComMethod(name = "CalculateFullRebuild", dispId = 0x799)
    void CalculateFullRebuild();
            
    /**
     * <p>id(0x79a)</p>
     * <p>vtableId(344)</p>
     */
    @ComProperty(name = "DisplayPasteOptions", dispId = 0x79a)
    Boolean getDisplayPasteOptions();
            
    /**
     * <p>id(0x79a)</p>
     * <p>vtableId(345)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "DisplayPasteOptions", dispId = 0x79a)
    void setDisplayPasteOptions(Boolean param0);
            
    /**
     * <p>id(0x79b)</p>
     * <p>vtableId(346)</p>
     */
    @ComProperty(name = "DisplayInsertOptions", dispId = 0x79b)
    Boolean getDisplayInsertOptions();
            
    /**
     * <p>id(0x79b)</p>
     * <p>vtableId(347)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "DisplayInsertOptions", dispId = 0x79b)
    void setDisplayInsertOptions(Boolean param0);
            
    /**
     * <p>id(0x79c)</p>
     * <p>vtableId(348)</p>
     */
    @ComProperty(name = "GenerateGetPivotData", dispId = 0x79c)
    Boolean getGenerateGetPivotData();
            
    /**
     * <p>id(0x79c)</p>
     * <p>vtableId(349)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "GenerateGetPivotData", dispId = 0x79c)
    void setGenerateGetPivotData(Boolean param0);
            
    /**
     * <p>id(0x79d)</p>
     * <p>vtableId(350)</p>
     */
    @ComProperty(name = "AutoRecover", dispId = 0x79d)
    AutoRecover getAutoRecover();
            
    /**
     * <p>id(0x79e)</p>
     * <p>vtableId(351)</p>
     */
    @ComProperty(name = "Hwnd", dispId = 0x79e)
    Integer getHwnd();
            
    /**
     * <p>id(0x79f)</p>
     * <p>vtableId(352)</p>
     */
    @ComProperty(name = "Hinstance", dispId = 0x79f)
    Integer getHinstance();
            
    /**
     * <p>id(0x7a0)</p>
     * <p>vtableId(353)</p>
     * @param KeepAbort [in, optional] {@code Object}
     */
    @ComMethod(name = "CheckAbort", dispId = 0x7a0)
    void CheckAbort(Object KeepAbort);
            
    /**
     * <p>id(0x7a2)</p>
     * <p>vtableId(354)</p>
     */
    @ComProperty(name = "ErrorCheckingOptions", dispId = 0x7a2)
    ErrorCheckingOptions getErrorCheckingOptions();
            
    /**
     * <p>id(0x7a3)</p>
     * <p>vtableId(355)</p>
     */
    @ComProperty(name = "AutoFormatAsYouTypeReplaceHyperlinks", dispId = 0x7a3)
    Boolean getAutoFormatAsYouTypeReplaceHyperlinks();
            
    /**
     * <p>id(0x7a3)</p>
     * <p>vtableId(356)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "AutoFormatAsYouTypeReplaceHyperlinks", dispId = 0x7a3)
    void setAutoFormatAsYouTypeReplaceHyperlinks(Boolean param0);
            
    /**
     * <p>id(0x7a4)</p>
     * <p>vtableId(357)</p>
     */
    @ComProperty(name = "SmartTagRecognizers", dispId = 0x7a4)
    SmartTagRecognizers getSmartTagRecognizers();
            
    /**
     * <p>id(0x61d)</p>
     * <p>vtableId(358)</p>
     */
    @ComProperty(name = "NewWorkbook", dispId = 0x61d)
    eu.doppel_helix.jna.tlb.office2.NewFile getNewWorkbook();
            
    /**
     * <p>id(0x7a5)</p>
     * <p>vtableId(359)</p>
     */
    @ComProperty(name = "SpellingOptions", dispId = 0x7a5)
    SpellingOptions getSpellingOptions();
            
    /**
     * <p>id(0x7a6)</p>
     * <p>vtableId(360)</p>
     */
    @ComProperty(name = "Speech", dispId = 0x7a6)
    Speech getSpeech();
            
    /**
     * <p>id(0x7a7)</p>
     * <p>vtableId(361)</p>
     */
    @ComProperty(name = "MapPaperSize", dispId = 0x7a7)
    Boolean getMapPaperSize();
            
    /**
     * <p>id(0x7a7)</p>
     * <p>vtableId(362)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "MapPaperSize", dispId = 0x7a7)
    void setMapPaperSize(Boolean param0);
            
    /**
     * <p>id(0x7a8)</p>
     * <p>vtableId(363)</p>
     */
    @ComProperty(name = "ShowStartupDialog", dispId = 0x7a8)
    Boolean getShowStartupDialog();
            
    /**
     * <p>id(0x7a8)</p>
     * <p>vtableId(364)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "ShowStartupDialog", dispId = 0x7a8)
    void setShowStartupDialog(Boolean param0);
            
    /**
     * <p>id(0x711)</p>
     * <p>vtableId(365)</p>
     */
    @ComProperty(name = "DecimalSeparator", dispId = 0x711)
    String getDecimalSeparator();
            
    /**
     * <p>id(0x711)</p>
     * <p>vtableId(366)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "DecimalSeparator", dispId = 0x711)
    void setDecimalSeparator(String param0);
            
    /**
     * <p>id(0x712)</p>
     * <p>vtableId(367)</p>
     */
    @ComProperty(name = "ThousandsSeparator", dispId = 0x712)
    String getThousandsSeparator();
            
    /**
     * <p>id(0x712)</p>
     * <p>vtableId(368)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "ThousandsSeparator", dispId = 0x712)
    void setThousandsSeparator(String param0);
            
    /**
     * <p>id(0x7a9)</p>
     * <p>vtableId(369)</p>
     */
    @ComProperty(name = "UseSystemSeparators", dispId = 0x7a9)
    Boolean getUseSystemSeparators();
            
    /**
     * <p>id(0x7a9)</p>
     * <p>vtableId(370)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "UseSystemSeparators", dispId = 0x7a9)
    void setUseSystemSeparators(Boolean param0);
            
    /**
     * <p>id(0x7aa)</p>
     * <p>vtableId(371)</p>
     */
    @ComProperty(name = "ThisCell", dispId = 0x7aa)
    Range getThisCell();
            
    /**
     * <p>id(0x7ab)</p>
     * <p>vtableId(372)</p>
     */
    @ComProperty(name = "RTD", dispId = 0x7ab)
    RTD getRTD();
            
    /**
     * <p>id(0x8cb)</p>
     * <p>vtableId(373)</p>
     */
    @ComProperty(name = "DisplayDocumentActionTaskPane", dispId = 0x8cb)
    Boolean getDisplayDocumentActionTaskPane();
            
    /**
     * <p>id(0x8cb)</p>
     * <p>vtableId(374)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "DisplayDocumentActionTaskPane", dispId = 0x8cb)
    void setDisplayDocumentActionTaskPane(Boolean param0);
            
    /**
     * <p>id(0x8cc)</p>
     * <p>vtableId(375)</p>
     * @param XmlMap [in, optional] {@code Object}
     */
    @ComMethod(name = "DisplayXMLSourcePane", dispId = 0x8cc)
    void DisplayXMLSourcePane(Object XmlMap);
            
    /**
     * <p>id(0x8ce)</p>
     * <p>vtableId(376)</p>
     */
    @ComProperty(name = "ArbitraryXMLSupportAvailable", dispId = 0x8ce)
    Boolean getArbitraryXMLSupportAvailable();
            
    /**
     * <p>id(0x8cf)</p>
     * <p>vtableId(377)</p>
     * @param Object [in] {@code com.sun.jna.platform.win32.COM.util.IDispatch}
     * @param ID [in] {@code Integer}
     * @param arg [in, optional] {@code Object}
     */
    @ComMethod(name = "Support", dispId = 0x8cf)
    Object Support(com.sun.jna.platform.win32.COM.util.IDispatch Object,
            Integer ID,
            Object arg);
            
    /**
     * <p>id(0x945)</p>
     * <p>vtableId(378)</p>
     * @param grfCompareFunctions [in] {@code Integer}
     */
    @ComMethod(name = "Dummy20", dispId = 0x945)
    Object Dummy20(Integer grfCompareFunctions);
            
    /**
     * <p>id(0x947)</p>
     * <p>vtableId(379)</p>
     */
    @ComProperty(name = "MeasurementUnit", dispId = 0x947)
    Integer getMeasurementUnit();
            
    /**
     * <p>id(0x947)</p>
     * <p>vtableId(380)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "MeasurementUnit", dispId = 0x947)
    void setMeasurementUnit(Integer param0);
            
    /**
     * <p>id(0x948)</p>
     * <p>vtableId(381)</p>
     */
    @ComProperty(name = "ShowSelectionFloaties", dispId = 0x948)
    Boolean getShowSelectionFloaties();
            
    /**
     * <p>id(0x948)</p>
     * <p>vtableId(382)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "ShowSelectionFloaties", dispId = 0x948)
    void setShowSelectionFloaties(Boolean param0);
            
    /**
     * <p>id(0x949)</p>
     * <p>vtableId(383)</p>
     */
    @ComProperty(name = "ShowMenuFloaties", dispId = 0x949)
    Boolean getShowMenuFloaties();
            
    /**
     * <p>id(0x949)</p>
     * <p>vtableId(384)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "ShowMenuFloaties", dispId = 0x949)
    void setShowMenuFloaties(Boolean param0);
            
    /**
     * <p>id(0x94a)</p>
     * <p>vtableId(385)</p>
     */
    @ComProperty(name = "ShowDevTools", dispId = 0x94a)
    Boolean getShowDevTools();
            
    /**
     * <p>id(0x94a)</p>
     * <p>vtableId(386)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "ShowDevTools", dispId = 0x94a)
    void setShowDevTools(Boolean param0);
            
    /**
     * <p>id(0x94b)</p>
     * <p>vtableId(387)</p>
     */
    @ComProperty(name = "EnableLivePreview", dispId = 0x94b)
    Boolean getEnableLivePreview();
            
    /**
     * <p>id(0x94b)</p>
     * <p>vtableId(388)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "EnableLivePreview", dispId = 0x94b)
    void setEnableLivePreview(Boolean param0);
            
    /**
     * <p>id(0x94c)</p>
     * <p>vtableId(389)</p>
     */
    @ComProperty(name = "DisplayDocumentInformationPanel", dispId = 0x94c)
    Boolean getDisplayDocumentInformationPanel();
            
    /**
     * <p>id(0x94c)</p>
     * <p>vtableId(390)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "DisplayDocumentInformationPanel", dispId = 0x94c)
    void setDisplayDocumentInformationPanel(Boolean param0);
            
    /**
     * <p>id(0x94d)</p>
     * <p>vtableId(391)</p>
     */
    @ComProperty(name = "AlwaysUseClearType", dispId = 0x94d)
    Boolean getAlwaysUseClearType();
            
    /**
     * <p>id(0x94d)</p>
     * <p>vtableId(392)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "AlwaysUseClearType", dispId = 0x94d)
    void setAlwaysUseClearType(Boolean param0);
            
    /**
     * <p>id(0x94e)</p>
     * <p>vtableId(393)</p>
     */
    @ComProperty(name = "WarnOnFunctionNameConflict", dispId = 0x94e)
    Boolean getWarnOnFunctionNameConflict();
            
    /**
     * <p>id(0x94e)</p>
     * <p>vtableId(394)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "WarnOnFunctionNameConflict", dispId = 0x94e)
    void setWarnOnFunctionNameConflict(Boolean param0);
            
    /**
     * <p>id(0x94f)</p>
     * <p>vtableId(395)</p>
     */
    @ComProperty(name = "FormulaBarHeight", dispId = 0x94f)
    Integer getFormulaBarHeight();
            
    /**
     * <p>id(0x94f)</p>
     * <p>vtableId(396)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "FormulaBarHeight", dispId = 0x94f)
    void setFormulaBarHeight(Integer param0);
            
    /**
     * <p>id(0x950)</p>
     * <p>vtableId(397)</p>
     */
    @ComProperty(name = "DisplayFormulaAutoComplete", dispId = 0x950)
    Boolean getDisplayFormulaAutoComplete();
            
    /**
     * <p>id(0x950)</p>
     * <p>vtableId(398)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "DisplayFormulaAutoComplete", dispId = 0x950)
    void setDisplayFormulaAutoComplete(Boolean param0);
            
    /**
     * <p>id(0x951)</p>
     * <p>vtableId(399)</p>
     */
    @ComProperty(name = "GenerateTableRefs", dispId = 0x951)
    XlGenerateTableRefs getGenerateTableRefs();
            
    /**
     * <p>id(0x951)</p>
     * <p>vtableId(400)</p>
     * @param param0 [in] {@code XlGenerateTableRefs}
     */
    @ComProperty(name = "GenerateTableRefs", dispId = 0x951)
    void setGenerateTableRefs(XlGenerateTableRefs param0);
            
    /**
     * <p>id(0x952)</p>
     * <p>vtableId(401)</p>
     */
    @ComProperty(name = "Assistance", dispId = 0x952)
    eu.doppel_helix.jna.tlb.office2.IAssistance getAssistance();
            
    /**
     * <p>id(0x953)</p>
     * <p>vtableId(402)</p>
     */
    @ComMethod(name = "CalculateUntilAsyncQueriesDone", dispId = 0x953)
    void CalculateUntilAsyncQueriesDone();
            
    /**
     * <p>id(0x954)</p>
     * <p>vtableId(403)</p>
     */
    @ComProperty(name = "EnableLargeOperationAlert", dispId = 0x954)
    Boolean getEnableLargeOperationAlert();
            
    /**
     * <p>id(0x954)</p>
     * <p>vtableId(404)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "EnableLargeOperationAlert", dispId = 0x954)
    void setEnableLargeOperationAlert(Boolean param0);
            
    /**
     * <p>id(0x955)</p>
     * <p>vtableId(405)</p>
     */
    @ComProperty(name = "LargeOperationCellThousandCount", dispId = 0x955)
    Integer getLargeOperationCellThousandCount();
            
    /**
     * <p>id(0x955)</p>
     * <p>vtableId(406)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "LargeOperationCellThousandCount", dispId = 0x955)
    void setLargeOperationCellThousandCount(Integer param0);
            
    /**
     * <p>id(0x956)</p>
     * <p>vtableId(407)</p>
     */
    @ComProperty(name = "DeferAsyncQueries", dispId = 0x956)
    Boolean getDeferAsyncQueries();
            
    /**
     * <p>id(0x956)</p>
     * <p>vtableId(408)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "DeferAsyncQueries", dispId = 0x956)
    void setDeferAsyncQueries(Boolean param0);
            
    /**
     * <p>id(0x957)</p>
     * <p>vtableId(409)</p>
     */
    @ComProperty(name = "MultiThreadedCalculation", dispId = 0x957)
    MultiThreadedCalculation getMultiThreadedCalculation();
            
    /**
     * <p>id(0x958)</p>
     * <p>vtableId(410)</p>
     * @param bstrUrl [in] {@code String}
     */
    @ComMethod(name = "SharePointVersion", dispId = 0x958)
    Integer SharePointVersion(String bstrUrl);
            
    /**
     * <p>id(0x95a)</p>
     * <p>vtableId(411)</p>
     */
    @ComProperty(name = "ActiveEncryptionSession", dispId = 0x95a)
    Integer getActiveEncryptionSession();
            
    /**
     * <p>id(0x95b)</p>
     * <p>vtableId(412)</p>
     */
    @ComProperty(name = "HighQualityModeForGraphics", dispId = 0x95b)
    Boolean getHighQualityModeForGraphics();
            
    /**
     * <p>id(0x95b)</p>
     * <p>vtableId(413)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "HighQualityModeForGraphics", dispId = 0x95b)
    void setHighQualityModeForGraphics(Boolean param0);
            
    /**
     * <p>id(0xad0)</p>
     * <p>vtableId(414)</p>
     */
    @ComProperty(name = "FileExportConverters", dispId = 0xad0)
    FileExportConverters getFileExportConverters();
            
    /**
     * <p>id(0xad4)</p>
     * <p>vtableId(415)</p>
     */
    @ComProperty(name = "SmartArtLayouts", dispId = 0xad4)
    eu.doppel_helix.jna.tlb.office2.SmartArtLayouts getSmartArtLayouts();
            
    /**
     * <p>id(0xad5)</p>
     * <p>vtableId(416)</p>
     */
    @ComProperty(name = "SmartArtQuickStyles", dispId = 0xad5)
    eu.doppel_helix.jna.tlb.office2.SmartArtQuickStyles getSmartArtQuickStyles();
            
    /**
     * <p>id(0xad6)</p>
     * <p>vtableId(417)</p>
     */
    @ComProperty(name = "SmartArtColors", dispId = 0xad6)
    eu.doppel_helix.jna.tlb.office2.SmartArtColors getSmartArtColors();
            
    /**
     * <p>id(0xad7)</p>
     * <p>vtableId(418)</p>
     */
    @ComProperty(name = "AddIns2", dispId = 0xad7)
    AddIns2 getAddIns2();
            
    /**
     * <p>id(0xad8)</p>
     * <p>vtableId(419)</p>
     */
    @ComProperty(name = "PrintCommunication", dispId = 0xad8)
    Boolean getPrintCommunication();
            
    /**
     * <p>id(0xad8)</p>
     * <p>vtableId(420)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "PrintCommunication", dispId = 0xad8)
    void setPrintCommunication(Boolean param0);
            
    /**
     * <p>id(0xad2)</p>
     * <p>vtableId(421)</p>
     * @param Macro [in, optional] {@code Object}
     * @param Description [in, optional] {@code Object}
     * @param HasMenu [in, optional] {@code Object}
     * @param MenuText [in, optional] {@code Object}
     * @param HasShortcutKey [in, optional] {@code Object}
     * @param ShortcutKey [in, optional] {@code Object}
     * @param Category [in, optional] {@code Object}
     * @param StatusBar [in, optional] {@code Object}
     * @param HelpContextID [in, optional] {@code Object}
     * @param HelpFile [in, optional] {@code Object}
     * @param ArgumentDescriptions [in, optional] {@code Object}
     */
    @ComMethod(name = "MacroOptions", dispId = 0xad2)
    void MacroOptions(Object Macro,
            Object Description,
            Object HasMenu,
            Object MenuText,
            Object HasShortcutKey,
            Object ShortcutKey,
            Object Category,
            Object StatusBar,
            Object HelpContextID,
            Object HelpFile,
            Object ArgumentDescriptions);
            
    /**
     * <p>id(0xada)</p>
     * <p>vtableId(422)</p>
     */
    @ComProperty(name = "UseClusterConnector", dispId = 0xada)
    Boolean getUseClusterConnector();
            
    /**
     * <p>id(0xada)</p>
     * <p>vtableId(423)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "UseClusterConnector", dispId = 0xada)
    void setUseClusterConnector(Boolean param0);
            
    /**
     * <p>id(0xadb)</p>
     * <p>vtableId(424)</p>
     */
    @ComProperty(name = "ClusterConnector", dispId = 0xadb)
    String getClusterConnector();
            
    /**
     * <p>id(0xadb)</p>
     * <p>vtableId(425)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "ClusterConnector", dispId = 0xadb)
    void setClusterConnector(String param0);
            
    /**
     * <p>id(0xadc)</p>
     * <p>vtableId(426)</p>
     */
    @ComProperty(name = "Quitting", dispId = 0xadc)
    Boolean getQuitting();
            
    /**
     * <p>id(0xadd)</p>
     * <p>vtableId(427)</p>
     */
    @ComProperty(name = "Dummy22", dispId = 0xadd)
    Boolean getDummy22();
            
    /**
     * <p>id(0xadd)</p>
     * <p>vtableId(428)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "Dummy22", dispId = 0xadd)
    void setDummy22(Boolean param0);
            
    /**
     * <p>id(0xade)</p>
     * <p>vtableId(429)</p>
     */
    @ComProperty(name = "Dummy23", dispId = 0xade)
    Boolean getDummy23();
            
    /**
     * <p>id(0xade)</p>
     * <p>vtableId(430)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "Dummy23", dispId = 0xade)
    void setDummy23(Boolean param0);
            
    /**
     * <p>id(0xadf)</p>
     * <p>vtableId(431)</p>
     */
    @ComProperty(name = "ProtectedViewWindows", dispId = 0xadf)
    ProtectedViewWindows getProtectedViewWindows();
            
    /**
     * <p>id(0xae0)</p>
     * <p>vtableId(432)</p>
     */
    @ComProperty(name = "ActiveProtectedViewWindow", dispId = 0xae0)
    ProtectedViewWindow getActiveProtectedViewWindow();
            
    /**
     * <p>id(0xae1)</p>
     * <p>vtableId(433)</p>
     */
    @ComProperty(name = "IsSandboxed", dispId = 0xae1)
    Boolean getIsSandboxed();
            
    /**
     * <p>id(0xae2)</p>
     * <p>vtableId(434)</p>
     */
    @ComProperty(name = "SaveISO8601Dates", dispId = 0xae2)
    Boolean getSaveISO8601Dates();
            
    /**
     * <p>id(0xae2)</p>
     * <p>vtableId(435)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "SaveISO8601Dates", dispId = 0xae2)
    void setSaveISO8601Dates(Boolean param0);
            
    /**
     * <p>id(0xae3)</p>
     * <p>vtableId(436)</p>
     */
    @ComProperty(name = "HinstancePtr", dispId = 0xae3)
    Object getHinstancePtr();
            
    /**
     * <p>id(0xae4)</p>
     * <p>vtableId(437)</p>
     */
    @ComProperty(name = "FileValidation", dispId = 0xae4)
    eu.doppel_helix.jna.tlb.office2.MsoFileValidationMode getFileValidation();
            
    /**
     * <p>id(0xae4)</p>
     * <p>vtableId(438)</p>
     * @param param0 [in] {@code eu.doppel_helix.jna.tlb.office2.MsoFileValidationMode}
     */
    @ComProperty(name = "FileValidation", dispId = 0xae4)
    void setFileValidation(eu.doppel_helix.jna.tlb.office2.MsoFileValidationMode param0);
            
    /**
     * <p>id(0xae5)</p>
     * <p>vtableId(439)</p>
     */
    @ComProperty(name = "FileValidationPivot", dispId = 0xae5)
    XlFileValidationPivotMode getFileValidationPivot();
            
    /**
     * <p>id(0xae5)</p>
     * <p>vtableId(440)</p>
     * @param param0 [in] {@code XlFileValidationPivotMode}
     */
    @ComProperty(name = "FileValidationPivot", dispId = 0xae5)
    void setFileValidationPivot(XlFileValidationPivotMode param0);
            
    /**
     * <p>id(0xbb2)</p>
     * <p>vtableId(441)</p>
     */
    @ComProperty(name = "ShowQuickAnalysis", dispId = 0xbb2)
    Boolean getShowQuickAnalysis();
            
    /**
     * <p>id(0xbb2)</p>
     * <p>vtableId(442)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "ShowQuickAnalysis", dispId = 0xbb2)
    void setShowQuickAnalysis(Boolean param0);
            
    /**
     * <p>id(0xbb3)</p>
     * <p>vtableId(443)</p>
     */
    @ComProperty(name = "QuickAnalysis", dispId = 0xbb3)
    QuickAnalysis getQuickAnalysis();
            
    /**
     * <p>id(0xbb4)</p>
     * <p>vtableId(444)</p>
     */
    @ComProperty(name = "FlashFill", dispId = 0xbb4)
    Boolean getFlashFill();
            
    /**
     * <p>id(0xbb4)</p>
     * <p>vtableId(445)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "FlashFill", dispId = 0xbb4)
    void setFlashFill(Boolean param0);
            
    /**
     * <p>id(0xbb5)</p>
     * <p>vtableId(446)</p>
     */
    @ComProperty(name = "EnableMacroAnimations", dispId = 0xbb5)
    Boolean getEnableMacroAnimations();
            
    /**
     * <p>id(0xbb5)</p>
     * <p>vtableId(447)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "EnableMacroAnimations", dispId = 0xbb5)
    void setEnableMacroAnimations(Boolean param0);
            
    /**
     * <p>id(0xbb6)</p>
     * <p>vtableId(448)</p>
     */
    @ComProperty(name = "ChartDataPointTrack", dispId = 0xbb6)
    Boolean getChartDataPointTrack();
            
    /**
     * <p>id(0xbb6)</p>
     * <p>vtableId(449)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "ChartDataPointTrack", dispId = 0xbb6)
    void setChartDataPointTrack(Boolean param0);
            
    /**
     * <p>id(0xbb7)</p>
     * <p>vtableId(450)</p>
     */
    @ComProperty(name = "FlashFillMode", dispId = 0xbb7)
    Boolean getFlashFillMode();
            
    /**
     * <p>id(0xbb7)</p>
     * <p>vtableId(451)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "FlashFillMode", dispId = 0xbb7)
    void setFlashFillMode(Boolean param0);
            
    /**
     * <p>id(0xbb8)</p>
     * <p>vtableId(452)</p>
     */
    @ComProperty(name = "MergeInstances", dispId = 0xbb8)
    Boolean getMergeInstances();
            
    /**
     * <p>id(0xbb8)</p>
     * <p>vtableId(453)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "MergeInstances", dispId = 0xbb8)
    void setMergeInstances(Boolean param0);
            
    /**
     * <p>id(0xc56)</p>
     * <p>vtableId(454)</p>
     */
    @ComProperty(name = "EnableCheckFileExtensions", dispId = 0xc56)
    Boolean getEnableCheckFileExtensions();
            
    /**
     * <p>id(0xc56)</p>
     * <p>vtableId(455)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "EnableCheckFileExtensions", dispId = 0xc56)
    void setEnableCheckFileExtensions(Boolean param0);
            
    
}