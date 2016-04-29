
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComEventCallback;
import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({0002440F-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{0002440F-0000-0000-C000-000000000046}")
public interface ChartEventsListener {
    /**
     * <p>id(0x130)</p>
     */
    @ComEventCallback(dispid = 0x130)
    void Activate();
            
    /**
     * <p>id(0x5fa)</p>
     */
    @ComEventCallback(dispid = 0x5fa)
    void Deactivate();
            
    /**
     * <p>id(0x100)</p>
     */
    @ComEventCallback(dispid = 0x100)
    void Resize();
            
    /**
     * <p>id(0x5fb)</p>
     */
    @ComEventCallback(dispid = 0x5fb)
    void MouseDown(Integer Button,
            Integer Shift,
            Integer x,
            Integer y);
            
    /**
     * <p>id(0x5fc)</p>
     */
    @ComEventCallback(dispid = 0x5fc)
    void MouseUp(Integer Button,
            Integer Shift,
            Integer x,
            Integer y);
            
    /**
     * <p>id(0x5fd)</p>
     */
    @ComEventCallback(dispid = 0x5fd)
    void MouseMove(Integer Button,
            Integer Shift,
            Integer x,
            Integer y);
            
    /**
     * <p>id(0x5fe)</p>
     */
    @ComEventCallback(dispid = 0x5fe)
    void BeforeRightClick(VARIANT Cancel);
            
    /**
     * <p>id(0x5ff)</p>
     */
    @ComEventCallback(dispid = 0x5ff)
    void DragPlot();
            
    /**
     * <p>id(0x600)</p>
     */
    @ComEventCallback(dispid = 0x600)
    void DragOver();
            
    /**
     * <p>id(0x601)</p>
     */
    @ComEventCallback(dispid = 0x601)
    void BeforeDoubleClick(Integer ElementID,
            Integer Arg1,
            Integer Arg2,
            VARIANT Cancel);
            
    /**
     * <p>id(0xeb)</p>
     */
    @ComEventCallback(dispid = 0xeb)
    void Select(Integer ElementID,
            Integer Arg1,
            Integer Arg2);
            
    /**
     * <p>id(0x602)</p>
     */
    @ComEventCallback(dispid = 0x602)
    void SeriesChange(Integer SeriesIndex,
            Integer PointIndex);
            
    /**
     * <p>id(0x117)</p>
     */
    @ComEventCallback(dispid = 0x117)
    void Calculate();
            
    
}