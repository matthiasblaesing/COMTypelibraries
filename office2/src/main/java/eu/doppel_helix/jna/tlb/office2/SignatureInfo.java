
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000CD6A2-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000CD6A2-0000-0000-C000-000000000046}")
public interface SignatureInfo extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x60020000)</p>
     */
    @ComProperty(name = "Application", dispId = 0x60020000)
    com.sun.jna.platform.win32.COM.util.IDispatch getApplication();
            
    /**
     * <p>id(0x60020001)</p>
     */
    @ComProperty(name = "Creator", dispId = 0x60020001)
    Integer getCreator();
            
    /**
     * <p>id(0x1)</p>
     */
    @ComProperty(name = "ReadOnly", dispId = 0x1)
    Boolean getReadOnly();
            
    /**
     * <p>id(0x2)</p>
     */
    @ComProperty(name = "SignatureProvider", dispId = 0x2)
    String getSignatureProvider();
            
    /**
     * <p>id(0x3)</p>
     */
    @ComProperty(name = "SignatureText", dispId = 0x3)
    String getSignatureText();
            
    /**
     * <p>id(0x3)</p>
     */
    @ComProperty(name = "SignatureText", dispId = 0x3)
    void setSignatureText(String param0);
            
    /**
     * <p>id(0x4)</p>
     */
    @ComProperty(name = "SignatureImage", dispId = 0x4)
    eu.doppel_helix.jna.tlb.stdole2.Picture getSignatureImage();
            
    /**
     * <p>id(0x4)</p>
     */
    @ComProperty(name = "SignatureImage", dispId = 0x4)
    void setSignatureImage(eu.doppel_helix.jna.tlb.stdole2.Picture param0);
            
    /**
     * <p>id(0x5)</p>
     */
    @ComProperty(name = "SignatureComment", dispId = 0x5)
    String getSignatureComment();
            
    /**
     * <p>id(0x5)</p>
     */
    @ComProperty(name = "SignatureComment", dispId = 0x5)
    void setSignatureComment(String param0);
            
    /**
     * <p>id(0x6)</p>
     */
    @ComMethod(name = "GetSignatureDetail", dispId = 0x6)
    Object GetSignatureDetail(SignatureDetail sigdet);
            
    /**
     * <p>id(0x7)</p>
     */
    @ComMethod(name = "GetCertificateDetail", dispId = 0x7)
    Object GetCertificateDetail(CertificateDetail certdet);
            
    /**
     * <p>id(0x8)</p>
     */
    @ComProperty(name = "ContentVerificationResults", dispId = 0x8)
    ContentVerificationResults getContentVerificationResults();
            
    /**
     * <p>id(0x9)</p>
     */
    @ComProperty(name = "CertificateVerificationResults", dispId = 0x9)
    CertificateVerificationResults getCertificateVerificationResults();
            
    /**
     * <p>id(0xa)</p>
     */
    @ComProperty(name = "IsValid", dispId = 0xa)
    Boolean getIsValid();
            
    /**
     * <p>id(0xb)</p>
     */
    @ComProperty(name = "IsCertificateExpired", dispId = 0xb)
    Boolean getIsCertificateExpired();
            
    /**
     * <p>id(0xc)</p>
     */
    @ComProperty(name = "IsCertificateRevoked", dispId = 0xc)
    Boolean getIsCertificateRevoked();
            
    /**
     * <p>id(0xd)</p>
     */
    @ComProperty(name = "IsCertificateUntrusted", dispId = 0xd)
    Boolean getIsCertificateUntrusted();
            
    /**
     * <p>id(0xe)</p>
     */
    @ComMethod(name = "ShowSignatureCertificate", dispId = 0xe)
    void ShowSignatureCertificate(com.sun.jna.platform.win32.COM.util.IUnknown ParentWindow);
            
    /**
     * <p>id(0xf)</p>
     */
    @ComMethod(name = "SelectSignatureCertificate", dispId = 0xf)
    void SelectSignatureCertificate(com.sun.jna.platform.win32.COM.util.IUnknown ParentWindow);
            
    /**
     * <p>id(0x10)</p>
     */
    @ComMethod(name = "SelectCertificateDetailByThumbprint", dispId = 0x10)
    void SelectCertificateDetailByThumbprint(String bstrThumbprint);
            
    
}