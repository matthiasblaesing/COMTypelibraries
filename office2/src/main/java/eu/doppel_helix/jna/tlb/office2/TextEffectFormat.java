
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000C031F-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000C031F-0000-0000-C000-000000000046}")
public interface TextEffectFormat extends IUnknown, IRawDispatchHandle, IDispatch {
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
     * <p>id(0xa)</p>
     */
    @ComMethod(name = "ToggleVerticalText", dispId = 0xa)
    void ToggleVerticalText();
            
    /**
     * <p>id(0x64)</p>
     */
    @ComProperty(name = "Alignment", dispId = 0x64)
    MsoTextEffectAlignment getAlignment();
            
    /**
     * <p>id(0x64)</p>
     */
    @ComProperty(name = "Alignment", dispId = 0x64)
    void setAlignment(MsoTextEffectAlignment param0);
            
    /**
     * <p>id(0x65)</p>
     */
    @ComProperty(name = "FontBold", dispId = 0x65)
    MsoTriState getFontBold();
            
    /**
     * <p>id(0x65)</p>
     */
    @ComProperty(name = "FontBold", dispId = 0x65)
    void setFontBold(MsoTriState param0);
            
    /**
     * <p>id(0x66)</p>
     */
    @ComProperty(name = "FontItalic", dispId = 0x66)
    MsoTriState getFontItalic();
            
    /**
     * <p>id(0x66)</p>
     */
    @ComProperty(name = "FontItalic", dispId = 0x66)
    void setFontItalic(MsoTriState param0);
            
    /**
     * <p>id(0x67)</p>
     */
    @ComProperty(name = "FontName", dispId = 0x67)
    String getFontName();
            
    /**
     * <p>id(0x67)</p>
     */
    @ComProperty(name = "FontName", dispId = 0x67)
    void setFontName(String param0);
            
    /**
     * <p>id(0x68)</p>
     */
    @ComProperty(name = "FontSize", dispId = 0x68)
    Float getFontSize();
            
    /**
     * <p>id(0x68)</p>
     */
    @ComProperty(name = "FontSize", dispId = 0x68)
    void setFontSize(Float param0);
            
    /**
     * <p>id(0x69)</p>
     */
    @ComProperty(name = "KernedPairs", dispId = 0x69)
    MsoTriState getKernedPairs();
            
    /**
     * <p>id(0x69)</p>
     */
    @ComProperty(name = "KernedPairs", dispId = 0x69)
    void setKernedPairs(MsoTriState param0);
            
    /**
     * <p>id(0x6a)</p>
     */
    @ComProperty(name = "NormalizedHeight", dispId = 0x6a)
    MsoTriState getNormalizedHeight();
            
    /**
     * <p>id(0x6a)</p>
     */
    @ComProperty(name = "NormalizedHeight", dispId = 0x6a)
    void setNormalizedHeight(MsoTriState param0);
            
    /**
     * <p>id(0x6b)</p>
     */
    @ComProperty(name = "PresetShape", dispId = 0x6b)
    MsoPresetTextEffectShape getPresetShape();
            
    /**
     * <p>id(0x6b)</p>
     */
    @ComProperty(name = "PresetShape", dispId = 0x6b)
    void setPresetShape(MsoPresetTextEffectShape param0);
            
    /**
     * <p>id(0x6c)</p>
     */
    @ComProperty(name = "PresetTextEffect", dispId = 0x6c)
    MsoPresetTextEffect getPresetTextEffect();
            
    /**
     * <p>id(0x6c)</p>
     */
    @ComProperty(name = "PresetTextEffect", dispId = 0x6c)
    void setPresetTextEffect(MsoPresetTextEffect param0);
            
    /**
     * <p>id(0x6d)</p>
     */
    @ComProperty(name = "RotatedChars", dispId = 0x6d)
    MsoTriState getRotatedChars();
            
    /**
     * <p>id(0x6d)</p>
     */
    @ComProperty(name = "RotatedChars", dispId = 0x6d)
    void setRotatedChars(MsoTriState param0);
            
    /**
     * <p>id(0x6e)</p>
     */
    @ComProperty(name = "Text", dispId = 0x6e)
    String getText();
            
    /**
     * <p>id(0x6e)</p>
     */
    @ComProperty(name = "Text", dispId = 0x6e)
    void setText(String param0);
            
    /**
     * <p>id(0x6f)</p>
     */
    @ComProperty(name = "Tracking", dispId = 0x6f)
    Float getTracking();
            
    /**
     * <p>id(0x6f)</p>
     */
    @ComProperty(name = "Tracking", dispId = 0x6f)
    void setTracking(Float param0);
            
    
}