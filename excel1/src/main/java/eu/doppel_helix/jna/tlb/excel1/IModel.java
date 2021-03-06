
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000244DB-0001-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000244DB-0001-0000-C000-000000000046}")
public interface IModel extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x94)</p>
     * <p>vtableId(7)</p>
     * @param RHS [out] {@code Application}
     */
    @ComProperty(name = "Application", dispId = 0x94)
    com.sun.jna.platform.win32.WinNT.HRESULT getApplication(VARIANT RHS);
            
    /**
     * <p>id(0x95)</p>
     * <p>vtableId(8)</p>
     * @param RHS [out] {@code XlCreator}
     */
    @ComProperty(name = "Creator", dispId = 0x95)
    com.sun.jna.platform.win32.WinNT.HRESULT getCreator(VARIANT RHS);
            
    /**
     * <p>id(0x96)</p>
     * <p>vtableId(9)</p>
     * @param RHS [out] {@code com.sun.jna.platform.win32.COM.util.IDispatch}
     */
    @ComProperty(name = "Parent", dispId = 0x96)
    com.sun.jna.platform.win32.WinNT.HRESULT getParent(VARIANT RHS);
            
    /**
     * <p>id(0xc22)</p>
     * <p>vtableId(10)</p>
     * @param RHS [out] {@code ModelTables}
     */
    @ComProperty(name = "ModelTables", dispId = 0xc22)
    com.sun.jna.platform.win32.WinNT.HRESULT getModelTables(VARIANT RHS);
            
    /**
     * <p>id(0xc36)</p>
     * <p>vtableId(11)</p>
     * @param RHS [out] {@code ModelRelationships}
     */
    @ComProperty(name = "ModelRelationships", dispId = 0xc36)
    com.sun.jna.platform.win32.WinNT.HRESULT getModelRelationships(VARIANT RHS);
            
    /**
     * <p>id(0x589)</p>
     * <p>vtableId(12)</p>
     */
    @ComMethod(name = "Refresh", dispId = 0x589)
    com.sun.jna.platform.win32.WinNT.HRESULT Refresh();
            
    /**
     * <p>id(0xc37)</p>
     * <p>vtableId(13)</p>
     * @param ConnectionToDataSource [in] {@code WorkbookConnection}
     * @param RHS [out] {@code WorkbookConnection}
     */
    @ComMethod(name = "AddConnection", dispId = 0xc37)
    com.sun.jna.platform.win32.WinNT.HRESULT AddConnection(WorkbookConnection ConnectionToDataSource,
            VARIANT RHS);
            
    /**
     * <p>id(0xc39)</p>
     * <p>vtableId(14)</p>
     * @param ModelTable [in] {@code Object}
     * @param RHS [out] {@code WorkbookConnection}
     */
    @ComMethod(name = "CreateModelWorkbookConnection", dispId = 0xc39)
    com.sun.jna.platform.win32.WinNT.HRESULT CreateModelWorkbookConnection(Object ModelTable,
            VARIANT RHS);
            
    /**
     * <p>id(0xc3b)</p>
     * <p>vtableId(15)</p>
     * @param RHS [out] {@code WorkbookConnection}
     */
    @ComProperty(name = "DataModelConnection", dispId = 0xc3b)
    com.sun.jna.platform.win32.WinNT.HRESULT getDataModelConnection(VARIANT RHS);
            
    /**
     * <p>id(0x6e)</p>
     * <p>vtableId(16)</p>
     * @param RHS [out] {@code String}
     */
    @ComProperty(name = "Name", dispId = 0x6e)
    com.sun.jna.platform.win32.WinNT.HRESULT getName(VARIANT RHS);
            
    /**
     * <p>id(0xc3c)</p>
     * <p>vtableId(17)</p>
     */
    @ComMethod(name = "Initialize", dispId = 0xc3c)
    com.sun.jna.platform.win32.WinNT.HRESULT Initialize();
            
    
}