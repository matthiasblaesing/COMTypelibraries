
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000244E2-0001-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000244E2-0001-0000-C000-000000000046}")
public interface IModelTableNameChange extends IUnknown, IRawDispatchHandle, IDispatch {
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
     * <p>id(0xc47)</p>
     */
    @ComProperty(name = "TableNameOld", dispId = 0xc47)
    com.sun.jna.platform.win32.WinNT.HRESULT getTableNameOld(VARIANT RHS);
            
    /**
     * <p>id(0xc48)</p>
     */
    @ComProperty(name = "TableNameNew", dispId = 0xc48)
    com.sun.jna.platform.win32.WinNT.HRESULT getTableNameNew(VARIANT RHS);
            
    
}