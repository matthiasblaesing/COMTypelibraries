
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.COMException;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackCookie;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackListener;
import com.sun.jna.platform.win32.COM.util.IConnectionPoint;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.annotation.ComObject;

/**
 * <p>uuid({0006F055-0000-0000-C000-000000000046})</p>
 * <p>source(OlkPageControlEvents)</p>
 * <p>interface(_OlkPageControl)</p>
 * <p>interface(IConnectionPoint)</p>
 * <p>interface(IUnknown)</p>
 */
@ComObject(clsId = "{0006F055-0000-0000-C000-000000000046}")
public interface OlkPageControl extends
    _OlkPageControl,
    IConnectionPoint,
    IUnknown
{

}