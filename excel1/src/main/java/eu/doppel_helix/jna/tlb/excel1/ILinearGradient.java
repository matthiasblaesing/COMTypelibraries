
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000244AF-0001-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000244AF-0001-0000-C000-000000000046}")
public interface ILinearGradient {
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
     * <p>id(0xac9)</p>
     */
    @ComProperty(name = "ColorStops", dispId = 0xac9)
    com.sun.jna.platform.win32.WinNT.HRESULT getColorStops(VARIANT RHS);
            
    /**
     * <p>id(0x657)</p>
     */
    @ComProperty(name = "Degree", dispId = 0x657)
    com.sun.jna.platform.win32.WinNT.HRESULT getDegree(VARIANT RHS);
            
    /**
     * <p>id(0x657)</p>
     */
    @ComProperty(name = "Degree", dispId = 0x657)
    com.sun.jna.platform.win32.WinNT.HRESULT setDegree(Double RHS);
            
    
}