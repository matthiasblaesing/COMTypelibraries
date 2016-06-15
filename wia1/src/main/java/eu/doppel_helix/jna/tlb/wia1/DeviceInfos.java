
package eu.doppel_helix.jna.tlb.wia1;

import com.sun.jna.platform.win32.COM.COMException;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackCookie;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackListener;
import com.sun.jna.platform.win32.COM.util.IConnectionPoint;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.annotation.ComObject;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;

/**
 * The DeviceInfos object is a collection of all the imaging devices currently connected to the computer. See the DeviceInfos property on the DeviceManager object for detail on accessing the DeviceInfos object.
 *
 * <p>uuid({2DFEE16B-E4AC-4A19-B660-AE71A745D34F})</p>
 * <p>interface(IDeviceInfos)</p>
 */
@ComObject(clsId = "{2DFEE16B-E4AC-4A19-B660-AE71A745D34F}")
public interface DeviceInfos extends IUnknown
    ,IDeviceInfos
{

}