
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000CD706-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000CD706-0000-0000-C000-000000000046}")
public interface IDocumentInspector extends IUnknown, IRawDispatchHandle {
    /**
     * <p>id(0x60010000)</p>
     */
    @ComMethod(name = "GetInfo", dispId = 0x60010000)
    com.sun.jna.platform.win32.WinNT.HRESULT GetInfo(VARIANT Name,
            VARIANT Desc);
            
    /**
     * <p>id(0x60010001)</p>
     */
    @ComMethod(name = "Inspect", dispId = 0x60010001)
    com.sun.jna.platform.win32.WinNT.HRESULT Inspect(com.sun.jna.platform.win32.COM.util.IDispatch Doc,
            VARIANT Status,
            VARIANT Result,
            VARIANT Action);
            
    /**
     * <p>id(0x60010002)</p>
     */
    @ComMethod(name = "Fix", dispId = 0x60010002)
    com.sun.jna.platform.win32.WinNT.HRESULT Fix(com.sun.jna.platform.win32.COM.util.IDispatch Doc,
            Integer hwnd,
            VARIANT Status,
            VARIANT Result);
            
    
}