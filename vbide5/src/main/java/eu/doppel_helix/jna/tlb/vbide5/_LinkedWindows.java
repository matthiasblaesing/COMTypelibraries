
package eu.doppel_helix.jna.tlb.vbide5;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({0002E16C-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{0002E16C-0000-0000-C000-000000000046}")
public interface _LinkedWindows extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x1)</p>
     */
    @ComProperty(name = "VBE", dispId = 0x1)
    VBE getVBE();
            
    /**
     * <p>id(0x2)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x2)
    Window getParent();
            
    /**
     * <p>id(0x0)</p>
     */
    @ComMethod(name = "Item", dispId = 0x0)
    Window Item(Object index);
            
    /**
     * <p>id(0xc9)</p>
     */
    @ComProperty(name = "Count", dispId = 0xc9)
    Integer getCount();
            
    /**
     * <p>id(0xca)</p>
     */
    @ComMethod(name = "Remove", dispId = 0xca)
    void Remove(Window Window);
            
    /**
     * <p>id(0xcb)</p>
     */
    @ComMethod(name = "Add", dispId = 0xcb)
    void Add(Window Window);
            
    
}