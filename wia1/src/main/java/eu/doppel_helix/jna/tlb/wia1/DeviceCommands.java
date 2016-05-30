
package eu.doppel_helix.jna.tlb.wia1;

import com.sun.jna.platform.win32.COM.COMException;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackCookie;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackListener;
import com.sun.jna.platform.win32.COM.util.IConnectionPoint;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.annotation.ComObject;

/**
 * The DeviceCommands object is a collection of all the supported DeviceCommands for an imaging device. See the Commands property of a Device or Item object for more details on determining the collection of supported device commands.
 *
 * <p>uuid({25B047DB-4AAD-4FC2-A0BE-31DDA687FF32})</p>
 * <p>interface(IDeviceCommands)</p>
 * <p>interface(IUnknown)</p>
 */
@ComObject(clsId = "{25B047DB-4AAD-4FC2-A0BE-31DDA687FF32}")
public interface DeviceCommands extends
    IDeviceCommands,
    IUnknown
{

}