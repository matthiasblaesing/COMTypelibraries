
package eu.doppel_helix.jna.tlb.wia1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({7CF694C0-F589-451C-B56E-398B5855B05E})</p>
 */
@ComInterface(iid="{7CF694C0-F589-451C-B56E-398B5855B05E}")
public interface IDeviceCommand extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * Returns the commandID for this Command
     *
     * <p>id(0x1)</p>
     */
    @ComProperty(name = "CommandID", dispId = 0x1)
    String getCommandID();
            
    /**
     * Returns the command Name
     *
     * <p>id(0x2)</p>
     */
    @ComProperty(name = "Name", dispId = 0x2)
    String getName();
            
    /**
     * Returns the command Description
     *
     * <p>id(0x3)</p>
     */
    @ComProperty(name = "Description", dispId = 0x3)
    String getDescription();
            
    
}