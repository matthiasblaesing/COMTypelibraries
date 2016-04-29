
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.COMException;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackCookie;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackListener;
import com.sun.jna.platform.win32.COM.util.IConnectionPoint;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.annotation.ComObject;

/**
 * <p>uuid({000209FF-0000-0000-C000-000000000046})</p>
 * <p>source(ApplicationEvents4)</p>
 * <p>source(ApplicationEvents)</p>
 * <p>source(ApplicationEvents2)</p>
 * <p>source(ApplicationEvents3)</p>
 * <p>interface(_Application)</p>
 * <p>interface(IConnectionPoint)</p>
 * <p>interface(IUnknown)</p>
 */
@ComObject(clsId = "{000209FF-0000-0000-C000-000000000046}")
public interface Application extends
    _Application,
    IConnectionPoint,
    IUnknown
{

}