
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00024436-0001-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{00024436-0001-0000-C000-000000000046}")
public interface IChartColorFormat {
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
     * <p>id(0x66e)</p>
     */
    @ComProperty(name = "SchemeColor", dispId = 0x66e)
    com.sun.jna.platform.win32.WinNT.HRESULT getSchemeColor(VARIANT RHS);
            
    /**
     * <p>id(0x66e)</p>
     */
    @ComProperty(name = "SchemeColor", dispId = 0x66e)
    com.sun.jna.platform.win32.WinNT.HRESULT setSchemeColor(Integer RHS);
            
    /**
     * <p>id(0x41f)</p>
     */
    @ComProperty(name = "RGB", dispId = 0x41f)
    com.sun.jna.platform.win32.WinNT.HRESULT getRGB(VARIANT RHS);
            
    /**
     * <p>id(0x0)</p>
     */
    @ComProperty(name = "_Default", dispId = 0x0)
    com.sun.jna.platform.win32.WinNT.HRESULT get_Default(VARIANT RHS);
            
    /**
     * <p>id(0x6c)</p>
     */
    @ComProperty(name = "Type", dispId = 0x6c)
    com.sun.jna.platform.win32.WinNT.HRESULT getType(VARIANT RHS);
            
    
}