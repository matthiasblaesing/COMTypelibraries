
package eu.doppel_helix.jna.tlb.wia1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({AF49723A-499C-411C-B19A-1B8244D67E44})</p>
 */
@ComInterface(iid="{AF49723A-499C-411C-B19A-1B8244D67E44}")
public interface IFilterInfos extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * Returns the specified item in the collection either by position or name
     *
     * <p>id(0x0)</p>
     */
    @ComProperty(name = "Item", dispId = 0x0)
    IFilterInfo getItem(Object Index);
            
    /**
     * Returns the number of members in the collection
     *
     * <p>id(0x1)</p>
     */
    @ComProperty(name = "Count", dispId = 0x1)
    Integer getCount();
            
    
}