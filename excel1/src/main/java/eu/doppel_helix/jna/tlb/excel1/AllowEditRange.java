
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({0002446B-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{0002446B-0000-0000-C000-000000000046}")
public interface AllowEditRange extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0xc7)</p>
     */
    @ComProperty(name = "Title", dispId = 0xc7)
    String getTitle();
            
    /**
     * <p>id(0xc7)</p>
     */
    @ComProperty(name = "Title", dispId = 0xc7)
    void setTitle(String param0);
            
    /**
     * <p>id(0xc5)</p>
     */
    @ComProperty(name = "Range", dispId = 0xc5)
    Range getRange();
            
    /**
     * <p>id(0xc5)</p>
     */
    @ComProperty(name = "Range", dispId = 0xc5)
    void setRange(Range param0);
            
    /**
     * <p>id(0x8bd)</p>
     */
    @ComMethod(name = "ChangePassword", dispId = 0x8bd)
    void ChangePassword(String Password);
            
    /**
     * <p>id(0x75)</p>
     */
    @ComMethod(name = "Delete", dispId = 0x75)
    void Delete();
            
    /**
     * <p>id(0x11d)</p>
     */
    @ComMethod(name = "Unprotect", dispId = 0x11d)
    void Unprotect(Object Password);
            
    /**
     * <p>id(0x8be)</p>
     */
    @ComProperty(name = "Users", dispId = 0x8be)
    UserAccessList getUsers();
            
    
}