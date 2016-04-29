
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({55F88896-7708-11D1-ACEB-006008961DA5})</p>
 */
@ComInterface(iid="{55F88896-7708-11D1-ACEB-006008961DA5}")
public interface ICommandBarComboBoxEvents {
    /**
     * <p>id(0x1)</p>
     */
    @ComMethod(name = "Change", dispId = 0x1)
    void Change(CommandBarComboBox Ctrl);
            
    
}