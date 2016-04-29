
package eu.doppel_helix.jna.tlb.shdocvw1;

import com.sun.jna.platform.win32.COM.COMException;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackCookie;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackListener;
import com.sun.jna.platform.win32.COM.util.IConnectionPoint;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.annotation.ComObject;

/**
 * Shell Browser Window.
 *
 * <p>uuid({C08AFD90-F2A1-11D1-8455-00A0C91F3880})</p>
 * <p>source(DWebBrowserEvents2)</p>
 * <p>source(DWebBrowserEvents)</p>
 * <p>interface(IWebBrowser2)</p>
 * <p>interface(IConnectionPoint)</p>
 * <p>interface(IUnknown)</p>
 */
@ComObject(clsId = "{C08AFD90-F2A1-11D1-8455-00A0C91F3880}")
public interface ShellBrowserWindow extends
    IWebBrowser2,
    IConnectionPoint,
    IUnknown
{

}