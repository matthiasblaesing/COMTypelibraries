
package eu.doppel_helix.jna.tlb.wia1;

import com.sun.jna.platform.win32.COM.COMException;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackCookie;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackListener;
import com.sun.jna.platform.win32.COM.util.IConnectionPoint;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.annotation.ComObject;

/**
 * The ImageFile object is a container for images transferred to your computer when you call Transfer or ShowTransfer. It also supports image files through LoadFile. An ImageFile object can be created using "WIA.ImageFile" in a call to CreateObject.
 *
 * <p>uuid({A2E6DDA0-06EF-4DF3-B7BD-5AA224BB06E8})</p>
 * <p>interface(IImageFile)</p>
 * <p>interface(IUnknown)</p>
 */
@ComObject(clsId = "{A2E6DDA0-06EF-4DF3-B7BD-5AA224BB06E8}")
public interface ImageFile extends
    IImageFile,
    IUnknown
{

}