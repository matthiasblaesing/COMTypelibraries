
package eu.doppel_helix.jna.tlb.wia1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({2E9A5206-2360-49DF-9D9B-1762B4BEAE77})</p>
 */
@ComInterface(iid="{2E9A5206-2360-49DF-9D9B-1762B4BEAE77}")
public interface _IDeviceManagerEvents {
    /**
     * Occurs for any event registered with RegisterEvent
     *
     * <p>id(0x1)</p>
     */
    @ComMethod(name = "OnEvent", dispId = 0x1)
    com.sun.jna.platform.win32.WinNT.HRESULT OnEvent(String EventID,
            String DeviceID,
            String ItemID);
            
    
}