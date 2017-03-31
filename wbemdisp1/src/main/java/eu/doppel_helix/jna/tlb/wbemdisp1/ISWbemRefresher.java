
package eu.doppel_helix.jna.tlb.wbemdisp1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * A Collection of Refreshable Objects
 *
 * <p>uuid({14D8250E-D9C2-11D3-B38F-00105A1F473A})</p>
 */
@ComInterface(iid="{14D8250E-D9C2-11D3-B38F-00105A1F473A}")
public interface ISWbemRefresher extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * Get an item from this refresher
     *
     * <p>id(0x0)</p>
     * <p>vtableId(8)</p>
     * @param iIndex [in] {@code Integer}
     */
    @ComMethod(name = "Item", dispId = 0x0)
    ISWbemRefreshableItem Item(Integer iIndex);
            
    /**
     * The number of items in this refresher
     *
     * <p>id(0x1)</p>
     * <p>vtableId(9)</p>
     */
    @ComProperty(name = "Count", dispId = 0x1)
    Integer getCount();
            
    /**
     * Add a refreshable instance to this refresher
     *
     * <p>id(0x2)</p>
     * <p>vtableId(10)</p>
     * @param objWbemServices [in] {@code ISWbemServicesEx}
     * @param bsInstancePath [in] {@code String}
     * @param iFlags [in, optional] {@code Integer}
     * @param objWbemNamedValueSet [in, optional] {@code com.sun.jna.platform.win32.COM.util.IDispatch}
     */
    @ComMethod(name = "Add", dispId = 0x2)
    ISWbemRefreshableItem Add(ISWbemServicesEx objWbemServices,
            String bsInstancePath,
            Object iFlags,
            Object objWbemNamedValueSet);
            
    /**
     * Add a refreshable enumerator to this refresher
     *
     * <p>id(0x3)</p>
     * <p>vtableId(11)</p>
     * @param objWbemServices [in] {@code ISWbemServicesEx}
     * @param bsClassName [in] {@code String}
     * @param iFlags [in, optional] {@code Integer}
     * @param objWbemNamedValueSet [in, optional] {@code com.sun.jna.platform.win32.COM.util.IDispatch}
     */
    @ComMethod(name = "AddEnum", dispId = 0x3)
    ISWbemRefreshableItem AddEnum(ISWbemServicesEx objWbemServices,
            String bsClassName,
            Object iFlags,
            Object objWbemNamedValueSet);
            
    /**
     * Remove an item from this refresher
     *
     * <p>id(0x4)</p>
     * <p>vtableId(12)</p>
     * @param iIndex [in] {@code Integer}
     * @param iFlags [in, optional] {@code Integer}
     */
    @ComMethod(name = "Remove", dispId = 0x4)
    void Remove(Integer iIndex,
            Object iFlags);
            
    /**
     * Refresh all items in this collection
     *
     * <p>id(0x5)</p>
     * <p>vtableId(13)</p>
     * @param iFlags [in, optional] {@code Integer}
     */
    @ComMethod(name = "Refresh", dispId = 0x5)
    void Refresh(Object iFlags);
            
    /**
     * Whether to attempt auto-reconnection to a remote provider
     *
     * <p>id(0x6)</p>
     * <p>vtableId(14)</p>
     */
    @ComProperty(name = "AutoReconnect", dispId = 0x6)
    Boolean getAutoReconnect();
            
    /**
     * Whether to attempt auto-reconnection to a remote provider
     *
     * <p>id(0x6)</p>
     * <p>vtableId(15)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "AutoReconnect", dispId = 0x6)
    void setAutoReconnect(Boolean param0);
            
    /**
     * Delete all items in this collection
     *
     * <p>id(0x7)</p>
     * <p>vtableId(16)</p>
     */
    @ComMethod(name = "DeleteAll", dispId = 0x7)
    void DeleteAll();
            
    
}