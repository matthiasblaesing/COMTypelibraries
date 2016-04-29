
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000C0317-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000C0317-0000-0000-C000-000000000046}")
public interface LineFormat {
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
     * <p>id(0x64)</p>
     */
    @ComProperty(name = "BackColor", dispId = 0x64)
    ColorFormat getBackColor();
            
    /**
     * <p>id(0x64)</p>
     */
    @ComProperty(name = "BackColor", dispId = 0x64)
    void setBackColor(ColorFormat param0);
            
    /**
     * <p>id(0x65)</p>
     */
    @ComProperty(name = "BeginArrowheadLength", dispId = 0x65)
    MsoArrowheadLength getBeginArrowheadLength();
            
    /**
     * <p>id(0x65)</p>
     */
    @ComProperty(name = "BeginArrowheadLength", dispId = 0x65)
    void setBeginArrowheadLength(MsoArrowheadLength param0);
            
    /**
     * <p>id(0x66)</p>
     */
    @ComProperty(name = "BeginArrowheadStyle", dispId = 0x66)
    MsoArrowheadStyle getBeginArrowheadStyle();
            
    /**
     * <p>id(0x66)</p>
     */
    @ComProperty(name = "BeginArrowheadStyle", dispId = 0x66)
    void setBeginArrowheadStyle(MsoArrowheadStyle param0);
            
    /**
     * <p>id(0x67)</p>
     */
    @ComProperty(name = "BeginArrowheadWidth", dispId = 0x67)
    MsoArrowheadWidth getBeginArrowheadWidth();
            
    /**
     * <p>id(0x67)</p>
     */
    @ComProperty(name = "BeginArrowheadWidth", dispId = 0x67)
    void setBeginArrowheadWidth(MsoArrowheadWidth param0);
            
    /**
     * <p>id(0x68)</p>
     */
    @ComProperty(name = "DashStyle", dispId = 0x68)
    MsoLineDashStyle getDashStyle();
            
    /**
     * <p>id(0x68)</p>
     */
    @ComProperty(name = "DashStyle", dispId = 0x68)
    void setDashStyle(MsoLineDashStyle param0);
            
    /**
     * <p>id(0x69)</p>
     */
    @ComProperty(name = "EndArrowheadLength", dispId = 0x69)
    MsoArrowheadLength getEndArrowheadLength();
            
    /**
     * <p>id(0x69)</p>
     */
    @ComProperty(name = "EndArrowheadLength", dispId = 0x69)
    void setEndArrowheadLength(MsoArrowheadLength param0);
            
    /**
     * <p>id(0x6a)</p>
     */
    @ComProperty(name = "EndArrowheadStyle", dispId = 0x6a)
    MsoArrowheadStyle getEndArrowheadStyle();
            
    /**
     * <p>id(0x6a)</p>
     */
    @ComProperty(name = "EndArrowheadStyle", dispId = 0x6a)
    void setEndArrowheadStyle(MsoArrowheadStyle param0);
            
    /**
     * <p>id(0x6b)</p>
     */
    @ComProperty(name = "EndArrowheadWidth", dispId = 0x6b)
    MsoArrowheadWidth getEndArrowheadWidth();
            
    /**
     * <p>id(0x6b)</p>
     */
    @ComProperty(name = "EndArrowheadWidth", dispId = 0x6b)
    void setEndArrowheadWidth(MsoArrowheadWidth param0);
            
    /**
     * <p>id(0x6c)</p>
     */
    @ComProperty(name = "ForeColor", dispId = 0x6c)
    ColorFormat getForeColor();
            
    /**
     * <p>id(0x6c)</p>
     */
    @ComProperty(name = "ForeColor", dispId = 0x6c)
    void setForeColor(ColorFormat param0);
            
    /**
     * <p>id(0x6d)</p>
     */
    @ComProperty(name = "Pattern", dispId = 0x6d)
    MsoPatternType getPattern();
            
    /**
     * <p>id(0x6d)</p>
     */
    @ComProperty(name = "Pattern", dispId = 0x6d)
    void setPattern(MsoPatternType param0);
            
    /**
     * <p>id(0x6e)</p>
     */
    @ComProperty(name = "Style", dispId = 0x6e)
    MsoLineStyle getStyle();
            
    /**
     * <p>id(0x6e)</p>
     */
    @ComProperty(name = "Style", dispId = 0x6e)
    void setStyle(MsoLineStyle param0);
            
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
    MsoTriState getVisible();
            
    /**
     * <p>id(0x70)</p>
     */
    @ComProperty(name = "Visible", dispId = 0x70)
    void setVisible(MsoTriState param0);
            
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
    MsoTriState getInsetPen();
            
    /**
     * <p>id(0x72)</p>
     */
    @ComProperty(name = "InsetPen", dispId = 0x72)
    void setInsetPen(MsoTriState param0);
            
    
}