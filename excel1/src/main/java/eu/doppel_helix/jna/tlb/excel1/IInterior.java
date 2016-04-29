
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00020870-0001-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{00020870-0001-0000-C000-000000000046}")
public interface IInterior {
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
     * <p>id(0x84)</p>
     */
    @ComProperty(name = "InvertIfNegative", dispId = 0x84)
    com.sun.jna.platform.win32.WinNT.HRESULT getInvertIfNegative(VARIANT RHS);
            
    /**
     * <p>id(0x84)</p>
     */
    @ComProperty(name = "InvertIfNegative", dispId = 0x84)
    com.sun.jna.platform.win32.WinNT.HRESULT setInvertIfNegative(Object RHS);
            
    /**
     * <p>id(0x5f)</p>
     */
    @ComProperty(name = "Pattern", dispId = 0x5f)
    com.sun.jna.platform.win32.WinNT.HRESULT getPattern(VARIANT RHS);
            
    /**
     * <p>id(0x5f)</p>
     */
    @ComProperty(name = "Pattern", dispId = 0x5f)
    com.sun.jna.platform.win32.WinNT.HRESULT setPattern(Object RHS);
            
    /**
     * <p>id(0x64)</p>
     */
    @ComProperty(name = "PatternColor", dispId = 0x64)
    com.sun.jna.platform.win32.WinNT.HRESULT getPatternColor(VARIANT RHS);
            
    /**
     * <p>id(0x64)</p>
     */
    @ComProperty(name = "PatternColor", dispId = 0x64)
    com.sun.jna.platform.win32.WinNT.HRESULT setPatternColor(Object RHS);
            
    /**
     * <p>id(0x62)</p>
     */
    @ComProperty(name = "PatternColorIndex", dispId = 0x62)
    com.sun.jna.platform.win32.WinNT.HRESULT getPatternColorIndex(VARIANT RHS);
            
    /**
     * <p>id(0x62)</p>
     */
    @ComProperty(name = "PatternColorIndex", dispId = 0x62)
    com.sun.jna.platform.win32.WinNT.HRESULT setPatternColorIndex(Object RHS);
            
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
     * <p>id(0xa53)</p>
     */
    @ComProperty(name = "PatternThemeColor", dispId = 0xa53)
    com.sun.jna.platform.win32.WinNT.HRESULT getPatternThemeColor(VARIANT RHS);
            
    /**
     * <p>id(0xa53)</p>
     */
    @ComProperty(name = "PatternThemeColor", dispId = 0xa53)
    com.sun.jna.platform.win32.WinNT.HRESULT setPatternThemeColor(Object RHS);
            
    /**
     * <p>id(0xa54)</p>
     */
    @ComProperty(name = "PatternTintAndShade", dispId = 0xa54)
    com.sun.jna.platform.win32.WinNT.HRESULT getPatternTintAndShade(VARIANT RHS);
            
    /**
     * <p>id(0xa54)</p>
     */
    @ComProperty(name = "PatternTintAndShade", dispId = 0xa54)
    com.sun.jna.platform.win32.WinNT.HRESULT setPatternTintAndShade(Object RHS);
            
    /**
     * <p>id(0xa55)</p>
     */
    @ComProperty(name = "Gradient", dispId = 0xa55)
    com.sun.jna.platform.win32.WinNT.HRESULT getGradient(VARIANT RHS);
            
    
}