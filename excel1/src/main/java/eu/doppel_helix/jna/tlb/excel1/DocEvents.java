
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00024411-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{00024411-0000-0000-C000-000000000046}")
public interface DocEvents extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x607)</p>
     * <p>vtableId(7)</p>
     * @param Target [in] {@code Range}
     */
    @ComMethod(name = "SelectionChange", dispId = 0x607)
    void SelectionChange(Range Target);
            
    /**
     * <p>id(0x601)</p>
     * <p>vtableId(8)</p>
     * @param Target [in] {@code Range}
     * @param Cancel [inout] {@code Boolean}
     */
    @ComMethod(name = "BeforeDoubleClick", dispId = 0x601)
    void BeforeDoubleClick(Range Target,
            VARIANT Cancel);
            
    /**
     * <p>id(0x5fe)</p>
     * <p>vtableId(9)</p>
     * @param Target [in] {@code Range}
     * @param Cancel [inout] {@code Boolean}
     */
    @ComMethod(name = "BeforeRightClick", dispId = 0x5fe)
    void BeforeRightClick(Range Target,
            VARIANT Cancel);
            
    /**
     * <p>id(0x130)</p>
     * <p>vtableId(10)</p>
     */
    @ComMethod(name = "Activate", dispId = 0x130)
    void Activate();
            
    /**
     * <p>id(0x5fa)</p>
     * <p>vtableId(11)</p>
     */
    @ComMethod(name = "Deactivate", dispId = 0x5fa)
    void Deactivate();
            
    /**
     * <p>id(0x117)</p>
     * <p>vtableId(12)</p>
     */
    @ComMethod(name = "Calculate", dispId = 0x117)
    void Calculate();
            
    /**
     * <p>id(0x609)</p>
     * <p>vtableId(13)</p>
     * @param Target [in] {@code Range}
     */
    @ComMethod(name = "Change", dispId = 0x609)
    void Change(Range Target);
            
    /**
     * <p>id(0x5be)</p>
     * <p>vtableId(14)</p>
     * @param Target [in] {@code Hyperlink}
     */
    @ComMethod(name = "FollowHyperlink", dispId = 0x5be)
    void FollowHyperlink(Hyperlink Target);
            
    /**
     * <p>id(0x86c)</p>
     * <p>vtableId(15)</p>
     * @param Target [in] {@code PivotTable}
     */
    @ComMethod(name = "PivotTableUpdate", dispId = 0x86c)
    void PivotTableUpdate(PivotTable Target);
            
    /**
     * <p>id(0xb46)</p>
     * <p>vtableId(16)</p>
     * @param TargetPivotTable [in] {@code PivotTable}
     * @param TargetRange [in] {@code Range}
     */
    @ComMethod(name = "PivotTableAfterValueChange", dispId = 0xb46)
    void PivotTableAfterValueChange(PivotTable TargetPivotTable,
            Range TargetRange);
            
    /**
     * <p>id(0xb49)</p>
     * <p>vtableId(17)</p>
     * @param TargetPivotTable [in] {@code PivotTable}
     * @param ValueChangeStart [in] {@code Integer}
     * @param ValueChangeEnd [in] {@code Integer}
     * @param Cancel [inout] {@code Boolean}
     */
    @ComMethod(name = "PivotTableBeforeAllocateChanges", dispId = 0xb49)
    void PivotTableBeforeAllocateChanges(PivotTable TargetPivotTable,
            Integer ValueChangeStart,
            Integer ValueChangeEnd,
            VARIANT Cancel);
            
    /**
     * <p>id(0xb4c)</p>
     * <p>vtableId(18)</p>
     * @param TargetPivotTable [in] {@code PivotTable}
     * @param ValueChangeStart [in] {@code Integer}
     * @param ValueChangeEnd [in] {@code Integer}
     * @param Cancel [inout] {@code Boolean}
     */
    @ComMethod(name = "PivotTableBeforeCommitChanges", dispId = 0xb4c)
    void PivotTableBeforeCommitChanges(PivotTable TargetPivotTable,
            Integer ValueChangeStart,
            Integer ValueChangeEnd,
            VARIANT Cancel);
            
    /**
     * <p>id(0xb4d)</p>
     * <p>vtableId(19)</p>
     * @param TargetPivotTable [in] {@code PivotTable}
     * @param ValueChangeStart [in] {@code Integer}
     * @param ValueChangeEnd [in] {@code Integer}
     */
    @ComMethod(name = "PivotTableBeforeDiscardChanges", dispId = 0xb4d)
    void PivotTableBeforeDiscardChanges(PivotTable TargetPivotTable,
            Integer ValueChangeStart,
            Integer ValueChangeEnd);
            
    /**
     * <p>id(0xb4e)</p>
     * <p>vtableId(20)</p>
     * @param Target [in] {@code PivotTable}
     */
    @ComMethod(name = "PivotTableChangeSync", dispId = 0xb4e)
    void PivotTableChangeSync(PivotTable Target);
            
    /**
     * <p>id(0xc00)</p>
     * <p>vtableId(21)</p>
     */
    @ComMethod(name = "LensGalleryRenderComplete", dispId = 0xc00)
    void LensGalleryRenderComplete();
            
    /**
     * <p>id(0xc01)</p>
     * <p>vtableId(22)</p>
     * @param Target [in] {@code TableObject}
     */
    @ComMethod(name = "TableUpdate", dispId = 0xc01)
    void TableUpdate(TableObject Target);
            
    /**
     * <p>id(0xc02)</p>
     * <p>vtableId(23)</p>
     */
    @ComMethod(name = "BeforeDelete", dispId = 0xc02)
    void BeforeDelete();
            
    
}