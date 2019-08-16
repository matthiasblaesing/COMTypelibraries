
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.AbstractComEventCallbackListener;
import com.sun.jna.platform.win32.COM.util.annotation.ComEventCallback;
import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({0002440F-0000-0000-C000-000000000046})</p>
 */
public abstract class ChartEventsHandler extends AbstractComEventCallbackListener implements ChartEvents {
    @Override
    public void errorReceivingCallbackEvent(java.lang.String string, java.lang.Exception excptn) {
    }

    /**
     * <p>id(0x130)</p>
     */
    @Override
    public void Activate(){
    }
            
    /**
     * <p>id(0x5fa)</p>
     */
    @Override
    public void Deactivate(){
    }
            
    /**
     * <p>id(0x100)</p>
     */
    @Override
    public void Resize(){
    }
            
    /**
     * <p>id(0x5fb)</p>
     */
    @Override
    public void MouseDown(Integer Button,
            Integer Shift,
            Integer x,
            Integer y){
    }
            
    /**
     * <p>id(0x5fc)</p>
     */
    @Override
    public void MouseUp(Integer Button,
            Integer Shift,
            Integer x,
            Integer y){
    }
            
    /**
     * <p>id(0x5fd)</p>
     */
    @Override
    public void MouseMove(Integer Button,
            Integer Shift,
            Integer x,
            Integer y){
    }
            
    /**
     * <p>id(0x5fe)</p>
     */
    @Override
    public void BeforeRightClick(VARIANT Cancel){
    }
            
    /**
     * <p>id(0x5ff)</p>
     */
    @Override
    public void DragPlot(){
    }
            
    /**
     * <p>id(0x600)</p>
     */
    @Override
    public void DragOver(){
    }
            
    /**
     * <p>id(0x601)</p>
     */
    @Override
    public void BeforeDoubleClick(Integer ElementID,
            Integer Arg1,
            Integer Arg2,
            VARIANT Cancel){
    }
            
    /**
     * <p>id(0xeb)</p>
     */
    @Override
    public void Select(Integer ElementID,
            Integer Arg1,
            Integer Arg2){
    }
            
    /**
     * <p>id(0x602)</p>
     */
    @Override
    public void SeriesChange(Integer SeriesIndex,
            Integer PointIndex){
    }
            
    /**
     * <p>id(0x117)</p>
     */
    @Override
    public void Calculate(){
    }
            
    
}