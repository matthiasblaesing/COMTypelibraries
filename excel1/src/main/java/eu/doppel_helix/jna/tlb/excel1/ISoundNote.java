
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({0002087B-0001-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{0002087B-0001-0000-C000-000000000046}")
public interface ISoundNote {
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
     * <p>id(0x75)</p>
     */
    @ComMethod(name = "Delete", dispId = 0x75)
    com.sun.jna.platform.win32.WinNT.HRESULT Delete(VARIANT RHS);
            
    /**
     * <p>id(0x395)</p>
     */
    @ComMethod(name = "Import", dispId = 0x395)
    com.sun.jna.platform.win32.WinNT.HRESULT Import(String Filename,
            VARIANT RHS);
            
    /**
     * <p>id(0x396)</p>
     */
    @ComMethod(name = "Play", dispId = 0x396)
    com.sun.jna.platform.win32.WinNT.HRESULT Play(VARIANT RHS);
            
    /**
     * <p>id(0x397)</p>
     */
    @ComMethod(name = "Record", dispId = 0x397)
    com.sun.jna.platform.win32.WinNT.HRESULT Record(VARIANT RHS);
            
    
}