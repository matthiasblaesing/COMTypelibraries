
package eu.doppel_helix.jna.tlb.wia1;

import com.sun.jna.platform.win32.COM.COMException;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackCookie;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackListener;
import com.sun.jna.platform.win32.COM.util.IConnectionPoint;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.annotation.ComObject;

/**
 * The Items object contains a collection of Item objects. See the Items property on the Device or Item object for details on accessing the Items object.
 *
 * <p>uuid({B243B765-CA9C-4F30-A457-C8B2B57A585E})</p>
 * <p>interface(IItems)</p>
 * <p>interface(IUnknown)</p>
 */
@ComObject(clsId = "{B243B765-CA9C-4F30-A457-C8B2B57A585E}")
public interface Items extends
    IItems,
    IUnknown
{

}