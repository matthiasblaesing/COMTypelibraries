
package eu.doppel_helix.jna.tlb.wbemdisp1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * A collection of Classes or Instances
 *
 * <p>uuid({76A6415F-CB41-11D1-8B02-00600806D9B6})</p>
 */
@ComInterface(iid="{76A6415F-CB41-11D1-8B02-00600806D9B6}")
public interface ISWbemObjectSet extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * Get an Object with a specific path from this collection
     *
     * <p>id(0x0)</p>
     * <p>vtableId(8)</p>
     * @param strObjectPath [in] {@code String}
     * @param iFlags [in, optional] {@code Integer}
     */
    @ComMethod(name = "Item", dispId = 0x0)
    ISWbemObject Item(String strObjectPath,
            Object iFlags);
            
    /**
     * The number of items in this collection
     *
     * <p>id(0x1)</p>
     * <p>vtableId(9)</p>
     */
    @ComProperty(name = "Count", dispId = 0x1)
    Integer getCount();
            
    /**
     * The Security Configurator for this Object
     *
     * <p>id(0x4)</p>
     * <p>vtableId(10)</p>
     */
    @ComProperty(name = "Security_", dispId = 0x4)
    ISWbemSecurity getSecurity_();
            
    /**
     * Get an Object with a specific index from this collection
     *
     * <p>id(0x5)</p>
     * <p>vtableId(11)</p>
     * @param lIndex [in] {@code Integer}
     */
    @ComMethod(name = "ItemIndex", dispId = 0x5)
    ISWbemObject ItemIndex(Integer lIndex);
            
    
}