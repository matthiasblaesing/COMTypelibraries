
package eu.doppel_helix.jna.tlb.wbemdisp1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * A collection of Methods
 *
 * <p>uuid({C93BA292-D955-11D1-8B09-00600806D9B6})</p>
 */
@ComInterface(iid="{C93BA292-D955-11D1-8B09-00600806D9B6}")
public interface ISWbemMethodSet extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * Get a named Method from this collection
     *
     * <p>id(0x0)</p>
     * <p>vtableId(8)</p>
     * @param strName [in] {@code String}
     * @param iFlags [in, optional] {@code Integer}
     */
    @ComMethod(name = "Item", dispId = 0x0)
    ISWbemMethod Item(String strName,
            Object iFlags);
            
    /**
     * The number of items in this collection
     *
     * <p>id(0x1)</p>
     * <p>vtableId(9)</p>
     */
    @ComProperty(name = "Count", dispId = 0x1)
    Integer getCount();
            
    
}