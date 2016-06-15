
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00024442-0001-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{00024442-0001-0000-C000-000000000046}")
public interface ILinkFormat extends IUnknown, IRawDispatchHandle, IDispatch {
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
     * <p>id(0x418)</p>
     */
    @ComProperty(name = "AutoUpdate", dispId = 0x418)
    com.sun.jna.platform.win32.WinNT.HRESULT getAutoUpdate(VARIANT RHS);
            
    /**
     * <p>id(0x418)</p>
     */
    @ComProperty(name = "AutoUpdate", dispId = 0x418)
    com.sun.jna.platform.win32.WinNT.HRESULT setAutoUpdate(Boolean RHS);
            
    /**
     * <p>id(0x10d)</p>
     */
    @ComProperty(name = "Locked", dispId = 0x10d)
    com.sun.jna.platform.win32.WinNT.HRESULT getLocked(VARIANT RHS);
            
    /**
     * <p>id(0x10d)</p>
     */
    @ComProperty(name = "Locked", dispId = 0x10d)
    com.sun.jna.platform.win32.WinNT.HRESULT setLocked(Boolean RHS);
            
    /**
     * <p>id(0x2a8)</p>
     */
    @ComMethod(name = "Update", dispId = 0x2a8)
    com.sun.jna.platform.win32.WinNT.HRESULT Update();
            
    
}