
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({DB77D541-85C3-42E8-8649-AFBD7CF87866})</p>
 */
@ComInterface(iid="{DB77D541-85C3-42E8-8649-AFBD7CF87866}")
public interface OMathPhantom {
    /**
     * <p>id(0x64)</p>
     */
    @ComProperty(name = "Application", dispId = 0x64)
    Application getApplication();
            
    /**
     * <p>id(0x65)</p>
     */
    @ComProperty(name = "Creator", dispId = 0x65)
    Integer getCreator();
            
    /**
     * <p>id(0x66)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x66)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * <p>id(0x67)</p>
     */
    @ComProperty(name = "E", dispId = 0x67)
    OMath getE();
            
    /**
     * <p>id(0x68)</p>
     */
    @ComProperty(name = "Show", dispId = 0x68)
    Boolean getShow();
            
    /**
     * <p>id(0x68)</p>
     */
    @ComProperty(name = "Show", dispId = 0x68)
    void setShow(Boolean param0);
            
    /**
     * <p>id(0x69)</p>
     */
    @ComProperty(name = "ZeroWid", dispId = 0x69)
    Boolean getZeroWid();
            
    /**
     * <p>id(0x69)</p>
     */
    @ComProperty(name = "ZeroWid", dispId = 0x69)
    void setZeroWid(Boolean param0);
            
    /**
     * <p>id(0x6a)</p>
     */
    @ComProperty(name = "ZeroAsc", dispId = 0x6a)
    Boolean getZeroAsc();
            
    /**
     * <p>id(0x6a)</p>
     */
    @ComProperty(name = "ZeroAsc", dispId = 0x6a)
    void setZeroAsc(Boolean param0);
            
    /**
     * <p>id(0x6b)</p>
     */
    @ComProperty(name = "ZeroDesc", dispId = 0x6b)
    Boolean getZeroDesc();
            
    /**
     * <p>id(0x6b)</p>
     */
    @ComProperty(name = "ZeroDesc", dispId = 0x6b)
    void setZeroDesc(Boolean param0);
            
    /**
     * <p>id(0x6c)</p>
     */
    @ComProperty(name = "Transp", dispId = 0x6c)
    Boolean getTransp();
            
    /**
     * <p>id(0x6c)</p>
     */
    @ComProperty(name = "Transp", dispId = 0x6c)
    void setTransp(Boolean param0);
            
    /**
     * <p>id(0x6d)</p>
     */
    @ComProperty(name = "Smash", dispId = 0x6d)
    Boolean getSmash();
            
    /**
     * <p>id(0x6d)</p>
     */
    @ComProperty(name = "Smash", dispId = 0x6d)
    void setSmash(Boolean param0);
            
    
}