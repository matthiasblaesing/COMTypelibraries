
package eu.doppel_helix.jna.tlb.onenote15;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * List of our Windows Interface
 *
 * <p>uuid({6D4B9C3E-CC05-493F-85E2-43D1006DF96A})</p>
 */
@ComInterface(iid="{6D4B9C3E-CC05-493F-85E2-43D1006DF96A}")
public interface Windows extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x0)</p>
     * <p>vtableId(7)</p>
     * @param Index [in] {@code Integer}
     */
    @ComProperty(name = "Item", dispId = 0x0)
    Window getItem(Integer Index);
            
    /**
     * <p>id(0x1)</p>
     * <p>vtableId(8)</p>
     */
    @ComProperty(name = "Count", dispId = 0x1)
    Integer getCount();
            
    /**
     * <p>id(0x3)</p>
     * <p>vtableId(10)</p>
     */
    @ComProperty(name = "CurrentWindow", dispId = 0x3)
    Window getCurrentWindow();
            
    
}