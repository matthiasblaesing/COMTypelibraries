
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000209CD-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000209CD-0000-0000-C000-000000000046}")
public interface ShapeNode extends IUnknown, IRawDispatchHandle, IDispatch {
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
     * <p>id(0x1)</p>
     * <p>vtableId(9)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x1)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * <p>id(0x64)</p>
     * <p>vtableId(10)</p>
     */
    @ComProperty(name = "EditingType", dispId = 0x64)
    eu.doppel_helix.jna.tlb.office2.MsoEditingType getEditingType();
            
    /**
     * <p>id(0x65)</p>
     * <p>vtableId(11)</p>
     */
    @ComProperty(name = "Points", dispId = 0x65)
    Object getPoints();
            
    /**
     * <p>id(0x66)</p>
     * <p>vtableId(12)</p>
     */
    @ComProperty(name = "SegmentType", dispId = 0x66)
    eu.doppel_helix.jna.tlb.office2.MsoSegmentType getSegmentType();
            
    
}