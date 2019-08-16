
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000C0354-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000C0354-0000-0000-C000-000000000046}")
public interface _CommandBarComboBoxEvents extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x1)</p>
     * <p>vtableId(7)</p>
     * @param Ctrl [in] {@code CommandBarComboBox}
     */
    @ComMethod(name = "Change", dispId = 0x1)
    void Change(CommandBarComboBox Ctrl);
            
    
}