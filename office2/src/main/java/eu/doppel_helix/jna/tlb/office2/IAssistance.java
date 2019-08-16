
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({4291224C-DEFE-485B-8E69-6CF8AA85CB76})</p>
 */
@ComInterface(iid="{4291224C-DEFE-485B-8E69-6CF8AA85CB76}")
public interface IAssistance extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * ShowHelp Method
     *
     * <p>id(0x60020000)</p>
     * <p>vtableId(7)</p>
     * @param HelpId [in, optional] {@code String}
     * @param Scope [in, optional] {@code String}
     */
    @ComMethod(name = "ShowHelp", dispId = 0x60020000)
    void ShowHelp(String HelpId,
            String Scope);
            
    /**
     * SearchHelp Method
     *
     * <p>id(0x60020001)</p>
     * <p>vtableId(8)</p>
     * @param Query [in] {@code String}
     * @param Scope [in, optional] {@code String}
     */
    @ComMethod(name = "SearchHelp", dispId = 0x60020001)
    void SearchHelp(String Query,
            String Scope);
            
    /**
     * SetDefaultContext Method
     *
     * <p>id(0x60020002)</p>
     * <p>vtableId(9)</p>
     * @param HelpId [in] {@code String}
     */
    @ComMethod(name = "SetDefaultContext", dispId = 0x60020002)
    void SetDefaultContext(String HelpId);
            
    /**
     * ClearDefaultContext Method
     *
     * <p>id(0x60020003)</p>
     * <p>vtableId(10)</p>
     * @param HelpId [in] {@code String}
     */
    @ComMethod(name = "ClearDefaultContext", dispId = 0x60020003)
    void ClearDefaultContext(String HelpId);
            
    
}