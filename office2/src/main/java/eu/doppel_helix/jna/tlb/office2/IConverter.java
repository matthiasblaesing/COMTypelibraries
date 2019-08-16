
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000C03D7-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000C03D7-0000-0000-C000-000000000046}")
public interface IConverter extends IUnknown, IRawDispatchHandle {
    /**
     * <p>id(0x1)</p>
     * <p>vtableId(3)</p>
     * @param pcap [in] {@code IConverterApplicationPreferences}
     * @param ppcp [out] {@code IConverterPreferences}
     * @param pcuic [in] {@code IConverterUICallback}
     */
    @ComMethod(name = "HrInitConverter", dispId = 0x1)
    com.sun.jna.platform.win32.WinNT.HRESULT HrInitConverter(IConverterApplicationPreferences pcap,
            VARIANT ppcp,
            IConverterUICallback pcuic);
            
    /**
     * <p>id(0x2)</p>
     * <p>vtableId(4)</p>
     * @param pcuic [in] {@code IConverterUICallback}
     */
    @ComMethod(name = "HrUninitConverter", dispId = 0x2)
    com.sun.jna.platform.win32.WinNT.HRESULT HrUninitConverter(IConverterUICallback pcuic);
            
    /**
     * <p>id(0x3)</p>
     * <p>vtableId(5)</p>
     * @param bstrSourcePath [in] {@code String}
     * @param bstrDestPath [in] {@code String}
     * @param pcap [in] {@code IConverterApplicationPreferences}
     * @param ppcp [out] {@code IConverterPreferences}
     * @param pcuic [in] {@code IConverterUICallback}
     */
    @ComMethod(name = "HrImport", dispId = 0x3)
    com.sun.jna.platform.win32.WinNT.HRESULT HrImport(String bstrSourcePath,
            String bstrDestPath,
            IConverterApplicationPreferences pcap,
            VARIANT ppcp,
            IConverterUICallback pcuic);
            
    /**
     * <p>id(0x4)</p>
     * <p>vtableId(6)</p>
     * @param bstrSourcePath [in] {@code String}
     * @param bstrDestPath [in] {@code String}
     * @param bstrClass [in] {@code String}
     * @param pcap [in] {@code IConverterApplicationPreferences}
     * @param ppcp [out] {@code IConverterPreferences}
     * @param pcuic [in] {@code IConverterUICallback}
     */
    @ComMethod(name = "HrExport", dispId = 0x4)
    com.sun.jna.platform.win32.WinNT.HRESULT HrExport(String bstrSourcePath,
            String bstrDestPath,
            String bstrClass,
            IConverterApplicationPreferences pcap,
            VARIANT ppcp,
            IConverterUICallback pcuic);
            
    /**
     * <p>id(0x5)</p>
     * <p>vtableId(7)</p>
     * @param bstrPath [in] {@code String}
     * @param pbstrClass [out] {@code String}
     * @param pcap [in] {@code IConverterApplicationPreferences}
     * @param ppcp [out] {@code IConverterPreferences}
     * @param pcuic [in] {@code IConverterUICallback}
     */
    @ComMethod(name = "HrGetFormat", dispId = 0x5)
    com.sun.jna.platform.win32.WinNT.HRESULT HrGetFormat(String bstrPath,
            VARIANT pbstrClass,
            IConverterApplicationPreferences pcap,
            VARIANT ppcp,
            IConverterUICallback pcuic);
            
    /**
     * <p>id(0x6)</p>
     * <p>vtableId(8)</p>
     * @param hrErr [in] {@code Integer}
     * @param pbstrErrorMsg [out] {@code String}
     * @param pcap [in] {@code IConverterApplicationPreferences}
     */
    @ComMethod(name = "HrGetErrorString", dispId = 0x6)
    com.sun.jna.platform.win32.WinNT.HRESULT HrGetErrorString(Integer hrErr,
            VARIANT pbstrErrorMsg,
            IConverterApplicationPreferences pcap);
            
    
}