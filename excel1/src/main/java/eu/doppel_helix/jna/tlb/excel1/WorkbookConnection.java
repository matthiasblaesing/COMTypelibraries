
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00024485-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{00024485-0000-0000-C000-000000000046}")
public interface WorkbookConnection extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x94)</p>
     * <p>vtableId(7)</p>
     */
    @ComProperty(name = "Application", dispId = 0x94)
    Application getApplication();
            
    /**
     * <p>id(0x95)</p>
     * <p>vtableId(8)</p>
     */
    @ComProperty(name = "Creator", dispId = 0x95)
    XlCreator getCreator();
            
    /**
     * <p>id(0x96)</p>
     * <p>vtableId(9)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x96)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * <p>id(0x6e)</p>
     * <p>vtableId(10)</p>
     */
    @ComProperty(name = "Name", dispId = 0x6e)
    String getName();
            
    /**
     * <p>id(0x6e)</p>
     * <p>vtableId(11)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "Name", dispId = 0x6e)
    void setName(String param0);
            
    /**
     * <p>id(0xda)</p>
     * <p>vtableId(12)</p>
     */
    @ComProperty(name = "Description", dispId = 0xda)
    String getDescription();
            
    /**
     * <p>id(0xda)</p>
     * <p>vtableId(13)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "Description", dispId = 0xda)
    void setDescription(String param0);
            
    /**
     * <p>id(0x0)</p>
     * <p>vtableId(14)</p>
     */
    @ComProperty(name = "_Default", dispId = 0x0)
    String get_Default();
            
    /**
     * <p>id(0x0)</p>
     * <p>vtableId(15)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "_Default", dispId = 0x0)
    void set_Default(String param0);
            
    /**
     * <p>id(0x6c)</p>
     * <p>vtableId(16)</p>
     */
    @ComProperty(name = "Type", dispId = 0x6c)
    XlConnectionType getType();
            
    /**
     * <p>id(0xa89)</p>
     * <p>vtableId(17)</p>
     */
    @ComProperty(name = "OLEDBConnection", dispId = 0xa89)
    OLEDBConnection getOLEDBConnection();
            
    /**
     * <p>id(0xa8a)</p>
     * <p>vtableId(18)</p>
     */
    @ComProperty(name = "ODBCConnection", dispId = 0xa8a)
    ODBCConnection getODBCConnection();
            
    /**
     * <p>id(0xa8b)</p>
     * <p>vtableId(19)</p>
     */
    @ComProperty(name = "Ranges", dispId = 0xa8b)
    Ranges getRanges();
            
    /**
     * <p>id(0x75)</p>
     * <p>vtableId(20)</p>
     */
    @ComMethod(name = "Delete", dispId = 0x75)
    void Delete();
            
    /**
     * <p>id(0x589)</p>
     * <p>vtableId(21)</p>
     */
    @ComMethod(name = "Refresh", dispId = 0x589)
    void Refresh();
            
    /**
     * <p>id(0xc1c)</p>
     * <p>vtableId(22)</p>
     */
    @ComProperty(name = "ModelConnection", dispId = 0xc1c)
    ModelConnection getModelConnection();
            
    /**
     * <p>id(0xc1d)</p>
     * <p>vtableId(23)</p>
     */
    @ComProperty(name = "WorksheetDataConnection", dispId = 0xc1d)
    WorksheetDataConnection getWorksheetDataConnection();
            
    /**
     * <p>id(0xc1e)</p>
     * <p>vtableId(24)</p>
     */
    @ComProperty(name = "RefreshWithRefreshAll", dispId = 0xc1e)
    Boolean getRefreshWithRefreshAll();
            
    /**
     * <p>id(0xc1e)</p>
     * <p>vtableId(25)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "RefreshWithRefreshAll", dispId = 0xc1e)
    void setRefreshWithRefreshAll(Boolean param0);
            
    /**
     * <p>id(0xc1f)</p>
     * <p>vtableId(26)</p>
     */
    @ComProperty(name = "TextConnection", dispId = 0xc1f)
    TextConnection getTextConnection();
            
    /**
     * <p>id(0xc20)</p>
     * <p>vtableId(27)</p>
     */
    @ComProperty(name = "DataFeedConnection", dispId = 0xc20)
    DataFeedConnection getDataFeedConnection();
            
    /**
     * <p>id(0xc21)</p>
     * <p>vtableId(28)</p>
     */
    @ComProperty(name = "InModel", dispId = 0xc21)
    Boolean getInModel();
            
    /**
     * <p>id(0xc22)</p>
     * <p>vtableId(29)</p>
     */
    @ComProperty(name = "ModelTables", dispId = 0xc22)
    ModelTables getModelTables();
            
    
}