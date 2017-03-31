
package eu.doppel_helix.jna.tlb.wbemdisp1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * Used to obtain Namespace connections
 *
 * <p>uuid({76A6415B-CB41-11D1-8B02-00600806D9B6})</p>
 */
@ComInterface(iid="{76A6415B-CB41-11D1-8B02-00600806D9B6}")
public interface ISWbemLocator extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * Connect to a Namespace
     *
     * <p>id(0x1)</p>
     * <p>vtableId(7)</p>
     * @param strServer [in, optional] {@code String}
     * @param strNamespace [in, optional] {@code String}
     * @param strUser [in, optional] {@code String}
     * @param strPassword [in, optional] {@code String}
     * @param strLocale [in, optional] {@code String}
     * @param strAuthority [in, optional] {@code String}
     * @param iSecurityFlags [in, optional] {@code Integer}
     * @param objWbemNamedValueSet [in, optional] {@code com.sun.jna.platform.win32.COM.util.IDispatch}
     */
    @ComMethod(name = "ConnectServer", dispId = 0x1)
    ISWbemServices ConnectServer(Object strServer,
            Object strNamespace,
            Object strUser,
            Object strPassword,
            Object strLocale,
            Object strAuthority,
            Object iSecurityFlags,
            Object objWbemNamedValueSet);
            
    /**
     * The Security Configurator for this Object
     *
     * <p>id(0x2)</p>
     * <p>vtableId(8)</p>
     */
    @ComProperty(name = "Security_", dispId = 0x2)
    ISWbemSecurity getSecurity_();
            
    
}