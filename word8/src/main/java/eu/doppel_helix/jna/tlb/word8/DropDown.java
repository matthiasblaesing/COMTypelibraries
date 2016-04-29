
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00020925-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{00020925-0000-0000-C000-000000000046}")
public interface DropDown {
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
     * <p>id(0x0)</p>
     */
    @ComProperty(name = "Valid", dispId = 0x0)
    Boolean getValid();
            
    /**
     * <p>id(0x1)</p>
     */
    @ComProperty(name = "Default", dispId = 0x1)
    Integer get_Default();
            
    /**
     * <p>id(0x1)</p>
     */
    @ComProperty(name = "Default", dispId = 0x1)
    void set_Default(Integer param0);
            
    /**
     * <p>id(0x2)</p>
     */
    @ComProperty(name = "Value", dispId = 0x2)
    Integer getValue();
            
    /**
     * <p>id(0x2)</p>
     */
    @ComProperty(name = "Value", dispId = 0x2)
    void setValue(Integer param0);
            
    /**
     * <p>id(0x3)</p>
     */
    @ComProperty(name = "ListEntries", dispId = 0x3)
    ListEntries getListEntries();
            
    
}