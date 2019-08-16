
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000208D1-0001-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000208D1-0001-0000-C000-000000000046}")
public interface IMailer extends IUnknown, IRawDispatchHandle, IDispatch {
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
     * <p>id(0x3d7)</p>
     * <p>vtableId(10)</p>
     * @param RHS [out] {@code Object}
     */
    @ComProperty(name = "BCCRecipients", dispId = 0x3d7)
    com.sun.jna.platform.win32.WinNT.HRESULT getBCCRecipients(VARIANT RHS);
            
    /**
     * <p>id(0x3d7)</p>
     * <p>vtableId(11)</p>
     * @param RHS [in] {@code Object}
     */
    @ComProperty(name = "BCCRecipients", dispId = 0x3d7)
    com.sun.jna.platform.win32.WinNT.HRESULT setBCCRecipients(Object RHS);
            
    /**
     * <p>id(0x3d6)</p>
     * <p>vtableId(12)</p>
     * @param RHS [out] {@code Object}
     */
    @ComProperty(name = "CCRecipients", dispId = 0x3d6)
    com.sun.jna.platform.win32.WinNT.HRESULT getCCRecipients(VARIANT RHS);
            
    /**
     * <p>id(0x3d6)</p>
     * <p>vtableId(13)</p>
     * @param RHS [in] {@code Object}
     */
    @ComProperty(name = "CCRecipients", dispId = 0x3d6)
    com.sun.jna.platform.win32.WinNT.HRESULT setCCRecipients(Object RHS);
            
    /**
     * <p>id(0x3d8)</p>
     * <p>vtableId(14)</p>
     * @param RHS [out] {@code Object}
     */
    @ComProperty(name = "Enclosures", dispId = 0x3d8)
    com.sun.jna.platform.win32.WinNT.HRESULT getEnclosures(VARIANT RHS);
            
    /**
     * <p>id(0x3d8)</p>
     * <p>vtableId(15)</p>
     * @param RHS [in] {@code Object}
     */
    @ComProperty(name = "Enclosures", dispId = 0x3d8)
    com.sun.jna.platform.win32.WinNT.HRESULT setEnclosures(Object RHS);
            
    /**
     * <p>id(0x3da)</p>
     * <p>vtableId(16)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "Received", dispId = 0x3da)
    com.sun.jna.platform.win32.WinNT.HRESULT getReceived(VARIANT RHS);
            
    /**
     * <p>id(0x3db)</p>
     * <p>vtableId(17)</p>
     * @param RHS [out] {@code java.util.Date}
     */
    @ComProperty(name = "SendDateTime", dispId = 0x3db)
    com.sun.jna.platform.win32.WinNT.HRESULT getSendDateTime(VARIANT RHS);
            
    /**
     * <p>id(0x3dc)</p>
     * <p>vtableId(18)</p>
     * @param RHS [out] {@code String}
     */
    @ComProperty(name = "Sender", dispId = 0x3dc)
    com.sun.jna.platform.win32.WinNT.HRESULT getSender(VARIANT RHS);
            
    /**
     * <p>id(0x3b9)</p>
     * <p>vtableId(19)</p>
     * @param RHS [out] {@code String}
     */
    @ComProperty(name = "Subject", dispId = 0x3b9)
    com.sun.jna.platform.win32.WinNT.HRESULT getSubject(VARIANT RHS);
            
    /**
     * <p>id(0x3b9)</p>
     * <p>vtableId(20)</p>
     * @param RHS [in] {@code String}
     */
    @ComProperty(name = "Subject", dispId = 0x3b9)
    com.sun.jna.platform.win32.WinNT.HRESULT setSubject(String RHS);
            
    /**
     * <p>id(0x3d5)</p>
     * <p>vtableId(21)</p>
     * @param RHS [out] {@code Object}
     */
    @ComProperty(name = "ToRecipients", dispId = 0x3d5)
    com.sun.jna.platform.win32.WinNT.HRESULT getToRecipients(VARIANT RHS);
            
    /**
     * <p>id(0x3d5)</p>
     * <p>vtableId(22)</p>
     * @param RHS [in] {@code Object}
     */
    @ComProperty(name = "ToRecipients", dispId = 0x3d5)
    com.sun.jna.platform.win32.WinNT.HRESULT setToRecipients(Object RHS);
            
    /**
     * <p>id(0x3ce)</p>
     * <p>vtableId(23)</p>
     * @param RHS [out] {@code Object}
     */
    @ComProperty(name = "WhichAddress", dispId = 0x3ce)
    com.sun.jna.platform.win32.WinNT.HRESULT getWhichAddress(VARIANT RHS);
            
    /**
     * <p>id(0x3ce)</p>
     * <p>vtableId(24)</p>
     * @param RHS [in] {@code Object}
     */
    @ComProperty(name = "WhichAddress", dispId = 0x3ce)
    com.sun.jna.platform.win32.WinNT.HRESULT setWhichAddress(Object RHS);
            
    
}