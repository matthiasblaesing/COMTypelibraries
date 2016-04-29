
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({0002441C-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{0002441C-0000-0000-C000-000000000046}")
public interface PivotCache {
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
     * <p>id(0x593)</p>
     */
    @ComProperty(name = "BackgroundQuery", dispId = 0x593)
    Boolean getBackgroundQuery();
            
    /**
     * <p>id(0x593)</p>
     */
    @ComProperty(name = "BackgroundQuery", dispId = 0x593)
    void setBackgroundQuery(Boolean param0);
            
    /**
     * <p>id(0x598)</p>
     */
    @ComProperty(name = "Connection", dispId = 0x598)
    Object getConnection();
            
    /**
     * <p>id(0x598)</p>
     */
    @ComProperty(name = "Connection", dispId = 0x598)
    void setConnection(Object param0);
            
    /**
     * <p>id(0x5c5)</p>
     */
    @ComProperty(name = "EnableRefresh", dispId = 0x5c5)
    Boolean getEnableRefresh();
            
    /**
     * <p>id(0x5c5)</p>
     */
    @ComProperty(name = "EnableRefresh", dispId = 0x5c5)
    void setEnableRefresh(Boolean param0);
            
    /**
     * <p>id(0x1e6)</p>
     */
    @ComProperty(name = "Index", dispId = 0x1e6)
    Integer getIndex();
            
    /**
     * <p>id(0x174)</p>
     */
    @ComProperty(name = "MemoryUsed", dispId = 0x174)
    Integer getMemoryUsed();
            
    /**
     * <p>id(0x594)</p>
     */
    @ComProperty(name = "OptimizeCache", dispId = 0x594)
    Boolean getOptimizeCache();
            
    /**
     * <p>id(0x594)</p>
     */
    @ComProperty(name = "OptimizeCache", dispId = 0x594)
    void setOptimizeCache(Boolean param0);
            
    /**
     * <p>id(0x5c6)</p>
     */
    @ComProperty(name = "RecordCount", dispId = 0x5c6)
    Integer getRecordCount();
            
    /**
     * <p>id(0x589)</p>
     */
    @ComMethod(name = "Refresh", dispId = 0x589)
    void Refresh();
            
    /**
     * <p>id(0x2b8)</p>
     */
    @ComProperty(name = "RefreshDate", dispId = 0x2b8)
    java.util.Date getRefreshDate();
            
    /**
     * <p>id(0x2b9)</p>
     */
    @ComProperty(name = "RefreshName", dispId = 0x2b9)
    String getRefreshName();
            
    /**
     * <p>id(0x5c7)</p>
     */
    @ComProperty(name = "RefreshOnFileOpen", dispId = 0x5c7)
    Boolean getRefreshOnFileOpen();
            
    /**
     * <p>id(0x5c7)</p>
     */
    @ComProperty(name = "RefreshOnFileOpen", dispId = 0x5c7)
    void setRefreshOnFileOpen(Boolean param0);
            
    /**
     * <p>id(0x5c8)</p>
     */
    @ComProperty(name = "Sql", dispId = 0x5c8)
    Object getSql();
            
    /**
     * <p>id(0x5c8)</p>
     */
    @ComProperty(name = "Sql", dispId = 0x5c8)
    void setSql(Object param0);
            
    /**
     * <p>id(0x5c9)</p>
     */
    @ComProperty(name = "SavePassword", dispId = 0x5c9)
    Boolean getSavePassword();
            
    /**
     * <p>id(0x5c9)</p>
     */
    @ComProperty(name = "SavePassword", dispId = 0x5c9)
    void setSavePassword(Boolean param0);
            
    /**
     * <p>id(0x2ae)</p>
     */
    @ComProperty(name = "SourceData", dispId = 0x2ae)
    Object getSourceData();
            
    /**
     * <p>id(0x2ae)</p>
     */
    @ComProperty(name = "SourceData", dispId = 0x2ae)
    void setSourceData(Object param0);
            
    /**
     * <p>id(0x725)</p>
     */
    @ComProperty(name = "CommandText", dispId = 0x725)
    Object getCommandText();
            
    /**
     * <p>id(0x725)</p>
     */
    @ComProperty(name = "CommandText", dispId = 0x725)
    void setCommandText(Object param0);
            
    /**
     * <p>id(0x726)</p>
     */
    @ComProperty(name = "CommandType", dispId = 0x726)
    XlCmdType getCommandType();
            
    /**
     * <p>id(0x726)</p>
     */
    @ComProperty(name = "CommandType", dispId = 0x726)
    void setCommandType(XlCmdType param0);
            
    /**
     * <p>id(0x727)</p>
     */
    @ComProperty(name = "QueryType", dispId = 0x727)
    XlQueryType getQueryType();
            
    /**
     * <p>id(0x728)</p>
     */
    @ComProperty(name = "MaintainConnection", dispId = 0x728)
    Boolean getMaintainConnection();
            
    /**
     * <p>id(0x728)</p>
     */
    @ComProperty(name = "MaintainConnection", dispId = 0x728)
    void setMaintainConnection(Boolean param0);
            
    /**
     * <p>id(0x729)</p>
     */
    @ComProperty(name = "RefreshPeriod", dispId = 0x729)
    Integer getRefreshPeriod();
            
    /**
     * <p>id(0x729)</p>
     */
    @ComProperty(name = "RefreshPeriod", dispId = 0x729)
    void setRefreshPeriod(Integer param0);
            
    /**
     * <p>id(0x48d)</p>
     */
    @ComProperty(name = "Recordset", dispId = 0x48d)
    com.sun.jna.platform.win32.COM.util.IDispatch getRecordset();
            
    /**
     * <p>id(0x48d)</p>
     */
    @ComProperty(name = "Recordset", dispId = 0x48d)
    void setRecordset(com.sun.jna.platform.win32.COM.util.IDispatch param0);
            
    /**
     * <p>id(0x72a)</p>
     */
    @ComMethod(name = "ResetTimer", dispId = 0x72a)
    void ResetTimer();
            
    /**
     * <p>id(0x72b)</p>
     */
    @ComProperty(name = "LocalConnection", dispId = 0x72b)
    Object getLocalConnection();
            
    /**
     * <p>id(0x72b)</p>
     */
    @ComProperty(name = "LocalConnection", dispId = 0x72b)
    void setLocalConnection(Object param0);
            
    /**
     * <p>id(0x72c)</p>
     */
    @ComMethod(name = "CreatePivotTable", dispId = 0x72c)
    PivotTable CreatePivotTable(Object TableDestination,
            Object TableName,
            Object ReadData,
            Object DefaultVersion);
            
    /**
     * <p>id(0x72d)</p>
     */
    @ComProperty(name = "UseLocalConnection", dispId = 0x72d)
    Boolean getUseLocalConnection();
            
    /**
     * <p>id(0x72d)</p>
     */
    @ComProperty(name = "UseLocalConnection", dispId = 0x72d)
    void setUseLocalConnection(Boolean param0);
            
    /**
     * <p>id(0x81a)</p>
     */
    @ComProperty(name = "ADOConnection", dispId = 0x81a)
    com.sun.jna.platform.win32.COM.util.IDispatch getADOConnection();
            
    /**
     * <p>id(0x81b)</p>
     */
    @ComProperty(name = "IsConnected", dispId = 0x81b)
    Boolean getIsConnected();
            
    /**
     * <p>id(0x81c)</p>
     */
    @ComMethod(name = "MakeConnection", dispId = 0x81c)
    void MakeConnection();
            
    /**
     * <p>id(0x81d)</p>
     */
    @ComProperty(name = "OLAP", dispId = 0x81d)
    Boolean getOLAP();
            
    /**
     * <p>id(0x2ad)</p>
     */
    @ComProperty(name = "SourceType", dispId = 0x2ad)
    XlPivotTableSourceType getSourceType();
            
    /**
     * <p>id(0x81e)</p>
     */
    @ComProperty(name = "MissingItemsLimit", dispId = 0x81e)
    XlPivotTableMissingItems getMissingItemsLimit();
            
    /**
     * <p>id(0x81e)</p>
     */
    @ComProperty(name = "MissingItemsLimit", dispId = 0x81e)
    void setMissingItemsLimit(XlPivotTableMissingItems param0);
            
    /**
     * <p>id(0x81f)</p>
     */
    @ComProperty(name = "SourceConnectionFile", dispId = 0x81f)
    String getSourceConnectionFile();
            
    /**
     * <p>id(0x81f)</p>
     */
    @ComProperty(name = "SourceConnectionFile", dispId = 0x81f)
    void setSourceConnectionFile(String param0);
            
    /**
     * <p>id(0x820)</p>
     */
    @ComProperty(name = "SourceDataFile", dispId = 0x820)
    String getSourceDataFile();
            
    /**
     * <p>id(0x821)</p>
     */
    @ComProperty(name = "RobustConnect", dispId = 0x821)
    XlRobustConnect getRobustConnect();
            
    /**
     * <p>id(0x821)</p>
     */
    @ComProperty(name = "RobustConnect", dispId = 0x821)
    void setRobustConnect(XlRobustConnect param0);
            
    /**
     * <p>id(0x822)</p>
     */
    @ComMethod(name = "SaveAsODC", dispId = 0x822)
    void SaveAsODC(String ODCFileName,
            Object Description,
            Object Keywords);
            
    /**
     * <p>id(0x9f0)</p>
     */
    @ComProperty(name = "WorkbookConnection", dispId = 0x9f0)
    WorkbookConnection getWorkbookConnection();
            
    /**
     * <p>id(0x188)</p>
     */
    @ComProperty(name = "Version", dispId = 0x188)
    XlPivotTableVersionList getVersion();
            
    /**
     * <p>id(0x9f1)</p>
     */
    @ComProperty(name = "UpgradeOnRefresh", dispId = 0x9f1)
    Boolean getUpgradeOnRefresh();
            
    /**
     * <p>id(0x9f1)</p>
     */
    @ComProperty(name = "UpgradeOnRefresh", dispId = 0x9f1)
    void setUpgradeOnRefresh(Boolean param0);
            
    /**
     * <p>id(0xbf6)</p>
     */
    @ComMethod(name = "CreatePivotChart", dispId = 0xbf6)
    Shape CreatePivotChart(Object ChartDestination,
            Object XlChartType,
            Object Left,
            Object Top,
            Object Width,
            Object Height);
            
    
}