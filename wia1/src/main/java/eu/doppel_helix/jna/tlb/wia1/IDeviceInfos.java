
package eu.doppel_helix.jna.tlb.wia1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({FE076B64-8406-4E92-9CAC-9093F378E05F})</p>
 */
@ComInterface(iid="{FE076B64-8406-4E92-9CAC-9093F378E05F}")
public interface IDeviceInfos extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * Returns the specified item in the collection either by position or Device ID
     *
     * <p>id(0x0)</p>
     * <p>vtableId(7)</p>
     * @param Index [in] {@code Object}
     */
    @ComProperty(name = "Item", dispId = 0x0)
    IDeviceInfo getItem(Object Index);
            
    /**
     * Returns the number of members in the collection
     *
     * <p>id(0x1)</p>
     * <p>vtableId(8)</p>
     */
    @ComProperty(name = "Count", dispId = 0x1)
    Integer getCount();
            
    
}