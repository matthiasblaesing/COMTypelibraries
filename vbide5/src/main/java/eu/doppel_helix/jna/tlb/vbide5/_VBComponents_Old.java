
package eu.doppel_helix.jna.tlb.vbide5;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({0002E162-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{0002E162-0000-0000-C000-000000000046}")
public interface _VBComponents_Old {
    /**
     * <p>id(0x0)</p>
     */
    @ComMethod(name = "Item", dispId = 0x0)
    VBComponent Item(Object index);
            
    /**
     * <p>id(0x2)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x2)
    VBProject getParent();
            
    /**
     * <p>id(0xa)</p>
     */
    @ComProperty(name = "Count", dispId = 0xa)
    Integer getCount();
            
    /**
     * <p>id(0xb)</p>
     */
    @ComMethod(name = "Remove", dispId = 0xb)
    void Remove(VBComponent VBComponent);
            
    /**
     * <p>id(0xc)</p>
     */
    @ComMethod(name = "Add", dispId = 0xc)
    VBComponent Add(vbext_ComponentType ComponentType);
            
    /**
     * <p>id(0xd)</p>
     */
    @ComMethod(name = "Import", dispId = 0xd)
    VBComponent Import(String FileName);
            
    /**
     * <p>id(0x14)</p>
     */
    @ComProperty(name = "VBE", dispId = 0x14)
    VBE getVBE();
            
    
}