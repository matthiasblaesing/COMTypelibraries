
package eu.doppel_helix.jna.tlb.shdocvw1;

import com.sun.jna.platform.win32.COM.COMException;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackCookie;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackListener;
import com.sun.jna.platform.win32.COM.util.IConnectionPoint;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.annotation.ComObject;

/**
 * Internet Explorer Application with default integrity of Medium
 *
 * <p>uuid({D5E8041D-920F-45E9-B8FB-B1DEB82C6E5E})</p>
 * <p>source(DWebBrowserEvents2)</p>
 * <p>source(DWebBrowserEvents)</p>
 * <p>interface(IWebBrowser2)</p>
 * <p>interface(IConnectionPoint)</p>
 * <p>interface(IUnknown)</p>
 */
@ComObject(clsId = "{D5E8041D-920F-45E9-B8FB-B1DEB82C6E5E}")
public interface InternetExplorerMedium extends
    IWebBrowser2,
    IConnectionPoint,
    IUnknown
{

}