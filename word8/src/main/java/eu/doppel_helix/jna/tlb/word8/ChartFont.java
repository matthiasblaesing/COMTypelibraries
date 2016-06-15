
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({CDB0FF41-E862-47BB-AE77-3FA7B1AE3189})</p>
 */
@ComInterface(iid="{CDB0FF41-E862-47BB-AE77-3FA7B1AE3189}")
public interface ChartFont extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x60020000)</p>
     */
    @ComProperty(name = "Background", dispId = 0x60020000)
    Object getBackground();
            
    /**
     * <p>id(0x60020000)</p>
     */
    @ComProperty(name = "Background", dispId = 0x60020000)
    void setBackground(Object param0);
            
    /**
     * <p>id(0x60020002)</p>
     */
    @ComProperty(name = "Bold", dispId = 0x60020002)
    Object getBold();
            
    /**
     * <p>id(0x60020002)</p>
     */
    @ComProperty(name = "Bold", dispId = 0x60020002)
    void setBold(Object param0);
            
    /**
     * <p>id(0x60020004)</p>
     */
    @ComProperty(name = "Color", dispId = 0x60020004)
    Object getColor();
            
    /**
     * <p>id(0x60020004)</p>
     */
    @ComProperty(name = "Color", dispId = 0x60020004)
    void setColor(Object param0);
            
    /**
     * <p>id(0x60020006)</p>
     */
    @ComProperty(name = "ColorIndex", dispId = 0x60020006)
    Object getColorIndex();
            
    /**
     * <p>id(0x60020006)</p>
     */
    @ComProperty(name = "ColorIndex", dispId = 0x60020006)
    void setColorIndex(Object param0);
            
    /**
     * <p>id(0x60020008)</p>
     */
    @ComProperty(name = "FontStyle", dispId = 0x60020008)
    Object getFontStyle();
            
    /**
     * <p>id(0x60020008)</p>
     */
    @ComProperty(name = "FontStyle", dispId = 0x60020008)
    void setFontStyle(Object param0);
            
    /**
     * <p>id(0x6002000a)</p>
     */
    @ComProperty(name = "Italic", dispId = 0x6002000a)
    Object getItalic();
            
    /**
     * <p>id(0x6002000a)</p>
     */
    @ComProperty(name = "Italic", dispId = 0x6002000a)
    void setItalic(Object param0);
            
    /**
     * <p>id(0x6002000c)</p>
     */
    @ComProperty(name = "Name", dispId = 0x6002000c)
    Object getName();
            
    /**
     * <p>id(0x6002000c)</p>
     */
    @ComProperty(name = "Name", dispId = 0x6002000c)
    void setName(Object param0);
            
    /**
     * <p>id(0x6002000e)</p>
     */
    @ComProperty(name = "OutlineFont", dispId = 0x6002000e)
    Object getOutlineFont();
            
    /**
     * <p>id(0x6002000e)</p>
     */
    @ComProperty(name = "OutlineFont", dispId = 0x6002000e)
    void setOutlineFont(Object param0);
            
    /**
     * <p>id(0x60020010)</p>
     */
    @ComProperty(name = "Shadow", dispId = 0x60020010)
    Object getShadow();
            
    /**
     * <p>id(0x60020010)</p>
     */
    @ComProperty(name = "Shadow", dispId = 0x60020010)
    void setShadow(Object param0);
            
    /**
     * <p>id(0x60020012)</p>
     */
    @ComProperty(name = "Size", dispId = 0x60020012)
    Object getSize();
            
    /**
     * <p>id(0x60020012)</p>
     */
    @ComProperty(name = "Size", dispId = 0x60020012)
    void setSize(Object param0);
            
    /**
     * <p>id(0x60020014)</p>
     */
    @ComProperty(name = "StrikeThrough", dispId = 0x60020014)
    Object getStrikeThrough();
            
    /**
     * <p>id(0x60020014)</p>
     */
    @ComProperty(name = "StrikeThrough", dispId = 0x60020014)
    void setStrikeThrough(Object param0);
            
    /**
     * <p>id(0x60020016)</p>
     */
    @ComProperty(name = "Subscript", dispId = 0x60020016)
    Object getSubscript();
            
    /**
     * <p>id(0x60020016)</p>
     */
    @ComProperty(name = "Subscript", dispId = 0x60020016)
    void setSubscript(Object param0);
            
    /**
     * <p>id(0x60020018)</p>
     */
    @ComProperty(name = "Superscript", dispId = 0x60020018)
    Object getSuperscript();
            
    /**
     * <p>id(0x60020018)</p>
     */
    @ComProperty(name = "Superscript", dispId = 0x60020018)
    void setSuperscript(Object param0);
            
    /**
     * <p>id(0x6002001a)</p>
     */
    @ComProperty(name = "Underline", dispId = 0x6002001a)
    Object getUnderline();
            
    /**
     * <p>id(0x6002001a)</p>
     */
    @ComProperty(name = "Underline", dispId = 0x6002001a)
    void setUnderline(Object param0);
            
    /**
     * <p>id(0x94)</p>
     */
    @ComProperty(name = "Application", dispId = 0x94)
    com.sun.jna.platform.win32.COM.util.IDispatch getApplication();
            
    /**
     * <p>id(0x95)</p>
     */
    @ComProperty(name = "Creator", dispId = 0x95)
    Integer getCreator();
            
    /**
     * <p>id(0x96)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x96)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    
}