
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.AbstractComEventCallbackListener;
import com.sun.jna.platform.win32.COM.util.annotation.ComEventCallback;
import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00024411-0000-0000-C000-000000000046})</p>
 */
public abstract class DocEventsHandler extends AbstractComEventCallbackListener implements DocEvents {
    @Override
    public void errorReceivingCallbackEvent(java.lang.String string, java.lang.Exception excptn) {
    }

    /**
     * <p>id(0x607)</p>
     */
    @Override
    public void SelectionChange(Range Target){
    }
            
    /**
     * <p>id(0x601)</p>
     */
    @Override
    public void BeforeDoubleClick(Range Target,
            VARIANT Cancel){
    }
            
    /**
     * <p>id(0x5fe)</p>
     */
    @Override
    public void BeforeRightClick(Range Target,
            VARIANT Cancel){
    }
            
    /**
     * <p>id(0x130)</p>
     */
    @Override
    public void Activate(){
    }
            
    /**
     * <p>id(0x5fa)</p>
     */
    @Override
    public void Deactivate(){
    }
            
    /**
     * <p>id(0x117)</p>
     */
    @Override
    public void Calculate(){
    }
            
    /**
     * <p>id(0x609)</p>
     */
    @Override
    public void Change(Range Target){
    }
            
    /**
     * <p>id(0x5be)</p>
     */
    @Override
    public void FollowHyperlink(Hyperlink Target){
    }
            
    /**
     * <p>id(0x86c)</p>
     */
    @Override
    public void PivotTableUpdate(PivotTable Target){
    }
            
    /**
     * <p>id(0xb46)</p>
     */
    @Override
    public void PivotTableAfterValueChange(PivotTable TargetPivotTable,
            Range TargetRange){
    }
            
    /**
     * <p>id(0xb49)</p>
     */
    @Override
    public void PivotTableBeforeAllocateChanges(PivotTable TargetPivotTable,
            Integer ValueChangeStart,
            Integer ValueChangeEnd,
            VARIANT Cancel){
    }
            
    /**
     * <p>id(0xb4c)</p>
     */
    @Override
    public void PivotTableBeforeCommitChanges(PivotTable TargetPivotTable,
            Integer ValueChangeStart,
            Integer ValueChangeEnd,
            VARIANT Cancel){
    }
            
    /**
     * <p>id(0xb4d)</p>
     */
    @Override
    public void PivotTableBeforeDiscardChanges(PivotTable TargetPivotTable,
            Integer ValueChangeStart,
            Integer ValueChangeEnd){
    }
            
    /**
     * <p>id(0xb4e)</p>
     */
    @Override
    public void PivotTableChangeSync(PivotTable Target){
    }
            
    /**
     * <p>id(0xc00)</p>
     */
    @Override
    public void LensGalleryRenderComplete(){
    }
            
    /**
     * <p>id(0xc01)</p>
     */
    @Override
    public void TableUpdate(TableObject Target){
    }
            
    /**
     * <p>id(0xc02)</p>
     */
    @Override
    public void BeforeDelete(){
    }
            
    
}