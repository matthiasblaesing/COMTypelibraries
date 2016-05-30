
package eu.doppel_helix.jna.tlb.wia1;

import com.sun.jna.platform.win32.COM.COMException;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackCookie;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackListener;
import com.sun.jna.platform.win32.COM.util.IConnectionPoint;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.annotation.ComObject;

/**
 * The DeviceManager control is an invisible-at-runtime control that manages the imaging devices connected to the computer. A DeviceManager control can be created using "WIA.DeviceManager" in a call to CreateObject or by dropping a DeviceManager on a form.
 *
 * <p>uuid({E1C5D730-7E97-4D8A-9E42-BBAE87C2059F})</p>
 * <p>source(_IDeviceManagerEvents)</p>
 * <p>interface(IDeviceManager)</p>
 * <p>interface(IConnectionPoint)</p>
 * <p>interface(IUnknown)</p>
 */
@ComObject(clsId = "{E1C5D730-7E97-4D8A-9E42-BBAE87C2059F}")
public interface DeviceManager extends
    IDeviceManager,
    IConnectionPoint,
    IUnknown
{

}