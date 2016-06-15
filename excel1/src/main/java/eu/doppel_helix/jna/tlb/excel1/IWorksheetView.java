
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00024487-0001-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{00024487-0001-0000-C000-000000000046}")
public interface IWorksheetView extends IUnknown, IRawDispatchHandle, IDispatch {
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
     * <p>id(0x2ef)</p>
     */
    @ComProperty(name = "Sheet", dispId = 0x2ef)
    com.sun.jna.platform.win32.WinNT.HRESULT getSheet(VARIANT RHS);
            
    /**
     * <p>id(0x285)</p>
     */
    @ComProperty(name = "DisplayGridlines", dispId = 0x285)
    com.sun.jna.platform.win32.WinNT.HRESULT getDisplayGridlines(VARIANT RHS);
            
    /**
     * <p>id(0x285)</p>
     */
    @ComProperty(name = "DisplayGridlines", dispId = 0x285)
    com.sun.jna.platform.win32.WinNT.HRESULT setDisplayGridlines(Boolean RHS);
            
    /**
     * <p>id(0x284)</p>
     */
    @ComProperty(name = "DisplayFormulas", dispId = 0x284)
    com.sun.jna.platform.win32.WinNT.HRESULT getDisplayFormulas(VARIANT RHS);
            
    /**
     * <p>id(0x284)</p>
     */
    @ComProperty(name = "DisplayFormulas", dispId = 0x284)
    com.sun.jna.platform.win32.WinNT.HRESULT setDisplayFormulas(Boolean RHS);
            
    /**
     * <p>id(0x286)</p>
     */
    @ComProperty(name = "DisplayHeadings", dispId = 0x286)
    com.sun.jna.platform.win32.WinNT.HRESULT getDisplayHeadings(VARIANT RHS);
            
    /**
     * <p>id(0x286)</p>
     */
    @ComProperty(name = "DisplayHeadings", dispId = 0x286)
    com.sun.jna.platform.win32.WinNT.HRESULT setDisplayHeadings(Boolean RHS);
            
    /**
     * <p>id(0x287)</p>
     */
    @ComProperty(name = "DisplayOutline", dispId = 0x287)
    com.sun.jna.platform.win32.WinNT.HRESULT getDisplayOutline(VARIANT RHS);
            
    /**
     * <p>id(0x287)</p>
     */
    @ComProperty(name = "DisplayOutline", dispId = 0x287)
    com.sun.jna.platform.win32.WinNT.HRESULT setDisplayOutline(Boolean RHS);
            
    /**
     * <p>id(0x289)</p>
     */
    @ComProperty(name = "DisplayZeros", dispId = 0x289)
    com.sun.jna.platform.win32.WinNT.HRESULT getDisplayZeros(VARIANT RHS);
            
    /**
     * <p>id(0x289)</p>
     */
    @ComProperty(name = "DisplayZeros", dispId = 0x289)
    com.sun.jna.platform.win32.WinNT.HRESULT setDisplayZeros(Boolean RHS);
            
    
}