
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000244A3-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000244A3-0000-0000-C000-000000000046}")
public interface Pages extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0xaa)</p>
     */
    @ComProperty(name = "Item", dispId = 0xaa)
    Page getItem(Object Index);
            
    /**
     * <p>id(0x0)</p>
     */
    @ComProperty(name = "_Default", dispId = 0x0)
    Page get_Default(Object Index);
            
    /**
     * <p>id(0x76)</p>
     */
    @ComProperty(name = "Count", dispId = 0x76)
    Integer getCount();
            
    
}