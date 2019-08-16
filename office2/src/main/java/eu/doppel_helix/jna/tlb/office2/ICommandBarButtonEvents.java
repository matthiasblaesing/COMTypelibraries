
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({55F88890-7708-11D1-ACEB-006008961DA5})</p>
 */
@ComInterface(iid="{55F88890-7708-11D1-ACEB-006008961DA5}")
public interface ICommandBarButtonEvents extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x1)</p>
     * <p>vtableId(7)</p>
     * @param Ctrl [in] {@code CommandBarButton}
     * @param CancelDefault [inout] {@code Boolean}
     */
    @ComMethod(name = "Click", dispId = 0x1)
    void Click(CommandBarButton Ctrl,
            VARIANT CancelDefault);
            
    
}