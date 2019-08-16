
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00024427-0001-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{00024427-0001-0000-C000-000000000046}")
public interface IComment extends IUnknown, IRawDispatchHandle, IDispatch {
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
     * <p>id(0x23e)</p>
     * <p>vtableId(10)</p>
     * @param RHS [out] {@code String}
     */
    @ComProperty(name = "Author", dispId = 0x23e)
    com.sun.jna.platform.win32.WinNT.HRESULT getAuthor(VARIANT RHS);
            
    /**
     * <p>id(0x62e)</p>
     * <p>vtableId(11)</p>
     * @param RHS [out] {@code Shape}
     */
    @ComProperty(name = "Shape", dispId = 0x62e)
    com.sun.jna.platform.win32.WinNT.HRESULT getShape(VARIANT RHS);
            
    /**
     * <p>id(0x22e)</p>
     * <p>vtableId(12)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "Visible", dispId = 0x22e)
    com.sun.jna.platform.win32.WinNT.HRESULT getVisible(VARIANT RHS);
            
    /**
     * <p>id(0x22e)</p>
     * <p>vtableId(13)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "Visible", dispId = 0x22e)
    com.sun.jna.platform.win32.WinNT.HRESULT setVisible(Boolean RHS);
            
    /**
     * <p>id(0x8a)</p>
     * <p>vtableId(14)</p>
     * @param Text [in, optional] {@code Object}
     * @param Start [in, optional] {@code Object}
     * @param Overwrite [in, optional] {@code Object}
     * @param RHS [out] {@code String}
     */
    @ComMethod(name = "Text", dispId = 0x8a)
    com.sun.jna.platform.win32.WinNT.HRESULT Text(Object Text,
            Object Start,
            Object Overwrite,
            VARIANT RHS);
            
    /**
     * <p>id(0x75)</p>
     * <p>vtableId(15)</p>
     */
    @ComMethod(name = "Delete", dispId = 0x75)
    com.sun.jna.platform.win32.WinNT.HRESULT Delete();
            
    /**
     * <p>id(0x1f6)</p>
     * <p>vtableId(16)</p>
     * @param RHS [out] {@code Comment}
     */
    @ComMethod(name = "Next", dispId = 0x1f6)
    com.sun.jna.platform.win32.WinNT.HRESULT Next(VARIANT RHS);
            
    /**
     * <p>id(0x1f7)</p>
     * <p>vtableId(17)</p>
     * @param RHS [out] {@code Comment}
     */
    @ComMethod(name = "Previous", dispId = 0x1f7)
    com.sun.jna.platform.win32.WinNT.HRESULT Previous(VARIANT RHS);
            
    
}