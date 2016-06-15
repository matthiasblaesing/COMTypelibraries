
package eu.doppel_helix.jna.tlb.shdocvw1;

import com.sun.jna.platform.win32.COM.COMException;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackCookie;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackListener;
import com.sun.jna.platform.win32.COM.util.IConnectionPoint;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.annotation.ComObject;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;

/**
 * ShellDispatch Load in Shell Context
 *
 * <p>uuid({9BA05972-F6A8-11CF-A442-00A0C90A8F39})</p>
 * <p>source(DShellWindowsEvents)</p>
 * <p>interface(IShellWindows)</p>
 * <p>interface(IConnectionPoint)</p>
 */
@ComObject(clsId = "{9BA05972-F6A8-11CF-A442-00A0C90A8F39}")
public interface ShellWindows extends IUnknown
    ,IShellWindows
    ,IConnectionPoint
{

}