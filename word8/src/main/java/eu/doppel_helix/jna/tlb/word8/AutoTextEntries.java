
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00020937-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{00020937-0000-0000-C000-000000000046}")
public interface AutoTextEntries extends IUnknown, IRawDispatchHandle, IDispatch {
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
     * <p>vtableId(11)</p>
     */
    @ComProperty(name = "Count", dispId = 0x1)
    Integer getCount();
            
    /**
     * <p>id(0x0)</p>
     * <p>vtableId(12)</p>
     * @param Index [in] {@code Object}
     */
    @ComMethod(name = "Item", dispId = 0x0)
    AutoTextEntry Item(Object Index);
            
    /**
     * <p>id(0x65)</p>
     * <p>vtableId(13)</p>
     * @param Name [in] {@code String}
     * @param Range [in] {@code Range}
     */
    @ComMethod(name = "Add", dispId = 0x65)
    AutoTextEntry Add(String Name,
            Range Range);
            
    /**
     * <p>id(0x66)</p>
     * <p>vtableId(14)</p>
     * @param Range [in] {@code Range}
     */
    @ComMethod(name = "AppendToSpike", dispId = 0x66)
    AutoTextEntry AppendToSpike(Range Range);
            
    
}