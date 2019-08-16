
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({0002093A-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{0002093A-0000-0000-C000-000000000046}")
public interface Shading extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x3e8)</p>
     * <p>vtableId(7)</p>
     */
    @ComProperty(name = "Application", dispId = 0x3e8)
    Application getApplication();
            
    /**
     * <p>id(0x3e9)</p>
     * <p>vtableId(8)</p>
     */
    @ComProperty(name = "Creator", dispId = 0x3e9)
    Integer getCreator();
            
    /**
     * <p>id(0x3ea)</p>
     * <p>vtableId(9)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x3ea)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * <p>id(0x1)</p>
     * <p>vtableId(10)</p>
     */
    @ComProperty(name = "ForegroundPatternColorIndex", dispId = 0x1)
    WdColorIndex getForegroundPatternColorIndex();
            
    /**
     * <p>id(0x1)</p>
     * <p>vtableId(11)</p>
     * @param param0 [in] {@code WdColorIndex}
     */
    @ComProperty(name = "ForegroundPatternColorIndex", dispId = 0x1)
    void setForegroundPatternColorIndex(WdColorIndex param0);
            
    /**
     * <p>id(0x2)</p>
     * <p>vtableId(12)</p>
     */
    @ComProperty(name = "BackgroundPatternColorIndex", dispId = 0x2)
    WdColorIndex getBackgroundPatternColorIndex();
            
    /**
     * <p>id(0x2)</p>
     * <p>vtableId(13)</p>
     * @param param0 [in] {@code WdColorIndex}
     */
    @ComProperty(name = "BackgroundPatternColorIndex", dispId = 0x2)
    void setBackgroundPatternColorIndex(WdColorIndex param0);
            
    /**
     * <p>id(0x3)</p>
     * <p>vtableId(14)</p>
     */
    @ComProperty(name = "Texture", dispId = 0x3)
    WdTextureIndex getTexture();
            
    /**
     * <p>id(0x3)</p>
     * <p>vtableId(15)</p>
     * @param param0 [in] {@code WdTextureIndex}
     */
    @ComProperty(name = "Texture", dispId = 0x3)
    void setTexture(WdTextureIndex param0);
            
    /**
     * <p>id(0x4)</p>
     * <p>vtableId(16)</p>
     */
    @ComProperty(name = "ForegroundPatternColor", dispId = 0x4)
    WdColor getForegroundPatternColor();
            
    /**
     * <p>id(0x4)</p>
     * <p>vtableId(17)</p>
     * @param param0 [in] {@code WdColor}
     */
    @ComProperty(name = "ForegroundPatternColor", dispId = 0x4)
    void setForegroundPatternColor(WdColor param0);
            
    /**
     * <p>id(0x5)</p>
     * <p>vtableId(18)</p>
     */
    @ComProperty(name = "BackgroundPatternColor", dispId = 0x5)
    WdColor getBackgroundPatternColor();
            
    /**
     * <p>id(0x5)</p>
     * <p>vtableId(19)</p>
     * @param param0 [in] {@code WdColor}
     */
    @ComProperty(name = "BackgroundPatternColor", dispId = 0x5)
    void setBackgroundPatternColor(WdColor param0);
            
    
}