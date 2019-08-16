
package eu.doppel_helix.jna.tlb.vbide5;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({0002E131-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{0002E131-0000-0000-C000-000000000046}")
public interface _dispCommandBarControlEvents extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x1)</p>
     * @param CommandBarControl [in] {@code com.sun.jna.platform.win32.COM.util.IDispatch}
     * @param handled [in] {@code Boolean}
     * @param CancelDefault [in] {@code Boolean}
     */
    @ComMethod(name = "Click", dispId = 0x1)
    void Click(com.sun.jna.platform.win32.COM.util.IDispatch CommandBarControl,
            Boolean handled,
            Boolean CancelDefault);
            
    
}