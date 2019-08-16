
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00063077-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{00063077-0000-0000-C000-000000000046}")
public interface ItemsEvents extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0xf001)</p>
     * @param Item [in] {@code com.sun.jna.platform.win32.COM.util.IDispatch}
     */
    @ComMethod(name = "ItemAdd", dispId = 0xf001)
    void ItemAdd(com.sun.jna.platform.win32.COM.util.IDispatch Item);
            
    /**
     * <p>id(0xf002)</p>
     * @param Item [in] {@code com.sun.jna.platform.win32.COM.util.IDispatch}
     */
    @ComMethod(name = "ItemChange", dispId = 0xf002)
    void ItemChange(com.sun.jna.platform.win32.COM.util.IDispatch Item);
            
    /**
     * <p>id(0xf003)</p>
     */
    @ComMethod(name = "ItemRemove", dispId = 0xf003)
    void ItemRemove();
            
    
}