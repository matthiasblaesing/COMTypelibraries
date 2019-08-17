
package eu.doppel_helix.jna.tlb.onenote15;

import com.sun.jna.platform.win32.COM.COMException;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackCookie;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackListener;
import com.sun.jna.platform.win32.COM.util.IConnectionPoint;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.annotation.ComObject;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;

/**
 * Application Class
 *
 * <p>uuid({D7FAC39E-7FF1-49AA-98CF-A1DDD316337E})</p>
 * <p>source(IOneNoteEvents)</p>
 * <p>interface(IApplication)</p>
 * <p>interface(IConnectionPoint)</p>
 */
@ComObject(clsId = "{D7FAC39E-7FF1-49AA-98CF-A1DDD316337E}")
public interface Application extends IUnknown
    ,IApplication
    ,IConnectionPoint
{

}