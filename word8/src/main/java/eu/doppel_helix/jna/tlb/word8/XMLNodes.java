
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({D36C1F42-7044-4B9E-9CA3-85919454DB04})</p>
 */
@ComInterface(iid="{D36C1F42-7044-4B9E-9CA3-85919454DB04}")
public interface XMLNodes extends IUnknown, IRawDispatchHandle, IDispatch {
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
     * @param Index [in] {@code Integer}
     */
    @ComMethod(name = "Item", dispId = 0x0)
    XMLNode Item(Integer Index);
            
    /**
     * <p>id(0x64)</p>
     * <p>vtableId(13)</p>
     * @param Name [in] {@code String}
     * @param Namespace [in] {@code String}
     * @param Range [in, optional] {@code Object}
     */
    @ComMethod(name = "Add", dispId = 0x64)
    XMLNode Add(String Name,
            String Namespace,
            Object Range);
            
    
}