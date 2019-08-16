
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
     * <p>id(0x3d7)</p>
     * <p>vtableId(10)</p>
     */
    @ComProperty(name = "BCCRecipients", dispId = 0x3d7)
    Object getBCCRecipients();
            
    /**
     * <p>id(0x3d7)</p>
     * <p>vtableId(11)</p>
     * @param param0 [in] {@code Object}
     */
    @ComProperty(name = "BCCRecipients", dispId = 0x3d7)
    void setBCCRecipients(Object param0);
            
    /**
     * <p>id(0x3d6)</p>
     * <p>vtableId(12)</p>
     */
    @ComProperty(name = "CCRecipients", dispId = 0x3d6)
    Object getCCRecipients();
            
    /**
     * <p>id(0x3d6)</p>
     * <p>vtableId(13)</p>
     * @param param0 [in] {@code Object}
     */
    @ComProperty(name = "CCRecipients", dispId = 0x3d6)
    void setCCRecipients(Object param0);
            
    /**
     * <p>id(0x3d8)</p>
     * <p>vtableId(14)</p>
     */
    @ComProperty(name = "Enclosures", dispId = 0x3d8)
    Object getEnclosures();
            
    /**
     * <p>id(0x3d8)</p>
     * <p>vtableId(15)</p>
     * @param param0 [in] {@code Object}
     */
    @ComProperty(name = "Enclosures", dispId = 0x3d8)
    void setEnclosures(Object param0);
            
    /**
     * <p>id(0x3da)</p>
     * <p>vtableId(16)</p>
     */
    @ComProperty(name = "Received", dispId = 0x3da)
    Boolean getReceived();
            
    /**
     * <p>id(0x3db)</p>
     * <p>vtableId(17)</p>
     */
    @ComProperty(name = "SendDateTime", dispId = 0x3db)
    java.util.Date getSendDateTime();
            
    /**
     * <p>id(0x3dc)</p>
     * <p>vtableId(18)</p>
     */
    @ComProperty(name = "Sender", dispId = 0x3dc)
    String getSender();
            
    /**
     * <p>id(0x3b9)</p>
     * <p>vtableId(19)</p>
     */
    @ComProperty(name = "Subject", dispId = 0x3b9)
    String getSubject();
            
    /**
     * <p>id(0x3b9)</p>
     * <p>vtableId(20)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "Subject", dispId = 0x3b9)
    void setSubject(String param0);
            
    /**
     * <p>id(0x3d5)</p>
     * <p>vtableId(21)</p>
     */
    @ComProperty(name = "ToRecipients", dispId = 0x3d5)
    Object getToRecipients();
            
    /**
     * <p>id(0x3d5)</p>
     * <p>vtableId(22)</p>
     * @param param0 [in] {@code Object}
     */
    @ComProperty(name = "ToRecipients", dispId = 0x3d5)
    void setToRecipients(Object param0);
            
    /**
     * <p>id(0x3ce)</p>
     * <p>vtableId(23)</p>
     */
    @ComProperty(name = "WhichAddress", dispId = 0x3ce)
    Object getWhichAddress();
            
    /**
     * <p>id(0x3ce)</p>
     * <p>vtableId(24)</p>
     * @param param0 [in] {@code Object}
     */
    @ComProperty(name = "WhichAddress", dispId = 0x3ce)
    void setWhichAddress(Object param0);
            
    
}