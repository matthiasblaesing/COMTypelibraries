
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
 * <p>uuid({EAB22AC3-30C1-11CF-A7EB-0000C05BAE0B})</p>
 * <p>source(DWebBrowserEvents)</p>
 * <p>source(DWebBrowserEvents2)</p>
 * <p>interface(IWebBrowser)</p>
 * <p>interface(IConnectionPoint)</p>
 * <p>interface(IUnknown)</p>
 */
@ComObject(clsId = "{EAB22AC3-30C1-11CF-A7EB-0000C05BAE0B}")
public interface WebBrowser_V1 extends
    IWebBrowser,
    IConnectionPoint,
    IUnknown
{

}