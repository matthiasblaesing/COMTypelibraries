
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.COMException;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackCookie;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackListener;
import com.sun.jna.platform.win32.COM.util.IConnectionPoint;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.annotation.ComObject;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;

/**
 * <p>uuid({55F88893-7708-11D1-ACEB-006008961DA5})</p>
 * <p>source(_CommandBarsEvents)</p>
 * <p>interface(_CommandBars)</p>
 * <p>interface(IConnectionPoint)</p>
 */
@ComObject(clsId = "{55F88893-7708-11D1-ACEB-006008961DA5}")
public interface CommandBars extends IUnknown
    ,_CommandBars
    ,IConnectionPoint
{

}