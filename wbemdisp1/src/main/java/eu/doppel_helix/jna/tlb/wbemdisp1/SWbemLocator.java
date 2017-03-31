
package eu.doppel_helix.jna.tlb.wbemdisp1;

import com.sun.jna.platform.win32.COM.COMException;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackCookie;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackListener;
import com.sun.jna.platform.win32.COM.util.IConnectionPoint;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.annotation.ComObject;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;

/**
 * Used to obtain Namespace connections
 *
 * <p>uuid({76A64158-CB41-11D1-8B02-00600806D9B6})</p>
 * <p>interface(ISWbemLocator)</p>
 */
@ComObject(clsId = "{76A64158-CB41-11D1-8B02-00600806D9B6}")
public interface SWbemLocator extends IUnknown
    ,ISWbemLocator
{

}