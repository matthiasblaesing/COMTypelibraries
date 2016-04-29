
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.COMException;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackCookie;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackListener;
import com.sun.jna.platform.win32.COM.util.IConnectionPoint;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.annotation.ComObject;

/**
 * <p>uuid({00061103-0000-0000-C000-000000000046})</p>
 * <p>source(AccountSelectorEvents)</p>
 * <p>interface(_AccountSelector)</p>
 * <p>interface(IConnectionPoint)</p>
 * <p>interface(IUnknown)</p>
 */
@ComObject(clsId = "{00061103-0000-0000-C000-000000000046}")
public interface AccountSelector extends
    _AccountSelector,
    IConnectionPoint,
    IUnknown
{

}