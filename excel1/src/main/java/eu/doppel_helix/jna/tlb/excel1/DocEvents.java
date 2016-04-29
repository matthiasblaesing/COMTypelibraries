
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00024411-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{00024411-0000-0000-C000-000000000046}")
public interface DocEvents {
    /**
     * <p>id(0x607)</p>
     */
    @ComMethod(name = "SelectionChange", dispId = 0x607)
    void SelectionChange(Range Target);
            
    /**
     * <p>id(0x601)</p>
     */
    @ComMethod(name = "BeforeDoubleClick", dispId = 0x601)
    void BeforeDoubleClick(Range Target,
            VARIANT Cancel);
            
    /**
     * <p>id(0x5fe)</p>
     */
    @ComMethod(name = "BeforeRightClick", dispId = 0x5fe)
    void BeforeRightClick(Range Target,
            VARIANT Cancel);
            
    /**
     * <p>id(0x130)</p>
     */
    @ComMethod(name = "Activate", dispId = 0x130)
    void Activate();
            
    /**
     * <p>id(0x5fa)</p>
     */
    @ComMethod(name = "Deactivate", dispId = 0x5fa)
    void Deactivate();
            
    /**
     * <p>id(0x117)</p>
     */
    @ComMethod(name = "Calculate", dispId = 0x117)
    void Calculate();
            
    /**
     * <p>id(0x609)</p>
     */
    @ComMethod(name = "Change", dispId = 0x609)
    void Change(Range Target);
            
    /**
     * <p>id(0x5be)</p>
     */
    @ComMethod(name = "FollowHyperlink", dispId = 0x5be)
    void FollowHyperlink(Hyperlink Target);
            
    /**
     * <p>id(0x86c)</p>
     */
    @ComMethod(name = "PivotTableUpdate", dispId = 0x86c)
    void PivotTableUpdate(PivotTable Target);
            
    /**
     * <p>id(0xb46)</p>
     */
    @ComMethod(name = "PivotTableAfterValueChange", dispId = 0xb46)
    void PivotTableAfterValueChange(PivotTable TargetPivotTable,
            Range TargetRange);
            
    /**
     * <p>id(0xb49)</p>
     */
    @ComMethod(name = "PivotTableBeforeAllocateChanges", dispId = 0xb49)
    void PivotTableBeforeAllocateChanges(PivotTable TargetPivotTable,
            Integer ValueChangeStart,
            Integer ValueChangeEnd,
            VARIANT Cancel);
            
    /**
     * <p>id(0xb4c)</p>
     */
    @ComMethod(name = "PivotTableBeforeCommitChanges", dispId = 0xb4c)
    void PivotTableBeforeCommitChanges(PivotTable TargetPivotTable,
            Integer ValueChangeStart,
            Integer ValueChangeEnd,
            VARIANT Cancel);
            
    /**
     * <p>id(0xb4d)</p>
     */
    @ComMethod(name = "PivotTableBeforeDiscardChanges", dispId = 0xb4d)
    void PivotTableBeforeDiscardChanges(PivotTable TargetPivotTable,
            Integer ValueChangeStart,
            Integer ValueChangeEnd);
            
    /**
     * <p>id(0xb4e)</p>
     */
    @ComMethod(name = "PivotTableChangeSync", dispId = 0xb4e)
    void PivotTableChangeSync(PivotTable Target);
            
    /**
     * <p>id(0xc00)</p>
     */
    @ComMethod(name = "LensGalleryRenderComplete", dispId = 0xc00)
    void LensGalleryRenderComplete();
            
    /**
     * <p>id(0xc01)</p>
     */
    @ComMethod(name = "TableUpdate", dispId = 0xc01)
    void TableUpdate(TableObject Target);
            
    /**
     * <p>id(0xc02)</p>
     */
    @ComMethod(name = "BeforeDelete", dispId = 0xc02)
    void BeforeDelete();
            
    
}