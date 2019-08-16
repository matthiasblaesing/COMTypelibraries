
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00024485-0001-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{00024485-0001-0000-C000-000000000046}")
public interface IWorkbookConnection extends IUnknown, IRawDispatchHandle, IDispatch {
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
     * <p>id(0x6e)</p>
     * <p>vtableId(10)</p>
     * @param RHS [out] {@code String}
     */
    @ComProperty(name = "Name", dispId = 0x6e)
    com.sun.jna.platform.win32.WinNT.HRESULT getName(VARIANT RHS);
            
    /**
     * <p>id(0x6e)</p>
     * <p>vtableId(11)</p>
     * @param RHS [in] {@code String}
     */
    @ComProperty(name = "Name", dispId = 0x6e)
    com.sun.jna.platform.win32.WinNT.HRESULT setName(String RHS);
            
    /**
     * <p>id(0xda)</p>
     * <p>vtableId(12)</p>
     * @param RHS [out] {@code String}
     */
    @ComProperty(name = "Description", dispId = 0xda)
    com.sun.jna.platform.win32.WinNT.HRESULT getDescription(VARIANT RHS);
            
    /**
     * <p>id(0xda)</p>
     * <p>vtableId(13)</p>
     * @param RHS [in] {@code String}
     */
    @ComProperty(name = "Description", dispId = 0xda)
    com.sun.jna.platform.win32.WinNT.HRESULT setDescription(String RHS);
            
    /**
     * <p>id(0x0)</p>
     * <p>vtableId(14)</p>
     * @param RHS [out] {@code String}
     */
    @ComProperty(name = "_Default", dispId = 0x0)
    com.sun.jna.platform.win32.WinNT.HRESULT get_Default(VARIANT RHS);
            
    /**
     * <p>id(0x0)</p>
     * <p>vtableId(15)</p>
     * @param RHS [in] {@code String}
     */
    @ComProperty(name = "_Default", dispId = 0x0)
    com.sun.jna.platform.win32.WinNT.HRESULT set_Default(String RHS);
            
    /**
     * <p>id(0x6c)</p>
     * <p>vtableId(16)</p>
     * @param RHS [out] {@code XlConnectionType}
     */
    @ComProperty(name = "Type", dispId = 0x6c)
    com.sun.jna.platform.win32.WinNT.HRESULT getType(VARIANT RHS);
            
    /**
     * <p>id(0xa89)</p>
     * <p>vtableId(17)</p>
     * @param RHS [out] {@code OLEDBConnection}
     */
    @ComProperty(name = "OLEDBConnection", dispId = 0xa89)
    com.sun.jna.platform.win32.WinNT.HRESULT getOLEDBConnection(VARIANT RHS);
            
    /**
     * <p>id(0xa8a)</p>
     * <p>vtableId(18)</p>
     * @param RHS [out] {@code ODBCConnection}
     */
    @ComProperty(name = "ODBCConnection", dispId = 0xa8a)
    com.sun.jna.platform.win32.WinNT.HRESULT getODBCConnection(VARIANT RHS);
            
    /**
     * <p>id(0xa8b)</p>
     * <p>vtableId(19)</p>
     * @param RHS [out] {@code Ranges}
     */
    @ComProperty(name = "Ranges", dispId = 0xa8b)
    com.sun.jna.platform.win32.WinNT.HRESULT getRanges(VARIANT RHS);
            
    /**
     * <p>id(0x75)</p>
     * <p>vtableId(20)</p>
     */
    @ComMethod(name = "Delete", dispId = 0x75)
    com.sun.jna.platform.win32.WinNT.HRESULT Delete();
            
    /**
     * <p>id(0x589)</p>
     * <p>vtableId(21)</p>
     */
    @ComMethod(name = "Refresh", dispId = 0x589)
    com.sun.jna.platform.win32.WinNT.HRESULT Refresh();
            
    /**
     * <p>id(0xc1c)</p>
     * <p>vtableId(22)</p>
     * @param RHS [out] {@code ModelConnection}
     */
    @ComProperty(name = "ModelConnection", dispId = 0xc1c)
    com.sun.jna.platform.win32.WinNT.HRESULT getModelConnection(VARIANT RHS);
            
    /**
     * <p>id(0xc1d)</p>
     * <p>vtableId(23)</p>
     * @param RHS [out] {@code WorksheetDataConnection}
     */
    @ComProperty(name = "WorksheetDataConnection", dispId = 0xc1d)
    com.sun.jna.platform.win32.WinNT.HRESULT getWorksheetDataConnection(VARIANT RHS);
            
    /**
     * <p>id(0xc1e)</p>
     * <p>vtableId(24)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "RefreshWithRefreshAll", dispId = 0xc1e)
    com.sun.jna.platform.win32.WinNT.HRESULT getRefreshWithRefreshAll(VARIANT RHS);
            
    /**
     * <p>id(0xc1e)</p>
     * <p>vtableId(25)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "RefreshWithRefreshAll", dispId = 0xc1e)
    com.sun.jna.platform.win32.WinNT.HRESULT setRefreshWithRefreshAll(Boolean RHS);
            
    /**
     * <p>id(0xc1f)</p>
     * <p>vtableId(26)</p>
     * @param RHS [out] {@code TextConnection}
     */
    @ComProperty(name = "TextConnection", dispId = 0xc1f)
    com.sun.jna.platform.win32.WinNT.HRESULT getTextConnection(VARIANT RHS);
            
    /**
     * <p>id(0xc20)</p>
     * <p>vtableId(27)</p>
     * @param RHS [out] {@code DataFeedConnection}
     */
    @ComProperty(name = "DataFeedConnection", dispId = 0xc20)
    com.sun.jna.platform.win32.WinNT.HRESULT getDataFeedConnection(VARIANT RHS);
            
    /**
     * <p>id(0xc21)</p>
     * <p>vtableId(28)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "InModel", dispId = 0xc21)
    com.sun.jna.platform.win32.WinNT.HRESULT getInModel(VARIANT RHS);
            
    /**
     * <p>id(0xc22)</p>
     * <p>vtableId(29)</p>
     * @param RHS [out] {@code ModelTables}
     */
    @ComProperty(name = "ModelTables", dispId = 0xc22)
    com.sun.jna.platform.win32.WinNT.HRESULT getModelTables(VARIANT RHS);
            
    
}