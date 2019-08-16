
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00067356-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{00067356-0000-0000-C000-000000000046}")
public interface OlkSenderPhotoEvents extends IUnknown, IRawDispatchHandle, IDispatch {
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
     * <p>id(0x2)</p>
     */
    @ComMethod(name = "Change", dispId = 0x2)
    void Change();
            
    
}