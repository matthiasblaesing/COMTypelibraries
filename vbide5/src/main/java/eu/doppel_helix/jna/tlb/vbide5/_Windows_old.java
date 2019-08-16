
package eu.doppel_helix.jna.tlb.vbide5;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({0002E16A-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{0002E16A-0000-0000-C000-000000000046}")
public interface _Windows_old extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x1)</p>
     * <p>vtableId(7)</p>
     */
    @ComProperty(name = "VBE", dispId = 0x1)
    VBE getVBE();
            
    /**
     * <p>id(0x2)</p>
     * <p>vtableId(8)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x2)
    Application getParent();
            
    /**
     * <p>id(0x0)</p>
     * <p>vtableId(9)</p>
     * @param index [in] {@code Object}
     */
    @ComMethod(name = "Item", dispId = 0x0)
    Window Item(Object index);
            
    /**
     * <p>id(0xc9)</p>
     * <p>vtableId(10)</p>
     */
    @ComProperty(name = "Count", dispId = 0xc9)
    Integer getCount();
            
    
}