
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00020955-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{00020955-0000-0000-C000-000000000046}")
public interface TabStops extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x2)</p>
     * <p>vtableId(8)</p>
     */
    @ComProperty(name = "Count", dispId = 0x2)
    Integer getCount();
            
    /**
     * <p>id(0x3e8)</p>
     * <p>vtableId(9)</p>
     */
    @ComProperty(name = "Application", dispId = 0x3e8)
    Application getApplication();
            
    /**
     * <p>id(0x3e9)</p>
     * <p>vtableId(10)</p>
     */
    @ComProperty(name = "Creator", dispId = 0x3e9)
    Integer getCreator();
            
    /**
     * <p>id(0x3ea)</p>
     * <p>vtableId(11)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x3ea)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * <p>id(0x0)</p>
     * <p>vtableId(12)</p>
     * @param Index [in] {@code Object}
     */
    @ComMethod(name = "Item", dispId = 0x0)
    TabStop Item(Object Index);
            
    /**
     * <p>id(0x64)</p>
     * <p>vtableId(13)</p>
     * @param Position [in] {@code Float}
     * @param Alignment [in, optional] {@code Object}
     * @param Leader [in, optional] {@code Object}
     */
    @ComMethod(name = "Add", dispId = 0x64)
    TabStop Add(Float Position,
            Object Alignment,
            Object Leader);
            
    /**
     * <p>id(0x65)</p>
     * <p>vtableId(14)</p>
     */
    @ComMethod(name = "ClearAll", dispId = 0x65)
    void ClearAll();
            
    /**
     * <p>id(0x66)</p>
     * <p>vtableId(15)</p>
     * @param Position [in] {@code Float}
     */
    @ComMethod(name = "Before", dispId = 0x66)
    TabStop Before(Float Position);
            
    /**
     * <p>id(0x67)</p>
     * <p>vtableId(16)</p>
     * @param Position [in] {@code Float}
     */
    @ComMethod(name = "After", dispId = 0x67)
    TabStop After(Float Position);
            
    
}