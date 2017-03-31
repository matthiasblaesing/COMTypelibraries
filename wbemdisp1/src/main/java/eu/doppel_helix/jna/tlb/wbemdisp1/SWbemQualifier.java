
package eu.doppel_helix.jna.tlb.wbemdisp1;

import com.sun.jna.platform.win32.COM.COMException;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackCookie;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackListener;
import com.sun.jna.platform.win32.COM.util.IConnectionPoint;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.annotation.ComObject;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;

/**
 * A Qualifier
 *
 * <p>uuid({04B83D5F-21AE-11D2-8B33-00600806D9B6})</p>
 * <p>interface(ISWbemQualifier)</p>
 */
@ComObject(clsId = "{04B83D5F-21AE-11D2-8B33-00600806D9B6}")
public interface SWbemQualifier extends IUnknown
    ,ISWbemQualifier
{

}