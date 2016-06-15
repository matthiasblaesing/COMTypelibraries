
package eu.doppel_helix.jna.tlb.vbide5;

import com.sun.jna.platform.win32.COM.COMException;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackCookie;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackListener;
import com.sun.jna.platform.win32.COM.util.IConnectionPoint;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.annotation.ComObject;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;

/**
 * <p>uuid({BE39F3D6-1B13-11D0-887F-00A0C90F2744})</p>
 * <p>interface(_Components)</p>
 */
@ComObject(clsId = "{BE39F3D6-1B13-11D0-887F-00A0C90F2744}")
public interface Components extends IUnknown
    ,_Components
{

}