
package eu.doppel_helix.jna.tlb.wia1;

import com.sun.jna.platform.win32.COM.COMException;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackCookie;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackListener;
import com.sun.jna.platform.win32.COM.util.IConnectionPoint;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.annotation.ComObject;

/**
 * The Filters object is a collection of the Filters that will be applied to an ImageFile when you call the Apply method on the ImageProcess object.
 *
 * <p>uuid({31CDD60C-C04C-424D-95FC-36A52646D71C})</p>
 * <p>interface(IFilters)</p>
 * <p>interface(IUnknown)</p>
 */
@ComObject(clsId = "{31CDD60C-C04C-424D-95FC-36A52646D71C}")
public interface Filters extends
    IFilters,
    IUnknown
{

}