
package eu.doppel_helix.jna.tlb.wia1;

import com.sun.jna.platform.win32.COM.COMException;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackCookie;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackListener;
import com.sun.jna.platform.win32.COM.util.IConnectionPoint;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.annotation.ComObject;

/**
 * The DeviceEvents object is a collection of all the supported DeviceEvent for an imaging device. See the Events property of a Device object for more details on determining the collection of supported device events.
 *
 * <p>uuid({3563A59A-BBCD-4C86-94A0-92136C80A8B4})</p>
 * <p>interface(IDeviceEvents)</p>
 * <p>interface(IUnknown)</p>
 */
@ComObject(clsId = "{3563A59A-BBCD-4C86-94A0-92136C80A8B4}")
public interface DeviceEvents extends
    IDeviceEvents,
    IUnknown
{

}