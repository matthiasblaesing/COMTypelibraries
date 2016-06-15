
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000C0312-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000C0312-0000-0000-C000-000000000046}")
public interface ColorFormat extends IUnknown, IRawDispatchHandle, IDispatch {
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
     * <p>id(0x1)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x1)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * <p>id(0x0)</p>
     */
    @ComProperty(name = "RGB", dispId = 0x0)
    Integer getRGB();
            
    /**
     * <p>id(0x0)</p>
     */
    @ComProperty(name = "RGB", dispId = 0x0)
    void setRGB(Integer param0);
            
    /**
     * <p>id(0x64)</p>
     */
    @ComProperty(name = "SchemeColor", dispId = 0x64)
    Integer getSchemeColor();
            
    /**
     * <p>id(0x64)</p>
     */
    @ComProperty(name = "SchemeColor", dispId = 0x64)
    void setSchemeColor(Integer param0);
            
    /**
     * <p>id(0x65)</p>
     */
    @ComProperty(name = "Type", dispId = 0x65)
    eu.doppel_helix.jna.tlb.office2.ColorFormat getType();
            
    /**
     * <p>id(0x66)</p>
     */
    @ComProperty(name = "TintAndShade", dispId = 0x66)
    Float getTintAndShade();
            
    /**
     * <p>id(0x66)</p>
     */
    @ComProperty(name = "TintAndShade", dispId = 0x66)
    void setTintAndShade(Float param0);
            
    /**
     * <p>id(0x68)</p>
     */
    @ComProperty(name = "ObjectThemeColor", dispId = 0x68)
    eu.doppel_helix.jna.tlb.office2.ColorFormat getObjectThemeColor();
            
    /**
     * <p>id(0x68)</p>
     */
    @ComProperty(name = "ObjectThemeColor", dispId = 0x68)
    void setObjectThemeColor(eu.doppel_helix.jna.tlb.office2.ColorFormat param0);
            
    /**
     * <p>id(0x69)</p>
     */
    @ComProperty(name = "Brightness", dispId = 0x69)
    Float getBrightness();
            
    /**
     * <p>id(0x69)</p>
     */
    @ComProperty(name = "Brightness", dispId = 0x69)
    void setBrightness(Float param0);
            
    
}