
package eu.doppel_helix.jna.tlb.vbide5;

import com.sun.jna.platform.win32.COM.COMException;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackCookie;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackListener;
import com.sun.jna.platform.win32.COM.util.IConnectionPoint;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.annotation.ComObject;

/**
 * <p>uuid({32CDF9E0-1602-11CE-BFDC-08002B2B8CDA})</p>
 * <p>interface(_ProjectTemplate)</p>
 * <p>interface(IUnknown)</p>
 */
@ComObject(clsId = "{32CDF9E0-1602-11CE-BFDC-08002B2B8CDA}")
public interface ProjectTemplate extends
    _ProjectTemplate,
    IUnknown
{

}