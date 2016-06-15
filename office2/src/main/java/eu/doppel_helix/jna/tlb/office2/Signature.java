
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000C0411-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000C0411-0000-0000-C000-000000000046}")
public interface Signature extends IUnknown, IRawDispatchHandle, IDispatch {
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
     * <p>id(0x60030000)</p>
     */
    @ComProperty(name = "Signer", dispId = 0x60030000)
    String getSigner();
            
    /**
     * <p>id(0x60030001)</p>
     */
    @ComProperty(name = "Issuer", dispId = 0x60030001)
    String getIssuer();
            
    /**
     * <p>id(0x60030002)</p>
     */
    @ComProperty(name = "ExpireDate", dispId = 0x60030002)
    Object getExpireDate();
            
    /**
     * <p>id(0x60030003)</p>
     */
    @ComProperty(name = "IsValid", dispId = 0x60030003)
    Boolean getIsValid();
            
    /**
     * <p>id(0x60030004)</p>
     */
    @ComProperty(name = "AttachCertificate", dispId = 0x60030004)
    Boolean getAttachCertificate();
            
    /**
     * <p>id(0x60030004)</p>
     */
    @ComProperty(name = "AttachCertificate", dispId = 0x60030004)
    void setAttachCertificate(Boolean param0);
            
    /**
     * <p>id(0x60030006)</p>
     */
    @ComMethod(name = "Delete", dispId = 0x60030006)
    void Delete();
            
    /**
     * <p>id(0x60030007)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x60030007)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * <p>id(0x60030008)</p>
     */
    @ComProperty(name = "IsCertificateExpired", dispId = 0x60030008)
    Boolean getIsCertificateExpired();
            
    /**
     * <p>id(0x60030009)</p>
     */
    @ComProperty(name = "IsCertificateRevoked", dispId = 0x60030009)
    Boolean getIsCertificateRevoked();
            
    /**
     * <p>id(0x6003000a)</p>
     */
    @ComProperty(name = "SignDate", dispId = 0x6003000a)
    Object getSignDate();
            
    /**
     * <p>id(0x6003000b)</p>
     */
    @ComProperty(name = "IsSigned", dispId = 0x6003000b)
    Boolean getIsSigned();
            
    /**
     * <p>id(0x6003000c)</p>
     */
    @ComMethod(name = "Sign", dispId = 0x6003000c)
    void Sign(Object varSigImg,
            Object varDelSuggSigner,
            Object varDelSuggSignerLine2,
            Object varDelSuggSignerEmail);
            
    /**
     * <p>id(0x6003000d)</p>
     */
    @ComProperty(name = "Details", dispId = 0x6003000d)
    SignatureInfo getDetails();
            
    /**
     * <p>id(0x6003000e)</p>
     */
    @ComMethod(name = "ShowDetails", dispId = 0x6003000e)
    void ShowDetails();
            
    /**
     * <p>id(0x6003000f)</p>
     */
    @ComProperty(name = "CanSetup", dispId = 0x6003000f)
    Boolean getCanSetup();
            
    /**
     * <p>id(0x60030010)</p>
     */
    @ComProperty(name = "Setup", dispId = 0x60030010)
    SignatureSetup getSetup();
            
    /**
     * <p>id(0x60030011)</p>
     */
    @ComProperty(name = "IsSignatureLine", dispId = 0x60030011)
    Boolean getIsSignatureLine();
            
    /**
     * <p>id(0x60030012)</p>
     */
    @ComProperty(name = "SignatureLineShape", dispId = 0x60030012)
    com.sun.jna.platform.win32.COM.util.IDispatch getSignatureLineShape();
            
    /**
     * <p>id(0x60030013)</p>
     */
    @ComProperty(name = "SortHint", dispId = 0x60030013)
    Integer getSortHint();
            
    
}