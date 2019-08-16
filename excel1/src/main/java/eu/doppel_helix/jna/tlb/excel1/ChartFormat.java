
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000244B2-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000244B2-0000-0000-C000-000000000046}")
public interface ChartFormat extends IUnknown, IRawDispatchHandle, IDispatch {
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
     * <p>id(0x67f)</p>
     * <p>vtableId(10)</p>
     */
    @ComProperty(name = "Fill", dispId = 0x67f)
    eu.doppel_helix.jna.tlb.office2.FillFormat getFill();
            
    /**
     * <p>id(0xa67)</p>
     * <p>vtableId(11)</p>
     */
    @ComProperty(name = "Glow", dispId = 0xa67)
    eu.doppel_helix.jna.tlb.office2.GlowFormat getGlow();
            
    /**
     * <p>id(0x331)</p>
     * <p>vtableId(12)</p>
     */
    @ComProperty(name = "Line", dispId = 0x331)
    eu.doppel_helix.jna.tlb.office2.LineFormat getLine();
            
    /**
     * <p>id(0x65f)</p>
     * <p>vtableId(13)</p>
     */
    @ComProperty(name = "PictureFormat", dispId = 0x65f)
    eu.doppel_helix.jna.tlb.office2.PictureFormat getPictureFormat();
            
    /**
     * <p>id(0x67)</p>
     * <p>vtableId(14)</p>
     */
    @ComProperty(name = "Shadow", dispId = 0x67)
    eu.doppel_helix.jna.tlb.office2.ShadowFormat getShadow();
            
    /**
     * <p>id(0xa66)</p>
     * <p>vtableId(15)</p>
     */
    @ComProperty(name = "SoftEdge", dispId = 0xa66)
    eu.doppel_helix.jna.tlb.office2.SoftEdgeFormat getSoftEdge();
            
    /**
     * <p>id(0xa63)</p>
     * <p>vtableId(16)</p>
     */
    @ComProperty(name = "TextFrame2", dispId = 0xa63)
    eu.doppel_helix.jna.tlb.office2.TextFrame2 getTextFrame2();
            
    /**
     * <p>id(0x6a7)</p>
     * <p>vtableId(17)</p>
     */
    @ComProperty(name = "ThreeD", dispId = 0x6a7)
    eu.doppel_helix.jna.tlb.office2.ThreeDFormat getThreeD();
            
    /**
     * <p>id(0x69b)</p>
     * <p>vtableId(18)</p>
     */
    @ComProperty(name = "Adjustments", dispId = 0x69b)
    eu.doppel_helix.jna.tlb.office2.Adjustments getAdjustments();
            
    /**
     * <p>id(0x69d)</p>
     * <p>vtableId(19)</p>
     */
    @ComProperty(name = "AutoShapeType", dispId = 0x69d)
    eu.doppel_helix.jna.tlb.office2.MsoAutoShapeType getAutoShapeType();
            
    /**
     * <p>id(0x69d)</p>
     * <p>vtableId(20)</p>
     * @param param0 [in] {@code eu.doppel_helix.jna.tlb.office2.MsoAutoShapeType}
     */
    @ComProperty(name = "AutoShapeType", dispId = 0x69d)
    void setAutoShapeType(eu.doppel_helix.jna.tlb.office2.MsoAutoShapeType param0);
            
    
}