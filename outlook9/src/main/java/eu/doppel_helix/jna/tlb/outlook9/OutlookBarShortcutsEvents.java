
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({0006307C-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{0006307C-0000-0000-C000-000000000046}")
public interface OutlookBarShortcutsEvents extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0xf001)</p>
     * @param NewShortcut [in] {@code OutlookBarShortcut}
     */
    @ComMethod(name = "ShortcutAdd", dispId = 0xf001)
    void ShortcutAdd(OutlookBarShortcut NewShortcut);
            
    /**
     * <p>id(0xf002)</p>
     * @param Cancel [inout] {@code Boolean}
     */
    @ComMethod(name = "BeforeShortcutAdd", dispId = 0xf002)
    void BeforeShortcutAdd(VARIANT Cancel);
            
    /**
     * <p>id(0xf003)</p>
     * @param Shortcut [in] {@code OutlookBarShortcut}
     * @param Cancel [inout] {@code Boolean}
     */
    @ComMethod(name = "BeforeShortcutRemove", dispId = 0xf003)
    void BeforeShortcutRemove(OutlookBarShortcut Shortcut,
            VARIANT Cancel);
            
    
}