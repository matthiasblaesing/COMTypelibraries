
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00024485-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{00024485-0000-0000-C000-000000000046}")
public interface WorkbookConnection {
    /**
     * <p>id(0x94)</p>
     */
    @ComProperty(name = "Application", dispId = 0x94)
    Application getApplication();
            
    /**
     * <p>id(0x95)</p>
     */
    @ComProperty(name = "Creator", dispId = 0x95)
    XlCreator getCreator();
            
    /**
     * <p>id(0x96)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x96)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * <p>id(0x6e)</p>
     */
    @ComProperty(name = "Name", dispId = 0x6e)
    String getName();
            
    /**
     * <p>id(0x6e)</p>
     */
    @ComProperty(name = "Name", dispId = 0x6e)
    void setName(String param0);
            
    /**
     * <p>id(0xda)</p>
     */
    @ComProperty(name = "Description", dispId = 0xda)
    String getDescription();
            
    /**
     * <p>id(0xda)</p>
     */
    @ComProperty(name = "Description", dispId = 0xda)
    void setDescription(String param0);
            
    /**
     * <p>id(0x0)</p>
     */
    @ComProperty(name = "_Default", dispId = 0x0)
    String get_Default();
            
    /**
     * <p>id(0x0)</p>
     */
    @ComProperty(name = "_Default", dispId = 0x0)
    void set_Default(String param0);
            
    /**
     * <p>id(0x6c)</p>
     */
    @ComProperty(name = "Type", dispId = 0x6c)
    XlConnectionType getType();
            
    /**
     * <p>id(0xa89)</p>
     */
    @ComProperty(name = "OLEDBConnection", dispId = 0xa89)
    OLEDBConnection getOLEDBConnection();
            
    /**
     * <p>id(0xa8a)</p>
     */
    @ComProperty(name = "ODBCConnection", dispId = 0xa8a)
    ODBCConnection getODBCConnection();
            
    /**
     * <p>id(0xa8b)</p>
     */
    @ComProperty(name = "Ranges", dispId = 0xa8b)
    Ranges getRanges();
            
    /**
     * <p>id(0x75)</p>
     */
    @ComMethod(name = "Delete", dispId = 0x75)
    void Delete();
            
    /**
     * <p>id(0x589)</p>
     */
    @ComMethod(name = "Refresh", dispId = 0x589)
    void Refresh();
            
    /**
     * <p>id(0xc1c)</p>
     */
    @ComProperty(name = "ModelConnection", dispId = 0xc1c)
    ModelConnection getModelConnection();
            
    /**
     * <p>id(0xc1d)</p>
     */
    @ComProperty(name = "WorksheetDataConnection", dispId = 0xc1d)
    WorksheetDataConnection getWorksheetDataConnection();
            
    /**
     * <p>id(0xc1e)</p>
     */
    @ComProperty(name = "RefreshWithRefreshAll", dispId = 0xc1e)
    Boolean getRefreshWithRefreshAll();
            
    /**
     * <p>id(0xc1e)</p>
     */
    @ComProperty(name = "RefreshWithRefreshAll", dispId = 0xc1e)
    void setRefreshWithRefreshAll(Boolean param0);
            
    /**
     * <p>id(0xc1f)</p>
     */
    @ComProperty(name = "TextConnection", dispId = 0xc1f)
    TextConnection getTextConnection();
            
    /**
     * <p>id(0xc20)</p>
     */
    @ComProperty(name = "DataFeedConnection", dispId = 0xc20)
    DataFeedConnection getDataFeedConnection();
            
    /**
     * <p>id(0xc21)</p>
     */
    @ComProperty(name = "InModel", dispId = 0xc21)
    Boolean getInModel();
            
    /**
     * <p>id(0xc22)</p>
     */
    @ComProperty(name = "ModelTables", dispId = 0xc22)
    ModelTables getModelTables();
            
    
}