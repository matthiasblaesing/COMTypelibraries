
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000630F4-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000630F4-0000-0000-C000-000000000046}")
public interface NavigationGroupsEvents_12 extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0xfbca)</p>
     */
    @ComMethod(name = "SelectedChange", dispId = 0xfbca)
    void SelectedChange(NavigationFolder NavigationFolder);
            
    /**
     * <p>id(0xfbcb)</p>
     */
    @ComMethod(name = "NavigationFolderAdd", dispId = 0xfbcb)
    void NavigationFolderAdd(NavigationFolder NavigationFolder);
            
    /**
     * <p>id(0xfbcc)</p>
     */
    @ComMethod(name = "NavigationFolderRemove", dispId = 0xfbcc)
    void NavigationFolderRemove();
            
    
}