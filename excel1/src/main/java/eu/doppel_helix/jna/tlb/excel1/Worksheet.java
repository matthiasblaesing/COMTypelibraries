
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.COMException;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackCookie;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackListener;
import com.sun.jna.platform.win32.COM.util.IConnectionPoint;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.annotation.ComObject;

/**
 * <p>uuid({00020820-0000-0000-C000-000000000046})</p>
 * <p>source(DocEvents)</p>
 * <p>interface(_Worksheet)</p>
 * <p>interface(IConnectionPoint)</p>
 * <p>interface(IUnknown)</p>
 */
@ComObject(clsId = "{00020820-0000-0000-C000-000000000046}")
public interface Worksheet extends
    _Worksheet,
    IConnectionPoint,
    IUnknown
{

}