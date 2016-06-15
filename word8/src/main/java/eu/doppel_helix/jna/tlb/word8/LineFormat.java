
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000209CA-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000209CA-0000-0000-C000-000000000046}")
public interface LineFormat extends IUnknown, IRawDispatchHandle, IDispatch {
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
    @ComProperty(name = "BackColor", dispId = 0x64)
    ColorFormat getBackColor();
            
    /**
     * <p>id(0x65)</p>
     */
    @ComProperty(name = "BeginArrowheadLength", dispId = 0x65)
    eu.doppel_helix.jna.tlb.office2.MsoArrowheadLength getBeginArrowheadLength();
            
    /**
     * <p>id(0x65)</p>
     */
    @ComProperty(name = "BeginArrowheadLength", dispId = 0x65)
    void setBeginArrowheadLength(eu.doppel_helix.jna.tlb.office2.MsoArrowheadLength param0);
            
    /**
     * <p>id(0x66)</p>
     */
    @ComProperty(name = "BeginArrowheadStyle", dispId = 0x66)
    eu.doppel_helix.jna.tlb.office2.MsoArrowheadStyle getBeginArrowheadStyle();
            
    /**
     * <p>id(0x66)</p>
     */
    @ComProperty(name = "BeginArrowheadStyle", dispId = 0x66)
    void setBeginArrowheadStyle(eu.doppel_helix.jna.tlb.office2.MsoArrowheadStyle param0);
            
    /**
     * <p>id(0x67)</p>
     */
    @ComProperty(name = "BeginArrowheadWidth", dispId = 0x67)
    eu.doppel_helix.jna.tlb.office2.MsoArrowheadWidth getBeginArrowheadWidth();
            
    /**
     * <p>id(0x67)</p>
     */
    @ComProperty(name = "BeginArrowheadWidth", dispId = 0x67)
    void setBeginArrowheadWidth(eu.doppel_helix.jna.tlb.office2.MsoArrowheadWidth param0);
            
    /**
     * <p>id(0x68)</p>
     */
    @ComProperty(name = "DashStyle", dispId = 0x68)
    eu.doppel_helix.jna.tlb.office2.MsoLineDashStyle getDashStyle();
            
    /**
     * <p>id(0x68)</p>
     */
    @ComProperty(name = "DashStyle", dispId = 0x68)
    void setDashStyle(eu.doppel_helix.jna.tlb.office2.MsoLineDashStyle param0);
            
    /**
     * <p>id(0x69)</p>
     */
    @ComProperty(name = "EndArrowheadLength", dispId = 0x69)
    eu.doppel_helix.jna.tlb.office2.MsoArrowheadLength getEndArrowheadLength();
            
    /**
     * <p>id(0x69)</p>
     */
    @ComProperty(name = "EndArrowheadLength", dispId = 0x69)
    void setEndArrowheadLength(eu.doppel_helix.jna.tlb.office2.MsoArrowheadLength param0);
            
    /**
     * <p>id(0x6a)</p>
     */
    @ComProperty(name = "EndArrowheadStyle", dispId = 0x6a)
    eu.doppel_helix.jna.tlb.office2.MsoArrowheadStyle getEndArrowheadStyle();
            
    /**
     * <p>id(0x6a)</p>
     */
    @ComProperty(name = "EndArrowheadStyle", dispId = 0x6a)
    void setEndArrowheadStyle(eu.doppel_helix.jna.tlb.office2.MsoArrowheadStyle param0);
            
    /**
     * <p>id(0x6b)</p>
     */
    @ComProperty(name = "EndArrowheadWidth", dispId = 0x6b)
    eu.doppel_helix.jna.tlb.office2.MsoArrowheadWidth getEndArrowheadWidth();
            
    /**
     * <p>id(0x6b)</p>
     */
    @ComProperty(name = "EndArrowheadWidth", dispId = 0x6b)
    void setEndArrowheadWidth(eu.doppel_helix.jna.tlb.office2.MsoArrowheadWidth param0);
            
    /**
     * <p>id(0x6c)</p>
     */
    @ComProperty(name = "ForeColor", dispId = 0x6c)
    ColorFormat getForeColor();
            
    /**
     * <p>id(0x6d)</p>
     */
    @ComProperty(name = "Pattern", dispId = 0x6d)
    eu.doppel_helix.jna.tlb.office2.MsoPatternType getPattern();
            
    /**
     * <p>id(0x6d)</p>
     */
    @ComProperty(name = "Pattern", dispId = 0x6d)
    void setPattern(eu.doppel_helix.jna.tlb.office2.MsoPatternType param0);
            
    /**
     * <p>id(0x6e)</p>
     */
    @ComProperty(name = "Style", dispId = 0x6e)
    eu.doppel_helix.jna.tlb.office2.MsoLineStyle getStyle();
            
    /**
     * <p>id(0x6e)</p>
     */
    @ComProperty(name = "Style", dispId = 0x6e)
    void setStyle(eu.doppel_helix.jna.tlb.office2.MsoLineStyle param0);
            
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
    @ComProperty(name = "Visible", dispId = 0x70)
    eu.doppel_helix.jna.tlb.office2.MsoTriState getVisible();
            
    /**
     * <p>id(0x70)</p>
     */
    @ComProperty(name = "Visible", dispId = 0x70)
    void setVisible(eu.doppel_helix.jna.tlb.office2.MsoTriState param0);
            
    /**
     * <p>id(0x71)</p>
     */
    @ComProperty(name = "Weight", dispId = 0x71)
    Float getWeight();
            
    /**
     * <p>id(0x71)</p>
     */
    @ComProperty(name = "Weight", dispId = 0x71)
    void setWeight(Float param0);
            
    /**
     * <p>id(0x72)</p>
     */
    @ComProperty(name = "InsetPen", dispId = 0x72)
    eu.doppel_helix.jna.tlb.office2.MsoTriState getInsetPen();
            
    /**
     * <p>id(0x72)</p>
     */
    @ComProperty(name = "InsetPen", dispId = 0x72)
    void setInsetPen(eu.doppel_helix.jna.tlb.office2.MsoTriState param0);
            
    
}