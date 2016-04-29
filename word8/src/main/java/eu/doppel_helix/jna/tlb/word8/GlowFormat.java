
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({F1B14F40-5C32-4C8C-B5B2-DE537BB6B89D})</p>
 */
@ComInterface(iid="{F1B14F40-5C32-4C8C-B5B2-DE537BB6B89D}")
public interface GlowFormat {
    /**
     * <p>id(0x1)</p>
     */
    @ComProperty(name = "Radius", dispId = 0x1)
    Float getRadius();
            
    /**
     * <p>id(0x1)</p>
     */
    @ComProperty(name = "Radius", dispId = 0x1)
    void setRadius(Float param0);
            
    /**
     * <p>id(0x2)</p>
     */
    @ComProperty(name = "Color", dispId = 0x2)
    ColorFormat getColor();
            
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
     * <p>id(0x3)</p>
     */
    @ComProperty(name = "Transparency", dispId = 0x3)
    Float getTransparency();
            
    /**
     * <p>id(0x3)</p>
     */
    @ComProperty(name = "Transparency", dispId = 0x3)
    void setTransparency(Float param0);
            
    
}