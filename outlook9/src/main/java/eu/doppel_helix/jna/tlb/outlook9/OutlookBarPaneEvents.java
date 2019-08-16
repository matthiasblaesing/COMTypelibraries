
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({0006307A-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{0006307A-0000-0000-C000-000000000046}")
public interface OutlookBarPaneEvents extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0xf001)</p>
     * @param Shortcut [in] {@code OutlookBarShortcut}
     * @param Cancel [inout] {@code Boolean}
     */
    @ComMethod(name = "BeforeNavigate", dispId = 0xf001)
    void BeforeNavigate(OutlookBarShortcut Shortcut,
            VARIANT Cancel);
            
    /**
     * <p>id(0xf002)</p>
     * @param ToGroup [in] {@code OutlookBarGroup}
     * @param Cancel [inout] {@code Boolean}
     */
    @ComMethod(name = "BeforeGroupSwitch", dispId = 0xf002)
    void BeforeGroupSwitch(OutlookBarGroup ToGroup,
            VARIANT Cancel);
            
    
}