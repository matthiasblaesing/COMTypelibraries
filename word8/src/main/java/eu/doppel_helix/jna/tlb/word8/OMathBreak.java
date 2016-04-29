
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({65E515D5-F50B-4951-8F38-FA6AC8707387})</p>
 */
@ComInterface(iid="{65E515D5-F50B-4951-8F38-FA6AC8707387}")
public interface OMathBreak {
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
    @ComProperty(name = "Range", dispId = 0x68)
    Range getRange();
            
    /**
     * <p>id(0x69)</p>
     */
    @ComProperty(name = "AlignAt", dispId = 0x69)
    Integer getAlignAt();
            
    /**
     * <p>id(0x69)</p>
     */
    @ComProperty(name = "AlignAt", dispId = 0x69)
    void setAlignAt(Integer param0);
            
    /**
     * <p>id(0x6a)</p>
     */
    @ComMethod(name = "Delete", dispId = 0x6a)
    void Delete();
            
    
}