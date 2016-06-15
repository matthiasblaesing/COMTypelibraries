
package eu.doppel_helix.jna.tlb.shdocvw1;

import com.sun.jna.platform.win32.COM.COMException;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackCookie;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackListener;
import com.sun.jna.platform.win32.COM.util.IConnectionPoint;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.annotation.ComObject;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;

/**
 * <p>uuid({EFD01300-160F-11D2-BB2E-00805FF7EFCA})</p>
 * <p>interface(IScriptErrorList)</p>
 */
@ComObject(clsId = "{EFD01300-160F-11D2-BB2E-00805FF7EFCA}")
public interface CScriptErrorList extends IUnknown
    ,IScriptErrorList
{

}