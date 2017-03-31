
package eu.doppel_helix.jna.tlb.wbemdisp1;

import com.sun.jna.platform.win32.COM.COMException;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackCookie;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackListener;
import com.sun.jna.platform.win32.COM.util.IConnectionPoint;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.annotation.ComObject;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;

/**
 * A connection to a Namespace
 *
 * <p>uuid({62E522DC-8CF3-40A8-8B2E-37D595651E40})</p>
 * <p>interface(ISWbemServicesEx)</p>
 */
@ComObject(clsId = "{62E522DC-8CF3-40A8-8B2E-37D595651E40}")
public interface SWbemServicesEx extends IUnknown
    ,ISWbemServicesEx
{

}