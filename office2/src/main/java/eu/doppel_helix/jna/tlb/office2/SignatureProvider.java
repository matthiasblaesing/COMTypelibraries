
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000CD6A3-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000CD6A3-0000-0000-C000-000000000046}")
public interface SignatureProvider extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x60020000)</p>
     * <p>vtableId(7)</p>
     * @param siglnimg [in] {@code SignatureLineImage}
     * @param psigsetup [in] {@code SignatureSetup}
     * @param psiginfo [in] {@code SignatureInfo}
     * @param XmlDsigStream [in] {@code com.sun.jna.platform.win32.COM.util.IUnknown}
     */
    @ComMethod(name = "GenerateSignatureLineImage", dispId = 0x60020000)
    eu.doppel_helix.jna.tlb.stdole2.Picture GenerateSignatureLineImage(SignatureLineImage siglnimg,
            SignatureSetup psigsetup,
            SignatureInfo psiginfo,
            com.sun.jna.platform.win32.COM.util.IUnknown XmlDsigStream);
            
    /**
     * <p>id(0x60020001)</p>
     * <p>vtableId(8)</p>
     * @param ParentWindow [in] {@code com.sun.jna.platform.win32.COM.util.IUnknown}
     * @param psigsetup [in] {@code SignatureSetup}
     */
    @ComMethod(name = "ShowSignatureSetup", dispId = 0x60020001)
    void ShowSignatureSetup(com.sun.jna.platform.win32.COM.util.IUnknown ParentWindow,
            SignatureSetup psigsetup);
            
    /**
     * <p>id(0x60020002)</p>
     * <p>vtableId(9)</p>
     * @param ParentWindow [in] {@code com.sun.jna.platform.win32.COM.util.IUnknown}
     * @param psigsetup [in] {@code SignatureSetup}
     * @param psiginfo [in] {@code SignatureInfo}
     */
    @ComMethod(name = "ShowSigningCeremony", dispId = 0x60020002)
    void ShowSigningCeremony(com.sun.jna.platform.win32.COM.util.IUnknown ParentWindow,
            SignatureSetup psigsetup,
            SignatureInfo psiginfo);
            
    /**
     * <p>id(0x60020003)</p>
     * <p>vtableId(10)</p>
     * @param QueryContinue [in] {@code com.sun.jna.platform.win32.COM.util.IUnknown}
     * @param psigsetup [in] {@code SignatureSetup}
     * @param psiginfo [in] {@code SignatureInfo}
     * @param XmlDsigStream [in] {@code com.sun.jna.platform.win32.COM.util.IUnknown}
     */
    @ComMethod(name = "SignXmlDsig", dispId = 0x60020003)
    void SignXmlDsig(com.sun.jna.platform.win32.COM.util.IUnknown QueryContinue,
            SignatureSetup psigsetup,
            SignatureInfo psiginfo,
            com.sun.jna.platform.win32.COM.util.IUnknown XmlDsigStream);
            
    /**
     * <p>id(0x60020004)</p>
     * <p>vtableId(11)</p>
     * @param ParentWindow [in] {@code com.sun.jna.platform.win32.COM.util.IUnknown}
     * @param psigsetup [in] {@code SignatureSetup}
     * @param psiginfo [in] {@code SignatureInfo}
     */
    @ComMethod(name = "NotifySignatureAdded", dispId = 0x60020004)
    void NotifySignatureAdded(com.sun.jna.platform.win32.COM.util.IUnknown ParentWindow,
            SignatureSetup psigsetup,
            SignatureInfo psiginfo);
            
    /**
     * <p>id(0x60020005)</p>
     * <p>vtableId(12)</p>
     * @param QueryContinue [in] {@code com.sun.jna.platform.win32.COM.util.IUnknown}
     * @param psigsetup [in] {@code SignatureSetup}
     * @param psiginfo [in] {@code SignatureInfo}
     * @param XmlDsigStream [in] {@code com.sun.jna.platform.win32.COM.util.IUnknown}
     * @param pcontverres [inout] {@code ContentVerificationResults}
     * @param pcertverres [inout] {@code CertificateVerificationResults}
     */
    @ComMethod(name = "VerifyXmlDsig", dispId = 0x60020005)
    void VerifyXmlDsig(com.sun.jna.platform.win32.COM.util.IUnknown QueryContinue,
            SignatureSetup psigsetup,
            SignatureInfo psiginfo,
            com.sun.jna.platform.win32.COM.util.IUnknown XmlDsigStream,
            VARIANT pcontverres,
            VARIANT pcertverres);
            
    /**
     * <p>id(0x60020006)</p>
     * <p>vtableId(13)</p>
     * @param ParentWindow [in] {@code com.sun.jna.platform.win32.COM.util.IUnknown}
     * @param psigsetup [in] {@code SignatureSetup}
     * @param psiginfo [in] {@code SignatureInfo}
     * @param XmlDsigStream [in] {@code com.sun.jna.platform.win32.COM.util.IUnknown}
     * @param pcontverres [inout] {@code ContentVerificationResults}
     * @param pcertverres [inout] {@code CertificateVerificationResults}
     */
    @ComMethod(name = "ShowSignatureDetails", dispId = 0x60020006)
    void ShowSignatureDetails(com.sun.jna.platform.win32.COM.util.IUnknown ParentWindow,
            SignatureSetup psigsetup,
            SignatureInfo psiginfo,
            com.sun.jna.platform.win32.COM.util.IUnknown XmlDsigStream,
            VARIANT pcontverres,
            VARIANT pcertverres);
            
    /**
     * <p>id(0x60020007)</p>
     * <p>vtableId(14)</p>
     * @param sigprovdet [in] {@code SignatureProviderDetail}
     */
    @ComMethod(name = "GetProviderDetail", dispId = 0x60020007)
    Object GetProviderDetail(SignatureProviderDetail sigprovdet);
            
    /**
     * <p>id(0x60020008)</p>
     * <p>vtableId(15)</p>
     * @param QueryContinue [in] {@code com.sun.jna.platform.win32.COM.util.IUnknown}
     * @param Stream [in] {@code com.sun.jna.platform.win32.COM.util.IUnknown}
     */
    @ComMethod(name = "HashStream", dispId = 0x60020008)
    Byte HashStream(com.sun.jna.platform.win32.COM.util.IUnknown QueryContinue,
            com.sun.jna.platform.win32.COM.util.IUnknown Stream);
            
    
}