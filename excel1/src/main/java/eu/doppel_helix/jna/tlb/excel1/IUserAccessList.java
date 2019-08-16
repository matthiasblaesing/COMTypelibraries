
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({0002446C-0001-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{0002446C-0001-0000-C000-000000000046}")
public interface IUserAccessList extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x76)</p>
     * <p>vtableId(7)</p>
     * @param RHS [out] {@code Integer}
     */
    @ComProperty(name = "Count", dispId = 0x76)
    com.sun.jna.platform.win32.WinNT.HRESULT getCount(VARIANT RHS);
            
    /**
     * <p>id(0xaa)</p>
     * <p>vtableId(8)</p>
     * @param Index [in] {@code Object}
     * @param RHS [out] {@code UserAccess}
     */
    @ComProperty(name = "Item", dispId = 0xaa)
    com.sun.jna.platform.win32.WinNT.HRESULT getItem(Object Index,
            VARIANT RHS);
            
    /**
     * <p>id(0xb5)</p>
     * <p>vtableId(9)</p>
     * @param Name [in] {@code String}
     * @param AllowEdit [in] {@code Boolean}
     * @param RHS [out] {@code UserAccess}
     */
    @ComMethod(name = "Add", dispId = 0xb5)
    com.sun.jna.platform.win32.WinNT.HRESULT Add(String Name,
            Boolean AllowEdit,
            VARIANT RHS);
            
    /**
     * <p>id(0x8bf)</p>
     * <p>vtableId(10)</p>
     */
    @ComMethod(name = "DeleteAll", dispId = 0x8bf)
    com.sun.jna.platform.win32.WinNT.HRESULT DeleteAll();
            
    /**
     * <p>id(0x0)</p>
     * <p>vtableId(11)</p>
     * @param Index [in] {@code Object}
     * @param RHS [out] {@code UserAccess}
     */
    @ComProperty(name = "_Default", dispId = 0x0)
    com.sun.jna.platform.win32.WinNT.HRESULT get_Default(Object Index,
            VARIANT RHS);
            
    
}