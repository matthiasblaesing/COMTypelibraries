
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000C0936-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000C0936-0000-0000-C000-000000000046}")
public interface NewFile extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x60020000)</p>
     * <p>vtableId(7)</p>
     */
    @ComProperty(name = "Application", dispId = 0x60020000)
    com.sun.jna.platform.win32.COM.util.IDispatch getApplication();
            
    /**
     * <p>id(0x60020001)</p>
     * <p>vtableId(8)</p>
     */
    @ComProperty(name = "Creator", dispId = 0x60020001)
    Integer getCreator();
            
    /**
     * <p>id(0x1)</p>
     * <p>vtableId(9)</p>
     * @param FileName [in] {@code String}
     * @param Section [in, optional] {@code Object}
     * @param DisplayName [in, optional] {@code Object}
     * @param Action [in, optional] {@code Object}
     */
    @ComMethod(name = "Add", dispId = 0x1)
    Boolean Add(String FileName,
            Object Section,
            Object DisplayName,
            Object Action);
            
    /**
     * <p>id(0x2)</p>
     * <p>vtableId(10)</p>
     * @param FileName [in] {@code String}
     * @param Section [in, optional] {@code Object}
     * @param DisplayName [in, optional] {@code Object}
     * @param Action [in, optional] {@code Object}
     */
    @ComMethod(name = "Remove", dispId = 0x2)
    Boolean Remove(String FileName,
            Object Section,
            Object DisplayName,
            Object Action);
            
    
}