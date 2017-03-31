
package eu.doppel_helix.jna.tlb.wbemdisp1;

import com.sun.jna.platform.win32.COM.COMException;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackCookie;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackListener;
import com.sun.jna.platform.win32.COM.util.IConnectionPoint;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.annotation.ComObject;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;

/**
 * A Security Configurator
 *
 * <p>uuid({B54D66E9-2287-11D2-8B33-00600806D9B6})</p>
 * <p>interface(ISWbemSecurity)</p>
 */
@ComObject(clsId = "{B54D66E9-2287-11D2-8B33-00600806D9B6}")
public interface SWbemSecurity extends IUnknown
    ,ISWbemSecurity
{

}