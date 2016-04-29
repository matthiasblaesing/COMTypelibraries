
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000C0375-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000C0375-0000-0000-C000-000000000046}")
public interface UserPermission {
    /**
     * <p>id(0x60020000)</p>
     */
    @ComProperty(name = "Application", dispId = 0x60020000)
    com.sun.jna.platform.win32.COM.util.IDispatch getApplication();
            
    /**
     * <p>id(0x60020001)</p>
     */
    @ComProperty(name = "Creator", dispId = 0x60020001)
    Integer getCreator();
            
    /**
     * <p>id(0x0)</p>
     */
    @ComProperty(name = "UserId", dispId = 0x0)
    String getUserId();
            
    /**
     * <p>id(0x1)</p>
     */
    @ComProperty(name = "Permission", dispId = 0x1)
    Integer getPermission();
            
    /**
     * <p>id(0x1)</p>
     */
    @ComProperty(name = "Permission", dispId = 0x1)
    void setPermission(Integer param0);
            
    /**
     * <p>id(0x2)</p>
     */
    @ComProperty(name = "ExpirationDate", dispId = 0x2)
    Object getExpirationDate();
            
    /**
     * <p>id(0x2)</p>
     */
    @ComProperty(name = "ExpirationDate", dispId = 0x2)
    void setExpirationDate(Object param0);
            
    /**
     * <p>id(0x3)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x3)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * <p>id(0x4)</p>
     */
    @ComMethod(name = "Remove", dispId = 0x4)
    void Remove();
            
    
}