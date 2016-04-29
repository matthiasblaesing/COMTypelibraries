
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00024410-0001-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{00024410-0001-0000-C000-000000000046}")
public interface IOLEObjectEvents {
    /**
     * <p>id(0x605)</p>
     */
    @ComMethod(name = "GotFocus", dispId = 0x605)
    com.sun.jna.platform.win32.WinNT.HRESULT GotFocus();
            
    /**
     * <p>id(0x606)</p>
     */
    @ComMethod(name = "LostFocus", dispId = 0x606)
    com.sun.jna.platform.win32.WinNT.HRESULT LostFocus();
            
    
}