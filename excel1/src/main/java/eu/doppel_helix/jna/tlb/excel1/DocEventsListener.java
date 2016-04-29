
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComEventCallback;
import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00024411-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{00024411-0000-0000-C000-000000000046}")
public interface DocEventsListener {
    /**
     * <p>id(0x607)</p>
     */
    @ComEventCallback(dispid = 0x607)
    void SelectionChange(Range Target);
            
    /**
     * <p>id(0x601)</p>
     */
    @ComEventCallback(dispid = 0x601)
    void BeforeDoubleClick(Range Target,
            VARIANT Cancel);
            
    /**
     * <p>id(0x5fe)</p>
     */
    @ComEventCallback(dispid = 0x5fe)
    void BeforeRightClick(Range Target,
            VARIANT Cancel);
            
    /**
     * <p>id(0x130)</p>
     */
    @ComEventCallback(dispid = 0x130)
    void Activate();
            
    /**
     * <p>id(0x5fa)</p>
     */
    @ComEventCallback(dispid = 0x5fa)
    void Deactivate();
            
    /**
     * <p>id(0x117)</p>
     */
    @ComEventCallback(dispid = 0x117)
    void Calculate();
            
    /**
     * <p>id(0x609)</p>
     */
    @ComEventCallback(dispid = 0x609)
    void Change(Range Target);
            
    /**
     * <p>id(0x5be)</p>
     */
    @ComEventCallback(dispid = 0x5be)
    void FollowHyperlink(Hyperlink Target);
            
    /**
     * <p>id(0x86c)</p>
     */
    @ComEventCallback(dispid = 0x86c)
    void PivotTableUpdate(PivotTable Target);
            
    /**
     * <p>id(0xb46)</p>
     */
    @ComEventCallback(dispid = 0xb46)
    void PivotTableAfterValueChange(PivotTable TargetPivotTable,
            Range TargetRange);
            
    /**
     * <p>id(0xb49)</p>
     */
    @ComEventCallback(dispid = 0xb49)
    void PivotTableBeforeAllocateChanges(PivotTable TargetPivotTable,
            Integer ValueChangeStart,
            Integer ValueChangeEnd,
            VARIANT Cancel);
            
    /**
     * <p>id(0xb4c)</p>
     */
    @ComEventCallback(dispid = 0xb4c)
    void PivotTableBeforeCommitChanges(PivotTable TargetPivotTable,
            Integer ValueChangeStart,
            Integer ValueChangeEnd,
            VARIANT Cancel);
            
    /**
     * <p>id(0xb4d)</p>
     */
    @ComEventCallback(dispid = 0xb4d)
    void PivotTableBeforeDiscardChanges(PivotTable TargetPivotTable,
            Integer ValueChangeStart,
            Integer ValueChangeEnd);
            
    /**
     * <p>id(0xb4e)</p>
     */
    @ComEventCallback(dispid = 0xb4e)
    void PivotTableChangeSync(PivotTable Target);
            
    /**
     * <p>id(0xc00)</p>
     */
    @ComEventCallback(dispid = 0xc00)
    void LensGalleryRenderComplete();
            
    /**
     * <p>id(0xc01)</p>
     */
    @ComEventCallback(dispid = 0xc01)
    void TableUpdate(TableObject Target);
            
    /**
     * <p>id(0xc02)</p>
     */
    @ComEventCallback(dispid = 0xc02)
    void BeforeDelete();
            
    
}