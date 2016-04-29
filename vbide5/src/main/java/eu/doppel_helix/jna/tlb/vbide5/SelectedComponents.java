
package eu.doppel_helix.jna.tlb.vbide5;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({BE39F3D4-1B13-11D0-887F-00A0C90F2744})</p>
 */
@ComInterface(iid="{BE39F3D4-1B13-11D0-887F-00A0C90F2744}")
public interface SelectedComponents {
    /**
     * <p>id(0x0)</p>
     */
    @ComMethod(name = "Item", dispId = 0x0)
    Component Item(Integer index);
            
    /**
     * <p>id(0x1)</p>
     */
    @ComProperty(name = "Application", dispId = 0x1)
    Application getApplication();
            
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
            
    
}