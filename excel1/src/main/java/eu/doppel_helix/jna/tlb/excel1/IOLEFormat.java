
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00024441-0001-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{00024441-0001-0000-C000-000000000046}")
public interface IOLEFormat {
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
     * <p>id(0x130)</p>
     */
    @ComMethod(name = "Activate", dispId = 0x130)
    com.sun.jna.platform.win32.WinNT.HRESULT Activate();
            
    /**
     * <p>id(0x419)</p>
     */
    @ComProperty(name = "Object", dispId = 0x419)
    com.sun.jna.platform.win32.WinNT.HRESULT getObject(VARIANT RHS);
            
    /**
     * <p>id(0x5f3)</p>
     */
    @ComProperty(name = "progID", dispId = 0x5f3)
    com.sun.jna.platform.win32.WinNT.HRESULT getProgID(VARIANT RHS);
            
    /**
     * <p>id(0x25e)</p>
     */
    @ComMethod(name = "Verb", dispId = 0x25e)
    com.sun.jna.platform.win32.WinNT.HRESULT Verb(Object Verb);
            
    
}