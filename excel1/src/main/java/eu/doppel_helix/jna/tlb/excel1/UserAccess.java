
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({0002446D-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{0002446D-0000-0000-C000-000000000046}")
public interface UserAccess extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x6e)</p>
     */
    @ComProperty(name = "Name", dispId = 0x6e)
    String getName();
            
    /**
     * <p>id(0x7e4)</p>
     */
    @ComProperty(name = "AllowEdit", dispId = 0x7e4)
    Boolean getAllowEdit();
            
    /**
     * <p>id(0x7e4)</p>
     */
    @ComProperty(name = "AllowEdit", dispId = 0x7e4)
    void setAllowEdit(Boolean param0);
            
    /**
     * <p>id(0x75)</p>
     */
    @ComMethod(name = "Delete", dispId = 0x75)
    void Delete();
            
    
}