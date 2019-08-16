
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000C1718-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000C1718-0000-0000-C000-000000000046}")
public interface ChartFont extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x60020000)</p>
     * <p>vtableId(7)</p>
     * @param param0 [in] {@code Object}
     */
    @ComProperty(name = "Background", dispId = 0x60020000)
    void setBackground(Object param0);
            
    /**
     * <p>id(0x60020000)</p>
     * <p>vtableId(8)</p>
     */
    @ComProperty(name = "Background", dispId = 0x60020000)
    Object getBackground();
            
    /**
     * <p>id(0x60020002)</p>
     * <p>vtableId(9)</p>
     * @param param0 [in] {@code Object}
     */
    @ComProperty(name = "Bold", dispId = 0x60020002)
    void setBold(Object param0);
            
    /**
     * <p>id(0x60020002)</p>
     * <p>vtableId(10)</p>
     */
    @ComProperty(name = "Bold", dispId = 0x60020002)
    Object getBold();
            
    /**
     * <p>id(0x60020004)</p>
     * <p>vtableId(11)</p>
     * @param param0 [in] {@code Object}
     */
    @ComProperty(name = "Color", dispId = 0x60020004)
    void setColor(Object param0);
            
    /**
     * <p>id(0x60020004)</p>
     * <p>vtableId(12)</p>
     */
    @ComProperty(name = "Color", dispId = 0x60020004)
    Object getColor();
            
    /**
     * <p>id(0x60020006)</p>
     * <p>vtableId(13)</p>
     * @param param0 [in] {@code Object}
     */
    @ComProperty(name = "ColorIndex", dispId = 0x60020006)
    void setColorIndex(Object param0);
            
    /**
     * <p>id(0x60020006)</p>
     * <p>vtableId(14)</p>
     */
    @ComProperty(name = "ColorIndex", dispId = 0x60020006)
    Object getColorIndex();
            
    /**
     * <p>id(0x60020008)</p>
     * <p>vtableId(15)</p>
     * @param param0 [in] {@code Object}
     */
    @ComProperty(name = "FontStyle", dispId = 0x60020008)
    void setFontStyle(Object param0);
            
    /**
     * <p>id(0x60020008)</p>
     * <p>vtableId(16)</p>
     */
    @ComProperty(name = "FontStyle", dispId = 0x60020008)
    Object getFontStyle();
            
    /**
     * <p>id(0x6002000a)</p>
     * <p>vtableId(17)</p>
     * @param param0 [in] {@code Object}
     */
    @ComProperty(name = "Italic", dispId = 0x6002000a)
    void setItalic(Object param0);
            
    /**
     * <p>id(0x6002000a)</p>
     * <p>vtableId(18)</p>
     */
    @ComProperty(name = "Italic", dispId = 0x6002000a)
    Object getItalic();
            
    /**
     * <p>id(0x6002000c)</p>
     * <p>vtableId(19)</p>
     * @param param0 [in] {@code Object}
     */
    @ComProperty(name = "Name", dispId = 0x6002000c)
    void setName(Object param0);
            
    /**
     * <p>id(0x6002000c)</p>
     * <p>vtableId(20)</p>
     */
    @ComProperty(name = "Name", dispId = 0x6002000c)
    Object getName();
            
    /**
     * <p>id(0x6002000e)</p>
     * <p>vtableId(21)</p>
     * @param param0 [in] {@code Object}
     */
    @ComProperty(name = "OutlineFont", dispId = 0x6002000e)
    void setOutlineFont(Object param0);
            
    /**
     * <p>id(0x6002000e)</p>
     * <p>vtableId(22)</p>
     */
    @ComProperty(name = "OutlineFont", dispId = 0x6002000e)
    Object getOutlineFont();
            
    /**
     * <p>id(0x60020010)</p>
     * <p>vtableId(23)</p>
     * @param param0 [in] {@code Object}
     */
    @ComProperty(name = "Shadow", dispId = 0x60020010)
    void setShadow(Object param0);
            
    /**
     * <p>id(0x60020010)</p>
     * <p>vtableId(24)</p>
     */
    @ComProperty(name = "Shadow", dispId = 0x60020010)
    Object getShadow();
            
    /**
     * <p>id(0x60020012)</p>
     * <p>vtableId(25)</p>
     * @param param0 [in] {@code Object}
     */
    @ComProperty(name = "Size", dispId = 0x60020012)
    void setSize(Object param0);
            
    /**
     * <p>id(0x60020012)</p>
     * <p>vtableId(26)</p>
     */
    @ComProperty(name = "Size", dispId = 0x60020012)
    Object getSize();
            
    /**
     * <p>id(0x60020014)</p>
     * <p>vtableId(27)</p>
     * @param param0 [in] {@code Object}
     */
    @ComProperty(name = "StrikeThrough", dispId = 0x60020014)
    void setStrikeThrough(Object param0);
            
    /**
     * <p>id(0x60020014)</p>
     * <p>vtableId(28)</p>
     */
    @ComProperty(name = "StrikeThrough", dispId = 0x60020014)
    Object getStrikeThrough();
            
    /**
     * <p>id(0x60020016)</p>
     * <p>vtableId(29)</p>
     * @param param0 [in] {@code Object}
     */
    @ComProperty(name = "Subscript", dispId = 0x60020016)
    void setSubscript(Object param0);
            
    /**
     * <p>id(0x60020016)</p>
     * <p>vtableId(30)</p>
     */
    @ComProperty(name = "Subscript", dispId = 0x60020016)
    Object getSubscript();
            
    /**
     * <p>id(0x60020018)</p>
     * <p>vtableId(31)</p>
     * @param param0 [in] {@code Object}
     */
    @ComProperty(name = "Superscript", dispId = 0x60020018)
    void setSuperscript(Object param0);
            
    /**
     * <p>id(0x60020018)</p>
     * <p>vtableId(32)</p>
     */
    @ComProperty(name = "Superscript", dispId = 0x60020018)
    Object getSuperscript();
            
    /**
     * <p>id(0x6002001a)</p>
     * <p>vtableId(33)</p>
     * @param param0 [in] {@code Object}
     */
    @ComProperty(name = "Underline", dispId = 0x6002001a)
    void setUnderline(Object param0);
            
    /**
     * <p>id(0x6002001a)</p>
     * <p>vtableId(34)</p>
     */
    @ComProperty(name = "Underline", dispId = 0x6002001a)
    Object getUnderline();
            
    /**
     * <p>id(0x94)</p>
     * <p>vtableId(35)</p>
     */
    @ComProperty(name = "Application", dispId = 0x94)
    com.sun.jna.platform.win32.COM.util.IDispatch getApplication();
            
    /**
     * <p>id(0x95)</p>
     * <p>vtableId(36)</p>
     */
    @ComProperty(name = "Creator", dispId = 0x95)
    Integer getCreator();
            
    /**
     * <p>id(0x96)</p>
     * <p>vtableId(37)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x96)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    
}