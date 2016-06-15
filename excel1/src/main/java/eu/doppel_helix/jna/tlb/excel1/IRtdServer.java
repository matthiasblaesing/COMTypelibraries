
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
     */
    @ComMethod(name = "ServerStart", dispId = 0xa)
    Integer ServerStart(IRTDUpdateEvent CallbackObject);
            
    /**
     * <p>id(0xb)</p>
     */
    @ComMethod(name = "ConnectData", dispId = 0xb)
    Object ConnectData(Integer TopicID,
            Object Strings,
            VARIANT GetNewValues);
            
    /**
     * <p>id(0xc)</p>
     */
    @ComMethod(name = "RefreshData", dispId = 0xc)
    Object RefreshData(VARIANT TopicCount);
            
    /**
     * <p>id(0xd)</p>
     */
    @ComMethod(name = "DisconnectData", dispId = 0xd)
    void DisconnectData(Integer TopicID);
            
    /**
     * <p>id(0xe)</p>
     */
    @ComMethod(name = "Heartbeat", dispId = 0xe)
    Integer Heartbeat();
            
    /**
     * <p>id(0xf)</p>
     */
    @ComMethod(name = "ServerTerminate", dispId = 0xf)
    void ServerTerminate();
            
    
}