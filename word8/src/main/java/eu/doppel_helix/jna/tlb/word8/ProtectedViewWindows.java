
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({FD0A74E8-C719-49F6-BA1B-F6D9839D1AB9})</p>
 */
@ComInterface(iid="{FD0A74E8-C719-49F6-BA1B-F6D9839D1AB9}")
public interface ProtectedViewWindows extends IUnknown, IRawDispatchHandle, IDispatch {
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
    ProtectedViewWindow Item(Object Index);
            
    /**
     * <p>id(0x2)</p>
     * <p>vtableId(13)</p>
     * @param FileName [in] {@code Object}
     * @param AddToRecentFiles [in, optional] {@code Object}
     * @param PasswordDocument [in, optional] {@code Object}
     * @param Visible [in, optional] {@code Object}
     * @param OpenAndRepair [in, optional] {@code Object}
     */
    @ComMethod(name = "Open", dispId = 0x2)
    ProtectedViewWindow Open(Object FileName,
            Object AddToRecentFiles,
            Object PasswordDocument,
            Object Visible,
            Object OpenAndRepair);
            
    
}