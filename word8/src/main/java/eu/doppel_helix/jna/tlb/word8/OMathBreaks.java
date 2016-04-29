
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({E2E0F3A7-204C-40C5-BAA5-290F374FDF5A})</p>
 */
@ComInterface(iid="{E2E0F3A7-204C-40C5-BAA5-290F374FDF5A}")
public interface OMathBreaks {
    /**
     * <p>id(0x65)</p>
     */
    @ComProperty(name = "Application", dispId = 0x65)
    Application getApplication();
            
    /**
     * <p>id(0x66)</p>
     */
    @ComProperty(name = "Creator", dispId = 0x66)
    Integer getCreator();
            
    /**
     * <p>id(0x67)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x67)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * <p>id(0x68)</p>
     */
    @ComProperty(name = "Count", dispId = 0x68)
    Integer getCount();
            
    /**
     * <p>id(0x0)</p>
     */
    @ComMethod(name = "Item", dispId = 0x0)
    OMathBreak Item(Integer Index);
            
    /**
     * <p>id(0x69)</p>
     */
    @ComMethod(name = "Add", dispId = 0x69)
    OMathBreak Add(Range Range);
            
    
}