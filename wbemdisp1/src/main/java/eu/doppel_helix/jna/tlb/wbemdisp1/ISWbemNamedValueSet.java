
package eu.doppel_helix.jna.tlb.wbemdisp1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * A collection of named values
 *
 * <p>uuid({CF2376EA-CE8C-11D1-8B05-00600806D9B6})</p>
 */
@ComInterface(iid="{CF2376EA-CE8C-11D1-8B05-00600806D9B6}")
public interface ISWbemNamedValueSet extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * Get a named value from this Collection
     *
     * <p>id(0x0)</p>
     * <p>vtableId(8)</p>
     * @param strName [in] {@code String}
     * @param iFlags [in, optional] {@code Integer}
     */
    @ComMethod(name = "Item", dispId = 0x0)
    ISWbemNamedValue Item(String strName,
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
     * Add a named value to this collection
     *
     * <p>id(0x2)</p>
     * <p>vtableId(10)</p>
     * @param strName [in] {@code String}
     * @param varValue [in] {@code Object}
     * @param iFlags [in, optional] {@code Integer}
     */
    @ComMethod(name = "Add", dispId = 0x2)
    ISWbemNamedValue Add(String strName,
            Object varValue,
            Object iFlags);
            
    /**
     * Remove a named value from this collection
     *
     * <p>id(0x3)</p>
     * <p>vtableId(11)</p>
     * @param strName [in] {@code String}
     * @param iFlags [in, optional] {@code Integer}
     */
    @ComMethod(name = "Remove", dispId = 0x3)
    void Remove(String strName,
            Object iFlags);
            
    /**
     * Make a copy of this collection
     *
     * <p>id(0x4)</p>
     * <p>vtableId(12)</p>
     */
    @ComMethod(name = "Clone", dispId = 0x4)
    ISWbemNamedValueSet Clone();
            
    /**
     * Delete all items in this collection
     *
     * <p>id(0x5)</p>
     * <p>vtableId(13)</p>
     */
    @ComMethod(name = "DeleteAll", dispId = 0x5)
    void DeleteAll();
            
    
}