
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000C03D3-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000C03D3-0000-0000-C000-000000000046}")
public interface Crop extends IUnknown, IRawDispatchHandle, IDispatch {
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
     * <p>id(0x0)</p>
     * <p>vtableId(9)</p>
     */
    @ComProperty(name = "PictureOffsetX", dispId = 0x0)
    Float getPictureOffsetX();
            
    /**
     * <p>id(0x0)</p>
     * <p>vtableId(10)</p>
     * @param param0 [in] {@code Float}
     */
    @ComProperty(name = "PictureOffsetX", dispId = 0x0)
    void setPictureOffsetX(Float param0);
            
    /**
     * <p>id(0x1)</p>
     * <p>vtableId(11)</p>
     */
    @ComProperty(name = "PictureOffsetY", dispId = 0x1)
    Float getPictureOffsetY();
            
    /**
     * <p>id(0x1)</p>
     * <p>vtableId(12)</p>
     * @param param0 [in] {@code Float}
     */
    @ComProperty(name = "PictureOffsetY", dispId = 0x1)
    void setPictureOffsetY(Float param0);
            
    /**
     * <p>id(0x2)</p>
     * <p>vtableId(13)</p>
     */
    @ComProperty(name = "PictureWidth", dispId = 0x2)
    Float getPictureWidth();
            
    /**
     * <p>id(0x2)</p>
     * <p>vtableId(14)</p>
     * @param param0 [in] {@code Float}
     */
    @ComProperty(name = "PictureWidth", dispId = 0x2)
    void setPictureWidth(Float param0);
            
    /**
     * <p>id(0x3)</p>
     * <p>vtableId(15)</p>
     */
    @ComProperty(name = "PictureHeight", dispId = 0x3)
    Float getPictureHeight();
            
    /**
     * <p>id(0x3)</p>
     * <p>vtableId(16)</p>
     * @param param0 [in] {@code Float}
     */
    @ComProperty(name = "PictureHeight", dispId = 0x3)
    void setPictureHeight(Float param0);
            
    /**
     * <p>id(0x5)</p>
     * <p>vtableId(17)</p>
     */
    @ComProperty(name = "ShapeLeft", dispId = 0x5)
    Float getShapeLeft();
            
    /**
     * <p>id(0x5)</p>
     * <p>vtableId(18)</p>
     * @param param0 [in] {@code Float}
     */
    @ComProperty(name = "ShapeLeft", dispId = 0x5)
    void setShapeLeft(Float param0);
            
    /**
     * <p>id(0x6)</p>
     * <p>vtableId(19)</p>
     */
    @ComProperty(name = "ShapeTop", dispId = 0x6)
    Float getShapeTop();
            
    /**
     * <p>id(0x6)</p>
     * <p>vtableId(20)</p>
     * @param param0 [in] {@code Float}
     */
    @ComProperty(name = "ShapeTop", dispId = 0x6)
    void setShapeTop(Float param0);
            
    /**
     * <p>id(0x7)</p>
     * <p>vtableId(21)</p>
     */
    @ComProperty(name = "ShapeWidth", dispId = 0x7)
    Float getShapeWidth();
            
    /**
     * <p>id(0x7)</p>
     * <p>vtableId(22)</p>
     * @param param0 [in] {@code Float}
     */
    @ComProperty(name = "ShapeWidth", dispId = 0x7)
    void setShapeWidth(Float param0);
            
    /**
     * <p>id(0x8)</p>
     * <p>vtableId(23)</p>
     */
    @ComProperty(name = "ShapeHeight", dispId = 0x8)
    Float getShapeHeight();
            
    /**
     * <p>id(0x8)</p>
     * <p>vtableId(24)</p>
     * @param param0 [in] {@code Float}
     */
    @ComProperty(name = "ShapeHeight", dispId = 0x8)
    void setShapeHeight(Float param0);
            
    
}