
package eu.doppel_helix.jna.tlb.wia1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({C82FFED4-0A8D-4F85-B90A-AC8E720D39C1})</p>
 */
@ComInterface(iid="{C82FFED4-0A8D-4F85-B90A-AC8E720D39C1}")
public interface IFilters {
    /**
     * Returns the specified item in the collection by position or FilterID
     *
     * <p>id(0x0)</p>
     */
    @ComProperty(name = "Item", dispId = 0x0)
    IFilter getItem(Integer Index);
            
    /**
     * Returns the number of members in the collection
     *
     * <p>id(0x1)</p>
     */
    @ComProperty(name = "Count", dispId = 0x1)
    Integer getCount();
            
    /**
     * Appends/Inserts a new Filter of the specified FilterID into a Filter collection
     *
     * <p>id(0x2)</p>
     */
    @ComMethod(name = "Add", dispId = 0x2)
    void Add(String FilterID,
            Integer Index);
            
    /**
     * Removes the designated filter
     *
     * <p>id(0x3)</p>
     */
    @ComMethod(name = "Remove", dispId = 0x3)
    void Remove(Integer Index);
            
    
}