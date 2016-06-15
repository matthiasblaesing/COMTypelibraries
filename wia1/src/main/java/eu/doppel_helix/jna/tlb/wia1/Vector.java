
package eu.doppel_helix.jna.tlb.wia1;

import com.sun.jna.platform.win32.COM.COMException;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackCookie;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackListener;
import com.sun.jna.platform.win32.COM.util.IConnectionPoint;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.annotation.ComObject;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;

/**
 * The Vector object is a collection of values of the same type. It is used throughout the library in many different ways. The Vector object may be created using "WIA.Vector" in a call to CreateObject.
 *
 * <p>uuid({4DD1D1C3-B36A-4EB4-AAEF-815891A58A30})</p>
 * <p>interface(IVector)</p>
 */
@ComObject(clsId = "{4DD1D1C3-B36A-4EB4-AAEF-815891A58A30}")
public interface Vector extends IUnknown
    ,IVector
{

}