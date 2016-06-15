
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
     * <p>id(0x10012)</p>
     */
    @ComMethod(name = "_Dummy18", dispId = 0x10012)
    void _Dummy18();
            
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
     * <p>id(0x10015)</p>
     */
    @ComMethod(name = "_Dummy21", dispId = 0x10015)
    void _Dummy21();
            
    /**
     * <p>id(0x487)</p>
     */
    @ComProperty(name = "ProtectionMode", dispId = 0x487)
    com.sun.jna.platform.win32.WinNT.HRESULT getProtectionMode(Integer lcid,
            VARIANT RHS);
            
    /**
     * <p>id(0x10017)</p>
     */
    @ComMethod(name = "_Dummy23", dispId = 0x10017)
    void _Dummy23();
            
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
     * <p>id(0x248)</p>
     */
    @ComMethod(name = "InsertFile", dispId = 0x248)
    com.sun.jna.platform.win32.WinNT.HRESULT InsertFile(Object Filename,
            Object Merge,
            VARIANT RHS);
            
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
            Object TextVisualLayout);
            
    /**
     * <p>id(0x7ed)</p>
     */
    @ComMethod(name = "Protect", dispId = 0x7ed)
    com.sun.jna.platform.win32.WinNT.HRESULT Protect(Object Password,
            Object DrawingObjects,
            Object Contents,
            Object Scenarios,
            Object UserInterfaceOnly);
            
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
            Object Collate);
            
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
            Object Collate);
            
    
}