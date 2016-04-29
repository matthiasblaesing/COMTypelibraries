
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({0002093A-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{0002093A-0000-0000-C000-000000000046}")
public interface Shading {
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
     * <p>id(0x1)</p>
     */
    @ComProperty(name = "ForegroundPatternColorIndex", dispId = 0x1)
    WdColorIndex getForegroundPatternColorIndex();
            
    /**
     * <p>id(0x1)</p>
     */
    @ComProperty(name = "ForegroundPatternColorIndex", dispId = 0x1)
    void setForegroundPatternColorIndex(WdColorIndex param0);
            
    /**
     * <p>id(0x2)</p>
     */
    @ComProperty(name = "BackgroundPatternColorIndex", dispId = 0x2)
    WdColorIndex getBackgroundPatternColorIndex();
            
    /**
     * <p>id(0x2)</p>
     */
    @ComProperty(name = "BackgroundPatternColorIndex", dispId = 0x2)
    void setBackgroundPatternColorIndex(WdColorIndex param0);
            
    /**
     * <p>id(0x3)</p>
     */
    @ComProperty(name = "Texture", dispId = 0x3)
    WdTextureIndex getTexture();
            
    /**
     * <p>id(0x3)</p>
     */
    @ComProperty(name = "Texture", dispId = 0x3)
    void setTexture(WdTextureIndex param0);
            
    /**
     * <p>id(0x4)</p>
     */
    @ComProperty(name = "ForegroundPatternColor", dispId = 0x4)
    WdColor getForegroundPatternColor();
            
    /**
     * <p>id(0x4)</p>
     */
    @ComProperty(name = "ForegroundPatternColor", dispId = 0x4)
    void setForegroundPatternColor(WdColor param0);
            
    /**
     * <p>id(0x5)</p>
     */
    @ComProperty(name = "BackgroundPatternColor", dispId = 0x5)
    WdColor getBackgroundPatternColor();
            
    /**
     * <p>id(0x5)</p>
     */
    @ComProperty(name = "BackgroundPatternColor", dispId = 0x5)
    void setBackgroundPatternColor(WdColor param0);
            
    
}