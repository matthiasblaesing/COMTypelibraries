
package eu.doppel_helix.jna.tlb.wbemdisp1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * A Security Configurator
 *
 * <p>uuid({B54D66E6-2287-11D2-8B33-00600806D9B6})</p>
 */
@ComInterface(iid="{B54D66E6-2287-11D2-8B33-00600806D9B6}")
public interface ISWbemSecurity extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * The security impersonation level
     *
     * <p>id(0x1)</p>
     * <p>vtableId(7)</p>
     */
    @ComProperty(name = "ImpersonationLevel", dispId = 0x1)
    WbemImpersonationLevelEnum getImpersonationLevel();
            
    /**
     * The security impersonation level
     *
     * <p>id(0x1)</p>
     * <p>vtableId(8)</p>
     * @param param0 [in] {@code WbemImpersonationLevelEnum}
     */
    @ComProperty(name = "ImpersonationLevel", dispId = 0x1)
    void setImpersonationLevel(WbemImpersonationLevelEnum param0);
            
    /**
     * The security authentication level
     *
     * <p>id(0x2)</p>
     * <p>vtableId(9)</p>
     */
    @ComProperty(name = "AuthenticationLevel", dispId = 0x2)
    WbemAuthenticationLevelEnum getAuthenticationLevel();
            
    /**
     * The security authentication level
     *
     * <p>id(0x2)</p>
     * <p>vtableId(10)</p>
     * @param param0 [in] {@code WbemAuthenticationLevelEnum}
     */
    @ComProperty(name = "AuthenticationLevel", dispId = 0x2)
    void setAuthenticationLevel(WbemAuthenticationLevelEnum param0);
            
    /**
     * The collection of privileges for this object
     *
     * <p>id(0x3)</p>
     * <p>vtableId(11)</p>
     */
    @ComProperty(name = "Privileges", dispId = 0x3)
    ISWbemPrivilegeSet getPrivileges();
            
    
}