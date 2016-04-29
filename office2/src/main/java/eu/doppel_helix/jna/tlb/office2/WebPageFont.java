
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000C0913-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000C0913-0000-0000-C000-000000000046}")
public interface WebPageFont {
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
     * <p>id(0xa)</p>
     */
    @ComProperty(name = "ProportionalFont", dispId = 0xa)
    String getProportionalFont();
            
    /**
     * <p>id(0xa)</p>
     */
    @ComProperty(name = "ProportionalFont", dispId = 0xa)
    void setProportionalFont(String param0);
            
    /**
     * <p>id(0xb)</p>
     */
    @ComProperty(name = "ProportionalFontSize", dispId = 0xb)
    Float getProportionalFontSize();
            
    /**
     * <p>id(0xb)</p>
     */
    @ComProperty(name = "ProportionalFontSize", dispId = 0xb)
    void setProportionalFontSize(Float param0);
            
    /**
     * <p>id(0xc)</p>
     */
    @ComProperty(name = "FixedWidthFont", dispId = 0xc)
    String getFixedWidthFont();
            
    /**
     * <p>id(0xc)</p>
     */
    @ComProperty(name = "FixedWidthFont", dispId = 0xc)
    void setFixedWidthFont(String param0);
            
    /**
     * <p>id(0xd)</p>
     */
    @ComProperty(name = "FixedWidthFontSize", dispId = 0xd)
    Float getFixedWidthFontSize();
            
    /**
     * <p>id(0xd)</p>
     */
    @ComProperty(name = "FixedWidthFontSize", dispId = 0xd)
    void setFixedWidthFontSize(Float param0);
            
    
}