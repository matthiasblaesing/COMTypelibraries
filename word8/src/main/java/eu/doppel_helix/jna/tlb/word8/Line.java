
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({AE6CE2F5-B9D3-407D-85A8-0F10C63289A4})</p>
 */
@ComInterface(iid="{AE6CE2F5-B9D3-407D-85A8-0F10C63289A4}")
public interface Line extends IUnknown, IRawDispatchHandle, IDispatch {
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
     * <p>id(0x3ea)</p>
     * <p>vtableId(9)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x3ea)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * <p>id(0x2)</p>
     * <p>vtableId(10)</p>
     */
    @ComProperty(name = "LineType", dispId = 0x2)
    WdLineType getLineType();
            
    /**
     * <p>id(0x3)</p>
     * <p>vtableId(11)</p>
     */
    @ComProperty(name = "Left", dispId = 0x3)
    Integer getLeft();
            
    /**
     * <p>id(0x4)</p>
     * <p>vtableId(12)</p>
     */
    @ComProperty(name = "Top", dispId = 0x4)
    Integer getTop();
            
    /**
     * <p>id(0x5)</p>
     * <p>vtableId(13)</p>
     */
    @ComProperty(name = "Width", dispId = 0x5)
    Integer getWidth();
            
    /**
     * <p>id(0x6)</p>
     * <p>vtableId(14)</p>
     */
    @ComProperty(name = "Height", dispId = 0x6)
    Integer getHeight();
            
    /**
     * <p>id(0x7)</p>
     * <p>vtableId(15)</p>
     */
    @ComProperty(name = "Range", dispId = 0x7)
    Range getRange();
            
    /**
     * <p>id(0x8)</p>
     * <p>vtableId(16)</p>
     */
    @ComProperty(name = "Rectangles", dispId = 0x8)
    Rectangles getRectangles();
            
    
}