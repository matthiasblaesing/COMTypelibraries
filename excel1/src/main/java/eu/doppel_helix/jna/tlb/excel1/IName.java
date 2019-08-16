
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000208B9-0001-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000208B9-0001-0000-C000-000000000046}")
public interface IName extends IUnknown, IRawDispatchHandle, IDispatch {
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
     * <p>id(0x0)</p>
     * <p>vtableId(10)</p>
     * @param RHS [out] {@code String}
     */
    @ComProperty(name = "_Default", dispId = 0x0)
    com.sun.jna.platform.win32.WinNT.HRESULT get_Default(VARIANT RHS);
            
    /**
     * <p>id(0x1e6)</p>
     * <p>vtableId(11)</p>
     * @param RHS [out] {@code Integer}
     */
    @ComProperty(name = "Index", dispId = 0x1e6)
    com.sun.jna.platform.win32.WinNT.HRESULT getIndex(VARIANT RHS);
            
    /**
     * <p>id(0x3a6)</p>
     * <p>vtableId(12)</p>
     * @param lcidIn [in] {@code Integer}
     * @param RHS [out] {@code String}
     */
    @ComProperty(name = "Category", dispId = 0x3a6)
    com.sun.jna.platform.win32.WinNT.HRESULT getCategory(Integer lcidIn,
            VARIANT RHS);
            
    /**
     * <p>id(0x3a6)</p>
     * <p>vtableId(13)</p>
     * @param lcidIn [in] {@code Integer}
     * @param RHS [in] {@code String}
     */
    @ComProperty(name = "Category", dispId = 0x3a6)
    com.sun.jna.platform.win32.WinNT.HRESULT setCategory(Integer lcidIn,
            String RHS);
            
    /**
     * <p>id(0x3a7)</p>
     * <p>vtableId(14)</p>
     * @param RHS [out] {@code String}
     */
    @ComProperty(name = "CategoryLocal", dispId = 0x3a7)
    com.sun.jna.platform.win32.WinNT.HRESULT getCategoryLocal(VARIANT RHS);
            
    /**
     * <p>id(0x3a7)</p>
     * <p>vtableId(15)</p>
     * @param RHS [in] {@code String}
     */
    @ComProperty(name = "CategoryLocal", dispId = 0x3a7)
    com.sun.jna.platform.win32.WinNT.HRESULT setCategoryLocal(String RHS);
            
    /**
     * <p>id(0x75)</p>
     * <p>vtableId(16)</p>
     */
    @ComMethod(name = "Delete", dispId = 0x75)
    com.sun.jna.platform.win32.WinNT.HRESULT Delete();
            
    /**
     * <p>id(0x3a8)</p>
     * <p>vtableId(17)</p>
     * @param RHS [out] {@code XlXLMMacroType}
     */
    @ComProperty(name = "MacroType", dispId = 0x3a8)
    com.sun.jna.platform.win32.WinNT.HRESULT getMacroType(VARIANT RHS);
            
    /**
     * <p>id(0x3a8)</p>
     * <p>vtableId(18)</p>
     * @param RHS [in] {@code XlXLMMacroType}
     */
    @ComProperty(name = "MacroType", dispId = 0x3a8)
    com.sun.jna.platform.win32.WinNT.HRESULT setMacroType(XlXLMMacroType RHS);
            
    /**
     * <p>id(0x6e)</p>
     * <p>vtableId(19)</p>
     * @param lcidIn [in] {@code Integer}
     * @param RHS [out] {@code String}
     */
    @ComProperty(name = "Name", dispId = 0x6e)
    com.sun.jna.platform.win32.WinNT.HRESULT getName(Integer lcidIn,
            VARIANT RHS);
            
    /**
     * <p>id(0x6e)</p>
     * <p>vtableId(20)</p>
     * @param lcidIn [in] {@code Integer}
     * @param RHS [in] {@code String}
     */
    @ComProperty(name = "Name", dispId = 0x6e)
    com.sun.jna.platform.win32.WinNT.HRESULT setName(Integer lcidIn,
            String RHS);
            
    /**
     * <p>id(0x3aa)</p>
     * <p>vtableId(21)</p>
     * @param lcidIn [in] {@code Integer}
     * @param RHS [out] {@code Object}
     */
    @ComProperty(name = "RefersTo", dispId = 0x3aa)
    com.sun.jna.platform.win32.WinNT.HRESULT getRefersTo(Integer lcidIn,
            VARIANT RHS);
            
    /**
     * <p>id(0x3aa)</p>
     * <p>vtableId(22)</p>
     * @param lcidIn [in] {@code Integer}
     * @param RHS [in] {@code Object}
     */
    @ComProperty(name = "RefersTo", dispId = 0x3aa)
    com.sun.jna.platform.win32.WinNT.HRESULT setRefersTo(Integer lcidIn,
            Object RHS);
            
    /**
     * <p>id(0x255)</p>
     * <p>vtableId(23)</p>
     * @param RHS [out] {@code String}
     */
    @ComProperty(name = "ShortcutKey", dispId = 0x255)
    com.sun.jna.platform.win32.WinNT.HRESULT getShortcutKey(VARIANT RHS);
            
    /**
     * <p>id(0x255)</p>
     * <p>vtableId(24)</p>
     * @param RHS [in] {@code String}
     */
    @ComProperty(name = "ShortcutKey", dispId = 0x255)
    com.sun.jna.platform.win32.WinNT.HRESULT setShortcutKey(String RHS);
            
    /**
     * <p>id(0x6)</p>
     * <p>vtableId(25)</p>
     * @param RHS [out] {@code String}
     */
    @ComProperty(name = "Value", dispId = 0x6)
    com.sun.jna.platform.win32.WinNT.HRESULT getValue(VARIANT RHS);
            
    /**
     * <p>id(0x6)</p>
     * <p>vtableId(26)</p>
     * @param RHS [in] {@code String}
     */
    @ComProperty(name = "Value", dispId = 0x6)
    com.sun.jna.platform.win32.WinNT.HRESULT setValue(String RHS);
            
    /**
     * <p>id(0x22e)</p>
     * <p>vtableId(27)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "Visible", dispId = 0x22e)
    com.sun.jna.platform.win32.WinNT.HRESULT getVisible(VARIANT RHS);
            
    /**
     * <p>id(0x22e)</p>
     * <p>vtableId(28)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "Visible", dispId = 0x22e)
    com.sun.jna.platform.win32.WinNT.HRESULT setVisible(Boolean RHS);
            
    /**
     * <p>id(0x3a9)</p>
     * <p>vtableId(29)</p>
     * @param RHS [out] {@code String}
     */
    @ComProperty(name = "NameLocal", dispId = 0x3a9)
    com.sun.jna.platform.win32.WinNT.HRESULT getNameLocal(VARIANT RHS);
            
    /**
     * <p>id(0x3a9)</p>
     * <p>vtableId(30)</p>
     * @param RHS [in] {@code String}
     */
    @ComProperty(name = "NameLocal", dispId = 0x3a9)
    com.sun.jna.platform.win32.WinNT.HRESULT setNameLocal(String RHS);
            
    /**
     * <p>id(0x3ab)</p>
     * <p>vtableId(31)</p>
     * @param RHS [out] {@code Object}
     */
    @ComProperty(name = "RefersToLocal", dispId = 0x3ab)
    com.sun.jna.platform.win32.WinNT.HRESULT getRefersToLocal(VARIANT RHS);
            
    /**
     * <p>id(0x3ab)</p>
     * <p>vtableId(32)</p>
     * @param RHS [in] {@code Object}
     */
    @ComProperty(name = "RefersToLocal", dispId = 0x3ab)
    com.sun.jna.platform.win32.WinNT.HRESULT setRefersToLocal(Object RHS);
            
    /**
     * <p>id(0x3ac)</p>
     * <p>vtableId(33)</p>
     * @param lcidIn [in] {@code Integer}
     * @param RHS [out] {@code Object}
     */
    @ComProperty(name = "RefersToR1C1", dispId = 0x3ac)
    com.sun.jna.platform.win32.WinNT.HRESULT getRefersToR1C1(Integer lcidIn,
            VARIANT RHS);
            
    /**
     * <p>id(0x3ac)</p>
     * <p>vtableId(34)</p>
     * @param lcidIn [in] {@code Integer}
     * @param RHS [in] {@code Object}
     */
    @ComProperty(name = "RefersToR1C1", dispId = 0x3ac)
    com.sun.jna.platform.win32.WinNT.HRESULT setRefersToR1C1(Integer lcidIn,
            Object RHS);
            
    /**
     * <p>id(0x3ad)</p>
     * <p>vtableId(35)</p>
     * @param RHS [out] {@code Object}
     */
    @ComProperty(name = "RefersToR1C1Local", dispId = 0x3ad)
    com.sun.jna.platform.win32.WinNT.HRESULT getRefersToR1C1Local(VARIANT RHS);
            
    /**
     * <p>id(0x3ad)</p>
     * <p>vtableId(36)</p>
     * @param RHS [in] {@code Object}
     */
    @ComProperty(name = "RefersToR1C1Local", dispId = 0x3ad)
    com.sun.jna.platform.win32.WinNT.HRESULT setRefersToR1C1Local(Object RHS);
            
    /**
     * <p>id(0x488)</p>
     * <p>vtableId(37)</p>
     * @param RHS [out] {@code Range}
     */
    @ComProperty(name = "RefersToRange", dispId = 0x488)
    com.sun.jna.platform.win32.WinNT.HRESULT getRefersToRange(VARIANT RHS);
            
    /**
     * <p>id(0x38e)</p>
     * <p>vtableId(38)</p>
     * @param RHS [out] {@code String}
     */
    @ComProperty(name = "Comment", dispId = 0x38e)
    com.sun.jna.platform.win32.WinNT.HRESULT getComment(VARIANT RHS);
            
    /**
     * <p>id(0x38e)</p>
     * <p>vtableId(39)</p>
     * @param RHS [in] {@code String}
     */
    @ComProperty(name = "Comment", dispId = 0x38e)
    com.sun.jna.platform.win32.WinNT.HRESULT setComment(String RHS);
            
    /**
     * <p>id(0xa2f)</p>
     * <p>vtableId(40)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "WorkbookParameter", dispId = 0xa2f)
    com.sun.jna.platform.win32.WinNT.HRESULT getWorkbookParameter(VARIANT RHS);
            
    /**
     * <p>id(0xa2f)</p>
     * <p>vtableId(41)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "WorkbookParameter", dispId = 0xa2f)
    com.sun.jna.platform.win32.WinNT.HRESULT setWorkbookParameter(Boolean RHS);
            
    /**
     * <p>id(0xa30)</p>
     * <p>vtableId(42)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "ValidWorkbookParameter", dispId = 0xa30)
    com.sun.jna.platform.win32.WinNT.HRESULT getValidWorkbookParameter(VARIANT RHS);
            
    
}