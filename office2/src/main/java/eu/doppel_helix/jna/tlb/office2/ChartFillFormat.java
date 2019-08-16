
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000C171C-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000C171C-0000-0000-C000-000000000046}")
public interface ChartFillFormat extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x60020000)</p>
     * <p>vtableId(7)</p>
     * @param Style [in] {@code Integer}
     * @param Variant [in] {@code Integer}
     * @param Degree [in] {@code Float}
     */
    @ComMethod(name = "OneColorGradient", dispId = 0x60020000)
    void OneColorGradient(Integer Style,
            Integer Variant,
            Float Degree);
            
    /**
     * <p>id(0x60020001)</p>
     * <p>vtableId(8)</p>
     * @param Style [in] {@code Integer}
     * @param Variant [in] {@code Integer}
     */
    @ComMethod(name = "TwoColorGradient", dispId = 0x60020001)
    void TwoColorGradient(Integer Style,
            Integer Variant);
            
    /**
     * <p>id(0x60020002)</p>
     * <p>vtableId(9)</p>
     * @param PresetTexture [in] {@code Integer}
     */
    @ComMethod(name = "PresetTextured", dispId = 0x60020002)
    void PresetTextured(Integer PresetTexture);
            
    /**
     * <p>id(0x60020003)</p>
     * <p>vtableId(10)</p>
     */
    @ComMethod(name = "Solid", dispId = 0x60020003)
    void Solid();
            
    /**
     * <p>id(0x60020004)</p>
     * <p>vtableId(11)</p>
     * @param Pattern [in] {@code Integer}
     */
    @ComMethod(name = "Patterned", dispId = 0x60020004)
    void Patterned(Integer Pattern);
            
    /**
     * <p>id(0x60020005)</p>
     * <p>vtableId(12)</p>
     * @param PictureFile [in] {@code Object}
     * @param PictureFormat [in] {@code Object}
     * @param PictureStackUnit [in] {@code Object}
     * @param PicturePlacement [in] {@code Object}
     */
    @ComMethod(name = "UserPicture", dispId = 0x60020005)
    void UserPicture(Object PictureFile,
            Object PictureFormat,
            Object PictureStackUnit,
            Object PicturePlacement);
            
    /**
     * <p>id(0x60020006)</p>
     * <p>vtableId(13)</p>
     * @param TextureFile [in] {@code String}
     */
    @ComMethod(name = "UserTextured", dispId = 0x60020006)
    void UserTextured(String TextureFile);
            
    /**
     * <p>id(0x60020007)</p>
     * <p>vtableId(14)</p>
     * @param Style [in] {@code Integer}
     * @param Variant [in] {@code Integer}
     * @param PresetGradientType [in] {@code Integer}
     */
    @ComMethod(name = "PresetGradient", dispId = 0x60020007)
    void PresetGradient(Integer Style,
            Integer Variant,
            Integer PresetGradientType);
            
    /**
     * <p>id(0x60020008)</p>
     * <p>vtableId(15)</p>
     */
    @ComProperty(name = "BackColor", dispId = 0x60020008)
    ChartColorFormat getBackColor();
            
    /**
     * <p>id(0x60020009)</p>
     * <p>vtableId(16)</p>
     */
    @ComProperty(name = "ForeColor", dispId = 0x60020009)
    ChartColorFormat getForeColor();
            
    /**
     * <p>id(0x6002000a)</p>
     * <p>vtableId(17)</p>
     */
    @ComProperty(name = "GradientColorType", dispId = 0x6002000a)
    Integer getGradientColorType();
            
    /**
     * <p>id(0x6002000b)</p>
     * <p>vtableId(18)</p>
     */
    @ComProperty(name = "GradientDegree", dispId = 0x6002000b)
    Float getGradientDegree();
            
    /**
     * <p>id(0x6002000c)</p>
     * <p>vtableId(19)</p>
     */
    @ComProperty(name = "GradientStyle", dispId = 0x6002000c)
    Integer getGradientStyle();
            
    /**
     * <p>id(0x6002000d)</p>
     * <p>vtableId(20)</p>
     */
    @ComProperty(name = "GradientVariant", dispId = 0x6002000d)
    Integer getGradientVariant();
            
    /**
     * <p>id(0x6002000e)</p>
     * <p>vtableId(21)</p>
     */
    @ComProperty(name = "Pattern", dispId = 0x6002000e)
    Integer getPattern();
            
    /**
     * <p>id(0x6002000f)</p>
     * <p>vtableId(22)</p>
     */
    @ComProperty(name = "PresetGradientType", dispId = 0x6002000f)
    Integer getPresetGradientType();
            
    /**
     * <p>id(0x60020010)</p>
     * <p>vtableId(23)</p>
     */
    @ComProperty(name = "PresetTexture", dispId = 0x60020010)
    Integer getPresetTexture();
            
    /**
     * <p>id(0x60020011)</p>
     * <p>vtableId(24)</p>
     */
    @ComProperty(name = "TextureName", dispId = 0x60020011)
    String getTextureName();
            
    /**
     * <p>id(0x60020012)</p>
     * <p>vtableId(25)</p>
     */
    @ComProperty(name = "TextureType", dispId = 0x60020012)
    Integer getTextureType();
            
    /**
     * <p>id(0x60020013)</p>
     * <p>vtableId(26)</p>
     */
    @ComProperty(name = "Type", dispId = 0x60020013)
    Integer getType();
            
    /**
     * <p>id(0x60020014)</p>
     * <p>vtableId(27)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "Visible", dispId = 0x60020014)
    void setVisible(Integer param0);
            
    /**
     * <p>id(0x60020014)</p>
     * <p>vtableId(28)</p>
     */
    @ComProperty(name = "Visible", dispId = 0x60020014)
    Integer getVisible();
            
    /**
     * <p>id(0x94)</p>
     * <p>vtableId(29)</p>
     */
    @ComProperty(name = "Application", dispId = 0x94)
    com.sun.jna.platform.win32.COM.util.IDispatch getApplication();
            
    /**
     * <p>id(0x95)</p>
     * <p>vtableId(30)</p>
     */
    @ComProperty(name = "Creator", dispId = 0x95)
    Integer getCreator();
            
    /**
     * <p>id(0x96)</p>
     * <p>vtableId(31)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x96)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    
}