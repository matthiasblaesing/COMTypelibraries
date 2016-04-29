
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000C171C-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000C171C-0000-0000-C000-000000000046}")
public interface ChartFillFormat {
    /**
     * <p>id(0x60020000)</p>
     */
    @ComMethod(name = "OneColorGradient", dispId = 0x60020000)
    void OneColorGradient(Integer Style,
            Integer Variant,
            Float Degree);
            
    /**
     * <p>id(0x60020001)</p>
     */
    @ComMethod(name = "TwoColorGradient", dispId = 0x60020001)
    void TwoColorGradient(Integer Style,
            Integer Variant);
            
    /**
     * <p>id(0x60020002)</p>
     */
    @ComMethod(name = "PresetTextured", dispId = 0x60020002)
    void PresetTextured(Integer PresetTexture);
            
    /**
     * <p>id(0x60020003)</p>
     */
    @ComMethod(name = "Solid", dispId = 0x60020003)
    void Solid();
            
    /**
     * <p>id(0x60020004)</p>
     */
    @ComMethod(name = "Patterned", dispId = 0x60020004)
    void Patterned(Integer Pattern);
            
    /**
     * <p>id(0x60020005)</p>
     */
    @ComMethod(name = "UserPicture", dispId = 0x60020005)
    void UserPicture(Object PictureFile,
            Object PictureFormat,
            Object PictureStackUnit,
            Object PicturePlacement);
            
    /**
     * <p>id(0x60020006)</p>
     */
    @ComMethod(name = "UserTextured", dispId = 0x60020006)
    void UserTextured(String TextureFile);
            
    /**
     * <p>id(0x60020007)</p>
     */
    @ComMethod(name = "PresetGradient", dispId = 0x60020007)
    void PresetGradient(Integer Style,
            Integer Variant,
            Integer PresetGradientType);
            
    /**
     * <p>id(0x60020008)</p>
     */
    @ComProperty(name = "BackColor", dispId = 0x60020008)
    ChartColorFormat getBackColor();
            
    /**
     * <p>id(0x60020009)</p>
     */
    @ComProperty(name = "ForeColor", dispId = 0x60020009)
    ChartColorFormat getForeColor();
            
    /**
     * <p>id(0x6002000a)</p>
     */
    @ComProperty(name = "GradientColorType", dispId = 0x6002000a)
    Integer getGradientColorType();
            
    /**
     * <p>id(0x6002000b)</p>
     */
    @ComProperty(name = "GradientDegree", dispId = 0x6002000b)
    Float getGradientDegree();
            
    /**
     * <p>id(0x6002000c)</p>
     */
    @ComProperty(name = "GradientStyle", dispId = 0x6002000c)
    Integer getGradientStyle();
            
    /**
     * <p>id(0x6002000d)</p>
     */
    @ComProperty(name = "GradientVariant", dispId = 0x6002000d)
    Integer getGradientVariant();
            
    /**
     * <p>id(0x6002000e)</p>
     */
    @ComProperty(name = "Pattern", dispId = 0x6002000e)
    Integer getPattern();
            
    /**
     * <p>id(0x6002000f)</p>
     */
    @ComProperty(name = "PresetGradientType", dispId = 0x6002000f)
    Integer getPresetGradientType();
            
    /**
     * <p>id(0x60020010)</p>
     */
    @ComProperty(name = "PresetTexture", dispId = 0x60020010)
    Integer getPresetTexture();
            
    /**
     * <p>id(0x60020011)</p>
     */
    @ComProperty(name = "TextureName", dispId = 0x60020011)
    String getTextureName();
            
    /**
     * <p>id(0x60020012)</p>
     */
    @ComProperty(name = "TextureType", dispId = 0x60020012)
    Integer getTextureType();
            
    /**
     * <p>id(0x60020013)</p>
     */
    @ComProperty(name = "Type", dispId = 0x60020013)
    Integer getType();
            
    /**
     * <p>id(0x60020014)</p>
     */
    @ComProperty(name = "Visible", dispId = 0x60020014)
    void setVisible(Integer param0);
            
    /**
     * <p>id(0x60020014)</p>
     */
    @ComProperty(name = "Visible", dispId = 0x60020014)
    Integer getVisible();
            
    /**
     * <p>id(0x94)</p>
     */
    @ComProperty(name = "Application", dispId = 0x94)
    com.sun.jna.platform.win32.COM.util.IDispatch getApplication();
            
    /**
     * <p>id(0x95)</p>
     */
    @ComProperty(name = "Creator", dispId = 0x95)
    Integer getCreator();
            
    /**
     * <p>id(0x96)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x96)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    
}