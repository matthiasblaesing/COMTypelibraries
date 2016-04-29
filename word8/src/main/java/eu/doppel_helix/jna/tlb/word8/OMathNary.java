
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({CEBD4184-4E6D-4FC6-A42D-2142B1B76AF5})</p>
 */
@ComInterface(iid="{CEBD4184-4E6D-4FC6-A42D-2142B1B76AF5}")
public interface OMathNary {
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
    @ComProperty(name = "Sub", dispId = 0x67)
    OMath getSub();
            
    /**
     * <p>id(0x68)</p>
     */
    @ComProperty(name = "Sup", dispId = 0x68)
    OMath getSup();
            
    /**
     * <p>id(0x69)</p>
     */
    @ComProperty(name = "E", dispId = 0x69)
    OMath getE();
            
    /**
     * <p>id(0x6a)</p>
     */
    @ComProperty(name = "Char", dispId = 0x6a)
    Short get_Char();
            
    /**
     * <p>id(0x6a)</p>
     */
    @ComProperty(name = "Char", dispId = 0x6a)
    void set_Char(Short param0);
            
    /**
     * <p>id(0x6b)</p>
     */
    @ComProperty(name = "Grow", dispId = 0x6b)
    Boolean getGrow();
            
    /**
     * <p>id(0x6b)</p>
     */
    @ComProperty(name = "Grow", dispId = 0x6b)
    void setGrow(Boolean param0);
            
    /**
     * <p>id(0x6c)</p>
     */
    @ComProperty(name = "SubSupLim", dispId = 0x6c)
    Boolean getSubSupLim();
            
    /**
     * <p>id(0x6c)</p>
     */
    @ComProperty(name = "SubSupLim", dispId = 0x6c)
    void setSubSupLim(Boolean param0);
            
    /**
     * <p>id(0x6d)</p>
     */
    @ComProperty(name = "HideSub", dispId = 0x6d)
    Boolean getHideSub();
            
    /**
     * <p>id(0x6d)</p>
     */
    @ComProperty(name = "HideSub", dispId = 0x6d)
    void setHideSub(Boolean param0);
            
    /**
     * <p>id(0x6e)</p>
     */
    @ComProperty(name = "HideSup", dispId = 0x6e)
    Boolean getHideSup();
            
    /**
     * <p>id(0x6e)</p>
     */
    @ComProperty(name = "HideSup", dispId = 0x6e)
    void setHideSup(Boolean param0);
            
    
}