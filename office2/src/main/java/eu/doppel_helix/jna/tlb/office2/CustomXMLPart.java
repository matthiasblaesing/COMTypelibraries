
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.COMException;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackCookie;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackListener;
import com.sun.jna.platform.win32.COM.util.IConnectionPoint;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.annotation.ComObject;

/**
 * <p>uuid({000CDB08-0000-0000-C000-000000000046})</p>
 * <p>source(_CustomXMLPartEvents)</p>
 * <p>interface(_CustomXMLPart)</p>
 * <p>interface(IConnectionPoint)</p>
 * <p>interface(IUnknown)</p>
 */
@ComObject(clsId = "{000CDB08-0000-0000-C000-000000000046}")
public interface CustomXMLPart extends
    _CustomXMLPart,
    IConnectionPoint,
    IUnknown
{

}