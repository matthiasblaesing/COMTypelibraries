
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000244D4-0001-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000244D4-0001-0000-C000-000000000046}")
public interface IDataFeedConnection extends IUnknown, IRawDispatchHandle, IDispatch {
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
     * <p>id(0xa92)</p>
     * <p>vtableId(10)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "AlwaysUseConnectionFile", dispId = 0xa92)
    com.sun.jna.platform.win32.WinNT.HRESULT getAlwaysUseConnectionFile(VARIANT RHS);
            
    /**
     * <p>id(0xa92)</p>
     * <p>vtableId(11)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "AlwaysUseConnectionFile", dispId = 0xa92)
    com.sun.jna.platform.win32.WinNT.HRESULT setAlwaysUseConnectionFile(Boolean RHS);
            
    /**
     * <p>id(0x725)</p>
     * <p>vtableId(12)</p>
     * @param RHS [out] {@code Object}
     */
    @ComProperty(name = "CommandText", dispId = 0x725)
    com.sun.jna.platform.win32.WinNT.HRESULT getCommandText(VARIANT RHS);
            
    /**
     * <p>id(0x725)</p>
     * <p>vtableId(13)</p>
     * @param RHS [in] {@code Object}
     */
    @ComProperty(name = "CommandText", dispId = 0x725)
    com.sun.jna.platform.win32.WinNT.HRESULT setCommandText(Object RHS);
            
    /**
     * <p>id(0x726)</p>
     * <p>vtableId(14)</p>
     * @param RHS [out] {@code XlCmdType}
     */
    @ComProperty(name = "CommandType", dispId = 0x726)
    com.sun.jna.platform.win32.WinNT.HRESULT getCommandType(VARIANT RHS);
            
    /**
     * <p>id(0x726)</p>
     * <p>vtableId(15)</p>
     * @param RHS [in] {@code XlCmdType}
     */
    @ComProperty(name = "CommandType", dispId = 0x726)
    com.sun.jna.platform.win32.WinNT.HRESULT setCommandType(XlCmdType RHS);
            
    /**
     * <p>id(0x598)</p>
     * <p>vtableId(16)</p>
     * @param RHS [out] {@code Object}
     */
    @ComProperty(name = "Connection", dispId = 0x598)
    com.sun.jna.platform.win32.WinNT.HRESULT getConnection(VARIANT RHS);
            
    /**
     * <p>id(0x598)</p>
     * <p>vtableId(17)</p>
     * @param RHS [in] {@code Object}
     */
    @ComProperty(name = "Connection", dispId = 0x598)
    com.sun.jna.platform.win32.WinNT.HRESULT setConnection(Object RHS);
            
    /**
     * <p>id(0x5c5)</p>
     * <p>vtableId(18)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "EnableRefresh", dispId = 0x5c5)
    com.sun.jna.platform.win32.WinNT.HRESULT getEnableRefresh(VARIANT RHS);
            
    /**
     * <p>id(0x5c5)</p>
     * <p>vtableId(19)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "EnableRefresh", dispId = 0x5c5)
    com.sun.jna.platform.win32.WinNT.HRESULT setEnableRefresh(Boolean RHS);
            
    /**
     * <p>id(0x2b8)</p>
     * <p>vtableId(20)</p>
     * @param RHS [out] {@code java.util.Date}
     */
    @ComProperty(name = "RefreshDate", dispId = 0x2b8)
    com.sun.jna.platform.win32.WinNT.HRESULT getRefreshDate(VARIANT RHS);
            
    /**
     * <p>id(0x633)</p>
     * <p>vtableId(21)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "Refreshing", dispId = 0x633)
    com.sun.jna.platform.win32.WinNT.HRESULT getRefreshing(VARIANT RHS);
            
    /**
     * <p>id(0x5c7)</p>
     * <p>vtableId(22)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "RefreshOnFileOpen", dispId = 0x5c7)
    com.sun.jna.platform.win32.WinNT.HRESULT getRefreshOnFileOpen(VARIANT RHS);
            
    /**
     * <p>id(0x5c7)</p>
     * <p>vtableId(23)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "RefreshOnFileOpen", dispId = 0x5c7)
    com.sun.jna.platform.win32.WinNT.HRESULT setRefreshOnFileOpen(Boolean RHS);
            
    /**
     * <p>id(0x729)</p>
     * <p>vtableId(24)</p>
     * @param RHS [out] {@code Integer}
     */
    @ComProperty(name = "RefreshPeriod", dispId = 0x729)
    com.sun.jna.platform.win32.WinNT.HRESULT getRefreshPeriod(VARIANT RHS);
            
    /**
     * <p>id(0x729)</p>
     * <p>vtableId(25)</p>
     * @param RHS [in] {@code Integer}
     */
    @ComProperty(name = "RefreshPeriod", dispId = 0x729)
    com.sun.jna.platform.win32.WinNT.HRESULT setRefreshPeriod(Integer RHS);
            
    /**
     * <p>id(0x5c9)</p>
     * <p>vtableId(26)</p>
     * @param RHS [out] {@code Boolean}
     */
    @ComProperty(name = "SavePassword", dispId = 0x5c9)
    com.sun.jna.platform.win32.WinNT.HRESULT getSavePassword(VARIANT RHS);
            
    /**
     * <p>id(0x5c9)</p>
     * <p>vtableId(27)</p>
     * @param RHS [in] {@code Boolean}
     */
    @ComProperty(name = "SavePassword", dispId = 0x5c9)
    com.sun.jna.platform.win32.WinNT.HRESULT setSavePassword(Boolean RHS);
            
    /**
     * <p>id(0xa90)</p>
     * <p>vtableId(28)</p>
     * @param RHS [out] {@code XlCredentialsMethod}
     */
    @ComProperty(name = "ServerCredentialsMethod", dispId = 0xa90)
    com.sun.jna.platform.win32.WinNT.HRESULT getServerCredentialsMethod(VARIANT RHS);
            
    /**
     * <p>id(0xa90)</p>
     * <p>vtableId(29)</p>
     * @param RHS [in] {@code XlCredentialsMethod}
     */
    @ComProperty(name = "ServerCredentialsMethod", dispId = 0xa90)
    com.sun.jna.platform.win32.WinNT.HRESULT setServerCredentialsMethod(XlCredentialsMethod RHS);
            
    /**
     * <p>id(0x81f)</p>
     * <p>vtableId(30)</p>
     * @param RHS [out] {@code String}
     */
    @ComProperty(name = "SourceConnectionFile", dispId = 0x81f)
    com.sun.jna.platform.win32.WinNT.HRESULT getSourceConnectionFile(VARIANT RHS);
            
    /**
     * <p>id(0x81f)</p>
     * <p>vtableId(31)</p>
     * @param RHS [in] {@code String}
     */
    @ComProperty(name = "SourceConnectionFile", dispId = 0x81f)
    com.sun.jna.platform.win32.WinNT.HRESULT setSourceConnectionFile(String RHS);
            
    /**
     * <p>id(0x820)</p>
     * <p>vtableId(32)</p>
     * @param RHS [out] {@code String}
     */
    @ComProperty(name = "SourceDataFile", dispId = 0x820)
    com.sun.jna.platform.win32.WinNT.HRESULT getSourceDataFile(VARIANT RHS);
            
    /**
     * <p>id(0x820)</p>
     * <p>vtableId(33)</p>
     * @param RHS [in] {@code String}
     */
    @ComProperty(name = "SourceDataFile", dispId = 0x820)
    com.sun.jna.platform.win32.WinNT.HRESULT setSourceDataFile(String RHS);
            
    /**
     * <p>id(0x635)</p>
     * <p>vtableId(34)</p>
     */
    @ComMethod(name = "CancelRefresh", dispId = 0x635)
    com.sun.jna.platform.win32.WinNT.HRESULT CancelRefresh();
            
    /**
     * <p>id(0x589)</p>
     * <p>vtableId(35)</p>
     */
    @ComMethod(name = "Refresh", dispId = 0x589)
    com.sun.jna.platform.win32.WinNT.HRESULT Refresh();
            
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
            
    
}