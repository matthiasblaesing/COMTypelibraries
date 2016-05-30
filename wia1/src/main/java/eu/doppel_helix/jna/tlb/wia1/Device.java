
package eu.doppel_helix.jna.tlb.wia1;

import com.sun.jna.platform.win32.COM.COMException;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackCookie;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackListener;
import com.sun.jna.platform.win32.COM.util.IConnectionPoint;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.annotation.ComObject;

/**
 * The Device object represents an active connection to an imaging device.
 *
 * <p>uuid({DBAA8843-B1C4-4EDC-B7E0-D6F61162BE58})</p>
 * <p>interface(IDevice)</p>
 * <p>interface(IUnknown)</p>
 */
@ComObject(clsId = "{DBAA8843-B1C4-4EDC-B7E0-D6F61162BE58}")
public interface Device extends
    IDevice,
    IUnknown
{

}