
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000C1717-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000C1717-0000-0000-C000-000000000046}")
public interface IMsoBorder {
    /**
     * <p>id(0x60020000)</p>
     */
    @ComProperty(name = "Color", dispId = 0x60020000)
    void setColor(Object param0);
            
    /**
     * <p>id(0x60020000)</p>
     */
    @ComProperty(name = "Color", dispId = 0x60020000)
    Object getColor();
            
    /**
     * <p>id(0x60020002)</p>
     */
    @ComProperty(name = "ColorIndex", dispId = 0x60020002)
    void setColorIndex(Object param0);
            
    /**
     * <p>id(0x60020002)</p>
     */
    @ComProperty(name = "ColorIndex", dispId = 0x60020002)
    Object getColorIndex();
            
    /**
     * <p>id(0x60020004)</p>
     */
    @ComProperty(name = "LineStyle", dispId = 0x60020004)
    void setLineStyle(Object param0);
            
    /**
     * <p>id(0x60020004)</p>
     */
    @ComProperty(name = "LineStyle", dispId = 0x60020004)
    Object getLineStyle();
            
    /**
     * <p>id(0x60020006)</p>
     */
    @ComProperty(name = "Weight", dispId = 0x60020006)
    void setWeight(Object param0);
            
    /**
     * <p>id(0x60020006)</p>
     */
    @ComProperty(name = "Weight", dispId = 0x60020006)
    Object getWeight();
            
    /**
     * <p>id(0x94)</p>
     */
    @ComProperty(name = "Application", dispId = 0x94)
    com.sun.jna.platform.win32.COM.util.IDispatch getApplication();
            
    /**
     * <p>id(0x95)</p>
     */
    @ComProperty(name = "Creator", dispId = 0x95)
    Integer getCreator();
            
    /**
     * <p>id(0x96)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x96)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    
}