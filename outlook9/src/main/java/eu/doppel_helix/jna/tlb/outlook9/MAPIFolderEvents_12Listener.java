
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.util.annotation.ComEventCallback;
import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000630F7-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000630F7-0000-0000-C000-000000000046}")
public interface MAPIFolderEvents_12Listener {
    /**
     * <p>id(0xfba8)</p>
     */
    @ComEventCallback(dispid = 0xfba8)
    void BeforeFolderMove(MAPIFolder MoveTo,
            VARIANT Cancel);
            
    /**
     * <p>id(0xfba9)</p>
     */
    @ComEventCallback(dispid = 0xfba9)
    void BeforeItemMove(com.sun.jna.platform.win32.COM.util.IDispatch Item,
            MAPIFolder MoveTo,
            VARIANT Cancel);
            
    
}