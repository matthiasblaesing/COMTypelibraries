
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000C031A-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000C031A-0000-0000-C000-000000000046}")
public interface PictureFormat extends IUnknown, IRawDispatchHandle, IDispatch {
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
     * @param Increment [in] {@code Float}
     */
    @ComMethod(name = "IncrementBrightness", dispId = 0xa)
    void IncrementBrightness(Float Increment);
            
    /**
     * <p>id(0xb)</p>
     * <p>vtableId(11)</p>
     * @param Increment [in] {@code Float}
     */
    @ComMethod(name = "IncrementContrast", dispId = 0xb)
    void IncrementContrast(Float Increment);
            
    /**
     * <p>id(0x64)</p>
     * <p>vtableId(12)</p>
     */
    @ComProperty(name = "Brightness", dispId = 0x64)
    Float getBrightness();
            
    /**
     * <p>id(0x64)</p>
     * <p>vtableId(13)</p>
     * @param param0 [in] {@code Float}
     */
    @ComProperty(name = "Brightness", dispId = 0x64)
    void setBrightness(Float param0);
            
    /**
     * <p>id(0x65)</p>
     * <p>vtableId(14)</p>
     */
    @ComProperty(name = "ColorType", dispId = 0x65)
    MsoPictureColorType getColorType();
            
    /**
     * <p>id(0x65)</p>
     * <p>vtableId(15)</p>
     * @param param0 [in] {@code MsoPictureColorType}
     */
    @ComProperty(name = "ColorType", dispId = 0x65)
    void setColorType(MsoPictureColorType param0);
            
    /**
     * <p>id(0x66)</p>
     * <p>vtableId(16)</p>
     */
    @ComProperty(name = "Contrast", dispId = 0x66)
    Float getContrast();
            
    /**
     * <p>id(0x66)</p>
     * <p>vtableId(17)</p>
     * @param param0 [in] {@code Float}
     */
    @ComProperty(name = "Contrast", dispId = 0x66)
    void setContrast(Float param0);
            
    /**
     * <p>id(0x67)</p>
     * <p>vtableId(18)</p>
     */
    @ComProperty(name = "CropBottom", dispId = 0x67)
    Float getCropBottom();
            
    /**
     * <p>id(0x67)</p>
     * <p>vtableId(19)</p>
     * @param param0 [in] {@code Float}
     */
    @ComProperty(name = "CropBottom", dispId = 0x67)
    void setCropBottom(Float param0);
            
    /**
     * <p>id(0x68)</p>
     * <p>vtableId(20)</p>
     */
    @ComProperty(name = "CropLeft", dispId = 0x68)
    Float getCropLeft();
            
    /**
     * <p>id(0x68)</p>
     * <p>vtableId(21)</p>
     * @param param0 [in] {@code Float}
     */
    @ComProperty(name = "CropLeft", dispId = 0x68)
    void setCropLeft(Float param0);
            
    /**
     * <p>id(0x69)</p>
     * <p>vtableId(22)</p>
     */
    @ComProperty(name = "CropRight", dispId = 0x69)
    Float getCropRight();
            
    /**
     * <p>id(0x69)</p>
     * <p>vtableId(23)</p>
     * @param param0 [in] {@code Float}
     */
    @ComProperty(name = "CropRight", dispId = 0x69)
    void setCropRight(Float param0);
            
    /**
     * <p>id(0x6a)</p>
     * <p>vtableId(24)</p>
     */
    @ComProperty(name = "CropTop", dispId = 0x6a)
    Float getCropTop();
            
    /**
     * <p>id(0x6a)</p>
     * <p>vtableId(25)</p>
     * @param param0 [in] {@code Float}
     */
    @ComProperty(name = "CropTop", dispId = 0x6a)
    void setCropTop(Float param0);
            
    /**
     * <p>id(0x6b)</p>
     * <p>vtableId(26)</p>
     */
    @ComProperty(name = "TransparencyColor", dispId = 0x6b)
    Integer getTransparencyColor();
            
    /**
     * <p>id(0x6b)</p>
     * <p>vtableId(27)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "TransparencyColor", dispId = 0x6b)
    void setTransparencyColor(Integer param0);
            
    /**
     * <p>id(0x6c)</p>
     * <p>vtableId(28)</p>
     */
    @ComProperty(name = "TransparentBackground", dispId = 0x6c)
    MsoTriState getTransparentBackground();
            
    /**
     * <p>id(0x6c)</p>
     * <p>vtableId(29)</p>
     * @param param0 [in] {@code MsoTriState}
     */
    @ComProperty(name = "TransparentBackground", dispId = 0x6c)
    void setTransparentBackground(MsoTriState param0);
            
    /**
     * <p>id(0x6d)</p>
     * <p>vtableId(30)</p>
     */
    @ComProperty(name = "Crop", dispId = 0x6d)
    Crop getCrop();
            
    
}