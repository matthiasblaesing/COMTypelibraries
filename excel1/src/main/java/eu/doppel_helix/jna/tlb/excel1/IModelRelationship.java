
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000244D9-0001-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000244D9-0001-0000-C000-000000000046}")
public interface IModelRelationship {
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
     * <p>id(0xc32)</p>
     */
    @ComProperty(name = "ForeignKeyTable", dispId = 0xc32)
    com.sun.jna.platform.win32.WinNT.HRESULT getForeignKeyTable(VARIANT RHS);
            
    /**
     * <p>id(0xc33)</p>
     */
    @ComProperty(name = "ForeignKeyColumn", dispId = 0xc33)
    com.sun.jna.platform.win32.WinNT.HRESULT getForeignKeyColumn(VARIANT RHS);
            
    /**
     * <p>id(0xc34)</p>
     */
    @ComProperty(name = "PrimaryKeyTable", dispId = 0xc34)
    com.sun.jna.platform.win32.WinNT.HRESULT getPrimaryKeyTable(VARIANT RHS);
            
    /**
     * <p>id(0xc35)</p>
     */
    @ComProperty(name = "PrimaryKeyColumn", dispId = 0xc35)
    com.sun.jna.platform.win32.WinNT.HRESULT getPrimaryKeyColumn(VARIANT RHS);
            
    /**
     * <p>id(0x908)</p>
     */
    @ComProperty(name = "Active", dispId = 0x908)
    com.sun.jna.platform.win32.WinNT.HRESULT getActive(VARIANT RHS);
            
    /**
     * <p>id(0x908)</p>
     */
    @ComProperty(name = "Active", dispId = 0x908)
    com.sun.jna.platform.win32.WinNT.HRESULT setActive(Boolean RHS);
            
    /**
     * <p>id(0x75)</p>
     */
    @ComMethod(name = "Delete", dispId = 0x75)
    com.sun.jna.platform.win32.WinNT.HRESULT Delete();
            
    
}