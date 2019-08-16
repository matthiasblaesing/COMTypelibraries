
package eu.doppel_helix.jna.tlb.wia1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({3714EAC4-F413-426B-B1E8-DEF2BE99EA55})</p>
 */
@ComInterface(iid="{3714EAC4-F413-426B-B1E8-DEF2BE99EA55}")
public interface IDevice extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * Returns the DeviceID for this Device
     *
     * <p>id(0x1)</p>
     * <p>vtableId(7)</p>
     */
    @ComProperty(name = "DeviceID", dispId = 0x1)
    String getDeviceID();
            
    /**
     * Returns the Type of Device
     *
     * <p>id(0x2)</p>
     * <p>vtableId(8)</p>
     */
    @ComProperty(name = "Type", dispId = 0x2)
    WiaDeviceType getType();
            
    /**
     * A collection of all properties for this imaging device
     *
     * <p>id(0x3)</p>
     * <p>vtableId(9)</p>
     */
    @ComProperty(name = "Properties", dispId = 0x3)
    IProperties getProperties();
            
    /**
     * A collection of all items for this imaging device
     *
     * <p>id(0x4)</p>
     * <p>vtableId(10)</p>
     */
    @ComProperty(name = "Items", dispId = 0x4)
    IItems getItems();
            
    /**
     * A collection of all commands for this imaging device
     *
     * <p>id(0x5)</p>
     * <p>vtableId(11)</p>
     */
    @ComProperty(name = "Commands", dispId = 0x5)
    IDeviceCommands getCommands();
            
    /**
     * A collection of all events for this imaging device
     *
     * <p>id(0x6)</p>
     * <p>vtableId(12)</p>
     */
    @ComProperty(name = "Events", dispId = 0x6)
    IDeviceEvents getEvents();
            
    /**
     * Returns the underlying IWiaItem interface for this Device object
     *
     * <p>id(0x7)</p>
     * <p>vtableId(13)</p>
     */
    @ComProperty(name = "WiaItem", dispId = 0x7)
    com.sun.jna.platform.win32.COM.util.IUnknown getWiaItem();
            
    /**
     * Returns the Item object specified by ItemID if it exists
     *
     * <p>id(0x8)</p>
     * <p>vtableId(14)</p>
     * @param ItemID [in] {@code String}
     */
    @ComMethod(name = "GetItem", dispId = 0x8)
    IItem GetItem(String ItemID);
            
    /**
     * Issues the command specified by CommandID to the imaging device. CommandIDs are device dependent. Valid CommandIDs for this Device are contained in the Commands collection.
     *
     * <p>id(0x9)</p>
     * <p>vtableId(15)</p>
     * @param CommandID [in] {@code String}
     */
    @ComMethod(name = "ExecuteCommand", dispId = 0x9)
    IItem ExecuteCommand(String CommandID);
            
    
}