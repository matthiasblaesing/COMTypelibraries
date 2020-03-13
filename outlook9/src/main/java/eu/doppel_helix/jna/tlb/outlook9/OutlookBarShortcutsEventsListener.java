
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({0006307C-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{0006307C-0000-0000-C000-000000000046}")
public interface OutlookBarShortcutsEventsListener {
    /**
     * <p>id(0xf001)</p>
     */
    @ComMethod(name = "ShortcutAdd", dispId = 0xf001)
    void ShortcutAdd(OutlookBarShortcut NewShortcut);
            
    /**
     * <p>id(0xf002)</p>
     */
    @ComMethod(name = "BeforeShortcutAdd", dispId = 0xf002)
    void BeforeShortcutAdd(VARIANT Cancel);
            
    /**
     * <p>id(0xf003)</p>
     */
    @ComMethod(name = "BeforeShortcutRemove", dispId = 0xf003)
    void BeforeShortcutRemove(OutlookBarShortcut Shortcut,
            VARIANT Cancel);
            
    
}