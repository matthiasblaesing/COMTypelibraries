
package eu.doppel_helix.jna.tlb.wia1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({EFD1219F-8229-4B30-809D-8F6D83341569})</p>
 */
@ComInterface(iid="{EFD1219F-8229-4B30-809D-8F6D83341569}")
public interface IFilterInfo extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * Returns the FilterInfo Name
     *
     * <p>id(0x1)</p>
     * <p>vtableId(7)</p>
     */
    @ComProperty(name = "Name", dispId = 0x1)
    String getName();
            
    /**
     * Returns a technical Description of what the filter does and how to use it in a filter chain
     *
     * <p>id(0x2)</p>
     * <p>vtableId(8)</p>
     */
    @ComProperty(name = "Description", dispId = 0x2)
    String getDescription();
            
    /**
     * Returns the FilterID for this filter
     *
     * <p>id(0x3)</p>
     * <p>vtableId(9)</p>
     */
    @ComProperty(name = "FilterID", dispId = 0x3)
    String getFilterID();
            
    
}