
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({0002448D-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{0002448D-0000-0000-C000-000000000046}")
public interface OLEDBConnection extends IUnknown, IRawDispatchHandle, IDispatch {
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
     * <p>id(0x81a)</p>
     * <p>vtableId(10)</p>
     */
    @ComProperty(name = "ADOConnection", dispId = 0x81a)
    com.sun.jna.platform.win32.COM.util.IDispatch getADOConnection();
            
    /**
     * <p>id(0x593)</p>
     * <p>vtableId(11)</p>
     */
    @ComProperty(name = "BackgroundQuery", dispId = 0x593)
    Boolean getBackgroundQuery();
            
    /**
     * <p>id(0x593)</p>
     * <p>vtableId(12)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "BackgroundQuery", dispId = 0x593)
    void setBackgroundQuery(Boolean param0);
            
    /**
     * <p>id(0x635)</p>
     * <p>vtableId(13)</p>
     */
    @ComMethod(name = "CancelRefresh", dispId = 0x635)
    void CancelRefresh();
            
    /**
     * <p>id(0x725)</p>
     * <p>vtableId(14)</p>
     */
    @ComProperty(name = "CommandText", dispId = 0x725)
    Object getCommandText();
            
    /**
     * <p>id(0x725)</p>
     * <p>vtableId(15)</p>
     * @param param0 [in] {@code Object}
     */
    @ComProperty(name = "CommandText", dispId = 0x725)
    void setCommandText(Object param0);
            
    /**
     * <p>id(0x726)</p>
     * <p>vtableId(16)</p>
     */
    @ComProperty(name = "CommandType", dispId = 0x726)
    XlCmdType getCommandType();
            
    /**
     * <p>id(0x726)</p>
     * <p>vtableId(17)</p>
     * @param param0 [in] {@code XlCmdType}
     */
    @ComProperty(name = "CommandType", dispId = 0x726)
    void setCommandType(XlCmdType param0);
            
    /**
     * <p>id(0x598)</p>
     * <p>vtableId(18)</p>
     */
    @ComProperty(name = "Connection", dispId = 0x598)
    Object getConnection();
            
    /**
     * <p>id(0x598)</p>
     * <p>vtableId(19)</p>
     * @param param0 [in] {@code Object}
     */
    @ComProperty(name = "Connection", dispId = 0x598)
    void setConnection(Object param0);
            
    /**
     * <p>id(0x5c5)</p>
     * <p>vtableId(20)</p>
     */
    @ComProperty(name = "EnableRefresh", dispId = 0x5c5)
    Boolean getEnableRefresh();
            
    /**
     * <p>id(0x5c5)</p>
     * <p>vtableId(21)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "EnableRefresh", dispId = 0x5c5)
    void setEnableRefresh(Boolean param0);
            
    /**
     * <p>id(0x72b)</p>
     * <p>vtableId(22)</p>
     */
    @ComProperty(name = "LocalConnection", dispId = 0x72b)
    Object getLocalConnection();
            
    /**
     * <p>id(0x72b)</p>
     * <p>vtableId(23)</p>
     * @param param0 [in] {@code Object}
     */
    @ComProperty(name = "LocalConnection", dispId = 0x72b)
    void setLocalConnection(Object param0);
            
    /**
     * <p>id(0x728)</p>
     * <p>vtableId(24)</p>
     */
    @ComProperty(name = "MaintainConnection", dispId = 0x728)
    Boolean getMaintainConnection();
            
    /**
     * <p>id(0x728)</p>
     * <p>vtableId(25)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "MaintainConnection", dispId = 0x728)
    void setMaintainConnection(Boolean param0);
            
    /**
     * <p>id(0x81c)</p>
     * <p>vtableId(26)</p>
     */
    @ComMethod(name = "MakeConnection", dispId = 0x81c)
    void MakeConnection();
            
    /**
     * <p>id(0x589)</p>
     * <p>vtableId(27)</p>
     */
    @ComMethod(name = "Refresh", dispId = 0x589)
    void Refresh();
            
    /**
     * <p>id(0x2b8)</p>
     * <p>vtableId(28)</p>
     */
    @ComProperty(name = "RefreshDate", dispId = 0x2b8)
    java.util.Date getRefreshDate();
            
    /**
     * <p>id(0x633)</p>
     * <p>vtableId(29)</p>
     */
    @ComProperty(name = "Refreshing", dispId = 0x633)
    Boolean getRefreshing();
            
    /**
     * <p>id(0x5c7)</p>
     * <p>vtableId(30)</p>
     */
    @ComProperty(name = "RefreshOnFileOpen", dispId = 0x5c7)
    Boolean getRefreshOnFileOpen();
            
    /**
     * <p>id(0x5c7)</p>
     * <p>vtableId(31)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "RefreshOnFileOpen", dispId = 0x5c7)
    void setRefreshOnFileOpen(Boolean param0);
            
    /**
     * <p>id(0x729)</p>
     * <p>vtableId(32)</p>
     */
    @ComProperty(name = "RefreshPeriod", dispId = 0x729)
    Integer getRefreshPeriod();
            
    /**
     * <p>id(0x729)</p>
     * <p>vtableId(33)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "RefreshPeriod", dispId = 0x729)
    void setRefreshPeriod(Integer param0);
            
    /**
     * <p>id(0x821)</p>
     * <p>vtableId(34)</p>
     */
    @ComProperty(name = "RobustConnect", dispId = 0x821)
    XlRobustConnect getRobustConnect();
            
    /**
     * <p>id(0x821)</p>
     * <p>vtableId(35)</p>
     * @param param0 [in] {@code XlRobustConnect}
     */
    @ComProperty(name = "RobustConnect", dispId = 0x821)
    void setRobustConnect(XlRobustConnect param0);
            
    /**
     * <p>id(0x822)</p>
     * <p>vtableId(36)</p>
     * @param ODCFileName [in] {@code String}
     * @param Description [in, optional] {@code Object}
     * @param Keywords [in, optional] {@code Object}
     */
    @ComMethod(name = "SaveAsODC", dispId = 0x822)
    void SaveAsODC(String ODCFileName,
            Object Description,
            Object Keywords);
            
    /**
     * <p>id(0x5c9)</p>
     * <p>vtableId(37)</p>
     */
    @ComProperty(name = "SavePassword", dispId = 0x5c9)
    Boolean getSavePassword();
            
    /**
     * <p>id(0x5c9)</p>
     * <p>vtableId(38)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "SavePassword", dispId = 0x5c9)
    void setSavePassword(Boolean param0);
            
    /**
     * <p>id(0x81f)</p>
     * <p>vtableId(39)</p>
     */
    @ComProperty(name = "SourceConnectionFile", dispId = 0x81f)
    String getSourceConnectionFile();
            
    /**
     * <p>id(0x81f)</p>
     * <p>vtableId(40)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "SourceConnectionFile", dispId = 0x81f)
    void setSourceConnectionFile(String param0);
            
    /**
     * <p>id(0x820)</p>
     * <p>vtableId(41)</p>
     */
    @ComProperty(name = "SourceDataFile", dispId = 0x820)
    String getSourceDataFile();
            
    /**
     * <p>id(0x820)</p>
     * <p>vtableId(42)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "SourceDataFile", dispId = 0x820)
    void setSourceDataFile(String param0);
            
    /**
     * <p>id(0x81d)</p>
     * <p>vtableId(43)</p>
     */
    @ComProperty(name = "OLAP", dispId = 0x81d)
    Boolean getOLAP();
            
    /**
     * <p>id(0x72d)</p>
     * <p>vtableId(44)</p>
     */
    @ComProperty(name = "UseLocalConnection", dispId = 0x72d)
    Boolean getUseLocalConnection();
            
    /**
     * <p>id(0x72d)</p>
     * <p>vtableId(45)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "UseLocalConnection", dispId = 0x72d)
    void setUseLocalConnection(Boolean param0);
            
    /**
     * <p>id(0xa8f)</p>
     * <p>vtableId(46)</p>
     */
    @ComProperty(name = "MaxDrillthroughRecords", dispId = 0xa8f)
    Integer getMaxDrillthroughRecords();
            
    /**
     * <p>id(0xa8f)</p>
     * <p>vtableId(47)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "MaxDrillthroughRecords", dispId = 0xa8f)
    void setMaxDrillthroughRecords(Integer param0);
            
    /**
     * <p>id(0x81b)</p>
     * <p>vtableId(48)</p>
     */
    @ComProperty(name = "IsConnected", dispId = 0x81b)
    Boolean getIsConnected();
            
    /**
     * <p>id(0xa90)</p>
     * <p>vtableId(49)</p>
     */
    @ComProperty(name = "ServerCredentialsMethod", dispId = 0xa90)
    XlCredentialsMethod getServerCredentialsMethod();
            
    /**
     * <p>id(0xa90)</p>
     * <p>vtableId(50)</p>
     * @param param0 [in] {@code XlCredentialsMethod}
     */
    @ComProperty(name = "ServerCredentialsMethod", dispId = 0xa90)
    void setServerCredentialsMethod(XlCredentialsMethod param0);
            
    /**
     * <p>id(0xa91)</p>
     * <p>vtableId(51)</p>
     */
    @ComProperty(name = "ServerSSOApplicationID", dispId = 0xa91)
    String getServerSSOApplicationID();
            
    /**
     * <p>id(0xa91)</p>
     * <p>vtableId(52)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "ServerSSOApplicationID", dispId = 0xa91)
    void setServerSSOApplicationID(String param0);
            
    /**
     * <p>id(0xa92)</p>
     * <p>vtableId(53)</p>
     */
    @ComProperty(name = "AlwaysUseConnectionFile", dispId = 0xa92)
    Boolean getAlwaysUseConnectionFile();
            
    /**
     * <p>id(0xa92)</p>
     * <p>vtableId(54)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "AlwaysUseConnectionFile", dispId = 0xa92)
    void setAlwaysUseConnectionFile(Boolean param0);
            
    /**
     * <p>id(0xa93)</p>
     * <p>vtableId(55)</p>
     */
    @ComProperty(name = "ServerFillColor", dispId = 0xa93)
    Boolean getServerFillColor();
            
    /**
     * <p>id(0xa93)</p>
     * <p>vtableId(56)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "ServerFillColor", dispId = 0xa93)
    void setServerFillColor(Boolean param0);
            
    /**
     * <p>id(0xa94)</p>
     * <p>vtableId(57)</p>
     */
    @ComProperty(name = "ServerFontStyle", dispId = 0xa94)
    Boolean getServerFontStyle();
            
    /**
     * <p>id(0xa94)</p>
     * <p>vtableId(58)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "ServerFontStyle", dispId = 0xa94)
    void setServerFontStyle(Boolean param0);
            
    /**
     * <p>id(0xa95)</p>
     * <p>vtableId(59)</p>
     */
    @ComProperty(name = "ServerNumberFormat", dispId = 0xa95)
    Boolean getServerNumberFormat();
            
    /**
     * <p>id(0xa95)</p>
     * <p>vtableId(60)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "ServerNumberFormat", dispId = 0xa95)
    void setServerNumberFormat(Boolean param0);
            
    /**
     * <p>id(0xa96)</p>
     * <p>vtableId(61)</p>
     */
    @ComProperty(name = "ServerTextColor", dispId = 0xa96)
    Boolean getServerTextColor();
            
    /**
     * <p>id(0xa96)</p>
     * <p>vtableId(62)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "ServerTextColor", dispId = 0xa96)
    void setServerTextColor(Boolean param0);
            
    /**
     * <p>id(0xa97)</p>
     * <p>vtableId(63)</p>
     */
    @ComProperty(name = "RetrieveInOfficeUILang", dispId = 0xa97)
    Boolean getRetrieveInOfficeUILang();
            
    /**
     * <p>id(0xa97)</p>
     * <p>vtableId(64)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "RetrieveInOfficeUILang", dispId = 0xa97)
    void setRetrieveInOfficeUILang(Boolean param0);
            
    /**
     * <p>id(0xb7b)</p>
     * <p>vtableId(65)</p>
     */
    @ComMethod(name = "Reconnect", dispId = 0xb7b)
    void Reconnect();
            
    /**
     * <p>id(0x84d)</p>
     * <p>vtableId(66)</p>
     */
    @ComProperty(name = "CalculatedMembers", dispId = 0x84d)
    CalculatedMembers getCalculatedMembers();
            
    /**
     * <p>id(0xb7c)</p>
     * <p>vtableId(67)</p>
     */
    @ComProperty(name = "LocaleID", dispId = 0xb7c)
    Integer getLocaleID();
            
    /**
     * <p>id(0xb7c)</p>
     * <p>vtableId(68)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "LocaleID", dispId = 0xb7c)
    void setLocaleID(Integer param0);
            
    
}