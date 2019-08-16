
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({0002448D-0001-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{0002448D-0001-0000-C000-000000000046}")
public interface IOLEDBConnection extends IUnknown, IRawDispatchHandle, IDispatch {
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
     * <p>id(0x81a)</p>
     * <p>vtableId(10)</p>
     * @param RHS [out] {@code com.sun.jna.platform.win32.COM.util.IDispatch}
     */
    @ComProperty(name = "ADOConnection", dispId = 0x81a)
    com.sun.jna.platform.win32.WinNT.HRESULT getADOConnection(VARIANT RHS);
            
    /**
     * <p>id(0x593)</p>
     * <p>vtableId(11)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "BackgroundQuery", dispId = 0x593)
    com.sun.jna.platform.win32.WinNT.HRESULT getBackgroundQuery(VARIANT RHS);
            
    /**
     * <p>id(0x593)</p>
     * <p>vtableId(12)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "BackgroundQuery", dispId = 0x593)
    com.sun.jna.platform.win32.WinNT.HRESULT setBackgroundQuery(Boolean RHS);
            
    /**
     * <p>id(0x635)</p>
     * <p>vtableId(13)</p>
     */
    @ComMethod(name = "CancelRefresh", dispId = 0x635)
    com.sun.jna.platform.win32.WinNT.HRESULT CancelRefresh();
            
    /**
     * <p>id(0x725)</p>
     * <p>vtableId(14)</p>
     * @param RHS [out] {@code Object}
     */
    @ComProperty(name = "CommandText", dispId = 0x725)
    com.sun.jna.platform.win32.WinNT.HRESULT getCommandText(VARIANT RHS);
            
    /**
     * <p>id(0x725)</p>
     * <p>vtableId(15)</p>
     * @param RHS [in] {@code Object}
     */
    @ComProperty(name = "CommandText", dispId = 0x725)
    com.sun.jna.platform.win32.WinNT.HRESULT setCommandText(Object RHS);
            
    /**
     * <p>id(0x726)</p>
     * <p>vtableId(16)</p>
     * @param RHS [out] {@code XlCmdType}
     */
    @ComProperty(name = "CommandType", dispId = 0x726)
    com.sun.jna.platform.win32.WinNT.HRESULT getCommandType(VARIANT RHS);
            
    /**
     * <p>id(0x726)</p>
     * <p>vtableId(17)</p>
     * @param RHS [in] {@code XlCmdType}
     */
    @ComProperty(name = "CommandType", dispId = 0x726)
    com.sun.jna.platform.win32.WinNT.HRESULT setCommandType(XlCmdType RHS);
            
    /**
     * <p>id(0x598)</p>
     * <p>vtableId(18)</p>
     * @param RHS [out] {@code Object}
     */
    @ComProperty(name = "Connection", dispId = 0x598)
    com.sun.jna.platform.win32.WinNT.HRESULT getConnection(VARIANT RHS);
            
    /**
     * <p>id(0x598)</p>
     * <p>vtableId(19)</p>
     * @param RHS [in] {@code Object}
     */
    @ComProperty(name = "Connection", dispId = 0x598)
    com.sun.jna.platform.win32.WinNT.HRESULT setConnection(Object RHS);
            
    /**
     * <p>id(0x5c5)</p>
     * <p>vtableId(20)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "EnableRefresh", dispId = 0x5c5)
    com.sun.jna.platform.win32.WinNT.HRESULT getEnableRefresh(VARIANT RHS);
            
    /**
     * <p>id(0x5c5)</p>
     * <p>vtableId(21)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "EnableRefresh", dispId = 0x5c5)
    com.sun.jna.platform.win32.WinNT.HRESULT setEnableRefresh(Boolean RHS);
            
    /**
     * <p>id(0x72b)</p>
     * <p>vtableId(22)</p>
     * @param RHS [out] {@code Object}
     */
    @ComProperty(name = "LocalConnection", dispId = 0x72b)
    com.sun.jna.platform.win32.WinNT.HRESULT getLocalConnection(VARIANT RHS);
            
    /**
     * <p>id(0x72b)</p>
     * <p>vtableId(23)</p>
     * @param RHS [in] {@code Object}
     */
    @ComProperty(name = "LocalConnection", dispId = 0x72b)
    com.sun.jna.platform.win32.WinNT.HRESULT setLocalConnection(Object RHS);
            
    /**
     * <p>id(0x728)</p>
     * <p>vtableId(24)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "MaintainConnection", dispId = 0x728)
    com.sun.jna.platform.win32.WinNT.HRESULT getMaintainConnection(VARIANT RHS);
            
    /**
     * <p>id(0x728)</p>
     * <p>vtableId(25)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "MaintainConnection", dispId = 0x728)
    com.sun.jna.platform.win32.WinNT.HRESULT setMaintainConnection(Boolean RHS);
            
    /**
     * <p>id(0x81c)</p>
     * <p>vtableId(26)</p>
     */
    @ComMethod(name = "MakeConnection", dispId = 0x81c)
    com.sun.jna.platform.win32.WinNT.HRESULT MakeConnection();
            
    /**
     * <p>id(0x589)</p>
     * <p>vtableId(27)</p>
     */
    @ComMethod(name = "Refresh", dispId = 0x589)
    com.sun.jna.platform.win32.WinNT.HRESULT Refresh();
            
    /**
     * <p>id(0x2b8)</p>
     * <p>vtableId(28)</p>
     * @param RHS [out] {@code java.util.Date}
     */
    @ComProperty(name = "RefreshDate", dispId = 0x2b8)
    com.sun.jna.platform.win32.WinNT.HRESULT getRefreshDate(VARIANT RHS);
            
    /**
     * <p>id(0x633)</p>
     * <p>vtableId(29)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "Refreshing", dispId = 0x633)
    com.sun.jna.platform.win32.WinNT.HRESULT getRefreshing(VARIANT RHS);
            
    /**
     * <p>id(0x5c7)</p>
     * <p>vtableId(30)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "RefreshOnFileOpen", dispId = 0x5c7)
    com.sun.jna.platform.win32.WinNT.HRESULT getRefreshOnFileOpen(VARIANT RHS);
            
    /**
     * <p>id(0x5c7)</p>
     * <p>vtableId(31)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "RefreshOnFileOpen", dispId = 0x5c7)
    com.sun.jna.platform.win32.WinNT.HRESULT setRefreshOnFileOpen(Boolean RHS);
            
    /**
     * <p>id(0x729)</p>
     * <p>vtableId(32)</p>
     * @param RHS [out] {@code Integer}
     */
    @ComProperty(name = "RefreshPeriod", dispId = 0x729)
    com.sun.jna.platform.win32.WinNT.HRESULT getRefreshPeriod(VARIANT RHS);
            
    /**
     * <p>id(0x729)</p>
     * <p>vtableId(33)</p>
     * @param RHS [in] {@code Integer}
     */
    @ComProperty(name = "RefreshPeriod", dispId = 0x729)
    com.sun.jna.platform.win32.WinNT.HRESULT setRefreshPeriod(Integer RHS);
            
    /**
     * <p>id(0x821)</p>
     * <p>vtableId(34)</p>
     * @param RHS [out] {@code XlRobustConnect}
     */
    @ComProperty(name = "RobustConnect", dispId = 0x821)
    com.sun.jna.platform.win32.WinNT.HRESULT getRobustConnect(VARIANT RHS);
            
    /**
     * <p>id(0x821)</p>
     * <p>vtableId(35)</p>
     * @param RHS [in] {@code XlRobustConnect}
     */
    @ComProperty(name = "RobustConnect", dispId = 0x821)
    com.sun.jna.platform.win32.WinNT.HRESULT setRobustConnect(XlRobustConnect RHS);
            
    /**
     * <p>id(0x822)</p>
     * <p>vtableId(36)</p>
     * @param ODCFileName [in] {@code String}
     * @param Description [in, optional] {@code Object}
     * @param Keywords [in, optional] {@code Object}
     */
    @ComMethod(name = "SaveAsODC", dispId = 0x822)
    com.sun.jna.platform.win32.WinNT.HRESULT SaveAsODC(String ODCFileName,
            Object Description,
            Object Keywords);
            
    /**
     * <p>id(0x5c9)</p>
     * <p>vtableId(37)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "SavePassword", dispId = 0x5c9)
    com.sun.jna.platform.win32.WinNT.HRESULT getSavePassword(VARIANT RHS);
            
    /**
     * <p>id(0x5c9)</p>
     * <p>vtableId(38)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "SavePassword", dispId = 0x5c9)
    com.sun.jna.platform.win32.WinNT.HRESULT setSavePassword(Boolean RHS);
            
    /**
     * <p>id(0x81f)</p>
     * <p>vtableId(39)</p>
     * @param RHS [out] {@code String}
     */
    @ComProperty(name = "SourceConnectionFile", dispId = 0x81f)
    com.sun.jna.platform.win32.WinNT.HRESULT getSourceConnectionFile(VARIANT RHS);
            
    /**
     * <p>id(0x81f)</p>
     * <p>vtableId(40)</p>
     * @param RHS [in] {@code String}
     */
    @ComProperty(name = "SourceConnectionFile", dispId = 0x81f)
    com.sun.jna.platform.win32.WinNT.HRESULT setSourceConnectionFile(String RHS);
            
    /**
     * <p>id(0x820)</p>
     * <p>vtableId(41)</p>
     * @param RHS [out] {@code String}
     */
    @ComProperty(name = "SourceDataFile", dispId = 0x820)
    com.sun.jna.platform.win32.WinNT.HRESULT getSourceDataFile(VARIANT RHS);
            
    /**
     * <p>id(0x820)</p>
     * <p>vtableId(42)</p>
     * @param RHS [in] {@code String}
     */
    @ComProperty(name = "SourceDataFile", dispId = 0x820)
    com.sun.jna.platform.win32.WinNT.HRESULT setSourceDataFile(String RHS);
            
    /**
     * <p>id(0x81d)</p>
     * <p>vtableId(43)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "OLAP", dispId = 0x81d)
    com.sun.jna.platform.win32.WinNT.HRESULT getOLAP(VARIANT RHS);
            
    /**
     * <p>id(0x72d)</p>
     * <p>vtableId(44)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "UseLocalConnection", dispId = 0x72d)
    com.sun.jna.platform.win32.WinNT.HRESULT getUseLocalConnection(VARIANT RHS);
            
    /**
     * <p>id(0x72d)</p>
     * <p>vtableId(45)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "UseLocalConnection", dispId = 0x72d)
    com.sun.jna.platform.win32.WinNT.HRESULT setUseLocalConnection(Boolean RHS);
            
    /**
     * <p>id(0xa8f)</p>
     * <p>vtableId(46)</p>
     * @param RHS [out] {@code Integer}
     */
    @ComProperty(name = "MaxDrillthroughRecords", dispId = 0xa8f)
    com.sun.jna.platform.win32.WinNT.HRESULT getMaxDrillthroughRecords(VARIANT RHS);
            
    /**
     * <p>id(0xa8f)</p>
     * <p>vtableId(47)</p>
     * @param RHS [in] {@code Integer}
     */
    @ComProperty(name = "MaxDrillthroughRecords", dispId = 0xa8f)
    com.sun.jna.platform.win32.WinNT.HRESULT setMaxDrillthroughRecords(Integer RHS);
            
    /**
     * <p>id(0x81b)</p>
     * <p>vtableId(48)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "IsConnected", dispId = 0x81b)
    com.sun.jna.platform.win32.WinNT.HRESULT getIsConnected(VARIANT RHS);
            
    /**
     * <p>id(0xa90)</p>
     * <p>vtableId(49)</p>
     * @param RHS [out] {@code XlCredentialsMethod}
     */
    @ComProperty(name = "ServerCredentialsMethod", dispId = 0xa90)
    com.sun.jna.platform.win32.WinNT.HRESULT getServerCredentialsMethod(VARIANT RHS);
            
    /**
     * <p>id(0xa90)</p>
     * <p>vtableId(50)</p>
     * @param RHS [in] {@code XlCredentialsMethod}
     */
    @ComProperty(name = "ServerCredentialsMethod", dispId = 0xa90)
    com.sun.jna.platform.win32.WinNT.HRESULT setServerCredentialsMethod(XlCredentialsMethod RHS);
            
    /**
     * <p>id(0xa91)</p>
     * <p>vtableId(51)</p>
     * @param RHS [out] {@code String}
     */
    @ComProperty(name = "ServerSSOApplicationID", dispId = 0xa91)
    com.sun.jna.platform.win32.WinNT.HRESULT getServerSSOApplicationID(VARIANT RHS);
            
    /**
     * <p>id(0xa91)</p>
     * <p>vtableId(52)</p>
     * @param RHS [in] {@code String}
     */
    @ComProperty(name = "ServerSSOApplicationID", dispId = 0xa91)
    com.sun.jna.platform.win32.WinNT.HRESULT setServerSSOApplicationID(String RHS);
            
    /**
     * <p>id(0xa92)</p>
     * <p>vtableId(53)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "AlwaysUseConnectionFile", dispId = 0xa92)
    com.sun.jna.platform.win32.WinNT.HRESULT getAlwaysUseConnectionFile(VARIANT RHS);
            
    /**
     * <p>id(0xa92)</p>
     * <p>vtableId(54)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "AlwaysUseConnectionFile", dispId = 0xa92)
    com.sun.jna.platform.win32.WinNT.HRESULT setAlwaysUseConnectionFile(Boolean RHS);
            
    /**
     * <p>id(0xa93)</p>
     * <p>vtableId(55)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "ServerFillColor", dispId = 0xa93)
    com.sun.jna.platform.win32.WinNT.HRESULT getServerFillColor(VARIANT RHS);
            
    /**
     * <p>id(0xa93)</p>
     * <p>vtableId(56)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "ServerFillColor", dispId = 0xa93)
    com.sun.jna.platform.win32.WinNT.HRESULT setServerFillColor(Boolean RHS);
            
    /**
     * <p>id(0xa94)</p>
     * <p>vtableId(57)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "ServerFontStyle", dispId = 0xa94)
    com.sun.jna.platform.win32.WinNT.HRESULT getServerFontStyle(VARIANT RHS);
            
    /**
     * <p>id(0xa94)</p>
     * <p>vtableId(58)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "ServerFontStyle", dispId = 0xa94)
    com.sun.jna.platform.win32.WinNT.HRESULT setServerFontStyle(Boolean RHS);
            
    /**
     * <p>id(0xa95)</p>
     * <p>vtableId(59)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "ServerNumberFormat", dispId = 0xa95)
    com.sun.jna.platform.win32.WinNT.HRESULT getServerNumberFormat(VARIANT RHS);
            
    /**
     * <p>id(0xa95)</p>
     * <p>vtableId(60)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "ServerNumberFormat", dispId = 0xa95)
    com.sun.jna.platform.win32.WinNT.HRESULT setServerNumberFormat(Boolean RHS);
            
    /**
     * <p>id(0xa96)</p>
     * <p>vtableId(61)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "ServerTextColor", dispId = 0xa96)
    com.sun.jna.platform.win32.WinNT.HRESULT getServerTextColor(VARIANT RHS);
            
    /**
     * <p>id(0xa96)</p>
     * <p>vtableId(62)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "ServerTextColor", dispId = 0xa96)
    com.sun.jna.platform.win32.WinNT.HRESULT setServerTextColor(Boolean RHS);
            
    /**
     * <p>id(0xa97)</p>
     * <p>vtableId(63)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "RetrieveInOfficeUILang", dispId = 0xa97)
    com.sun.jna.platform.win32.WinNT.HRESULT getRetrieveInOfficeUILang(VARIANT RHS);
            
    /**
     * <p>id(0xa97)</p>
     * <p>vtableId(64)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "RetrieveInOfficeUILang", dispId = 0xa97)
    com.sun.jna.platform.win32.WinNT.HRESULT setRetrieveInOfficeUILang(Boolean RHS);
            
    /**
     * <p>id(0xb7b)</p>
     * <p>vtableId(65)</p>
     */
    @ComMethod(name = "Reconnect", dispId = 0xb7b)
    com.sun.jna.platform.win32.WinNT.HRESULT Reconnect();
            
    /**
     * <p>id(0x84d)</p>
     * <p>vtableId(66)</p>
     * @param RHS [out] {@code CalculatedMembers}
     */
    @ComProperty(name = "CalculatedMembers", dispId = 0x84d)
    com.sun.jna.platform.win32.WinNT.HRESULT getCalculatedMembers(VARIANT RHS);
            
    /**
     * <p>id(0xb7c)</p>
     * <p>vtableId(67)</p>
     * @param RHS [out] {@code Integer}
     */
    @ComProperty(name = "LocaleID", dispId = 0xb7c)
    com.sun.jna.platform.win32.WinNT.HRESULT getLocaleID(VARIANT RHS);
            
    /**
     * <p>id(0xb7c)</p>
     * <p>vtableId(68)</p>
     * @param RHS [in] {@code Integer}
     */
    @ComProperty(name = "LocaleID", dispId = 0xb7c)
    com.sun.jna.platform.win32.WinNT.HRESULT setLocaleID(Integer RHS);
            
    
}