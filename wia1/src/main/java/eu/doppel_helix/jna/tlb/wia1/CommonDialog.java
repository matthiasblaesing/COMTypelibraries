
package eu.doppel_helix.jna.tlb.wia1;

import com.sun.jna.platform.win32.COM.COMException;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackCookie;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackListener;
import com.sun.jna.platform.win32.COM.util.IConnectionPoint;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.annotation.ComObject;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;

/**
 * The CommonDialog control is an invisible-at-runtime control that contains all the methods that display a User Interface. A CommonDialog control can be created using "WIA.CommonDialog" in a call to CreateObject or by dropping a CommonDialog on a form.
 *
 * <p>uuid({850D1D11-70F3-4BE5-9A11-77AA6B2BB201})</p>
 * <p>interface(ICommonDialog)</p>
 */
@ComObject(clsId = "{850D1D11-70F3-4BE5-9A11-77AA6B2BB201}")
public interface CommonDialog extends IUnknown
    ,ICommonDialog
{

}