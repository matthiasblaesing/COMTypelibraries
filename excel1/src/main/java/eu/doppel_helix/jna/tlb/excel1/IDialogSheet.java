
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
     * <p>vtableId(7)</p>
     * @param RHS [out] {@code Application}
     */
    @ComProperty(name = "Application", dispId = 0x94)
    com.sun.jna.platform.win32.WinNT.HRESULT getApplication(VARIANT RHS);
            
    /**
     * <p>id(0x95)</p>
     * <p>vtableId(8)</p>
     * @param RHS [out] {@code XlCreator}
     */
    @ComProperty(name = "Creator", dispId = 0x95)
    com.sun.jna.platform.win32.WinNT.HRESULT getCreator(VARIANT RHS);
            
    /**
     * <p>id(0x96)</p>
     * <p>vtableId(9)</p>
     * @param RHS [out] {@code com.sun.jna.platform.win32.COM.util.IDispatch}
     */
    @ComProperty(name = "Parent", dispId = 0x96)
    com.sun.jna.platform.win32.WinNT.HRESULT getParent(VARIANT RHS);
            
    /**
     * <p>id(0x130)</p>
     * <p>vtableId(10)</p>
     * @param lcid [in] {@code Integer}
     */
    @ComMethod(name = "Activate", dispId = 0x130)
    com.sun.jna.platform.win32.WinNT.HRESULT Activate(Integer lcid);
            
    /**
     * <p>id(0x227)</p>
     * <p>vtableId(11)</p>
     * @param Before [in, optional] {@code Object}
     * @param After [in, optional] {@code Object}
     * @param lcid [in] {@code Integer}
     */
    @ComMethod(name = "Copy", dispId = 0x227)
    com.sun.jna.platform.win32.WinNT.HRESULT Copy(Object Before,
            Object After,
            Integer lcid);
            
    /**
     * <p>id(0x75)</p>
     * <p>vtableId(12)</p>
     * @param lcid [in] {@code Integer}
     */
    @ComMethod(name = "Delete", dispId = 0x75)
    com.sun.jna.platform.win32.WinNT.HRESULT Delete(Integer lcid);
            
    /**
     * <p>id(0x55d)</p>
     * <p>vtableId(13)</p>
     * @param RHS [out] {@code String}
     */
    @ComProperty(name = "CodeName", dispId = 0x55d)
    com.sun.jna.platform.win32.WinNT.HRESULT getCodeName(VARIANT RHS);
            
    /**
     * <p>id(0x80010000)</p>
     * <p>vtableId(14)</p>
     * @param RHS [out] {@code String}
     */
    @ComProperty(name = "_CodeName", dispId = 0x80010000)
    com.sun.jna.platform.win32.WinNT.HRESULT get_CodeName(VARIANT RHS);
            
    /**
     * <p>id(0x80010000)</p>
     * <p>vtableId(15)</p>
     * @param RHS [in] {@code String}
     */
    @ComProperty(name = "_CodeName", dispId = 0x80010000)
    com.sun.jna.platform.win32.WinNT.HRESULT set_CodeName(String RHS);
            
    /**
     * <p>id(0x1e6)</p>
     * <p>vtableId(16)</p>
     * @param lcid [in] {@code Integer}
     * @param RHS [out] {@code Integer}
     */
    @ComProperty(name = "Index", dispId = 0x1e6)
    com.sun.jna.platform.win32.WinNT.HRESULT getIndex(Integer lcid,
            VARIANT RHS);
            
    /**
     * <p>id(0x27d)</p>
     * <p>vtableId(17)</p>
     * @param Before [in, optional] {@code Object}
     * @param After [in, optional] {@code Object}
     * @param lcid [in] {@code Integer}
     */
    @ComMethod(name = "Move", dispId = 0x27d)
    com.sun.jna.platform.win32.WinNT.HRESULT Move(Object Before,
            Object After,
            Integer lcid);
            
    /**
     * <p>id(0x6e)</p>
     * <p>vtableId(18)</p>
     * @param RHS [out] {@code String}
     */
    @ComProperty(name = "Name", dispId = 0x6e)
    com.sun.jna.platform.win32.WinNT.HRESULT getName(VARIANT RHS);
            
    /**
     * <p>id(0x6e)</p>
     * <p>vtableId(19)</p>
     * @param RHS [in] {@code String}
     */
    @ComProperty(name = "Name", dispId = 0x6e)
    com.sun.jna.platform.win32.WinNT.HRESULT setName(String RHS);
            
    /**
     * <p>id(0x1f6)</p>
     * <p>vtableId(20)</p>
     * @param RHS [out] {@code com.sun.jna.platform.win32.COM.util.IDispatch}
     */
    @ComProperty(name = "Next", dispId = 0x1f6)
    com.sun.jna.platform.win32.WinNT.HRESULT getNext(VARIANT RHS);
            
    /**
     * <p>id(0x274)</p>
     * <p>vtableId(21)</p>
     * @param lcid [in] {@code Integer}
     * @param RHS [out] {@code String}
     */
    @ComProperty(name = "OnDoubleClick", dispId = 0x274)
    com.sun.jna.platform.win32.WinNT.HRESULT getOnDoubleClick(Integer lcid,
            VARIANT RHS);
            
    /**
     * <p>id(0x274)</p>
     * <p>vtableId(22)</p>
     * @param lcid [in] {@code Integer}
     * @param RHS [in] {@code String}
     */
    @ComProperty(name = "OnDoubleClick", dispId = 0x274)
    com.sun.jna.platform.win32.WinNT.HRESULT setOnDoubleClick(Integer lcid,
            String RHS);
            
    /**
     * <p>id(0x407)</p>
     * <p>vtableId(23)</p>
     * @param lcid [in] {@code Integer}
     * @param RHS [out] {@code String}
     */
    @ComProperty(name = "OnSheetActivate", dispId = 0x407)
    com.sun.jna.platform.win32.WinNT.HRESULT getOnSheetActivate(Integer lcid,
            VARIANT RHS);
            
    /**
     * <p>id(0x407)</p>
     * <p>vtableId(24)</p>
     * @param lcid [in] {@code Integer}
     * @param RHS [in] {@code String}
     */
    @ComProperty(name = "OnSheetActivate", dispId = 0x407)
    com.sun.jna.platform.win32.WinNT.HRESULT setOnSheetActivate(Integer lcid,
            String RHS);
            
    /**
     * <p>id(0x439)</p>
     * <p>vtableId(25)</p>
     * @param lcid [in] {@code Integer}
     * @param RHS [out] {@code String}
     */
    @ComProperty(name = "OnSheetDeactivate", dispId = 0x439)
    com.sun.jna.platform.win32.WinNT.HRESULT getOnSheetDeactivate(Integer lcid,
            VARIANT RHS);
            
    /**
     * <p>id(0x439)</p>
     * <p>vtableId(26)</p>
     * @param lcid [in] {@code Integer}
     * @param RHS [in] {@code String}
     */
    @ComProperty(name = "OnSheetDeactivate", dispId = 0x439)
    com.sun.jna.platform.win32.WinNT.HRESULT setOnSheetDeactivate(Integer lcid,
            String RHS);
            
    /**
     * <p>id(0x3e6)</p>
     * <p>vtableId(27)</p>
     * @param RHS [out] {@code PageSetup}
     */
    @ComProperty(name = "PageSetup", dispId = 0x3e6)
    com.sun.jna.platform.win32.WinNT.HRESULT getPageSetup(VARIANT RHS);
            
    /**
     * <p>id(0x1f7)</p>
     * <p>vtableId(28)</p>
     * @param RHS [out] {@code com.sun.jna.platform.win32.COM.util.IDispatch}
     */
    @ComProperty(name = "Previous", dispId = 0x1f7)
    com.sun.jna.platform.win32.WinNT.HRESULT getPrevious(VARIANT RHS);
            
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
     * @param lcid [in] {@code Integer}
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
     * <p>vtableId(30)</p>
     * @param EnableChanges [in, optional] {@code Object}
     * @param lcid [in] {@code Integer}
     */
    @ComMethod(name = "PrintPreview", dispId = 0x119)
    com.sun.jna.platform.win32.WinNT.HRESULT PrintPreview(Object EnableChanges,
            Integer lcid);
            
    /**
     * <p>id(0x11a)</p>
     * <p>vtableId(31)</p>
     * @param Password [in, optional] {@code Object}
     * @param DrawingObjects [in, optional] {@code Object}
     * @param Contents [in, optional] {@code Object}
     * @param Scenarios [in, optional] {@code Object}
     * @param UserInterfaceOnly [in, optional] {@code Object}
     * @param lcid [in] {@code Integer}
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
     * <p>vtableId(32)</p>
     * @param lcid [in] {@code Integer}
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "ProtectContents", dispId = 0x124)
    com.sun.jna.platform.win32.WinNT.HRESULT getProtectContents(Integer lcid,
            VARIANT RHS);
            
    /**
     * <p>id(0x125)</p>
     * <p>vtableId(33)</p>
     * @param lcid [in] {@code Integer}
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "ProtectDrawingObjects", dispId = 0x125)
    com.sun.jna.platform.win32.WinNT.HRESULT getProtectDrawingObjects(Integer lcid,
            VARIANT RHS);
            
    /**
     * <p>id(0x487)</p>
     * <p>vtableId(34)</p>
     * @param lcid [in] {@code Integer}
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "ProtectionMode", dispId = 0x487)
    com.sun.jna.platform.win32.WinNT.HRESULT getProtectionMode(Integer lcid,
            VARIANT RHS);
            
    /**
     * <p>id(0x126)</p>
     * <p>vtableId(35)</p>
     * @param lcid [in] {@code Integer}
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "ProtectScenarios", dispId = 0x126)
    com.sun.jna.platform.win32.WinNT.HRESULT getProtectScenarios(Integer lcid,
            VARIANT RHS);
            
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
     * @param lcid [in] {@code Integer}
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
     * <p>vtableId(37)</p>
     * @param Replace [in, optional] {@code Object}
     * @param lcid [in] {@code Integer}
     */
    @ComMethod(name = "Select", dispId = 0xeb)
    com.sun.jna.platform.win32.WinNT.HRESULT Select(Object Replace,
            Integer lcid);
            
    /**
     * <p>id(0x11d)</p>
     * <p>vtableId(38)</p>
     * @param Password [in, optional] {@code Object}
     * @param lcid [in] {@code Integer}
     */
    @ComMethod(name = "Unprotect", dispId = 0x11d)
    com.sun.jna.platform.win32.WinNT.HRESULT Unprotect(Object Password,
            Integer lcid);
            
    /**
     * <p>id(0x22e)</p>
     * <p>vtableId(39)</p>
     * @param lcid [in] {@code Integer}
     * @param RHS [out] {@code XlSheetVisibility}
     */
    @ComProperty(name = "Visible", dispId = 0x22e)
    com.sun.jna.platform.win32.WinNT.HRESULT getVisible(Integer lcid,
            VARIANT RHS);
            
    /**
     * <p>id(0x22e)</p>
     * <p>vtableId(40)</p>
     * @param lcid [in] {@code Integer}
     * @param RHS [in] {@code XlSheetVisibility}
     */
    @ComProperty(name = "Visible", dispId = 0x22e)
    com.sun.jna.platform.win32.WinNT.HRESULT setVisible(Integer lcid,
            XlSheetVisibility RHS);
            
    /**
     * <p>id(0x561)</p>
     * <p>vtableId(41)</p>
     * @param RHS [out] {@code Shapes}
     */
    @ComProperty(name = "Shapes", dispId = 0x561)
    com.sun.jna.platform.win32.WinNT.HRESULT getShapes(VARIANT RHS);
            
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
     * @param lcid [in] {@code Integer}
     * @param RHS [out] {@code com.sun.jna.platform.win32.COM.util.IDispatch}
     */
    @ComMethod(name = "Arcs", dispId = 0x2f8)
    com.sun.jna.platform.win32.WinNT.HRESULT Arcs(Object Index,
            Integer lcid,
            VARIANT RHS);
            
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
     * @param lcid [in] {@code Integer}
     * @param RHS [out] {@code com.sun.jna.platform.win32.COM.util.IDispatch}
     */
    @ComMethod(name = "Buttons", dispId = 0x22d)
    com.sun.jna.platform.win32.WinNT.HRESULT Buttons(Object Index,
            Integer lcid,
            VARIANT RHS);
            
    /**
     * <p>id(0x10022)</p>
     * <p>vtableId(47)</p>
     */
    @ComMethod(name = "_Dummy34", dispId = 0x10022)
    void _Dummy34();
            
    /**
     * <p>id(0x590)</p>
     * <p>vtableId(48)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "EnableCalculation", dispId = 0x590)
    com.sun.jna.platform.win32.WinNT.HRESULT getEnableCalculation(VARIANT RHS);
            
    /**
     * <p>id(0x590)</p>
     * <p>vtableId(49)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "EnableCalculation", dispId = 0x590)
    com.sun.jna.platform.win32.WinNT.HRESULT setEnableCalculation(Boolean RHS);
            
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
     * @param lcid [in] {@code Integer}
     * @param RHS [out] {@code com.sun.jna.platform.win32.COM.util.IDispatch}
     */
    @ComMethod(name = "ChartObjects", dispId = 0x424)
    com.sun.jna.platform.win32.WinNT.HRESULT ChartObjects(Object Index,
            Integer lcid,
            VARIANT RHS);
            
    /**
     * <p>id(0x338)</p>
     * <p>vtableId(52)</p>
     * @param Index [in, optional] {@code Object}
     * @param lcid [in] {@code Integer}
     * @param RHS [out] {@code com.sun.jna.platform.win32.COM.util.IDispatch}
     */
    @ComMethod(name = "CheckBoxes", dispId = 0x338)
    com.sun.jna.platform.win32.WinNT.HRESULT CheckBoxes(Object Index,
            Integer lcid,
            VARIANT RHS);
            
    /**
     * <p>id(0x1f9)</p>
     * <p>vtableId(53)</p>
     * @param CustomDictionary [in, optional] {@code Object}
     * @param IgnoreUppercase [in, optional] {@code Object}
     * @param AlwaysSuggest [in, optional] {@code Object}
     * @param SpellLang [in, optional] {@code Object}
     * @param lcid [in] {@code Integer}
     */
    @ComMethod(name = "CheckSpelling", dispId = 0x1f9)
    com.sun.jna.platform.win32.WinNT.HRESULT CheckSpelling(Object CustomDictionary,
            Object IgnoreUppercase,
            Object AlwaysSuggest,
            Object SpellLang,
            Integer lcid);
            
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
     * @param lcid [in] {@code Integer}
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "DisplayAutomaticPageBreaks", dispId = 0x283)
    com.sun.jna.platform.win32.WinNT.HRESULT getDisplayAutomaticPageBreaks(Integer lcid,
            VARIANT RHS);
            
    /**
     * <p>id(0x283)</p>
     * <p>vtableId(61)</p>
     * @param lcid [in] {@code Integer}
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "DisplayAutomaticPageBreaks", dispId = 0x283)
    com.sun.jna.platform.win32.WinNT.HRESULT setDisplayAutomaticPageBreaks(Integer lcid,
            Boolean RHS);
            
    /**
     * <p>id(0x304)</p>
     * <p>vtableId(62)</p>
     * @param Index [in, optional] {@code Object}
     * @param lcid [in] {@code Integer}
     * @param RHS [out] {@code com.sun.jna.platform.win32.COM.util.IDispatch}
     */
    @ComMethod(name = "Drawings", dispId = 0x304)
    com.sun.jna.platform.win32.WinNT.HRESULT Drawings(Object Index,
            Integer lcid,
            VARIANT RHS);
            
    /**
     * <p>id(0x58)</p>
     * <p>vtableId(63)</p>
     * @param Index [in, optional] {@code Object}
     * @param lcid [in] {@code Integer}
     * @param RHS [out] {@code com.sun.jna.platform.win32.COM.util.IDispatch}
     */
    @ComMethod(name = "DrawingObjects", dispId = 0x58)
    com.sun.jna.platform.win32.WinNT.HRESULT DrawingObjects(Object Index,
            Integer lcid,
            VARIANT RHS);
            
    /**
     * <p>id(0x344)</p>
     * <p>vtableId(64)</p>
     * @param Index [in, optional] {@code Object}
     * @param lcid [in] {@code Integer}
     * @param RHS [out] {@code com.sun.jna.platform.win32.COM.util.IDispatch}
     */
    @ComMethod(name = "DropDowns", dispId = 0x344)
    com.sun.jna.platform.win32.WinNT.HRESULT DropDowns(Object Index,
            Integer lcid,
            VARIANT RHS);
            
    /**
     * <p>id(0x484)</p>
     * <p>vtableId(65)</p>
     * @param lcid [in] {@code Integer}
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "EnableAutoFilter", dispId = 0x484)
    com.sun.jna.platform.win32.WinNT.HRESULT getEnableAutoFilter(Integer lcid,
            VARIANT RHS);
            
    /**
     * <p>id(0x484)</p>
     * <p>vtableId(66)</p>
     * @param lcid [in] {@code Integer}
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "EnableAutoFilter", dispId = 0x484)
    com.sun.jna.platform.win32.WinNT.HRESULT setEnableAutoFilter(Integer lcid,
            Boolean RHS);
            
    /**
     * <p>id(0x591)</p>
     * <p>vtableId(67)</p>
     * @param RHS [out] {@code XlEnableSelection}
     */
    @ComProperty(name = "EnableSelection", dispId = 0x591)
    com.sun.jna.platform.win32.WinNT.HRESULT getEnableSelection(VARIANT RHS);
            
    /**
     * <p>id(0x591)</p>
     * <p>vtableId(68)</p>
     * @param RHS [in] {@code XlEnableSelection}
     */
    @ComProperty(name = "EnableSelection", dispId = 0x591)
    com.sun.jna.platform.win32.WinNT.HRESULT setEnableSelection(XlEnableSelection RHS);
            
    /**
     * <p>id(0x485)</p>
     * <p>vtableId(69)</p>
     * @param lcid [in] {@code Integer}
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "EnableOutlining", dispId = 0x485)
    com.sun.jna.platform.win32.WinNT.HRESULT getEnableOutlining(Integer lcid,
            VARIANT RHS);
            
    /**
     * <p>id(0x485)</p>
     * <p>vtableId(70)</p>
     * @param lcid [in] {@code Integer}
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "EnableOutlining", dispId = 0x485)
    com.sun.jna.platform.win32.WinNT.HRESULT setEnableOutlining(Integer lcid,
            Boolean RHS);
            
    /**
     * <p>id(0x486)</p>
     * <p>vtableId(71)</p>
     * @param lcid [in] {@code Integer}
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "EnablePivotTable", dispId = 0x486)
    com.sun.jna.platform.win32.WinNT.HRESULT getEnablePivotTable(Integer lcid,
            VARIANT RHS);
            
    /**
     * <p>id(0x486)</p>
     * <p>vtableId(72)</p>
     * @param lcid [in] {@code Integer}
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "EnablePivotTable", dispId = 0x486)
    com.sun.jna.platform.win32.WinNT.HRESULT setEnablePivotTable(Integer lcid,
            Boolean RHS);
            
    /**
     * <p>id(0x1)</p>
     * <p>vtableId(73)</p>
     * @param Name [in] {@code Object}
     * @param lcid [in] {@code Integer}
     * @param RHS [out] {@code Object}
     */
    @ComMethod(name = "Evaluate", dispId = 0x1)
    com.sun.jna.platform.win32.WinNT.HRESULT Evaluate(Object Name,
            Integer lcid,
            VARIANT RHS);
            
    /**
     * <p>id(0xfffffffb)</p>
     * <p>vtableId(74)</p>
     * @param Name [in] {@code Object}
     * @param lcid [in] {@code Integer}
     * @param RHS [out] {@code Object}
     */
    @ComMethod(name = "_Evaluate", dispId = 0xfffffffb)
    com.sun.jna.platform.win32.WinNT.HRESULT _Evaluate(Object Name,
            Integer lcid,
            VARIANT RHS);
            
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
    com.sun.jna.platform.win32.WinNT.HRESULT ResetAllPageBreaks();
            
    /**
     * <p>id(0x342)</p>
     * <p>vtableId(77)</p>
     * @param Index [in, optional] {@code Object}
     * @param lcid [in] {@code Integer}
     * @param RHS [out] {@code com.sun.jna.platform.win32.COM.util.IDispatch}
     */
    @ComMethod(name = "GroupBoxes", dispId = 0x342)
    com.sun.jna.platform.win32.WinNT.HRESULT GroupBoxes(Object Index,
            Integer lcid,
            VARIANT RHS);
            
    /**
     * <p>id(0x459)</p>
     * <p>vtableId(78)</p>
     * @param Index [in, optional] {@code Object}
     * @param lcid [in] {@code Integer}
     * @param RHS [out] {@code com.sun.jna.platform.win32.COM.util.IDispatch}
     */
    @ComMethod(name = "GroupObjects", dispId = 0x459)
    com.sun.jna.platform.win32.WinNT.HRESULT GroupObjects(Object Index,
            Integer lcid,
            VARIANT RHS);
            
    /**
     * <p>id(0x349)</p>
     * <p>vtableId(79)</p>
     * @param Index [in, optional] {@code Object}
     * @param lcid [in] {@code Integer}
     * @param RHS [out] {@code com.sun.jna.platform.win32.COM.util.IDispatch}
     */
    @ComMethod(name = "Labels", dispId = 0x349)
    com.sun.jna.platform.win32.WinNT.HRESULT Labels(Object Index,
            Integer lcid,
            VARIANT RHS);
            
    /**
     * <p>id(0x2ff)</p>
     * <p>vtableId(80)</p>
     * @param Index [in, optional] {@code Object}
     * @param lcid [in] {@code Integer}
     * @param RHS [out] {@code com.sun.jna.platform.win32.COM.util.IDispatch}
     */
    @ComMethod(name = "Lines", dispId = 0x2ff)
    com.sun.jna.platform.win32.WinNT.HRESULT Lines(Object Index,
            Integer lcid,
            VARIANT RHS);
            
    /**
     * <p>id(0x340)</p>
     * <p>vtableId(81)</p>
     * @param Index [in, optional] {@code Object}
     * @param lcid [in] {@code Integer}
     * @param RHS [out] {@code com.sun.jna.platform.win32.COM.util.IDispatch}
     */
    @ComMethod(name = "ListBoxes", dispId = 0x340)
    com.sun.jna.platform.win32.WinNT.HRESULT ListBoxes(Object Index,
            Integer lcid,
            VARIANT RHS);
            
    /**
     * <p>id(0x1ba)</p>
     * <p>vtableId(82)</p>
     * @param RHS [out] {@code Names}
     */
    @ComProperty(name = "Names", dispId = 0x1ba)
    com.sun.jna.platform.win32.WinNT.HRESULT getNames(VARIANT RHS);
            
    /**
     * <p>id(0x31f)</p>
     * <p>vtableId(83)</p>
     * @param Index [in, optional] {@code Object}
     * @param lcid [in] {@code Integer}
     * @param RHS [out] {@code com.sun.jna.platform.win32.COM.util.IDispatch}
     */
    @ComMethod(name = "OLEObjects", dispId = 0x31f)
    com.sun.jna.platform.win32.WinNT.HRESULT OLEObjects(Object Index,
            Integer lcid,
            VARIANT RHS);
            
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
     * @param lcid [in] {@code Integer}
     * @param RHS [out] {@code com.sun.jna.platform.win32.COM.util.IDispatch}
     */
    @ComMethod(name = "OptionButtons", dispId = 0x33a)
    com.sun.jna.platform.win32.WinNT.HRESULT OptionButtons(Object Index,
            Integer lcid,
            VARIANT RHS);
            
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
     * @param lcid [in] {@code Integer}
     * @param RHS [out] {@code com.sun.jna.platform.win32.COM.util.IDispatch}
     */
    @ComMethod(name = "Ovals", dispId = 0x321)
    com.sun.jna.platform.win32.WinNT.HRESULT Ovals(Object Index,
            Integer lcid,
            VARIANT RHS);
            
    /**
     * <p>id(0xd3)</p>
     * <p>vtableId(90)</p>
     * @param Destination [in, optional] {@code Object}
     * @param Link [in, optional] {@code Object}
     * @param lcid [in] {@code Integer}
     */
    @ComMethod(name = "Paste", dispId = 0xd3)
    com.sun.jna.platform.win32.WinNT.HRESULT Paste(Object Destination,
            Object Link,
            Integer lcid);
            
    /**
     * <p>id(0x403)</p>
     * <p>vtableId(91)</p>
     * @param Format [in, optional] {@code Object}
     * @param Link [in, optional] {@code Object}
     * @param DisplayAsIcon [in, optional] {@code Object}
     * @param IconFileName [in, optional] {@code Object}
     * @param IconIndex [in, optional] {@code Object}
     * @param IconLabel [in, optional] {@code Object}
     * @param lcid [in] {@code Integer}
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
     * <p>vtableId(92)</p>
     * @param Index [in, optional] {@code Object}
     * @param lcid [in] {@code Integer}
     * @param RHS [out] {@code com.sun.jna.platform.win32.COM.util.IDispatch}
     */
    @ComMethod(name = "Pictures", dispId = 0x303)
    com.sun.jna.platform.win32.WinNT.HRESULT Pictures(Object Index,
            Integer lcid,
            VARIANT RHS);
            
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
     * @param lcid [in] {@code Integer}
     * @param RHS [out] {@code com.sun.jna.platform.win32.COM.util.IDispatch}
     */
    @ComMethod(name = "Rectangles", dispId = 0x306)
    com.sun.jna.platform.win32.WinNT.HRESULT Rectangles(Object Index,
            Integer lcid,
            VARIANT RHS);
            
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
     * @param RHS [out] {@code String}
     */
    @ComProperty(name = "ScrollArea", dispId = 0x599)
    com.sun.jna.platform.win32.WinNT.HRESULT getScrollArea(VARIANT RHS);
            
    /**
     * <p>id(0x599)</p>
     * <p>vtableId(100)</p>
     * @param RHS [in] {@code String}
     */
    @ComProperty(name = "ScrollArea", dispId = 0x599)
    com.sun.jna.platform.win32.WinNT.HRESULT setScrollArea(String RHS);
            
    /**
     * <p>id(0x33e)</p>
     * <p>vtableId(101)</p>
     * @param Index [in, optional] {@code Object}
     * @param lcid [in] {@code Integer}
     * @param RHS [out] {@code com.sun.jna.platform.win32.COM.util.IDispatch}
     */
    @ComMethod(name = "ScrollBars", dispId = 0x33e)
    com.sun.jna.platform.win32.WinNT.HRESULT ScrollBars(Object Index,
            Integer lcid,
            VARIANT RHS);
            
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
     * @param lcid [in] {@code Integer}
     * @param RHS [out] {@code com.sun.jna.platform.win32.COM.util.IDispatch}
     */
    @ComMethod(name = "Spinners", dispId = 0x346)
    com.sun.jna.platform.win32.WinNT.HRESULT Spinners(Object Index,
            Integer lcid,
            VARIANT RHS);
            
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
     * @param lcid [in] {@code Integer}
     * @param RHS [out] {@code com.sun.jna.platform.win32.COM.util.IDispatch}
     */
    @ComMethod(name = "TextBoxes", dispId = 0x309)
    com.sun.jna.platform.win32.WinNT.HRESULT TextBoxes(Object Index,
            Integer lcid,
            VARIANT RHS);
            
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
     * @param RHS [out] {@code HPageBreaks}
     */
    @ComProperty(name = "HPageBreaks", dispId = 0x58a)
    com.sun.jna.platform.win32.WinNT.HRESULT getHPageBreaks(VARIANT RHS);
            
    /**
     * <p>id(0x58b)</p>
     * <p>vtableId(112)</p>
     * @param RHS [out] {@code VPageBreaks}
     */
    @ComProperty(name = "VPageBreaks", dispId = 0x58b)
    com.sun.jna.platform.win32.WinNT.HRESULT getVPageBreaks(VARIANT RHS);
            
    /**
     * <p>id(0x59a)</p>
     * <p>vtableId(113)</p>
     * @param RHS [out] {@code QueryTables}
     */
    @ComProperty(name = "QueryTables", dispId = 0x59a)
    com.sun.jna.platform.win32.WinNT.HRESULT getQueryTables(VARIANT RHS);
            
    /**
     * <p>id(0x59b)</p>
     * <p>vtableId(114)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "DisplayPageBreaks", dispId = 0x59b)
    com.sun.jna.platform.win32.WinNT.HRESULT getDisplayPageBreaks(VARIANT RHS);
            
    /**
     * <p>id(0x59b)</p>
     * <p>vtableId(115)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "DisplayPageBreaks", dispId = 0x59b)
    com.sun.jna.platform.win32.WinNT.HRESULT setDisplayPageBreaks(Boolean RHS);
            
    /**
     * <p>id(0x23f)</p>
     * <p>vtableId(116)</p>
     * @param RHS [out] {@code Comments}
     */
    @ComProperty(name = "Comments", dispId = 0x23f)
    com.sun.jna.platform.win32.WinNT.HRESULT getComments(VARIANT RHS);
            
    /**
     * <p>id(0x571)</p>
     * <p>vtableId(117)</p>
     * @param RHS [out] {@code Hyperlinks}
     */
    @ComProperty(name = "Hyperlinks", dispId = 0x571)
    com.sun.jna.platform.win32.WinNT.HRESULT getHyperlinks(VARIANT RHS);
            
    /**
     * <p>id(0x59c)</p>
     * <p>vtableId(118)</p>
     */
    @ComMethod(name = "ClearCircles", dispId = 0x59c)
    com.sun.jna.platform.win32.WinNT.HRESULT ClearCircles();
            
    /**
     * <p>id(0x59d)</p>
     * <p>vtableId(119)</p>
     */
    @ComMethod(name = "CircleInvalid", dispId = 0x59d)
    com.sun.jna.platform.win32.WinNT.HRESULT CircleInvalid();
            
    /**
     * <p>id(0x288)</p>
     * <p>vtableId(120)</p>
     * @param lcid [in] {@code Integer}
     * @param RHS [out] {@code Integer}
     */
    @ComProperty(name = "_DisplayRightToLeft", dispId = 0x288)
    com.sun.jna.platform.win32.WinNT.HRESULT get_DisplayRightToLeft(Integer lcid,
            VARIANT RHS);
            
    /**
     * <p>id(0x288)</p>
     * <p>vtableId(121)</p>
     * @param lcid [in] {@code Integer}
     * @param RHS [in] {@code Integer}
     */
    @ComProperty(name = "_DisplayRightToLeft", dispId = 0x288)
    com.sun.jna.platform.win32.WinNT.HRESULT set_DisplayRightToLeft(Integer lcid,
            Integer RHS);
            
    /**
     * <p>id(0x319)</p>
     * <p>vtableId(122)</p>
     * @param RHS [out] {@code AutoFilter}
     */
    @ComProperty(name = "AutoFilter", dispId = 0x319)
    com.sun.jna.platform.win32.WinNT.HRESULT getAutoFilter(VARIANT RHS);
            
    /**
     * <p>id(0x6ee)</p>
     * <p>vtableId(123)</p>
     * @param lcid [in] {@code Integer}
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "DisplayRightToLeft", dispId = 0x6ee)
    com.sun.jna.platform.win32.WinNT.HRESULT getDisplayRightToLeft(Integer lcid,
            VARIANT RHS);
            
    /**
     * <p>id(0x6ee)</p>
     * <p>vtableId(124)</p>
     * @param lcid [in] {@code Integer}
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "DisplayRightToLeft", dispId = 0x6ee)
    com.sun.jna.platform.win32.WinNT.HRESULT setDisplayRightToLeft(Integer lcid,
            Boolean RHS);
            
    /**
     * <p>id(0x718)</p>
     * <p>vtableId(125)</p>
     * @param RHS [out] {@code eu.doppel_helix.jna.tlb.office2.Scripts}
     */
    @ComProperty(name = "Scripts", dispId = 0x718)
    com.sun.jna.platform.win32.WinNT.HRESULT getScripts(VARIANT RHS);
            
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
     * @param lcid [in] {@code Integer}
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
     * <p>vtableId(127)</p>
     * @param CustomDictionary [in, optional] {@code Object}
     * @param IgnoreUppercase [in, optional] {@code Object}
     * @param AlwaysSuggest [in, optional] {@code Object}
     * @param SpellLang [in, optional] {@code Object}
     * @param IgnoreFinalYaa [in, optional] {@code Object}
     * @param SpellScript [in, optional] {@code Object}
     * @param lcid [in] {@code Integer}
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
     * <p>vtableId(128)</p>
     * @param RHS [out] {@code Tab}
     */
    @ComProperty(name = "Tab", dispId = 0x411)
    com.sun.jna.platform.win32.WinNT.HRESULT getTab(VARIANT RHS);
            
    /**
     * <p>id(0x7e5)</p>
     * <p>vtableId(129)</p>
     * @param RHS [out] {@code eu.doppel_helix.jna.tlb.office2.MsoEnvelope}
     */
    @ComProperty(name = "MailEnvelope", dispId = 0x7e5)
    com.sun.jna.platform.win32.WinNT.HRESULT getMailEnvelope(VARIANT RHS);
            
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
     * <p>vtableId(131)</p>
     * @param RHS [out] {@code CustomProperties}
     */
    @ComProperty(name = "CustomProperties", dispId = 0x7ee)
    com.sun.jna.platform.win32.WinNT.HRESULT getCustomProperties(VARIANT RHS);
            
    /**
     * <p>id(0x7e0)</p>
     * <p>vtableId(132)</p>
     * @param RHS [out] {@code SmartTags}
     */
    @ComProperty(name = "SmartTags", dispId = 0x7e0)
    com.sun.jna.platform.win32.WinNT.HRESULT getSmartTags(VARIANT RHS);
            
    /**
     * <p>id(0xb0)</p>
     * <p>vtableId(133)</p>
     * @param RHS [out] {@code Protection}
     */
    @ComProperty(name = "Protection", dispId = 0xb0)
    com.sun.jna.platform.win32.WinNT.HRESULT getProtection(VARIANT RHS);
            
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
     * @param lcid [in] {@code Integer}
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
     * <p>vtableId(140)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "EnableFormatConditionsCalculation", dispId = 0x9cf)
    com.sun.jna.platform.win32.WinNT.HRESULT getEnableFormatConditionsCalculation(VARIANT RHS);
            
    /**
     * <p>id(0x9cf)</p>
     * <p>vtableId(141)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "EnableFormatConditionsCalculation", dispId = 0x9cf)
    com.sun.jna.platform.win32.WinNT.HRESULT setEnableFormatConditionsCalculation(Boolean RHS);
            
    /**
     * <p>id(0x370)</p>
     * <p>vtableId(142)</p>
     * @param RHS [out] {@code Sort}
     */
    @ComProperty(name = "Sort", dispId = 0x370)
    com.sun.jna.platform.win32.WinNT.HRESULT getSort(VARIANT RHS);
            
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
     * <p>vtableId(144)</p>
     * @param RHS [out] {@code Integer}
     */
    @ComProperty(name = "PrintedCommentPages", dispId = 0xb29)
    com.sun.jna.platform.win32.WinNT.HRESULT getPrintedCommentPages(VARIANT RHS);
            
    /**
     * <p>id(0x359)</p>
     * <p>vtableId(145)</p>
     * @param RHS [out] {@code Object}
     */
    @ComProperty(name = "DefaultButton", dispId = 0x359)
    com.sun.jna.platform.win32.WinNT.HRESULT getDefaultButton(VARIANT RHS);
            
    /**
     * <p>id(0x359)</p>
     * <p>vtableId(146)</p>
     * @param RHS [in] {@code Object}
     */
    @ComProperty(name = "DefaultButton", dispId = 0x359)
    com.sun.jna.platform.win32.WinNT.HRESULT setDefaultButton(Object RHS);
            
    /**
     * <p>id(0x347)</p>
     * <p>vtableId(147)</p>
     * @param RHS [out] {@code DialogFrame}
     */
    @ComProperty(name = "DialogFrame", dispId = 0x347)
    com.sun.jna.platform.win32.WinNT.HRESULT getDialogFrame(VARIANT RHS);
            
    /**
     * <p>id(0x33c)</p>
     * <p>vtableId(148)</p>
     * @param Index [in, optional] {@code Object}
     * @param RHS [out] {@code com.sun.jna.platform.win32.COM.util.IDispatch}
     */
    @ComMethod(name = "EditBoxes", dispId = 0x33c)
    com.sun.jna.platform.win32.WinNT.HRESULT EditBoxes(Object Index,
            VARIANT RHS);
            
    /**
     * <p>id(0x32e)</p>
     * <p>vtableId(149)</p>
     * @param RHS [out] {@code Object}
     */
    @ComProperty(name = "Focus", dispId = 0x32e)
    com.sun.jna.platform.win32.WinNT.HRESULT getFocus(VARIANT RHS);
            
    /**
     * <p>id(0x32e)</p>
     * <p>vtableId(150)</p>
     * @param RHS [in] {@code Object}
     */
    @ComProperty(name = "Focus", dispId = 0x32e)
    com.sun.jna.platform.win32.WinNT.HRESULT setFocus(Object RHS);
            
    /**
     * <p>id(0x32d)</p>
     * <p>vtableId(151)</p>
     * @param Cancel [in, optional] {@code Object}
     * @param RHS [out] {@code Boolean}
     */
    @ComMethod(name = "Hide", dispId = 0x32d)
    com.sun.jna.platform.win32.WinNT.HRESULT Hide(Object Cancel,
            VARIANT RHS);
            
    /**
     * <p>id(0x1f0)</p>
     * <p>vtableId(152)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComMethod(name = "Show", dispId = 0x1f0)
    com.sun.jna.platform.win32.WinNT.HRESULT Show(VARIANT RHS);
            
    
}