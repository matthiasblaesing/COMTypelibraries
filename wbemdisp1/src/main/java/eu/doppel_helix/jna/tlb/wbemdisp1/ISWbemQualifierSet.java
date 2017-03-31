
package eu.doppel_helix.jna.tlb.wbemdisp1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * A collection of Qualifiers
 *
 * <p>uuid({9B16ED16-D3DF-11D1-8B08-00600806D9B6})</p>
 */
@ComInterface(iid="{9B16ED16-D3DF-11D1-8B08-00600806D9B6}")
public interface ISWbemQualifierSet extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * Get a named Qualifier from this collection
     *
     * <p>id(0x0)</p>
     * <p>vtableId(8)</p>
     * @param Name [in] {@code String}
     * @param iFlags [in, optional] {@code Integer}
     */
    @ComMethod(name = "Item", dispId = 0x0)
    ISWbemQualifier Item(String Name,
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
     * Add a Qualifier to this collection
     *
     * <p>id(0x2)</p>
     * <p>vtableId(10)</p>
     * @param strName [in] {@code String}
     * @param varVal [in] {@code Object}
     * @param bPropagatesToSubclass [in, optional] {@code Boolean}
     * @param bPropagatesToInstance [in, optional] {@code Boolean}
     * @param bIsOverridable [in, optional] {@code Boolean}
     * @param iFlags [in, optional] {@code Integer}
     */
    @ComMethod(name = "Add", dispId = 0x2)
    ISWbemQualifier Add(String strName,
            Object varVal,
            Object bPropagatesToSubclass,
            Object bPropagatesToInstance,
            Object bIsOverridable,
            Object iFlags);
            
    /**
     * Remove a Qualifier from this collection
     *
     * <p>id(0x3)</p>
     * <p>vtableId(11)</p>
     * @param strName [in] {@code String}
     * @param iFlags [in, optional] {@code Integer}
     */
    @ComMethod(name = "Remove", dispId = 0x3)
    void Remove(String strName,
            Object iFlags);
            
    
}