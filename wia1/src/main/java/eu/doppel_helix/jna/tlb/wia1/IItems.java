
package eu.doppel_helix.jna.tlb.wia1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({46102071-60B4-4E58-8620-397D17B0BB5B})</p>
 */
@ComInterface(iid="{46102071-60B4-4E58-8620-397D17B0BB5B}")
public interface IItems extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * Returns the specified item in the collection by position
     *
     * <p>id(0x0)</p>
     */
    @ComProperty(name = "Item", dispId = 0x0)
    IItem getItem(Integer Index);
            
    /**
     * Returns the number of members in the collection
     *
     * <p>id(0x1)</p>
     */
    @ComProperty(name = "Count", dispId = 0x1)
    Integer getCount();
            
    /**
     * Adds a new Item with the specified Name and Flags. The Flags value is created by using the OR operation with members of the WiaItemFlags enumeration.
     *
     * <p>id(0x2)</p>
     */
    @ComMethod(name = "Add", dispId = 0x2)
    void Add(String Name,
            Integer Flags);
            
    /**
     * Removes the designated Item
     *
     * <p>id(0x3)</p>
     */
    @ComMethod(name = "Remove", dispId = 0x3)
    void Remove(Integer Index);
            
    
}