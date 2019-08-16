
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000209BD-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000209BD-0000-0000-C000-000000000046}")
public interface Mailer extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x3e8)</p>
     * <p>vtableId(7)</p>
     */
    @ComProperty(name = "Application", dispId = 0x3e8)
    Application getApplication();
            
    /**
     * <p>id(0x3e9)</p>
     * <p>vtableId(8)</p>
     */
    @ComProperty(name = "Creator", dispId = 0x3e9)
    Integer getCreator();
            
    /**
     * <p>id(0x3ea)</p>
     * <p>vtableId(9)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x3ea)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * <p>id(0x64)</p>
     * <p>vtableId(10)</p>
     */
    @ComProperty(name = "BCCRecipients", dispId = 0x64)
    Object getBCCRecipients();
            
    /**
     * <p>id(0x64)</p>
     * <p>vtableId(11)</p>
     * @param param0 [in] {@code Object}
     */
    @ComProperty(name = "BCCRecipients", dispId = 0x64)
    void setBCCRecipients(Object param0);
            
    /**
     * <p>id(0x65)</p>
     * <p>vtableId(12)</p>
     */
    @ComProperty(name = "CCRecipients", dispId = 0x65)
    Object getCCRecipients();
            
    /**
     * <p>id(0x65)</p>
     * <p>vtableId(13)</p>
     * @param param0 [in] {@code Object}
     */
    @ComProperty(name = "CCRecipients", dispId = 0x65)
    void setCCRecipients(Object param0);
            
    /**
     * <p>id(0x66)</p>
     * <p>vtableId(14)</p>
     */
    @ComProperty(name = "Recipients", dispId = 0x66)
    Object getRecipients();
            
    /**
     * <p>id(0x66)</p>
     * <p>vtableId(15)</p>
     * @param param0 [in] {@code Object}
     */
    @ComProperty(name = "Recipients", dispId = 0x66)
    void setRecipients(Object param0);
            
    /**
     * <p>id(0x67)</p>
     * <p>vtableId(16)</p>
     */
    @ComProperty(name = "Enclosures", dispId = 0x67)
    Object getEnclosures();
            
    /**
     * <p>id(0x67)</p>
     * <p>vtableId(17)</p>
     * @param param0 [in] {@code Object}
     */
    @ComProperty(name = "Enclosures", dispId = 0x67)
    void setEnclosures(Object param0);
            
    /**
     * <p>id(0x68)</p>
     * <p>vtableId(18)</p>
     */
    @ComProperty(name = "Sender", dispId = 0x68)
    String getSender();
            
    /**
     * <p>id(0x69)</p>
     * <p>vtableId(19)</p>
     */
    @ComProperty(name = "SendDateTime", dispId = 0x69)
    java.util.Date getSendDateTime();
            
    /**
     * <p>id(0x6a)</p>
     * <p>vtableId(20)</p>
     */
    @ComProperty(name = "Received", dispId = 0x6a)
    Boolean getReceived();
            
    /**
     * <p>id(0x6b)</p>
     * <p>vtableId(21)</p>
     */
    @ComProperty(name = "Subject", dispId = 0x6b)
    String getSubject();
            
    /**
     * <p>id(0x6b)</p>
     * <p>vtableId(22)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "Subject", dispId = 0x6b)
    void setSubject(String param0);
            
    
}