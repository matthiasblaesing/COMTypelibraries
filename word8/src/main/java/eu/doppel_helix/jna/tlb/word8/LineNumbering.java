
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00020972-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{00020972-0000-0000-C000-000000000046}")
public interface LineNumbering {
    /**
     * <p>id(0x3e8)</p>
     */
    @ComProperty(name = "Application", dispId = 0x3e8)
    Application getApplication();
            
    /**
     * <p>id(0x3e9)</p>
     */
    @ComProperty(name = "Creator", dispId = 0x3e9)
    Integer getCreator();
            
    /**
     * <p>id(0x3ea)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x3ea)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * <p>id(0x64)</p>
     */
    @ComProperty(name = "RestartMode", dispId = 0x64)
    WdNumberingRule getRestartMode();
            
    /**
     * <p>id(0x64)</p>
     */
    @ComProperty(name = "RestartMode", dispId = 0x64)
    void setRestartMode(WdNumberingRule param0);
            
    /**
     * <p>id(0x65)</p>
     */
    @ComProperty(name = "StartingNumber", dispId = 0x65)
    Integer getStartingNumber();
            
    /**
     * <p>id(0x65)</p>
     */
    @ComProperty(name = "StartingNumber", dispId = 0x65)
    void setStartingNumber(Integer param0);
            
    /**
     * <p>id(0x66)</p>
     */
    @ComProperty(name = "DistanceFromText", dispId = 0x66)
    Float getDistanceFromText();
            
    /**
     * <p>id(0x66)</p>
     */
    @ComProperty(name = "DistanceFromText", dispId = 0x66)
    void setDistanceFromText(Float param0);
            
    /**
     * <p>id(0x67)</p>
     */
    @ComProperty(name = "CountBy", dispId = 0x67)
    Integer getCountBy();
            
    /**
     * <p>id(0x67)</p>
     */
    @ComProperty(name = "CountBy", dispId = 0x67)
    void setCountBy(Integer param0);
            
    /**
     * <p>id(0x68)</p>
     */
    @ComProperty(name = "Active", dispId = 0x68)
    Integer getActive();
            
    /**
     * <p>id(0x68)</p>
     */
    @ComProperty(name = "Active", dispId = 0x68)
    void setActive(Integer param0);
            
    
}