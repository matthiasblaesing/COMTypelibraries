
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({2503B6EE-0889-44DF-B920-6D6F9659DEA3})</p>
 */
@ComInterface(iid="{2503B6EE-0889-44DF-B920-6D6F9659DEA3}")
public interface OMathBorderBox extends IUnknown, IRawDispatchHandle, IDispatch {
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
    @ComProperty(name = "HideTop", dispId = 0x68)
    Boolean getHideTop();
            
    /**
     * <p>id(0x68)</p>
     */
    @ComProperty(name = "HideTop", dispId = 0x68)
    void setHideTop(Boolean param0);
            
    /**
     * <p>id(0x69)</p>
     */
    @ComProperty(name = "HideBot", dispId = 0x69)
    Boolean getHideBot();
            
    /**
     * <p>id(0x69)</p>
     */
    @ComProperty(name = "HideBot", dispId = 0x69)
    void setHideBot(Boolean param0);
            
    /**
     * <p>id(0x6a)</p>
     */
    @ComProperty(name = "HideLeft", dispId = 0x6a)
    Boolean getHideLeft();
            
    /**
     * <p>id(0x6a)</p>
     */
    @ComProperty(name = "HideLeft", dispId = 0x6a)
    void setHideLeft(Boolean param0);
            
    /**
     * <p>id(0x6b)</p>
     */
    @ComProperty(name = "HideRight", dispId = 0x6b)
    Boolean getHideRight();
            
    /**
     * <p>id(0x6b)</p>
     */
    @ComProperty(name = "HideRight", dispId = 0x6b)
    void setHideRight(Boolean param0);
            
    /**
     * <p>id(0x6c)</p>
     */
    @ComProperty(name = "StrikeH", dispId = 0x6c)
    Boolean getStrikeH();
            
    /**
     * <p>id(0x6c)</p>
     */
    @ComProperty(name = "StrikeH", dispId = 0x6c)
    void setStrikeH(Boolean param0);
            
    /**
     * <p>id(0x6d)</p>
     */
    @ComProperty(name = "StrikeV", dispId = 0x6d)
    Boolean getStrikeV();
            
    /**
     * <p>id(0x6d)</p>
     */
    @ComProperty(name = "StrikeV", dispId = 0x6d)
    void setStrikeV(Boolean param0);
            
    /**
     * <p>id(0x6e)</p>
     */
    @ComProperty(name = "StrikeBLTR", dispId = 0x6e)
    Boolean getStrikeBLTR();
            
    /**
     * <p>id(0x6e)</p>
     */
    @ComProperty(name = "StrikeBLTR", dispId = 0x6e)
    void setStrikeBLTR(Boolean param0);
            
    /**
     * <p>id(0x6f)</p>
     */
    @ComProperty(name = "StrikeTLBR", dispId = 0x6f)
    Boolean getStrikeTLBR();
            
    /**
     * <p>id(0x6f)</p>
     */
    @ComProperty(name = "StrikeTLBR", dispId = 0x6f)
    void setStrikeTLBR(Boolean param0);
            
    
}