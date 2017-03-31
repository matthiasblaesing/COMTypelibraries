
package eu.doppel_helix.jna.tlb.wbemdisp1;

import com.sun.jna.platform.win32.COM.COMException;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackCookie;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackListener;
import com.sun.jna.platform.win32.COM.util.IConnectionPoint;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.annotation.ComObject;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;

/**
 * A Class or Instance
 *
 * <p>uuid({D6BDAFB2-9435-491F-BB87-6AA0F0BC31A2})</p>
 * <p>interface(ISWbemObjectEx)</p>
 */
@ComObject(clsId = "{D6BDAFB2-9435-491F-BB87-6AA0F0BC31A2}")
public interface SWbemObjectEx extends IUnknown
    ,ISWbemObjectEx
{

}