
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({0002446B-0001-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{0002446B-0001-0000-C000-000000000046}")
public interface IAllowEditRange extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0xc7)</p>
     * <p>vtableId(7)</p>
     * @param RHS [out] {@code String}
     */
    @ComProperty(name = "Title", dispId = 0xc7)
    com.sun.jna.platform.win32.WinNT.HRESULT getTitle(VARIANT RHS);
            
    /**
     * <p>id(0xc7)</p>
     * <p>vtableId(8)</p>
     * @param RHS [in] {@code String}
     */
    @ComProperty(name = "Title", dispId = 0xc7)
    com.sun.jna.platform.win32.WinNT.HRESULT setTitle(String RHS);
            
    /**
     * <p>id(0xc5)</p>
     * <p>vtableId(9)</p>
     * @param RHS [out] {@code Range}
     */
    @ComProperty(name = "Range", dispId = 0xc5)
    com.sun.jna.platform.win32.WinNT.HRESULT getRange(VARIANT RHS);
            
    /**
     * <p>id(0x8bd)</p>
     * <p>vtableId(11)</p>
     * @param Password [in] {@code String}
     */
    @ComMethod(name = "ChangePassword", dispId = 0x8bd)
    com.sun.jna.platform.win32.WinNT.HRESULT ChangePassword(String Password);
            
    /**
     * <p>id(0x75)</p>
     * <p>vtableId(12)</p>
     */
    @ComMethod(name = "Delete", dispId = 0x75)
    com.sun.jna.platform.win32.WinNT.HRESULT Delete();
            
    /**
     * <p>id(0x11d)</p>
     * <p>vtableId(13)</p>
     * @param Password [in, optional] {@code Object}
     */
    @ComMethod(name = "Unprotect", dispId = 0x11d)
    com.sun.jna.platform.win32.WinNT.HRESULT Unprotect(Object Password);
            
    /**
     * <p>id(0x8be)</p>
     * <p>vtableId(14)</p>
     * @param RHS [out] {@code UserAccessList}
     */
    @ComProperty(name = "Users", dispId = 0x8be)
    com.sun.jna.platform.win32.WinNT.HRESULT getUsers(VARIANT RHS);
            
    
}