
package eu.doppel_helix.jna.tlb.vbide5;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({DA936B62-AC8B-11D1-B6E5-00A0C90F2744})</p>
 */
@ComInterface(iid="{DA936B62-AC8B-11D1-B6E5-00A0C90F2744}")
public interface _AddIns {
    /**
     * <p>id(0x0)</p>
     */
    @ComMethod(name = "Item", dispId = 0x0)
    AddIn Item(Object index);
            
    /**
     * <p>id(0x1)</p>
     */
    @ComProperty(name = "VBE", dispId = 0x1)
    VBE getVBE();
            
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
     * <p>id(0x29)</p>
     */
    @ComMethod(name = "Update", dispId = 0x29)
    void Update();
            
    
}