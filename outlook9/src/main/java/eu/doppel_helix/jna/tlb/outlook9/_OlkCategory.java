
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000672F4-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000672F4-0000-0000-C000-000000000046}")
public interface _OlkCategory extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0xfffffe0c)</p>
     */
    @ComProperty(name = "AutoSize", dispId = 0xfffffe0c)
    Boolean getAutoSize();
            
    /**
     * <p>id(0xfffffe0c)</p>
     */
    @ComProperty(name = "AutoSize", dispId = 0xfffffe0c)
    void setAutoSize(Boolean param0);
            
    /**
     * <p>id(0xfffffe0b)</p>
     */
    @ComProperty(name = "BackColor", dispId = 0xfffffe0b)
    Integer getBackColor();
            
    /**
     * <p>id(0xfffffe0b)</p>
     */
    @ComProperty(name = "BackColor", dispId = 0xfffffe0b)
    void setBackColor(Integer param0);
            
    /**
     * <p>id(0xfffffe0a)</p>
     */
    @ComProperty(name = "BackStyle", dispId = 0xfffffe0a)
    OlBackStyle getBackStyle();
            
    /**
     * <p>id(0xfffffe0a)</p>
     */
    @ComProperty(name = "BackStyle", dispId = 0xfffffe0a)
    void setBackStyle(OlBackStyle param0);
            
    /**
     * <p>id(0xfffffdfe)</p>
     */
    @ComProperty(name = "Enabled", dispId = 0xfffffdfe)
    Boolean getEnabled();
            
    /**
     * <p>id(0xfffffdfe)</p>
     */
    @ComProperty(name = "Enabled", dispId = 0xfffffdfe)
    void setEnabled(Boolean param0);
            
    /**
     * <p>id(0xfffffdff)</p>
     */
    @ComProperty(name = "ForeColor", dispId = 0xfffffdff)
    Integer getForeColor();
            
    /**
     * <p>id(0xfffffdff)</p>
     */
    @ComProperty(name = "ForeColor", dispId = 0xfffffdff)
    void setForeColor(Integer param0);
            
    /**
     * <p>id(0xfffffdf6)</p>
     */
    @ComProperty(name = "MouseIcon", dispId = 0xfffffdf6)
    eu.doppel_helix.jna.tlb.stdole2.Picture getMouseIcon();
            
    /**
     * <p>id(0xfffffdf6)</p>
     */
    @ComProperty(name = "MouseIcon", dispId = 0xfffffdf6)
    void setMouseIcon(eu.doppel_helix.jna.tlb.stdole2.Picture param0);
            
    /**
     * <p>id(0xfffffdf7)</p>
     */
    @ComProperty(name = "MousePointer", dispId = 0xfffffdf7)
    OlMousePointer getMousePointer();
            
    /**
     * <p>id(0xfffffdf7)</p>
     */
    @ComProperty(name = "MousePointer", dispId = 0xfffffdf7)
    void setMousePointer(OlMousePointer param0);
            
    
}