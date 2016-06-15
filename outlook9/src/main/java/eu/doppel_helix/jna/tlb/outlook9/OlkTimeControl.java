
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.COMException;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackCookie;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackListener;
import com.sun.jna.platform.win32.COM.util.IConnectionPoint;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.annotation.ComObject;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;

/**
 * <p>uuid({0006F051-0000-0000-C000-000000000046})</p>
 * <p>source(OlkTimeControlEvents)</p>
 * <p>interface(_OlkTimeControl)</p>
 * <p>interface(IConnectionPoint)</p>
 */
@ComObject(clsId = "{0006F051-0000-0000-C000-000000000046}")
public interface OlkTimeControl extends IUnknown
    ,_OlkTimeControl
    ,IConnectionPoint
{

}