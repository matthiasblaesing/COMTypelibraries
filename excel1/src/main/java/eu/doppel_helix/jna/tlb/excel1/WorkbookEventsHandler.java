
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.AbstractComEventCallbackListener;
import com.sun.jna.platform.win32.COM.util.annotation.ComEventCallback;
import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00024412-0000-0000-C000-000000000046})</p>
 */
public abstract class WorkbookEventsHandler extends AbstractComEventCallbackListener implements WorkbookEvents {
    @Override
    public void errorReceivingCallbackEvent(java.lang.String string, java.lang.Exception excptn) {
    }

    /**
     * <p>id(0x783)</p>
     */
    @Override
    public void Open(){
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
     * <p>id(0x60a)</p>
     */
    @Override
    public void BeforeClose(VARIANT Cancel){
    }
            
    /**
     * <p>id(0x60b)</p>
     */
    @Override
    public void BeforeSave(Boolean SaveAsUI,
            VARIANT Cancel){
    }
            
    /**
     * <p>id(0x60d)</p>
     */
    @Override
    public void BeforePrint(VARIANT Cancel){
    }
            
    /**
     * <p>id(0x60e)</p>
     */
    @Override
    public void NewSheet(com.sun.jna.platform.win32.COM.util.IDispatch Sh){
    }
            
    /**
     * <p>id(0x610)</p>
     */
    @Override
    public void AddinInstall(){
    }
            
    /**
     * <p>id(0x611)</p>
     */
    @Override
    public void AddinUninstall(){
    }
            
    /**
     * <p>id(0x612)</p>
     */
    @Override
    public void WindowResize(Window Wn){
    }
            
    /**
     * <p>id(0x614)</p>
     */
    @Override
    public void WindowActivate(Window Wn){
    }
            
    /**
     * <p>id(0x615)</p>
     */
    @Override
    public void WindowDeactivate(Window Wn){
    }
            
    /**
     * <p>id(0x616)</p>
     */
    @Override
    public void SheetSelectionChange(com.sun.jna.platform.win32.COM.util.IDispatch Sh,
            Range Target){
    }
            
    /**
     * <p>id(0x617)</p>
     */
    @Override
    public void SheetBeforeDoubleClick(com.sun.jna.platform.win32.COM.util.IDispatch Sh,
            Range Target,
            VARIANT Cancel){
    }
            
    /**
     * <p>id(0x618)</p>
     */
    @Override
    public void SheetBeforeRightClick(com.sun.jna.platform.win32.COM.util.IDispatch Sh,
            Range Target,
            VARIANT Cancel){
    }
            
    /**
     * <p>id(0x619)</p>
     */
    @Override
    public void SheetActivate(com.sun.jna.platform.win32.COM.util.IDispatch Sh){
    }
            
    /**
     * <p>id(0x61a)</p>
     */
    @Override
    public void SheetDeactivate(com.sun.jna.platform.win32.COM.util.IDispatch Sh){
    }
            
    /**
     * <p>id(0x61b)</p>
     */
    @Override
    public void SheetCalculate(com.sun.jna.platform.win32.COM.util.IDispatch Sh){
    }
            
    /**
     * <p>id(0x61c)</p>
     */
    @Override
    public void SheetChange(com.sun.jna.platform.win32.COM.util.IDispatch Sh,
            Range Target){
    }
            
    /**
     * <p>id(0x73e)</p>
     */
    @Override
    public void SheetFollowHyperlink(com.sun.jna.platform.win32.COM.util.IDispatch Sh,
            Hyperlink Target){
    }
            
    /**
     * <p>id(0x86d)</p>
     */
    @Override
    public void SheetPivotTableUpdate(com.sun.jna.platform.win32.COM.util.IDispatch Sh,
            PivotTable Target){
    }
            
    /**
     * <p>id(0x86e)</p>
     */
    @Override
    public void PivotTableCloseConnection(PivotTable Target){
    }
            
    /**
     * <p>id(0x86f)</p>
     */
    @Override
    public void PivotTableOpenConnection(PivotTable Target){
    }
            
    /**
     * <p>id(0x8da)</p>
     */
    @Override
    public void Sync(eu.doppel_helix.jna.tlb.office2.MsoSyncEventType SyncEventType){
    }
            
    /**
     * <p>id(0x8eb)</p>
     */
    @Override
    public void BeforeXmlImport(XmlMap Map,
            String Url,
            Boolean IsRefresh,
            VARIANT Cancel){
    }
            
    /**
     * <p>id(0x8ed)</p>
     */
    @Override
    public void AfterXmlImport(XmlMap Map,
            Boolean IsRefresh,
            XlXmlImportResult Result){
    }
            
    /**
     * <p>id(0x8ef)</p>
     */
    @Override
    public void BeforeXmlExport(XmlMap Map,
            String Url,
            VARIANT Cancel){
    }
            
    /**
     * <p>id(0x8f0)</p>
     */
    @Override
    public void AfterXmlExport(XmlMap Map,
            String Url,
            XlXmlExportResult Result){
    }
            
    /**
     * <p>id(0xa32)</p>
     */
    @Override
    public void RowsetComplete(String Description,
            String Sheet,
            Boolean Success){
    }
            
    /**
     * <p>id(0xb4f)</p>
     */
    @Override
    public void SheetPivotTableAfterValueChange(com.sun.jna.platform.win32.COM.util.IDispatch Sh,
            PivotTable TargetPivotTable,
            Range TargetRange){
    }
            
    /**
     * <p>id(0xb50)</p>
     */
    @Override
    public void SheetPivotTableBeforeAllocateChanges(com.sun.jna.platform.win32.COM.util.IDispatch Sh,
            PivotTable TargetPivotTable,
            Integer ValueChangeStart,
            Integer ValueChangeEnd,
            VARIANT Cancel){
    }
            
    /**
     * <p>id(0xb51)</p>
     */
    @Override
    public void SheetPivotTableBeforeCommitChanges(com.sun.jna.platform.win32.COM.util.IDispatch Sh,
            PivotTable TargetPivotTable,
            Integer ValueChangeStart,
            Integer ValueChangeEnd,
            VARIANT Cancel){
    }
            
    /**
     * <p>id(0xb52)</p>
     */
    @Override
    public void SheetPivotTableBeforeDiscardChanges(com.sun.jna.platform.win32.COM.util.IDispatch Sh,
            PivotTable TargetPivotTable,
            Integer ValueChangeStart,
            Integer ValueChangeEnd){
    }
            
    /**
     * <p>id(0xb53)</p>
     */
    @Override
    public void SheetPivotTableChangeSync(com.sun.jna.platform.win32.COM.util.IDispatch Sh,
            PivotTable Target){
    }
            
    /**
     * <p>id(0xb54)</p>
     */
    @Override
    public void AfterSave(Boolean Success){
    }
            
    /**
     * <p>id(0xb55)</p>
     */
    @Override
    public void NewChart(Chart Ch){
    }
            
    /**
     * <p>id(0xc03)</p>
     */
    @Override
    public void SheetLensGalleryRenderComplete(com.sun.jna.platform.win32.COM.util.IDispatch Sh){
    }
            
    /**
     * <p>id(0xc04)</p>
     */
    @Override
    public void SheetTableUpdate(com.sun.jna.platform.win32.COM.util.IDispatch Sh,
            TableObject Target){
    }
            
    /**
     * <p>id(0xc05)</p>
     */
    @Override
    public void ModelChange(ModelChanges Changes){
    }
            
    /**
     * <p>id(0xc07)</p>
     */
    @Override
    public void SheetBeforeDelete(com.sun.jna.platform.win32.COM.util.IDispatch Sh){
    }
            
    
}