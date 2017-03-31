
package eu.doppel_helix.jna.tlb.wbemdisp1;

import com.sun.jna.platform.win32.COM.COMException;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackCookie;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackListener;
import com.sun.jna.platform.win32.COM.util.IConnectionPoint;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.annotation.ComObject;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;

/**
 * The last error on the current thread
 *
 * <p>uuid({C2FEEEAC-CFCD-11D1-8B05-00600806D9B6})</p>
 * <p>interface(ISWbemLastError)</p>
 */
@ComObject(clsId = "{C2FEEEAC-CFCD-11D1-8B05-00600806D9B6}")
public interface SWbemLastError extends IUnknown
    ,ISWbemLastError
{

}