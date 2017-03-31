
package eu.doppel_helix.jna.tlb.wbemdisp1;

import com.sun.jna.platform.win32.COM.COMException;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackCookie;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackListener;
import com.sun.jna.platform.win32.COM.util.IConnectionPoint;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.annotation.ComObject;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;

/**
 * Object Path
 *
 * <p>uuid({5791BC26-CE9C-11D1-97BF-0000F81E849C})</p>
 * <p>interface(ISWbemObjectPath)</p>
 */
@ComObject(clsId = "{5791BC26-CE9C-11D1-97BF-0000F81E849C}")
public interface SWbemObjectPath extends IUnknown
    ,ISWbemObjectPath
{

}