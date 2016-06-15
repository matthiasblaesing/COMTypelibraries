
package eu.doppel_helix.jna.tlb.wia1;

import com.sun.jna.platform.win32.COM.COMException;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackCookie;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackListener;
import com.sun.jna.platform.win32.COM.util.IConnectionPoint;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.annotation.ComObject;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;

/**
 * The FilterInfos object is a collection of all the available FilterInfo objects. See the FilterInfos property on the ImageProcess object for detail on accessing the FilterInfos object.
 *
 * <p>uuid({56FA88D3-F3DA-4DE3-94E8-811040C3CCD4})</p>
 * <p>interface(IFilterInfos)</p>
 */
@ComObject(clsId = "{56FA88D3-F3DA-4DE3-94E8-811040C3CCD4}")
public interface FilterInfos extends IUnknown
    ,IFilterInfos
{

}