
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000630F8-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000630F8-0000-0000-C000-000000000046}")
public interface StoresEvents_12 extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0xfbb1)</p>
     */
    @ComMethod(name = "BeforeStoreRemove", dispId = 0xfbb1)
    void BeforeStoreRemove(_Store Store,
            VARIANT Cancel);
            
    /**
     * <p>id(0xf001)</p>
     */
    @ComMethod(name = "StoreAdd", dispId = 0xf001)
    void StoreAdd(_Store Store);
            
    
}