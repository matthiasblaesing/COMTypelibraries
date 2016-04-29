
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000244DD-0001-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000244DD-0001-0000-C000-000000000046}")
public interface IChartCategory {
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
     * <p>id(0x6e)</p>
     */
    @ComProperty(name = "Name", dispId = 0x6e)
    com.sun.jna.platform.win32.WinNT.HRESULT getName(VARIANT RHS);
            
    /**
     * <p>id(0xc0b)</p>
     */
    @ComProperty(name = "IsFiltered", dispId = 0xc0b)
    com.sun.jna.platform.win32.WinNT.HRESULT getIsFiltered(VARIANT RHS);
            
    /**
     * <p>id(0xc0b)</p>
     */
    @ComProperty(name = "IsFiltered", dispId = 0xc0b)
    com.sun.jna.platform.win32.WinNT.HRESULT setIsFiltered(Boolean RHS);
            
    
}