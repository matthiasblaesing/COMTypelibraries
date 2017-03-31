
package eu.doppel_helix.jna.tlb.wbemdisp1;

import com.sun.jna.platform.win32.COM.COMException;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackCookie;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackListener;
import com.sun.jna.platform.win32.COM.util.IConnectionPoint;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.annotation.ComObject;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;

/**
 * A collection of Privilege Overrides
 *
 * <p>uuid({26EE67BE-5804-11D2-8B4A-00600806D9B6})</p>
 * <p>interface(ISWbemPrivilegeSet)</p>
 */
@ComObject(clsId = "{26EE67BE-5804-11D2-8B4A-00600806D9B6}")
public interface SWbemPrivilegeSet extends IUnknown
    ,ISWbemPrivilegeSet
{

}