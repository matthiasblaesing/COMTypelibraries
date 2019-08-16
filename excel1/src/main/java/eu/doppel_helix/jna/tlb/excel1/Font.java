
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({0002084D-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{0002084D-0000-0000-C000-000000000046}")
public interface Font extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x94)</p>
     * <p>vtableId(7)</p>
     */
    @ComProperty(name = "Application", dispId = 0x94)
    Application getApplication();
            
    /**
     * <p>id(0x95)</p>
     * <p>vtableId(8)</p>
     */
    @ComProperty(name = "Creator", dispId = 0x95)
    XlCreator getCreator();
            
    /**
     * <p>id(0x96)</p>
     * <p>vtableId(9)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x96)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * <p>id(0xb4)</p>
     * <p>vtableId(10)</p>
     */
    @ComProperty(name = "Background", dispId = 0xb4)
    Object getBackground();
            
    /**
     * <p>id(0xb4)</p>
     * <p>vtableId(11)</p>
     * @param param0 [in] {@code Object}
     */
    @ComProperty(name = "Background", dispId = 0xb4)
    void setBackground(Object param0);
            
    /**
     * <p>id(0x60)</p>
     * <p>vtableId(12)</p>
     */
    @ComProperty(name = "Bold", dispId = 0x60)
    Object getBold();
            
    /**
     * <p>id(0x60)</p>
     * <p>vtableId(13)</p>
     * @param param0 [in] {@code Object}
     */
    @ComProperty(name = "Bold", dispId = 0x60)
    void setBold(Object param0);
            
    /**
     * <p>id(0x63)</p>
     * <p>vtableId(14)</p>
     */
    @ComProperty(name = "Color", dispId = 0x63)
    Object getColor();
            
    /**
     * <p>id(0x63)</p>
     * <p>vtableId(15)</p>
     * @param param0 [in] {@code Object}
     */
    @ComProperty(name = "Color", dispId = 0x63)
    void setColor(Object param0);
            
    /**
     * <p>id(0x61)</p>
     * <p>vtableId(16)</p>
     */
    @ComProperty(name = "ColorIndex", dispId = 0x61)
    Object getColorIndex();
            
    /**
     * <p>id(0x61)</p>
     * <p>vtableId(17)</p>
     * @param param0 [in] {@code Object}
     */
    @ComProperty(name = "ColorIndex", dispId = 0x61)
    void setColorIndex(Object param0);
            
    /**
     * <p>id(0xb1)</p>
     * <p>vtableId(18)</p>
     */
    @ComProperty(name = "FontStyle", dispId = 0xb1)
    Object getFontStyle();
            
    /**
     * <p>id(0xb1)</p>
     * <p>vtableId(19)</p>
     * @param param0 [in] {@code Object}
     */
    @ComProperty(name = "FontStyle", dispId = 0xb1)
    void setFontStyle(Object param0);
            
    /**
     * <p>id(0x65)</p>
     * <p>vtableId(20)</p>
     */
    @ComProperty(name = "Italic", dispId = 0x65)
    Object getItalic();
            
    /**
     * <p>id(0x65)</p>
     * <p>vtableId(21)</p>
     * @param param0 [in] {@code Object}
     */
    @ComProperty(name = "Italic", dispId = 0x65)
    void setItalic(Object param0);
            
    /**
     * <p>id(0x6e)</p>
     * <p>vtableId(22)</p>
     */
    @ComProperty(name = "Name", dispId = 0x6e)
    Object getName();
            
    /**
     * <p>id(0x6e)</p>
     * <p>vtableId(23)</p>
     * @param param0 [in] {@code Object}
     */
    @ComProperty(name = "Name", dispId = 0x6e)
    void setName(Object param0);
            
    /**
     * <p>id(0xdd)</p>
     * <p>vtableId(24)</p>
     */
    @ComProperty(name = "OutlineFont", dispId = 0xdd)
    Object getOutlineFont();
            
    /**
     * <p>id(0xdd)</p>
     * <p>vtableId(25)</p>
     * @param param0 [in] {@code Object}
     */
    @ComProperty(name = "OutlineFont", dispId = 0xdd)
    void setOutlineFont(Object param0);
            
    /**
     * <p>id(0x67)</p>
     * <p>vtableId(26)</p>
     */
    @ComProperty(name = "Shadow", dispId = 0x67)
    Object getShadow();
            
    /**
     * <p>id(0x67)</p>
     * <p>vtableId(27)</p>
     * @param param0 [in] {@code Object}
     */
    @ComProperty(name = "Shadow", dispId = 0x67)
    void setShadow(Object param0);
            
    /**
     * <p>id(0x68)</p>
     * <p>vtableId(28)</p>
     */
    @ComProperty(name = "Size", dispId = 0x68)
    Object getSize();
            
    /**
     * <p>id(0x68)</p>
     * <p>vtableId(29)</p>
     * @param param0 [in] {@code Object}
     */
    @ComProperty(name = "Size", dispId = 0x68)
    void setSize(Object param0);
            
    /**
     * <p>id(0x69)</p>
     * <p>vtableId(30)</p>
     */
    @ComProperty(name = "Strikethrough", dispId = 0x69)
    Object getStrikethrough();
            
    /**
     * <p>id(0x69)</p>
     * <p>vtableId(31)</p>
     * @param param0 [in] {@code Object}
     */
    @ComProperty(name = "Strikethrough", dispId = 0x69)
    void setStrikethrough(Object param0);
            
    /**
     * <p>id(0xb3)</p>
     * <p>vtableId(32)</p>
     */
    @ComProperty(name = "Subscript", dispId = 0xb3)
    Object getSubscript();
            
    /**
     * <p>id(0xb3)</p>
     * <p>vtableId(33)</p>
     * @param param0 [in] {@code Object}
     */
    @ComProperty(name = "Subscript", dispId = 0xb3)
    void setSubscript(Object param0);
            
    /**
     * <p>id(0xb2)</p>
     * <p>vtableId(34)</p>
     */
    @ComProperty(name = "Superscript", dispId = 0xb2)
    Object getSuperscript();
            
    /**
     * <p>id(0xb2)</p>
     * <p>vtableId(35)</p>
     * @param param0 [in] {@code Object}
     */
    @ComProperty(name = "Superscript", dispId = 0xb2)
    void setSuperscript(Object param0);
            
    /**
     * <p>id(0x6a)</p>
     * <p>vtableId(36)</p>
     */
    @ComProperty(name = "Underline", dispId = 0x6a)
    Object getUnderline();
            
    /**
     * <p>id(0x6a)</p>
     * <p>vtableId(37)</p>
     * @param param0 [in] {@code Object}
     */
    @ComProperty(name = "Underline", dispId = 0x6a)
    void setUnderline(Object param0);
            
    /**
     * <p>id(0x93d)</p>
     * <p>vtableId(38)</p>
     */
    @ComProperty(name = "ThemeColor", dispId = 0x93d)
    Object getThemeColor();
            
    /**
     * <p>id(0x93d)</p>
     * <p>vtableId(39)</p>
     * @param param0 [in] {@code Object}
     */
    @ComProperty(name = "ThemeColor", dispId = 0x93d)
    void setThemeColor(Object param0);
            
    /**
     * <p>id(0x93e)</p>
     * <p>vtableId(40)</p>
     */
    @ComProperty(name = "TintAndShade", dispId = 0x93e)
    Object getTintAndShade();
            
    /**
     * <p>id(0x93e)</p>
     * <p>vtableId(41)</p>
     * @param param0 [in] {@code Object}
     */
    @ComProperty(name = "TintAndShade", dispId = 0x93e)
    void setTintAndShade(Object param0);
            
    /**
     * <p>id(0x93f)</p>
     * <p>vtableId(42)</p>
     */
    @ComProperty(name = "ThemeFont", dispId = 0x93f)
    XlThemeFont getThemeFont();
            
    /**
     * <p>id(0x93f)</p>
     * <p>vtableId(43)</p>
     * @param param0 [in] {@code XlThemeFont}
     */
    @ComProperty(name = "ThemeFont", dispId = 0x93f)
    void setThemeFont(XlThemeFont param0);
            
    
}