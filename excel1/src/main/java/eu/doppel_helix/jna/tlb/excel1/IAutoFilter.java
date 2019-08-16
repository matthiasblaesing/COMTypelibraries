
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00024432-0001-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{00024432-0001-0000-C000-000000000046}")
public interface IAutoFilter extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x94)</p>
     * <p>vtableId(7)</p>
     * @param RHS [out] {@code Application}
     */
    @ComProperty(name = "Application", dispId = 0x94)
    com.sun.jna.platform.win32.WinNT.HRESULT getApplication(VARIANT RHS);
            
    /**
     * <p>id(0x95)</p>
     * <p>vtableId(8)</p>
     * @param RHS [out] {@code XlCreator}
     */
    @ComProperty(name = "Creator", dispId = 0x95)
    com.sun.jna.platform.win32.WinNT.HRESULT getCreator(VARIANT RHS);
            
    /**
     * <p>id(0x96)</p>
     * <p>vtableId(9)</p>
     * @param RHS [out] {@code com.sun.jna.platform.win32.COM.util.IDispatch}
     */
    @ComProperty(name = "Parent", dispId = 0x96)
    com.sun.jna.platform.win32.WinNT.HRESULT getParent(VARIANT RHS);
            
    /**
     * <p>id(0xc5)</p>
     * <p>vtableId(10)</p>
     * @param RHS [out] {@code Range}
     */
    @ComProperty(name = "Range", dispId = 0xc5)
    com.sun.jna.platform.win32.WinNT.HRESULT getRange(VARIANT RHS);
            
    /**
     * <p>id(0x651)</p>
     * <p>vtableId(11)</p>
     * @param RHS [out] {@code Filters}
     */
    @ComProperty(name = "Filters", dispId = 0x651)
    com.sun.jna.platform.win32.WinNT.HRESULT getFilters(VARIANT RHS);
            
    /**
     * <p>id(0x320)</p>
     * <p>vtableId(12)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "FilterMode", dispId = 0x320)
    com.sun.jna.platform.win32.WinNT.HRESULT getFilterMode(VARIANT RHS);
            
    /**
     * <p>id(0x370)</p>
     * <p>vtableId(13)</p>
     * @param RHS [out] {@code Sort}
     */
    @ComProperty(name = "Sort", dispId = 0x370)
    com.sun.jna.platform.win32.WinNT.HRESULT getSort(VARIANT RHS);
            
    /**
     * <p>id(0xa50)</p>
     * <p>vtableId(14)</p>
     */
    @ComMethod(name = "ApplyFilter", dispId = 0xa50)
    com.sun.jna.platform.win32.WinNT.HRESULT ApplyFilter();
            
    /**
     * <p>id(0x31a)</p>
     * <p>vtableId(15)</p>
     */
    @ComMethod(name = "ShowAllData", dispId = 0x31a)
    com.sun.jna.platform.win32.WinNT.HRESULT ShowAllData();
            
    
}