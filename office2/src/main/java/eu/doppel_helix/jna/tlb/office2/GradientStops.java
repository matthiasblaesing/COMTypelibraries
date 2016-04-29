
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000C03C0-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000C03C0-0000-0000-C000-000000000046}")
public interface GradientStops {
    /**
     * <p>id(0x60020000)</p>
     */
    @ComProperty(name = "Application", dispId = 0x60020000)
    com.sun.jna.platform.win32.COM.util.IDispatch getApplication();
            
    /**
     * <p>id(0x60020001)</p>
     */
    @ComProperty(name = "Creator", dispId = 0x60020001)
    Integer getCreator();
            
    /**
     * <p>id(0x0)</p>
     */
    @ComProperty(name = "Item", dispId = 0x0)
    GradientStop getItem(Integer Index);
            
    /**
     * <p>id(0x2)</p>
     */
    @ComProperty(name = "Count", dispId = 0x2)
    Integer getCount();
            
    /**
     * <p>id(0xa)</p>
     */
    @ComMethod(name = "Delete", dispId = 0xa)
    void Delete(Integer Index);
            
    /**
     * <p>id(0xb)</p>
     */
    @ComMethod(name = "Insert", dispId = 0xb)
    void Insert(Integer RGB,
            Float Position,
            Float Transparency,
            Integer Index);
            
    /**
     * <p>id(0xc)</p>
     */
    @ComMethod(name = "Insert2", dispId = 0xc)
    void Insert2(Integer RGB,
            Float Position,
            Float Transparency,
            Integer Index,
            Float Brightness);
            
    
}