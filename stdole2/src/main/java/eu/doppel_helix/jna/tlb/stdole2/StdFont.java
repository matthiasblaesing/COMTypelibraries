
package eu.doppel_helix.jna.tlb.stdole2;

import com.sun.jna.platform.win32.COM.COMException;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackCookie;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackListener;
import com.sun.jna.platform.win32.COM.util.IConnectionPoint;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.annotation.ComObject;

/**
 * <p>uuid({0BE35203-8F91-11CE-9DE3-00AA004BB851})</p>
 * <p>source(FontEvents)</p>
 * <p>interface(Font)</p>
 * <p>interface(IConnectionPoint)</p>
 * <p>interface(IUnknown)</p>
 */
@ComObject(clsId = "{0BE35203-8F91-11CE-9DE3-00AA004BB851}")
public interface StdFont extends
    Font,
    IConnectionPoint,
    IUnknown
{

}