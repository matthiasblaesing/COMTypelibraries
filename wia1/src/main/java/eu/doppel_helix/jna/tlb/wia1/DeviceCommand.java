
package eu.doppel_helix.jna.tlb.wia1;

import com.sun.jna.platform.win32.COM.COMException;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackCookie;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackListener;
import com.sun.jna.platform.win32.COM.util.IConnectionPoint;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.annotation.ComObject;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;

/**
 * The DeviceCommand object describes a CommandID that can be used when calling ExecuteCommand on a Device or Item object.
 *
 * <p>uuid({72226184-AFBB-4059-BF55-0F6C076E669D})</p>
 * <p>interface(IDeviceCommand)</p>
 */
@ComObject(clsId = "{72226184-AFBB-4059-BF55-0F6C076E669D}")
public interface DeviceCommand extends IUnknown
    ,IDeviceCommand
{

}