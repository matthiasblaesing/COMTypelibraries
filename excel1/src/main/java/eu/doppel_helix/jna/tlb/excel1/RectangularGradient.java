
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000244B0-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000244B0-0000-0000-C000-000000000046}")
public interface RectangularGradient extends IUnknown, IRawDispatchHandle, IDispatch {
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
     * <p>id(0xac9)</p>
     * <p>vtableId(10)</p>
     */
    @ComProperty(name = "ColorStops", dispId = 0xac9)
    ColorStops getColorStops();
            
    /**
     * <p>id(0xaca)</p>
     * <p>vtableId(11)</p>
     */
    @ComProperty(name = "RectangleTop", dispId = 0xaca)
    Double getRectangleTop();
            
    /**
     * <p>id(0xaca)</p>
     * <p>vtableId(12)</p>
     * @param param0 [in] {@code Double}
     */
    @ComProperty(name = "RectangleTop", dispId = 0xaca)
    void setRectangleTop(Double param0);
            
    /**
     * <p>id(0xacb)</p>
     * <p>vtableId(13)</p>
     */
    @ComProperty(name = "RectangleBottom", dispId = 0xacb)
    Double getRectangleBottom();
            
    /**
     * <p>id(0xacb)</p>
     * <p>vtableId(14)</p>
     * @param param0 [in] {@code Double}
     */
    @ComProperty(name = "RectangleBottom", dispId = 0xacb)
    void setRectangleBottom(Double param0);
            
    /**
     * <p>id(0xacc)</p>
     * <p>vtableId(15)</p>
     */
    @ComProperty(name = "RectangleLeft", dispId = 0xacc)
    Double getRectangleLeft();
            
    /**
     * <p>id(0xacc)</p>
     * <p>vtableId(16)</p>
     * @param param0 [in] {@code Double}
     */
    @ComProperty(name = "RectangleLeft", dispId = 0xacc)
    void setRectangleLeft(Double param0);
            
    /**
     * <p>id(0xacd)</p>
     * <p>vtableId(17)</p>
     */
    @ComProperty(name = "RectangleRight", dispId = 0xacd)
    Double getRectangleRight();
            
    /**
     * <p>id(0xacd)</p>
     * <p>vtableId(18)</p>
     * @param param0 [in] {@code Double}
     */
    @ComProperty(name = "RectangleRight", dispId = 0xacd)
    void setRectangleRight(Double param0);
            
    
}