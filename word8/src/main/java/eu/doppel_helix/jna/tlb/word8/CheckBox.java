
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00020926-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{00020926-0000-0000-C000-000000000046}")
public interface CheckBox {
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
    @ComProperty(name = "AutoSize", dispId = 0x1)
    Boolean getAutoSize();
            
    /**
     * <p>id(0x1)</p>
     */
    @ComProperty(name = "AutoSize", dispId = 0x1)
    void setAutoSize(Boolean param0);
            
    /**
     * <p>id(0x2)</p>
     */
    @ComProperty(name = "Size", dispId = 0x2)
    Float getSize();
            
    /**
     * <p>id(0x2)</p>
     */
    @ComProperty(name = "Size", dispId = 0x2)
    void setSize(Float param0);
            
    /**
     * <p>id(0x3)</p>
     */
    @ComProperty(name = "Default", dispId = 0x3)
    Boolean get_Default();
            
    /**
     * <p>id(0x3)</p>
     */
    @ComProperty(name = "Default", dispId = 0x3)
    void set_Default(Boolean param0);
            
    /**
     * <p>id(0x4)</p>
     */
    @ComProperty(name = "Value", dispId = 0x4)
    Boolean getValue();
            
    /**
     * <p>id(0x4)</p>
     */
    @ComProperty(name = "Value", dispId = 0x4)
    void setValue(Boolean param0);
            
    
}