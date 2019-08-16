
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({0002441C-0001-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{0002441C-0001-0000-C000-000000000046}")
public interface IPivotCache extends IUnknown, IRawDispatchHandle, IDispatch {
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
     * <p>id(0x593)</p>
     * <p>vtableId(10)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "BackgroundQuery", dispId = 0x593)
    com.sun.jna.platform.win32.WinNT.HRESULT getBackgroundQuery(VARIANT RHS);
            
    /**
     * <p>id(0x593)</p>
     * <p>vtableId(11)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "BackgroundQuery", dispId = 0x593)
    com.sun.jna.platform.win32.WinNT.HRESULT setBackgroundQuery(Boolean RHS);
            
    /**
     * <p>id(0x598)</p>
     * <p>vtableId(12)</p>
     * @param RHS [out] {@code Object}
     */
    @ComProperty(name = "Connection", dispId = 0x598)
    com.sun.jna.platform.win32.WinNT.HRESULT getConnection(VARIANT RHS);
            
    /**
     * <p>id(0x598)</p>
     * <p>vtableId(13)</p>
     * @param RHS [in] {@code Object}
     */
    @ComProperty(name = "Connection", dispId = 0x598)
    com.sun.jna.platform.win32.WinNT.HRESULT setConnection(Object RHS);
            
    /**
     * <p>id(0x5c5)</p>
     * <p>vtableId(14)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "EnableRefresh", dispId = 0x5c5)
    com.sun.jna.platform.win32.WinNT.HRESULT getEnableRefresh(VARIANT RHS);
            
    /**
     * <p>id(0x5c5)</p>
     * <p>vtableId(15)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "EnableRefresh", dispId = 0x5c5)
    com.sun.jna.platform.win32.WinNT.HRESULT setEnableRefresh(Boolean RHS);
            
    /**
     * <p>id(0x1e6)</p>
     * <p>vtableId(16)</p>
     * @param RHS [out] {@code Integer}
     */
    @ComProperty(name = "Index", dispId = 0x1e6)
    com.sun.jna.platform.win32.WinNT.HRESULT getIndex(VARIANT RHS);
            
    /**
     * <p>id(0x174)</p>
     * <p>vtableId(17)</p>
     * @param RHS [out] {@code Integer}
     */
    @ComProperty(name = "MemoryUsed", dispId = 0x174)
    com.sun.jna.platform.win32.WinNT.HRESULT getMemoryUsed(VARIANT RHS);
            
    /**
     * <p>id(0x594)</p>
     * <p>vtableId(18)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "OptimizeCache", dispId = 0x594)
    com.sun.jna.platform.win32.WinNT.HRESULT getOptimizeCache(VARIANT RHS);
            
    /**
     * <p>id(0x594)</p>
     * <p>vtableId(19)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "OptimizeCache", dispId = 0x594)
    com.sun.jna.platform.win32.WinNT.HRESULT setOptimizeCache(Boolean RHS);
            
    /**
     * <p>id(0x5c6)</p>
     * <p>vtableId(20)</p>
     * @param RHS [out] {@code Integer}
     */
    @ComProperty(name = "RecordCount", dispId = 0x5c6)
    com.sun.jna.platform.win32.WinNT.HRESULT getRecordCount(VARIANT RHS);
            
    /**
     * <p>id(0x589)</p>
     * <p>vtableId(21)</p>
     */
    @ComMethod(name = "Refresh", dispId = 0x589)
    com.sun.jna.platform.win32.WinNT.HRESULT Refresh();
            
    /**
     * <p>id(0x2b8)</p>
     * <p>vtableId(22)</p>
     * @param RHS [out] {@code java.util.Date}
     */
    @ComProperty(name = "RefreshDate", dispId = 0x2b8)
    com.sun.jna.platform.win32.WinNT.HRESULT getRefreshDate(VARIANT RHS);
            
    /**
     * <p>id(0x2b9)</p>
     * <p>vtableId(23)</p>
     * @param RHS [out] {@code String}
     */
    @ComProperty(name = "RefreshName", dispId = 0x2b9)
    com.sun.jna.platform.win32.WinNT.HRESULT getRefreshName(VARIANT RHS);
            
    /**
     * <p>id(0x5c7)</p>
     * <p>vtableId(24)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "RefreshOnFileOpen", dispId = 0x5c7)
    com.sun.jna.platform.win32.WinNT.HRESULT getRefreshOnFileOpen(VARIANT RHS);
            
    /**
     * <p>id(0x5c7)</p>
     * <p>vtableId(25)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "RefreshOnFileOpen", dispId = 0x5c7)
    com.sun.jna.platform.win32.WinNT.HRESULT setRefreshOnFileOpen(Boolean RHS);
            
    /**
     * <p>id(0x5c8)</p>
     * <p>vtableId(26)</p>
     * @param RHS [out] {@code Object}
     */
    @ComProperty(name = "Sql", dispId = 0x5c8)
    com.sun.jna.platform.win32.WinNT.HRESULT getSql(VARIANT RHS);
            
    /**
     * <p>id(0x5c8)</p>
     * <p>vtableId(27)</p>
     * @param RHS [in] {@code Object}
     */
    @ComProperty(name = "Sql", dispId = 0x5c8)
    com.sun.jna.platform.win32.WinNT.HRESULT setSql(Object RHS);
            
    /**
     * <p>id(0x5c9)</p>
     * <p>vtableId(28)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "SavePassword", dispId = 0x5c9)
    com.sun.jna.platform.win32.WinNT.HRESULT getSavePassword(VARIANT RHS);
            
    /**
     * <p>id(0x5c9)</p>
     * <p>vtableId(29)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "SavePassword", dispId = 0x5c9)
    com.sun.jna.platform.win32.WinNT.HRESULT setSavePassword(Boolean RHS);
            
    /**
     * <p>id(0x2ae)</p>
     * <p>vtableId(30)</p>
     * @param RHS [out] {@code Object}
     */
    @ComProperty(name = "SourceData", dispId = 0x2ae)
    com.sun.jna.platform.win32.WinNT.HRESULT getSourceData(VARIANT RHS);
            
    /**
     * <p>id(0x2ae)</p>
     * <p>vtableId(31)</p>
     * @param RHS [in] {@code Object}
     */
    @ComProperty(name = "SourceData", dispId = 0x2ae)
    com.sun.jna.platform.win32.WinNT.HRESULT setSourceData(Object RHS);
            
    /**
     * <p>id(0x725)</p>
     * <p>vtableId(32)</p>
     * @param RHS [out] {@code Object}
     */
    @ComProperty(name = "CommandText", dispId = 0x725)
    com.sun.jna.platform.win32.WinNT.HRESULT getCommandText(VARIANT RHS);
            
    /**
     * <p>id(0x725)</p>
     * <p>vtableId(33)</p>
     * @param RHS [in] {@code Object}
     */
    @ComProperty(name = "CommandText", dispId = 0x725)
    com.sun.jna.platform.win32.WinNT.HRESULT setCommandText(Object RHS);
            
    /**
     * <p>id(0x726)</p>
     * <p>vtableId(34)</p>
     * @param RHS [out] {@code XlCmdType}
     */
    @ComProperty(name = "CommandType", dispId = 0x726)
    com.sun.jna.platform.win32.WinNT.HRESULT getCommandType(VARIANT RHS);
            
    /**
     * <p>id(0x726)</p>
     * <p>vtableId(35)</p>
     * @param RHS [in] {@code XlCmdType}
     */
    @ComProperty(name = "CommandType", dispId = 0x726)
    com.sun.jna.platform.win32.WinNT.HRESULT setCommandType(XlCmdType RHS);
            
    /**
     * <p>id(0x727)</p>
     * <p>vtableId(36)</p>
     * @param RHS [out] {@code XlQueryType}
     */
    @ComProperty(name = "QueryType", dispId = 0x727)
    com.sun.jna.platform.win32.WinNT.HRESULT getQueryType(VARIANT RHS);
            
    /**
     * <p>id(0x728)</p>
     * <p>vtableId(37)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "MaintainConnection", dispId = 0x728)
    com.sun.jna.platform.win32.WinNT.HRESULT getMaintainConnection(VARIANT RHS);
            
    /**
     * <p>id(0x728)</p>
     * <p>vtableId(38)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "MaintainConnection", dispId = 0x728)
    com.sun.jna.platform.win32.WinNT.HRESULT setMaintainConnection(Boolean RHS);
            
    /**
     * <p>id(0x729)</p>
     * <p>vtableId(39)</p>
     * @param RHS [out] {@code Integer}
     */
    @ComProperty(name = "RefreshPeriod", dispId = 0x729)
    com.sun.jna.platform.win32.WinNT.HRESULT getRefreshPeriod(VARIANT RHS);
            
    /**
     * <p>id(0x729)</p>
     * <p>vtableId(40)</p>
     * @param RHS [in] {@code Integer}
     */
    @ComProperty(name = "RefreshPeriod", dispId = 0x729)
    com.sun.jna.platform.win32.WinNT.HRESULT setRefreshPeriod(Integer RHS);
            
    /**
     * <p>id(0x48d)</p>
     * <p>vtableId(41)</p>
     * @param RHS [out] {@code com.sun.jna.platform.win32.COM.util.IDispatch}
     */
    @ComProperty(name = "Recordset", dispId = 0x48d)
    com.sun.jna.platform.win32.WinNT.HRESULT getRecordset(VARIANT RHS);
            
    /**
     * <p>id(0x72a)</p>
     * <p>vtableId(43)</p>
     */
    @ComMethod(name = "ResetTimer", dispId = 0x72a)
    com.sun.jna.platform.win32.WinNT.HRESULT ResetTimer();
            
    /**
     * <p>id(0x72b)</p>
     * <p>vtableId(44)</p>
     * @param RHS [out] {@code Object}
     */
    @ComProperty(name = "LocalConnection", dispId = 0x72b)
    com.sun.jna.platform.win32.WinNT.HRESULT getLocalConnection(VARIANT RHS);
            
    /**
     * <p>id(0x72b)</p>
     * <p>vtableId(45)</p>
     * @param RHS [in] {@code Object}
     */
    @ComProperty(name = "LocalConnection", dispId = 0x72b)
    com.sun.jna.platform.win32.WinNT.HRESULT setLocalConnection(Object RHS);
            
    /**
     * <p>id(0x72c)</p>
     * <p>vtableId(46)</p>
     * @param TableDestination [in] {@code Object}
     * @param TableName [in, optional] {@code Object}
     * @param ReadData [in, optional] {@code Object}
     * @param DefaultVersion [in, optional] {@code Object}
     * @param RHS [out] {@code PivotTable}
     */
    @ComMethod(name = "CreatePivotTable", dispId = 0x72c)
    com.sun.jna.platform.win32.WinNT.HRESULT CreatePivotTable(Object TableDestination,
            Object TableName,
            Object ReadData,
            Object DefaultVersion,
            VARIANT RHS);
            
    /**
     * <p>id(0x72d)</p>
     * <p>vtableId(47)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "UseLocalConnection", dispId = 0x72d)
    com.sun.jna.platform.win32.WinNT.HRESULT getUseLocalConnection(VARIANT RHS);
            
    /**
     * <p>id(0x72d)</p>
     * <p>vtableId(48)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "UseLocalConnection", dispId = 0x72d)
    com.sun.jna.platform.win32.WinNT.HRESULT setUseLocalConnection(Boolean RHS);
            
    /**
     * <p>id(0x81a)</p>
     * <p>vtableId(49)</p>
     * @param RHS [out] {@code com.sun.jna.platform.win32.COM.util.IDispatch}
     */
    @ComProperty(name = "ADOConnection", dispId = 0x81a)
    com.sun.jna.platform.win32.WinNT.HRESULT getADOConnection(VARIANT RHS);
            
    /**
     * <p>id(0x81b)</p>
     * <p>vtableId(50)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "IsConnected", dispId = 0x81b)
    com.sun.jna.platform.win32.WinNT.HRESULT getIsConnected(VARIANT RHS);
            
    /**
     * <p>id(0x81c)</p>
     * <p>vtableId(51)</p>
     */
    @ComMethod(name = "MakeConnection", dispId = 0x81c)
    com.sun.jna.platform.win32.WinNT.HRESULT MakeConnection();
            
    /**
     * <p>id(0x81d)</p>
     * <p>vtableId(52)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "OLAP", dispId = 0x81d)
    com.sun.jna.platform.win32.WinNT.HRESULT getOLAP(VARIANT RHS);
            
    /**
     * <p>id(0x2ad)</p>
     * <p>vtableId(53)</p>
     * @param RHS [out] {@code XlPivotTableSourceType}
     */
    @ComProperty(name = "SourceType", dispId = 0x2ad)
    com.sun.jna.platform.win32.WinNT.HRESULT getSourceType(VARIANT RHS);
            
    /**
     * <p>id(0x81e)</p>
     * <p>vtableId(54)</p>
     * @param RHS [out] {@code XlPivotTableMissingItems}
     */
    @ComProperty(name = "MissingItemsLimit", dispId = 0x81e)
    com.sun.jna.platform.win32.WinNT.HRESULT getMissingItemsLimit(VARIANT RHS);
            
    /**
     * <p>id(0x81e)</p>
     * <p>vtableId(55)</p>
     * @param RHS [in] {@code XlPivotTableMissingItems}
     */
    @ComProperty(name = "MissingItemsLimit", dispId = 0x81e)
    com.sun.jna.platform.win32.WinNT.HRESULT setMissingItemsLimit(XlPivotTableMissingItems RHS);
            
    /**
     * <p>id(0x81f)</p>
     * <p>vtableId(56)</p>
     * @param RHS [out] {@code String}
     */
    @ComProperty(name = "SourceConnectionFile", dispId = 0x81f)
    com.sun.jna.platform.win32.WinNT.HRESULT getSourceConnectionFile(VARIANT RHS);
            
    /**
     * <p>id(0x81f)</p>
     * <p>vtableId(57)</p>
     * @param RHS [in] {@code String}
     */
    @ComProperty(name = "SourceConnectionFile", dispId = 0x81f)
    com.sun.jna.platform.win32.WinNT.HRESULT setSourceConnectionFile(String RHS);
            
    /**
     * <p>id(0x820)</p>
     * <p>vtableId(58)</p>
     * @param RHS [out] {@code String}
     */
    @ComProperty(name = "SourceDataFile", dispId = 0x820)
    com.sun.jna.platform.win32.WinNT.HRESULT getSourceDataFile(VARIANT RHS);
            
    /**
     * <p>id(0x821)</p>
     * <p>vtableId(59)</p>
     * @param RHS [out] {@code XlRobustConnect}
     */
    @ComProperty(name = "RobustConnect", dispId = 0x821)
    com.sun.jna.platform.win32.WinNT.HRESULT getRobustConnect(VARIANT RHS);
            
    /**
     * <p>id(0x821)</p>
     * <p>vtableId(60)</p>
     * @param RHS [in] {@code XlRobustConnect}
     */
    @ComProperty(name = "RobustConnect", dispId = 0x821)
    com.sun.jna.platform.win32.WinNT.HRESULT setRobustConnect(XlRobustConnect RHS);
            
    /**
     * <p>id(0x822)</p>
     * <p>vtableId(61)</p>
     * @param ODCFileName [in] {@code String}
     * @param Description [in, optional] {@code Object}
     * @param Keywords [in, optional] {@code Object}
     */
    @ComMethod(name = "SaveAsODC", dispId = 0x822)
    com.sun.jna.platform.win32.WinNT.HRESULT SaveAsODC(String ODCFileName,
            Object Description,
            Object Keywords);
            
    /**
     * <p>id(0x9f0)</p>
     * <p>vtableId(62)</p>
     * @param RHS [out] {@code WorkbookConnection}
     */
    @ComProperty(name = "WorkbookConnection", dispId = 0x9f0)
    com.sun.jna.platform.win32.WinNT.HRESULT getWorkbookConnection(VARIANT RHS);
            
    /**
     * <p>id(0x188)</p>
     * <p>vtableId(63)</p>
     * @param RHS [out] {@code XlPivotTableVersionList}
     */
    @ComProperty(name = "Version", dispId = 0x188)
    com.sun.jna.platform.win32.WinNT.HRESULT getVersion(VARIANT RHS);
            
    /**
     * <p>id(0x9f1)</p>
     * <p>vtableId(64)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "UpgradeOnRefresh", dispId = 0x9f1)
    com.sun.jna.platform.win32.WinNT.HRESULT getUpgradeOnRefresh(VARIANT RHS);
            
    /**
     * <p>id(0x9f1)</p>
     * <p>vtableId(65)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "UpgradeOnRefresh", dispId = 0x9f1)
    com.sun.jna.platform.win32.WinNT.HRESULT setUpgradeOnRefresh(Boolean RHS);
            
    /**
     * <p>id(0xbf6)</p>
     * <p>vtableId(66)</p>
     * @param ChartDestination [in] {@code Object}
     * @param XlChartType [in, optional] {@code Object}
     * @param Left [in, optional] {@code Object}
     * @param Top [in, optional] {@code Object}
     * @param Width [in, optional] {@code Object}
     * @param Height [in, optional] {@code Object}
     * @param RHS [out] {@code Shape}
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