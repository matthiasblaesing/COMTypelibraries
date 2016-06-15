
package eu.doppel_helix.jna.tlb.vbide5;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({0002E188-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{0002E188-0000-0000-C000-000000000046}")
public interface _Properties extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x0)</p>
     */
    @ComMethod(name = "Item", dispId = 0x0)
    Property Item(Object index);
            
    /**
     * <p>id(0x1)</p>
     */
    @ComProperty(name = "Application", dispId = 0x1)
    Application getApplication();
            
    /**
     * <p>id(0x2)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x2)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * <p>id(0x28)</p>
     */
    @ComProperty(name = "Count", dispId = 0x28)
    Integer getCount();
            
    /**
     * <p>id(0xa)</p>
     */
    @ComProperty(name = "VBE", dispId = 0xa)
    VBE getVBE();
            
    
}