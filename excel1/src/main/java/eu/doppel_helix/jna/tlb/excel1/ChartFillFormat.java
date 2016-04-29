
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00024435-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{00024435-0000-0000-C000-000000000046}")
public interface ChartFillFormat {
    /**
     * <p>id(0x94)</p>
     */
    @ComProperty(name = "Application", dispId = 0x94)
    Application getApplication();
            
    /**
     * <p>id(0x95)</p>
     */
    @ComProperty(name = "Creator", dispId = 0x95)
    XlCreator getCreator();
            
    /**
     * <p>id(0x96)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x96)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * <p>id(0x655)</p>
     */
    @ComMethod(name = "OneColorGradient", dispId = 0x655)
    void OneColorGradient(eu.doppel_helix.jna.tlb.office2.MsoGradientStyle Style,
            Integer Variant,
            Float Degree);
            
    /**
     * <p>id(0x658)</p>
     */
    @ComMethod(name = "TwoColorGradient", dispId = 0x658)
    void TwoColorGradient(eu.doppel_helix.jna.tlb.office2.MsoGradientStyle Style,
            Integer Variant);
            
    /**
     * <p>id(0x659)</p>
     */
    @ComMethod(name = "PresetTextured", dispId = 0x659)
    void PresetTextured(eu.doppel_helix.jna.tlb.office2.MsoPresetTexture PresetTexture);
            
    /**
     * <p>id(0x65b)</p>
     */
    @ComMethod(name = "Solid", dispId = 0x65b)
    void Solid();
            
    /**
     * <p>id(0x65c)</p>
     */
    @ComMethod(name = "Patterned", dispId = 0x65c)
    void Patterned(eu.doppel_helix.jna.tlb.office2.MsoPatternType Pattern);
            
    /**
     * <p>id(0x65d)</p>
     */
    @ComMethod(name = "UserPicture", dispId = 0x65d)
    void UserPicture(Object PictureFile,
            Object PictureFormat,
            Object PictureStackUnit,
            Object PicturePlacement);
            
    /**
     * <p>id(0x662)</p>
     */
    @ComMethod(name = "UserTextured", dispId = 0x662)
    void UserTextured(String TextureFile);
            
    /**
     * <p>id(0x664)</p>
     */
    @ComMethod(name = "PresetGradient", dispId = 0x664)
    void PresetGradient(eu.doppel_helix.jna.tlb.office2.MsoGradientStyle Style,
            Integer Variant,
            eu.doppel_helix.jna.tlb.office2.MsoPresetGradientType PresetGradientType);
            
    /**
     * <p>id(0x666)</p>
     */
    @ComProperty(name = "BackColor", dispId = 0x666)
    ChartColorFormat getBackColor();
            
    /**
     * <p>id(0x667)</p>
     */
    @ComProperty(name = "ForeColor", dispId = 0x667)
    ChartColorFormat getForeColor();
            
    /**
     * <p>id(0x668)</p>
     */
    @ComProperty(name = "GradientColorType", dispId = 0x668)
    eu.doppel_helix.jna.tlb.office2.MsoGradientColorType getGradientColorType();
            
    /**
     * <p>id(0x669)</p>
     */
    @ComProperty(name = "GradientDegree", dispId = 0x669)
    Float getGradientDegree();
            
    /**
     * <p>id(0x66a)</p>
     */
    @ComProperty(name = "GradientStyle", dispId = 0x66a)
    eu.doppel_helix.jna.tlb.office2.MsoGradientStyle getGradientStyle();
            
    /**
     * <p>id(0x66b)</p>
     */
    @ComProperty(name = "GradientVariant", dispId = 0x66b)
    Integer getGradientVariant();
            
    /**
     * <p>id(0x5f)</p>
     */
    @ComProperty(name = "Pattern", dispId = 0x5f)
    eu.doppel_helix.jna.tlb.office2.MsoPatternType getPattern();
            
    /**
     * <p>id(0x665)</p>
     */
    @ComProperty(name = "PresetGradientType", dispId = 0x665)
    eu.doppel_helix.jna.tlb.office2.MsoPresetGradientType getPresetGradientType();
            
    /**
     * <p>id(0x65a)</p>
     */
    @ComProperty(name = "PresetTexture", dispId = 0x65a)
    eu.doppel_helix.jna.tlb.office2.MsoPresetTexture getPresetTexture();
            
    /**
     * <p>id(0x66c)</p>
     */
    @ComProperty(name = "TextureName", dispId = 0x66c)
    String getTextureName();
            
    /**
     * <p>id(0x66d)</p>
     */
    @ComProperty(name = "TextureType", dispId = 0x66d)
    eu.doppel_helix.jna.tlb.office2.MsoTextureType getTextureType();
            
    /**
     * <p>id(0x6c)</p>
     */
    @ComProperty(name = "Type", dispId = 0x6c)
    eu.doppel_helix.jna.tlb.office2.MsoFillType getType();
            
    /**
     * <p>id(0x22e)</p>
     */
    @ComProperty(name = "Visible", dispId = 0x22e)
    eu.doppel_helix.jna.tlb.office2.MsoTriState getVisible();
            
    /**
     * <p>id(0x22e)</p>
     */
    @ComProperty(name = "Visible", dispId = 0x22e)
    void setVisible(eu.doppel_helix.jna.tlb.office2.MsoTriState param0);
            
    
}