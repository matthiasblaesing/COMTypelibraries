
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000C1734-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000C1734-0000-0000-C000-000000000046}")
public interface CategoryCollection extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x96)</p>
     * <p>vtableId(7)</p>
     * @param RHS [out] {@code com.sun.jna.platform.win32.COM.util.IDispatch}
     */
    @ComProperty(name = "Parent", dispId = 0x96)
    com.sun.jna.platform.win32.WinNT.HRESULT getParent(VARIANT RHS);
            
    /**
     * <p>id(0x76)</p>
     * <p>vtableId(8)</p>
     * @param cCategory [out] {@code Integer}
     */
    @ComProperty(name = "Count", dispId = 0x76)
    com.sun.jna.platform.win32.WinNT.HRESULT getCount(VARIANT cCategory);
            
    /**
     * <p>id(0xaa)</p>
     * <p>vtableId(9)</p>
     * @param Index [in] {@code Object}
     * @param ppcategory [out] {@code IMsoCategory}
     */
    @ComMethod(name = "Item", dispId = 0xaa)
    com.sun.jna.platform.win32.WinNT.HRESULT Item(Object Index,
            VARIANT ppcategory);
            
    /**
     * <p>id(0x94)</p>
     * <p>vtableId(10)</p>
     * @param ppval [out] {@code com.sun.jna.platform.win32.COM.util.IDispatch}
     */
    @ComProperty(name = "Application", dispId = 0x94)
    com.sun.jna.platform.win32.WinNT.HRESULT getApplication(VARIANT ppval);
            
    /**
     * <p>id(0x95)</p>
     * <p>vtableId(11)</p>
     * @param pval [out] {@code Integer}
     */
    @ComProperty(name = "Creator", dispId = 0x95)
    com.sun.jna.platform.win32.WinNT.HRESULT getCreator(VARIANT pval);
            
    /**
     * <p>id(0x0)</p>
     * <p>vtableId(12)</p>
     * @param Index [in] {@code Object}
     * @param RHS [out] {@code IMsoCategory}
     */
    @ComProperty(name = "_Default", dispId = 0x0)
    com.sun.jna.platform.win32.WinNT.HRESULT get_Default(Object Index,
            VARIANT RHS);
            
    
}