
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000C1733-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000C1733-0000-0000-C000-000000000046}")
public interface IMsoCategory extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x96)</p>
     * <p>vtableId(7)</p>
     * @param RHS [out] {@code com.sun.jna.platform.win32.COM.util.IDispatch}
     */
    @ComProperty(name = "Parent", dispId = 0x96)
    com.sun.jna.platform.win32.WinNT.HRESULT getParent(VARIANT RHS);
            
    /**
     * <p>id(0x6e)</p>
     * <p>vtableId(8)</p>
     * @param pbstr [out] {@code String}
     */
    @ComProperty(name = "Name", dispId = 0x6e)
    com.sun.jna.platform.win32.WinNT.HRESULT getName(VARIANT pbstr);
            
    /**
     * <p>id(0xb47)</p>
     * <p>vtableId(9)</p>
     * @param pfIsFiltered [out] {@code Boolean}
     */
    @ComProperty(name = "IsFiltered", dispId = 0xb47)
    com.sun.jna.platform.win32.WinNT.HRESULT getIsFiltered(VARIANT pfIsFiltered);
            
    /**
     * <p>id(0xb47)</p>
     * <p>vtableId(10)</p>
     * @param pfIsFiltered [in] {@code Boolean}
     */
    @ComProperty(name = "IsFiltered", dispId = 0xb47)
    com.sun.jna.platform.win32.WinNT.HRESULT setIsFiltered(Boolean pfIsFiltered);
            
    
}