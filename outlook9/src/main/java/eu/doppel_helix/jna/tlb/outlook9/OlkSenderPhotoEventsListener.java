
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.util.annotation.ComEventCallback;
import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00067356-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{00067356-0000-0000-C000-000000000046}")
public interface OlkSenderPhotoEventsListener {
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
     * <p>id(0x2)</p>
     */
    @ComEventCallback(dispid = 0x2)
    void Change();
            
    
}