
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00024478-0001-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{00024478-0001-0000-C000-000000000046}")
public interface IXmlDataBinding {
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
     * <p>id(0x0)</p>
     */
    @ComProperty(name = "_Default", dispId = 0x0)
    com.sun.jna.platform.win32.WinNT.HRESULT get_Default(VARIANT RHS);
            
    /**
     * <p>id(0x589)</p>
     */
    @ComMethod(name = "Refresh", dispId = 0x589)
    com.sun.jna.platform.win32.WinNT.HRESULT Refresh(VARIANT RHS);
            
    /**
     * <p>id(0x919)</p>
     */
    @ComMethod(name = "LoadSettings", dispId = 0x919)
    com.sun.jna.platform.win32.WinNT.HRESULT LoadSettings(String Url);
            
    /**
     * <p>id(0x91a)</p>
     */
    @ComMethod(name = "ClearSettings", dispId = 0x91a)
    com.sun.jna.platform.win32.WinNT.HRESULT ClearSettings();
            
    /**
     * <p>id(0x91b)</p>
     */
    @ComProperty(name = "SourceUrl", dispId = 0x91b)
    com.sun.jna.platform.win32.WinNT.HRESULT getSourceUrl(VARIANT RHS);
            
    
}