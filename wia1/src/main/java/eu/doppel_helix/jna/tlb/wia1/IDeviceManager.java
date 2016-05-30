
package eu.doppel_helix.jna.tlb.wia1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({73856D9A-2720-487A-A584-21D5774E9D0F})</p>
 */
@ComInterface(iid="{73856D9A-2720-487A-A584-21D5774E9D0F}")
public interface IDeviceManager {
    /**
     * A collection of all imaging devices connected to this computer
     *
     * <p>id(0x1)</p>
     */
    @ComProperty(name = "DeviceInfos", dispId = 0x1)
    IDeviceInfos getDeviceInfos();
            
    /**
     * Registers the specified EventID for the specified DeviceID. If DeviceID is "*" then OnEvent will be called whenever the event specified occurs for any device. Otherwise, OnEvent will only be called if the event specified occurs on the device specified.
     *
     * <p>id(0x2)</p>
     */
    @ComMethod(name = "RegisterEvent", dispId = 0x2)
    void RegisterEvent(String EventID,
            String DeviceID);
            
    /**
     * Unregisters the specified EventID for the specified DeviceID. UnregisterEvent should only be called for EventID and DeviceID for which you called RegisterEvent.
     *
     * <p>id(0x3)</p>
     */
    @ComMethod(name = "UnregisterEvent", dispId = 0x3)
    void UnregisterEvent(String EventID,
            String DeviceID);
            
    /**
     * Registers the specified Command to launch when the specified EventID for the specified DeviceID occurs. Command can be either a ClassID or the full path name and the appropriate command-line arguments needed to invoke the application.
     *
     * <p>id(0x4)</p>
     */
    @ComMethod(name = "RegisterPersistentEvent", dispId = 0x4)
    void RegisterPersistentEvent(String Command,
            String Name,
            String Description,
            String Icon,
            String EventID,
            String DeviceID);
            
    /**
     * Unregisters the specified Command for the specified EventID for the specified DeviceID. UnregisterPersistentEvent should only be called for the Command, Name, Description, Icon, EventID and DeviceID for which you called RegisterPersistentEvent.
     *
     * <p>id(0x5)</p>
     */
    @ComMethod(name = "UnregisterPersistentEvent", dispId = 0x5)
    void UnregisterPersistentEvent(String Command,
            String Name,
            String Description,
            String Icon,
            String EventID,
            String DeviceID);
            
    
}