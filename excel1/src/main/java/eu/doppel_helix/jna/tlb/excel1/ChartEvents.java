
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({0002440F-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{0002440F-0000-0000-C000-000000000046}")
public interface ChartEvents {
    /**
     * <p>id(0x130)</p>
     */
    @ComMethod(name = "Activate", dispId = 0x130)
    void Activate();
            
    /**
     * <p>id(0x5fa)</p>
     */
    @ComMethod(name = "Deactivate", dispId = 0x5fa)
    void Deactivate();
            
    /**
     * <p>id(0x100)</p>
     */
    @ComMethod(name = "Resize", dispId = 0x100)
    void Resize();
            
    /**
     * <p>id(0x5fb)</p>
     */
    @ComMethod(name = "MouseDown", dispId = 0x5fb)
    void MouseDown(Integer Button,
            Integer Shift,
            Integer x,
            Integer y);
            
    /**
     * <p>id(0x5fc)</p>
     */
    @ComMethod(name = "MouseUp", dispId = 0x5fc)
    void MouseUp(Integer Button,
            Integer Shift,
            Integer x,
            Integer y);
            
    /**
     * <p>id(0x5fd)</p>
     */
    @ComMethod(name = "MouseMove", dispId = 0x5fd)
    void MouseMove(Integer Button,
            Integer Shift,
            Integer x,
            Integer y);
            
    /**
     * <p>id(0x5fe)</p>
     */
    @ComMethod(name = "BeforeRightClick", dispId = 0x5fe)
    void BeforeRightClick(VARIANT Cancel);
            
    /**
     * <p>id(0x5ff)</p>
     */
    @ComMethod(name = "DragPlot", dispId = 0x5ff)
    void DragPlot();
            
    /**
     * <p>id(0x600)</p>
     */
    @ComMethod(name = "DragOver", dispId = 0x600)
    void DragOver();
            
    /**
     * <p>id(0x601)</p>
     */
    @ComMethod(name = "BeforeDoubleClick", dispId = 0x601)
    void BeforeDoubleClick(Integer ElementID,
            Integer Arg1,
            Integer Arg2,
            VARIANT Cancel);
            
    /**
     * <p>id(0xeb)</p>
     */
    @ComMethod(name = "Select", dispId = 0xeb)
    void Select(Integer ElementID,
            Integer Arg1,
            Integer Arg2);
            
    /**
     * <p>id(0x602)</p>
     */
    @ComMethod(name = "SeriesChange", dispId = 0x602)
    void SeriesChange(Integer SeriesIndex,
            Integer PointIndex);
            
    /**
     * <p>id(0x117)</p>
     */
    @ComMethod(name = "Calculate", dispId = 0x117)
    void Calculate();
            
    
}