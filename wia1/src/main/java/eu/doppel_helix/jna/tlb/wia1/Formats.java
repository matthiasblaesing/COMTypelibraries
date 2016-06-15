
package eu.doppel_helix.jna.tlb.wia1;

import com.sun.jna.platform.win32.COM.COMException;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackCookie;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackListener;
import com.sun.jna.platform.win32.COM.util.IConnectionPoint;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.annotation.ComObject;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;

/**
 * The Formats object is a collection of supported FormatIDs that you can use when calling Transfer on an Item object or ShowTransfer on a CommonDialog object for this Item.
 *
 * <p>uuid({6F62E261-0FE6-476B-A244-50CF7440DDEB})</p>
 * <p>interface(IFormats)</p>
 */
@ComObject(clsId = "{6F62E261-0FE6-476B-A244-50CF7440DDEB}")
public interface Formats extends IUnknown
    ,IFormats
{

}