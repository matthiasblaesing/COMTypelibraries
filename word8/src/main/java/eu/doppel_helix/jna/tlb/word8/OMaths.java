
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({873E774B-926A-4CB1-878D-635A45187595})</p>
 */
@ComInterface(iid="{873E774B-926A-4CB1-878D-635A45187595}")
public interface OMaths {
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
    @ComProperty(name = "Count", dispId = 0x67)
    Integer getCount();
            
    /**
     * <p>id(0x0)</p>
     */
    @ComMethod(name = "Item", dispId = 0x0)
    OMath Item(Integer Index);
            
    /**
     * <p>id(0xc8)</p>
     */
    @ComMethod(name = "Linearize", dispId = 0xc8)
    void Linearize();
            
    /**
     * <p>id(0xc9)</p>
     */
    @ComMethod(name = "BuildUp", dispId = 0xc9)
    void BuildUp();
            
    /**
     * <p>id(0xca)</p>
     */
    @ComMethod(name = "Add", dispId = 0xca)
    Range Add(Range Range);
            
    
}