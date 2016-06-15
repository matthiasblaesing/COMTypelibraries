
package eu.doppel_helix.jna.tlb.wia1;

import com.sun.jna.platform.win32.COM.COMException;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackCookie;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackListener;
import com.sun.jna.platform.win32.COM.util.IConnectionPoint;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.annotation.ComObject;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;

/**
 * The Item object is a container for an item on an imaging device object. See the Items property on the Device or Item object for details on accessing Item objects.
 *
 * <p>uuid({36F479F3-C258-426E-B5FA-2793DCFDA881})</p>
 * <p>interface(IItem)</p>
 */
@ComObject(clsId = "{36F479F3-C258-426E-B5FA-2793DCFDA881}")
public interface Item extends IUnknown
    ,IItem
{

}