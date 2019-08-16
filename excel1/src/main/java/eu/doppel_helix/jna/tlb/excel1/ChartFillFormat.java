
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00024435-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{00024435-0000-0000-C000-000000000046}")
public interface ChartFillFormat extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x94)</p>
     * <p>vtableId(7)</p>
     */
    @ComProperty(name = "Application", dispId = 0x94)
    Application getApplication();
            
    /**
     * <p>id(0x95)</p>
     * <p>vtableId(8)</p>
     */
    @ComProperty(name = "Creator", dispId = 0x95)
    XlCreator getCreator();
            
    /**
     * <p>id(0x96)</p>
     * <p>vtableId(9)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x96)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * <p>id(0x655)</p>
     * <p>vtableId(10)</p>
     * @param Style [in] {@code eu.doppel_helix.jna.tlb.office2.MsoGradientStyle}
     * @param Variant [in] {@code Integer}
     * @param Degree [in] {@code Float}
     */
    @ComMethod(name = "OneColorGradient", dispId = 0x655)
    void OneColorGradient(eu.doppel_helix.jna.tlb.office2.MsoGradientStyle Style,
            Integer Variant,
            Float Degree);
            
    /**
     * <p>id(0x658)</p>
     * <p>vtableId(11)</p>
     * @param Style [in] {@code eu.doppel_helix.jna.tlb.office2.MsoGradientStyle}
     * @param Variant [in] {@code Integer}
     */
    @ComMethod(name = "TwoColorGradient", dispId = 0x658)
    void TwoColorGradient(eu.doppel_helix.jna.tlb.office2.MsoGradientStyle Style,
            Integer Variant);
            
    /**
     * <p>id(0x659)</p>
     * <p>vtableId(12)</p>
     * @param PresetTexture [in] {@code eu.doppel_helix.jna.tlb.office2.MsoPresetTexture}
     */
    @ComMethod(name = "PresetTextured", dispId = 0x659)
    void PresetTextured(eu.doppel_helix.jna.tlb.office2.MsoPresetTexture PresetTexture);
            
    /**
     * <p>id(0x65b)</p>
     * <p>vtableId(13)</p>
     */
    @ComMethod(name = "Solid", dispId = 0x65b)
    void Solid();
            
    /**
     * <p>id(0x65c)</p>
     * <p>vtableId(14)</p>
     * @param Pattern [in] {@code eu.doppel_helix.jna.tlb.office2.MsoPatternType}
     */
    @ComMethod(name = "Patterned", dispId = 0x65c)
    void Patterned(eu.doppel_helix.jna.tlb.office2.MsoPatternType Pattern);
            
    /**
     * <p>id(0x65d)</p>
     * <p>vtableId(15)</p>
     * @param PictureFile [in, optional] {@code Object}
     * @param PictureFormat [in, optional] {@code Object}
     * @param PictureStackUnit [in, optional] {@code Object}
     * @param PicturePlacement [in, optional] {@code Object}
     */
    @ComMethod(name = "UserPicture", dispId = 0x65d)
    void UserPicture(Object PictureFile,
            Object PictureFormat,
            Object PictureStackUnit,
            Object PicturePlacement);
            
    /**
     * <p>id(0x662)</p>
     * <p>vtableId(16)</p>
     * @param TextureFile [in] {@code String}
     */
    @ComMethod(name = "UserTextured", dispId = 0x662)
    void UserTextured(String TextureFile);
            
    /**
     * <p>id(0x664)</p>
     * <p>vtableId(17)</p>
     * @param Style [in] {@code eu.doppel_helix.jna.tlb.office2.MsoGradientStyle}
     * @param Variant [in] {@code Integer}
     * @param PresetGradientType [in] {@code eu.doppel_helix.jna.tlb.office2.MsoPresetGradientType}
     */
    @ComMethod(name = "PresetGradient", dispId = 0x664)
    void PresetGradient(eu.doppel_helix.jna.tlb.office2.MsoGradientStyle Style,
            Integer Variant,
            eu.doppel_helix.jna.tlb.office2.MsoPresetGradientType PresetGradientType);
            
    /**
     * <p>id(0x666)</p>
     * <p>vtableId(18)</p>
     */
    @ComProperty(name = "BackColor", dispId = 0x666)
    ChartColorFormat getBackColor();
            
    /**
     * <p>id(0x667)</p>
     * <p>vtableId(19)</p>
     */
    @ComProperty(name = "ForeColor", dispId = 0x667)
    ChartColorFormat getForeColor();
            
    /**
     * <p>id(0x668)</p>
     * <p>vtableId(20)</p>
     */
    @ComProperty(name = "GradientColorType", dispId = 0x668)
    eu.doppel_helix.jna.tlb.office2.MsoGradientColorType getGradientColorType();
            
    /**
     * <p>id(0x669)</p>
     * <p>vtableId(21)</p>
     */
    @ComProperty(name = "GradientDegree", dispId = 0x669)
    Float getGradientDegree();
            
    /**
     * <p>id(0x66a)</p>
     * <p>vtableId(22)</p>
     */
    @ComProperty(name = "GradientStyle", dispId = 0x66a)
    eu.doppel_helix.jna.tlb.office2.MsoGradientStyle getGradientStyle();
            
    /**
     * <p>id(0x66b)</p>
     * <p>vtableId(23)</p>
     */
    @ComProperty(name = "GradientVariant", dispId = 0x66b)
    Integer getGradientVariant();
            
    /**
     * <p>id(0x5f)</p>
     * <p>vtableId(24)</p>
     */
    @ComProperty(name = "Pattern", dispId = 0x5f)
    eu.doppel_helix.jna.tlb.office2.MsoPatternType getPattern();
            
    /**
     * <p>id(0x665)</p>
     * <p>vtableId(25)</p>
     */
    @ComProperty(name = "PresetGradientType", dispId = 0x665)
    eu.doppel_helix.jna.tlb.office2.MsoPresetGradientType getPresetGradientType();
            
    /**
     * <p>id(0x65a)</p>
     * <p>vtableId(26)</p>
     */
    @ComProperty(name = "PresetTexture", dispId = 0x65a)
    eu.doppel_helix.jna.tlb.office2.MsoPresetTexture getPresetTexture();
            
    /**
     * <p>id(0x66c)</p>
     * <p>vtableId(27)</p>
     */
    @ComProperty(name = "TextureName", dispId = 0x66c)
    String getTextureName();
            
    /**
     * <p>id(0x66d)</p>
     * <p>vtableId(28)</p>
     */
    @ComProperty(name = "TextureType", dispId = 0x66d)
    eu.doppel_helix.jna.tlb.office2.MsoTextureType getTextureType();
            
    /**
     * <p>id(0x6c)</p>
     * <p>vtableId(29)</p>
     */
    @ComProperty(name = "Type", dispId = 0x6c)
    eu.doppel_helix.jna.tlb.office2.MsoFillType getType();
            
    /**
     * <p>id(0x22e)</p>
     * <p>vtableId(30)</p>
     */
    @ComProperty(name = "Visible", dispId = 0x22e)
    eu.doppel_helix.jna.tlb.office2.MsoTriState getVisible();
            
    /**
     * <p>id(0x22e)</p>
     * <p>vtableId(31)</p>
     * @param param0 [in] {@code eu.doppel_helix.jna.tlb.office2.MsoTriState}
     */
    @ComProperty(name = "Visible", dispId = 0x22e)
    void setVisible(eu.doppel_helix.jna.tlb.office2.MsoTriState param0);
            
    
}