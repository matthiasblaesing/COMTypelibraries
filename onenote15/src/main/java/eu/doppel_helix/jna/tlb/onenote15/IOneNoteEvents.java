
package eu.doppel_helix.jna.tlb.onenote15;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * IOneNoteEvents Interface
 *
 * <p>uuid({E2E1511D-502D-4BD0-8B3A-8A89A05CDCAE})</p>
 */
@ComInterface(iid="{E2E1511D-502D-4BD0-8B3A-8A89A05CDCAE}")
public interface IOneNoteEvents extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x1)</p>
     */
    @ComMethod(name = "OnNavigate", dispId = 0x1)
    void OnNavigate();
            
    /**
     * <p>id(0x2)</p>
     * @param bstrActivePageID [in] {@code String}
     */
    @ComMethod(name = "OnHierarchyChange", dispId = 0x2)
    void OnHierarchyChange(String bstrActivePageID);
            
    
}