
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
     * <p>id(0x6e)</p>
     */
    @ComProperty(name = "Name", dispId = 0x6e)
    com.sun.jna.platform.win32.WinNT.HRESULT setName(String RHS);
            
    /**
     * <p>id(0xda)</p>
     */
    @ComProperty(name = "Description", dispId = 0xda)
    com.sun.jna.platform.win32.WinNT.HRESULT getDescription(VARIANT RHS);
            
    /**
     * <p>id(0xda)</p>
     */
    @ComProperty(name = "Description", dispId = 0xda)
    com.sun.jna.platform.win32.WinNT.HRESULT setDescription(String RHS);
            
    /**
     * <p>id(0x0)</p>
     */
    @ComProperty(name = "_Default", dispId = 0x0)
    com.sun.jna.platform.win32.WinNT.HRESULT get_Default(VARIANT RHS);
            
    /**
     * <p>id(0x0)</p>
     */
    @ComProperty(name = "_Default", dispId = 0x0)
    com.sun.jna.platform.win32.WinNT.HRESULT set_Default(String RHS);
            
    /**
     * <p>id(0x6c)</p>
     */
    @ComProperty(name = "Type", dispId = 0x6c)
    com.sun.jna.platform.win32.WinNT.HRESULT getType(VARIANT RHS);
            
    /**
     * <p>id(0xa89)</p>
     */
    @ComProperty(name = "OLEDBConnection", dispId = 0xa89)
    com.sun.jna.platform.win32.WinNT.HRESULT getOLEDBConnection(VARIANT RHS);
            
    /**
     * <p>id(0xa8a)</p>
     */
    @ComProperty(name = "ODBCConnection", dispId = 0xa8a)
    com.sun.jna.platform.win32.WinNT.HRESULT getODBCConnection(VARIANT RHS);
            
    /**
     * <p>id(0xa8b)</p>
     */
    @ComProperty(name = "Ranges", dispId = 0xa8b)
    com.sun.jna.platform.win32.WinNT.HRESULT getRanges(VARIANT RHS);
            
    /**
     * <p>id(0x75)</p>
     */
    @ComMethod(name = "Delete", dispId = 0x75)
    com.sun.jna.platform.win32.WinNT.HRESULT Delete();
            
    /**
     * <p>id(0x589)</p>
     */
    @ComMethod(name = "Refresh", dispId = 0x589)
    com.sun.jna.platform.win32.WinNT.HRESULT Refresh();
            
    /**
     * <p>id(0xc1c)</p>
     */
    @ComProperty(name = "ModelConnection", dispId = 0xc1c)
    com.sun.jna.platform.win32.WinNT.HRESULT getModelConnection(VARIANT RHS);
            
    /**
     * <p>id(0xc1d)</p>
     */
    @ComProperty(name = "WorksheetDataConnection", dispId = 0xc1d)
    com.sun.jna.platform.win32.WinNT.HRESULT getWorksheetDataConnection(VARIANT RHS);
            
    /**
     * <p>id(0xc1e)</p>
     */
    @ComProperty(name = "RefreshWithRefreshAll", dispId = 0xc1e)
    com.sun.jna.platform.win32.WinNT.HRESULT getRefreshWithRefreshAll(VARIANT RHS);
            
    /**
     * <p>id(0xc1e)</p>
     */
    @ComProperty(name = "RefreshWithRefreshAll", dispId = 0xc1e)
    com.sun.jna.platform.win32.WinNT.HRESULT setRefreshWithRefreshAll(Boolean RHS);
            
    /**
     * <p>id(0xc1f)</p>
     */
    @ComProperty(name = "TextConnection", dispId = 0xc1f)
    com.sun.jna.platform.win32.WinNT.HRESULT getTextConnection(VARIANT RHS);
            
    /**
     * <p>id(0xc20)</p>
     */
    @ComProperty(name = "DataFeedConnection", dispId = 0xc20)
    com.sun.jna.platform.win32.WinNT.HRESULT getDataFeedConnection(VARIANT RHS);
            
    /**
     * <p>id(0xc21)</p>
     */
    @ComProperty(name = "InModel", dispId = 0xc21)
    com.sun.jna.platform.win32.WinNT.HRESULT getInModel(VARIANT RHS);
            
    /**
     * <p>id(0xc22)</p>
     */
    @ComProperty(name = "ModelTables", dispId = 0xc22)
    com.sun.jna.platform.win32.WinNT.HRESULT getModelTables(VARIANT RHS);
            
    
}