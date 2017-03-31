
package eu.doppel_helix.jna.tlb.wbemdisp1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * Asynchronous operation control
 *
 * <p>uuid({75718C9F-F029-11D1-A1AC-00C04FB6C223})</p>
 */
@ComInterface(iid="{75718C9F-F029-11D1-A1AC-00C04FB6C223}")
public interface ISWbemSink extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * Cancel an asynchronous operation
     *
     * <p>id(0x1)</p>
     * <p>vtableId(7)</p>
     */
    @ComMethod(name = "Cancel", dispId = 0x1)
    void Cancel();
            
    
}