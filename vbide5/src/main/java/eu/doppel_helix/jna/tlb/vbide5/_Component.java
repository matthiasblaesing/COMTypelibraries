
package eu.doppel_helix.jna.tlb.vbide5;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({0002E163-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{0002E163-0000-0000-C000-000000000046}")
public interface _Component extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x1)</p>
     * <p>vtableId(7)</p>
     */
    @ComProperty(name = "Application", dispId = 0x1)
    Application getApplication();
            
    /**
     * <p>id(0x2)</p>
     * <p>vtableId(8)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x2)
    Components getParent();
            
    /**
     * <p>id(0xa)</p>
     * <p>vtableId(9)</p>
     */
    @ComProperty(name = "IsDirty", dispId = 0xa)
    Boolean getIsDirty();
            
    /**
     * <p>id(0xa)</p>
     * <p>vtableId(10)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "IsDirty", dispId = 0xa)
    void setIsDirty(Boolean param0);
            
    /**
     * <p>id(0x30)</p>
     * <p>vtableId(11)</p>
     */
    @ComProperty(name = "Name", dispId = 0x30)
    String getName();
            
    /**
     * <p>id(0x30)</p>
     * <p>vtableId(12)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "Name", dispId = 0x30)
    void setName(String param0);
            
    
}