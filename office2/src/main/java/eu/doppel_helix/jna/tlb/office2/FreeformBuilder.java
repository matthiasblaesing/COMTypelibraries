
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000C0315-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000C0315-0000-0000-C000-000000000046}")
public interface FreeformBuilder extends IUnknown, IRawDispatchHandle, IDispatch {
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
     */
    @ComProperty(name = "Parent", dispId = 0x1)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * <p>id(0xa)</p>
     * <p>vtableId(10)</p>
     * @param SegmentType [in] {@code MsoSegmentType}
     * @param EditingType [in] {@code MsoEditingType}
     * @param X1 [in] {@code Float}
     * @param Y1 [in] {@code Float}
     * @param X2 [in, optional] {@code Float}
     * @param Y2 [in, optional] {@code Float}
     * @param X3 [in, optional] {@code Float}
     * @param Y3 [in, optional] {@code Float}
     */
    @ComMethod(name = "AddNodes", dispId = 0xa)
    void AddNodes(MsoSegmentType SegmentType,
            MsoEditingType EditingType,
            Float X1,
            Float Y1,
            Float X2,
            Float Y2,
            Float X3,
            Float Y3);
            
    /**
     * <p>id(0xb)</p>
     * <p>vtableId(11)</p>
     */
    @ComMethod(name = "ConvertToShape", dispId = 0xb)
    Shape ConvertToShape();
            
    
}