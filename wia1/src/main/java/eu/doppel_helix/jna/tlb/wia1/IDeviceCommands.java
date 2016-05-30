
package eu.doppel_helix.jna.tlb.wia1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({C53AE9D5-6D91-4815-AF93-5F1E1B3B08BD})</p>
 */
@ComInterface(iid="{C53AE9D5-6D91-4815-AF93-5F1E1B3B08BD}")
public interface IDeviceCommands {
    /**
     * Returns the specified item in the collection by position
     *
     * <p>id(0x0)</p>
     */
    @ComProperty(name = "Item", dispId = 0x0)
    IDeviceCommand getItem(Integer Index);
            
    /**
     * Returns the number of members in the collection
     *
     * <p>id(0x1)</p>
     */
    @ComProperty(name = "Count", dispId = 0x1)
    Integer getCount();
            
    
}