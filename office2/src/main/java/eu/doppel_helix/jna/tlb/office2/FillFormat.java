
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000C0314-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000C0314-0000-0000-C000-000000000046}")
public interface FillFormat extends IUnknown, IRawDispatchHandle, IDispatch {
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
    @ComMethod(name = "Background", dispId = 0xa)
    void Background();
            
    /**
     * <p>id(0xb)</p>
     * <p>vtableId(11)</p>
     * @param Style [in] {@code MsoGradientStyle}
     * @param Variant [in] {@code Integer}
     * @param Degree [in] {@code Float}
     */
    @ComMethod(name = "OneColorGradient", dispId = 0xb)
    void OneColorGradient(MsoGradientStyle Style,
            Integer Variant,
            Float Degree);
            
    /**
     * <p>id(0xc)</p>
     * <p>vtableId(12)</p>
     * @param Pattern [in] {@code MsoPatternType}
     */
    @ComMethod(name = "Patterned", dispId = 0xc)
    void Patterned(MsoPatternType Pattern);
            
    /**
     * <p>id(0xd)</p>
     * <p>vtableId(13)</p>
     * @param Style [in] {@code MsoGradientStyle}
     * @param Variant [in] {@code Integer}
     * @param PresetGradientType [in] {@code MsoPresetGradientType}
     */
    @ComMethod(name = "PresetGradient", dispId = 0xd)
    void PresetGradient(MsoGradientStyle Style,
            Integer Variant,
            MsoPresetGradientType PresetGradientType);
            
    /**
     * <p>id(0xe)</p>
     * <p>vtableId(14)</p>
     * @param PresetTexture [in] {@code MsoPresetTexture}
     */
    @ComMethod(name = "PresetTextured", dispId = 0xe)
    void PresetTextured(MsoPresetTexture PresetTexture);
            
    /**
     * <p>id(0xf)</p>
     * <p>vtableId(15)</p>
     */
    @ComMethod(name = "Solid", dispId = 0xf)
    void Solid();
            
    /**
     * <p>id(0x10)</p>
     * <p>vtableId(16)</p>
     * @param Style [in] {@code MsoGradientStyle}
     * @param Variant [in] {@code Integer}
     */
    @ComMethod(name = "TwoColorGradient", dispId = 0x10)
    void TwoColorGradient(MsoGradientStyle Style,
            Integer Variant);
            
    /**
     * <p>id(0x11)</p>
     * <p>vtableId(17)</p>
     * @param PictureFile [in] {@code String}
     */
    @ComMethod(name = "UserPicture", dispId = 0x11)
    void UserPicture(String PictureFile);
            
    /**
     * <p>id(0x12)</p>
     * <p>vtableId(18)</p>
     * @param TextureFile [in] {@code String}
     */
    @ComMethod(name = "UserTextured", dispId = 0x12)
    void UserTextured(String TextureFile);
            
    /**
     * <p>id(0x64)</p>
     * <p>vtableId(19)</p>
     */
    @ComProperty(name = "BackColor", dispId = 0x64)
    ColorFormat getBackColor();
            
    /**
     * <p>id(0x64)</p>
     * <p>vtableId(20)</p>
     * @param param0 [in] {@code ColorFormat}
     */
    @ComProperty(name = "BackColor", dispId = 0x64)
    void setBackColor(ColorFormat param0);
            
    /**
     * <p>id(0x65)</p>
     * <p>vtableId(21)</p>
     */
    @ComProperty(name = "ForeColor", dispId = 0x65)
    ColorFormat getForeColor();
            
    /**
     * <p>id(0x65)</p>
     * <p>vtableId(22)</p>
     * @param param0 [in] {@code ColorFormat}
     */
    @ComProperty(name = "ForeColor", dispId = 0x65)
    void setForeColor(ColorFormat param0);
            
    /**
     * <p>id(0x66)</p>
     * <p>vtableId(23)</p>
     */
    @ComProperty(name = "GradientColorType", dispId = 0x66)
    MsoGradientColorType getGradientColorType();
            
    /**
     * <p>id(0x67)</p>
     * <p>vtableId(24)</p>
     */
    @ComProperty(name = "GradientDegree", dispId = 0x67)
    Float getGradientDegree();
            
    /**
     * <p>id(0x68)</p>
     * <p>vtableId(25)</p>
     */
    @ComProperty(name = "GradientStyle", dispId = 0x68)
    MsoGradientStyle getGradientStyle();
            
    /**
     * <p>id(0x69)</p>
     * <p>vtableId(26)</p>
     */
    @ComProperty(name = "GradientVariant", dispId = 0x69)
    Integer getGradientVariant();
            
    /**
     * <p>id(0x6a)</p>
     * <p>vtableId(27)</p>
     */
    @ComProperty(name = "Pattern", dispId = 0x6a)
    MsoPatternType getPattern();
            
    /**
     * <p>id(0x6b)</p>
     * <p>vtableId(28)</p>
     */
    @ComProperty(name = "PresetGradientType", dispId = 0x6b)
    MsoPresetGradientType getPresetGradientType();
            
    /**
     * <p>id(0x6c)</p>
     * <p>vtableId(29)</p>
     */
    @ComProperty(name = "PresetTexture", dispId = 0x6c)
    MsoPresetTexture getPresetTexture();
            
    /**
     * <p>id(0x6d)</p>
     * <p>vtableId(30)</p>
     */
    @ComProperty(name = "TextureName", dispId = 0x6d)
    String getTextureName();
            
    /**
     * <p>id(0x6e)</p>
     * <p>vtableId(31)</p>
     */
    @ComProperty(name = "TextureType", dispId = 0x6e)
    MsoTextureType getTextureType();
            
    /**
     * <p>id(0x6f)</p>
     * <p>vtableId(32)</p>
     */
    @ComProperty(name = "Transparency", dispId = 0x6f)
    Float getTransparency();
            
    /**
     * <p>id(0x6f)</p>
     * <p>vtableId(33)</p>
     * @param param0 [in] {@code Float}
     */
    @ComProperty(name = "Transparency", dispId = 0x6f)
    void setTransparency(Float param0);
            
    /**
     * <p>id(0x70)</p>
     * <p>vtableId(34)</p>
     */
    @ComProperty(name = "Type", dispId = 0x70)
    MsoFillType getType();
            
    /**
     * <p>id(0x71)</p>
     * <p>vtableId(35)</p>
     */
    @ComProperty(name = "Visible", dispId = 0x71)
    MsoTriState getVisible();
            
    /**
     * <p>id(0x71)</p>
     * <p>vtableId(36)</p>
     * @param param0 [in] {@code MsoTriState}
     */
    @ComProperty(name = "Visible", dispId = 0x71)
    void setVisible(MsoTriState param0);
            
    /**
     * <p>id(0x72)</p>
     * <p>vtableId(37)</p>
     */
    @ComProperty(name = "GradientStops", dispId = 0x72)
    GradientStops getGradientStops();
            
    /**
     * <p>id(0x73)</p>
     * <p>vtableId(38)</p>
     */
    @ComProperty(name = "TextureOffsetX", dispId = 0x73)
    Float getTextureOffsetX();
            
    /**
     * <p>id(0x73)</p>
     * <p>vtableId(39)</p>
     * @param param0 [in] {@code Float}
     */
    @ComProperty(name = "TextureOffsetX", dispId = 0x73)
    void setTextureOffsetX(Float param0);
            
    /**
     * <p>id(0x74)</p>
     * <p>vtableId(40)</p>
     */
    @ComProperty(name = "TextureOffsetY", dispId = 0x74)
    Float getTextureOffsetY();
            
    /**
     * <p>id(0x74)</p>
     * <p>vtableId(41)</p>
     * @param param0 [in] {@code Float}
     */
    @ComProperty(name = "TextureOffsetY", dispId = 0x74)
    void setTextureOffsetY(Float param0);
            
    /**
     * <p>id(0x75)</p>
     * <p>vtableId(42)</p>
     */
    @ComProperty(name = "TextureAlignment", dispId = 0x75)
    MsoTextureAlignment getTextureAlignment();
            
    /**
     * <p>id(0x75)</p>
     * <p>vtableId(43)</p>
     * @param param0 [in] {@code MsoTextureAlignment}
     */
    @ComProperty(name = "TextureAlignment", dispId = 0x75)
    void setTextureAlignment(MsoTextureAlignment param0);
            
    /**
     * <p>id(0x76)</p>
     * <p>vtableId(44)</p>
     */
    @ComProperty(name = "TextureHorizontalScale", dispId = 0x76)
    Float getTextureHorizontalScale();
            
    /**
     * <p>id(0x76)</p>
     * <p>vtableId(45)</p>
     * @param param0 [in] {@code Float}
     */
    @ComProperty(name = "TextureHorizontalScale", dispId = 0x76)
    void setTextureHorizontalScale(Float param0);
            
    /**
     * <p>id(0x77)</p>
     * <p>vtableId(46)</p>
     */
    @ComProperty(name = "TextureVerticalScale", dispId = 0x77)
    Float getTextureVerticalScale();
            
    /**
     * <p>id(0x77)</p>
     * <p>vtableId(47)</p>
     * @param param0 [in] {@code Float}
     */
    @ComProperty(name = "TextureVerticalScale", dispId = 0x77)
    void setTextureVerticalScale(Float param0);
            
    /**
     * <p>id(0x78)</p>
     * <p>vtableId(48)</p>
     */
    @ComProperty(name = "TextureTile", dispId = 0x78)
    MsoTriState getTextureTile();
            
    /**
     * <p>id(0x78)</p>
     * <p>vtableId(49)</p>
     * @param param0 [in] {@code MsoTriState}
     */
    @ComProperty(name = "TextureTile", dispId = 0x78)
    void setTextureTile(MsoTriState param0);
            
    /**
     * <p>id(0x79)</p>
     * <p>vtableId(50)</p>
     */
    @ComProperty(name = "RotateWithObject", dispId = 0x79)
    MsoTriState getRotateWithObject();
            
    /**
     * <p>id(0x79)</p>
     * <p>vtableId(51)</p>
     * @param param0 [in] {@code MsoTriState}
     */
    @ComProperty(name = "RotateWithObject", dispId = 0x79)
    void setRotateWithObject(MsoTriState param0);
            
    /**
     * <p>id(0x7a)</p>
     * <p>vtableId(52)</p>
     */
    @ComProperty(name = "PictureEffects", dispId = 0x7a)
    PictureEffects getPictureEffects();
            
    /**
     * <p>id(0x7b)</p>
     * <p>vtableId(53)</p>
     */
    @ComProperty(name = "GradientAngle", dispId = 0x7b)
    Float getGradientAngle();
            
    /**
     * <p>id(0x7b)</p>
     * <p>vtableId(54)</p>
     * @param param0 [in] {@code Float}
     */
    @ComProperty(name = "GradientAngle", dispId = 0x7b)
    void setGradientAngle(Float param0);
            
    
}