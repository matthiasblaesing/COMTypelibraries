
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000C0314-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000C0314-0000-0000-C000-000000000046}")
public interface FillFormat {
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
    @ComMethod(name = "Background", dispId = 0xa)
    void Background();
            
    /**
     * <p>id(0xb)</p>
     */
    @ComMethod(name = "OneColorGradient", dispId = 0xb)
    void OneColorGradient(eu.doppel_helix.jna.tlb.office2.FillFormat Style,
            Integer Variant,
            Float Degree);
            
    /**
     * <p>id(0xc)</p>
     */
    @ComMethod(name = "Patterned", dispId = 0xc)
    void Patterned(eu.doppel_helix.jna.tlb.office2.FillFormat Pattern);
            
    /**
     * <p>id(0xd)</p>
     */
    @ComMethod(name = "PresetGradient", dispId = 0xd)
    void PresetGradient(eu.doppel_helix.jna.tlb.office2.FillFormat Style,
            Integer Variant,
            eu.doppel_helix.jna.tlb.office2.FillFormat PresetGradientType);
            
    /**
     * <p>id(0xe)</p>
     */
    @ComMethod(name = "PresetTextured", dispId = 0xe)
    void PresetTextured(eu.doppel_helix.jna.tlb.office2.FillFormat PresetTexture);
            
    /**
     * <p>id(0xf)</p>
     */
    @ComMethod(name = "Solid", dispId = 0xf)
    void Solid();
            
    /**
     * <p>id(0x10)</p>
     */
    @ComMethod(name = "TwoColorGradient", dispId = 0x10)
    void TwoColorGradient(eu.doppel_helix.jna.tlb.office2.FillFormat Style,
            Integer Variant);
            
    /**
     * <p>id(0x11)</p>
     */
    @ComMethod(name = "UserPicture", dispId = 0x11)
    void UserPicture(String PictureFile);
            
    /**
     * <p>id(0x12)</p>
     */
    @ComMethod(name = "UserTextured", dispId = 0x12)
    void UserTextured(String TextureFile);
            
    /**
     * <p>id(0x64)</p>
     */
    @ComProperty(name = "BackColor", dispId = 0x64)
    eu.doppel_helix.jna.tlb.office2.FillFormat getBackColor();
            
    /**
     * <p>id(0x64)</p>
     */
    @ComProperty(name = "BackColor", dispId = 0x64)
    void setBackColor(eu.doppel_helix.jna.tlb.office2.FillFormat param0);
            
    /**
     * <p>id(0x65)</p>
     */
    @ComProperty(name = "ForeColor", dispId = 0x65)
    eu.doppel_helix.jna.tlb.office2.FillFormat getForeColor();
            
    /**
     * <p>id(0x65)</p>
     */
    @ComProperty(name = "ForeColor", dispId = 0x65)
    void setForeColor(eu.doppel_helix.jna.tlb.office2.FillFormat param0);
            
    /**
     * <p>id(0x66)</p>
     */
    @ComProperty(name = "GradientColorType", dispId = 0x66)
    eu.doppel_helix.jna.tlb.office2.FillFormat getGradientColorType();
            
    /**
     * <p>id(0x67)</p>
     */
    @ComProperty(name = "GradientDegree", dispId = 0x67)
    Float getGradientDegree();
            
    /**
     * <p>id(0x68)</p>
     */
    @ComProperty(name = "GradientStyle", dispId = 0x68)
    eu.doppel_helix.jna.tlb.office2.FillFormat getGradientStyle();
            
    /**
     * <p>id(0x69)</p>
     */
    @ComProperty(name = "GradientVariant", dispId = 0x69)
    Integer getGradientVariant();
            
    /**
     * <p>id(0x6a)</p>
     */
    @ComProperty(name = "Pattern", dispId = 0x6a)
    eu.doppel_helix.jna.tlb.office2.FillFormat getPattern();
            
    /**
     * <p>id(0x6b)</p>
     */
    @ComProperty(name = "PresetGradientType", dispId = 0x6b)
    eu.doppel_helix.jna.tlb.office2.FillFormat getPresetGradientType();
            
    /**
     * <p>id(0x6c)</p>
     */
    @ComProperty(name = "PresetTexture", dispId = 0x6c)
    eu.doppel_helix.jna.tlb.office2.FillFormat getPresetTexture();
            
    /**
     * <p>id(0x6d)</p>
     */
    @ComProperty(name = "TextureName", dispId = 0x6d)
    String getTextureName();
            
    /**
     * <p>id(0x6e)</p>
     */
    @ComProperty(name = "TextureType", dispId = 0x6e)
    eu.doppel_helix.jna.tlb.office2.FillFormat getTextureType();
            
    /**
     * <p>id(0x6f)</p>
     */
    @ComProperty(name = "Transparency", dispId = 0x6f)
    Float getTransparency();
            
    /**
     * <p>id(0x6f)</p>
     */
    @ComProperty(name = "Transparency", dispId = 0x6f)
    void setTransparency(Float param0);
            
    /**
     * <p>id(0x70)</p>
     */
    @ComProperty(name = "Type", dispId = 0x70)
    eu.doppel_helix.jna.tlb.office2.FillFormat getType();
            
    /**
     * <p>id(0x71)</p>
     */
    @ComProperty(name = "Visible", dispId = 0x71)
    eu.doppel_helix.jna.tlb.office2.FillFormat getVisible();
            
    /**
     * <p>id(0x71)</p>
     */
    @ComProperty(name = "Visible", dispId = 0x71)
    void setVisible(eu.doppel_helix.jna.tlb.office2.FillFormat param0);
            
    /**
     * <p>id(0x72)</p>
     */
    @ComProperty(name = "GradientStops", dispId = 0x72)
    eu.doppel_helix.jna.tlb.office2.FillFormat getGradientStops();
            
    /**
     * <p>id(0x73)</p>
     */
    @ComProperty(name = "TextureOffsetX", dispId = 0x73)
    Float getTextureOffsetX();
            
    /**
     * <p>id(0x73)</p>
     */
    @ComProperty(name = "TextureOffsetX", dispId = 0x73)
    void setTextureOffsetX(Float param0);
            
    /**
     * <p>id(0x74)</p>
     */
    @ComProperty(name = "TextureOffsetY", dispId = 0x74)
    Float getTextureOffsetY();
            
    /**
     * <p>id(0x74)</p>
     */
    @ComProperty(name = "TextureOffsetY", dispId = 0x74)
    void setTextureOffsetY(Float param0);
            
    /**
     * <p>id(0x75)</p>
     */
    @ComProperty(name = "TextureAlignment", dispId = 0x75)
    eu.doppel_helix.jna.tlb.office2.FillFormat getTextureAlignment();
            
    /**
     * <p>id(0x75)</p>
     */
    @ComProperty(name = "TextureAlignment", dispId = 0x75)
    void setTextureAlignment(eu.doppel_helix.jna.tlb.office2.FillFormat param0);
            
    /**
     * <p>id(0x76)</p>
     */
    @ComProperty(name = "TextureHorizontalScale", dispId = 0x76)
    Float getTextureHorizontalScale();
            
    /**
     * <p>id(0x76)</p>
     */
    @ComProperty(name = "TextureHorizontalScale", dispId = 0x76)
    void setTextureHorizontalScale(Float param0);
            
    /**
     * <p>id(0x77)</p>
     */
    @ComProperty(name = "TextureVerticalScale", dispId = 0x77)
    Float getTextureVerticalScale();
            
    /**
     * <p>id(0x77)</p>
     */
    @ComProperty(name = "TextureVerticalScale", dispId = 0x77)
    void setTextureVerticalScale(Float param0);
            
    /**
     * <p>id(0x78)</p>
     */
    @ComProperty(name = "TextureTile", dispId = 0x78)
    eu.doppel_helix.jna.tlb.office2.FillFormat getTextureTile();
            
    /**
     * <p>id(0x78)</p>
     */
    @ComProperty(name = "TextureTile", dispId = 0x78)
    void setTextureTile(eu.doppel_helix.jna.tlb.office2.FillFormat param0);
            
    /**
     * <p>id(0x79)</p>
     */
    @ComProperty(name = "RotateWithObject", dispId = 0x79)
    eu.doppel_helix.jna.tlb.office2.FillFormat getRotateWithObject();
            
    /**
     * <p>id(0x79)</p>
     */
    @ComProperty(name = "RotateWithObject", dispId = 0x79)
    void setRotateWithObject(eu.doppel_helix.jna.tlb.office2.FillFormat param0);
            
    /**
     * <p>id(0x7a)</p>
     */
    @ComProperty(name = "PictureEffects", dispId = 0x7a)
    eu.doppel_helix.jna.tlb.office2.FillFormat getPictureEffects();
            
    /**
     * <p>id(0x7b)</p>
     */
    @ComProperty(name = "GradientAngle", dispId = 0x7b)
    Float getGradientAngle();
            
    /**
     * <p>id(0x7b)</p>
     */
    @ComProperty(name = "GradientAngle", dispId = 0x7b)
    void setGradientAngle(Float param0);
            
    
}