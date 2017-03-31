
package eu.doppel_helix.jna.tlb.wbemdisp1;

import com.sun.jna.platform.win32.COM.COMException;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackCookie;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackListener;
import com.sun.jna.platform.win32.COM.util.IConnectionPoint;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.annotation.ComObject;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;

/**
 * A single item from a Refresher
 *
 * <p>uuid({8C6854BC-DE4B-11D3-B390-00105A1F473A})</p>
 * <p>interface(ISWbemRefreshableItem)</p>
 */
@ComObject(clsId = "{8C6854BC-DE4B-11D3-B390-00105A1F473A}")
public interface SWbemRefreshableItem extends IUnknown
    ,ISWbemRefreshableItem
{

}