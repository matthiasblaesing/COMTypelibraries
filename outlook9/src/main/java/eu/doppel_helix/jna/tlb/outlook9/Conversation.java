
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.COMException;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackCookie;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackListener;
import com.sun.jna.platform.win32.COM.util.IConnectionPoint;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.annotation.ComObject;

/**
 * <p>uuid({00061101-0000-0000-C000-000000000046})</p>
 * <p>interface(_Conversation)</p>
 * <p>interface(IUnknown)</p>
 */
@ComObject(clsId = "{00061101-0000-0000-C000-000000000046}")
public interface Conversation extends
    _Conversation,
    IUnknown
{

}