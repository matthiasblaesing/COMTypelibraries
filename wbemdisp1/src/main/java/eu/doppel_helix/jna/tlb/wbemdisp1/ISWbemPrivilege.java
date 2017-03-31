
package eu.doppel_helix.jna.tlb.wbemdisp1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * A Privilege Override
 *
 * <p>uuid({26EE67BD-5804-11D2-8B4A-00600806D9B6})</p>
 */
@ComInterface(iid="{26EE67BD-5804-11D2-8B4A-00600806D9B6}")
public interface ISWbemPrivilege extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * Whether the Privilege is to be enabled or disabled
     *
     * <p>id(0x0)</p>
     * <p>vtableId(7)</p>
     */
    @ComProperty(name = "IsEnabled", dispId = 0x0)
    Boolean getIsEnabled();
            
    /**
     * Whether the Privilege is to be enabled or disabled
     *
     * <p>id(0x0)</p>
     * <p>vtableId(8)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "IsEnabled", dispId = 0x0)
    void setIsEnabled(Boolean param0);
            
    /**
     * The name of the Privilege
     *
     * <p>id(0x1)</p>
     * <p>vtableId(9)</p>
     */
    @ComProperty(name = "Name", dispId = 0x1)
    String getName();
            
    /**
     * The display name of the Privilege
     *
     * <p>id(0x2)</p>
     * <p>vtableId(10)</p>
     */
    @ComProperty(name = "DisplayName", dispId = 0x2)
    String getDisplayName();
            
    /**
     * The Privilege identifier
     *
     * <p>id(0x3)</p>
     * <p>vtableId(11)</p>
     */
    @ComProperty(name = "Identifier", dispId = 0x3)
    WbemPrivilegeEnum getIdentifier();
            
    
}