
package eu.doppel_helix.jna.tlb.wia1;

import com.sun.jna.platform.win32.COM.COMException;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackCookie;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackListener;
import com.sun.jna.platform.win32.COM.util.IConnectionPoint;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.annotation.ComObject;

/**
 * The Filter object represents a unit of modification on an ImageFile. To use a Filter, add it to the Filters collection, then set the filter's properties and finally use the Apply method of the ImageProcess object to filter an ImageFile.
 *
 * <p>uuid({52AD8A74-F064-4F4C-8544-FF494D349F7B})</p>
 * <p>interface(IFilter)</p>
 * <p>interface(IUnknown)</p>
 */
@ComObject(clsId = "{52AD8A74-F064-4F4C-8544-FF494D349F7B}")
public interface Filter extends
    IFilter,
    IUnknown
{

}