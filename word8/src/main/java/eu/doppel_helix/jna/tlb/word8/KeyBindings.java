
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00020996-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{00020996-0000-0000-C000-000000000046}")
public interface KeyBindings extends IUnknown, IRawDispatchHandle, IDispatch {
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
     * <p>id(0x2)</p>
     * <p>vtableId(11)</p>
     */
    @ComProperty(name = "Count", dispId = 0x2)
    Integer getCount();
            
    /**
     * <p>id(0xa)</p>
     * <p>vtableId(12)</p>
     */
    @ComProperty(name = "Context", dispId = 0xa)
    com.sun.jna.platform.win32.COM.util.IDispatch getContext();
            
    /**
     * <p>id(0x0)</p>
     * <p>vtableId(13)</p>
     * @param Index [in] {@code Integer}
     */
    @ComMethod(name = "Item", dispId = 0x0)
    KeyBinding Item(Integer Index);
            
    /**
     * <p>id(0x65)</p>
     * <p>vtableId(14)</p>
     * @param KeyCategory [in] {@code WdKeyCategory}
     * @param Command [in] {@code String}
     * @param KeyCode [in] {@code Integer}
     * @param KeyCode2 [in, optional] {@code Object}
     * @param CommandParameter [in, optional] {@code Object}
     */
    @ComMethod(name = "Add", dispId = 0x65)
    KeyBinding Add(WdKeyCategory KeyCategory,
            String Command,
            Integer KeyCode,
            Object KeyCode2,
            Object CommandParameter);
            
    /**
     * <p>id(0x66)</p>
     * <p>vtableId(15)</p>
     */
    @ComMethod(name = "ClearAll", dispId = 0x66)
    void ClearAll();
            
    /**
     * <p>id(0x6e)</p>
     * <p>vtableId(16)</p>
     * @param KeyCode [in] {@code Integer}
     * @param KeyCode2 [in, optional] {@code Object}
     */
    @ComMethod(name = "Key", dispId = 0x6e)
    KeyBinding Key(Integer KeyCode,
            Object KeyCode2);
            
    
}