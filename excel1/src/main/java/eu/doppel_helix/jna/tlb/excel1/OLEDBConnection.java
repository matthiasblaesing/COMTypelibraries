
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
     * <p>id(0x81a)</p>
     */
    @ComProperty(name = "ADOConnection", dispId = 0x81a)
    com.sun.jna.platform.win32.COM.util.IDispatch getADOConnection();
            
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
     * <p>id(0x635)</p>
     */
    @ComMethod(name = "CancelRefresh", dispId = 0x635)
    void CancelRefresh();
            
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
     * <p>id(0x81c)</p>
     */
    @ComMethod(name = "MakeConnection", dispId = 0x81c)
    void MakeConnection();
            
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
     * <p>id(0x633)</p>
     */
    @ComProperty(name = "Refreshing", dispId = 0x633)
    Boolean getRefreshing();
            
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
     * <p>id(0x820)</p>
     */
    @ComProperty(name = "SourceDataFile", dispId = 0x820)
    void setSourceDataFile(String param0);
            
    /**
     * <p>id(0x81d)</p>
     */
    @ComProperty(name = "OLAP", dispId = 0x81d)
    Boolean getOLAP();
            
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
     * <p>id(0xa8f)</p>
     */
    @ComProperty(name = "MaxDrillthroughRecords", dispId = 0xa8f)
    Integer getMaxDrillthroughRecords();
            
    /**
     * <p>id(0xa8f)</p>
     */
    @ComProperty(name = "MaxDrillthroughRecords", dispId = 0xa8f)
    void setMaxDrillthroughRecords(Integer param0);
            
    /**
     * <p>id(0x81b)</p>
     */
    @ComProperty(name = "IsConnected", dispId = 0x81b)
    Boolean getIsConnected();
            
    /**
     * <p>id(0xa90)</p>
     */
    @ComProperty(name = "ServerCredentialsMethod", dispId = 0xa90)
    XlCredentialsMethod getServerCredentialsMethod();
            
    /**
     * <p>id(0xa90)</p>
     */
    @ComProperty(name = "ServerCredentialsMethod", dispId = 0xa90)
    void setServerCredentialsMethod(XlCredentialsMethod param0);
            
    /**
     * <p>id(0xa91)</p>
     */
    @ComProperty(name = "ServerSSOApplicationID", dispId = 0xa91)
    String getServerSSOApplicationID();
            
    /**
     * <p>id(0xa91)</p>
     */
    @ComProperty(name = "ServerSSOApplicationID", dispId = 0xa91)
    void setServerSSOApplicationID(String param0);
            
    /**
     * <p>id(0xa92)</p>
     */
    @ComProperty(name = "AlwaysUseConnectionFile", dispId = 0xa92)
    Boolean getAlwaysUseConnectionFile();
            
    /**
     * <p>id(0xa92)</p>
     */
    @ComProperty(name = "AlwaysUseConnectionFile", dispId = 0xa92)
    void setAlwaysUseConnectionFile(Boolean param0);
            
    /**
     * <p>id(0xa93)</p>
     */
    @ComProperty(name = "ServerFillColor", dispId = 0xa93)
    Boolean getServerFillColor();
            
    /**
     * <p>id(0xa93)</p>
     */
    @ComProperty(name = "ServerFillColor", dispId = 0xa93)
    void setServerFillColor(Boolean param0);
            
    /**
     * <p>id(0xa94)</p>
     */
    @ComProperty(name = "ServerFontStyle", dispId = 0xa94)
    Boolean getServerFontStyle();
            
    /**
     * <p>id(0xa94)</p>
     */
    @ComProperty(name = "ServerFontStyle", dispId = 0xa94)
    void setServerFontStyle(Boolean param0);
            
    /**
     * <p>id(0xa95)</p>
     */
    @ComProperty(name = "ServerNumberFormat", dispId = 0xa95)
    Boolean getServerNumberFormat();
            
    /**
     * <p>id(0xa95)</p>
     */
    @ComProperty(name = "ServerNumberFormat", dispId = 0xa95)
    void setServerNumberFormat(Boolean param0);
            
    /**
     * <p>id(0xa96)</p>
     */
    @ComProperty(name = "ServerTextColor", dispId = 0xa96)
    Boolean getServerTextColor();
            
    /**
     * <p>id(0xa96)</p>
     */
    @ComProperty(name = "ServerTextColor", dispId = 0xa96)
    void setServerTextColor(Boolean param0);
            
    /**
     * <p>id(0xa97)</p>
     */
    @ComProperty(name = "RetrieveInOfficeUILang", dispId = 0xa97)
    Boolean getRetrieveInOfficeUILang();
            
    /**
     * <p>id(0xa97)</p>
     */
    @ComProperty(name = "RetrieveInOfficeUILang", dispId = 0xa97)
    void setRetrieveInOfficeUILang(Boolean param0);
            
    /**
     * <p>id(0xb7b)</p>
     */
    @ComMethod(name = "Reconnect", dispId = 0xb7b)
    void Reconnect();
            
    /**
     * <p>id(0x84d)</p>
     */
    @ComProperty(name = "CalculatedMembers", dispId = 0x84d)
    CalculatedMembers getCalculatedMembers();
            
    /**
     * <p>id(0xb7c)</p>
     */
    @ComProperty(name = "LocaleID", dispId = 0xb7c)
    Integer getLocaleID();
            
    /**
     * <p>id(0xb7c)</p>
     */
    @ComProperty(name = "LocaleID", dispId = 0xb7c)
    void setLocaleID(Integer param0);
            
    
}