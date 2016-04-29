
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({0002084D-0001-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{0002084D-0001-0000-C000-000000000046}")
public interface IFont {
    /**
     * <p>id(0x94)</p>
     */
    @ComProperty(name = "Application", dispId = 0x94)
    com.sun.jna.platform.win32.WinNT.HRESULT getApplication(VARIANT RHS);
            
    /**
     * <p>id(0x95)</p>
     */
    @ComProperty(name = "Creator", dispId = 0x95)
    com.sun.jna.platform.win32.WinNT.HRESULT getCreator(VARIANT RHS);
            
    /**
     * <p>id(0x96)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x96)
    com.sun.jna.platform.win32.WinNT.HRESULT getParent(VARIANT RHS);
            
    /**
     * <p>id(0xb4)</p>
     */
    @ComProperty(name = "Background", dispId = 0xb4)
    com.sun.jna.platform.win32.WinNT.HRESULT getBackground(VARIANT RHS);
            
    /**
     * <p>id(0xb4)</p>
     */
    @ComProperty(name = "Background", dispId = 0xb4)
    com.sun.jna.platform.win32.WinNT.HRESULT setBackground(Object RHS);
            
    /**
     * <p>id(0x60)</p>
     */
    @ComProperty(name = "Bold", dispId = 0x60)
    com.sun.jna.platform.win32.WinNT.HRESULT getBold(VARIANT RHS);
            
    /**
     * <p>id(0x60)</p>
     */
    @ComProperty(name = "Bold", dispId = 0x60)
    com.sun.jna.platform.win32.WinNT.HRESULT setBold(Object RHS);
            
    /**
     * <p>id(0x63)</p>
     */
    @ComProperty(name = "Color", dispId = 0x63)
    com.sun.jna.platform.win32.WinNT.HRESULT getColor(VARIANT RHS);
            
    /**
     * <p>id(0x63)</p>
     */
    @ComProperty(name = "Color", dispId = 0x63)
    com.sun.jna.platform.win32.WinNT.HRESULT setColor(Object RHS);
            
    /**
     * <p>id(0x61)</p>
     */
    @ComProperty(name = "ColorIndex", dispId = 0x61)
    com.sun.jna.platform.win32.WinNT.HRESULT getColorIndex(VARIANT RHS);
            
    /**
     * <p>id(0x61)</p>
     */
    @ComProperty(name = "ColorIndex", dispId = 0x61)
    com.sun.jna.platform.win32.WinNT.HRESULT setColorIndex(Object RHS);
            
    /**
     * <p>id(0xb1)</p>
     */
    @ComProperty(name = "FontStyle", dispId = 0xb1)
    com.sun.jna.platform.win32.WinNT.HRESULT getFontStyle(VARIANT RHS);
            
    /**
     * <p>id(0xb1)</p>
     */
    @ComProperty(name = "FontStyle", dispId = 0xb1)
    com.sun.jna.platform.win32.WinNT.HRESULT setFontStyle(Object RHS);
            
    /**
     * <p>id(0x65)</p>
     */
    @ComProperty(name = "Italic", dispId = 0x65)
    com.sun.jna.platform.win32.WinNT.HRESULT getItalic(VARIANT RHS);
            
    /**
     * <p>id(0x65)</p>
     */
    @ComProperty(name = "Italic", dispId = 0x65)
    com.sun.jna.platform.win32.WinNT.HRESULT setItalic(Object RHS);
            
    /**
     * <p>id(0x6e)</p>
     */
    @ComProperty(name = "Name", dispId = 0x6e)
    com.sun.jna.platform.win32.WinNT.HRESULT getName(VARIANT RHS);
            
    /**
     * <p>id(0x6e)</p>
     */
    @ComProperty(name = "Name", dispId = 0x6e)
    com.sun.jna.platform.win32.WinNT.HRESULT setName(Object RHS);
            
    /**
     * <p>id(0xdd)</p>
     */
    @ComProperty(name = "OutlineFont", dispId = 0xdd)
    com.sun.jna.platform.win32.WinNT.HRESULT getOutlineFont(VARIANT RHS);
            
    /**
     * <p>id(0xdd)</p>
     */
    @ComProperty(name = "OutlineFont", dispId = 0xdd)
    com.sun.jna.platform.win32.WinNT.HRESULT setOutlineFont(Object RHS);
            
    /**
     * <p>id(0x67)</p>
     */
    @ComProperty(name = "Shadow", dispId = 0x67)
    com.sun.jna.platform.win32.WinNT.HRESULT getShadow(VARIANT RHS);
            
    /**
     * <p>id(0x67)</p>
     */
    @ComProperty(name = "Shadow", dispId = 0x67)
    com.sun.jna.platform.win32.WinNT.HRESULT setShadow(Object RHS);
            
    /**
     * <p>id(0x68)</p>
     */
    @ComProperty(name = "Size", dispId = 0x68)
    com.sun.jna.platform.win32.WinNT.HRESULT getSize(VARIANT RHS);
            
    /**
     * <p>id(0x68)</p>
     */
    @ComProperty(name = "Size", dispId = 0x68)
    com.sun.jna.platform.win32.WinNT.HRESULT setSize(Object RHS);
            
    /**
     * <p>id(0x69)</p>
     */
    @ComProperty(name = "Strikethrough", dispId = 0x69)
    com.sun.jna.platform.win32.WinNT.HRESULT getStrikethrough(VARIANT RHS);
            
    /**
     * <p>id(0x69)</p>
     */
    @ComProperty(name = "Strikethrough", dispId = 0x69)
    com.sun.jna.platform.win32.WinNT.HRESULT setStrikethrough(Object RHS);
            
    /**
     * <p>id(0xb3)</p>
     */
    @ComProperty(name = "Subscript", dispId = 0xb3)
    com.sun.jna.platform.win32.WinNT.HRESULT getSubscript(VARIANT RHS);
            
    /**
     * <p>id(0xb3)</p>
     */
    @ComProperty(name = "Subscript", dispId = 0xb3)
    com.sun.jna.platform.win32.WinNT.HRESULT setSubscript(Object RHS);
            
    /**
     * <p>id(0xb2)</p>
     */
    @ComProperty(name = "Superscript", dispId = 0xb2)
    com.sun.jna.platform.win32.WinNT.HRESULT getSuperscript(VARIANT RHS);
            
    /**
     * <p>id(0xb2)</p>
     */
    @ComProperty(name = "Superscript", dispId = 0xb2)
    com.sun.jna.platform.win32.WinNT.HRESULT setSuperscript(Object RHS);
            
    /**
     * <p>id(0x6a)</p>
     */
    @ComProperty(name = "Underline", dispId = 0x6a)
    com.sun.jna.platform.win32.WinNT.HRESULT getUnderline(VARIANT RHS);
            
    /**
     * <p>id(0x6a)</p>
     */
    @ComProperty(name = "Underline", dispId = 0x6a)
    com.sun.jna.platform.win32.WinNT.HRESULT setUnderline(Object RHS);
            
    /**
     * <p>id(0x93d)</p>
     */
    @ComProperty(name = "ThemeColor", dispId = 0x93d)
    com.sun.jna.platform.win32.WinNT.HRESULT getThemeColor(VARIANT RHS);
            
    /**
     * <p>id(0x93d)</p>
     */
    @ComProperty(name = "ThemeColor", dispId = 0x93d)
    com.sun.jna.platform.win32.WinNT.HRESULT setThemeColor(Object RHS);
            
    /**
     * <p>id(0x93e)</p>
     */
    @ComProperty(name = "TintAndShade", dispId = 0x93e)
    com.sun.jna.platform.win32.WinNT.HRESULT getTintAndShade(VARIANT RHS);
            
    /**
     * <p>id(0x93e)</p>
     */
    @ComProperty(name = "TintAndShade", dispId = 0x93e)
    com.sun.jna.platform.win32.WinNT.HRESULT setTintAndShade(Object RHS);
            
    /**
     * <p>id(0x93f)</p>
     */
    @ComProperty(name = "ThemeFont", dispId = 0x93f)
    com.sun.jna.platform.win32.WinNT.HRESULT getThemeFont(VARIANT RHS);
            
    /**
     * <p>id(0x93f)</p>
     */
    @ComProperty(name = "ThemeFont", dispId = 0x93f)
    com.sun.jna.platform.win32.WinNT.HRESULT setThemeFont(XlThemeFont RHS);
            
    
}