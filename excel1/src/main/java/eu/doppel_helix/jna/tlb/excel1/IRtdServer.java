
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({EC0E6191-DB51-11D3-8F3E-00C04F3651B8})</p>
 */
@ComInterface(iid="{EC0E6191-DB51-11D3-8F3E-00C04F3651B8}")
public interface IRtdServer extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0xa)</p>
     * <p>vtableId(7)</p>
     * @param CallbackObject [in] {@code IRTDUpdateEvent}
     */
    @ComMethod(name = "ServerStart", dispId = 0xa)
    Integer ServerStart(IRTDUpdateEvent CallbackObject);
            
    /**
     * <p>id(0xb)</p>
     * <p>vtableId(8)</p>
     * @param TopicID [in] {@code Integer}
     * @param Strings [in] {@code Object}
     * @param GetNewValues [inout] {@code Boolean}
     */
    @ComMethod(name = "ConnectData", dispId = 0xb)
    Object ConnectData(Integer TopicID,
            Object Strings,
            VARIANT GetNewValues);
            
    /**
     * <p>id(0xc)</p>
     * <p>vtableId(9)</p>
     * @param TopicCount [inout] {@code Integer}
     */
    @ComMethod(name = "RefreshData", dispId = 0xc)
    Object RefreshData(VARIANT TopicCount);
            
    /**
     * <p>id(0xd)</p>
     * <p>vtableId(10)</p>
     * @param TopicID [in] {@code Integer}
     */
    @ComMethod(name = "DisconnectData", dispId = 0xd)
    void DisconnectData(Integer TopicID);
            
    /**
     * <p>id(0xe)</p>
     * <p>vtableId(11)</p>
     */
    @ComMethod(name = "Heartbeat", dispId = 0xe)
    Integer Heartbeat();
            
    /**
     * <p>id(0xf)</p>
     * <p>vtableId(12)</p>
     */
    @ComMethod(name = "ServerTerminate", dispId = 0xf)
    void ServerTerminate();
            
    
}