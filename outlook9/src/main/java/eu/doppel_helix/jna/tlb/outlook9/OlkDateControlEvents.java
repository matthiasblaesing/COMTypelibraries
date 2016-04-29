
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000672FB-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000672FB-0000-0000-C000-000000000046}")
public interface OlkDateControlEvents {
    /**
     * <p>id(0xfffffda8)</p>
     */
    @ComMethod(name = "Click", dispId = 0xfffffda8)
    void Click();
            
    /**
     * <p>id(0xfffffda7)</p>
     */
    @ComMethod(name = "DoubleClick", dispId = 0xfffffda7)
    void DoubleClick();
            
    /**
     * <p>id(0xfffffda3)</p>
     */
    @ComMethod(name = "MouseDown", dispId = 0xfffffda3)
    void MouseDown(OlMouseButton Button,
            OlShiftState Shift,
            Float X,
            Float Y);
            
    /**
     * <p>id(0xfffffda2)</p>
     */
    @ComMethod(name = "MouseMove", dispId = 0xfffffda2)
    void MouseMove(OlMouseButton Button,
            OlShiftState Shift,
            Float X,
            Float Y);
            
    /**
     * <p>id(0xfffffda1)</p>
     */
    @ComMethod(name = "MouseUp", dispId = 0xfffffda1)
    void MouseUp(OlMouseButton Button,
            OlShiftState Shift,
            Float X,
            Float Y);
            
    /**
     * <p>id(0x80018202)</p>
     */
    @ComMethod(name = "Enter", dispId = 0x80018202)
    void Enter();
            
    /**
     * <p>id(0x80018203)</p>
     */
    @ComMethod(name = "Exit", dispId = 0x80018203)
    void Exit(Boolean Cancel);
            
    /**
     * <p>id(0xfffffda6)</p>
     */
    @ComMethod(name = "KeyDown", dispId = 0xfffffda6)
    void KeyDown(Integer KeyCode,
            OlShiftState Shift);
            
    /**
     * <p>id(0xfffffda5)</p>
     */
    @ComMethod(name = "KeyPress", dispId = 0xfffffda5)
    void KeyPress(Integer KeyAscii);
            
    /**
     * <p>id(0xfffffda4)</p>
     */
    @ComMethod(name = "KeyUp", dispId = 0xfffffda4)
    void KeyUp(Integer KeyCode,
            OlShiftState Shift);
            
    /**
     * <p>id(0x2)</p>
     */
    @ComMethod(name = "Change", dispId = 0x2)
    void Change();
            
    /**
     * <p>id(0x7d2)</p>
     */
    @ComMethod(name = "DropButtonClick", dispId = 0x7d2)
    void DropButtonClick();
            
    /**
     * <p>id(0x80018200)</p>
     */
    @ComMethod(name = "AfterUpdate", dispId = 0x80018200)
    void AfterUpdate();
            
    /**
     * <p>id(0x80018201)</p>
     */
    @ComMethod(name = "BeforeUpdate", dispId = 0x80018201)
    void BeforeUpdate(Boolean Cancel);
            
    
}