
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
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * <p>id(0x130)</p>
     * <p>vtableId(10)</p>
     */
    @ComMethod(name = "Activate", dispId = 0x130)
    void Activate();
            
    /**
     * <p>id(0x227)</p>
     * <p>vtableId(11)</p>
     * @param Before [in, optional] {@code Object}
     * @param After [in, optional] {@code Object}
     */
    @ComMethod(name = "Copy", dispId = 0x227)
    void Copy(Object Before,
            Object After);
            
    /**
     * <p>id(0x75)</p>
     * <p>vtableId(12)</p>
     */
    @ComMethod(name = "Delete", dispId = 0x75)
    void Delete();
            
    /**
     * <p>id(0x55d)</p>
     * <p>vtableId(13)</p>
     */
    @ComProperty(name = "CodeName", dispId = 0x55d)
    String getCodeName();
            
    /**
     * <p>id(0x80010000)</p>
     * <p>vtableId(14)</p>
     */
    @ComProperty(name = "_CodeName", dispId = 0x80010000)
    String get_CodeName();
            
    /**
     * <p>id(0x80010000)</p>
     * <p>vtableId(15)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "_CodeName", dispId = 0x80010000)
    void set_CodeName(String param0);
            
    /**
     * <p>id(0x1e6)</p>
     * <p>vtableId(16)</p>
     */
    @ComProperty(name = "Index", dispId = 0x1e6)
    Integer getIndex();
            
    /**
     * <p>id(0x27d)</p>
     * <p>vtableId(17)</p>
     * @param Before [in, optional] {@code Object}
     * @param After [in, optional] {@code Object}
     */
    @ComMethod(name = "Move", dispId = 0x27d)
    void Move(Object Before,
            Object After);
            
    /**
     * <p>id(0x6e)</p>
     * <p>vtableId(18)</p>
     */
    @ComProperty(name = "Name", dispId = 0x6e)
    String getName();
            
    /**
     * <p>id(0x6e)</p>
     * <p>vtableId(19)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "Name", dispId = 0x6e)
    void setName(String param0);
            
    /**
     * <p>id(0x1f6)</p>
     * <p>vtableId(20)</p>
     */
    @ComProperty(name = "Next", dispId = 0x1f6)
    com.sun.jna.platform.win32.COM.util.IDispatch getNext();
            
    /**
     * <p>id(0x274)</p>
     * <p>vtableId(21)</p>
     */
    @ComProperty(name = "OnDoubleClick", dispId = 0x274)
    String getOnDoubleClick();
            
    /**
     * <p>id(0x274)</p>
     * <p>vtableId(22)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "OnDoubleClick", dispId = 0x274)
    void setOnDoubleClick(String param0);
            
    /**
     * <p>id(0x407)</p>
     * <p>vtableId(23)</p>
     */
    @ComProperty(name = "OnSheetActivate", dispId = 0x407)
    String getOnSheetActivate();
            
    /**
     * <p>id(0x407)</p>
     * <p>vtableId(24)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "OnSheetActivate", dispId = 0x407)
    void setOnSheetActivate(String param0);
            
    /**
     * <p>id(0x439)</p>
     * <p>vtableId(25)</p>
     */
    @ComProperty(name = "OnSheetDeactivate", dispId = 0x439)
    String getOnSheetDeactivate();
            
    /**
     * <p>id(0x439)</p>
     * <p>vtableId(26)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "OnSheetDeactivate", dispId = 0x439)
    void setOnSheetDeactivate(String param0);
            
    /**
     * <p>id(0x3e6)</p>
     * <p>vtableId(27)</p>
     */
    @ComProperty(name = "PageSetup", dispId = 0x3e6)
    PageSetup getPageSetup();
            
    /**
     * <p>id(0x1f7)</p>
     * <p>vtableId(28)</p>
     */
    @ComProperty(name = "Previous", dispId = 0x1f7)
    com.sun.jna.platform.win32.COM.util.IDispatch getPrevious();
            
    /**
     * <p>id(0x389)</p>
     * <p>vtableId(29)</p>
     * @param From [in, optional] {@code Object}
     * @param To [in, optional] {@code Object}
     * @param Copies [in, optional] {@code Object}
     * @param Preview [in, optional] {@code Object}
     * @param ActivePrinter [in, optional] {@code Object}
     * @param PrintToFile [in, optional] {@code Object}
     * @param Collate [in, optional] {@code Object}
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
     * <p>vtableId(30)</p>
     * @param EnableChanges [in, optional] {@code Object}
     */
    @ComMethod(name = "PrintPreview", dispId = 0x119)
    void PrintPreview(Object EnableChanges);
            
    /**
     * <p>id(0x11a)</p>
     * <p>vtableId(31)</p>
     * @param Password [in, optional] {@code Object}
     * @param DrawingObjects [in, optional] {@code Object}
     * @param Contents [in, optional] {@code Object}
     * @param Scenarios [in, optional] {@code Object}
     * @param UserInterfaceOnly [in, optional] {@code Object}
     */
    @ComMethod(name = "_Protect", dispId = 0x11a)
    void _Protect(Object Password,
            Object DrawingObjects,
            Object Contents,
            Object Scenarios,
            Object UserInterfaceOnly);
            
    /**
     * <p>id(0x124)</p>
     * <p>vtableId(32)</p>
     */
    @ComProperty(name = "ProtectContents", dispId = 0x124)
    Boolean getProtectContents();
            
    /**
     * <p>id(0x125)</p>
     * <p>vtableId(33)</p>
     */
    @ComProperty(name = "ProtectDrawingObjects", dispId = 0x125)
    Boolean getProtectDrawingObjects();
            
    /**
     * <p>id(0x487)</p>
     * <p>vtableId(34)</p>
     */
    @ComProperty(name = "ProtectionMode", dispId = 0x487)
    Boolean getProtectionMode();
            
    /**
     * <p>id(0x126)</p>
     * <p>vtableId(35)</p>
     */
    @ComProperty(name = "ProtectScenarios", dispId = 0x126)
    Boolean getProtectScenarios();
            
    /**
     * <p>id(0x11c)</p>
     * <p>vtableId(36)</p>
     * @param Filename [in] {@code String}
     * @param FileFormat [in, optional] {@code Object}
     * @param Password [in, optional] {@code Object}
     * @param WriteResPassword [in, optional] {@code Object}
     * @param ReadOnlyRecommended [in, optional] {@code Object}
     * @param CreateBackup [in, optional] {@code Object}
     * @param AddToMru [in, optional] {@code Object}
     * @param TextCodepage [in, optional] {@code Object}
     * @param TextVisualLayout [in, optional] {@code Object}
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
     * <p>vtableId(37)</p>
     * @param Replace [in, optional] {@code Object}
     */
    @ComMethod(name = "Select", dispId = 0xeb)
    void Select(Object Replace);
            
    /**
     * <p>id(0x11d)</p>
     * <p>vtableId(38)</p>
     * @param Password [in, optional] {@code Object}
     */
    @ComMethod(name = "Unprotect", dispId = 0x11d)
    void Unprotect(Object Password);
            
    /**
     * <p>id(0x22e)</p>
     * <p>vtableId(39)</p>
     */
    @ComProperty(name = "Visible", dispId = 0x22e)
    XlSheetVisibility getVisible();
            
    /**
     * <p>id(0x22e)</p>
     * <p>vtableId(40)</p>
     * @param param0 [in] {@code XlSheetVisibility}
     */
    @ComProperty(name = "Visible", dispId = 0x22e)
    void setVisible(XlSheetVisibility param0);
            
    /**
     * <p>id(0x561)</p>
     * <p>vtableId(41)</p>
     */
    @ComProperty(name = "Shapes", dispId = 0x561)
    Shapes getShapes();
            
    /**
     * <p>id(0x1001d)</p>
     * <p>vtableId(42)</p>
     */
    @ComMethod(name = "_Dummy29", dispId = 0x1001d)
    void _Dummy29();
            
    /**
     * <p>id(0x2f8)</p>
     * <p>vtableId(43)</p>
     * @param Index [in, optional] {@code Object}
     */
    @ComMethod(name = "Arcs", dispId = 0x2f8)
    com.sun.jna.platform.win32.COM.util.IDispatch Arcs(Object Index);
            
    /**
     * <p>id(0x1001f)</p>
     * <p>vtableId(44)</p>
     */
    @ComMethod(name = "_Dummy31", dispId = 0x1001f)
    void _Dummy31();
            
    /**
     * <p>id(0x10020)</p>
     * <p>vtableId(45)</p>
     */
    @ComMethod(name = "_Dummy32", dispId = 0x10020)
    void _Dummy32();
            
    /**
     * <p>id(0x22d)</p>
     * <p>vtableId(46)</p>
     * @param Index [in, optional] {@code Object}
     */
    @ComMethod(name = "Buttons", dispId = 0x22d)
    com.sun.jna.platform.win32.COM.util.IDispatch Buttons(Object Index);
            
    /**
     * <p>id(0x10022)</p>
     * <p>vtableId(47)</p>
     */
    @ComMethod(name = "_Dummy34", dispId = 0x10022)
    void _Dummy34();
            
    /**
     * <p>id(0x590)</p>
     * <p>vtableId(48)</p>
     */
    @ComProperty(name = "EnableCalculation", dispId = 0x590)
    Boolean getEnableCalculation();
            
    /**
     * <p>id(0x590)</p>
     * <p>vtableId(49)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "EnableCalculation", dispId = 0x590)
    void setEnableCalculation(Boolean param0);
            
    /**
     * <p>id(0x10024)</p>
     * <p>vtableId(50)</p>
     */
    @ComMethod(name = "_Dummy36", dispId = 0x10024)
    void _Dummy36();
            
    /**
     * <p>id(0x424)</p>
     * <p>vtableId(51)</p>
     * @param Index [in, optional] {@code Object}
     */
    @ComMethod(name = "ChartObjects", dispId = 0x424)
    com.sun.jna.platform.win32.COM.util.IDispatch ChartObjects(Object Index);
            
    /**
     * <p>id(0x338)</p>
     * <p>vtableId(52)</p>
     * @param Index [in, optional] {@code Object}
     */
    @ComMethod(name = "CheckBoxes", dispId = 0x338)
    com.sun.jna.platform.win32.COM.util.IDispatch CheckBoxes(Object Index);
            
    /**
     * <p>id(0x1f9)</p>
     * <p>vtableId(53)</p>
     * @param CustomDictionary [in, optional] {@code Object}
     * @param IgnoreUppercase [in, optional] {@code Object}
     * @param AlwaysSuggest [in, optional] {@code Object}
     * @param SpellLang [in, optional] {@code Object}
     */
    @ComMethod(name = "CheckSpelling", dispId = 0x1f9)
    void CheckSpelling(Object CustomDictionary,
            Object IgnoreUppercase,
            Object AlwaysSuggest,
            Object SpellLang);
            
    /**
     * <p>id(0x10028)</p>
     * <p>vtableId(54)</p>
     */
    @ComMethod(name = "_Dummy40", dispId = 0x10028)
    void _Dummy40();
            
    /**
     * <p>id(0x10029)</p>
     * <p>vtableId(55)</p>
     */
    @ComMethod(name = "_Dummy41", dispId = 0x10029)
    void _Dummy41();
            
    /**
     * <p>id(0x1002a)</p>
     * <p>vtableId(56)</p>
     */
    @ComMethod(name = "_Dummy42", dispId = 0x1002a)
    void _Dummy42();
            
    /**
     * <p>id(0x1002b)</p>
     * <p>vtableId(57)</p>
     */
    @ComMethod(name = "_Dummy43", dispId = 0x1002b)
    void _Dummy43();
            
    /**
     * <p>id(0x1002c)</p>
     * <p>vtableId(58)</p>
     */
    @ComMethod(name = "_Dummy44", dispId = 0x1002c)
    void _Dummy44();
            
    /**
     * <p>id(0x1002d)</p>
     * <p>vtableId(59)</p>
     */
    @ComMethod(name = "_Dummy45", dispId = 0x1002d)
    void _Dummy45();
            
    /**
     * <p>id(0x283)</p>
     * <p>vtableId(60)</p>
     */
    @ComProperty(name = "DisplayAutomaticPageBreaks", dispId = 0x283)
    Boolean getDisplayAutomaticPageBreaks();
            
    /**
     * <p>id(0x283)</p>
     * <p>vtableId(61)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "DisplayAutomaticPageBreaks", dispId = 0x283)
    void setDisplayAutomaticPageBreaks(Boolean param0);
            
    /**
     * <p>id(0x304)</p>
     * <p>vtableId(62)</p>
     * @param Index [in, optional] {@code Object}
     */
    @ComMethod(name = "Drawings", dispId = 0x304)
    com.sun.jna.platform.win32.COM.util.IDispatch Drawings(Object Index);
            
    /**
     * <p>id(0x58)</p>
     * <p>vtableId(63)</p>
     * @param Index [in, optional] {@code Object}
     */
    @ComMethod(name = "DrawingObjects", dispId = 0x58)
    com.sun.jna.platform.win32.COM.util.IDispatch DrawingObjects(Object Index);
            
    /**
     * <p>id(0x344)</p>
     * <p>vtableId(64)</p>
     * @param Index [in, optional] {@code Object}
     */
    @ComMethod(name = "DropDowns", dispId = 0x344)
    com.sun.jna.platform.win32.COM.util.IDispatch DropDowns(Object Index);
            
    /**
     * <p>id(0x484)</p>
     * <p>vtableId(65)</p>
     */
    @ComProperty(name = "EnableAutoFilter", dispId = 0x484)
    Boolean getEnableAutoFilter();
            
    /**
     * <p>id(0x484)</p>
     * <p>vtableId(66)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "EnableAutoFilter", dispId = 0x484)
    void setEnableAutoFilter(Boolean param0);
            
    /**
     * <p>id(0x591)</p>
     * <p>vtableId(67)</p>
     */
    @ComProperty(name = "EnableSelection", dispId = 0x591)
    XlEnableSelection getEnableSelection();
            
    /**
     * <p>id(0x591)</p>
     * <p>vtableId(68)</p>
     * @param param0 [in] {@code XlEnableSelection}
     */
    @ComProperty(name = "EnableSelection", dispId = 0x591)
    void setEnableSelection(XlEnableSelection param0);
            
    /**
     * <p>id(0x485)</p>
     * <p>vtableId(69)</p>
     */
    @ComProperty(name = "EnableOutlining", dispId = 0x485)
    Boolean getEnableOutlining();
            
    /**
     * <p>id(0x485)</p>
     * <p>vtableId(70)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "EnableOutlining", dispId = 0x485)
    void setEnableOutlining(Boolean param0);
            
    /**
     * <p>id(0x486)</p>
     * <p>vtableId(71)</p>
     */
    @ComProperty(name = "EnablePivotTable", dispId = 0x486)
    Boolean getEnablePivotTable();
            
    /**
     * <p>id(0x486)</p>
     * <p>vtableId(72)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "EnablePivotTable", dispId = 0x486)
    void setEnablePivotTable(Boolean param0);
            
    /**
     * <p>id(0x1)</p>
     * <p>vtableId(73)</p>
     * @param Name [in] {@code Object}
     */
    @ComMethod(name = "Evaluate", dispId = 0x1)
    Object Evaluate(Object Name);
            
    /**
     * <p>id(0xfffffffb)</p>
     * <p>vtableId(74)</p>
     * @param Name [in] {@code Object}
     */
    @ComMethod(name = "_Evaluate", dispId = 0xfffffffb)
    Object _Evaluate(Object Name);
            
    /**
     * <p>id(0x10038)</p>
     * <p>vtableId(75)</p>
     */
    @ComMethod(name = "_Dummy56", dispId = 0x10038)
    void _Dummy56();
            
    /**
     * <p>id(0x592)</p>
     * <p>vtableId(76)</p>
     */
    @ComMethod(name = "ResetAllPageBreaks", dispId = 0x592)
    void ResetAllPageBreaks();
            
    /**
     * <p>id(0x342)</p>
     * <p>vtableId(77)</p>
     * @param Index [in, optional] {@code Object}
     */
    @ComMethod(name = "GroupBoxes", dispId = 0x342)
    com.sun.jna.platform.win32.COM.util.IDispatch GroupBoxes(Object Index);
            
    /**
     * <p>id(0x459)</p>
     * <p>vtableId(78)</p>
     * @param Index [in, optional] {@code Object}
     */
    @ComMethod(name = "GroupObjects", dispId = 0x459)
    com.sun.jna.platform.win32.COM.util.IDispatch GroupObjects(Object Index);
            
    /**
     * <p>id(0x349)</p>
     * <p>vtableId(79)</p>
     * @param Index [in, optional] {@code Object}
     */
    @ComMethod(name = "Labels", dispId = 0x349)
    com.sun.jna.platform.win32.COM.util.IDispatch Labels(Object Index);
            
    /**
     * <p>id(0x2ff)</p>
     * <p>vtableId(80)</p>
     * @param Index [in, optional] {@code Object}
     */
    @ComMethod(name = "Lines", dispId = 0x2ff)
    com.sun.jna.platform.win32.COM.util.IDispatch Lines(Object Index);
            
    /**
     * <p>id(0x340)</p>
     * <p>vtableId(81)</p>
     * @param Index [in, optional] {@code Object}
     */
    @ComMethod(name = "ListBoxes", dispId = 0x340)
    com.sun.jna.platform.win32.COM.util.IDispatch ListBoxes(Object Index);
            
    /**
     * <p>id(0x1ba)</p>
     * <p>vtableId(82)</p>
     */
    @ComProperty(name = "Names", dispId = 0x1ba)
    Names getNames();
            
    /**
     * <p>id(0x31f)</p>
     * <p>vtableId(83)</p>
     * @param Index [in, optional] {@code Object}
     */
    @ComMethod(name = "OLEObjects", dispId = 0x31f)
    com.sun.jna.platform.win32.COM.util.IDispatch OLEObjects(Object Index);
            
    /**
     * <p>id(0x10041)</p>
     * <p>vtableId(84)</p>
     */
    @ComMethod(name = "_Dummy65", dispId = 0x10041)
    void _Dummy65();
            
    /**
     * <p>id(0x10042)</p>
     * <p>vtableId(85)</p>
     */
    @ComMethod(name = "_Dummy66", dispId = 0x10042)
    void _Dummy66();
            
    /**
     * <p>id(0x10043)</p>
     * <p>vtableId(86)</p>
     */
    @ComMethod(name = "_Dummy67", dispId = 0x10043)
    void _Dummy67();
            
    /**
     * <p>id(0x33a)</p>
     * <p>vtableId(87)</p>
     * @param Index [in, optional] {@code Object}
     */
    @ComMethod(name = "OptionButtons", dispId = 0x33a)
    com.sun.jna.platform.win32.COM.util.IDispatch OptionButtons(Object Index);
            
    /**
     * <p>id(0x10045)</p>
     * <p>vtableId(88)</p>
     */
    @ComMethod(name = "_Dummy69", dispId = 0x10045)
    void _Dummy69();
            
    /**
     * <p>id(0x321)</p>
     * <p>vtableId(89)</p>
     * @param Index [in, optional] {@code Object}
     */
    @ComMethod(name = "Ovals", dispId = 0x321)
    com.sun.jna.platform.win32.COM.util.IDispatch Ovals(Object Index);
            
    /**
     * <p>id(0xd3)</p>
     * <p>vtableId(90)</p>
     * @param Destination [in, optional] {@code Object}
     * @param Link [in, optional] {@code Object}
     */
    @ComMethod(name = "Paste", dispId = 0xd3)
    void Paste(Object Destination,
            Object Link);
            
    /**
     * <p>id(0x403)</p>
     * <p>vtableId(91)</p>
     * @param Format [in, optional] {@code Object}
     * @param Link [in, optional] {@code Object}
     * @param DisplayAsIcon [in, optional] {@code Object}
     * @param IconFileName [in, optional] {@code Object}
     * @param IconIndex [in, optional] {@code Object}
     * @param IconLabel [in, optional] {@code Object}
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
     * <p>vtableId(92)</p>
     * @param Index [in, optional] {@code Object}
     */
    @ComMethod(name = "Pictures", dispId = 0x303)
    com.sun.jna.platform.win32.COM.util.IDispatch Pictures(Object Index);
            
    /**
     * <p>id(0x1004a)</p>
     * <p>vtableId(93)</p>
     */
    @ComMethod(name = "_Dummy74", dispId = 0x1004a)
    void _Dummy74();
            
    /**
     * <p>id(0x1004b)</p>
     * <p>vtableId(94)</p>
     */
    @ComMethod(name = "_Dummy75", dispId = 0x1004b)
    void _Dummy75();
            
    /**
     * <p>id(0x1004c)</p>
     * <p>vtableId(95)</p>
     */
    @ComMethod(name = "_Dummy76", dispId = 0x1004c)
    void _Dummy76();
            
    /**
     * <p>id(0x306)</p>
     * <p>vtableId(96)</p>
     * @param Index [in, optional] {@code Object}
     */
    @ComMethod(name = "Rectangles", dispId = 0x306)
    com.sun.jna.platform.win32.COM.util.IDispatch Rectangles(Object Index);
            
    /**
     * <p>id(0x1004e)</p>
     * <p>vtableId(97)</p>
     */
    @ComMethod(name = "_Dummy78", dispId = 0x1004e)
    void _Dummy78();
            
    /**
     * <p>id(0x1004f)</p>
     * <p>vtableId(98)</p>
     */
    @ComMethod(name = "_Dummy79", dispId = 0x1004f)
    void _Dummy79();
            
    /**
     * <p>id(0x599)</p>
     * <p>vtableId(99)</p>
     */
    @ComProperty(name = "ScrollArea", dispId = 0x599)
    String getScrollArea();
            
    /**
     * <p>id(0x599)</p>
     * <p>vtableId(100)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "ScrollArea", dispId = 0x599)
    void setScrollArea(String param0);
            
    /**
     * <p>id(0x33e)</p>
     * <p>vtableId(101)</p>
     * @param Index [in, optional] {@code Object}
     */
    @ComMethod(name = "ScrollBars", dispId = 0x33e)
    com.sun.jna.platform.win32.COM.util.IDispatch ScrollBars(Object Index);
            
    /**
     * <p>id(0x10052)</p>
     * <p>vtableId(102)</p>
     */
    @ComMethod(name = "_Dummy82", dispId = 0x10052)
    void _Dummy82();
            
    /**
     * <p>id(0x10053)</p>
     * <p>vtableId(103)</p>
     */
    @ComMethod(name = "_Dummy83", dispId = 0x10053)
    void _Dummy83();
            
    /**
     * <p>id(0x346)</p>
     * <p>vtableId(104)</p>
     * @param Index [in, optional] {@code Object}
     */
    @ComMethod(name = "Spinners", dispId = 0x346)
    com.sun.jna.platform.win32.COM.util.IDispatch Spinners(Object Index);
            
    /**
     * <p>id(0x10055)</p>
     * <p>vtableId(105)</p>
     */
    @ComMethod(name = "_Dummy85", dispId = 0x10055)
    void _Dummy85();
            
    /**
     * <p>id(0x10056)</p>
     * <p>vtableId(106)</p>
     */
    @ComMethod(name = "_Dummy86", dispId = 0x10056)
    void _Dummy86();
            
    /**
     * <p>id(0x309)</p>
     * <p>vtableId(107)</p>
     * @param Index [in, optional] {@code Object}
     */
    @ComMethod(name = "TextBoxes", dispId = 0x309)
    com.sun.jna.platform.win32.COM.util.IDispatch TextBoxes(Object Index);
            
    /**
     * <p>id(0x10058)</p>
     * <p>vtableId(108)</p>
     */
    @ComMethod(name = "_Dummy88", dispId = 0x10058)
    void _Dummy88();
            
    /**
     * <p>id(0x10059)</p>
     * <p>vtableId(109)</p>
     */
    @ComMethod(name = "_Dummy89", dispId = 0x10059)
    void _Dummy89();
            
    /**
     * <p>id(0x1005a)</p>
     * <p>vtableId(110)</p>
     */
    @ComMethod(name = "_Dummy90", dispId = 0x1005a)
    void _Dummy90();
            
    /**
     * <p>id(0x58a)</p>
     * <p>vtableId(111)</p>
     */
    @ComProperty(name = "HPageBreaks", dispId = 0x58a)
    HPageBreaks getHPageBreaks();
            
    /**
     * <p>id(0x58b)</p>
     * <p>vtableId(112)</p>
     */
    @ComProperty(name = "VPageBreaks", dispId = 0x58b)
    VPageBreaks getVPageBreaks();
            
    /**
     * <p>id(0x59a)</p>
     * <p>vtableId(113)</p>
     */
    @ComProperty(name = "QueryTables", dispId = 0x59a)
    QueryTables getQueryTables();
            
    /**
     * <p>id(0x59b)</p>
     * <p>vtableId(114)</p>
     */
    @ComProperty(name = "DisplayPageBreaks", dispId = 0x59b)
    Boolean getDisplayPageBreaks();
            
    /**
     * <p>id(0x59b)</p>
     * <p>vtableId(115)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "DisplayPageBreaks", dispId = 0x59b)
    void setDisplayPageBreaks(Boolean param0);
            
    /**
     * <p>id(0x23f)</p>
     * <p>vtableId(116)</p>
     */
    @ComProperty(name = "Comments", dispId = 0x23f)
    Comments getComments();
            
    /**
     * <p>id(0x571)</p>
     * <p>vtableId(117)</p>
     */
    @ComProperty(name = "Hyperlinks", dispId = 0x571)
    Hyperlinks getHyperlinks();
            
    /**
     * <p>id(0x59c)</p>
     * <p>vtableId(118)</p>
     */
    @ComMethod(name = "ClearCircles", dispId = 0x59c)
    void ClearCircles();
            
    /**
     * <p>id(0x59d)</p>
     * <p>vtableId(119)</p>
     */
    @ComMethod(name = "CircleInvalid", dispId = 0x59d)
    void CircleInvalid();
            
    /**
     * <p>id(0x288)</p>
     * <p>vtableId(120)</p>
     */
    @ComProperty(name = "_DisplayRightToLeft", dispId = 0x288)
    Integer get_DisplayRightToLeft();
            
    /**
     * <p>id(0x288)</p>
     * <p>vtableId(121)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "_DisplayRightToLeft", dispId = 0x288)
    void set_DisplayRightToLeft(Integer param0);
            
    /**
     * <p>id(0x319)</p>
     * <p>vtableId(122)</p>
     */
    @ComProperty(name = "AutoFilter", dispId = 0x319)
    AutoFilter getAutoFilter();
            
    /**
     * <p>id(0x6ee)</p>
     * <p>vtableId(123)</p>
     */
    @ComProperty(name = "DisplayRightToLeft", dispId = 0x6ee)
    Boolean getDisplayRightToLeft();
            
    /**
     * <p>id(0x6ee)</p>
     * <p>vtableId(124)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "DisplayRightToLeft", dispId = 0x6ee)
    void setDisplayRightToLeft(Boolean param0);
            
    /**
     * <p>id(0x718)</p>
     * <p>vtableId(125)</p>
     */
    @ComProperty(name = "Scripts", dispId = 0x718)
    eu.doppel_helix.jna.tlb.office2.Scripts getScripts();
            
    /**
     * <p>id(0x6ec)</p>
     * <p>vtableId(126)</p>
     * @param From [in, optional] {@code Object}
     * @param To [in, optional] {@code Object}
     * @param Copies [in, optional] {@code Object}
     * @param Preview [in, optional] {@code Object}
     * @param ActivePrinter [in, optional] {@code Object}
     * @param PrintToFile [in, optional] {@code Object}
     * @param Collate [in, optional] {@code Object}
     * @param PrToFileName [in, optional] {@code Object}
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
     * <p>vtableId(127)</p>
     * @param CustomDictionary [in, optional] {@code Object}
     * @param IgnoreUppercase [in, optional] {@code Object}
     * @param AlwaysSuggest [in, optional] {@code Object}
     * @param SpellLang [in, optional] {@code Object}
     * @param IgnoreFinalYaa [in, optional] {@code Object}
     * @param SpellScript [in, optional] {@code Object}
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
     * <p>vtableId(128)</p>
     */
    @ComProperty(name = "Tab", dispId = 0x411)
    Tab getTab();
            
    /**
     * <p>id(0x7e5)</p>
     * <p>vtableId(129)</p>
     */
    @ComProperty(name = "MailEnvelope", dispId = 0x7e5)
    eu.doppel_helix.jna.tlb.office2.MsoEnvelope getMailEnvelope();
            
    /**
     * <p>id(0x785)</p>
     * <p>vtableId(130)</p>
     * @param Filename [in] {@code String}
     * @param FileFormat [in, optional] {@code Object}
     * @param Password [in, optional] {@code Object}
     * @param WriteResPassword [in, optional] {@code Object}
     * @param ReadOnlyRecommended [in, optional] {@code Object}
     * @param CreateBackup [in, optional] {@code Object}
     * @param AddToMru [in, optional] {@code Object}
     * @param TextCodepage [in, optional] {@code Object}
     * @param TextVisualLayout [in, optional] {@code Object}
     * @param Local [in, optional] {@code Object}
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
     * <p>vtableId(131)</p>
     */
    @ComProperty(name = "CustomProperties", dispId = 0x7ee)
    CustomProperties getCustomProperties();
            
    /**
     * <p>id(0x7e0)</p>
     * <p>vtableId(132)</p>
     */
    @ComProperty(name = "SmartTags", dispId = 0x7e0)
    SmartTags getSmartTags();
            
    /**
     * <p>id(0xb0)</p>
     * <p>vtableId(133)</p>
     */
    @ComProperty(name = "Protection", dispId = 0xb0)
    Protection getProtection();
            
    /**
     * <p>id(0x788)</p>
     * <p>vtableId(134)</p>
     * @param Format [in, optional] {@code Object}
     * @param Link [in, optional] {@code Object}
     * @param DisplayAsIcon [in, optional] {@code Object}
     * @param IconFileName [in, optional] {@code Object}
     * @param IconIndex [in, optional] {@code Object}
     * @param IconLabel [in, optional] {@code Object}
     * @param NoHTMLFormatting [in, optional] {@code Object}
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
     * <p>vtableId(135)</p>
     * @param Password [in, optional] {@code Object}
     * @param DrawingObjects [in, optional] {@code Object}
     * @param Contents [in, optional] {@code Object}
     * @param Scenarios [in, optional] {@code Object}
     * @param UserInterfaceOnly [in, optional] {@code Object}
     * @param AllowFormattingCells [in, optional] {@code Object}
     * @param AllowFormattingColumns [in, optional] {@code Object}
     * @param AllowFormattingRows [in, optional] {@code Object}
     * @param AllowInsertingColumns [in, optional] {@code Object}
     * @param AllowInsertingRows [in, optional] {@code Object}
     * @param AllowInsertingHyperlinks [in, optional] {@code Object}
     * @param AllowDeletingColumns [in, optional] {@code Object}
     * @param AllowDeletingRows [in, optional] {@code Object}
     * @param AllowSorting [in, optional] {@code Object}
     * @param AllowFiltering [in, optional] {@code Object}
     * @param AllowUsingPivotTables [in, optional] {@code Object}
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
     * <p>vtableId(136)</p>
     */
    @ComMethod(name = "_Dummy113", dispId = 0x10071)
    void _Dummy113();
            
    /**
     * <p>id(0x10072)</p>
     * <p>vtableId(137)</p>
     */
    @ComMethod(name = "_Dummy114", dispId = 0x10072)
    void _Dummy114();
            
    /**
     * <p>id(0x10073)</p>
     * <p>vtableId(138)</p>
     */
    @ComMethod(name = "_Dummy115", dispId = 0x10073)
    void _Dummy115();
            
    /**
     * <p>id(0x939)</p>
     * <p>vtableId(139)</p>
     * @param From [in, optional] {@code Object}
     * @param To [in, optional] {@code Object}
     * @param Copies [in, optional] {@code Object}
     * @param Preview [in, optional] {@code Object}
     * @param ActivePrinter [in, optional] {@code Object}
     * @param PrintToFile [in, optional] {@code Object}
     * @param Collate [in, optional] {@code Object}
     * @param PrToFileName [in, optional] {@code Object}
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
     * <p>vtableId(140)</p>
     */
    @ComProperty(name = "EnableFormatConditionsCalculation", dispId = 0x9cf)
    Boolean getEnableFormatConditionsCalculation();
            
    /**
     * <p>id(0x9cf)</p>
     * <p>vtableId(141)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "EnableFormatConditionsCalculation", dispId = 0x9cf)
    void setEnableFormatConditionsCalculation(Boolean param0);
            
    /**
     * <p>id(0x370)</p>
     * <p>vtableId(142)</p>
     */
    @ComProperty(name = "Sort", dispId = 0x370)
    Sort getSort();
            
    /**
     * <p>id(0x9bd)</p>
     * <p>vtableId(143)</p>
     * @param Type [in] {@code XlFixedFormatType}
     * @param Filename [in, optional] {@code Object}
     * @param Quality [in, optional] {@code Object}
     * @param IncludeDocProperties [in, optional] {@code Object}
     * @param IgnorePrintAreas [in, optional] {@code Object}
     * @param From [in, optional] {@code Object}
     * @param To [in, optional] {@code Object}
     * @param OpenAfterPublish [in, optional] {@code Object}
     * @param FixedFormatExtClassPtr [in, optional] {@code Object}
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
     * <p>vtableId(144)</p>
     */
    @ComProperty(name = "PrintedCommentPages", dispId = 0xb29)
    Integer getPrintedCommentPages();
            
    /**
     * <p>id(0x359)</p>
     * <p>vtableId(145)</p>
     */
    @ComProperty(name = "DefaultButton", dispId = 0x359)
    Object getDefaultButton();
            
    /**
     * <p>id(0x359)</p>
     * <p>vtableId(146)</p>
     * @param param0 [in] {@code Object}
     */
    @ComProperty(name = "DefaultButton", dispId = 0x359)
    void setDefaultButton(Object param0);
            
    /**
     * <p>id(0x347)</p>
     * <p>vtableId(147)</p>
     */
    @ComProperty(name = "DialogFrame", dispId = 0x347)
    DialogFrame getDialogFrame();
            
    /**
     * <p>id(0x33c)</p>
     * <p>vtableId(148)</p>
     * @param Index [in, optional] {@code Object}
     */
    @ComMethod(name = "EditBoxes", dispId = 0x33c)
    com.sun.jna.platform.win32.COM.util.IDispatch EditBoxes(Object Index);
            
    /**
     * <p>id(0x32e)</p>
     * <p>vtableId(149)</p>
     */
    @ComProperty(name = "Focus", dispId = 0x32e)
    Object getFocus();
            
    /**
     * <p>id(0x32e)</p>
     * <p>vtableId(150)</p>
     * @param param0 [in] {@code Object}
     */
    @ComProperty(name = "Focus", dispId = 0x32e)
    void setFocus(Object param0);
            
    /**
     * <p>id(0x32d)</p>
     * <p>vtableId(151)</p>
     * @param Cancel [in, optional] {@code Object}
     */
    @ComMethod(name = "Hide", dispId = 0x32d)
    Boolean Hide(Object Cancel);
            
    /**
     * <p>id(0x1f0)</p>
     * <p>vtableId(152)</p>
     */
    @ComMethod(name = "Show", dispId = 0x1f0)
    Boolean Show();
            
    
}