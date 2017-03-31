
package eu.doppel_helix.jna.tlb.wbemdisp1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * A collection of Privilege Overrides
 *
 * <p>uuid({26EE67BF-5804-11D2-8B4A-00600806D9B6})</p>
 */
@ComInterface(iid="{26EE67BF-5804-11D2-8B4A-00600806D9B6}")
public interface ISWbemPrivilegeSet extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * Get a named Privilege from this collection
     *
     * <p>id(0x0)</p>
     * <p>vtableId(8)</p>
     * @param iPrivilege [in] {@code WbemPrivilegeEnum}
     */
    @ComMethod(name = "Item", dispId = 0x0)
    ISWbemPrivilege Item(WbemPrivilegeEnum iPrivilege);
            
    /**
     * The number of items in this collection
     *
     * <p>id(0x1)</p>
     * <p>vtableId(9)</p>
     */
    @ComProperty(name = "Count", dispId = 0x1)
    Integer getCount();
            
    /**
     * Add a Privilege to this collection
     *
     * <p>id(0x2)</p>
     * <p>vtableId(10)</p>
     * @param iPrivilege [in] {@code WbemPrivilegeEnum}
     * @param bIsEnabled [in, optional] {@code Boolean}
     */
    @ComMethod(name = "Add", dispId = 0x2)
    ISWbemPrivilege Add(WbemPrivilegeEnum iPrivilege,
            Object bIsEnabled);
            
    /**
     * Remove a Privilege from this collection
     *
     * <p>id(0x3)</p>
     * <p>vtableId(11)</p>
     * @param iPrivilege [in] {@code WbemPrivilegeEnum}
     */
    @ComMethod(name = "Remove", dispId = 0x3)
    void Remove(WbemPrivilegeEnum iPrivilege);
            
    /**
     * Delete all items in this collection
     *
     * <p>id(0x4)</p>
     * <p>vtableId(12)</p>
     */
    @ComMethod(name = "DeleteAll", dispId = 0x4)
    void DeleteAll();
            
    /**
     * Add a named Privilege to this collection
     *
     * <p>id(0x5)</p>
     * <p>vtableId(13)</p>
     * @param strPrivilege [in] {@code String}
     * @param bIsEnabled [in, optional] {@code Boolean}
     */
    @ComMethod(name = "AddAsString", dispId = 0x5)
    ISWbemPrivilege AddAsString(String strPrivilege,
            Object bIsEnabled);
            
    
}