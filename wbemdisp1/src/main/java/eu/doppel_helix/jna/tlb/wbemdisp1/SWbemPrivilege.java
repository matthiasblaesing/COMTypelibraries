
package eu.doppel_helix.jna.tlb.wbemdisp1;

import com.sun.jna.platform.win32.COM.COMException;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackCookie;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackListener;
import com.sun.jna.platform.win32.COM.util.IConnectionPoint;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.annotation.ComObject;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;

/**
 * A Privilege Override
 *
 * <p>uuid({26EE67BC-5804-11D2-8B4A-00600806D9B6})</p>
 * <p>interface(ISWbemPrivilege)</p>
 */
@ComObject(clsId = "{26EE67BC-5804-11D2-8B4A-00600806D9B6}")
public interface SWbemPrivilege extends IUnknown
    ,ISWbemPrivilege
{

}