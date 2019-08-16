
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000208AA-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000208AA-0000-0000-C000-000000000046}")
public interface RoutingSlip extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x94)</p>
     * <p>vtableId(7)</p>
     */
    @ComProperty(name = "Application", dispId = 0x94)
    Application getApplication();
            
    /**
     * <p>id(0x95)</p>
     * <p>vtableId(8)</p>
     */
    @ComProperty(name = "Creator", dispId = 0x95)
    XlCreator getCreator();
            
    /**
     * <p>id(0x96)</p>
     * <p>vtableId(9)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x96)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * <p>id(0x3bb)</p>
     * <p>vtableId(10)</p>
     */
    @ComProperty(name = "Delivery", dispId = 0x3bb)
    XlRoutingSlipDelivery getDelivery();
            
    /**
     * <p>id(0x3bb)</p>
     * <p>vtableId(11)</p>
     * @param param0 [in] {@code XlRoutingSlipDelivery}
     */
    @ComProperty(name = "Delivery", dispId = 0x3bb)
    void setDelivery(XlRoutingSlipDelivery param0);
            
    /**
     * <p>id(0x3ba)</p>
     * <p>vtableId(12)</p>
     */
    @ComProperty(name = "Message", dispId = 0x3ba)
    Object getMessage();
            
    /**
     * <p>id(0x3ba)</p>
     * <p>vtableId(13)</p>
     * @param param0 [in] {@code Object}
     */
    @ComProperty(name = "Message", dispId = 0x3ba)
    void setMessage(Object param0);
            
    /**
     * <p>id(0x3b8)</p>
     * <p>vtableId(14)</p>
     * @param Index [in, optional] {@code Object}
     */
    @ComProperty(name = "Recipients", dispId = 0x3b8)
    Object getRecipients(Object Index);
            
    /**
     * <p>id(0x3b8)</p>
     * <p>vtableId(15)</p>
     * @param Index [in, optional] {@code Object}
     * @param param1 [in] {@code Object}
     */
    @ComProperty(name = "Recipients", dispId = 0x3b8)
    void setRecipients(Object Index,
            Object param1);
            
    /**
     * <p>id(0x22b)</p>
     * <p>vtableId(16)</p>
     */
    @ComMethod(name = "Reset", dispId = 0x22b)
    Object Reset();
            
    /**
     * <p>id(0x3bc)</p>
     * <p>vtableId(17)</p>
     */
    @ComProperty(name = "ReturnWhenDone", dispId = 0x3bc)
    Boolean getReturnWhenDone();
            
    /**
     * <p>id(0x3bc)</p>
     * <p>vtableId(18)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "ReturnWhenDone", dispId = 0x3bc)
    void setReturnWhenDone(Boolean param0);
            
    /**
     * <p>id(0x3be)</p>
     * <p>vtableId(19)</p>
     */
    @ComProperty(name = "Status", dispId = 0x3be)
    XlRoutingSlipStatus getStatus();
            
    /**
     * <p>id(0x3b9)</p>
     * <p>vtableId(20)</p>
     */
    @ComProperty(name = "Subject", dispId = 0x3b9)
    Object getSubject();
            
    /**
     * <p>id(0x3b9)</p>
     * <p>vtableId(21)</p>
     * @param param0 [in] {@code Object}
     */
    @ComProperty(name = "Subject", dispId = 0x3b9)
    void setSubject(Object param0);
            
    /**
     * <p>id(0x3bd)</p>
     * <p>vtableId(22)</p>
     */
    @ComProperty(name = "TrackStatus", dispId = 0x3bd)
    Boolean getTrackStatus();
            
    /**
     * <p>id(0x3bd)</p>
     * <p>vtableId(23)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "TrackStatus", dispId = 0x3bd)
    void setTrackStatus(Boolean param0);
            
    
}