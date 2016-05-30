
package eu.doppel_helix.jna.tlb.wia1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({68F2BF12-A755-4E2B-9BCD-37A22587D078})</p>
 */
@ComInterface(iid="{68F2BF12-A755-4E2B-9BCD-37A22587D078}")
public interface IItem {
    /**
     * Returns the ItemID for this Item
     *
     * <p>id(0x1)</p>
     */
    @ComProperty(name = "ItemID", dispId = 0x1)
    String getItemID();
            
    /**
     * A collection of all properties for this item
     *
     * <p>id(0x2)</p>
     */
    @ComProperty(name = "Properties", dispId = 0x2)
    IProperties getProperties();
            
    /**
     * A collection of all child items for this item
     *
     * <p>id(0x3)</p>
     */
    @ComProperty(name = "Items", dispId = 0x3)
    IItems getItems();
            
    /**
     * A collection of all supported format types for this item
     *
     * <p>id(0x4)</p>
     */
    @ComProperty(name = "Formats", dispId = 0x4)
    IFormats getFormats();
            
    /**
     * A collection of all commands for this item
     *
     * <p>id(0x5)</p>
     */
    @ComProperty(name = "Commands", dispId = 0x5)
    IDeviceCommands getCommands();
            
    /**
     * Returns the underlying IWiaItem interface for this Item object
     *
     * <p>id(0x6)</p>
     */
    @ComProperty(name = "WiaItem", dispId = 0x6)
    com.sun.jna.platform.win32.COM.util.IUnknown getWiaItem();
            
    /**
     * Returns an ImageFile object, in this version, in the format specified in FormatID if supported, otherwise using the preferred format for this imaging device. Future versions may return a collection of ImageFile objects.
     *
     * <p>id(0x7)</p>
     */
    @ComMethod(name = "Transfer", dispId = 0x7)
    Object Transfer(String FormatID);
            
    /**
     * Issues the command specified by CommandID. CommandIDs are device dependent. Valid CommandIDs for this Item are contained in the Commands collection.
     *
     * <p>id(0x8)</p>
     */
    @ComMethod(name = "ExecuteCommand", dispId = 0x8)
    IItem ExecuteCommand(String CommandID);
            
    
}