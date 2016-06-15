
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000C0391-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000C0391-0000-0000-C000-000000000046}")
public interface PolicyItem extends IUnknown, IRawDispatchHandle, IDispatch {
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
    @ComProperty(name = "Id", dispId = 0x0)
    String getId();
            
    /**
     * <p>id(0x1)</p>
     */
    @ComProperty(name = "Name", dispId = 0x1)
    String getName();
            
    /**
     * <p>id(0x2)</p>
     */
    @ComProperty(name = "Description", dispId = 0x2)
    String getDescription();
            
    /**
     * <p>id(0x3)</p>
     */
    @ComProperty(name = "Data", dispId = 0x3)
    String getData();
            
    /**
     * <p>id(0x4)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x4)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    
}