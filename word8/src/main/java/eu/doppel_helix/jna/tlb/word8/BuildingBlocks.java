
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({C6D50987-25D7-408A-BFF2-90BF86A24E93})</p>
 */
@ComInterface(iid="{C6D50987-25D7-408A-BFF2-90BF86A24E93}")
public interface BuildingBlocks extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x3e8)</p>
     * <p>vtableId(7)</p>
     */
    @ComProperty(name = "Application", dispId = 0x3e8)
    Application getApplication();
            
    /**
     * <p>id(0x3e9)</p>
     * <p>vtableId(8)</p>
     */
    @ComProperty(name = "Creator", dispId = 0x3e9)
    Integer getCreator();
            
    /**
     * <p>id(0x3ea)</p>
     * <p>vtableId(9)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x3ea)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * <p>id(0x1)</p>
     * <p>vtableId(10)</p>
     */
    @ComProperty(name = "Count", dispId = 0x1)
    Integer getCount();
            
    /**
     * <p>id(0x0)</p>
     * <p>vtableId(11)</p>
     * @param Index [in] {@code Object}
     */
    @ComMethod(name = "Item", dispId = 0x0)
    BuildingBlock Item(Object Index);
            
    /**
     * <p>id(0x65)</p>
     * <p>vtableId(12)</p>
     * @param Name [in] {@code String}
     * @param Range [in] {@code Range}
     * @param Description [in, optional] {@code Object}
     * @param InsertOptions [in, optional] {@code WdDocPartInsertOptions}
     */
    @ComMethod(name = "Add", dispId = 0x65)
    BuildingBlock Add(String Name,
            Range Range,
            Object Description,
            WdDocPartInsertOptions InsertOptions);
            
    
}