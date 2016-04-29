
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.util.annotation.ComEventCallback;
import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000672EC-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000672EC-0000-0000-C000-000000000046}")
public interface OlkContactPhotoEventsListener {
    /**
     * <p>id(0xfffffda8)</p>
     */
    @ComEventCallback(dispid = 0xfffffda8)
    void Click();
            
    /**
     * <p>id(0xfffffda7)</p>
     */
    @ComEventCallback(dispid = 0xfffffda7)
    void DoubleClick();
            
    /**
     * <p>id(0xfffffda3)</p>
     */
    @ComEventCallback(dispid = 0xfffffda3)
    void MouseDown(OlMouseButton Button,
            OlShiftState Shift,
            Float X,
            Float Y);
            
    /**
     * <p>id(0xfffffda2)</p>
     */
    @ComEventCallback(dispid = 0xfffffda2)
    void MouseMove(OlMouseButton Button,
            OlShiftState Shift,
            Float X,
            Float Y);
            
    /**
     * <p>id(0xfffffda1)</p>
     */
    @ComEventCallback(dispid = 0xfffffda1)
    void MouseUp(OlMouseButton Button,
            OlShiftState Shift,
            Float X,
            Float Y);
            
    /**
     * <p>id(0x80018202)</p>
     */
    @ComEventCallback(dispid = 0x80018202)
    void Enter();
            
    /**
     * <p>id(0x80018203)</p>
     */
    @ComEventCallback(dispid = 0x80018203)
    void Exit(Boolean Cancel);
            
    /**
     * <p>id(0xfffffda6)</p>
     */
    @ComEventCallback(dispid = 0xfffffda6)
    void KeyDown(Integer KeyCode,
            OlShiftState Shift);
            
    /**
     * <p>id(0xfffffda5)</p>
     */
    @ComEventCallback(dispid = 0xfffffda5)
    void KeyPress(Integer KeyAscii);
            
    /**
     * <p>id(0xfffffda4)</p>
     */
    @ComEventCallback(dispid = 0xfffffda4)
    void KeyUp(Integer KeyCode,
            OlShiftState Shift);
            
    /**
     * <p>id(0x2)</p>
     */
    @ComEventCallback(dispid = 0x2)
    void Change();
            
    
}