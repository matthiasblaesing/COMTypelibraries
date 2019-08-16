
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000C03D6-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000C03D6-0000-0000-C000-000000000046}")
public interface IConverterUICallback extends IUnknown, IRawDispatchHandle {
    /**
     * <p>id(0x1)</p>
     * <p>vtableId(3)</p>
     * @param uPercentComplete [in] {@code Integer}
     */
    @ComMethod(name = "HrReportProgress", dispId = 0x1)
    com.sun.jna.platform.win32.WinNT.HRESULT HrReportProgress(Integer uPercentComplete);
            
    /**
     * <p>id(0x2)</p>
     * <p>vtableId(4)</p>
     * @param bstrText [in] {@code String}
     * @param bstrCaption [in] {@code String}
     * @param uType [in] {@code Integer}
     * @param pidResult [out] {@code Integer}
     */
    @ComMethod(name = "HrMessageBox", dispId = 0x2)
    com.sun.jna.platform.win32.WinNT.HRESULT HrMessageBox(String bstrText,
            String bstrCaption,
            Integer uType,
            VARIANT pidResult);
            
    /**
     * <p>id(0x3)</p>
     * <p>vtableId(5)</p>
     * @param bstrText [in] {@code String}
     * @param bstrCaption [in] {@code String}
     * @param pbstrInput [out] {@code String}
     * @param fPassword [in] {@code Integer}
     */
    @ComMethod(name = "HrInputBox", dispId = 0x3)
    com.sun.jna.platform.win32.WinNT.HRESULT HrInputBox(String bstrText,
            String bstrCaption,
            VARIANT pbstrInput,
            Integer fPassword);
            
    
}