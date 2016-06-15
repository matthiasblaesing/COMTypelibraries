
package eu.doppel_helix.jna.tlb.wia1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({851E9802-B338-4AB3-BB6B-6AA57CC699D0})</p>
 */
@ComInterface(iid="{851E9802-B338-4AB3-BB6B-6AA57CC699D0}")
public interface IFilter extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * Returns the Filter Name
     *
     * <p>id(0x1)</p>
     */
    @ComProperty(name = "Name", dispId = 0x1)
    String getName();
            
    /**
     * Returns a Description of what the filter does
     *
     * <p>id(0x2)</p>
     */
    @ComProperty(name = "Description", dispId = 0x2)
    String getDescription();
            
    /**
     * Returns the FilterID for this Filter
     *
     * <p>id(0x3)</p>
     */
    @ComProperty(name = "FilterID", dispId = 0x3)
    String getFilterID();
            
    /**
     * A collection of all properties for this filter
     *
     * <p>id(0x4)</p>
     */
    @ComProperty(name = "Properties", dispId = 0x4)
    IProperties getProperties();
            
    
}