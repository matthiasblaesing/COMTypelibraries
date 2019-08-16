
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({0002441C-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{0002441C-0000-0000-C000-000000000046}")
public interface PivotCache extends IUnknown, IRawDispatchHandle, IDispatch {
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
     * <p>id(0x593)</p>
     * <p>vtableId(10)</p>
     */
    @ComProperty(name = "BackgroundQuery", dispId = 0x593)
    Boolean getBackgroundQuery();
            
    /**
     * <p>id(0x593)</p>
     * <p>vtableId(11)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "BackgroundQuery", dispId = 0x593)
    void setBackgroundQuery(Boolean param0);
            
    /**
     * <p>id(0x598)</p>
     * <p>vtableId(12)</p>
     */
    @ComProperty(name = "Connection", dispId = 0x598)
    Object getConnection();
            
    /**
     * <p>id(0x598)</p>
     * <p>vtableId(13)</p>
     * @param param0 [in] {@code Object}
     */
    @ComProperty(name = "Connection", dispId = 0x598)
    void setConnection(Object param0);
            
    /**
     * <p>id(0x5c5)</p>
     * <p>vtableId(14)</p>
     */
    @ComProperty(name = "EnableRefresh", dispId = 0x5c5)
    Boolean getEnableRefresh();
            
    /**
     * <p>id(0x5c5)</p>
     * <p>vtableId(15)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "EnableRefresh", dispId = 0x5c5)
    void setEnableRefresh(Boolean param0);
            
    /**
     * <p>id(0x1e6)</p>
     * <p>vtableId(16)</p>
     */
    @ComProperty(name = "Index", dispId = 0x1e6)
    Integer getIndex();
            
    /**
     * <p>id(0x174)</p>
     * <p>vtableId(17)</p>
     */
    @ComProperty(name = "MemoryUsed", dispId = 0x174)
    Integer getMemoryUsed();
            
    /**
     * <p>id(0x594)</p>
     * <p>vtableId(18)</p>
     */
    @ComProperty(name = "OptimizeCache", dispId = 0x594)
    Boolean getOptimizeCache();
            
    /**
     * <p>id(0x594)</p>
     * <p>vtableId(19)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "OptimizeCache", dispId = 0x594)
    void setOptimizeCache(Boolean param0);
            
    /**
     * <p>id(0x5c6)</p>
     * <p>vtableId(20)</p>
     */
    @ComProperty(name = "RecordCount", dispId = 0x5c6)
    Integer getRecordCount();
            
    /**
     * <p>id(0x589)</p>
     * <p>vtableId(21)</p>
     */
    @ComMethod(name = "Refresh", dispId = 0x589)
    void Refresh();
            
    /**
     * <p>id(0x2b8)</p>
     * <p>vtableId(22)</p>
     */
    @ComProperty(name = "RefreshDate", dispId = 0x2b8)
    java.util.Date getRefreshDate();
            
    /**
     * <p>id(0x2b9)</p>
     * <p>vtableId(23)</p>
     */
    @ComProperty(name = "RefreshName", dispId = 0x2b9)
    String getRefreshName();
            
    /**
     * <p>id(0x5c7)</p>
     * <p>vtableId(24)</p>
     */
    @ComProperty(name = "RefreshOnFileOpen", dispId = 0x5c7)
    Boolean getRefreshOnFileOpen();
            
    /**
     * <p>id(0x5c7)</p>
     * <p>vtableId(25)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "RefreshOnFileOpen", dispId = 0x5c7)
    void setRefreshOnFileOpen(Boolean param0);
            
    /**
     * <p>id(0x5c8)</p>
     * <p>vtableId(26)</p>
     */
    @ComProperty(name = "Sql", dispId = 0x5c8)
    Object getSql();
            
    /**
     * <p>id(0x5c8)</p>
     * <p>vtableId(27)</p>
     * @param param0 [in] {@code Object}
     */
    @ComProperty(name = "Sql", dispId = 0x5c8)
    void setSql(Object param0);
            
    /**
     * <p>id(0x5c9)</p>
     * <p>vtableId(28)</p>
     */
    @ComProperty(name = "SavePassword", dispId = 0x5c9)
    Boolean getSavePassword();
            
    /**
     * <p>id(0x5c9)</p>
     * <p>vtableId(29)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "SavePassword", dispId = 0x5c9)
    void setSavePassword(Boolean param0);
            
    /**
     * <p>id(0x2ae)</p>
     * <p>vtableId(30)</p>
     */
    @ComProperty(name = "SourceData", dispId = 0x2ae)
    Object getSourceData();
            
    /**
     * <p>id(0x2ae)</p>
     * <p>vtableId(31)</p>
     * @param param0 [in] {@code Object}
     */
    @ComProperty(name = "SourceData", dispId = 0x2ae)
    void setSourceData(Object param0);
            
    /**
     * <p>id(0x725)</p>
     * <p>vtableId(32)</p>
     */
    @ComProperty(name = "CommandText", dispId = 0x725)
    Object getCommandText();
            
    /**
     * <p>id(0x725)</p>
     * <p>vtableId(33)</p>
     * @param param0 [in] {@code Object}
     */
    @ComProperty(name = "CommandText", dispId = 0x725)
    void setCommandText(Object param0);
            
    /**
     * <p>id(0x726)</p>
     * <p>vtableId(34)</p>
     */
    @ComProperty(name = "CommandType", dispId = 0x726)
    XlCmdType getCommandType();
            
    /**
     * <p>id(0x726)</p>
     * <p>vtableId(35)</p>
     * @param param0 [in] {@code XlCmdType}
     */
    @ComProperty(name = "CommandType", dispId = 0x726)
    void setCommandType(XlCmdType param0);
            
    /**
     * <p>id(0x727)</p>
     * <p>vtableId(36)</p>
     */
    @ComProperty(name = "QueryType", dispId = 0x727)
    XlQueryType getQueryType();
            
    /**
     * <p>id(0x728)</p>
     * <p>vtableId(37)</p>
     */
    @ComProperty(name = "MaintainConnection", dispId = 0x728)
    Boolean getMaintainConnection();
            
    /**
     * <p>id(0x728)</p>
     * <p>vtableId(38)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "MaintainConnection", dispId = 0x728)
    void setMaintainConnection(Boolean param0);
            
    /**
     * <p>id(0x729)</p>
     * <p>vtableId(39)</p>
     */
    @ComProperty(name = "RefreshPeriod", dispId = 0x729)
    Integer getRefreshPeriod();
            
    /**
     * <p>id(0x729)</p>
     * <p>vtableId(40)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "RefreshPeriod", dispId = 0x729)
    void setRefreshPeriod(Integer param0);
            
    /**
     * <p>id(0x48d)</p>
     * <p>vtableId(41)</p>
     */
    @ComProperty(name = "Recordset", dispId = 0x48d)
    com.sun.jna.platform.win32.COM.util.IDispatch getRecordset();
            
    /**
     * <p>id(0x72a)</p>
     * <p>vtableId(43)</p>
     */
    @ComMethod(name = "ResetTimer", dispId = 0x72a)
    void ResetTimer();
            
    /**
     * <p>id(0x72b)</p>
     * <p>vtableId(44)</p>
     */
    @ComProperty(name = "LocalConnection", dispId = 0x72b)
    Object getLocalConnection();
            
    /**
     * <p>id(0x72b)</p>
     * <p>vtableId(45)</p>
     * @param param0 [in] {@code Object}
     */
    @ComProperty(name = "LocalConnection", dispId = 0x72b)
    void setLocalConnection(Object param0);
            
    /**
     * <p>id(0x72c)</p>
     * <p>vtableId(46)</p>
     * @param TableDestination [in] {@code Object}
     * @param TableName [in, optional] {@code Object}
     * @param ReadData [in, optional] {@code Object}
     * @param DefaultVersion [in, optional] {@code Object}
     */
    @ComMethod(name = "CreatePivotTable", dispId = 0x72c)
    PivotTable CreatePivotTable(Object TableDestination,
            Object TableName,
            Object ReadData,
            Object DefaultVersion);
            
    /**
     * <p>id(0x72d)</p>
     * <p>vtableId(47)</p>
     */
    @ComProperty(name = "UseLocalConnection", dispId = 0x72d)
    Boolean getUseLocalConnection();
            
    /**
     * <p>id(0x72d)</p>
     * <p>vtableId(48)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "UseLocalConnection", dispId = 0x72d)
    void setUseLocalConnection(Boolean param0);
            
    /**
     * <p>id(0x81a)</p>
     * <p>vtableId(49)</p>
     */
    @ComProperty(name = "ADOConnection", dispId = 0x81a)
    com.sun.jna.platform.win32.COM.util.IDispatch getADOConnection();
            
    /**
     * <p>id(0x81b)</p>
     * <p>vtableId(50)</p>
     */
    @ComProperty(name = "IsConnected", dispId = 0x81b)
    Boolean getIsConnected();
            
    /**
     * <p>id(0x81c)</p>
     * <p>vtableId(51)</p>
     */
    @ComMethod(name = "MakeConnection", dispId = 0x81c)
    void MakeConnection();
            
    /**
     * <p>id(0x81d)</p>
     * <p>vtableId(52)</p>
     */
    @ComProperty(name = "OLAP", dispId = 0x81d)
    Boolean getOLAP();
            
    /**
     * <p>id(0x2ad)</p>
     * <p>vtableId(53)</p>
     */
    @ComProperty(name = "SourceType", dispId = 0x2ad)
    XlPivotTableSourceType getSourceType();
            
    /**
     * <p>id(0x81e)</p>
     * <p>vtableId(54)</p>
     */
    @ComProperty(name = "MissingItemsLimit", dispId = 0x81e)
    XlPivotTableMissingItems getMissingItemsLimit();
            
    /**
     * <p>id(0x81e)</p>
     * <p>vtableId(55)</p>
     * @param param0 [in] {@code XlPivotTableMissingItems}
     */
    @ComProperty(name = "MissingItemsLimit", dispId = 0x81e)
    void setMissingItemsLimit(XlPivotTableMissingItems param0);
            
    /**
     * <p>id(0x81f)</p>
     * <p>vtableId(56)</p>
     */
    @ComProperty(name = "SourceConnectionFile", dispId = 0x81f)
    String getSourceConnectionFile();
            
    /**
     * <p>id(0x81f)</p>
     * <p>vtableId(57)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "SourceConnectionFile", dispId = 0x81f)
    void setSourceConnectionFile(String param0);
            
    /**
     * <p>id(0x820)</p>
     * <p>vtableId(58)</p>
     */
    @ComProperty(name = "SourceDataFile", dispId = 0x820)
    String getSourceDataFile();
            
    /**
     * <p>id(0x821)</p>
     * <p>vtableId(59)</p>
     */
    @ComProperty(name = "RobustConnect", dispId = 0x821)
    XlRobustConnect getRobustConnect();
            
    /**
     * <p>id(0x821)</p>
     * <p>vtableId(60)</p>
     * @param param0 [in] {@code XlRobustConnect}
     */
    @ComProperty(name = "RobustConnect", dispId = 0x821)
    void setRobustConnect(XlRobustConnect param0);
            
    /**
     * <p>id(0x822)</p>
     * <p>vtableId(61)</p>
     * @param ODCFileName [in] {@code String}
     * @param Description [in, optional] {@code Object}
     * @param Keywords [in, optional] {@code Object}
     */
    @ComMethod(name = "SaveAsODC", dispId = 0x822)
    void SaveAsODC(String ODCFileName,
            Object Description,
            Object Keywords);
            
    /**
     * <p>id(0x9f0)</p>
     * <p>vtableId(62)</p>
     */
    @ComProperty(name = "WorkbookConnection", dispId = 0x9f0)
    WorkbookConnection getWorkbookConnection();
            
    /**
     * <p>id(0x188)</p>
     * <p>vtableId(63)</p>
     */
    @ComProperty(name = "Version", dispId = 0x188)
    XlPivotTableVersionList getVersion();
            
    /**
     * <p>id(0x9f1)</p>
     * <p>vtableId(64)</p>
     */
    @ComProperty(name = "UpgradeOnRefresh", dispId = 0x9f1)
    Boolean getUpgradeOnRefresh();
            
    /**
     * <p>id(0x9f1)</p>
     * <p>vtableId(65)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "UpgradeOnRefresh", dispId = 0x9f1)
    void setUpgradeOnRefresh(Boolean param0);
            
    /**
     * <p>id(0xbf6)</p>
     * <p>vtableId(66)</p>
     * @param ChartDestination [in] {@code Object}
     * @param XlChartType [in, optional] {@code Object}
     * @param Left [in, optional] {@code Object}
     * @param Top [in, optional] {@code Object}
     * @param Width [in, optional] {@code Object}
     * @param Height [in, optional] {@code Object}
     */
    @ComMethod(name = "CreatePivotChart", dispId = 0xbf6)
    Shape CreatePivotChart(Object ChartDestination,
            Object XlChartType,
            Object Left,
            Object Top,
            Object Width,
            Object Height);
            
    
}