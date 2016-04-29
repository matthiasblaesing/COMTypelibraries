
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000208AA-0001-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000208AA-0001-0000-C000-000000000046}")
public interface IRoutingSlip {
    /**
     * <p>id(0x94)</p>
     */
    @ComProperty(name = "Application", dispId = 0x94)
    com.sun.jna.platform.win32.WinNT.HRESULT getApplication(VARIANT RHS);
            
    /**
     * <p>id(0x95)</p>
     */
    @ComProperty(name = "Creator", dispId = 0x95)
    com.sun.jna.platform.win32.WinNT.HRESULT getCreator(VARIANT RHS);
            
    /**
     * <p>id(0x96)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x96)
    com.sun.jna.platform.win32.WinNT.HRESULT getParent(VARIANT RHS);
            
    /**
     * <p>id(0x3bb)</p>
     */
    @ComProperty(name = "Delivery", dispId = 0x3bb)
    com.sun.jna.platform.win32.WinNT.HRESULT getDelivery(VARIANT RHS);
            
    /**
     * <p>id(0x3bb)</p>
     */
    @ComProperty(name = "Delivery", dispId = 0x3bb)
    com.sun.jna.platform.win32.WinNT.HRESULT setDelivery(XlRoutingSlipDelivery RHS);
            
    /**
     * <p>id(0x3ba)</p>
     */
    @ComProperty(name = "Message", dispId = 0x3ba)
    com.sun.jna.platform.win32.WinNT.HRESULT getMessage(VARIANT RHS);
            
    /**
     * <p>id(0x3ba)</p>
     */
    @ComProperty(name = "Message", dispId = 0x3ba)
    com.sun.jna.platform.win32.WinNT.HRESULT setMessage(Object RHS);
            
    /**
     * <p>id(0x3b8)</p>
     */
    @ComProperty(name = "Recipients", dispId = 0x3b8)
    com.sun.jna.platform.win32.WinNT.HRESULT getRecipients(Object Index,
            VARIANT RHS);
            
    /**
     * <p>id(0x3b8)</p>
     */
    @ComProperty(name = "Recipients", dispId = 0x3b8)
    com.sun.jna.platform.win32.WinNT.HRESULT setRecipients(Object Index,
            Object RHS);
            
    /**
     * <p>id(0x22b)</p>
     */
    @ComMethod(name = "Reset", dispId = 0x22b)
    com.sun.jna.platform.win32.WinNT.HRESULT Reset(VARIANT RHS);
            
    /**
     * <p>id(0x3bc)</p>
     */
    @ComProperty(name = "ReturnWhenDone", dispId = 0x3bc)
    com.sun.jna.platform.win32.WinNT.HRESULT getReturnWhenDone(VARIANT RHS);
            
    /**
     * <p>id(0x3bc)</p>
     */
    @ComProperty(name = "ReturnWhenDone", dispId = 0x3bc)
    com.sun.jna.platform.win32.WinNT.HRESULT setReturnWhenDone(Boolean RHS);
            
    /**
     * <p>id(0x3be)</p>
     */
    @ComProperty(name = "Status", dispId = 0x3be)
    com.sun.jna.platform.win32.WinNT.HRESULT getStatus(VARIANT RHS);
            
    /**
     * <p>id(0x3b9)</p>
     */
    @ComProperty(name = "Subject", dispId = 0x3b9)
    com.sun.jna.platform.win32.WinNT.HRESULT getSubject(VARIANT RHS);
            
    /**
     * <p>id(0x3b9)</p>
     */
    @ComProperty(name = "Subject", dispId = 0x3b9)
    com.sun.jna.platform.win32.WinNT.HRESULT setSubject(Object RHS);
            
    /**
     * <p>id(0x3bd)</p>
     */
    @ComProperty(name = "TrackStatus", dispId = 0x3bd)
    com.sun.jna.platform.win32.WinNT.HRESULT getTrackStatus(VARIANT RHS);
            
    /**
     * <p>id(0x3bd)</p>
     */
    @ComProperty(name = "TrackStatus", dispId = 0x3bd)
    com.sun.jna.platform.win32.WinNT.HRESULT setTrackStatus(Boolean RHS);
            
    
}