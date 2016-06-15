
package eu.doppel_helix.jna.tlb.wia1;

import com.sun.jna.platform.win32.COM.COMException;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackCookie;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackListener;
import com.sun.jna.platform.win32.COM.util.IConnectionPoint;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.annotation.ComObject;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;

/**
 * The Rational object is a container for the rational values found in Exif tags. It is a supported element type of the Vector object and may be created using "WIA.Rational" in a call to CreateObject.
 *
 * <p>uuid({0C5672F9-3EDC-4B24-95B5-A6C54C0B79AD})</p>
 * <p>interface(IRational)</p>
 */
@ComObject(clsId = "{0C5672F9-3EDC-4B24-95B5-A6C54C0B79AD}")
public interface Rational extends IUnknown
    ,IRational
{

}