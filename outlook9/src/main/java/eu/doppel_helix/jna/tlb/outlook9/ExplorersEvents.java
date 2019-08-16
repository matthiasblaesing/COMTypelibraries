
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00063078-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{00063078-0000-0000-C000-000000000046}")
public interface ExplorersEvents extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0xf001)</p>
     * @param Explorer [in] {@code _Explorer}
     */
    @ComMethod(name = "NewExplorer", dispId = 0xf001)
    void NewExplorer(_Explorer Explorer);
            
    
}