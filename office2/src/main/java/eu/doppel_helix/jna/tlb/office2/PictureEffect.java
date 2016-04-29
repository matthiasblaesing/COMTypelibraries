
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000C03D1-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000C03D1-0000-0000-C000-000000000046}")
public interface PictureEffect {
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
    @ComProperty(name = "Type", dispId = 0x0)
    MsoPictureEffectType getType();
            
    /**
     * <p>id(0x1)</p>
     */
    @ComProperty(name = "Position", dispId = 0x1)
    void setPosition(Integer param0);
            
    /**
     * <p>id(0x1)</p>
     */
    @ComProperty(name = "Position", dispId = 0x1)
    Integer getPosition();
            
    /**
     * <p>id(0x2)</p>
     */
    @ComMethod(name = "Delete", dispId = 0x2)
    void Delete();
            
    /**
     * <p>id(0x3)</p>
     */
    @ComProperty(name = "EffectParameters", dispId = 0x3)
    EffectParameters getEffectParameters();
            
    /**
     * <p>id(0x4)</p>
     */
    @ComProperty(name = "Visible", dispId = 0x4)
    void setVisible(MsoTriState param0);
            
    /**
     * <p>id(0x4)</p>
     */
    @ComProperty(name = "Visible", dispId = 0x4)
    MsoTriState getVisible();
            
    
}