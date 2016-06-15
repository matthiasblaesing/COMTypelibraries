
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000C0338-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000C0338-0000-0000-C000-000000000046}")
public interface IFoundFiles extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x0)</p>
     */
    @ComProperty(name = "Item", dispId = 0x0)
    String getItem(Integer Index);
            
    /**
     * <p>id(0x60020001)</p>
     */
    @ComProperty(name = "Count", dispId = 0x60020001)
    Integer getCount();
            
    
}