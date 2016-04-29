
package eu.doppel_helix.jna.tlb.shdocvw1;

import com.sun.jna.platform.win32.COM.COMException;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackCookie;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackListener;
import com.sun.jna.platform.win32.COM.util.IConnectionPoint;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.annotation.ComObject;

/**
 * Internet Explorer Application.
 *
 * <p>uuid({0002DF01-0000-0000-C000-000000000046})</p>
 * <p>source(DWebBrowserEvents2)</p>
 * <p>source(DWebBrowserEvents)</p>
 * <p>interface(IWebBrowser2)</p>
 * <p>interface(IConnectionPoint)</p>
 * <p>interface(IUnknown)</p>
 */
@ComObject(clsId = "{0002DF01-0000-0000-C000-000000000046}")
public interface InternetExplorer extends
    IWebBrowser2,
    IConnectionPoint,
    IUnknown
{

}