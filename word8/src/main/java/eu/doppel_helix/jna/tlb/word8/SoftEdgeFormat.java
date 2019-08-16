
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({D040DAF9-6CE4-4BE8-839D-F4538A4301CF})</p>
 */
@ComInterface(iid="{D040DAF9-6CE4-4BE8-839D-F4538A4301CF}")
public interface SoftEdgeFormat extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x1)</p>
     * <p>vtableId(7)</p>
     */
    @ComProperty(name = "Type", dispId = 0x1)
    eu.doppel_helix.jna.tlb.office2.MsoSoftEdgeType getType();
            
    /**
     * <p>id(0x1)</p>
     * <p>vtableId(8)</p>
     * @param param0 [in] {@code eu.doppel_helix.jna.tlb.office2.MsoSoftEdgeType}
     */
    @ComProperty(name = "Type", dispId = 0x1)
    void setType(eu.doppel_helix.jna.tlb.office2.MsoSoftEdgeType param0);
            
    /**
     * <p>id(0x2)</p>
     * <p>vtableId(9)</p>
     */
    @ComProperty(name = "Radius", dispId = 0x2)
    Float getRadius();
            
    /**
     * <p>id(0x2)</p>
     * <p>vtableId(10)</p>
     * @param param0 [in] {@code Float}
     */
    @ComProperty(name = "Radius", dispId = 0x2)
    void setRadius(Float param0);
            
    /**
     * <p>id(0x3e8)</p>
     * <p>vtableId(11)</p>
     */
    @ComProperty(name = "Application", dispId = 0x3e8)
    Application getApplication();
            
    /**
     * <p>id(0x3e9)</p>
     * <p>vtableId(12)</p>
     */
    @ComProperty(name = "Creator", dispId = 0x3e9)
    Integer getCreator();
            
    /**
     * <p>id(0x3ea)</p>
     * <p>vtableId(13)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x3ea)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    
}