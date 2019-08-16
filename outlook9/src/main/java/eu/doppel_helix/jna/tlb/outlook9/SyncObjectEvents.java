
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00063085-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{00063085-0000-0000-C000-000000000046}")
public interface SyncObjectEvents extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0xf001)</p>
     */
    @ComMethod(name = "SyncStart", dispId = 0xf001)
    void SyncStart();
            
    /**
     * <p>id(0xf002)</p>
     * @param State [in] {@code OlSyncState}
     * @param Description [in] {@code String}
     * @param Value [in] {@code Integer}
     * @param Max [in] {@code Integer}
     */
    @ComMethod(name = "Progress", dispId = 0xf002)
    void Progress(OlSyncState State,
            String Description,
            Integer Value,
            Integer Max);
            
    /**
     * <p>id(0xf003)</p>
     * @param Code [in] {@code Integer}
     * @param Description [in] {@code String}
     */
    @ComMethod(name = "OnError", dispId = 0xf003)
    void OnError(Integer Code,
            String Description);
            
    /**
     * <p>id(0xf004)</p>
     */
    @ComMethod(name = "SyncEnd", dispId = 0xf004)
    void SyncEnd();
            
    
}