
package eu.doppel_helix.jna.tlb.wia1;

import com.sun.jna.platform.win32.COM.COMException;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackCookie;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackListener;
import com.sun.jna.platform.win32.COM.util.IConnectionPoint;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.annotation.ComObject;

/**
 * The DeviceInfo object is a container that describes the unchanging (static) properties of an imaging device that is currently connected to the computer.
 *
 * <p>uuid({F09CFB7A-E561-4625-9BB5-208BCA0DE09F})</p>
 * <p>interface(IDeviceInfo)</p>
 * <p>interface(IUnknown)</p>
 */
@ComObject(clsId = "{F09CFB7A-E561-4625-9BB5-208BCA0DE09F}")
public interface DeviceInfo extends
    IDeviceInfo,
    IUnknown
{

}