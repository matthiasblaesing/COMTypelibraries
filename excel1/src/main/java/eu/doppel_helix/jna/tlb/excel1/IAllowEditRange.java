
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
     */
    @ComProperty(name = "Title", dispId = 0xc7)
    com.sun.jna.platform.win32.WinNT.HRESULT getTitle(VARIANT RHS);
            
    /**
     * <p>id(0xc7)</p>
     */
    @ComProperty(name = "Title", dispId = 0xc7)
    com.sun.jna.platform.win32.WinNT.HRESULT setTitle(String RHS);
            
    /**
     * <p>id(0xc5)</p>
     */
    @ComProperty(name = "Range", dispId = 0xc5)
    com.sun.jna.platform.win32.WinNT.HRESULT getRange(VARIANT RHS);
            
    /**
     * <p>id(0xc5)</p>
     */
    @ComProperty(name = "Range", dispId = 0xc5)
    com.sun.jna.platform.win32.WinNT.HRESULT setRange(Range RHS);
            
    /**
     * <p>id(0x8bd)</p>
     */
    @ComMethod(name = "ChangePassword", dispId = 0x8bd)
    com.sun.jna.platform.win32.WinNT.HRESULT ChangePassword(String Password);
            
    /**
     * <p>id(0x75)</p>
     */
    @ComMethod(name = "Delete", dispId = 0x75)
    com.sun.jna.platform.win32.WinNT.HRESULT Delete();
            
    /**
     * <p>id(0x11d)</p>
     */
    @ComMethod(name = "Unprotect", dispId = 0x11d)
    com.sun.jna.platform.win32.WinNT.HRESULT Unprotect(Object Password);
            
    /**
     * <p>id(0x8be)</p>
     */
    @ComProperty(name = "Users", dispId = 0x8be)
    com.sun.jna.platform.win32.WinNT.HRESULT getUsers(VARIANT RHS);
            
    
}