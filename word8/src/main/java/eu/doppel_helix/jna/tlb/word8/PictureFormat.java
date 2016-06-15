
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000209CB-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000209CB-0000-0000-C000-000000000046}")
public interface PictureFormat extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x3e8)</p>
     */
    @ComProperty(name = "Application", dispId = 0x3e8)
    Application getApplication();
            
    /**
     * <p>id(0x3e9)</p>
     */
    @ComProperty(name = "Creator", dispId = 0x3e9)
    Integer getCreator();
            
    /**
     * <p>id(0x1)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x1)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * <p>id(0x64)</p>
     */
    @ComProperty(name = "Brightness", dispId = 0x64)
    Float getBrightness();
            
    /**
     * <p>id(0x64)</p>
     */
    @ComProperty(name = "Brightness", dispId = 0x64)
    void setBrightness(Float param0);
            
    /**
     * <p>id(0x65)</p>
     */
    @ComProperty(name = "ColorType", dispId = 0x65)
    eu.doppel_helix.jna.tlb.office2.MsoPictureColorType getColorType();
            
    /**
     * <p>id(0x65)</p>
     */
    @ComProperty(name = "ColorType", dispId = 0x65)
    void setColorType(eu.doppel_helix.jna.tlb.office2.MsoPictureColorType param0);
            
    /**
     * <p>id(0x66)</p>
     */
    @ComProperty(name = "Contrast", dispId = 0x66)
    Float getContrast();
            
    /**
     * <p>id(0x66)</p>
     */
    @ComProperty(name = "Contrast", dispId = 0x66)
    void setContrast(Float param0);
            
    /**
     * <p>id(0x67)</p>
     */
    @ComProperty(name = "CropBottom", dispId = 0x67)
    Float getCropBottom();
            
    /**
     * <p>id(0x67)</p>
     */
    @ComProperty(name = "CropBottom", dispId = 0x67)
    void setCropBottom(Float param0);
            
    /**
     * <p>id(0x68)</p>
     */
    @ComProperty(name = "CropLeft", dispId = 0x68)
    Float getCropLeft();
            
    /**
     * <p>id(0x68)</p>
     */
    @ComProperty(name = "CropLeft", dispId = 0x68)
    void setCropLeft(Float param0);
            
    /**
     * <p>id(0x69)</p>
     */
    @ComProperty(name = "CropRight", dispId = 0x69)
    Float getCropRight();
            
    /**
     * <p>id(0x69)</p>
     */
    @ComProperty(name = "CropRight", dispId = 0x69)
    void setCropRight(Float param0);
            
    /**
     * <p>id(0x6a)</p>
     */
    @ComProperty(name = "CropTop", dispId = 0x6a)
    Float getCropTop();
            
    /**
     * <p>id(0x6a)</p>
     */
    @ComProperty(name = "CropTop", dispId = 0x6a)
    void setCropTop(Float param0);
            
    /**
     * <p>id(0x6b)</p>
     */
    @ComProperty(name = "TransparencyColor", dispId = 0x6b)
    Integer getTransparencyColor();
            
    /**
     * <p>id(0x6b)</p>
     */
    @ComProperty(name = "TransparencyColor", dispId = 0x6b)
    void setTransparencyColor(Integer param0);
            
    /**
     * <p>id(0x6c)</p>
     */
    @ComProperty(name = "TransparentBackground", dispId = 0x6c)
    eu.doppel_helix.jna.tlb.office2.MsoTriState getTransparentBackground();
            
    /**
     * <p>id(0x6c)</p>
     */
    @ComProperty(name = "TransparentBackground", dispId = 0x6c)
    void setTransparentBackground(eu.doppel_helix.jna.tlb.office2.MsoTriState param0);
            
    /**
     * <p>id(0xa)</p>
     */
    @ComMethod(name = "IncrementBrightness", dispId = 0xa)
    void IncrementBrightness(Float Increment);
            
    /**
     * <p>id(0xb)</p>
     */
    @ComMethod(name = "IncrementContrast", dispId = 0xb)
    void IncrementContrast(Float Increment);
            
    /**
     * <p>id(0x6d)</p>
     */
    @ComProperty(name = "Crop", dispId = 0x6d)
    eu.doppel_helix.jna.tlb.office2.Crop getCrop();
            
    /**
     * <p>id(0x6d)</p>
     */
    @ComProperty(name = "Crop", dispId = 0x6d)
    void setCrop(eu.doppel_helix.jna.tlb.office2.Crop param0);
            
    
}