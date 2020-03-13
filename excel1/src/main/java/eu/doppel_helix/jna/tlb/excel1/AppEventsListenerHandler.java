
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.AbstractComEventCallbackListener;
import com.sun.jna.platform.win32.COM.util.annotation.ComEventCallback;
import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00024413-0000-0000-C000-000000000046})</p>
 */
public abstract class AppEventsListenerHandler extends AbstractComEventCallbackListener implements AppEventsListener {
    @Override
    public void errorReceivingCallbackEvent(java.lang.String string, java.lang.Exception excptn) {
    }

    /**
     * <p>id(0x61d)</p>
     */
    @Override
    public void NewWorkbook(Workbook Wb){
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
     * <p>id(0x61f)</p>
     */
    @Override
    public void WorkbookOpen(Workbook Wb){
    }
            
    /**
     * <p>id(0x620)</p>
     */
    @Override
    public void WorkbookActivate(Workbook Wb){
    }
            
    /**
     * <p>id(0x621)</p>
     */
    @Override
    public void WorkbookDeactivate(Workbook Wb){
    }
            
    /**
     * <p>id(0x622)</p>
     */
    @Override
    public void WorkbookBeforeClose(Workbook Wb,
            VARIANT Cancel){
    }
            
    /**
     * <p>id(0x623)</p>
     */
    @Override
    public void WorkbookBeforeSave(Workbook Wb,
            Boolean SaveAsUI,
            VARIANT Cancel){
    }
            
    /**
     * <p>id(0x624)</p>
     */
    @Override
    public void WorkbookBeforePrint(Workbook Wb,
            VARIANT Cancel){
    }
            
    /**
     * <p>id(0x625)</p>
     */
    @Override
    public void WorkbookNewSheet(Workbook Wb,
            com.sun.jna.platform.win32.COM.util.IDispatch Sh){
    }
            
    /**
     * <p>id(0x626)</p>
     */
    @Override
    public void WorkbookAddinInstall(Workbook Wb){
    }
            
    /**
     * <p>id(0x627)</p>
     */
    @Override
    public void WorkbookAddinUninstall(Workbook Wb){
    }
            
    /**
     * <p>id(0x612)</p>
     */
    @Override
    public void WindowResize(Workbook Wb,
            Window Wn){
    }
            
    /**
     * <p>id(0x614)</p>
     */
    @Override
    public void WindowActivate(Workbook Wb,
            Window Wn){
    }
            
    /**
     * <p>id(0x615)</p>
     */
    @Override
    public void WindowDeactivate(Workbook Wb,
            Window Wn){
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
     * <p>id(0x870)</p>
     */
    @Override
    public void WorkbookPivotTableCloseConnection(Workbook Wb,
            PivotTable Target){
    }
            
    /**
     * <p>id(0x871)</p>
     */
    @Override
    public void WorkbookPivotTableOpenConnection(Workbook Wb,
            PivotTable Target){
    }
            
    /**
     * <p>id(0x8f1)</p>
     */
    @Override
    public void WorkbookSync(Workbook Wb,
            eu.doppel_helix.jna.tlb.office2.MsoSyncEventType SyncEventType){
    }
            
    /**
     * <p>id(0x8f2)</p>
     */
    @Override
    public void WorkbookBeforeXmlImport(Workbook Wb,
            XmlMap Map,
            String Url,
            Boolean IsRefresh,
            VARIANT Cancel){
    }
            
    /**
     * <p>id(0x8f3)</p>
     */
    @Override
    public void WorkbookAfterXmlImport(Workbook Wb,
            XmlMap Map,
            Boolean IsRefresh,
            XlXmlImportResult Result){
    }
            
    /**
     * <p>id(0x8f4)</p>
     */
    @Override
    public void WorkbookBeforeXmlExport(Workbook Wb,
            XmlMap Map,
            String Url,
            VARIANT Cancel){
    }
            
    /**
     * <p>id(0x8f5)</p>
     */
    @Override
    public void WorkbookAfterXmlExport(Workbook Wb,
            XmlMap Map,
            String Url,
            XlXmlExportResult Result){
    }
            
    /**
     * <p>id(0xa33)</p>
     */
    @Override
    public void WorkbookRowsetComplete(Workbook Wb,
            String Description,
            String Sheet,
            Boolean Success){
    }
            
    /**
     * <p>id(0xa34)</p>
     */
    @Override
    public void AfterCalculate(){
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
     * <p>id(0xb57)</p>
     */
    @Override
    public void ProtectedViewWindowOpen(ProtectedViewWindow Pvw){
    }
            
    /**
     * <p>id(0xb59)</p>
     */
    @Override
    public void ProtectedViewWindowBeforeEdit(ProtectedViewWindow Pvw,
            VARIANT Cancel){
    }
            
    /**
     * <p>id(0xb5a)</p>
     */
    @Override
    public void ProtectedViewWindowBeforeClose(ProtectedViewWindow Pvw,
            XlProtectedViewCloseReason Reason,
            VARIANT Cancel){
    }
            
    /**
     * <p>id(0xb5c)</p>
     */
    @Override
    public void ProtectedViewWindowResize(ProtectedViewWindow Pvw){
    }
            
    /**
     * <p>id(0xb5d)</p>
     */
    @Override
    public void ProtectedViewWindowActivate(ProtectedViewWindow Pvw){
    }
            
    /**
     * <p>id(0xb5e)</p>
     */
    @Override
    public void ProtectedViewWindowDeactivate(ProtectedViewWindow Pvw){
    }
            
    /**
     * <p>id(0xb5f)</p>
     */
    @Override
    public void WorkbookAfterSave(Workbook Wb,
            Boolean Success){
    }
            
    /**
     * <p>id(0xb60)</p>
     */
    @Override
    public void WorkbookNewChart(Workbook Wb,
            Chart Ch){
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
     * <p>id(0xc08)</p>
     */
    @Override
    public void WorkbookModelChange(Workbook Wb,
            ModelChanges Changes){
    }
            
    /**
     * <p>id(0xc07)</p>
     */
    @Override
    public void SheetBeforeDelete(com.sun.jna.platform.win32.COM.util.IDispatch Sh){
    }
            
    
}