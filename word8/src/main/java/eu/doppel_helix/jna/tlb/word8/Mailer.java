
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000209BD-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000209BD-0000-0000-C000-000000000046}")
public interface Mailer {
    /**
     * <p>id(0x3e8)</p>
     */
    @ComProperty(name = "Application", dispId = 0x3e8)
    Application getApplication();
            
    /**
     * <p>id(0x3e9)</p>
     */
    @ComProperty(name = "Creator", dispId = 0x3e9)
    Integer getCreator();
            
    /**
     * <p>id(0x3ea)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x3ea)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * <p>id(0x64)</p>
     */
    @ComProperty(name = "BCCRecipients", dispId = 0x64)
    Object getBCCRecipients();
            
    /**
     * <p>id(0x64)</p>
     */
    @ComProperty(name = "BCCRecipients", dispId = 0x64)
    void setBCCRecipients(Object param0);
            
    /**
     * <p>id(0x65)</p>
     */
    @ComProperty(name = "CCRecipients", dispId = 0x65)
    Object getCCRecipients();
            
    /**
     * <p>id(0x65)</p>
     */
    @ComProperty(name = "CCRecipients", dispId = 0x65)
    void setCCRecipients(Object param0);
            
    /**
     * <p>id(0x66)</p>
     */
    @ComProperty(name = "Recipients", dispId = 0x66)
    Object getRecipients();
            
    /**
     * <p>id(0x66)</p>
     */
    @ComProperty(name = "Recipients", dispId = 0x66)
    void setRecipients(Object param0);
            
    /**
     * <p>id(0x67)</p>
     */
    @ComProperty(name = "Enclosures", dispId = 0x67)
    Object getEnclosures();
            
    /**
     * <p>id(0x67)</p>
     */
    @ComProperty(name = "Enclosures", dispId = 0x67)
    void setEnclosures(Object param0);
            
    /**
     * <p>id(0x68)</p>
     */
    @ComProperty(name = "Sender", dispId = 0x68)
    String getSender();
            
    /**
     * <p>id(0x69)</p>
     */
    @ComProperty(name = "SendDateTime", dispId = 0x69)
    java.util.Date getSendDateTime();
            
    /**
     * <p>id(0x6a)</p>
     */
    @ComProperty(name = "Received", dispId = 0x6a)
    Boolean getReceived();
            
    /**
     * <p>id(0x6b)</p>
     */
    @ComProperty(name = "Subject", dispId = 0x6b)
    String getSubject();
            
    /**
     * <p>id(0x6b)</p>
     */
    @ComProperty(name = "Subject", dispId = 0x6b)
    void setSubject(String param0);
            
    
}