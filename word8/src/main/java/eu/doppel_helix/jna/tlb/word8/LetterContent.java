
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.COMException;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackCookie;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackListener;
import com.sun.jna.platform.win32.COM.util.IConnectionPoint;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.annotation.ComObject;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;

/**
 * <p>uuid({000209F1-0000-0000-C000-000000000046})</p>
 * <p>interface(_LetterContent)</p>
 */
@ComObject(clsId = "{000209F1-0000-0000-C000-000000000046}")
public interface LetterContent extends IUnknown
    ,_LetterContent
{

}