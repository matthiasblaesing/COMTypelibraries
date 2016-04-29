
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00024435-0001-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{00024435-0001-0000-C000-000000000046}")
public interface IChartFillFormat {
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
     * <p>id(0x655)</p>
     */
    @ComMethod(name = "OneColorGradient", dispId = 0x655)
    com.sun.jna.platform.win32.WinNT.HRESULT OneColorGradient(eu.doppel_helix.jna.tlb.office2.MsoGradientStyle Style,
            Integer Variant,
            Float Degree);
            
    /**
     * <p>id(0x658)</p>
     */
    @ComMethod(name = "TwoColorGradient", dispId = 0x658)
    com.sun.jna.platform.win32.WinNT.HRESULT TwoColorGradient(eu.doppel_helix.jna.tlb.office2.MsoGradientStyle Style,
            Integer Variant);
            
    /**
     * <p>id(0x659)</p>
     */
    @ComMethod(name = "PresetTextured", dispId = 0x659)
    com.sun.jna.platform.win32.WinNT.HRESULT PresetTextured(eu.doppel_helix.jna.tlb.office2.MsoPresetTexture PresetTexture);
            
    /**
     * <p>id(0x65b)</p>
     */
    @ComMethod(name = "Solid", dispId = 0x65b)
    com.sun.jna.platform.win32.WinNT.HRESULT Solid();
            
    /**
     * <p>id(0x65c)</p>
     */
    @ComMethod(name = "Patterned", dispId = 0x65c)
    com.sun.jna.platform.win32.WinNT.HRESULT Patterned(eu.doppel_helix.jna.tlb.office2.MsoPatternType Pattern);
            
    /**
     * <p>id(0x65d)</p>
     */
    @ComMethod(name = "UserPicture", dispId = 0x65d)
    com.sun.jna.platform.win32.WinNT.HRESULT UserPicture(Object PictureFile,
            Object PictureFormat,
            Object PictureStackUnit,
            Object PicturePlacement);
            
    /**
     * <p>id(0x662)</p>
     */
    @ComMethod(name = "UserTextured", dispId = 0x662)
    com.sun.jna.platform.win32.WinNT.HRESULT UserTextured(String TextureFile);
            
    /**
     * <p>id(0x664)</p>
     */
    @ComMethod(name = "PresetGradient", dispId = 0x664)
    com.sun.jna.platform.win32.WinNT.HRESULT PresetGradient(eu.doppel_helix.jna.tlb.office2.MsoGradientStyle Style,
            Integer Variant,
            eu.doppel_helix.jna.tlb.office2.MsoPresetGradientType PresetGradientType);
            
    /**
     * <p>id(0x666)</p>
     */
    @ComProperty(name = "BackColor", dispId = 0x666)
    com.sun.jna.platform.win32.WinNT.HRESULT getBackColor(VARIANT RHS);
            
    /**
     * <p>id(0x667)</p>
     */
    @ComProperty(name = "ForeColor", dispId = 0x667)
    com.sun.jna.platform.win32.WinNT.HRESULT getForeColor(VARIANT RHS);
            
    /**
     * <p>id(0x668)</p>
     */
    @ComProperty(name = "GradientColorType", dispId = 0x668)
    com.sun.jna.platform.win32.WinNT.HRESULT getGradientColorType(VARIANT RHS);
            
    /**
     * <p>id(0x669)</p>
     */
    @ComProperty(name = "GradientDegree", dispId = 0x669)
    com.sun.jna.platform.win32.WinNT.HRESULT getGradientDegree(VARIANT RHS);
            
    /**
     * <p>id(0x66a)</p>
     */
    @ComProperty(name = "GradientStyle", dispId = 0x66a)
    com.sun.jna.platform.win32.WinNT.HRESULT getGradientStyle(VARIANT RHS);
            
    /**
     * <p>id(0x66b)</p>
     */
    @ComProperty(name = "GradientVariant", dispId = 0x66b)
    com.sun.jna.platform.win32.WinNT.HRESULT getGradientVariant(VARIANT RHS);
            
    /**
     * <p>id(0x5f)</p>
     */
    @ComProperty(name = "Pattern", dispId = 0x5f)
    com.sun.jna.platform.win32.WinNT.HRESULT getPattern(VARIANT RHS);
            
    /**
     * <p>id(0x665)</p>
     */
    @ComProperty(name = "PresetGradientType", dispId = 0x665)
    com.sun.jna.platform.win32.WinNT.HRESULT getPresetGradientType(VARIANT RHS);
            
    /**
     * <p>id(0x65a)</p>
     */
    @ComProperty(name = "PresetTexture", dispId = 0x65a)
    com.sun.jna.platform.win32.WinNT.HRESULT getPresetTexture(VARIANT RHS);
            
    /**
     * <p>id(0x66c)</p>
     */
    @ComProperty(name = "TextureName", dispId = 0x66c)
    com.sun.jna.platform.win32.WinNT.HRESULT getTextureName(VARIANT RHS);
            
    /**
     * <p>id(0x66d)</p>
     */
    @ComProperty(name = "TextureType", dispId = 0x66d)
    com.sun.jna.platform.win32.WinNT.HRESULT getTextureType(VARIANT RHS);
            
    /**
     * <p>id(0x6c)</p>
     */
    @ComProperty(name = "Type", dispId = 0x6c)
    com.sun.jna.platform.win32.WinNT.HRESULT getType(VARIANT RHS);
            
    /**
     * <p>id(0x22e)</p>
     */
    @ComProperty(name = "Visible", dispId = 0x22e)
    com.sun.jna.platform.win32.WinNT.HRESULT getVisible(VARIANT RHS);
            
    /**
     * <p>id(0x22e)</p>
     */
    @ComProperty(name = "Visible", dispId = 0x22e)
    com.sun.jna.platform.win32.WinNT.HRESULT setVisible(eu.doppel_helix.jna.tlb.office2.MsoTriState RHS);
            
    
}