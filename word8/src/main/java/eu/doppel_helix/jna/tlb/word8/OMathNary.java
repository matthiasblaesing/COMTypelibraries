
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({CEBD4184-4E6D-4FC6-A42D-2142B1B76AF5})</p>
 */
@ComInterface(iid="{CEBD4184-4E6D-4FC6-A42D-2142B1B76AF5}")
public interface OMathNary extends IUnknown, IRawDispatchHandle, IDispatch {
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
    @ComProperty(name = "Sub", dispId = 0x67)
    OMath getSub();
            
    /**
     * <p>id(0x68)</p>
     * <p>vtableId(11)</p>
     */
    @ComProperty(name = "Sup", dispId = 0x68)
    OMath getSup();
            
    /**
     * <p>id(0x69)</p>
     * <p>vtableId(12)</p>
     */
    @ComProperty(name = "E", dispId = 0x69)
    OMath getE();
            
    /**
     * <p>id(0x6a)</p>
     * <p>vtableId(13)</p>
     */
    @ComProperty(name = "Char", dispId = 0x6a)
    Short get_Char();
            
    /**
     * <p>id(0x6a)</p>
     * <p>vtableId(14)</p>
     * @param param0 [in] {@code Short}
     */
    @ComProperty(name = "Char", dispId = 0x6a)
    void set_Char(Short param0);
            
    /**
     * <p>id(0x6b)</p>
     * <p>vtableId(15)</p>
     */
    @ComProperty(name = "Grow", dispId = 0x6b)
    Boolean getGrow();
            
    /**
     * <p>id(0x6b)</p>
     * <p>vtableId(16)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "Grow", dispId = 0x6b)
    void setGrow(Boolean param0);
            
    /**
     * <p>id(0x6c)</p>
     * <p>vtableId(17)</p>
     */
    @ComProperty(name = "SubSupLim", dispId = 0x6c)
    Boolean getSubSupLim();
            
    /**
     * <p>id(0x6c)</p>
     * <p>vtableId(18)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "SubSupLim", dispId = 0x6c)
    void setSubSupLim(Boolean param0);
            
    /**
     * <p>id(0x6d)</p>
     * <p>vtableId(19)</p>
     */
    @ComProperty(name = "HideSub", dispId = 0x6d)
    Boolean getHideSub();
            
    /**
     * <p>id(0x6d)</p>
     * <p>vtableId(20)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "HideSub", dispId = 0x6d)
    void setHideSub(Boolean param0);
            
    /**
     * <p>id(0x6e)</p>
     * <p>vtableId(21)</p>
     */
    @ComProperty(name = "HideSup", dispId = 0x6e)
    Boolean getHideSup();
            
    /**
     * <p>id(0x6e)</p>
     * <p>vtableId(22)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "HideSup", dispId = 0x6e)
    void setHideSup(Boolean param0);
            
    
}