
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.COMException;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackCookie;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackListener;
import com.sun.jna.platform.win32.COM.util.IConnectionPoint;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.annotation.ComObject;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;

/**
 * <p>uuid({000610C4-0000-0000-C000-000000000046})</p>
 * <p>source(AccountsEvents)</p>
 * <p>interface(_Accounts)</p>
 * <p>interface(IConnectionPoint)</p>
 */
@ComObject(clsId = "{000610C4-0000-0000-C000-000000000046}")
public interface Accounts extends IUnknown
    ,_Accounts
    ,IConnectionPoint
{

}