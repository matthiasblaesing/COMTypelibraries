
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000C0317-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000C0317-0000-0000-C000-000000000046}")
public interface LineFormat extends IUnknown, IRawDispatchHandle, IDispatch {
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
     * <p>id(0x64)</p>
     * <p>vtableId(10)</p>
     */
    @ComProperty(name = "BackColor", dispId = 0x64)
    eu.doppel_helix.jna.tlb.office2.LineFormat getBackColor();
            
    /**
     * <p>id(0x64)</p>
     * <p>vtableId(11)</p>
     * @param param0 [in] {@code eu.doppel_helix.jna.tlb.office2.LineFormat}
     */
    @ComProperty(name = "BackColor", dispId = 0x64)
    void setBackColor(eu.doppel_helix.jna.tlb.office2.LineFormat param0);
            
    /**
     * <p>id(0x65)</p>
     * <p>vtableId(12)</p>
     */
    @ComProperty(name = "BeginArrowheadLength", dispId = 0x65)
    eu.doppel_helix.jna.tlb.office2.LineFormat getBeginArrowheadLength();
            
    /**
     * <p>id(0x65)</p>
     * <p>vtableId(13)</p>
     * @param param0 [in] {@code eu.doppel_helix.jna.tlb.office2.LineFormat}
     */
    @ComProperty(name = "BeginArrowheadLength", dispId = 0x65)
    void setBeginArrowheadLength(eu.doppel_helix.jna.tlb.office2.LineFormat param0);
            
    /**
     * <p>id(0x66)</p>
     * <p>vtableId(14)</p>
     */
    @ComProperty(name = "BeginArrowheadStyle", dispId = 0x66)
    eu.doppel_helix.jna.tlb.office2.LineFormat getBeginArrowheadStyle();
            
    /**
     * <p>id(0x66)</p>
     * <p>vtableId(15)</p>
     * @param param0 [in] {@code eu.doppel_helix.jna.tlb.office2.LineFormat}
     */
    @ComProperty(name = "BeginArrowheadStyle", dispId = 0x66)
    void setBeginArrowheadStyle(eu.doppel_helix.jna.tlb.office2.LineFormat param0);
            
    /**
     * <p>id(0x67)</p>
     * <p>vtableId(16)</p>
     */
    @ComProperty(name = "BeginArrowheadWidth", dispId = 0x67)
    eu.doppel_helix.jna.tlb.office2.LineFormat getBeginArrowheadWidth();
            
    /**
     * <p>id(0x67)</p>
     * <p>vtableId(17)</p>
     * @param param0 [in] {@code eu.doppel_helix.jna.tlb.office2.LineFormat}
     */
    @ComProperty(name = "BeginArrowheadWidth", dispId = 0x67)
    void setBeginArrowheadWidth(eu.doppel_helix.jna.tlb.office2.LineFormat param0);
            
    /**
     * <p>id(0x68)</p>
     * <p>vtableId(18)</p>
     */
    @ComProperty(name = "DashStyle", dispId = 0x68)
    eu.doppel_helix.jna.tlb.office2.LineFormat getDashStyle();
            
    /**
     * <p>id(0x68)</p>
     * <p>vtableId(19)</p>
     * @param param0 [in] {@code eu.doppel_helix.jna.tlb.office2.LineFormat}
     */
    @ComProperty(name = "DashStyle", dispId = 0x68)
    void setDashStyle(eu.doppel_helix.jna.tlb.office2.LineFormat param0);
            
    /**
     * <p>id(0x69)</p>
     * <p>vtableId(20)</p>
     */
    @ComProperty(name = "EndArrowheadLength", dispId = 0x69)
    eu.doppel_helix.jna.tlb.office2.LineFormat getEndArrowheadLength();
            
    /**
     * <p>id(0x69)</p>
     * <p>vtableId(21)</p>
     * @param param0 [in] {@code eu.doppel_helix.jna.tlb.office2.LineFormat}
     */
    @ComProperty(name = "EndArrowheadLength", dispId = 0x69)
    void setEndArrowheadLength(eu.doppel_helix.jna.tlb.office2.LineFormat param0);
            
    /**
     * <p>id(0x6a)</p>
     * <p>vtableId(22)</p>
     */
    @ComProperty(name = "EndArrowheadStyle", dispId = 0x6a)
    eu.doppel_helix.jna.tlb.office2.LineFormat getEndArrowheadStyle();
            
    /**
     * <p>id(0x6a)</p>
     * <p>vtableId(23)</p>
     * @param param0 [in] {@code eu.doppel_helix.jna.tlb.office2.LineFormat}
     */
    @ComProperty(name = "EndArrowheadStyle", dispId = 0x6a)
    void setEndArrowheadStyle(eu.doppel_helix.jna.tlb.office2.LineFormat param0);
            
    /**
     * <p>id(0x6b)</p>
     * <p>vtableId(24)</p>
     */
    @ComProperty(name = "EndArrowheadWidth", dispId = 0x6b)
    eu.doppel_helix.jna.tlb.office2.LineFormat getEndArrowheadWidth();
            
    /**
     * <p>id(0x6b)</p>
     * <p>vtableId(25)</p>
     * @param param0 [in] {@code eu.doppel_helix.jna.tlb.office2.LineFormat}
     */
    @ComProperty(name = "EndArrowheadWidth", dispId = 0x6b)
    void setEndArrowheadWidth(eu.doppel_helix.jna.tlb.office2.LineFormat param0);
            
    /**
     * <p>id(0x6c)</p>
     * <p>vtableId(26)</p>
     */
    @ComProperty(name = "ForeColor", dispId = 0x6c)
    eu.doppel_helix.jna.tlb.office2.LineFormat getForeColor();
            
    /**
     * <p>id(0x6c)</p>
     * <p>vtableId(27)</p>
     * @param param0 [in] {@code eu.doppel_helix.jna.tlb.office2.LineFormat}
     */
    @ComProperty(name = "ForeColor", dispId = 0x6c)
    void setForeColor(eu.doppel_helix.jna.tlb.office2.LineFormat param0);
            
    /**
     * <p>id(0x6d)</p>
     * <p>vtableId(28)</p>
     */
    @ComProperty(name = "Pattern", dispId = 0x6d)
    eu.doppel_helix.jna.tlb.office2.LineFormat getPattern();
            
    /**
     * <p>id(0x6d)</p>
     * <p>vtableId(29)</p>
     * @param param0 [in] {@code eu.doppel_helix.jna.tlb.office2.LineFormat}
     */
    @ComProperty(name = "Pattern", dispId = 0x6d)
    void setPattern(eu.doppel_helix.jna.tlb.office2.LineFormat param0);
            
    /**
     * <p>id(0x6e)</p>
     * <p>vtableId(30)</p>
     */
    @ComProperty(name = "Style", dispId = 0x6e)
    eu.doppel_helix.jna.tlb.office2.LineFormat getStyle();
            
    /**
     * <p>id(0x6e)</p>
     * <p>vtableId(31)</p>
     * @param param0 [in] {@code eu.doppel_helix.jna.tlb.office2.LineFormat}
     */
    @ComProperty(name = "Style", dispId = 0x6e)
    void setStyle(eu.doppel_helix.jna.tlb.office2.LineFormat param0);
            
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
    @ComProperty(name = "Visible", dispId = 0x70)
    eu.doppel_helix.jna.tlb.office2.LineFormat getVisible();
            
    /**
     * <p>id(0x70)</p>
     * <p>vtableId(35)</p>
     * @param param0 [in] {@code eu.doppel_helix.jna.tlb.office2.LineFormat}
     */
    @ComProperty(name = "Visible", dispId = 0x70)
    void setVisible(eu.doppel_helix.jna.tlb.office2.LineFormat param0);
            
    /**
     * <p>id(0x71)</p>
     * <p>vtableId(36)</p>
     */
    @ComProperty(name = "Weight", dispId = 0x71)
    Float getWeight();
            
    /**
     * <p>id(0x71)</p>
     * <p>vtableId(37)</p>
     * @param param0 [in] {@code Float}
     */
    @ComProperty(name = "Weight", dispId = 0x71)
    void setWeight(Float param0);
            
    /**
     * <p>id(0x72)</p>
     * <p>vtableId(38)</p>
     */
    @ComProperty(name = "InsetPen", dispId = 0x72)
    eu.doppel_helix.jna.tlb.office2.LineFormat getInsetPen();
            
    /**
     * <p>id(0x72)</p>
     * <p>vtableId(39)</p>
     * @param param0 [in] {@code eu.doppel_helix.jna.tlb.office2.LineFormat}
     */
    @ComProperty(name = "InsetPen", dispId = 0x72)
    void setInsetPen(eu.doppel_helix.jna.tlb.office2.LineFormat param0);
            
    
}