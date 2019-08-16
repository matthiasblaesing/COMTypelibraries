
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000208AA-0001-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000208AA-0001-0000-C000-000000000046}")
public interface IRoutingSlip extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x94)</p>
     * <p>vtableId(7)</p>
     * @param RHS [out] {@code Application}
     */
    @ComProperty(name = "Application", dispId = 0x94)
    com.sun.jna.platform.win32.WinNT.HRESULT getApplication(VARIANT RHS);
            
    /**
     * <p>id(0x95)</p>
     * <p>vtableId(8)</p>
     * @param RHS [out] {@code XlCreator}
     */
    @ComProperty(name = "Creator", dispId = 0x95)
    com.sun.jna.platform.win32.WinNT.HRESULT getCreator(VARIANT RHS);
            
    /**
     * <p>id(0x96)</p>
     * <p>vtableId(9)</p>
     * @param RHS [out] {@code com.sun.jna.platform.win32.COM.util.IDispatch}
     */
    @ComProperty(name = "Parent", dispId = 0x96)
    com.sun.jna.platform.win32.WinNT.HRESULT getParent(VARIANT RHS);
            
    /**
     * <p>id(0x3bb)</p>
     * <p>vtableId(10)</p>
     * @param RHS [out] {@code XlRoutingSlipDelivery}
     */
    @ComProperty(name = "Delivery", dispId = 0x3bb)
    com.sun.jna.platform.win32.WinNT.HRESULT getDelivery(VARIANT RHS);
            
    /**
     * <p>id(0x3bb)</p>
     * <p>vtableId(11)</p>
     * @param RHS [in] {@code XlRoutingSlipDelivery}
     */
    @ComProperty(name = "Delivery", dispId = 0x3bb)
    com.sun.jna.platform.win32.WinNT.HRESULT setDelivery(XlRoutingSlipDelivery RHS);
            
    /**
     * <p>id(0x3ba)</p>
     * <p>vtableId(12)</p>
     * @param RHS [out] {@code Object}
     */
    @ComProperty(name = "Message", dispId = 0x3ba)
    com.sun.jna.platform.win32.WinNT.HRESULT getMessage(VARIANT RHS);
            
    /**
     * <p>id(0x3ba)</p>
     * <p>vtableId(13)</p>
     * @param RHS [in] {@code Object}
     */
    @ComProperty(name = "Message", dispId = 0x3ba)
    com.sun.jna.platform.win32.WinNT.HRESULT setMessage(Object RHS);
            
    /**
     * <p>id(0x3b8)</p>
     * <p>vtableId(14)</p>
     * @param Index [in, optional] {@code Object}
     * @param RHS [out] {@code Object}
     */
    @ComProperty(name = "Recipients", dispId = 0x3b8)
    com.sun.jna.platform.win32.WinNT.HRESULT getRecipients(Object Index,
            VARIANT RHS);
            
    /**
     * <p>id(0x3b8)</p>
     * <p>vtableId(15)</p>
     * @param Index [in, optional] {@code Object}
     * @param RHS [in] {@code Object}
     */
    @ComProperty(name = "Recipients", dispId = 0x3b8)
    com.sun.jna.platform.win32.WinNT.HRESULT setRecipients(Object Index,
            Object RHS);
            
    /**
     * <p>id(0x22b)</p>
     * <p>vtableId(16)</p>
     * @param RHS [out] {@code Object}
     */
    @ComMethod(name = "Reset", dispId = 0x22b)
    com.sun.jna.platform.win32.WinNT.HRESULT Reset(VARIANT RHS);
            
    /**
     * <p>id(0x3bc)</p>
     * <p>vtableId(17)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "ReturnWhenDone", dispId = 0x3bc)
    com.sun.jna.platform.win32.WinNT.HRESULT getReturnWhenDone(VARIANT RHS);
            
    /**
     * <p>id(0x3bc)</p>
     * <p>vtableId(18)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "ReturnWhenDone", dispId = 0x3bc)
    com.sun.jna.platform.win32.WinNT.HRESULT setReturnWhenDone(Boolean RHS);
            
    /**
     * <p>id(0x3be)</p>
     * <p>vtableId(19)</p>
     * @param RHS [out] {@code XlRoutingSlipStatus}
     */
    @ComProperty(name = "Status", dispId = 0x3be)
    com.sun.jna.platform.win32.WinNT.HRESULT getStatus(VARIANT RHS);
            
    /**
     * <p>id(0x3b9)</p>
     * <p>vtableId(20)</p>
     * @param RHS [out] {@code Object}
     */
    @ComProperty(name = "Subject", dispId = 0x3b9)
    com.sun.jna.platform.win32.WinNT.HRESULT getSubject(VARIANT RHS);
            
    /**
     * <p>id(0x3b9)</p>
     * <p>vtableId(21)</p>
     * @param RHS [in] {@code Object}
     */
    @ComProperty(name = "Subject", dispId = 0x3b9)
    com.sun.jna.platform.win32.WinNT.HRESULT setSubject(Object RHS);
            
    /**
     * <p>id(0x3bd)</p>
     * <p>vtableId(22)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "TrackStatus", dispId = 0x3bd)
    com.sun.jna.platform.win32.WinNT.HRESULT getTrackStatus(VARIANT RHS);
            
    /**
     * <p>id(0x3bd)</p>
     * <p>vtableId(23)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "TrackStatus", dispId = 0x3bd)
    com.sun.jna.platform.win32.WinNT.HRESULT setTrackStatus(Boolean RHS);
            
    
}