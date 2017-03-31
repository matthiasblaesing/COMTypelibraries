
package eu.doppel_helix.jna.tlb.wbemdisp1;

import com.sun.jna.platform.win32.COM.COMException;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackCookie;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackListener;
import com.sun.jna.platform.win32.COM.util.IConnectionPoint;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.annotation.ComObject;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;

/**
 * Date & Time
 *
 * <p>uuid({47DFBE54-CF76-11D3-B38F-00105A1F473A})</p>
 * <p>interface(ISWbemDateTime)</p>
 */
@ComObject(clsId = "{47DFBE54-CF76-11D3-B38F-00105A1F473A}")
public interface SWbemDateTime extends IUnknown
    ,ISWbemDateTime
{

}