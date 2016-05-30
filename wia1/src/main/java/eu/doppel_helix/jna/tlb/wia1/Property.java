
package eu.doppel_helix.jna.tlb.wia1;

import com.sun.jna.platform.win32.COM.COMException;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackCookie;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackListener;
import com.sun.jna.platform.win32.COM.util.IConnectionPoint;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.annotation.ComObject;

/**
 * The Property object is a container for a property associated with a Device, DeviceInfo, Filter, ImageFile or Item object. See the Properties property on any of these objects for details on accessing Property objects.
 *
 * <p>uuid({2014DE3F-3723-4178-8643-3317A32D4A2B})</p>
 * <p>interface(IProperty)</p>
 * <p>interface(IUnknown)</p>
 */
@ComObject(clsId = "{2014DE3F-3723-4178-8643-3317A32D4A2B}")
public interface Property extends
    IProperty,
    IUnknown
{

}