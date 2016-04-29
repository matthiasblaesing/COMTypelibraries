
package eu.doppel_helix.jna.tlb.vbide5;

import com.sun.jna.platform.win32.COM.COMException;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackCookie;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackListener;
import com.sun.jna.platform.win32.COM.util.IConnectionPoint;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.annotation.ComObject;

/**
 * <p>uuid({BE39F3D7-1B13-11D0-887F-00A0C90F2744})</p>
 * <p>interface(_VBComponents)</p>
 * <p>interface(IUnknown)</p>
 */
@ComObject(clsId = "{BE39F3D7-1B13-11D0-887F-00A0C90F2744}")
public interface VBComponents extends
    _VBComponents,
    IUnknown
{

}