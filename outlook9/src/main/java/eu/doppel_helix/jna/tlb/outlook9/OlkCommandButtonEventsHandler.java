
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.util.AbstractComEventCallbackListener;
import com.sun.jna.platform.win32.COM.util.annotation.ComEventCallback;
import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000672E0-0000-0000-C000-000000000046})</p>
 */
public abstract class OlkCommandButtonEventsHandler extends AbstractComEventCallbackListener implements OlkCommandButtonEvents {
    @Override
    public void errorReceivingCallbackEvent(java.lang.String string, java.lang.Exception excptn) {
    }

    /**
     * <p>id(0xfffffda8)</p>
     */
    @Override
    public void Click(){
    }
            
    /**
     * <p>id(0xfffffda7)</p>
     */
    @Override
    public void DoubleClick(){
    }
            
    /**
     * <p>id(0xfffffda3)</p>
     */
    @Override
    public void MouseDown(OlMouseButton Button,
            OlShiftState Shift,
            Float X,
            Float Y){
    }
            
    /**
     * <p>id(0xfffffda2)</p>
     */
    @Override
    public void MouseMove(OlMouseButton Button,
            OlShiftState Shift,
            Float X,
            Float Y){
    }
            
    /**
     * <p>id(0xfffffda1)</p>
     */
    @Override
    public void MouseUp(OlMouseButton Button,
            OlShiftState Shift,
            Float X,
            Float Y){
    }
            
    /**
     * <p>id(0x80018202)</p>
     */
    @Override
    public void Enter(){
    }
            
    /**
     * <p>id(0x80018203)</p>
     */
    @Override
    public void Exit(Boolean Cancel){
    }
            
    /**
     * <p>id(0xfffffda6)</p>
     */
    @Override
    public void KeyDown(Integer KeyCode,
            OlShiftState Shift){
    }
            
    /**
     * <p>id(0xfffffda5)</p>
     */
    @Override
    public void KeyPress(Integer KeyAscii){
    }
            
    /**
     * <p>id(0xfffffda4)</p>
     */
    @Override
    public void KeyUp(Integer KeyCode,
            OlShiftState Shift){
    }
            
    /**
     * <p>id(0x80018200)</p>
     */
    @Override
    public void AfterUpdate(){
    }
            
    /**
     * <p>id(0x80018201)</p>
     */
    @Override
    public void BeforeUpdate(Boolean Cancel){
    }
            
    
}