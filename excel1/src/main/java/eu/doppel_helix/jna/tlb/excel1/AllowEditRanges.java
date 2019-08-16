
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({0002446A-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{0002446A-0000-0000-C000-000000000046}")
public interface AllowEditRanges extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x76)</p>
     * <p>vtableId(7)</p>
     */
    @ComProperty(name = "Count", dispId = 0x76)
    Integer getCount();
            
    /**
     * <p>id(0xaa)</p>
     * <p>vtableId(8)</p>
     * @param Index [in] {@code Object}
     */
    @ComProperty(name = "Item", dispId = 0xaa)
    AllowEditRange getItem(Object Index);
            
    /**
     * <p>id(0xb5)</p>
     * <p>vtableId(9)</p>
     * @param Title [in] {@code String}
     * @param Range [in] {@code Range}
     * @param Password [in, optional] {@code Object}
     */
    @ComMethod(name = "Add", dispId = 0xb5)
    AllowEditRange Add(String Title,
            Range Range,
            Object Password);
            
    /**
     * <p>id(0x0)</p>
     * <p>vtableId(10)</p>
     * @param Index [in] {@code Object}
     */
    @ComProperty(name = "_Default", dispId = 0x0)
    AllowEditRange get_Default(Object Index);
            
    
}