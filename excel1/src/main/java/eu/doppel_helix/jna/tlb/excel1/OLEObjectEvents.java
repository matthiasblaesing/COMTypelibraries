
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00024410-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{00024410-0000-0000-C000-000000000046}")
public interface OLEObjectEvents extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x605)</p>
     * <p>vtableId(7)</p>
     */
    @ComMethod(name = "GotFocus", dispId = 0x605)
    void GotFocus();
            
    /**
     * <p>id(0x606)</p>
     * <p>vtableId(8)</p>
     */
    @ComMethod(name = "LostFocus", dispId = 0x606)
    void LostFocus();
            
    
}