
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.util.annotation.ComEventCallback;
import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000630F4-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000630F4-0000-0000-C000-000000000046}")
public interface NavigationGroupsEvents_12Listener {
    /**
     * <p>id(0xfbca)</p>
     */
    @ComEventCallback(dispid = 0xfbca)
    void SelectedChange(NavigationFolder NavigationFolder);
            
    /**
     * <p>id(0xfbcb)</p>
     */
    @ComEventCallback(dispid = 0xfbcb)
    void NavigationFolderAdd(NavigationFolder NavigationFolder);
            
    /**
     * <p>id(0xfbcc)</p>
     */
    @ComEventCallback(dispid = 0xfbcc)
    void NavigationFolderRemove();
            
    
}