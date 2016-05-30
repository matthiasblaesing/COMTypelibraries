
package eu.doppel_helix.jna.tlb.wia1;

import com.sun.jna.platform.win32.COM.COMException;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackCookie;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackListener;
import com.sun.jna.platform.win32.COM.util.IConnectionPoint;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.annotation.ComObject;

/**
 * The ImageProcess object manages the filter chain. An ImageProcess object can be created using "WIA.ImageProcess" in a call to CreateObject.
 *
 * <p>uuid({BD0D38E4-74C8-4904-9B5A-269F8E9994E9})</p>
 * <p>interface(IImageProcess)</p>
 * <p>interface(IUnknown)</p>
 */
@ComObject(clsId = "{BD0D38E4-74C8-4904-9B5A-269F8E9994E9}")
public interface ImageProcess extends
    IImageProcess,
    IUnknown
{

}