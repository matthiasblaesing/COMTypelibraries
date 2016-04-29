
package eu.doppel_helix.jna.tlb.shdocvw1;

import com.sun.jna.platform.win32.COM.COMException;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackCookie;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackListener;
import com.sun.jna.platform.win32.COM.util.IConnectionPoint;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.annotation.ComObject;

/**
 * <p>uuid({55136805-B2DE-11D1-B9F2-00A0C98BC547})</p>
 * <p>source(DShellNameSpaceEvents)</p>
 * <p>interface(IShellNameSpace)</p>
 * <p>interface(IConnectionPoint)</p>
 * <p>interface(IUnknown)</p>
 */
@ComObject(clsId = "{55136805-B2DE-11D1-B9F2-00A0C98BC547}")
public interface ShellNameSpace extends
    IShellNameSpace,
    IConnectionPoint,
    IUnknown
{

}