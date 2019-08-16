
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000672D9-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000672D9-0000-0000-C000-000000000046}")
public interface _OlkLabel extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0xfffffde1)</p>
     * <p>vtableId(7)</p>
     */
    @ComProperty(name = "Accelerator", dispId = 0xfffffde1)
    String getAccelerator();
            
    /**
     * <p>id(0xfffffde1)</p>
     * <p>vtableId(8)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "Accelerator", dispId = 0xfffffde1)
    void setAccelerator(String param0);
            
    /**
     * <p>id(0xfffffe0c)</p>
     * <p>vtableId(9)</p>
     */
    @ComProperty(name = "AutoSize", dispId = 0xfffffe0c)
    Boolean getAutoSize();
            
    /**
     * <p>id(0xfffffe0c)</p>
     * <p>vtableId(10)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "AutoSize", dispId = 0xfffffe0c)
    void setAutoSize(Boolean param0);
            
    /**
     * <p>id(0xfffffe0b)</p>
     * <p>vtableId(11)</p>
     */
    @ComProperty(name = "BackColor", dispId = 0xfffffe0b)
    Integer getBackColor();
            
    /**
     * <p>id(0xfffffe0b)</p>
     * <p>vtableId(12)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "BackColor", dispId = 0xfffffe0b)
    void setBackColor(Integer param0);
            
    /**
     * <p>id(0xfffffe0a)</p>
     * <p>vtableId(13)</p>
     */
    @ComProperty(name = "BackStyle", dispId = 0xfffffe0a)
    OlBackStyle getBackStyle();
            
    /**
     * <p>id(0xfffffe0a)</p>
     * <p>vtableId(14)</p>
     * @param param0 [in] {@code OlBackStyle}
     */
    @ComProperty(name = "BackStyle", dispId = 0xfffffe0a)
    void setBackStyle(OlBackStyle param0);
            
    /**
     * <p>id(0xfffffe08)</p>
     * <p>vtableId(15)</p>
     */
    @ComProperty(name = "BorderStyle", dispId = 0xfffffe08)
    OlBorderStyle getBorderStyle();
            
    /**
     * <p>id(0xfffffe08)</p>
     * <p>vtableId(16)</p>
     * @param param0 [in] {@code OlBorderStyle}
     */
    @ComProperty(name = "BorderStyle", dispId = 0xfffffe08)
    void setBorderStyle(OlBorderStyle param0);
            
    /**
     * <p>id(0xfffffdfa)</p>
     * <p>vtableId(17)</p>
     */
    @ComProperty(name = "Caption", dispId = 0xfffffdfa)
    String getCaption();
            
    /**
     * <p>id(0xfffffdfa)</p>
     * <p>vtableId(18)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "Caption", dispId = 0xfffffdfa)
    void setCaption(String param0);
            
    /**
     * <p>id(0xfffffdfe)</p>
     * <p>vtableId(19)</p>
     */
    @ComProperty(name = "Enabled", dispId = 0xfffffdfe)
    Boolean getEnabled();
            
    /**
     * <p>id(0xfffffdfe)</p>
     * <p>vtableId(20)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "Enabled", dispId = 0xfffffdfe)
    void setEnabled(Boolean param0);
            
    /**
     * <p>id(0xfffffe00)</p>
     * <p>vtableId(21)</p>
     */
    @ComProperty(name = "Font", dispId = 0xfffffe00)
    eu.doppel_helix.jna.tlb.stdole2.Font getFont();
            
    /**
     * <p>id(0xfffffdff)</p>
     * <p>vtableId(22)</p>
     */
    @ComProperty(name = "ForeColor", dispId = 0xfffffdff)
    Integer getForeColor();
            
    /**
     * <p>id(0xfffffdff)</p>
     * <p>vtableId(23)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "ForeColor", dispId = 0xfffffdff)
    void setForeColor(Integer param0);
            
    /**
     * <p>id(0xfffffdf6)</p>
     * <p>vtableId(24)</p>
     */
    @ComProperty(name = "MouseIcon", dispId = 0xfffffdf6)
    eu.doppel_helix.jna.tlb.stdole2.Picture getMouseIcon();
            
    /**
     * <p>id(0xfffffdf6)</p>
     * <p>vtableId(25)</p>
     * @param param0 [in] {@code eu.doppel_helix.jna.tlb.stdole2.Picture}
     */
    @ComProperty(name = "MouseIcon", dispId = 0xfffffdf6)
    void setMouseIcon(eu.doppel_helix.jna.tlb.stdole2.Picture param0);
            
    /**
     * <p>id(0xfffffdf7)</p>
     * <p>vtableId(26)</p>
     */
    @ComProperty(name = "MousePointer", dispId = 0xfffffdf7)
    OlMousePointer getMousePointer();
            
    /**
     * <p>id(0xfffffdf7)</p>
     * <p>vtableId(27)</p>
     * @param param0 [in] {@code OlMousePointer}
     */
    @ComProperty(name = "MousePointer", dispId = 0xfffffdf7)
    void setMousePointer(OlMousePointer param0);
            
    /**
     * <p>id(0x2714)</p>
     * <p>vtableId(28)</p>
     */
    @ComProperty(name = "TextAlign", dispId = 0x2714)
    OlTextAlign getTextAlign();
            
    /**
     * <p>id(0x2714)</p>
     * <p>vtableId(29)</p>
     * @param param0 [in] {@code OlTextAlign}
     */
    @ComProperty(name = "TextAlign", dispId = 0x2714)
    void setTextAlign(OlTextAlign param0);
            
    /**
     * <p>id(0xfffffde8)</p>
     * <p>vtableId(30)</p>
     */
    @ComProperty(name = "WordWrap", dispId = 0xfffffde8)
    Boolean getWordWrap();
            
    /**
     * <p>id(0xfffffde8)</p>
     * <p>vtableId(31)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "WordWrap", dispId = 0xfffffde8)
    void setWordWrap(Boolean param0);
            
    /**
     * <p>id(0x0)</p>
     * <p>vtableId(32)</p>
     */
    @ComProperty(name = "Value", dispId = 0x0)
    Object getValue();
            
    /**
     * <p>id(0x0)</p>
     * <p>vtableId(33)</p>
     * @param param0 [in] {@code Object}
     */
    @ComProperty(name = "Value", dispId = 0x0)
    void setValue(Object param0);
            
    /**
     * <p>id(0xfc19)</p>
     * <p>vtableId(34)</p>
     */
    @ComProperty(name = "UseHeaderColor", dispId = 0xfc19)
    Boolean getUseHeaderColor();
            
    /**
     * <p>id(0xfc19)</p>
     * <p>vtableId(35)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "UseHeaderColor", dispId = 0xfc19)
    void setUseHeaderColor(Boolean param0);
            
    
}