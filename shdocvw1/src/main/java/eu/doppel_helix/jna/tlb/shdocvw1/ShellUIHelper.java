
package eu.doppel_helix.jna.tlb.shdocvw1;

import com.sun.jna.platform.win32.COM.COMException;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackCookie;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackListener;
import com.sun.jna.platform.win32.COM.util.IConnectionPoint;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.annotation.ComObject;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;

/**
 * <p>uuid({64AB4BB7-111E-11D1-8F79-00C04FC2FBE1})</p>
 * <p>interface(IShellUIHelper9)</p>
 */
@ComObject(clsId = "{64AB4BB7-111E-11D1-8F79-00C04FC2FBE1}")
public interface ShellUIHelper extends IUnknown
    ,IShellUIHelper9
{

}