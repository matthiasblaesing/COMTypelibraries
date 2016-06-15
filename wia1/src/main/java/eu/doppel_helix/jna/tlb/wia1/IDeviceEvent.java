
package eu.doppel_helix.jna.tlb.wia1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({80D0880A-BB10-4722-82D1-07DC8DA157E2})</p>
 */
@ComInterface(iid="{80D0880A-BB10-4722-82D1-07DC8DA157E2}")
public interface IDeviceEvent extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * Returns the EventID for this Event
     *
     * <p>id(0x1)</p>
     */
    @ComProperty(name = "EventID", dispId = 0x1)
    String getEventID();
            
    /**
     * Returns the Type of this Event
     *
     * <p>id(0x2)</p>
     */
    @ComProperty(name = "Type", dispId = 0x2)
    WiaEventFlag getType();
            
    /**
     * Returns the event Name
     *
     * <p>id(0x3)</p>
     */
    @ComProperty(name = "Name", dispId = 0x3)
    String getName();
            
    /**
     * Returns the event Description
     *
     * <p>id(0x4)</p>
     */
    @ComProperty(name = "Description", dispId = 0x4)
    String getDescription();
            
    
}