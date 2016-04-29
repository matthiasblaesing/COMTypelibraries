
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({0002446C-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{0002446C-0000-0000-C000-000000000046}")
public interface UserAccessList {
    /**
     * <p>id(0x76)</p>
     */
    @ComProperty(name = "Count", dispId = 0x76)
    Integer getCount();
            
    /**
     * <p>id(0xaa)</p>
     */
    @ComProperty(name = "Item", dispId = 0xaa)
    UserAccess getItem(Object Index);
            
    /**
     * <p>id(0xb5)</p>
     */
    @ComMethod(name = "Add", dispId = 0xb5)
    UserAccess Add(String Name,
            Boolean AllowEdit);
            
    /**
     * <p>id(0x8bf)</p>
     */
    @ComMethod(name = "DeleteAll", dispId = 0x8bf)
    void DeleteAll();
            
    /**
     * <p>id(0x0)</p>
     */
    @ComProperty(name = "_Default", dispId = 0x0)
    UserAccess get_Default(Object Index);
            
    
}