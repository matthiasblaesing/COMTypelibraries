
package eu.doppel_helix.jna.tlb.vbide5;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({0002E161-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{0002E161-0000-0000-C000-000000000046}")
public interface _Components extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x0)</p>
     * <p>vtableId(7)</p>
     * @param index [in] {@code Object}
     */
    @ComMethod(name = "Item", dispId = 0x0)
    Component Item(Object index);
            
    /**
     * <p>id(0x1)</p>
     * <p>vtableId(8)</p>
     */
    @ComProperty(name = "Application", dispId = 0x1)
    Application getApplication();
            
    /**
     * <p>id(0x2)</p>
     * <p>vtableId(9)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x2)
    VBProject getParent();
            
    /**
     * <p>id(0xa)</p>
     * <p>vtableId(10)</p>
     */
    @ComProperty(name = "Count", dispId = 0xa)
    Integer getCount();
            
    /**
     * <p>id(0xb)</p>
     * <p>vtableId(12)</p>
     * @param Component [in] {@code Component}
     */
    @ComMethod(name = "Remove", dispId = 0xb)
    void Remove(Component Component);
            
    /**
     * <p>id(0xc)</p>
     * <p>vtableId(13)</p>
     * @param ComponentType [in] {@code vbext_ComponentType}
     */
    @ComMethod(name = "Add", dispId = 0xc)
    Component Add(vbext_ComponentType ComponentType);
            
    /**
     * <p>id(0xd)</p>
     * <p>vtableId(14)</p>
     * @param FileName [in] {@code String}
     */
    @ComMethod(name = "Import", dispId = 0xd)
    Component Import(String FileName);
            
    /**
     * <p>id(0x14)</p>
     * <p>vtableId(15)</p>
     */
    @ComProperty(name = "VBE", dispId = 0x14)
    VBE getVBE();
            
    
}