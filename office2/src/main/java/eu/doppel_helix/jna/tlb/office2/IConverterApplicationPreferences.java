
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000C03D5-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000C03D5-0000-0000-C000-000000000046}")
public interface IConverterApplicationPreferences {
    /**
     * <p>id(0x1)</p>
     */
    @ComMethod(name = "HrGetLcid", dispId = 0x1)
    com.sun.jna.platform.win32.WinNT.HRESULT HrGetLcid(VARIANT plcid);
            
    /**
     * <p>id(0x2)</p>
     */
    @ComMethod(name = "HrGetHwnd", dispId = 0x2)
    com.sun.jna.platform.win32.WinNT.HRESULT HrGetHwnd(VARIANT phwnd);
            
    /**
     * <p>id(0x3)</p>
     */
    @ComMethod(name = "HrGetApplication", dispId = 0x3)
    com.sun.jna.platform.win32.WinNT.HRESULT HrGetApplication(VARIANT pbstrApplication);
            
    /**
     * <p>id(0x4)</p>
     */
    @ComMethod(name = "HrCheckFormat", dispId = 0x4)
    com.sun.jna.platform.win32.WinNT.HRESULT HrCheckFormat(VARIANT pFormat);
            
    
}