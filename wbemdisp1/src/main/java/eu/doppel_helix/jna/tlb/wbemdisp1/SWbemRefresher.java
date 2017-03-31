
package eu.doppel_helix.jna.tlb.wbemdisp1;

import com.sun.jna.platform.win32.COM.COMException;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackCookie;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackListener;
import com.sun.jna.platform.win32.COM.util.IConnectionPoint;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.annotation.ComObject;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;

/**
 * Refresher
 *
 * <p>uuid({D269BF5C-D9C1-11D3-B38F-00105A1F473A})</p>
 * <p>interface(ISWbemRefresher)</p>
 */
@ComObject(clsId = "{D269BF5C-D9C1-11D3-B38F-00105A1F473A}")
public interface SWbemRefresher extends IUnknown
    ,ISWbemRefresher
{

}