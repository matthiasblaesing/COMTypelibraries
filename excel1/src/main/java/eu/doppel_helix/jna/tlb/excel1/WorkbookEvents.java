
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00024412-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{00024412-0000-0000-C000-000000000046}")
public interface WorkbookEvents extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x783)</p>
     */
    @ComMethod(name = "Open", dispId = 0x783)
    void Open();
            
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
     * <p>id(0x60a)</p>
     */
    @ComMethod(name = "BeforeClose", dispId = 0x60a)
    void BeforeClose(VARIANT Cancel);
            
    /**
     * <p>id(0x60b)</p>
     */
    @ComMethod(name = "BeforeSave", dispId = 0x60b)
    void BeforeSave(Boolean SaveAsUI,
            VARIANT Cancel);
            
    /**
     * <p>id(0x60d)</p>
     */
    @ComMethod(name = "BeforePrint", dispId = 0x60d)
    void BeforePrint(VARIANT Cancel);
            
    /**
     * <p>id(0x60e)</p>
     */
    @ComMethod(name = "NewSheet", dispId = 0x60e)
    void NewSheet(com.sun.jna.platform.win32.COM.util.IDispatch Sh);
            
    /**
     * <p>id(0x610)</p>
     */
    @ComMethod(name = "AddinInstall", dispId = 0x610)
    void AddinInstall();
            
    /**
     * <p>id(0x611)</p>
     */
    @ComMethod(name = "AddinUninstall", dispId = 0x611)
    void AddinUninstall();
            
    /**
     * <p>id(0x612)</p>
     */
    @ComMethod(name = "WindowResize", dispId = 0x612)
    void WindowResize(Window Wn);
            
    /**
     * <p>id(0x614)</p>
     */
    @ComMethod(name = "WindowActivate", dispId = 0x614)
    void WindowActivate(Window Wn);
            
    /**
     * <p>id(0x615)</p>
     */
    @ComMethod(name = "WindowDeactivate", dispId = 0x615)
    void WindowDeactivate(Window Wn);
            
    /**
     * <p>id(0x616)</p>
     */
    @ComMethod(name = "SheetSelectionChange", dispId = 0x616)
    void SheetSelectionChange(com.sun.jna.platform.win32.COM.util.IDispatch Sh,
            Range Target);
            
    /**
     * <p>id(0x617)</p>
     */
    @ComMethod(name = "SheetBeforeDoubleClick", dispId = 0x617)
    void SheetBeforeDoubleClick(com.sun.jna.platform.win32.COM.util.IDispatch Sh,
            Range Target,
            VARIANT Cancel);
            
    /**
     * <p>id(0x618)</p>
     */
    @ComMethod(name = "SheetBeforeRightClick", dispId = 0x618)
    void SheetBeforeRightClick(com.sun.jna.platform.win32.COM.util.IDispatch Sh,
            Range Target,
            VARIANT Cancel);
            
    /**
     * <p>id(0x619)</p>
     */
    @ComMethod(name = "SheetActivate", dispId = 0x619)
    void SheetActivate(com.sun.jna.platform.win32.COM.util.IDispatch Sh);
            
    /**
     * <p>id(0x61a)</p>
     */
    @ComMethod(name = "SheetDeactivate", dispId = 0x61a)
    void SheetDeactivate(com.sun.jna.platform.win32.COM.util.IDispatch Sh);
            
    /**
     * <p>id(0x61b)</p>
     */
    @ComMethod(name = "SheetCalculate", dispId = 0x61b)
    void SheetCalculate(com.sun.jna.platform.win32.COM.util.IDispatch Sh);
            
    /**
     * <p>id(0x61c)</p>
     */
    @ComMethod(name = "SheetChange", dispId = 0x61c)
    void SheetChange(com.sun.jna.platform.win32.COM.util.IDispatch Sh,
            Range Target);
            
    /**
     * <p>id(0x73e)</p>
     */
    @ComMethod(name = "SheetFollowHyperlink", dispId = 0x73e)
    void SheetFollowHyperlink(com.sun.jna.platform.win32.COM.util.IDispatch Sh,
            Hyperlink Target);
            
    /**
     * <p>id(0x86d)</p>
     */
    @ComMethod(name = "SheetPivotTableUpdate", dispId = 0x86d)
    void SheetPivotTableUpdate(com.sun.jna.platform.win32.COM.util.IDispatch Sh,
            PivotTable Target);
            
    /**
     * <p>id(0x86e)</p>
     */
    @ComMethod(name = "PivotTableCloseConnection", dispId = 0x86e)
    void PivotTableCloseConnection(PivotTable Target);
            
    /**
     * <p>id(0x86f)</p>
     */
    @ComMethod(name = "PivotTableOpenConnection", dispId = 0x86f)
    void PivotTableOpenConnection(PivotTable Target);
            
    /**
     * <p>id(0x8da)</p>
     */
    @ComMethod(name = "Sync", dispId = 0x8da)
    void Sync(eu.doppel_helix.jna.tlb.office2.MsoSyncEventType SyncEventType);
            
    /**
     * <p>id(0x8eb)</p>
     */
    @ComMethod(name = "BeforeXmlImport", dispId = 0x8eb)
    void BeforeXmlImport(XmlMap Map,
            String Url,
            Boolean IsRefresh,
            VARIANT Cancel);
            
    /**
     * <p>id(0x8ed)</p>
     */
    @ComMethod(name = "AfterXmlImport", dispId = 0x8ed)
    void AfterXmlImport(XmlMap Map,
            Boolean IsRefresh,
            XlXmlImportResult Result);
            
    /**
     * <p>id(0x8ef)</p>
     */
    @ComMethod(name = "BeforeXmlExport", dispId = 0x8ef)
    void BeforeXmlExport(XmlMap Map,
            String Url,
            VARIANT Cancel);
            
    /**
     * <p>id(0x8f0)</p>
     */
    @ComMethod(name = "AfterXmlExport", dispId = 0x8f0)
    void AfterXmlExport(XmlMap Map,
            String Url,
            XlXmlExportResult Result);
            
    /**
     * <p>id(0xa32)</p>
     */
    @ComMethod(name = "RowsetComplete", dispId = 0xa32)
    void RowsetComplete(String Description,
            String Sheet,
            Boolean Success);
            
    /**
     * <p>id(0xb4f)</p>
     */
    @ComMethod(name = "SheetPivotTableAfterValueChange", dispId = 0xb4f)
    void SheetPivotTableAfterValueChange(com.sun.jna.platform.win32.COM.util.IDispatch Sh,
            PivotTable TargetPivotTable,
            Range TargetRange);
            
    /**
     * <p>id(0xb50)</p>
     */
    @ComMethod(name = "SheetPivotTableBeforeAllocateChanges", dispId = 0xb50)
    void SheetPivotTableBeforeAllocateChanges(com.sun.jna.platform.win32.COM.util.IDispatch Sh,
            PivotTable TargetPivotTable,
            Integer ValueChangeStart,
            Integer ValueChangeEnd,
            VARIANT Cancel);
            
    /**
     * <p>id(0xb51)</p>
     */
    @ComMethod(name = "SheetPivotTableBeforeCommitChanges", dispId = 0xb51)
    void SheetPivotTableBeforeCommitChanges(com.sun.jna.platform.win32.COM.util.IDispatch Sh,
            PivotTable TargetPivotTable,
            Integer ValueChangeStart,
            Integer ValueChangeEnd,
            VARIANT Cancel);
            
    /**
     * <p>id(0xb52)</p>
     */
    @ComMethod(name = "SheetPivotTableBeforeDiscardChanges", dispId = 0xb52)
    void SheetPivotTableBeforeDiscardChanges(com.sun.jna.platform.win32.COM.util.IDispatch Sh,
            PivotTable TargetPivotTable,
            Integer ValueChangeStart,
            Integer ValueChangeEnd);
            
    /**
     * <p>id(0xb53)</p>
     */
    @ComMethod(name = "SheetPivotTableChangeSync", dispId = 0xb53)
    void SheetPivotTableChangeSync(com.sun.jna.platform.win32.COM.util.IDispatch Sh,
            PivotTable Target);
            
    /**
     * <p>id(0xb54)</p>
     */
    @ComMethod(name = "AfterSave", dispId = 0xb54)
    void AfterSave(Boolean Success);
            
    /**
     * <p>id(0xb55)</p>
     */
    @ComMethod(name = "NewChart", dispId = 0xb55)
    void NewChart(Chart Ch);
            
    /**
     * <p>id(0xc03)</p>
     */
    @ComMethod(name = "SheetLensGalleryRenderComplete", dispId = 0xc03)
    void SheetLensGalleryRenderComplete(com.sun.jna.platform.win32.COM.util.IDispatch Sh);
            
    /**
     * <p>id(0xc04)</p>
     */
    @ComMethod(name = "SheetTableUpdate", dispId = 0xc04)
    void SheetTableUpdate(com.sun.jna.platform.win32.COM.util.IDispatch Sh,
            TableObject Target);
            
    /**
     * <p>id(0xc05)</p>
     */
    @ComMethod(name = "ModelChange", dispId = 0xc05)
    void ModelChange(ModelChanges Changes);
            
    /**
     * <p>id(0xc07)</p>
     */
    @ComMethod(name = "SheetBeforeDelete", dispId = 0xc07)
    void SheetBeforeDelete(com.sun.jna.platform.win32.COM.util.IDispatch Sh);
            
    
}