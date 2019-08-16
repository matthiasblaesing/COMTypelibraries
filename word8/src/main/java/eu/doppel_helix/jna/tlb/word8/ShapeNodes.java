
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000209CE-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000209CE-0000-0000-C000-000000000046}")
public interface ShapeNodes extends IUnknown, IRawDispatchHandle, IDispatch {
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
     * <p>id(0x2)</p>
     * <p>vtableId(10)</p>
     */
    @ComProperty(name = "Count", dispId = 0x2)
    Integer getCount();
            
    /**
     * <p>id(0xb)</p>
     * <p>vtableId(12)</p>
     * @param Index [in] {@code Integer}
     */
    @ComMethod(name = "Delete", dispId = 0xb)
    void Delete(Integer Index);
            
    /**
     * <p>id(0x0)</p>
     * <p>vtableId(13)</p>
     * @param Index [in] {@code Object}
     */
    @ComMethod(name = "Item", dispId = 0x0)
    ShapeNode Item(Object Index);
            
    /**
     * <p>id(0xd)</p>
     * <p>vtableId(14)</p>
     * @param Index [in] {@code Integer}
     * @param EditingType [in] {@code eu.doppel_helix.jna.tlb.office2.MsoEditingType}
     */
    @ComMethod(name = "SetEditingType", dispId = 0xd)
    void SetEditingType(Integer Index,
            eu.doppel_helix.jna.tlb.office2.MsoEditingType EditingType);
            
    /**
     * <p>id(0xe)</p>
     * <p>vtableId(15)</p>
     * @param Index [in] {@code Integer}
     * @param X1 [in] {@code Float}
     * @param Y1 [in] {@code Float}
     */
    @ComMethod(name = "SetPosition", dispId = 0xe)
    void SetPosition(Integer Index,
            Float X1,
            Float Y1);
            
    /**
     * <p>id(0xf)</p>
     * <p>vtableId(16)</p>
     * @param Index [in] {@code Integer}
     * @param SegmentType [in] {@code eu.doppel_helix.jna.tlb.office2.MsoSegmentType}
     */
    @ComMethod(name = "SetSegmentType", dispId = 0xf)
    void SetSegmentType(Integer Index,
            eu.doppel_helix.jna.tlb.office2.MsoSegmentType SegmentType);
            
    /**
     * <p>id(0xc)</p>
     * <p>vtableId(17)</p>
     * @param Index [in] {@code Integer}
     * @param SegmentType [in] {@code eu.doppel_helix.jna.tlb.office2.MsoSegmentType}
     * @param EditingType [in] {@code eu.doppel_helix.jna.tlb.office2.MsoEditingType}
     * @param X1 [in] {@code Float}
     * @param Y1 [in] {@code Float}
     * @param X2 [in, optional] {@code Float}
     * @param Y2 [in, optional] {@code Float}
     * @param X3 [in, optional] {@code Float}
     * @param Y3 [in, optional] {@code Float}
     */
    @ComMethod(name = "Insert", dispId = 0xc)
    void Insert(Integer Index,
            eu.doppel_helix.jna.tlb.office2.MsoSegmentType SegmentType,
            eu.doppel_helix.jna.tlb.office2.MsoEditingType EditingType,
            Float X1,
            Float Y1,
            Float X2,
            Float Y2,
            Float X3,
            Float Y3);
            
    
}