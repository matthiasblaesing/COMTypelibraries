
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({0002444B-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{0002444B-0000-0000-C000-000000000046}")
public interface TreeviewControl {
    /**
     * <p>id(0x94)</p>
     */
    @ComProperty(name = "Application", dispId = 0x94)
    Application getApplication();
            
    /**
     * <p>id(0x95)</p>
     */
    @ComProperty(name = "Creator", dispId = 0x95)
    XlCreator getCreator();
            
    /**
     * <p>id(0x96)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x96)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * <p>id(0x10c)</p>
     */
    @ComProperty(name = "Hidden", dispId = 0x10c)
    Object getHidden();
            
    /**
     * <p>id(0x10c)</p>
     */
    @ComProperty(name = "Hidden", dispId = 0x10c)
    void setHidden(Object param0);
            
    /**
     * <p>id(0x77d)</p>
     */
    @ComProperty(name = "Drilled", dispId = 0x77d)
    Object getDrilled();
            
    /**
     * <p>id(0x77d)</p>
     */
    @ComProperty(name = "Drilled", dispId = 0x77d)
    void setDrilled(Object param0);
            
    
}