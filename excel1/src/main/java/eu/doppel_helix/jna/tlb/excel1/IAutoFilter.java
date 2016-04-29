
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00024432-0001-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{00024432-0001-0000-C000-000000000046}")
public interface IAutoFilter {
    /**
     * <p>id(0x94)</p>
     */
    @ComProperty(name = "Application", dispId = 0x94)
    com.sun.jna.platform.win32.WinNT.HRESULT getApplication(VARIANT RHS);
            
    /**
     * <p>id(0x95)</p>
     */
    @ComProperty(name = "Creator", dispId = 0x95)
    com.sun.jna.platform.win32.WinNT.HRESULT getCreator(VARIANT RHS);
            
    /**
     * <p>id(0x96)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x96)
    com.sun.jna.platform.win32.WinNT.HRESULT getParent(VARIANT RHS);
            
    /**
     * <p>id(0xc5)</p>
     */
    @ComProperty(name = "Range", dispId = 0xc5)
    com.sun.jna.platform.win32.WinNT.HRESULT getRange(VARIANT RHS);
            
    /**
     * <p>id(0x651)</p>
     */
    @ComProperty(name = "Filters", dispId = 0x651)
    com.sun.jna.platform.win32.WinNT.HRESULT getFilters(VARIANT RHS);
            
    /**
     * <p>id(0x320)</p>
     */
    @ComProperty(name = "FilterMode", dispId = 0x320)
    com.sun.jna.platform.win32.WinNT.HRESULT getFilterMode(VARIANT RHS);
            
    /**
     * <p>id(0x370)</p>
     */
    @ComProperty(name = "Sort", dispId = 0x370)
    com.sun.jna.platform.win32.WinNT.HRESULT getSort(VARIANT RHS);
            
    /**
     * <p>id(0xa50)</p>
     */
    @ComMethod(name = "ApplyFilter", dispId = 0xa50)
    com.sun.jna.platform.win32.WinNT.HRESULT ApplyFilter();
            
    /**
     * <p>id(0x31a)</p>
     */
    @ComMethod(name = "ShowAllData", dispId = 0x31a)
    com.sun.jna.platform.win32.WinNT.HRESULT ShowAllData();
            
    
}