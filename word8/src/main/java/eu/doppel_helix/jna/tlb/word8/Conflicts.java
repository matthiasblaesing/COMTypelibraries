
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({C2B83A65-B061-4469-83B6-8877437CB8A0})</p>
 */
@ComInterface(iid="{C2B83A65-B061-4469-83B6-8877437CB8A0}")
public interface Conflicts {
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
     * <p>id(0x5)</p>
     */
    @ComProperty(name = "Count", dispId = 0x5)
    Integer getCount();
            
    /**
     * <p>id(0x0)</p>
     */
    @ComMethod(name = "Item", dispId = 0x0)
    Conflict Item(Integer Index);
            
    /**
     * <p>id(0x65)</p>
     */
    @ComMethod(name = "AcceptAll", dispId = 0x65)
    void AcceptAll();
            
    /**
     * <p>id(0x66)</p>
     */
    @ComMethod(name = "RejectAll", dispId = 0x66)
    void RejectAll();
            
    
}