
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00020954-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{00020954-0000-0000-C000-000000000046}")
public interface TabStop {
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
    @ComProperty(name = "Alignment", dispId = 0x64)
    WdTabAlignment getAlignment();
            
    /**
     * <p>id(0x64)</p>
     */
    @ComProperty(name = "Alignment", dispId = 0x64)
    void setAlignment(WdTabAlignment param0);
            
    /**
     * <p>id(0x65)</p>
     */
    @ComProperty(name = "Leader", dispId = 0x65)
    WdTabLeader getLeader();
            
    /**
     * <p>id(0x65)</p>
     */
    @ComProperty(name = "Leader", dispId = 0x65)
    void setLeader(WdTabLeader param0);
            
    /**
     * <p>id(0x66)</p>
     */
    @ComProperty(name = "Position", dispId = 0x66)
    Float getPosition();
            
    /**
     * <p>id(0x66)</p>
     */
    @ComProperty(name = "Position", dispId = 0x66)
    void setPosition(Float param0);
            
    /**
     * <p>id(0x67)</p>
     */
    @ComProperty(name = "CustomTab", dispId = 0x67)
    Boolean getCustomTab();
            
    /**
     * <p>id(0x68)</p>
     */
    @ComProperty(name = "Next", dispId = 0x68)
    TabStop getNext();
            
    /**
     * <p>id(0x69)</p>
     */
    @ComProperty(name = "Previous", dispId = 0x69)
    TabStop getPrevious();
            
    /**
     * <p>id(0xc8)</p>
     */
    @ComMethod(name = "Clear", dispId = 0xc8)
    void Clear();
            
    
}