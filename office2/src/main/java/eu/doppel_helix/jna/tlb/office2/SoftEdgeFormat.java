
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000C03BC-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000C03BC-0000-0000-C000-000000000046}")
public interface SoftEdgeFormat extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x60020000)</p>
     */
    @ComProperty(name = "Application", dispId = 0x60020000)
    com.sun.jna.platform.win32.COM.util.IDispatch getApplication();
            
    /**
     * <p>id(0x60020001)</p>
     */
    @ComProperty(name = "Creator", dispId = 0x60020001)
    Integer getCreator();
            
    /**
     * <p>id(0x1)</p>
     */
    @ComProperty(name = "Type", dispId = 0x1)
    MsoSoftEdgeType getType();
            
    /**
     * <p>id(0x1)</p>
     */
    @ComProperty(name = "Type", dispId = 0x1)
    void setType(MsoSoftEdgeType param0);
            
    /**
     * <p>id(0x2)</p>
     */
    @ComProperty(name = "Radius", dispId = 0x2)
    Float getRadius();
            
    /**
     * <p>id(0x2)</p>
     */
    @ComProperty(name = "Radius", dispId = 0x2)
    void setRadius(Float param0);
            
    
}