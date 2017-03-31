
package eu.doppel_helix.jna.tlb.wbemdisp1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * An Event source
 *
 * <p>uuid({27D54D92-0EBE-11D2-8B22-00600806D9B6})</p>
 */
@ComInterface(iid="{27D54D92-0EBE-11D2-8B22-00600806D9B6}")
public interface ISWbemEventSource extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * Retrieve the next event within a specified time period. The timeout is specified in milliseconds.
     *
     * <p>id(0x1)</p>
     * <p>vtableId(7)</p>
     * @param iTimeoutMs [in, optional] {@code Integer}
     */
    @ComMethod(name = "NextEvent", dispId = 0x1)
    ISWbemObject NextEvent(Object iTimeoutMs);
            
    /**
     * The Security Configurator for this Object
     *
     * <p>id(0x2)</p>
     * <p>vtableId(8)</p>
     */
    @ComProperty(name = "Security_", dispId = 0x2)
    ISWbemSecurity getSecurity_();
            
    
}