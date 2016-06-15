
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00024423-0001-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{00024423-0001-0000-C000-000000000046}")
public interface ICustomView extends IUnknown, IRawDispatchHandle, IDispatch {
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
     * <p>id(0x629)</p>
     */
    @ComProperty(name = "PrintSettings", dispId = 0x629)
    com.sun.jna.platform.win32.WinNT.HRESULT getPrintSettings(VARIANT RHS);
            
    /**
     * <p>id(0x62a)</p>
     */
    @ComProperty(name = "RowColSettings", dispId = 0x62a)
    com.sun.jna.platform.win32.WinNT.HRESULT getRowColSettings(VARIANT RHS);
            
    /**
     * <p>id(0x1f0)</p>
     */
    @ComMethod(name = "Show", dispId = 0x1f0)
    com.sun.jna.platform.win32.WinNT.HRESULT Show();
            
    /**
     * <p>id(0x75)</p>
     */
    @ComMethod(name = "Delete", dispId = 0x75)
    com.sun.jna.platform.win32.WinNT.HRESULT Delete();
            
    
}