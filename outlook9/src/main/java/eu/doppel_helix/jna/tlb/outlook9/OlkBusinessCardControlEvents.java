
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000672EE-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000672EE-0000-0000-C000-000000000046}")
public interface OlkBusinessCardControlEvents extends IUnknown, IRawDispatchHandle, IDispatch {
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
            
    
}