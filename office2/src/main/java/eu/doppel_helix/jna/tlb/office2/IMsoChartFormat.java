
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000C1730-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000C1730-0000-0000-C000-000000000046}")
public interface IMsoChartFormat extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x60020000)</p>
     */
    @ComProperty(name = "Fill", dispId = 0x60020000)
    FillFormat getFill();
            
    /**
     * <p>id(0x60020001)</p>
     */
    @ComProperty(name = "Glow", dispId = 0x60020001)
    GlowFormat getGlow();
            
    /**
     * <p>id(0x60020002)</p>
     */
    @ComProperty(name = "Line", dispId = 0x60020002)
    LineFormat getLine();
            
    /**
     * <p>id(0x60020003)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x60020003)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * <p>id(0x60020004)</p>
     */
    @ComProperty(name = "PictureFormat", dispId = 0x60020004)
    PictureFormat getPictureFormat();
            
    /**
     * <p>id(0x60020005)</p>
     */
    @ComProperty(name = "Shadow", dispId = 0x60020005)
    ShadowFormat getShadow();
            
    /**
     * <p>id(0x60020006)</p>
     */
    @ComProperty(name = "SoftEdge", dispId = 0x60020006)
    SoftEdgeFormat getSoftEdge();
            
    /**
     * <p>id(0x60020007)</p>
     */
    @ComProperty(name = "TextFrame2", dispId = 0x60020007)
    TextFrame2 getTextFrame2();
            
    /**
     * <p>id(0x60020008)</p>
     */
    @ComProperty(name = "ThreeD", dispId = 0x60020008)
    ThreeDFormat getThreeD();
            
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
     * <p>id(0xc8)</p>
     */
    @ComProperty(name = "Adjustments", dispId = 0xc8)
    Adjustments getAdjustments();
            
    /**
     * <p>id(0xc9)</p>
     */
    @ComProperty(name = "AutoShapeType", dispId = 0xc9)
    MsoAutoShapeType getAutoShapeType();
            
    /**
     * <p>id(0xc9)</p>
     */
    @ComProperty(name = "AutoShapeType", dispId = 0xc9)
    void setAutoShapeType(MsoAutoShapeType param0);
            
    
}