
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000208D1-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000208D1-0000-0000-C000-000000000046}")
public interface Mailer extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x94)</p>
     */
    @ComProperty(name = "Application", dispId = 0x94)
    Application getApplication();
            
    /**
     * <p>id(0x95)</p>
     */
    @ComProperty(name = "Creator", dispId = 0x95)
    XlCreator getCreator();
            
    /**
     * <p>id(0x96)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x96)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * <p>id(0x3d7)</p>
     */
    @ComProperty(name = "BCCRecipients", dispId = 0x3d7)
    Object getBCCRecipients();
            
    /**
     * <p>id(0x3d7)</p>
     */
    @ComProperty(name = "BCCRecipients", dispId = 0x3d7)
    void setBCCRecipients(Object param0);
            
    /**
     * <p>id(0x3d6)</p>
     */
    @ComProperty(name = "CCRecipients", dispId = 0x3d6)
    Object getCCRecipients();
            
    /**
     * <p>id(0x3d6)</p>
     */
    @ComProperty(name = "CCRecipients", dispId = 0x3d6)
    void setCCRecipients(Object param0);
            
    /**
     * <p>id(0x3d8)</p>
     */
    @ComProperty(name = "Enclosures", dispId = 0x3d8)
    Object getEnclosures();
            
    /**
     * <p>id(0x3d8)</p>
     */
    @ComProperty(name = "Enclosures", dispId = 0x3d8)
    void setEnclosures(Object param0);
            
    /**
     * <p>id(0x3da)</p>
     */
    @ComProperty(name = "Received", dispId = 0x3da)
    Boolean getReceived();
            
    /**
     * <p>id(0x3db)</p>
     */
    @ComProperty(name = "SendDateTime", dispId = 0x3db)
    java.util.Date getSendDateTime();
            
    /**
     * <p>id(0x3dc)</p>
     */
    @ComProperty(name = "Sender", dispId = 0x3dc)
    String getSender();
            
    /**
     * <p>id(0x3b9)</p>
     */
    @ComProperty(name = "Subject", dispId = 0x3b9)
    String getSubject();
            
    /**
     * <p>id(0x3b9)</p>
     */
    @ComProperty(name = "Subject", dispId = 0x3b9)
    void setSubject(String param0);
            
    /**
     * <p>id(0x3d5)</p>
     */
    @ComProperty(name = "ToRecipients", dispId = 0x3d5)
    Object getToRecipients();
            
    /**
     * <p>id(0x3d5)</p>
     */
    @ComProperty(name = "ToRecipients", dispId = 0x3d5)
    void setToRecipients(Object param0);
            
    /**
     * <p>id(0x3ce)</p>
     */
    @ComProperty(name = "WhichAddress", dispId = 0x3ce)
    Object getWhichAddress();
            
    /**
     * <p>id(0x3ce)</p>
     */
    @ComProperty(name = "WhichAddress", dispId = 0x3ce)
    void setWhichAddress(Object param0);
            
    
}