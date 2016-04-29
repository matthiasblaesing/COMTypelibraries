
package eu.doppel_helix.jna.tlb.vbide5;

import com.sun.jna.platform.win32.COM.COMException;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackCookie;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackListener;
import com.sun.jna.platform.win32.COM.util.IConnectionPoint;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.annotation.ComObject;

/**
 * <p>uuid({0002E132-0000-0000-C000-000000000046})</p>
 * <p>source(_dispCommandBarControlEvents)</p>
 * <p>interface(_CommandBarControlEvents)</p>
 * <p>interface(IConnectionPoint)</p>
 * <p>interface(IUnknown)</p>
 */
@ComObject(clsId = "{0002E132-0000-0000-C000-000000000046}")
public interface CommandBarEvents extends
    _CommandBarControlEvents,
    IConnectionPoint,
    IUnknown
{

}