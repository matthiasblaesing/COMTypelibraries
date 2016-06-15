
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
     * <p>id(0x0)</p>
     */
    @ComProperty(name = "_Default", dispId = 0x0)
    com.sun.jna.platform.win32.WinNT.HRESULT get_Default(VARIANT RHS);
            
    /**
     * <p>id(0x1e6)</p>
     */
    @ComProperty(name = "Index", dispId = 0x1e6)
    com.sun.jna.platform.win32.WinNT.HRESULT getIndex(VARIANT RHS);
            
    /**
     * <p>id(0x3a6)</p>
     */
    @ComProperty(name = "Category", dispId = 0x3a6)
    com.sun.jna.platform.win32.WinNT.HRESULT getCategory(Integer lcidIn,
            VARIANT RHS);
            
    /**
     * <p>id(0x3a6)</p>
     */
    @ComProperty(name = "Category", dispId = 0x3a6)
    com.sun.jna.platform.win32.WinNT.HRESULT setCategory(Integer lcidIn,
            String RHS);
            
    /**
     * <p>id(0x3a7)</p>
     */
    @ComProperty(name = "CategoryLocal", dispId = 0x3a7)
    com.sun.jna.platform.win32.WinNT.HRESULT getCategoryLocal(VARIANT RHS);
            
    /**
     * <p>id(0x3a7)</p>
     */
    @ComProperty(name = "CategoryLocal", dispId = 0x3a7)
    com.sun.jna.platform.win32.WinNT.HRESULT setCategoryLocal(String RHS);
            
    /**
     * <p>id(0x75)</p>
     */
    @ComMethod(name = "Delete", dispId = 0x75)
    com.sun.jna.platform.win32.WinNT.HRESULT Delete();
            
    /**
     * <p>id(0x3a8)</p>
     */
    @ComProperty(name = "MacroType", dispId = 0x3a8)
    com.sun.jna.platform.win32.WinNT.HRESULT getMacroType(VARIANT RHS);
            
    /**
     * <p>id(0x3a8)</p>
     */
    @ComProperty(name = "MacroType", dispId = 0x3a8)
    com.sun.jna.platform.win32.WinNT.HRESULT setMacroType(XlXLMMacroType RHS);
            
    /**
     * <p>id(0x6e)</p>
     */
    @ComProperty(name = "Name", dispId = 0x6e)
    com.sun.jna.platform.win32.WinNT.HRESULT getName(Integer lcidIn,
            VARIANT RHS);
            
    /**
     * <p>id(0x6e)</p>
     */
    @ComProperty(name = "Name", dispId = 0x6e)
    com.sun.jna.platform.win32.WinNT.HRESULT setName(Integer lcidIn,
            String RHS);
            
    /**
     * <p>id(0x3aa)</p>
     */
    @ComProperty(name = "RefersTo", dispId = 0x3aa)
    com.sun.jna.platform.win32.WinNT.HRESULT getRefersTo(Integer lcidIn,
            VARIANT RHS);
            
    /**
     * <p>id(0x3aa)</p>
     */
    @ComProperty(name = "RefersTo", dispId = 0x3aa)
    com.sun.jna.platform.win32.WinNT.HRESULT setRefersTo(Integer lcidIn,
            Object RHS);
            
    /**
     * <p>id(0x255)</p>
     */
    @ComProperty(name = "ShortcutKey", dispId = 0x255)
    com.sun.jna.platform.win32.WinNT.HRESULT getShortcutKey(VARIANT RHS);
            
    /**
     * <p>id(0x255)</p>
     */
    @ComProperty(name = "ShortcutKey", dispId = 0x255)
    com.sun.jna.platform.win32.WinNT.HRESULT setShortcutKey(String RHS);
            
    /**
     * <p>id(0x6)</p>
     */
    @ComProperty(name = "Value", dispId = 0x6)
    com.sun.jna.platform.win32.WinNT.HRESULT getValue(VARIANT RHS);
            
    /**
     * <p>id(0x6)</p>
     */
    @ComProperty(name = "Value", dispId = 0x6)
    com.sun.jna.platform.win32.WinNT.HRESULT setValue(String RHS);
            
    /**
     * <p>id(0x22e)</p>
     */
    @ComProperty(name = "Visible", dispId = 0x22e)
    com.sun.jna.platform.win32.WinNT.HRESULT getVisible(VARIANT RHS);
            
    /**
     * <p>id(0x22e)</p>
     */
    @ComProperty(name = "Visible", dispId = 0x22e)
    com.sun.jna.platform.win32.WinNT.HRESULT setVisible(Boolean RHS);
            
    /**
     * <p>id(0x3a9)</p>
     */
    @ComProperty(name = "NameLocal", dispId = 0x3a9)
    com.sun.jna.platform.win32.WinNT.HRESULT getNameLocal(VARIANT RHS);
            
    /**
     * <p>id(0x3a9)</p>
     */
    @ComProperty(name = "NameLocal", dispId = 0x3a9)
    com.sun.jna.platform.win32.WinNT.HRESULT setNameLocal(String RHS);
            
    /**
     * <p>id(0x3ab)</p>
     */
    @ComProperty(name = "RefersToLocal", dispId = 0x3ab)
    com.sun.jna.platform.win32.WinNT.HRESULT getRefersToLocal(VARIANT RHS);
            
    /**
     * <p>id(0x3ab)</p>
     */
    @ComProperty(name = "RefersToLocal", dispId = 0x3ab)
    com.sun.jna.platform.win32.WinNT.HRESULT setRefersToLocal(Object RHS);
            
    /**
     * <p>id(0x3ac)</p>
     */
    @ComProperty(name = "RefersToR1C1", dispId = 0x3ac)
    com.sun.jna.platform.win32.WinNT.HRESULT getRefersToR1C1(Integer lcidIn,
            VARIANT RHS);
            
    /**
     * <p>id(0x3ac)</p>
     */
    @ComProperty(name = "RefersToR1C1", dispId = 0x3ac)
    com.sun.jna.platform.win32.WinNT.HRESULT setRefersToR1C1(Integer lcidIn,
            Object RHS);
            
    /**
     * <p>id(0x3ad)</p>
     */
    @ComProperty(name = "RefersToR1C1Local", dispId = 0x3ad)
    com.sun.jna.platform.win32.WinNT.HRESULT getRefersToR1C1Local(VARIANT RHS);
            
    /**
     * <p>id(0x3ad)</p>
     */
    @ComProperty(name = "RefersToR1C1Local", dispId = 0x3ad)
    com.sun.jna.platform.win32.WinNT.HRESULT setRefersToR1C1Local(Object RHS);
            
    /**
     * <p>id(0x488)</p>
     */
    @ComProperty(name = "RefersToRange", dispId = 0x488)
    com.sun.jna.platform.win32.WinNT.HRESULT getRefersToRange(VARIANT RHS);
            
    /**
     * <p>id(0x38e)</p>
     */
    @ComProperty(name = "Comment", dispId = 0x38e)
    com.sun.jna.platform.win32.WinNT.HRESULT getComment(VARIANT RHS);
            
    /**
     * <p>id(0x38e)</p>
     */
    @ComProperty(name = "Comment", dispId = 0x38e)
    com.sun.jna.platform.win32.WinNT.HRESULT setComment(String RHS);
            
    /**
     * <p>id(0xa2f)</p>
     */
    @ComProperty(name = "WorkbookParameter", dispId = 0xa2f)
    com.sun.jna.platform.win32.WinNT.HRESULT getWorkbookParameter(VARIANT RHS);
            
    /**
     * <p>id(0xa2f)</p>
     */
    @ComProperty(name = "WorkbookParameter", dispId = 0xa2f)
    com.sun.jna.platform.win32.WinNT.HRESULT setWorkbookParameter(Boolean RHS);
            
    /**
     * <p>id(0xa30)</p>
     */
    @ComProperty(name = "ValidWorkbookParameter", dispId = 0xa30)
    com.sun.jna.platform.win32.WinNT.HRESULT getValidWorkbookParameter(VARIANT RHS);
            
    
}