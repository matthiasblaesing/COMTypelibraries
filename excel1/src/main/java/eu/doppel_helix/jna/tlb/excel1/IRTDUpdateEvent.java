
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({A43788C1-D91B-11D3-8F39-00C04F3651B8})</p>
 */
@ComInterface(iid="{A43788C1-D91B-11D3-8F39-00C04F3651B8}")
public interface IRTDUpdateEvent {
    /**
     * <p>id(0xa)</p>
     */
    @ComMethod(name = "UpdateNotify", dispId = 0xa)
    void UpdateNotify();
            
    /**
     * <p>id(0xb)</p>
     */
    @ComProperty(name = "HeartbeatInterval", dispId = 0xb)
    Integer getHeartbeatInterval();
            
    /**
     * <p>id(0xb)</p>
     */
    @ComProperty(name = "HeartbeatInterval", dispId = 0xb)
    void setHeartbeatInterval(Integer param0);
            
    /**
     * <p>id(0xc)</p>
     */
    @ComMethod(name = "Disconnect", dispId = 0xc)
    void Disconnect();
            
    
}