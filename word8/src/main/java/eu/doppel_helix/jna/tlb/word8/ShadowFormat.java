
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000209CC-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000209CC-0000-0000-C000-000000000046}")
public interface ShadowFormat extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x3e8)</p>
     * <p>vtableId(7)</p>
     */
    @ComProperty(name = "Application", dispId = 0x3e8)
    Application getApplication();
            
    /**
     * <p>id(0x3e9)</p>
     * <p>vtableId(8)</p>
     */
    @ComProperty(name = "Creator", dispId = 0x3e9)
    Integer getCreator();
            
    /**
     * <p>id(0x1)</p>
     * <p>vtableId(9)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x1)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * <p>id(0x64)</p>
     * <p>vtableId(10)</p>
     */
    @ComProperty(name = "ForeColor", dispId = 0x64)
    ColorFormat getForeColor();
            
    /**
     * <p>id(0x65)</p>
     * <p>vtableId(11)</p>
     */
    @ComProperty(name = "Obscured", dispId = 0x65)
    eu.doppel_helix.jna.tlb.office2.MsoTriState getObscured();
            
    /**
     * <p>id(0x65)</p>
     * <p>vtableId(12)</p>
     * @param param0 [in] {@code eu.doppel_helix.jna.tlb.office2.MsoTriState}
     */
    @ComProperty(name = "Obscured", dispId = 0x65)
    void setObscured(eu.doppel_helix.jna.tlb.office2.MsoTriState param0);
            
    /**
     * <p>id(0x66)</p>
     * <p>vtableId(13)</p>
     */
    @ComProperty(name = "OffsetX", dispId = 0x66)
    Float getOffsetX();
            
    /**
     * <p>id(0x66)</p>
     * <p>vtableId(14)</p>
     * @param param0 [in] {@code Float}
     */
    @ComProperty(name = "OffsetX", dispId = 0x66)
    void setOffsetX(Float param0);
            
    /**
     * <p>id(0x67)</p>
     * <p>vtableId(15)</p>
     */
    @ComProperty(name = "OffsetY", dispId = 0x67)
    Float getOffsetY();
            
    /**
     * <p>id(0x67)</p>
     * <p>vtableId(16)</p>
     * @param param0 [in] {@code Float}
     */
    @ComProperty(name = "OffsetY", dispId = 0x67)
    void setOffsetY(Float param0);
            
    /**
     * <p>id(0x68)</p>
     * <p>vtableId(17)</p>
     */
    @ComProperty(name = "Transparency", dispId = 0x68)
    Float getTransparency();
            
    /**
     * <p>id(0x68)</p>
     * <p>vtableId(18)</p>
     * @param param0 [in] {@code Float}
     */
    @ComProperty(name = "Transparency", dispId = 0x68)
    void setTransparency(Float param0);
            
    /**
     * <p>id(0x69)</p>
     * <p>vtableId(19)</p>
     */
    @ComProperty(name = "Type", dispId = 0x69)
    eu.doppel_helix.jna.tlb.office2.MsoShadowType getType();
            
    /**
     * <p>id(0x69)</p>
     * <p>vtableId(20)</p>
     * @param param0 [in] {@code eu.doppel_helix.jna.tlb.office2.MsoShadowType}
     */
    @ComProperty(name = "Type", dispId = 0x69)
    void setType(eu.doppel_helix.jna.tlb.office2.MsoShadowType param0);
            
    /**
     * <p>id(0x6a)</p>
     * <p>vtableId(21)</p>
     */
    @ComProperty(name = "Visible", dispId = 0x6a)
    eu.doppel_helix.jna.tlb.office2.MsoTriState getVisible();
            
    /**
     * <p>id(0x6a)</p>
     * <p>vtableId(22)</p>
     * @param param0 [in] {@code eu.doppel_helix.jna.tlb.office2.MsoTriState}
     */
    @ComProperty(name = "Visible", dispId = 0x6a)
    void setVisible(eu.doppel_helix.jna.tlb.office2.MsoTriState param0);
            
    /**
     * <p>id(0xa)</p>
     * <p>vtableId(23)</p>
     * @param Increment [in] {@code Float}
     */
    @ComMethod(name = "IncrementOffsetX", dispId = 0xa)
    void IncrementOffsetX(Float Increment);
            
    /**
     * <p>id(0xb)</p>
     * <p>vtableId(24)</p>
     * @param Increment [in] {@code Float}
     */
    @ComMethod(name = "IncrementOffsetY", dispId = 0xb)
    void IncrementOffsetY(Float Increment);
            
    /**
     * <p>id(0x6b)</p>
     * <p>vtableId(25)</p>
     */
    @ComProperty(name = "Style", dispId = 0x6b)
    eu.doppel_helix.jna.tlb.office2.MsoShadowStyle getStyle();
            
    /**
     * <p>id(0x6b)</p>
     * <p>vtableId(26)</p>
     * @param param0 [in] {@code eu.doppel_helix.jna.tlb.office2.MsoShadowStyle}
     */
    @ComProperty(name = "Style", dispId = 0x6b)
    void setStyle(eu.doppel_helix.jna.tlb.office2.MsoShadowStyle param0);
            
    /**
     * <p>id(0x6c)</p>
     * <p>vtableId(27)</p>
     */
    @ComProperty(name = "Blur", dispId = 0x6c)
    Float getBlur();
            
    /**
     * <p>id(0x6c)</p>
     * <p>vtableId(28)</p>
     * @param param0 [in] {@code Float}
     */
    @ComProperty(name = "Blur", dispId = 0x6c)
    void setBlur(Float param0);
            
    /**
     * <p>id(0x6d)</p>
     * <p>vtableId(29)</p>
     */
    @ComProperty(name = "Size", dispId = 0x6d)
    Float getSize();
            
    /**
     * <p>id(0x6d)</p>
     * <p>vtableId(30)</p>
     * @param param0 [in] {@code Float}
     */
    @ComProperty(name = "Size", dispId = 0x6d)
    void setSize(Float param0);
            
    /**
     * <p>id(0x6e)</p>
     * <p>vtableId(31)</p>
     */
    @ComProperty(name = "RotateWithShape", dispId = 0x6e)
    eu.doppel_helix.jna.tlb.office2.MsoTriState getRotateWithShape();
            
    /**
     * <p>id(0x6e)</p>
     * <p>vtableId(32)</p>
     * @param param0 [in] {@code eu.doppel_helix.jna.tlb.office2.MsoTriState}
     */
    @ComProperty(name = "RotateWithShape", dispId = 0x6e)
    void setRotateWithShape(eu.doppel_helix.jna.tlb.office2.MsoTriState param0);
            
    
}