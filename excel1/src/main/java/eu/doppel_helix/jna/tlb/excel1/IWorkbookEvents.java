
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00024412-0001-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{00024412-0001-0000-C000-000000000046}")
public interface IWorkbookEvents {
    /**
     * <p>id(0x783)</p>
     */
    @ComMethod(name = "Open", dispId = 0x783)
    com.sun.jna.platform.win32.WinNT.HRESULT Open();
            
    /**
     * <p>id(0x130)</p>
     */
    @ComMethod(name = "Activate", dispId = 0x130)
    com.sun.jna.platform.win32.WinNT.HRESULT Activate();
            
    /**
     * <p>id(0x5fa)</p>
     */
    @ComMethod(name = "Deactivate", dispId = 0x5fa)
    com.sun.jna.platform.win32.WinNT.HRESULT Deactivate();
            
    /**
     * <p>id(0x60a)</p>
     */
    @ComMethod(name = "BeforeClose", dispId = 0x60a)
    com.sun.jna.platform.win32.WinNT.HRESULT BeforeClose(VARIANT Cancel);
            
    /**
     * <p>id(0x60b)</p>
     */
    @ComMethod(name = "BeforeSave", dispId = 0x60b)
    com.sun.jna.platform.win32.WinNT.HRESULT BeforeSave(Boolean SaveAsUI,
            VARIANT Cancel);
            
    /**
     * <p>id(0x60d)</p>
     */
    @ComMethod(name = "BeforePrint", dispId = 0x60d)
    com.sun.jna.platform.win32.WinNT.HRESULT BeforePrint(VARIANT Cancel);
            
    /**
     * <p>id(0x60e)</p>
     */
    @ComMethod(name = "NewSheet", dispId = 0x60e)
    com.sun.jna.platform.win32.WinNT.HRESULT NewSheet(com.sun.jna.platform.win32.COM.util.IDispatch Sh);
            
    /**
     * <p>id(0x610)</p>
     */
    @ComMethod(name = "AddinInstall", dispId = 0x610)
    com.sun.jna.platform.win32.WinNT.HRESULT AddinInstall();
            
    /**
     * <p>id(0x611)</p>
     */
    @ComMethod(name = "AddinUninstall", dispId = 0x611)
    com.sun.jna.platform.win32.WinNT.HRESULT AddinUninstall();
            
    /**
     * <p>id(0x612)</p>
     */
    @ComMethod(name = "WindowResize", dispId = 0x612)
    com.sun.jna.platform.win32.WinNT.HRESULT WindowResize(Window Wn);
            
    /**
     * <p>id(0x614)</p>
     */
    @ComMethod(name = "WindowActivate", dispId = 0x614)
    com.sun.jna.platform.win32.WinNT.HRESULT WindowActivate(Window Wn);
            
    /**
     * <p>id(0x615)</p>
     */
    @ComMethod(name = "WindowDeactivate", dispId = 0x615)
    com.sun.jna.platform.win32.WinNT.HRESULT WindowDeactivate(Window Wn);
            
    /**
     * <p>id(0x616)</p>
     */
    @ComMethod(name = "SheetSelectionChange", dispId = 0x616)
    com.sun.jna.platform.win32.WinNT.HRESULT SheetSelectionChange(com.sun.jna.platform.win32.COM.util.IDispatch Sh,
            Range Target);
            
    /**
     * <p>id(0x617)</p>
     */
    @ComMethod(name = "SheetBeforeDoubleClick", dispId = 0x617)
    com.sun.jna.platform.win32.WinNT.HRESULT SheetBeforeDoubleClick(com.sun.jna.platform.win32.COM.util.IDispatch Sh,
            Range Target,
            VARIANT Cancel);
            
    /**
     * <p>id(0x618)</p>
     */
    @ComMethod(name = "SheetBeforeRightClick", dispId = 0x618)
    com.sun.jna.platform.win32.WinNT.HRESULT SheetBeforeRightClick(com.sun.jna.platform.win32.COM.util.IDispatch Sh,
            Range Target,
            VARIANT Cancel);
            
    /**
     * <p>id(0x619)</p>
     */
    @ComMethod(name = "SheetActivate", dispId = 0x619)
    com.sun.jna.platform.win32.WinNT.HRESULT SheetActivate(com.sun.jna.platform.win32.COM.util.IDispatch Sh);
            
    /**
     * <p>id(0x61a)</p>
     */
    @ComMethod(name = "SheetDeactivate", dispId = 0x61a)
    com.sun.jna.platform.win32.WinNT.HRESULT SheetDeactivate(com.sun.jna.platform.win32.COM.util.IDispatch Sh);
            
    /**
     * <p>id(0x61b)</p>
     */
    @ComMethod(name = "SheetCalculate", dispId = 0x61b)
    com.sun.jna.platform.win32.WinNT.HRESULT SheetCalculate(com.sun.jna.platform.win32.COM.util.IDispatch Sh);
            
    /**
     * <p>id(0x61c)</p>
     */
    @ComMethod(name = "SheetChange", dispId = 0x61c)
    com.sun.jna.platform.win32.WinNT.HRESULT SheetChange(com.sun.jna.platform.win32.COM.util.IDispatch Sh,
            Range Target);
            
    /**
     * <p>id(0x73e)</p>
     */
    @ComMethod(name = "SheetFollowHyperlink", dispId = 0x73e)
    com.sun.jna.platform.win32.WinNT.HRESULT SheetFollowHyperlink(com.sun.jna.platform.win32.COM.util.IDispatch Sh,
            Hyperlink Target);
            
    /**
     * <p>id(0x86d)</p>
     */
    @ComMethod(name = "SheetPivotTableUpdate", dispId = 0x86d)
    com.sun.jna.platform.win32.WinNT.HRESULT SheetPivotTableUpdate(com.sun.jna.platform.win32.COM.util.IDispatch Sh,
            PivotTable Target);
            
    /**
     * <p>id(0x86e)</p>
     */
    @ComMethod(name = "PivotTableCloseConnection", dispId = 0x86e)
    com.sun.jna.platform.win32.WinNT.HRESULT PivotTableCloseConnection(PivotTable Target);
            
    /**
     * <p>id(0x86f)</p>
     */
    @ComMethod(name = "PivotTableOpenConnection", dispId = 0x86f)
    com.sun.jna.platform.win32.WinNT.HRESULT PivotTableOpenConnection(PivotTable Target);
            
    /**
     * <p>id(0x8da)</p>
     */
    @ComMethod(name = "Sync", dispId = 0x8da)
    com.sun.jna.platform.win32.WinNT.HRESULT Sync(eu.doppel_helix.jna.tlb.office2.MsoSyncEventType SyncEventType);
            
    /**
     * <p>id(0x8eb)</p>
     */
    @ComMethod(name = "BeforeXmlImport", dispId = 0x8eb)
    com.sun.jna.platform.win32.WinNT.HRESULT BeforeXmlImport(XmlMap Map,
            String Url,
            Boolean IsRefresh,
            VARIANT Cancel);
            
    /**
     * <p>id(0x8ed)</p>
     */
    @ComMethod(name = "AfterXmlImport", dispId = 0x8ed)
    com.sun.jna.platform.win32.WinNT.HRESULT AfterXmlImport(XmlMap Map,
            Boolean IsRefresh,
            XlXmlImportResult Result);
            
    /**
     * <p>id(0x8ef)</p>
     */
    @ComMethod(name = "BeforeXmlExport", dispId = 0x8ef)
    com.sun.jna.platform.win32.WinNT.HRESULT BeforeXmlExport(XmlMap Map,
            String Url,
            VARIANT Cancel);
            
    /**
     * <p>id(0x8f0)</p>
     */
    @ComMethod(name = "AfterXmlExport", dispId = 0x8f0)
    com.sun.jna.platform.win32.WinNT.HRESULT AfterXmlExport(XmlMap Map,
            String Url,
            XlXmlExportResult Result);
            
    /**
     * <p>id(0xa32)</p>
     */
    @ComMethod(name = "RowsetComplete", dispId = 0xa32)
    com.sun.jna.platform.win32.WinNT.HRESULT RowsetComplete(String Description,
            String Sheet,
            Boolean Success);
            
    /**
     * <p>id(0xb4f)</p>
     */
    @ComMethod(name = "SheetPivotTableAfterValueChange", dispId = 0xb4f)
    com.sun.jna.platform.win32.WinNT.HRESULT SheetPivotTableAfterValueChange(com.sun.jna.platform.win32.COM.util.IDispatch Sh,
            PivotTable TargetPivotTable,
            Range TargetRange);
            
    /**
     * <p>id(0xb50)</p>
     */
    @ComMethod(name = "SheetPivotTableBeforeAllocateChanges", dispId = 0xb50)
    com.sun.jna.platform.win32.WinNT.HRESULT SheetPivotTableBeforeAllocateChanges(com.sun.jna.platform.win32.COM.util.IDispatch Sh,
            PivotTable TargetPivotTable,
            Integer ValueChangeStart,
            Integer ValueChangeEnd,
            VARIANT Cancel);
            
    /**
     * <p>id(0xb51)</p>
     */
    @ComMethod(name = "SheetPivotTableBeforeCommitChanges", dispId = 0xb51)
    com.sun.jna.platform.win32.WinNT.HRESULT SheetPivotTableBeforeCommitChanges(com.sun.jna.platform.win32.COM.util.IDispatch Sh,
            PivotTable TargetPivotTable,
            Integer ValueChangeStart,
            Integer ValueChangeEnd,
            VARIANT Cancel);
            
    /**
     * <p>id(0xb52)</p>
     */
    @ComMethod(name = "SheetPivotTableBeforeDiscardChanges", dispId = 0xb52)
    com.sun.jna.platform.win32.WinNT.HRESULT SheetPivotTableBeforeDiscardChanges(com.sun.jna.platform.win32.COM.util.IDispatch Sh,
            PivotTable TargetPivotTable,
            Integer ValueChangeStart,
            Integer ValueChangeEnd);
            
    /**
     * <p>id(0xb53)</p>
     */
    @ComMethod(name = "SheetPivotTableChangeSync", dispId = 0xb53)
    com.sun.jna.platform.win32.WinNT.HRESULT SheetPivotTableChangeSync(com.sun.jna.platform.win32.COM.util.IDispatch Sh,
            PivotTable Target);
            
    /**
     * <p>id(0xb54)</p>
     */
    @ComMethod(name = "AfterSave", dispId = 0xb54)
    com.sun.jna.platform.win32.WinNT.HRESULT AfterSave(Boolean Success);
            
    /**
     * <p>id(0xb55)</p>
     */
    @ComMethod(name = "NewChart", dispId = 0xb55)
    com.sun.jna.platform.win32.WinNT.HRESULT NewChart(Chart Ch);
            
    /**
     * <p>id(0xc03)</p>
     */
    @ComMethod(name = "SheetLensGalleryRenderComplete", dispId = 0xc03)
    com.sun.jna.platform.win32.WinNT.HRESULT SheetLensGalleryRenderComplete(com.sun.jna.platform.win32.COM.util.IDispatch Sh);
            
    /**
     * <p>id(0xc04)</p>
     */
    @ComMethod(name = "SheetTableUpdate", dispId = 0xc04)
    com.sun.jna.platform.win32.WinNT.HRESULT SheetTableUpdate(com.sun.jna.platform.win32.COM.util.IDispatch Sh,
            TableObject Target);
            
    /**
     * <p>id(0xc05)</p>
     */
    @ComMethod(name = "ModelChange", dispId = 0xc05)
    com.sun.jna.platform.win32.WinNT.HRESULT ModelChange(ModelChanges Changes);
            
    /**
     * <p>id(0xc07)</p>
     */
    @ComMethod(name = "SheetBeforeDelete", dispId = 0xc07)
    com.sun.jna.platform.win32.WinNT.HRESULT SheetBeforeDelete(com.sun.jna.platform.win32.COM.util.IDispatch Sh);
            
    
}