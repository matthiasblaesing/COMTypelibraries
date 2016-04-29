
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComEventCallback;
import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00024412-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{00024412-0000-0000-C000-000000000046}")
public interface WorkbookEventsListener {
    /**
     * <p>id(0x783)</p>
     */
    @ComEventCallback(dispid = 0x783)
    void Open();
            
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
     * <p>id(0x60a)</p>
     */
    @ComEventCallback(dispid = 0x60a)
    void BeforeClose(VARIANT Cancel);
            
    /**
     * <p>id(0x60b)</p>
     */
    @ComEventCallback(dispid = 0x60b)
    void BeforeSave(Boolean SaveAsUI,
            VARIANT Cancel);
            
    /**
     * <p>id(0x60d)</p>
     */
    @ComEventCallback(dispid = 0x60d)
    void BeforePrint(VARIANT Cancel);
            
    /**
     * <p>id(0x60e)</p>
     */
    @ComEventCallback(dispid = 0x60e)
    void NewSheet(com.sun.jna.platform.win32.COM.util.IDispatch Sh);
            
    /**
     * <p>id(0x610)</p>
     */
    @ComEventCallback(dispid = 0x610)
    void AddinInstall();
            
    /**
     * <p>id(0x611)</p>
     */
    @ComEventCallback(dispid = 0x611)
    void AddinUninstall();
            
    /**
     * <p>id(0x612)</p>
     */
    @ComEventCallback(dispid = 0x612)
    void WindowResize(Window Wn);
            
    /**
     * <p>id(0x614)</p>
     */
    @ComEventCallback(dispid = 0x614)
    void WindowActivate(Window Wn);
            
    /**
     * <p>id(0x615)</p>
     */
    @ComEventCallback(dispid = 0x615)
    void WindowDeactivate(Window Wn);
            
    /**
     * <p>id(0x616)</p>
     */
    @ComEventCallback(dispid = 0x616)
    void SheetSelectionChange(com.sun.jna.platform.win32.COM.util.IDispatch Sh,
            Range Target);
            
    /**
     * <p>id(0x617)</p>
     */
    @ComEventCallback(dispid = 0x617)
    void SheetBeforeDoubleClick(com.sun.jna.platform.win32.COM.util.IDispatch Sh,
            Range Target,
            VARIANT Cancel);
            
    /**
     * <p>id(0x618)</p>
     */
    @ComEventCallback(dispid = 0x618)
    void SheetBeforeRightClick(com.sun.jna.platform.win32.COM.util.IDispatch Sh,
            Range Target,
            VARIANT Cancel);
            
    /**
     * <p>id(0x619)</p>
     */
    @ComEventCallback(dispid = 0x619)
    void SheetActivate(com.sun.jna.platform.win32.COM.util.IDispatch Sh);
            
    /**
     * <p>id(0x61a)</p>
     */
    @ComEventCallback(dispid = 0x61a)
    void SheetDeactivate(com.sun.jna.platform.win32.COM.util.IDispatch Sh);
            
    /**
     * <p>id(0x61b)</p>
     */
    @ComEventCallback(dispid = 0x61b)
    void SheetCalculate(com.sun.jna.platform.win32.COM.util.IDispatch Sh);
            
    /**
     * <p>id(0x61c)</p>
     */
    @ComEventCallback(dispid = 0x61c)
    void SheetChange(com.sun.jna.platform.win32.COM.util.IDispatch Sh,
            Range Target);
            
    /**
     * <p>id(0x73e)</p>
     */
    @ComEventCallback(dispid = 0x73e)
    void SheetFollowHyperlink(com.sun.jna.platform.win32.COM.util.IDispatch Sh,
            Hyperlink Target);
            
    /**
     * <p>id(0x86d)</p>
     */
    @ComEventCallback(dispid = 0x86d)
    void SheetPivotTableUpdate(com.sun.jna.platform.win32.COM.util.IDispatch Sh,
            PivotTable Target);
            
    /**
     * <p>id(0x86e)</p>
     */
    @ComEventCallback(dispid = 0x86e)
    void PivotTableCloseConnection(PivotTable Target);
            
    /**
     * <p>id(0x86f)</p>
     */
    @ComEventCallback(dispid = 0x86f)
    void PivotTableOpenConnection(PivotTable Target);
            
    /**
     * <p>id(0x8da)</p>
     */
    @ComEventCallback(dispid = 0x8da)
    void Sync(eu.doppel_helix.jna.tlb.office2.MsoSyncEventType SyncEventType);
            
    /**
     * <p>id(0x8eb)</p>
     */
    @ComEventCallback(dispid = 0x8eb)
    void BeforeXmlImport(XmlMap Map,
            String Url,
            Boolean IsRefresh,
            VARIANT Cancel);
            
    /**
     * <p>id(0x8ed)</p>
     */
    @ComEventCallback(dispid = 0x8ed)
    void AfterXmlImport(XmlMap Map,
            Boolean IsRefresh,
            XlXmlImportResult Result);
            
    /**
     * <p>id(0x8ef)</p>
     */
    @ComEventCallback(dispid = 0x8ef)
    void BeforeXmlExport(XmlMap Map,
            String Url,
            VARIANT Cancel);
            
    /**
     * <p>id(0x8f0)</p>
     */
    @ComEventCallback(dispid = 0x8f0)
    void AfterXmlExport(XmlMap Map,
            String Url,
            XlXmlExportResult Result);
            
    /**
     * <p>id(0xa32)</p>
     */
    @ComEventCallback(dispid = 0xa32)
    void RowsetComplete(String Description,
            String Sheet,
            Boolean Success);
            
    /**
     * <p>id(0xb4f)</p>
     */
    @ComEventCallback(dispid = 0xb4f)
    void SheetPivotTableAfterValueChange(com.sun.jna.platform.win32.COM.util.IDispatch Sh,
            PivotTable TargetPivotTable,
            Range TargetRange);
            
    /**
     * <p>id(0xb50)</p>
     */
    @ComEventCallback(dispid = 0xb50)
    void SheetPivotTableBeforeAllocateChanges(com.sun.jna.platform.win32.COM.util.IDispatch Sh,
            PivotTable TargetPivotTable,
            Integer ValueChangeStart,
            Integer ValueChangeEnd,
            VARIANT Cancel);
            
    /**
     * <p>id(0xb51)</p>
     */
    @ComEventCallback(dispid = 0xb51)
    void SheetPivotTableBeforeCommitChanges(com.sun.jna.platform.win32.COM.util.IDispatch Sh,
            PivotTable TargetPivotTable,
            Integer ValueChangeStart,
            Integer ValueChangeEnd,
            VARIANT Cancel);
            
    /**
     * <p>id(0xb52)</p>
     */
    @ComEventCallback(dispid = 0xb52)
    void SheetPivotTableBeforeDiscardChanges(com.sun.jna.platform.win32.COM.util.IDispatch Sh,
            PivotTable TargetPivotTable,
            Integer ValueChangeStart,
            Integer ValueChangeEnd);
            
    /**
     * <p>id(0xb53)</p>
     */
    @ComEventCallback(dispid = 0xb53)
    void SheetPivotTableChangeSync(com.sun.jna.platform.win32.COM.util.IDispatch Sh,
            PivotTable Target);
            
    /**
     * <p>id(0xb54)</p>
     */
    @ComEventCallback(dispid = 0xb54)
    void AfterSave(Boolean Success);
            
    /**
     * <p>id(0xb55)</p>
     */
    @ComEventCallback(dispid = 0xb55)
    void NewChart(Chart Ch);
            
    /**
     * <p>id(0xc03)</p>
     */
    @ComEventCallback(dispid = 0xc03)
    void SheetLensGalleryRenderComplete(com.sun.jna.platform.win32.COM.util.IDispatch Sh);
            
    /**
     * <p>id(0xc04)</p>
     */
    @ComEventCallback(dispid = 0xc04)
    void SheetTableUpdate(com.sun.jna.platform.win32.COM.util.IDispatch Sh,
            TableObject Target);
            
    /**
     * <p>id(0xc05)</p>
     */
    @ComEventCallback(dispid = 0xc05)
    void ModelChange(ModelChanges Changes);
            
    /**
     * <p>id(0xc07)</p>
     */
    @ComEventCallback(dispid = 0xc07)
    void SheetBeforeDelete(com.sun.jna.platform.win32.COM.util.IDispatch Sh);
            
    
}