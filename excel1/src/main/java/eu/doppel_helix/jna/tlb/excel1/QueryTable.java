
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.COMException;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackCookie;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackListener;
import com.sun.jna.platform.win32.COM.util.IConnectionPoint;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.annotation.ComObject;

/**
 * <p>uuid({59191DA1-EA47-11CE-A51F-00AA0061507F})</p>
 * <p>source(RefreshEvents)</p>
 * <p>interface(_QueryTable)</p>
 * <p>interface(IConnectionPoint)</p>
 * <p>interface(IUnknown)</p>
 */
@ComObject(clsId = "{59191DA1-EA47-11CE-A51F-00AA0061507F}")
public interface QueryTable extends
    _QueryTable,
    IConnectionPoint,
    IUnknown
{

}