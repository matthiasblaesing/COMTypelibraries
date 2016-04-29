
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000CD6A1-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000CD6A1-0000-0000-C000-000000000046}")
public interface SignatureSetup {
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
    @ComProperty(name = "Id", dispId = 0x2)
    String getId();
            
    /**
     * <p>id(0x3)</p>
     */
    @ComProperty(name = "SignatureProvider", dispId = 0x3)
    String getSignatureProvider();
            
    /**
     * <p>id(0x4)</p>
     */
    @ComProperty(name = "SuggestedSigner", dispId = 0x4)
    String getSuggestedSigner();
            
    /**
     * <p>id(0x4)</p>
     */
    @ComProperty(name = "SuggestedSigner", dispId = 0x4)
    void setSuggestedSigner(String param0);
            
    /**
     * <p>id(0x5)</p>
     */
    @ComProperty(name = "SuggestedSignerLine2", dispId = 0x5)
    String getSuggestedSignerLine2();
            
    /**
     * <p>id(0x5)</p>
     */
    @ComProperty(name = "SuggestedSignerLine2", dispId = 0x5)
    void setSuggestedSignerLine2(String param0);
            
    /**
     * <p>id(0x6)</p>
     */
    @ComProperty(name = "SuggestedSignerEmail", dispId = 0x6)
    String getSuggestedSignerEmail();
            
    /**
     * <p>id(0x6)</p>
     */
    @ComProperty(name = "SuggestedSignerEmail", dispId = 0x6)
    void setSuggestedSignerEmail(String param0);
            
    /**
     * <p>id(0x7)</p>
     */
    @ComProperty(name = "SigningInstructions", dispId = 0x7)
    String getSigningInstructions();
            
    /**
     * <p>id(0x7)</p>
     */
    @ComProperty(name = "SigningInstructions", dispId = 0x7)
    void setSigningInstructions(String param0);
            
    /**
     * <p>id(0x8)</p>
     */
    @ComProperty(name = "AllowComments", dispId = 0x8)
    Boolean getAllowComments();
            
    /**
     * <p>id(0x8)</p>
     */
    @ComProperty(name = "AllowComments", dispId = 0x8)
    void setAllowComments(Boolean param0);
            
    /**
     * <p>id(0x9)</p>
     */
    @ComProperty(name = "ShowSignDate", dispId = 0x9)
    Boolean getShowSignDate();
            
    /**
     * <p>id(0x9)</p>
     */
    @ComProperty(name = "ShowSignDate", dispId = 0x9)
    void setShowSignDate(Boolean param0);
            
    /**
     * <p>id(0xa)</p>
     */
    @ComProperty(name = "AdditionalXml", dispId = 0xa)
    String getAdditionalXml();
            
    /**
     * <p>id(0xa)</p>
     */
    @ComProperty(name = "AdditionalXml", dispId = 0xa)
    void setAdditionalXml(String param0);
            
    
}