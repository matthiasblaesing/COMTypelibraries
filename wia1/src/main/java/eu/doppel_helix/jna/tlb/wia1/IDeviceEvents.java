
package eu.doppel_helix.jna.tlb.wia1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({03985C95-581B-44D1-9403-8488B347538B})</p>
 */
@ComInterface(iid="{03985C95-581B-44D1-9403-8488B347538B}")
public interface IDeviceEvents extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * Returns the specified item in the collection by position
     *
     * <p>id(0x0)</p>
     */
    @ComProperty(name = "Item", dispId = 0x0)
    IDeviceEvent getItem(Integer Index);
            
    /**
     * Returns the number of members in the collection
     *
     * <p>id(0x1)</p>
     */
    @ComProperty(name = "Count", dispId = 0x1)
    Integer getCount();
            
    
}