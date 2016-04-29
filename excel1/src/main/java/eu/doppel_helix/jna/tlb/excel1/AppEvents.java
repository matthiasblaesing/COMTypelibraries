
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00024413-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{00024413-0000-0000-C000-000000000046}")
public interface AppEvents {
    /**
     * <p>id(0x61d)</p>
     */
    @ComMethod(name = "NewWorkbook", dispId = 0x61d)
    void NewWorkbook(Workbook Wb);
            
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
     * <p>id(0x61f)</p>
     */
    @ComMethod(name = "WorkbookOpen", dispId = 0x61f)
    void WorkbookOpen(Workbook Wb);
            
    /**
     * <p>id(0x620)</p>
     */
    @ComMethod(name = "WorkbookActivate", dispId = 0x620)
    void WorkbookActivate(Workbook Wb);
            
    /**
     * <p>id(0x621)</p>
     */
    @ComMethod(name = "WorkbookDeactivate", dispId = 0x621)
    void WorkbookDeactivate(Workbook Wb);
            
    /**
     * <p>id(0x622)</p>
     */
    @ComMethod(name = "WorkbookBeforeClose", dispId = 0x622)
    void WorkbookBeforeClose(Workbook Wb,
            VARIANT Cancel);
            
    /**
     * <p>id(0x623)</p>
     */
    @ComMethod(name = "WorkbookBeforeSave", dispId = 0x623)
    void WorkbookBeforeSave(Workbook Wb,
            Boolean SaveAsUI,
            VARIANT Cancel);
            
    /**
     * <p>id(0x624)</p>
     */
    @ComMethod(name = "WorkbookBeforePrint", dispId = 0x624)
    void WorkbookBeforePrint(Workbook Wb,
            VARIANT Cancel);
            
    /**
     * <p>id(0x625)</p>
     */
    @ComMethod(name = "WorkbookNewSheet", dispId = 0x625)
    void WorkbookNewSheet(Workbook Wb,
            com.sun.jna.platform.win32.COM.util.IDispatch Sh);
            
    /**
     * <p>id(0x626)</p>
     */
    @ComMethod(name = "WorkbookAddinInstall", dispId = 0x626)
    void WorkbookAddinInstall(Workbook Wb);
            
    /**
     * <p>id(0x627)</p>
     */
    @ComMethod(name = "WorkbookAddinUninstall", dispId = 0x627)
    void WorkbookAddinUninstall(Workbook Wb);
            
    /**
     * <p>id(0x612)</p>
     */
    @ComMethod(name = "WindowResize", dispId = 0x612)
    void WindowResize(Workbook Wb,
            Window Wn);
            
    /**
     * <p>id(0x614)</p>
     */
    @ComMethod(name = "WindowActivate", dispId = 0x614)
    void WindowActivate(Workbook Wb,
            Window Wn);
            
    /**
     * <p>id(0x615)</p>
     */
    @ComMethod(name = "WindowDeactivate", dispId = 0x615)
    void WindowDeactivate(Workbook Wb,
            Window Wn);
            
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
     * <p>id(0x870)</p>
     */
    @ComMethod(name = "WorkbookPivotTableCloseConnection", dispId = 0x870)
    void WorkbookPivotTableCloseConnection(Workbook Wb,
            PivotTable Target);
            
    /**
     * <p>id(0x871)</p>
     */
    @ComMethod(name = "WorkbookPivotTableOpenConnection", dispId = 0x871)
    void WorkbookPivotTableOpenConnection(Workbook Wb,
            PivotTable Target);
            
    /**
     * <p>id(0x8f1)</p>
     */
    @ComMethod(name = "WorkbookSync", dispId = 0x8f1)
    void WorkbookSync(Workbook Wb,
            eu.doppel_helix.jna.tlb.office2.MsoSyncEventType SyncEventType);
            
    /**
     * <p>id(0x8f2)</p>
     */
    @ComMethod(name = "WorkbookBeforeXmlImport", dispId = 0x8f2)
    void WorkbookBeforeXmlImport(Workbook Wb,
            XmlMap Map,
            String Url,
            Boolean IsRefresh,
            VARIANT Cancel);
            
    /**
     * <p>id(0x8f3)</p>
     */
    @ComMethod(name = "WorkbookAfterXmlImport", dispId = 0x8f3)
    void WorkbookAfterXmlImport(Workbook Wb,
            XmlMap Map,
            Boolean IsRefresh,
            XlXmlImportResult Result);
            
    /**
     * <p>id(0x8f4)</p>
     */
    @ComMethod(name = "WorkbookBeforeXmlExport", dispId = 0x8f4)
    void WorkbookBeforeXmlExport(Workbook Wb,
            XmlMap Map,
            String Url,
            VARIANT Cancel);
            
    /**
     * <p>id(0x8f5)</p>
     */
    @ComMethod(name = "WorkbookAfterXmlExport", dispId = 0x8f5)
    void WorkbookAfterXmlExport(Workbook Wb,
            XmlMap Map,
            String Url,
            XlXmlExportResult Result);
            
    /**
     * <p>id(0xa33)</p>
     */
    @ComMethod(name = "WorkbookRowsetComplete", dispId = 0xa33)
    void WorkbookRowsetComplete(Workbook Wb,
            String Description,
            String Sheet,
            Boolean Success);
            
    /**
     * <p>id(0xa34)</p>
     */
    @ComMethod(name = "AfterCalculate", dispId = 0xa34)
    void AfterCalculate();
            
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
     * <p>id(0xb57)</p>
     */
    @ComMethod(name = "ProtectedViewWindowOpen", dispId = 0xb57)
    void ProtectedViewWindowOpen(ProtectedViewWindow Pvw);
            
    /**
     * <p>id(0xb59)</p>
     */
    @ComMethod(name = "ProtectedViewWindowBeforeEdit", dispId = 0xb59)
    void ProtectedViewWindowBeforeEdit(ProtectedViewWindow Pvw,
            VARIANT Cancel);
            
    /**
     * <p>id(0xb5a)</p>
     */
    @ComMethod(name = "ProtectedViewWindowBeforeClose", dispId = 0xb5a)
    void ProtectedViewWindowBeforeClose(ProtectedViewWindow Pvw,
            XlProtectedViewCloseReason Reason,
            VARIANT Cancel);
            
    /**
     * <p>id(0xb5c)</p>
     */
    @ComMethod(name = "ProtectedViewWindowResize", dispId = 0xb5c)
    void ProtectedViewWindowResize(ProtectedViewWindow Pvw);
            
    /**
     * <p>id(0xb5d)</p>
     */
    @ComMethod(name = "ProtectedViewWindowActivate", dispId = 0xb5d)
    void ProtectedViewWindowActivate(ProtectedViewWindow Pvw);
            
    /**
     * <p>id(0xb5e)</p>
     */
    @ComMethod(name = "ProtectedViewWindowDeactivate", dispId = 0xb5e)
    void ProtectedViewWindowDeactivate(ProtectedViewWindow Pvw);
            
    /**
     * <p>id(0xb5f)</p>
     */
    @ComMethod(name = "WorkbookAfterSave", dispId = 0xb5f)
    void WorkbookAfterSave(Workbook Wb,
            Boolean Success);
            
    /**
     * <p>id(0xb60)</p>
     */
    @ComMethod(name = "WorkbookNewChart", dispId = 0xb60)
    void WorkbookNewChart(Workbook Wb,
            Chart Ch);
            
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
     * <p>id(0xc08)</p>
     */
    @ComMethod(name = "WorkbookModelChange", dispId = 0xc08)
    void WorkbookModelChange(Workbook Wb,
            ModelChanges Changes);
            
    /**
     * <p>id(0xc07)</p>
     */
    @ComMethod(name = "SheetBeforeDelete", dispId = 0xc07)
    void SheetBeforeDelete(com.sun.jna.platform.win32.COM.util.IDispatch Sh);
            
    
}