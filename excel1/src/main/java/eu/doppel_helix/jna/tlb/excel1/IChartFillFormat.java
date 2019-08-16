
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00024435-0001-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{00024435-0001-0000-C000-000000000046}")
public interface IChartFillFormat extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x94)</p>
     * <p>vtableId(7)</p>
     * @param RHS [out] {@code Application}
     */
    @ComProperty(name = "Application", dispId = 0x94)
    com.sun.jna.platform.win32.WinNT.HRESULT getApplication(VARIANT RHS);
            
    /**
     * <p>id(0x95)</p>
     * <p>vtableId(8)</p>
     * @param RHS [out] {@code XlCreator}
     */
    @ComProperty(name = "Creator", dispId = 0x95)
    com.sun.jna.platform.win32.WinNT.HRESULT getCreator(VARIANT RHS);
            
    /**
     * <p>id(0x96)</p>
     * <p>vtableId(9)</p>
     * @param RHS [out] {@code com.sun.jna.platform.win32.COM.util.IDispatch}
     */
    @ComProperty(name = "Parent", dispId = 0x96)
    com.sun.jna.platform.win32.WinNT.HRESULT getParent(VARIANT RHS);
            
    /**
     * <p>id(0x655)</p>
     * <p>vtableId(10)</p>
     * @param Style [in] {@code eu.doppel_helix.jna.tlb.office2.MsoGradientStyle}
     * @param Variant [in] {@code Integer}
     * @param Degree [in] {@code Float}
     */
    @ComMethod(name = "OneColorGradient", dispId = 0x655)
    com.sun.jna.platform.win32.WinNT.HRESULT OneColorGradient(eu.doppel_helix.jna.tlb.office2.MsoGradientStyle Style,
            Integer Variant,
            Float Degree);
            
    /**
     * <p>id(0x658)</p>
     * <p>vtableId(11)</p>
     * @param Style [in] {@code eu.doppel_helix.jna.tlb.office2.MsoGradientStyle}
     * @param Variant [in] {@code Integer}
     */
    @ComMethod(name = "TwoColorGradient", dispId = 0x658)
    com.sun.jna.platform.win32.WinNT.HRESULT TwoColorGradient(eu.doppel_helix.jna.tlb.office2.MsoGradientStyle Style,
            Integer Variant);
            
    /**
     * <p>id(0x659)</p>
     * <p>vtableId(12)</p>
     * @param PresetTexture [in] {@code eu.doppel_helix.jna.tlb.office2.MsoPresetTexture}
     */
    @ComMethod(name = "PresetTextured", dispId = 0x659)
    com.sun.jna.platform.win32.WinNT.HRESULT PresetTextured(eu.doppel_helix.jna.tlb.office2.MsoPresetTexture PresetTexture);
            
    /**
     * <p>id(0x65b)</p>
     * <p>vtableId(13)</p>
     */
    @ComMethod(name = "Solid", dispId = 0x65b)
    com.sun.jna.platform.win32.WinNT.HRESULT Solid();
            
    /**
     * <p>id(0x65c)</p>
     * <p>vtableId(14)</p>
     * @param Pattern [in] {@code eu.doppel_helix.jna.tlb.office2.MsoPatternType}
     */
    @ComMethod(name = "Patterned", dispId = 0x65c)
    com.sun.jna.platform.win32.WinNT.HRESULT Patterned(eu.doppel_helix.jna.tlb.office2.MsoPatternType Pattern);
            
    /**
     * <p>id(0x65d)</p>
     * <p>vtableId(15)</p>
     * @param PictureFile [in, optional] {@code Object}
     * @param PictureFormat [in, optional] {@code Object}
     * @param PictureStackUnit [in, optional] {@code Object}
     * @param PicturePlacement [in, optional] {@code Object}
     */
    @ComMethod(name = "UserPicture", dispId = 0x65d)
    com.sun.jna.platform.win32.WinNT.HRESULT UserPicture(Object PictureFile,
            Object PictureFormat,
            Object PictureStackUnit,
            Object PicturePlacement);
            
    /**
     * <p>id(0x662)</p>
     * <p>vtableId(16)</p>
     * @param TextureFile [in] {@code String}
     */
    @ComMethod(name = "UserTextured", dispId = 0x662)
    com.sun.jna.platform.win32.WinNT.HRESULT UserTextured(String TextureFile);
            
    /**
     * <p>id(0x664)</p>
     * <p>vtableId(17)</p>
     * @param Style [in] {@code eu.doppel_helix.jna.tlb.office2.MsoGradientStyle}
     * @param Variant [in] {@code Integer}
     * @param PresetGradientType [in] {@code eu.doppel_helix.jna.tlb.office2.MsoPresetGradientType}
     */
    @ComMethod(name = "PresetGradient", dispId = 0x664)
    com.sun.jna.platform.win32.WinNT.HRESULT PresetGradient(eu.doppel_helix.jna.tlb.office2.MsoGradientStyle Style,
            Integer Variant,
            eu.doppel_helix.jna.tlb.office2.MsoPresetGradientType PresetGradientType);
            
    /**
     * <p>id(0x666)</p>
     * <p>vtableId(18)</p>
     * @param RHS [out] {@code ChartColorFormat}
     */
    @ComProperty(name = "BackColor", dispId = 0x666)
    com.sun.jna.platform.win32.WinNT.HRESULT getBackColor(VARIANT RHS);
            
    /**
     * <p>id(0x667)</p>
     * <p>vtableId(19)</p>
     * @param RHS [out] {@code ChartColorFormat}
     */
    @ComProperty(name = "ForeColor", dispId = 0x667)
    com.sun.jna.platform.win32.WinNT.HRESULT getForeColor(VARIANT RHS);
            
    /**
     * <p>id(0x668)</p>
     * <p>vtableId(20)</p>
     * @param RHS [out] {@code eu.doppel_helix.jna.tlb.office2.MsoGradientColorType}
     */
    @ComProperty(name = "GradientColorType", dispId = 0x668)
    com.sun.jna.platform.win32.WinNT.HRESULT getGradientColorType(VARIANT RHS);
            
    /**
     * <p>id(0x669)</p>
     * <p>vtableId(21)</p>
     * @param RHS [out] {@code Float}
     */
    @ComProperty(name = "GradientDegree", dispId = 0x669)
    com.sun.jna.platform.win32.WinNT.HRESULT getGradientDegree(VARIANT RHS);
            
    /**
     * <p>id(0x66a)</p>
     * <p>vtableId(22)</p>
     * @param RHS [out] {@code eu.doppel_helix.jna.tlb.office2.MsoGradientStyle}
     */
    @ComProperty(name = "GradientStyle", dispId = 0x66a)
    com.sun.jna.platform.win32.WinNT.HRESULT getGradientStyle(VARIANT RHS);
            
    /**
     * <p>id(0x66b)</p>
     * <p>vtableId(23)</p>
     * @param RHS [out] {@code Integer}
     */
    @ComProperty(name = "GradientVariant", dispId = 0x66b)
    com.sun.jna.platform.win32.WinNT.HRESULT getGradientVariant(VARIANT RHS);
            
    /**
     * <p>id(0x5f)</p>
     * <p>vtableId(24)</p>
     * @param RHS [out] {@code eu.doppel_helix.jna.tlb.office2.MsoPatternType}
     */
    @ComProperty(name = "Pattern", dispId = 0x5f)
    com.sun.jna.platform.win32.WinNT.HRESULT getPattern(VARIANT RHS);
            
    /**
     * <p>id(0x665)</p>
     * <p>vtableId(25)</p>
     * @param RHS [out] {@code eu.doppel_helix.jna.tlb.office2.MsoPresetGradientType}
     */
    @ComProperty(name = "PresetGradientType", dispId = 0x665)
    com.sun.jna.platform.win32.WinNT.HRESULT getPresetGradientType(VARIANT RHS);
            
    /**
     * <p>id(0x65a)</p>
     * <p>vtableId(26)</p>
     * @param RHS [out] {@code eu.doppel_helix.jna.tlb.office2.MsoPresetTexture}
     */
    @ComProperty(name = "PresetTexture", dispId = 0x65a)
    com.sun.jna.platform.win32.WinNT.HRESULT getPresetTexture(VARIANT RHS);
            
    /**
     * <p>id(0x66c)</p>
     * <p>vtableId(27)</p>
     * @param RHS [out] {@code String}
     */
    @ComProperty(name = "TextureName", dispId = 0x66c)
    com.sun.jna.platform.win32.WinNT.HRESULT getTextureName(VARIANT RHS);
            
    /**
     * <p>id(0x66d)</p>
     * <p>vtableId(28)</p>
     * @param RHS [out] {@code eu.doppel_helix.jna.tlb.office2.MsoTextureType}
     */
    @ComProperty(name = "TextureType", dispId = 0x66d)
    com.sun.jna.platform.win32.WinNT.HRESULT getTextureType(VARIANT RHS);
            
    /**
     * <p>id(0x6c)</p>
     * <p>vtableId(29)</p>
     * @param RHS [out] {@code eu.doppel_helix.jna.tlb.office2.MsoFillType}
     */
    @ComProperty(name = "Type", dispId = 0x6c)
    com.sun.jna.platform.win32.WinNT.HRESULT getType(VARIANT RHS);
            
    /**
     * <p>id(0x22e)</p>
     * <p>vtableId(30)</p>
     * @param RHS [out] {@code eu.doppel_helix.jna.tlb.office2.MsoTriState}
     */
    @ComProperty(name = "Visible", dispId = 0x22e)
    com.sun.jna.platform.win32.WinNT.HRESULT getVisible(VARIANT RHS);
            
    /**
     * <p>id(0x22e)</p>
     * <p>vtableId(31)</p>
     * @param RHS [in] {@code eu.doppel_helix.jna.tlb.office2.MsoTriState}
     */
    @ComProperty(name = "Visible", dispId = 0x22e)
    com.sun.jna.platform.win32.WinNT.HRESULT setVisible(eu.doppel_helix.jna.tlb.office2.MsoTriState RHS);
            
    
}