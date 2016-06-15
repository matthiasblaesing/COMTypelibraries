
package eu.doppel_helix.jna.tlb.vbide5;

import com.sun.jna.platform.win32.COM.COMException;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackCookie;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackListener;
import com.sun.jna.platform.win32.COM.util.IConnectionPoint;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.annotation.ComObject;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;

/**
 * <p>uuid({DA936B63-AC8B-11D1-B6E5-00A0C90F2744})</p>
 * <p>interface(_AddIns)</p>
 */
@ComObject(clsId = "{DA936B63-AC8B-11D1-B6E5-00A0C90F2744}")
public interface Addins extends IUnknown
    ,_AddIns
{

}