
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000C03D4-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000C03D4-0000-0000-C000-000000000046}")
public interface IConverterPreferences {
    /**
     * <p>id(0x1)</p>
     */
    @ComMethod(name = "HrGetMacroEnabled", dispId = 0x1)
    com.sun.jna.platform.win32.WinNT.HRESULT HrGetMacroEnabled(VARIANT pfMacroEnabled);
            
    /**
     * <p>id(0x2)</p>
     */
    @ComMethod(name = "HrCheckFormat", dispId = 0x2)
    com.sun.jna.platform.win32.WinNT.HRESULT HrCheckFormat(VARIANT pFormat);
            
    /**
     * <p>id(0x3)</p>
     */
    @ComMethod(name = "HrGetLossySave", dispId = 0x3)
    com.sun.jna.platform.win32.WinNT.HRESULT HrGetLossySave(VARIANT pfLossySave);
            
    
}