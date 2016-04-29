
package eu.doppel_helix.jna.tlb.vbide5;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({EEE00919-E393-11D1-BB03-00C04FB6C4A6})</p>
 */
@ComInterface(iid="{EEE00919-E393-11D1-BB03-00C04FB6C4A6}")
public interface _VBProjects {
    /**
     * <p>id(0x0)</p>
     */
    @ComMethod(name = "Item", dispId = 0x0)
    VBProject Item(Object index);
            
    /**
     * <p>id(0x14)</p>
     */
    @ComProperty(name = "VBE", dispId = 0x14)
    VBE getVBE();
            
    /**
     * <p>id(0x2)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x2)
    VBE getParent();
            
    /**
     * <p>id(0xa)</p>
     */
    @ComProperty(name = "Count", dispId = 0xa)
    Integer getCount();
            
    /**
     * <p>id(0x89)</p>
     */
    @ComMethod(name = "Add", dispId = 0x89)
    VBProject Add(vbext_ProjectType Type);
            
    /**
     * <p>id(0x8a)</p>
     */
    @ComMethod(name = "Remove", dispId = 0x8a)
    void Remove(VBProject lpc);
            
    /**
     * <p>id(0x8b)</p>
     */
    @ComMethod(name = "Open", dispId = 0x8b)
    VBProject Open(String bstrPath);
            
    
}