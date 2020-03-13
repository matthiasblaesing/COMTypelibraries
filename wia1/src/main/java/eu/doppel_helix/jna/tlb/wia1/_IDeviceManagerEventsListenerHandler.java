
package eu.doppel_helix.jna.tlb.wia1;

import com.sun.jna.platform.win32.COM.util.AbstractComEventCallbackListener;
import com.sun.jna.platform.win32.COM.util.annotation.ComEventCallback;
import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({2E9A5206-2360-49DF-9D9B-1762B4BEAE77})</p>
 */
public abstract class _IDeviceManagerEventsListenerHandler extends AbstractComEventCallbackListener implements _IDeviceManagerEventsListener {
    @Override
    public void errorReceivingCallbackEvent(java.lang.String string, java.lang.Exception excptn) {
    }

    /**
     * Occurs for any event registered with RegisterEvent
     *
     * <p>id(0x1)</p>
     */
    @Override
    public abstract com.sun.jna.platform.win32.WinNT.HRESULT OnEvent(String EventID,
            String DeviceID,
            String ItemID);
            
    
}