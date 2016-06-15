
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000672DC-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000672DC-0000-0000-C000-000000000046}")
public interface _OlkOptionButton extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0xfffffde1)</p>
     */
    @ComProperty(name = "Accelerator", dispId = 0xfffffde1)
    String getAccelerator();
            
    /**
     * <p>id(0xfffffde1)</p>
     */
    @ComProperty(name = "Accelerator", dispId = 0xfffffde1)
    void setAccelerator(String param0);
            
    /**
     * <p>id(0x2c6)</p>
     */
    @ComProperty(name = "Alignment", dispId = 0x2c6)
    OlAlignment getAlignment();
            
    /**
     * <p>id(0x2c6)</p>
     */
    @ComProperty(name = "Alignment", dispId = 0x2c6)
    void setAlignment(OlAlignment param0);
            
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
     * <p>id(0xfffffdfa)</p>
     */
    @ComProperty(name = "Caption", dispId = 0xfffffdfa)
    String getCaption();
            
    /**
     * <p>id(0xfffffdfa)</p>
     */
    @ComProperty(name = "Caption", dispId = 0xfffffdfa)
    void setCaption(String param0);
            
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
     * <p>id(0xfffffe00)</p>
     */
    @ComProperty(name = "Font", dispId = 0xfffffe00)
    eu.doppel_helix.jna.tlb.stdole2.Font getFont();
            
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
     * <p>id(0xfffffde3)</p>
     */
    @ComProperty(name = "GroupName", dispId = 0xfffffde3)
    String getGroupName();
            
    /**
     * <p>id(0xfffffde3)</p>
     */
    @ComProperty(name = "GroupName", dispId = 0xfffffde3)
    void setGroupName(String param0);
            
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
            
    /**
     * <p>id(0x0)</p>
     */
    @ComProperty(name = "Value", dispId = 0x0)
    Object getValue();
            
    /**
     * <p>id(0x0)</p>
     */
    @ComProperty(name = "Value", dispId = 0x0)
    void setValue(Object param0);
            
    /**
     * <p>id(0xfffffde8)</p>
     */
    @ComProperty(name = "WordWrap", dispId = 0xfffffde8)
    Boolean getWordWrap();
            
    /**
     * <p>id(0xfffffde8)</p>
     */
    @ComProperty(name = "WordWrap", dispId = 0xfffffde8)
    void setWordWrap(Boolean param0);
            
    
}