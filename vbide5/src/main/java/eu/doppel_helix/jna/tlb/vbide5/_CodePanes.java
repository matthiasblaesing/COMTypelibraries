
package eu.doppel_helix.jna.tlb.vbide5;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({0002E172-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{0002E172-0000-0000-C000-000000000046}")
public interface _CodePanes extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x60020000)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x60020000)
    VBE getParent();
            
    /**
     * <p>id(0x60020001)</p>
     */
    @ComProperty(name = "VBE", dispId = 0x60020001)
    VBE getVBE();
            
    /**
     * <p>id(0x0)</p>
     */
    @ComMethod(name = "Item", dispId = 0x0)
    CodePane Item(Object index);
            
    /**
     * <p>id(0x60020003)</p>
     */
    @ComProperty(name = "Count", dispId = 0x60020003)
    Integer getCount();
            
    /**
     * <p>id(0x60020005)</p>
     */
    @ComProperty(name = "Current", dispId = 0x60020005)
    CodePane getCurrent();
            
    /**
     * <p>id(0x60020005)</p>
     */
    @ComProperty(name = "Current", dispId = 0x60020005)
    void setCurrent(CodePane param0);
            
    
}