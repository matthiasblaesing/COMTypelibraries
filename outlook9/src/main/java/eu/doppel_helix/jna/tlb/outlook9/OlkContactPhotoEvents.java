
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000672EC-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000672EC-0000-0000-C000-000000000046}")
public interface OlkContactPhotoEvents extends IUnknown, IRawDispatchHandle, IDispatch {
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
     * @param Button [in] {@code OlMouseButton}
     * @param Shift [in] {@code OlShiftState}
     * @param X [in] {@code Float}
     * @param Y [in] {@code Float}
     */
    @ComMethod(name = "MouseDown", dispId = 0xfffffda3)
    void MouseDown(OlMouseButton Button,
            OlShiftState Shift,
            Float X,
            Float Y);
            
    /**
     * <p>id(0xfffffda2)</p>
     * @param Button [in] {@code OlMouseButton}
     * @param Shift [in] {@code OlShiftState}
     * @param X [in] {@code Float}
     * @param Y [in] {@code Float}
     */
    @ComMethod(name = "MouseMove", dispId = 0xfffffda2)
    void MouseMove(OlMouseButton Button,
            OlShiftState Shift,
            Float X,
            Float Y);
            
    /**
     * <p>id(0xfffffda1)</p>
     * @param Button [in] {@code OlMouseButton}
     * @param Shift [in] {@code OlShiftState}
     * @param X [in] {@code Float}
     * @param Y [in] {@code Float}
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
     * @param Cancel [in] {@code Boolean}
     */
    @ComMethod(name = "Exit", dispId = 0x80018203)
    void Exit(Boolean Cancel);
            
    /**
     * <p>id(0xfffffda6)</p>
     * @param KeyCode [in] {@code Integer}
     * @param Shift [in] {@code OlShiftState}
     */
    @ComMethod(name = "KeyDown", dispId = 0xfffffda6)
    void KeyDown(Integer KeyCode,
            OlShiftState Shift);
            
    /**
     * <p>id(0xfffffda5)</p>
     * @param KeyAscii [in] {@code Integer}
     */
    @ComMethod(name = "KeyPress", dispId = 0xfffffda5)
    void KeyPress(Integer KeyAscii);
            
    /**
     * <p>id(0xfffffda4)</p>
     * @param KeyCode [in] {@code Integer}
     * @param Shift [in] {@code OlShiftState}
     */
    @ComMethod(name = "KeyUp", dispId = 0xfffffda4)
    void KeyUp(Integer KeyCode,
            OlShiftState Shift);
            
    /**
     * <p>id(0x2)</p>
     */
    @ComMethod(name = "Change", dispId = 0x2)
    void Change();
            
    
}