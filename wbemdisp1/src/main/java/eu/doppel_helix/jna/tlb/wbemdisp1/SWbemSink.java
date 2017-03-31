
package eu.doppel_helix.jna.tlb.wbemdisp1;

import com.sun.jna.platform.win32.COM.COMException;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackCookie;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackListener;
import com.sun.jna.platform.win32.COM.util.IConnectionPoint;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.annotation.ComObject;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;

/**
 * A sink for events arising from asynchronous operations
 *
 * <p>uuid({75718C9A-F029-11D1-A1AC-00C04FB6C223})</p>
 * <p>source(ISWbemSinkEvents)</p>
 * <p>interface(ISWbemSink)</p>
 * <p>interface(IConnectionPoint)</p>
 */
@ComObject(clsId = "{75718C9A-F029-11D1-A1AC-00C04FB6C223}")
public interface SWbemSink extends IUnknown
    ,ISWbemSink
    ,IConnectionPoint
{

}