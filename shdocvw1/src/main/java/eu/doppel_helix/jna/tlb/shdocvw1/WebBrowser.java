
package eu.doppel_helix.jna.tlb.shdocvw1;

import com.sun.jna.platform.win32.COM.COMException;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackCookie;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackListener;
import com.sun.jna.platform.win32.COM.util.IConnectionPoint;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.annotation.ComObject;

/**
 * WebBrowser Control
 *
 * <p>uuid({8856F961-340A-11D0-A96B-00C04FD705A2})</p>
 * <p>source(DWebBrowserEvents2)</p>
 * <p>source(DWebBrowserEvents)</p>
 * <p>interface(IWebBrowser2)</p>
 * <p>interface(IConnectionPoint)</p>
 * <p>interface(IUnknown)</p>
 */
@ComObject(clsId = "{8856F961-340A-11D0-A96B-00C04FD705A2}")
public interface WebBrowser extends
    IWebBrowser2,
    IConnectionPoint,
    IUnknown
{

}