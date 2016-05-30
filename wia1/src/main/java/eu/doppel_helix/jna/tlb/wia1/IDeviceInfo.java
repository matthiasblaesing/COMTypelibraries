
package eu.doppel_helix.jna.tlb.wia1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({2A99020A-E325-4454-95E0-136726ED4818})</p>
 */
@ComInterface(iid="{2A99020A-E325-4454-95E0-136726ED4818}")
public interface IDeviceInfo {
    /**
     * Returns the DeviceID for this Device
     *
     * <p>id(0x1)</p>
     */
    @ComProperty(name = "DeviceID", dispId = 0x1)
    String getDeviceID();
            
    /**
     * Returns the Type of Device
     *
     * <p>id(0x2)</p>
     */
    @ComProperty(name = "Type", dispId = 0x2)
    WiaDeviceType getType();
            
    /**
     * A collection of all properties for this imaging device that are applicable when the device is not connected
     *
     * <p>id(0x3)</p>
     */
    @ComProperty(name = "Properties", dispId = 0x3)
    IProperties getProperties();
            
    /**
     * Establish a connection with this device and return a Device object
     *
     * <p>id(0x4)</p>
     */
    @ComMethod(name = "Connect", dispId = 0x4)
    IDevice Connect();
            
    
}