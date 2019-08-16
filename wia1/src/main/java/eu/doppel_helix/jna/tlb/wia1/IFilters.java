
package eu.doppel_helix.jna.tlb.wia1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({C82FFED4-0A8D-4F85-B90A-AC8E720D39C1})</p>
 */
@ComInterface(iid="{C82FFED4-0A8D-4F85-B90A-AC8E720D39C1}")
public interface IFilters extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * Returns the specified item in the collection by position or FilterID
     *
     * <p>id(0x0)</p>
     * <p>vtableId(7)</p>
     * @param Index [in] {@code Integer}
     */
    @ComProperty(name = "Item", dispId = 0x0)
    IFilter getItem(Integer Index);
            
    /**
     * Returns the number of members in the collection
     *
     * <p>id(0x1)</p>
     * <p>vtableId(8)</p>
     */
    @ComProperty(name = "Count", dispId = 0x1)
    Integer getCount();
            
    /**
     * Appends/Inserts a new Filter of the specified FilterID into a Filter collection
     *
     * <p>id(0x2)</p>
     * <p>vtableId(10)</p>
     * @param FilterID [in] {@code String}
     * @param Index [in, optional] {@code Integer}
     */
    @ComMethod(name = "Add", dispId = 0x2)
    void Add(String FilterID,
            Integer Index);
            
    /**
     * Removes the designated filter
     *
     * <p>id(0x3)</p>
     * <p>vtableId(11)</p>
     * @param Index [in] {@code Integer}
     */
    @ComMethod(name = "Remove", dispId = 0x3)
    void Remove(Integer Index);
            
    
}