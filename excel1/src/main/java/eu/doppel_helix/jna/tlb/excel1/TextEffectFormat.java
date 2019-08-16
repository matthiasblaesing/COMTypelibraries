
package eu.doppel_helix.jna.tlb.excel1;

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
     * <p>vtableId(7)</p>
     */
    @ComProperty(name = "Application", dispId = 0x60020000)
    com.sun.jna.platform.win32.COM.util.IDispatch getApplication();
            
    /**
     * <p>id(0x60020001)</p>
     * <p>vtableId(8)</p>
     */
    @ComProperty(name = "Creator", dispId = 0x60020001)
    Integer getCreator();
            
    /**
     * <p>id(0x1)</p>
     * <p>vtableId(9)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x1)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * <p>id(0xa)</p>
     * <p>vtableId(10)</p>
     */
    @ComMethod(name = "ToggleVerticalText", dispId = 0xa)
    void ToggleVerticalText();
            
    /**
     * <p>id(0x64)</p>
     * <p>vtableId(11)</p>
     */
    @ComProperty(name = "Alignment", dispId = 0x64)
    eu.doppel_helix.jna.tlb.office2.TextEffectFormat getAlignment();
            
    /**
     * <p>id(0x64)</p>
     * <p>vtableId(12)</p>
     * @param param0 [in] {@code eu.doppel_helix.jna.tlb.office2.TextEffectFormat}
     */
    @ComProperty(name = "Alignment", dispId = 0x64)
    void setAlignment(eu.doppel_helix.jna.tlb.office2.TextEffectFormat param0);
            
    /**
     * <p>id(0x65)</p>
     * <p>vtableId(13)</p>
     */
    @ComProperty(name = "FontBold", dispId = 0x65)
    eu.doppel_helix.jna.tlb.office2.TextEffectFormat getFontBold();
            
    /**
     * <p>id(0x65)</p>
     * <p>vtableId(14)</p>
     * @param param0 [in] {@code eu.doppel_helix.jna.tlb.office2.TextEffectFormat}
     */
    @ComProperty(name = "FontBold", dispId = 0x65)
    void setFontBold(eu.doppel_helix.jna.tlb.office2.TextEffectFormat param0);
            
    /**
     * <p>id(0x66)</p>
     * <p>vtableId(15)</p>
     */
    @ComProperty(name = "FontItalic", dispId = 0x66)
    eu.doppel_helix.jna.tlb.office2.TextEffectFormat getFontItalic();
            
    /**
     * <p>id(0x66)</p>
     * <p>vtableId(16)</p>
     * @param param0 [in] {@code eu.doppel_helix.jna.tlb.office2.TextEffectFormat}
     */
    @ComProperty(name = "FontItalic", dispId = 0x66)
    void setFontItalic(eu.doppel_helix.jna.tlb.office2.TextEffectFormat param0);
            
    /**
     * <p>id(0x67)</p>
     * <p>vtableId(17)</p>
     */
    @ComProperty(name = "FontName", dispId = 0x67)
    String getFontName();
            
    /**
     * <p>id(0x67)</p>
     * <p>vtableId(18)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "FontName", dispId = 0x67)
    void setFontName(String param0);
            
    /**
     * <p>id(0x68)</p>
     * <p>vtableId(19)</p>
     */
    @ComProperty(name = "FontSize", dispId = 0x68)
    Float getFontSize();
            
    /**
     * <p>id(0x68)</p>
     * <p>vtableId(20)</p>
     * @param param0 [in] {@code Float}
     */
    @ComProperty(name = "FontSize", dispId = 0x68)
    void setFontSize(Float param0);
            
    /**
     * <p>id(0x69)</p>
     * <p>vtableId(21)</p>
     */
    @ComProperty(name = "KernedPairs", dispId = 0x69)
    eu.doppel_helix.jna.tlb.office2.TextEffectFormat getKernedPairs();
            
    /**
     * <p>id(0x69)</p>
     * <p>vtableId(22)</p>
     * @param param0 [in] {@code eu.doppel_helix.jna.tlb.office2.TextEffectFormat}
     */
    @ComProperty(name = "KernedPairs", dispId = 0x69)
    void setKernedPairs(eu.doppel_helix.jna.tlb.office2.TextEffectFormat param0);
            
    /**
     * <p>id(0x6a)</p>
     * <p>vtableId(23)</p>
     */
    @ComProperty(name = "NormalizedHeight", dispId = 0x6a)
    eu.doppel_helix.jna.tlb.office2.TextEffectFormat getNormalizedHeight();
            
    /**
     * <p>id(0x6a)</p>
     * <p>vtableId(24)</p>
     * @param param0 [in] {@code eu.doppel_helix.jna.tlb.office2.TextEffectFormat}
     */
    @ComProperty(name = "NormalizedHeight", dispId = 0x6a)
    void setNormalizedHeight(eu.doppel_helix.jna.tlb.office2.TextEffectFormat param0);
            
    /**
     * <p>id(0x6b)</p>
     * <p>vtableId(25)</p>
     */
    @ComProperty(name = "PresetShape", dispId = 0x6b)
    eu.doppel_helix.jna.tlb.office2.TextEffectFormat getPresetShape();
            
    /**
     * <p>id(0x6b)</p>
     * <p>vtableId(26)</p>
     * @param param0 [in] {@code eu.doppel_helix.jna.tlb.office2.TextEffectFormat}
     */
    @ComProperty(name = "PresetShape", dispId = 0x6b)
    void setPresetShape(eu.doppel_helix.jna.tlb.office2.TextEffectFormat param0);
            
    /**
     * <p>id(0x6c)</p>
     * <p>vtableId(27)</p>
     */
    @ComProperty(name = "PresetTextEffect", dispId = 0x6c)
    eu.doppel_helix.jna.tlb.office2.TextEffectFormat getPresetTextEffect();
            
    /**
     * <p>id(0x6c)</p>
     * <p>vtableId(28)</p>
     * @param param0 [in] {@code eu.doppel_helix.jna.tlb.office2.TextEffectFormat}
     */
    @ComProperty(name = "PresetTextEffect", dispId = 0x6c)
    void setPresetTextEffect(eu.doppel_helix.jna.tlb.office2.TextEffectFormat param0);
            
    /**
     * <p>id(0x6d)</p>
     * <p>vtableId(29)</p>
     */
    @ComProperty(name = "RotatedChars", dispId = 0x6d)
    eu.doppel_helix.jna.tlb.office2.TextEffectFormat getRotatedChars();
            
    /**
     * <p>id(0x6d)</p>
     * <p>vtableId(30)</p>
     * @param param0 [in] {@code eu.doppel_helix.jna.tlb.office2.TextEffectFormat}
     */
    @ComProperty(name = "RotatedChars", dispId = 0x6d)
    void setRotatedChars(eu.doppel_helix.jna.tlb.office2.TextEffectFormat param0);
            
    /**
     * <p>id(0x6e)</p>
     * <p>vtableId(31)</p>
     */
    @ComProperty(name = "Text", dispId = 0x6e)
    String getText();
            
    /**
     * <p>id(0x6e)</p>
     * <p>vtableId(32)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "Text", dispId = 0x6e)
    void setText(String param0);
            
    /**
     * <p>id(0x6f)</p>
     * <p>vtableId(33)</p>
     */
    @ComProperty(name = "Tracking", dispId = 0x6f)
    Float getTracking();
            
    /**
     * <p>id(0x6f)</p>
     * <p>vtableId(34)</p>
     * @param param0 [in] {@code Float}
     */
    @ComProperty(name = "Tracking", dispId = 0x6f)
    void setTracking(Float param0);
            
    
}