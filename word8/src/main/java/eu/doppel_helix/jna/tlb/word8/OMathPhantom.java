
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({DB77D541-85C3-42E8-8649-AFBD7CF87866})</p>
 */
@ComInterface(iid="{DB77D541-85C3-42E8-8649-AFBD7CF87866}")
public interface OMathPhantom extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x64)</p>
     * <p>vtableId(7)</p>
     */
    @ComProperty(name = "Application", dispId = 0x64)
    Application getApplication();
            
    /**
     * <p>id(0x65)</p>
     * <p>vtableId(8)</p>
     */
    @ComProperty(name = "Creator", dispId = 0x65)
    Integer getCreator();
            
    /**
     * <p>id(0x66)</p>
     * <p>vtableId(9)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x66)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * <p>id(0x67)</p>
     * <p>vtableId(10)</p>
     */
    @ComProperty(name = "E", dispId = 0x67)
    OMath getE();
            
    /**
     * <p>id(0x68)</p>
     * <p>vtableId(11)</p>
     */
    @ComProperty(name = "Show", dispId = 0x68)
    Boolean getShow();
            
    /**
     * <p>id(0x68)</p>
     * <p>vtableId(12)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "Show", dispId = 0x68)
    void setShow(Boolean param0);
            
    /**
     * <p>id(0x69)</p>
     * <p>vtableId(13)</p>
     */
    @ComProperty(name = "ZeroWid", dispId = 0x69)
    Boolean getZeroWid();
            
    /**
     * <p>id(0x69)</p>
     * <p>vtableId(14)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "ZeroWid", dispId = 0x69)
    void setZeroWid(Boolean param0);
            
    /**
     * <p>id(0x6a)</p>
     * <p>vtableId(15)</p>
     */
    @ComProperty(name = "ZeroAsc", dispId = 0x6a)
    Boolean getZeroAsc();
            
    /**
     * <p>id(0x6a)</p>
     * <p>vtableId(16)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "ZeroAsc", dispId = 0x6a)
    void setZeroAsc(Boolean param0);
            
    /**
     * <p>id(0x6b)</p>
     * <p>vtableId(17)</p>
     */
    @ComProperty(name = "ZeroDesc", dispId = 0x6b)
    Boolean getZeroDesc();
            
    /**
     * <p>id(0x6b)</p>
     * <p>vtableId(18)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "ZeroDesc", dispId = 0x6b)
    void setZeroDesc(Boolean param0);
            
    /**
     * <p>id(0x6c)</p>
     * <p>vtableId(19)</p>
     */
    @ComProperty(name = "Transp", dispId = 0x6c)
    Boolean getTransp();
            
    /**
     * <p>id(0x6c)</p>
     * <p>vtableId(20)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "Transp", dispId = 0x6c)
    void setTransp(Boolean param0);
            
    /**
     * <p>id(0x6d)</p>
     * <p>vtableId(21)</p>
     */
    @ComProperty(name = "Smash", dispId = 0x6d)
    Boolean getSmash();
            
    /**
     * <p>id(0x6d)</p>
     * <p>vtableId(22)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "Smash", dispId = 0x6d)
    void setSmash(Boolean param0);
            
    
}