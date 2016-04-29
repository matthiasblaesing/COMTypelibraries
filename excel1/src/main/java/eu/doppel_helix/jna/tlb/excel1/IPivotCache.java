
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({0002441C-0001-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{0002441C-0001-0000-C000-000000000046}")
public interface IPivotCache {
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
     * <p>id(0x593)</p>
     */
    @ComProperty(name = "BackgroundQuery", dispId = 0x593)
    com.sun.jna.platform.win32.WinNT.HRESULT getBackgroundQuery(VARIANT RHS);
            
    /**
     * <p>id(0x593)</p>
     */
    @ComProperty(name = "BackgroundQuery", dispId = 0x593)
    com.sun.jna.platform.win32.WinNT.HRESULT setBackgroundQuery(Boolean RHS);
            
    /**
     * <p>id(0x598)</p>
     */
    @ComProperty(name = "Connection", dispId = 0x598)
    com.sun.jna.platform.win32.WinNT.HRESULT getConnection(VARIANT RHS);
            
    /**
     * <p>id(0x598)</p>
     */
    @ComProperty(name = "Connection", dispId = 0x598)
    com.sun.jna.platform.win32.WinNT.HRESULT setConnection(Object RHS);
            
    /**
     * <p>id(0x5c5)</p>
     */
    @ComProperty(name = "EnableRefresh", dispId = 0x5c5)
    com.sun.jna.platform.win32.WinNT.HRESULT getEnableRefresh(VARIANT RHS);
            
    /**
     * <p>id(0x5c5)</p>
     */
    @ComProperty(name = "EnableRefresh", dispId = 0x5c5)
    com.sun.jna.platform.win32.WinNT.HRESULT setEnableRefresh(Boolean RHS);
            
    /**
     * <p>id(0x1e6)</p>
     */
    @ComProperty(name = "Index", dispId = 0x1e6)
    com.sun.jna.platform.win32.WinNT.HRESULT getIndex(VARIANT RHS);
            
    /**
     * <p>id(0x174)</p>
     */
    @ComProperty(name = "MemoryUsed", dispId = 0x174)
    com.sun.jna.platform.win32.WinNT.HRESULT getMemoryUsed(VARIANT RHS);
            
    /**
     * <p>id(0x594)</p>
     */
    @ComProperty(name = "OptimizeCache", dispId = 0x594)
    com.sun.jna.platform.win32.WinNT.HRESULT getOptimizeCache(VARIANT RHS);
            
    /**
     * <p>id(0x594)</p>
     */
    @ComProperty(name = "OptimizeCache", dispId = 0x594)
    com.sun.jna.platform.win32.WinNT.HRESULT setOptimizeCache(Boolean RHS);
            
    /**
     * <p>id(0x5c6)</p>
     */
    @ComProperty(name = "RecordCount", dispId = 0x5c6)
    com.sun.jna.platform.win32.WinNT.HRESULT getRecordCount(VARIANT RHS);
            
    /**
     * <p>id(0x589)</p>
     */
    @ComMethod(name = "Refresh", dispId = 0x589)
    com.sun.jna.platform.win32.WinNT.HRESULT Refresh();
            
    /**
     * <p>id(0x2b8)</p>
     */
    @ComProperty(name = "RefreshDate", dispId = 0x2b8)
    com.sun.jna.platform.win32.WinNT.HRESULT getRefreshDate(VARIANT RHS);
            
    /**
     * <p>id(0x2b9)</p>
     */
    @ComProperty(name = "RefreshName", dispId = 0x2b9)
    com.sun.jna.platform.win32.WinNT.HRESULT getRefreshName(VARIANT RHS);
            
    /**
     * <p>id(0x5c7)</p>
     */
    @ComProperty(name = "RefreshOnFileOpen", dispId = 0x5c7)
    com.sun.jna.platform.win32.WinNT.HRESULT getRefreshOnFileOpen(VARIANT RHS);
            
    /**
     * <p>id(0x5c7)</p>
     */
    @ComProperty(name = "RefreshOnFileOpen", dispId = 0x5c7)
    com.sun.jna.platform.win32.WinNT.HRESULT setRefreshOnFileOpen(Boolean RHS);
            
    /**
     * <p>id(0x5c8)</p>
     */
    @ComProperty(name = "Sql", dispId = 0x5c8)
    com.sun.jna.platform.win32.WinNT.HRESULT getSql(VARIANT RHS);
            
    /**
     * <p>id(0x5c8)</p>
     */
    @ComProperty(name = "Sql", dispId = 0x5c8)
    com.sun.jna.platform.win32.WinNT.HRESULT setSql(Object RHS);
            
    /**
     * <p>id(0x5c9)</p>
     */
    @ComProperty(name = "SavePassword", dispId = 0x5c9)
    com.sun.jna.platform.win32.WinNT.HRESULT getSavePassword(VARIANT RHS);
            
    /**
     * <p>id(0x5c9)</p>
     */
    @ComProperty(name = "SavePassword", dispId = 0x5c9)
    com.sun.jna.platform.win32.WinNT.HRESULT setSavePassword(Boolean RHS);
            
    /**
     * <p>id(0x2ae)</p>
     */
    @ComProperty(name = "SourceData", dispId = 0x2ae)
    com.sun.jna.platform.win32.WinNT.HRESULT getSourceData(VARIANT RHS);
            
    /**
     * <p>id(0x2ae)</p>
     */
    @ComProperty(name = "SourceData", dispId = 0x2ae)
    com.sun.jna.platform.win32.WinNT.HRESULT setSourceData(Object RHS);
            
    /**
     * <p>id(0x725)</p>
     */
    @ComProperty(name = "CommandText", dispId = 0x725)
    com.sun.jna.platform.win32.WinNT.HRESULT getCommandText(VARIANT RHS);
            
    /**
     * <p>id(0x725)</p>
     */
    @ComProperty(name = "CommandText", dispId = 0x725)
    com.sun.jna.platform.win32.WinNT.HRESULT setCommandText(Object RHS);
            
    /**
     * <p>id(0x726)</p>
     */
    @ComProperty(name = "CommandType", dispId = 0x726)
    com.sun.jna.platform.win32.WinNT.HRESULT getCommandType(VARIANT RHS);
            
    /**
     * <p>id(0x726)</p>
     */
    @ComProperty(name = "CommandType", dispId = 0x726)
    com.sun.jna.platform.win32.WinNT.HRESULT setCommandType(XlCmdType RHS);
            
    /**
     * <p>id(0x727)</p>
     */
    @ComProperty(name = "QueryType", dispId = 0x727)
    com.sun.jna.platform.win32.WinNT.HRESULT getQueryType(VARIANT RHS);
            
    /**
     * <p>id(0x728)</p>
     */
    @ComProperty(name = "MaintainConnection", dispId = 0x728)
    com.sun.jna.platform.win32.WinNT.HRESULT getMaintainConnection(VARIANT RHS);
            
    /**
     * <p>id(0x728)</p>
     */
    @ComProperty(name = "MaintainConnection", dispId = 0x728)
    com.sun.jna.platform.win32.WinNT.HRESULT setMaintainConnection(Boolean RHS);
            
    /**
     * <p>id(0x729)</p>
     */
    @ComProperty(name = "RefreshPeriod", dispId = 0x729)
    com.sun.jna.platform.win32.WinNT.HRESULT getRefreshPeriod(VARIANT RHS);
            
    /**
     * <p>id(0x729)</p>
     */
    @ComProperty(name = "RefreshPeriod", dispId = 0x729)
    com.sun.jna.platform.win32.WinNT.HRESULT setRefreshPeriod(Integer RHS);
            
    /**
     * <p>id(0x48d)</p>
     */
    @ComProperty(name = "Recordset", dispId = 0x48d)
    com.sun.jna.platform.win32.WinNT.HRESULT getRecordset(VARIANT RHS);
            
    /**
     * <p>id(0x48d)</p>
     */
    @ComProperty(name = "Recordset", dispId = 0x48d)
    com.sun.jna.platform.win32.WinNT.HRESULT setRecordset(com.sun.jna.platform.win32.COM.util.IDispatch RHS);
            
    /**
     * <p>id(0x72a)</p>
     */
    @ComMethod(name = "ResetTimer", dispId = 0x72a)
    com.sun.jna.platform.win32.WinNT.HRESULT ResetTimer();
            
    /**
     * <p>id(0x72b)</p>
     */
    @ComProperty(name = "LocalConnection", dispId = 0x72b)
    com.sun.jna.platform.win32.WinNT.HRESULT getLocalConnection(VARIANT RHS);
            
    /**
     * <p>id(0x72b)</p>
     */
    @ComProperty(name = "LocalConnection", dispId = 0x72b)
    com.sun.jna.platform.win32.WinNT.HRESULT setLocalConnection(Object RHS);
            
    /**
     * <p>id(0x72c)</p>
     */
    @ComMethod(name = "CreatePivotTable", dispId = 0x72c)
    com.sun.jna.platform.win32.WinNT.HRESULT CreatePivotTable(Object TableDestination,
            Object TableName,
            Object ReadData,
            Object DefaultVersion,
            VARIANT RHS);
            
    /**
     * <p>id(0x72d)</p>
     */
    @ComProperty(name = "UseLocalConnection", dispId = 0x72d)
    com.sun.jna.platform.win32.WinNT.HRESULT getUseLocalConnection(VARIANT RHS);
            
    /**
     * <p>id(0x72d)</p>
     */
    @ComProperty(name = "UseLocalConnection", dispId = 0x72d)
    com.sun.jna.platform.win32.WinNT.HRESULT setUseLocalConnection(Boolean RHS);
            
    /**
     * <p>id(0x81a)</p>
     */
    @ComProperty(name = "ADOConnection", dispId = 0x81a)
    com.sun.jna.platform.win32.WinNT.HRESULT getADOConnection(VARIANT RHS);
            
    /**
     * <p>id(0x81b)</p>
     */
    @ComProperty(name = "IsConnected", dispId = 0x81b)
    com.sun.jna.platform.win32.WinNT.HRESULT getIsConnected(VARIANT RHS);
            
    /**
     * <p>id(0x81c)</p>
     */
    @ComMethod(name = "MakeConnection", dispId = 0x81c)
    com.sun.jna.platform.win32.WinNT.HRESULT MakeConnection();
            
    /**
     * <p>id(0x81d)</p>
     */
    @ComProperty(name = "OLAP", dispId = 0x81d)
    com.sun.jna.platform.win32.WinNT.HRESULT getOLAP(VARIANT RHS);
            
    /**
     * <p>id(0x2ad)</p>
     */
    @ComProperty(name = "SourceType", dispId = 0x2ad)
    com.sun.jna.platform.win32.WinNT.HRESULT getSourceType(VARIANT RHS);
            
    /**
     * <p>id(0x81e)</p>
     */
    @ComProperty(name = "MissingItemsLimit", dispId = 0x81e)
    com.sun.jna.platform.win32.WinNT.HRESULT getMissingItemsLimit(VARIANT RHS);
            
    /**
     * <p>id(0x81e)</p>
     */
    @ComProperty(name = "MissingItemsLimit", dispId = 0x81e)
    com.sun.jna.platform.win32.WinNT.HRESULT setMissingItemsLimit(XlPivotTableMissingItems RHS);
            
    /**
     * <p>id(0x81f)</p>
     */
    @ComProperty(name = "SourceConnectionFile", dispId = 0x81f)
    com.sun.jna.platform.win32.WinNT.HRESULT getSourceConnectionFile(VARIANT RHS);
            
    /**
     * <p>id(0x81f)</p>
     */
    @ComProperty(name = "SourceConnectionFile", dispId = 0x81f)
    com.sun.jna.platform.win32.WinNT.HRESULT setSourceConnectionFile(String RHS);
            
    /**
     * <p>id(0x820)</p>
     */
    @ComProperty(name = "SourceDataFile", dispId = 0x820)
    com.sun.jna.platform.win32.WinNT.HRESULT getSourceDataFile(VARIANT RHS);
            
    /**
     * <p>id(0x821)</p>
     */
    @ComProperty(name = "RobustConnect", dispId = 0x821)
    com.sun.jna.platform.win32.WinNT.HRESULT getRobustConnect(VARIANT RHS);
            
    /**
     * <p>id(0x821)</p>
     */
    @ComProperty(name = "RobustConnect", dispId = 0x821)
    com.sun.jna.platform.win32.WinNT.HRESULT setRobustConnect(XlRobustConnect RHS);
            
    /**
     * <p>id(0x822)</p>
     */
    @ComMethod(name = "SaveAsODC", dispId = 0x822)
    com.sun.jna.platform.win32.WinNT.HRESULT SaveAsODC(String ODCFileName,
            Object Description,
            Object Keywords);
            
    /**
     * <p>id(0x9f0)</p>
     */
    @ComProperty(name = "WorkbookConnection", dispId = 0x9f0)
    com.sun.jna.platform.win32.WinNT.HRESULT getWorkbookConnection(VARIANT RHS);
            
    /**
     * <p>id(0x188)</p>
     */
    @ComProperty(name = "Version", dispId = 0x188)
    com.sun.jna.platform.win32.WinNT.HRESULT getVersion(VARIANT RHS);
            
    /**
     * <p>id(0x9f1)</p>
     */
    @ComProperty(name = "UpgradeOnRefresh", dispId = 0x9f1)
    com.sun.jna.platform.win32.WinNT.HRESULT getUpgradeOnRefresh(VARIANT RHS);
            
    /**
     * <p>id(0x9f1)</p>
     */
    @ComProperty(name = "UpgradeOnRefresh", dispId = 0x9f1)
    com.sun.jna.platform.win32.WinNT.HRESULT setUpgradeOnRefresh(Boolean RHS);
            
    /**
     * <p>id(0xbf6)</p>
     */
    @ComMethod(name = "CreatePivotChart", dispId = 0xbf6)
    com.sun.jna.platform.win32.WinNT.HRESULT CreatePivotChart(Object ChartDestination,
            Object XlChartType,
            Object Left,
            Object Top,
            Object Width,
            Object Height,
            VARIANT RHS);
            
    
}