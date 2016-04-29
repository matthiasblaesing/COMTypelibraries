
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({0002098B-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{0002098B-0000-0000-C000-000000000046}")
public interface HeadingStyle {
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
    @ComProperty(name = "Style", dispId = 0x0)
    Object getStyle();
            
    /**
     * <p>id(0x0)</p>
     */
    @ComProperty(name = "Style", dispId = 0x0)
    void setStyle(Object param0);
            
    /**
     * <p>id(0x2)</p>
     */
    @ComProperty(name = "Level", dispId = 0x2)
    Short getLevel();
            
    /**
     * <p>id(0x2)</p>
     */
    @ComProperty(name = "Level", dispId = 0x2)
    void setLevel(Short param0);
            
    /**
     * <p>id(0x64)</p>
     */
    @ComMethod(name = "Delete", dispId = 0x64)
    void Delete();
            
    
}