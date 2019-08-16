
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000208AD-0001-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000208AD-0001-0000-C000-000000000046}")
public interface IModule extends IUnknown, IRawDispatchHandle, IDispatch {
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
     * <p>id(0x10012)</p>
     * <p>vtableId(30)</p>
     */
    @ComMethod(name = "_Dummy18", dispId = 0x10012)
    void _Dummy18();
            
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
     * <p>id(0x10015)</p>
     * <p>vtableId(33)</p>
     */
    @ComMethod(name = "_Dummy21", dispId = 0x10015)
    void _Dummy21();
            
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
     * <p>id(0x10017)</p>
     * <p>vtableId(35)</p>
     */
    @ComMethod(name = "_Dummy23", dispId = 0x10017)
    void _Dummy23();
            
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
     * <p>id(0x248)</p>
     * <p>vtableId(42)</p>
     * @param Filename [in] {@code Object}
     * @param Merge [in, optional] {@code Object}
     * @param RHS [out] {@code Object}
     */
    @ComMethod(name = "InsertFile", dispId = 0x248)
    com.sun.jna.platform.win32.WinNT.HRESULT InsertFile(Object Filename,
            Object Merge,
            VARIANT RHS);
            
    /**
     * <p>id(0x785)</p>
     * <p>vtableId(43)</p>
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
    @ComMethod(name = "SaveAs", dispId = 0x785)
    com.sun.jna.platform.win32.WinNT.HRESULT SaveAs(String Filename,
            Object FileFormat,
            Object Password,
            Object WriteResPassword,
            Object ReadOnlyRecommended,
            Object CreateBackup,
            Object AddToMru,
            Object TextCodepage,
            Object TextVisualLayout);
            
    /**
     * <p>id(0x7ed)</p>
     * <p>vtableId(44)</p>
     * @param Password [in, optional] {@code Object}
     * @param DrawingObjects [in, optional] {@code Object}
     * @param Contents [in, optional] {@code Object}
     * @param Scenarios [in, optional] {@code Object}
     * @param UserInterfaceOnly [in, optional] {@code Object}
     */
    @ComMethod(name = "Protect", dispId = 0x7ed)
    com.sun.jna.platform.win32.WinNT.HRESULT Protect(Object Password,
            Object DrawingObjects,
            Object Contents,
            Object Scenarios,
            Object UserInterfaceOnly);
            
    /**
     * <p>id(0x6ec)</p>
     * <p>vtableId(45)</p>
     * @param From [in, optional] {@code Object}
     * @param To [in, optional] {@code Object}
     * @param Copies [in, optional] {@code Object}
     * @param Preview [in, optional] {@code Object}
     * @param ActivePrinter [in, optional] {@code Object}
     * @param PrintToFile [in, optional] {@code Object}
     * @param Collate [in, optional] {@code Object}
     */
    @ComMethod(name = "_PrintOut", dispId = 0x6ec)
    com.sun.jna.platform.win32.WinNT.HRESULT _PrintOut(Object From,
            Object To,
            Object Copies,
            Object Preview,
            Object ActivePrinter,
            Object PrintToFile,
            Object Collate);
            
    /**
     * <p>id(0x939)</p>
     * <p>vtableId(46)</p>
     * @param From [in, optional] {@code Object}
     * @param To [in, optional] {@code Object}
     * @param Copies [in, optional] {@code Object}
     * @param Preview [in, optional] {@code Object}
     * @param ActivePrinter [in, optional] {@code Object}
     * @param PrintToFile [in, optional] {@code Object}
     * @param Collate [in, optional] {@code Object}
     */
    @ComMethod(name = "PrintOut", dispId = 0x939)
    com.sun.jna.platform.win32.WinNT.HRESULT PrintOut(Object From,
            Object To,
            Object Copies,
            Object Preview,
            Object ActivePrinter,
            Object PrintToFile,
            Object Collate);
            
    
}