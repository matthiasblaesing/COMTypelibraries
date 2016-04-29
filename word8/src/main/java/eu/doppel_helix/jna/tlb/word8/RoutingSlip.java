
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00020969-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{00020969-0000-0000-C000-000000000046}")
public interface RoutingSlip {
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
     * <p>id(0x1)</p>
     */
    @ComProperty(name = "Subject", dispId = 0x1)
    String getSubject();
            
    /**
     * <p>id(0x1)</p>
     */
    @ComProperty(name = "Subject", dispId = 0x1)
    void setSubject(String param0);
            
    /**
     * <p>id(0x2)</p>
     */
    @ComProperty(name = "Message", dispId = 0x2)
    String getMessage();
            
    /**
     * <p>id(0x2)</p>
     */
    @ComProperty(name = "Message", dispId = 0x2)
    void setMessage(String param0);
            
    /**
     * <p>id(0x3)</p>
     */
    @ComProperty(name = "Delivery", dispId = 0x3)
    WdRoutingSlipDelivery getDelivery();
            
    /**
     * <p>id(0x3)</p>
     */
    @ComProperty(name = "Delivery", dispId = 0x3)
    void setDelivery(WdRoutingSlipDelivery param0);
            
    /**
     * <p>id(0x4)</p>
     */
    @ComProperty(name = "TrackStatus", dispId = 0x4)
    Boolean getTrackStatus();
            
    /**
     * <p>id(0x4)</p>
     */
    @ComProperty(name = "TrackStatus", dispId = 0x4)
    void setTrackStatus(Boolean param0);
            
    /**
     * <p>id(0x5)</p>
     */
    @ComProperty(name = "Protect", dispId = 0x5)
    WdProtectionType getProtect();
            
    /**
     * <p>id(0x5)</p>
     */
    @ComProperty(name = "Protect", dispId = 0x5)
    void setProtect(WdProtectionType param0);
            
    /**
     * <p>id(0x6)</p>
     */
    @ComProperty(name = "ReturnWhenDone", dispId = 0x6)
    Boolean getReturnWhenDone();
            
    /**
     * <p>id(0x6)</p>
     */
    @ComProperty(name = "ReturnWhenDone", dispId = 0x6)
    void setReturnWhenDone(Boolean param0);
            
    /**
     * <p>id(0x7)</p>
     */
    @ComProperty(name = "Status", dispId = 0x7)
    WdRoutingSlipStatus getStatus();
            
    /**
     * <p>id(0x9)</p>
     */
    @ComProperty(name = "Recipients", dispId = 0x9)
    Object getRecipients(Object Index);
            
    /**
     * <p>id(0x65)</p>
     */
    @ComMethod(name = "Reset", dispId = 0x65)
    void Reset();
            
    /**
     * <p>id(0x66)</p>
     */
    @ComMethod(name = "AddRecipient", dispId = 0x66)
    void AddRecipient(String Recipient);
            
    
}