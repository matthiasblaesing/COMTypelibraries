
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000208AD-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000208AD-0000-0000-C000-000000000046}")
public interface Module extends IUnknown, IRawDispatchHandle, IDispatch {
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
     * <p>id(0x10015)</p>
     * <p>vtableId(33)</p>
     */
    @ComMethod(name = "_Dummy21", dispId = 0x10015)
    void _Dummy21();
            
    /**
     * <p>id(0x487)</p>
     * <p>vtableId(34)</p>
     */
    @ComProperty(name = "ProtectionMode", dispId = 0x487)
    Boolean getProtectionMode();
            
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
     * <p>id(0x248)</p>
     * <p>vtableId(42)</p>
     * @param Filename [in] {@code Object}
     * @param Merge [in, optional] {@code Object}
     */
    @ComMethod(name = "InsertFile", dispId = 0x248)
    Object InsertFile(Object Filename,
            Object Merge);
            
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
    void SaveAs(String Filename,
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
    void Protect(Object Password,
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
    void _PrintOut(Object From,
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
    void PrintOut(Object From,
            Object To,
            Object Copies,
            Object Preview,
            Object ActivePrinter,
            Object PrintToFile,
            Object Collate);
            
    
}