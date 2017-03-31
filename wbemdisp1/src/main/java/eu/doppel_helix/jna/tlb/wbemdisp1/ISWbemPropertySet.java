
package eu.doppel_helix.jna.tlb.wbemdisp1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * A collection of Properties
 *
 * <p>uuid({DEA0A7B2-D4BA-11D1-8B09-00600806D9B6})</p>
 */
@ComInterface(iid="{DEA0A7B2-D4BA-11D1-8B09-00600806D9B6}")
public interface ISWbemPropertySet extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * Get a named Property from this collection
     *
     * <p>id(0x0)</p>
     * <p>vtableId(8)</p>
     * @param strName [in] {@code String}
     * @param iFlags [in, optional] {@code Integer}
     */
    @ComMethod(name = "Item", dispId = 0x0)
    ISWbemProperty Item(String strName,
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
     * Add a Property to this collection
     *
     * <p>id(0x2)</p>
     * <p>vtableId(10)</p>
     * @param strName [in] {@code String}
     * @param iCimType [in] {@code WbemCimtypeEnum}
     * @param bIsArray [in, optional] {@code Boolean}
     * @param iFlags [in, optional] {@code Integer}
     */
    @ComMethod(name = "Add", dispId = 0x2)
    ISWbemProperty Add(String strName,
            WbemCimtypeEnum iCimType,
            Object bIsArray,
            Object iFlags);
            
    /**
     * Remove a Property from this collection
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