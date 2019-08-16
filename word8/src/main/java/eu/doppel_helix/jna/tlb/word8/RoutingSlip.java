
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00020969-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{00020969-0000-0000-C000-000000000046}")
public interface RoutingSlip extends IUnknown, IRawDispatchHandle, IDispatch {
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
     * <p>id(0x1)</p>
     * <p>vtableId(10)</p>
     */
    @ComProperty(name = "Subject", dispId = 0x1)
    String getSubject();
            
    /**
     * <p>id(0x1)</p>
     * <p>vtableId(11)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "Subject", dispId = 0x1)
    void setSubject(String param0);
            
    /**
     * <p>id(0x2)</p>
     * <p>vtableId(12)</p>
     */
    @ComProperty(name = "Message", dispId = 0x2)
    String getMessage();
            
    /**
     * <p>id(0x2)</p>
     * <p>vtableId(13)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "Message", dispId = 0x2)
    void setMessage(String param0);
            
    /**
     * <p>id(0x3)</p>
     * <p>vtableId(14)</p>
     */
    @ComProperty(name = "Delivery", dispId = 0x3)
    WdRoutingSlipDelivery getDelivery();
            
    /**
     * <p>id(0x3)</p>
     * <p>vtableId(15)</p>
     * @param param0 [in] {@code WdRoutingSlipDelivery}
     */
    @ComProperty(name = "Delivery", dispId = 0x3)
    void setDelivery(WdRoutingSlipDelivery param0);
            
    /**
     * <p>id(0x4)</p>
     * <p>vtableId(16)</p>
     */
    @ComProperty(name = "TrackStatus", dispId = 0x4)
    Boolean getTrackStatus();
            
    /**
     * <p>id(0x4)</p>
     * <p>vtableId(17)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "TrackStatus", dispId = 0x4)
    void setTrackStatus(Boolean param0);
            
    /**
     * <p>id(0x5)</p>
     * <p>vtableId(18)</p>
     */
    @ComProperty(name = "Protect", dispId = 0x5)
    WdProtectionType getProtect();
            
    /**
     * <p>id(0x5)</p>
     * <p>vtableId(19)</p>
     * @param param0 [in] {@code WdProtectionType}
     */
    @ComProperty(name = "Protect", dispId = 0x5)
    void setProtect(WdProtectionType param0);
            
    /**
     * <p>id(0x6)</p>
     * <p>vtableId(20)</p>
     */
    @ComProperty(name = "ReturnWhenDone", dispId = 0x6)
    Boolean getReturnWhenDone();
            
    /**
     * <p>id(0x6)</p>
     * <p>vtableId(21)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "ReturnWhenDone", dispId = 0x6)
    void setReturnWhenDone(Boolean param0);
            
    /**
     * <p>id(0x7)</p>
     * <p>vtableId(22)</p>
     */
    @ComProperty(name = "Status", dispId = 0x7)
    WdRoutingSlipStatus getStatus();
            
    /**
     * <p>id(0x9)</p>
     * <p>vtableId(23)</p>
     * @param Index [in, optional] {@code Object}
     */
    @ComProperty(name = "Recipients", dispId = 0x9)
    Object getRecipients(Object Index);
            
    /**
     * <p>id(0x65)</p>
     * <p>vtableId(24)</p>
     */
    @ComMethod(name = "Reset", dispId = 0x65)
    void Reset();
            
    /**
     * <p>id(0x66)</p>
     * <p>vtableId(25)</p>
     * @param Recipient [in] {@code String}
     */
    @ComMethod(name = "AddRecipient", dispId = 0x66)
    void AddRecipient(String Recipient);
            
    
}