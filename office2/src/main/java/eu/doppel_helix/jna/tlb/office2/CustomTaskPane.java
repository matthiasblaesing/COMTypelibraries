
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.COMException;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackCookie;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackListener;
import com.sun.jna.platform.win32.COM.util.IConnectionPoint;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.annotation.ComObject;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;

/**
 * <p>uuid({C5771BE5-A188-466B-AB31-00A6A32B1B1C})</p>
 * <p>source(_CustomTaskPaneEvents)</p>
 * <p>interface(_CustomTaskPane)</p>
 * <p>interface(IConnectionPoint)</p>
 */
@ComObject(clsId = "{C5771BE5-A188-466B-AB31-00A6A32B1B1C}")
public interface CustomTaskPane extends IUnknown
    ,_CustomTaskPane
    ,IConnectionPoint
{

}