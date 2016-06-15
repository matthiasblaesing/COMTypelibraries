
package eu.doppel_helix.jna.tlb.wia1;

import com.sun.jna.platform.win32.COM.COMException;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackCookie;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackListener;
import com.sun.jna.platform.win32.COM.util.IConnectionPoint;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.annotation.ComObject;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;

/**
 * The Properties object is a collection of all the Property objects associated with a given Device, DeviceInfo, Filter, ImageFile or Item object. See the Properties property on any of these objects for detail on accessing the Properties object.
 *
 * <p>uuid({96F887FC-08B1-4F97-A69C-75280C6A9CF8})</p>
 * <p>interface(IProperties)</p>
 */
@ComObject(clsId = "{96F887FC-08B1-4F97-A69C-75280C6A9CF8}")
public interface Properties extends IUnknown
    ,IProperties
{

}