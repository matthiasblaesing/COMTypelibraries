
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00024442-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{00024442-0000-0000-C000-000000000046}")
public interface LinkFormat extends IUnknown, IRawDispatchHandle, IDispatch {
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
     * <p>id(0x418)</p>
     * <p>vtableId(10)</p>
     */
    @ComProperty(name = "AutoUpdate", dispId = 0x418)
    Boolean getAutoUpdate();
            
    /**
     * <p>id(0x418)</p>
     * <p>vtableId(11)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "AutoUpdate", dispId = 0x418)
    void setAutoUpdate(Boolean param0);
            
    /**
     * <p>id(0x10d)</p>
     * <p>vtableId(12)</p>
     */
    @ComProperty(name = "Locked", dispId = 0x10d)
    Boolean getLocked();
            
    /**
     * <p>id(0x10d)</p>
     * <p>vtableId(13)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "Locked", dispId = 0x10d)
    void setLocked(Boolean param0);
            
    /**
     * <p>id(0x2a8)</p>
     * <p>vtableId(14)</p>
     */
    @ComMethod(name = "Update", dispId = 0x2a8)
    void Update();
            
    
}