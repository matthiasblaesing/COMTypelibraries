
package eu.doppel_helix.jna.tlb.wia1;

import com.sun.jna.platform.win32.COM.COMException;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackCookie;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackListener;
import com.sun.jna.platform.win32.COM.util.IConnectionPoint;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.annotation.ComObject;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;

/**
 * The FilterInfo object is a container that describes a Filter object without requiring a Filter to be Added to the process chain. See the FilterInfos property on the ImageProcess object for details on accessing FilterInfo objects.
 *
 * <p>uuid({318D6B52-9B1C-4E3B-8D90-1F0E857FA9B0})</p>
 * <p>interface(IFilterInfo)</p>
 */
@ComObject(clsId = "{318D6B52-9B1C-4E3B-8D90-1F0E857FA9B0}")
public interface FilterInfo extends IUnknown
    ,IFilterInfo
{

}