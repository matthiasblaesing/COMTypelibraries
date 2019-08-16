
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000208B8-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000208B8-0000-0000-C000-000000000046}")
public interface Names extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x94)</p>
     * <p>vtableId(7)</p>
     */
    @ComProperty(name = "Application", dispId = 0x94)
    Application getApplication();
            
    /**
     * <p>id(0x95)</p>
     * <p>vtableId(8)</p>
     */
    @ComProperty(name = "Creator", dispId = 0x95)
    XlCreator getCreator();
            
    /**
     * <p>id(0x96)</p>
     * <p>vtableId(9)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x96)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * <p>id(0xb5)</p>
     * <p>vtableId(10)</p>
     * @param Name [in, optional] {@code Object}
     * @param RefersTo [in, optional] {@code Object}
     * @param Visible [in, optional] {@code Object}
     * @param MacroType [in, optional] {@code Object}
     * @param ShortcutKey [in, optional] {@code Object}
     * @param Category [in, optional] {@code Object}
     * @param NameLocal [in, optional] {@code Object}
     * @param RefersToLocal [in, optional] {@code Object}
     * @param CategoryLocal [in, optional] {@code Object}
     * @param RefersToR1C1 [in, optional] {@code Object}
     * @param RefersToR1C1Local [in, optional] {@code Object}
     */
    @ComMethod(name = "Add", dispId = 0xb5)
    Name Add(Object Name,
            Object RefersTo,
            Object Visible,
            Object MacroType,
            Object ShortcutKey,
            Object Category,
            Object NameLocal,
            Object RefersToLocal,
            Object CategoryLocal,
            Object RefersToR1C1,
            Object RefersToR1C1Local);
            
    /**
     * <p>id(0xaa)</p>
     * <p>vtableId(11)</p>
     * @param Index [in, optional] {@code Object}
     * @param IndexLocal [in, optional] {@code Object}
     * @param RefersTo [in, optional] {@code Object}
     */
    @ComMethod(name = "Item", dispId = 0xaa)
    Name Item(Object Index,
            Object IndexLocal,
            Object RefersTo);
            
    /**
     * <p>id(0x0)</p>
     * <p>vtableId(12)</p>
     * @param Index [in, optional] {@code Object}
     * @param IndexLocal [in, optional] {@code Object}
     * @param RefersTo [in, optional] {@code Object}
     */
    @ComMethod(name = "_Default", dispId = 0x0)
    Name _Default(Object Index,
            Object IndexLocal,
            Object RefersTo);
            
    /**
     * <p>id(0x76)</p>
     * <p>vtableId(13)</p>
     */
    @ComProperty(name = "Count", dispId = 0x76)
    Integer getCount();
            
    
}