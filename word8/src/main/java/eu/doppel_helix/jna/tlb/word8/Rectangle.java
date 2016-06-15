
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({ADD4EDF3-2F33-4734-9CE6-D476097C5ADA})</p>
 */
@ComInterface(iid="{ADD4EDF3-2F33-4734-9CE6-D476097C5ADA}")
public interface Rectangle extends IUnknown, IRawDispatchHandle, IDispatch {
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
     * <p>id(0x3ea)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x3ea)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * <p>id(0x2)</p>
     */
    @ComProperty(name = "RectangleType", dispId = 0x2)
    WdRectangleType getRectangleType();
            
    /**
     * <p>id(0x3)</p>
     */
    @ComProperty(name = "Left", dispId = 0x3)
    Integer getLeft();
            
    /**
     * <p>id(0x4)</p>
     */
    @ComProperty(name = "Top", dispId = 0x4)
    Integer getTop();
            
    /**
     * <p>id(0x5)</p>
     */
    @ComProperty(name = "Width", dispId = 0x5)
    Integer getWidth();
            
    /**
     * <p>id(0x6)</p>
     */
    @ComProperty(name = "Height", dispId = 0x6)
    Integer getHeight();
            
    /**
     * <p>id(0x7)</p>
     */
    @ComProperty(name = "Range", dispId = 0x7)
    Range getRange();
            
    /**
     * <p>id(0x8)</p>
     */
    @ComProperty(name = "Lines", dispId = 0x8)
    Lines getLines();
            
    
}