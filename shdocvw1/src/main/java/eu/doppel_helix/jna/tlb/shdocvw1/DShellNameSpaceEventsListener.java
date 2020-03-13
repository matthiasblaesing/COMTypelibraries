
package eu.doppel_helix.jna.tlb.shdocvw1;

import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({55136806-B2DE-11D1-B9F2-00A0C98BC547})</p>
 */
@ComInterface(iid="{55136806-B2DE-11D1-B9F2-00A0C98BC547}")
public interface DShellNameSpaceEventsListener {
    /**
     * <p>id(0x1)</p>
     */
    @ComMethod(name = "FavoritesSelectionChange", dispId = 0x1)
    void FavoritesSelectionChange(Integer cItems,
            Integer hItem,
            String strName,
            String strUrl,
            Integer cVisits,
            String strDate,
            Integer fAvailableOffline);
            
    /**
     * <p>id(0x2)</p>
     */
    @ComMethod(name = "SelectionChange", dispId = 0x2)
    void SelectionChange();
            
    /**
     * <p>id(0x3)</p>
     */
    @ComMethod(name = "DoubleClick", dispId = 0x3)
    void DoubleClick();
            
    /**
     * <p>id(0x4)</p>
     */
    @ComMethod(name = "Initialized", dispId = 0x4)
    void Initialized();
            
    
}