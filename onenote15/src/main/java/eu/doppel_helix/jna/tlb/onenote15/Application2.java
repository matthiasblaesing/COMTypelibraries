
package eu.doppel_helix.jna.tlb.onenote15;

import com.sun.jna.platform.win32.COM.COMException;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackCookie;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackListener;
import com.sun.jna.platform.win32.COM.util.IConnectionPoint;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.annotation.ComObject;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;

/**
 * Application2 Class
 *
 * <p>uuid({DC67E480-C3CB-49F8-8232-60B0C2056C8E})</p>
 * <p>source(IOneNoteEvents)</p>
 * <p>interface(IApplication)</p>
 * <p>interface(IConnectionPoint)</p>
 */
@ComObject(clsId = "{DC67E480-C3CB-49F8-8232-60B0C2056C8E}")
public interface Application2 extends IUnknown
    ,IApplication
    ,IConnectionPoint
{

}