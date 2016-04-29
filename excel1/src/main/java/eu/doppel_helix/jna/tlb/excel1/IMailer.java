
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000208D1-0001-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000208D1-0001-0000-C000-000000000046}")
public interface IMailer {
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
     * <p>id(0x3d7)</p>
     */
    @ComProperty(name = "BCCRecipients", dispId = 0x3d7)
    com.sun.jna.platform.win32.WinNT.HRESULT getBCCRecipients(VARIANT RHS);
            
    /**
     * <p>id(0x3d7)</p>
     */
    @ComProperty(name = "BCCRecipients", dispId = 0x3d7)
    com.sun.jna.platform.win32.WinNT.HRESULT setBCCRecipients(Object RHS);
            
    /**
     * <p>id(0x3d6)</p>
     */
    @ComProperty(name = "CCRecipients", dispId = 0x3d6)
    com.sun.jna.platform.win32.WinNT.HRESULT getCCRecipients(VARIANT RHS);
            
    /**
     * <p>id(0x3d6)</p>
     */
    @ComProperty(name = "CCRecipients", dispId = 0x3d6)
    com.sun.jna.platform.win32.WinNT.HRESULT setCCRecipients(Object RHS);
            
    /**
     * <p>id(0x3d8)</p>
     */
    @ComProperty(name = "Enclosures", dispId = 0x3d8)
    com.sun.jna.platform.win32.WinNT.HRESULT getEnclosures(VARIANT RHS);
            
    /**
     * <p>id(0x3d8)</p>
     */
    @ComProperty(name = "Enclosures", dispId = 0x3d8)
    com.sun.jna.platform.win32.WinNT.HRESULT setEnclosures(Object RHS);
            
    /**
     * <p>id(0x3da)</p>
     */
    @ComProperty(name = "Received", dispId = 0x3da)
    com.sun.jna.platform.win32.WinNT.HRESULT getReceived(VARIANT RHS);
            
    /**
     * <p>id(0x3db)</p>
     */
    @ComProperty(name = "SendDateTime", dispId = 0x3db)
    com.sun.jna.platform.win32.WinNT.HRESULT getSendDateTime(VARIANT RHS);
            
    /**
     * <p>id(0x3dc)</p>
     */
    @ComProperty(name = "Sender", dispId = 0x3dc)
    com.sun.jna.platform.win32.WinNT.HRESULT getSender(VARIANT RHS);
            
    /**
     * <p>id(0x3b9)</p>
     */
    @ComProperty(name = "Subject", dispId = 0x3b9)
    com.sun.jna.platform.win32.WinNT.HRESULT getSubject(VARIANT RHS);
            
    /**
     * <p>id(0x3b9)</p>
     */
    @ComProperty(name = "Subject", dispId = 0x3b9)
    com.sun.jna.platform.win32.WinNT.HRESULT setSubject(String RHS);
            
    /**
     * <p>id(0x3d5)</p>
     */
    @ComProperty(name = "ToRecipients", dispId = 0x3d5)
    com.sun.jna.platform.win32.WinNT.HRESULT getToRecipients(VARIANT RHS);
            
    /**
     * <p>id(0x3d5)</p>
     */
    @ComProperty(name = "ToRecipients", dispId = 0x3d5)
    com.sun.jna.platform.win32.WinNT.HRESULT setToRecipients(Object RHS);
            
    /**
     * <p>id(0x3ce)</p>
     */
    @ComProperty(name = "WhichAddress", dispId = 0x3ce)
    com.sun.jna.platform.win32.WinNT.HRESULT getWhichAddress(VARIANT RHS);
            
    /**
     * <p>id(0x3ce)</p>
     */
    @ComProperty(name = "WhichAddress", dispId = 0x3ce)
    com.sun.jna.platform.win32.WinNT.HRESULT setWhichAddress(Object RHS);
            
    
}