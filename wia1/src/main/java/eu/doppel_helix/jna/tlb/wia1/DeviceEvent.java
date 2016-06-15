
package eu.doppel_helix.jna.tlb.wia1;

import com.sun.jna.platform.win32.COM.COMException;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackCookie;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackListener;
import com.sun.jna.platform.win32.COM.util.IConnectionPoint;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.annotation.ComObject;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;

/**
 * The DeviceEvent object describes an EventID that can be used when calling RegisterEvent or RegisterPersistentEvent on a DeviceManager object.
 *
 * <p>uuid({617CF892-783C-43D3-B04B-F0F1DE3B326D})</p>
 * <p>interface(IDeviceEvent)</p>
 */
@ComObject(clsId = "{617CF892-783C-43D3-B04B-F0F1DE3B326D}")
public interface DeviceEvent extends IUnknown
    ,IDeviceEvent
{

}