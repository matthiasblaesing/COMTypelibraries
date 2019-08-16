
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({0002085C-0001-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{0002085C-0001-0000-C000-000000000046}")
public interface IToolbar extends IUnknown, IRawDispatchHandle, IDispatch {
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
     * <p>id(0x229)</p>
     * <p>vtableId(10)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "BuiltIn", dispId = 0x229)
    com.sun.jna.platform.win32.WinNT.HRESULT getBuiltIn(VARIANT RHS);
            
    /**
     * <p>id(0x75)</p>
     * <p>vtableId(11)</p>
     */
    @ComMethod(name = "Delete", dispId = 0x75)
    com.sun.jna.platform.win32.WinNT.HRESULT Delete();
            
    /**
     * <p>id(0x7b)</p>
     * <p>vtableId(12)</p>
     * @param RHS [out] {@code Integer}
     */
    @ComProperty(name = "Height", dispId = 0x7b)
    com.sun.jna.platform.win32.WinNT.HRESULT getHeight(VARIANT RHS);
            
    /**
     * <p>id(0x7b)</p>
     * <p>vtableId(13)</p>
     * @param RHS [in] {@code Integer}
     */
    @ComProperty(name = "Height", dispId = 0x7b)
    com.sun.jna.platform.win32.WinNT.HRESULT setHeight(Integer RHS);
            
    /**
     * <p>id(0x7f)</p>
     * <p>vtableId(14)</p>
     * @param RHS [out] {@code Integer}
     */
    @ComProperty(name = "Left", dispId = 0x7f)
    com.sun.jna.platform.win32.WinNT.HRESULT getLeft(VARIANT RHS);
            
    /**
     * <p>id(0x7f)</p>
     * <p>vtableId(15)</p>
     * @param RHS [in] {@code Integer}
     */
    @ComProperty(name = "Left", dispId = 0x7f)
    com.sun.jna.platform.win32.WinNT.HRESULT setLeft(Integer RHS);
            
    /**
     * <p>id(0x6e)</p>
     * <p>vtableId(16)</p>
     * @param RHS [out] {@code String}
     */
    @ComProperty(name = "Name", dispId = 0x6e)
    com.sun.jna.platform.win32.WinNT.HRESULT getName(VARIANT RHS);
            
    /**
     * <p>id(0x85)</p>
     * <p>vtableId(17)</p>
     * @param RHS [out] {@code Integer}
     */
    @ComProperty(name = "Position", dispId = 0x85)
    com.sun.jna.platform.win32.WinNT.HRESULT getPosition(VARIANT RHS);
            
    /**
     * <p>id(0x85)</p>
     * <p>vtableId(18)</p>
     * @param RHS [in] {@code Integer}
     */
    @ComProperty(name = "Position", dispId = 0x85)
    com.sun.jna.platform.win32.WinNT.HRESULT setPosition(Integer RHS);
            
    /**
     * <p>id(0xb0)</p>
     * <p>vtableId(19)</p>
     * @param RHS [out] {@code XlToolbarProtection}
     */
    @ComProperty(name = "Protection", dispId = 0xb0)
    com.sun.jna.platform.win32.WinNT.HRESULT getProtection(VARIANT RHS);
            
    /**
     * <p>id(0xb0)</p>
     * <p>vtableId(20)</p>
     * @param RHS [in] {@code XlToolbarProtection}
     */
    @ComProperty(name = "Protection", dispId = 0xb0)
    com.sun.jna.platform.win32.WinNT.HRESULT setProtection(XlToolbarProtection RHS);
            
    /**
     * <p>id(0x22b)</p>
     * <p>vtableId(21)</p>
     */
    @ComMethod(name = "Reset", dispId = 0x22b)
    com.sun.jna.platform.win32.WinNT.HRESULT Reset();
            
    /**
     * <p>id(0x3c4)</p>
     * <p>vtableId(22)</p>
     * @param RHS [out] {@code ToolbarButtons}
     */
    @ComProperty(name = "ToolbarButtons", dispId = 0x3c4)
    com.sun.jna.platform.win32.WinNT.HRESULT getToolbarButtons(VARIANT RHS);
            
    /**
     * <p>id(0x7e)</p>
     * <p>vtableId(23)</p>
     * @param RHS [out] {@code Integer}
     */
    @ComProperty(name = "Top", dispId = 0x7e)
    com.sun.jna.platform.win32.WinNT.HRESULT getTop(VARIANT RHS);
            
    /**
     * <p>id(0x7e)</p>
     * <p>vtableId(24)</p>
     * @param RHS [in] {@code Integer}
     */
    @ComProperty(name = "Top", dispId = 0x7e)
    com.sun.jna.platform.win32.WinNT.HRESULT setTop(Integer RHS);
            
    /**
     * <p>id(0x22e)</p>
     * <p>vtableId(25)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "Visible", dispId = 0x22e)
    com.sun.jna.platform.win32.WinNT.HRESULT getVisible(VARIANT RHS);
            
    /**
     * <p>id(0x22e)</p>
     * <p>vtableId(26)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "Visible", dispId = 0x22e)
    com.sun.jna.platform.win32.WinNT.HRESULT setVisible(Boolean RHS);
            
    /**
     * <p>id(0x7a)</p>
     * <p>vtableId(27)</p>
     * @param RHS [out] {@code Integer}
     */
    @ComProperty(name = "Width", dispId = 0x7a)
    com.sun.jna.platform.win32.WinNT.HRESULT getWidth(VARIANT RHS);
            
    /**
     * <p>id(0x7a)</p>
     * <p>vtableId(28)</p>
     * @param RHS [in] {@code Integer}
     */
    @ComProperty(name = "Width", dispId = 0x7a)
    com.sun.jna.platform.win32.WinNT.HRESULT setWidth(Integer RHS);
            
    
}