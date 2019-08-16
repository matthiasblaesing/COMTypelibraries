
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00024413-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{00024413-0000-0000-C000-000000000046}")
public interface AppEvents extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x61d)</p>
     * <p>vtableId(7)</p>
     * @param Wb [in] {@code Workbook}
     */
    @ComMethod(name = "NewWorkbook", dispId = 0x61d)
    void NewWorkbook(Workbook Wb);
            
    /**
     * <p>id(0x616)</p>
     * <p>vtableId(8)</p>
     * @param Sh [in] {@code com.sun.jna.platform.win32.COM.util.IDispatch}
     * @param Target [in] {@code Range}
     */
    @ComMethod(name = "SheetSelectionChange", dispId = 0x616)
    void SheetSelectionChange(com.sun.jna.platform.win32.COM.util.IDispatch Sh,
            Range Target);
            
    /**
     * <p>id(0x617)</p>
     * <p>vtableId(9)</p>
     * @param Sh [in] {@code com.sun.jna.platform.win32.COM.util.IDispatch}
     * @param Target [in] {@code Range}
     * @param Cancel [inout] {@code Boolean}
     */
    @ComMethod(name = "SheetBeforeDoubleClick", dispId = 0x617)
    void SheetBeforeDoubleClick(com.sun.jna.platform.win32.COM.util.IDispatch Sh,
            Range Target,
            VARIANT Cancel);
            
    /**
     * <p>id(0x618)</p>
     * <p>vtableId(10)</p>
     * @param Sh [in] {@code com.sun.jna.platform.win32.COM.util.IDispatch}
     * @param Target [in] {@code Range}
     * @param Cancel [inout] {@code Boolean}
     */
    @ComMethod(name = "SheetBeforeRightClick", dispId = 0x618)
    void SheetBeforeRightClick(com.sun.jna.platform.win32.COM.util.IDispatch Sh,
            Range Target,
            VARIANT Cancel);
            
    /**
     * <p>id(0x619)</p>
     * <p>vtableId(11)</p>
     * @param Sh [in] {@code com.sun.jna.platform.win32.COM.util.IDispatch}
     */
    @ComMethod(name = "SheetActivate", dispId = 0x619)
    void SheetActivate(com.sun.jna.platform.win32.COM.util.IDispatch Sh);
            
    /**
     * <p>id(0x61a)</p>
     * <p>vtableId(12)</p>
     * @param Sh [in] {@code com.sun.jna.platform.win32.COM.util.IDispatch}
     */
    @ComMethod(name = "SheetDeactivate", dispId = 0x61a)
    void SheetDeactivate(com.sun.jna.platform.win32.COM.util.IDispatch Sh);
            
    /**
     * <p>id(0x61b)</p>
     * <p>vtableId(13)</p>
     * @param Sh [in] {@code com.sun.jna.platform.win32.COM.util.IDispatch}
     */
    @ComMethod(name = "SheetCalculate", dispId = 0x61b)
    void SheetCalculate(com.sun.jna.platform.win32.COM.util.IDispatch Sh);
            
    /**
     * <p>id(0x61c)</p>
     * <p>vtableId(14)</p>
     * @param Sh [in] {@code com.sun.jna.platform.win32.COM.util.IDispatch}
     * @param Target [in] {@code Range}
     */
    @ComMethod(name = "SheetChange", dispId = 0x61c)
    void SheetChange(com.sun.jna.platform.win32.COM.util.IDispatch Sh,
            Range Target);
            
    /**
     * <p>id(0x61f)</p>
     * <p>vtableId(15)</p>
     * @param Wb [in] {@code Workbook}
     */
    @ComMethod(name = "WorkbookOpen", dispId = 0x61f)
    void WorkbookOpen(Workbook Wb);
            
    /**
     * <p>id(0x620)</p>
     * <p>vtableId(16)</p>
     * @param Wb [in] {@code Workbook}
     */
    @ComMethod(name = "WorkbookActivate", dispId = 0x620)
    void WorkbookActivate(Workbook Wb);
            
    /**
     * <p>id(0x621)</p>
     * <p>vtableId(17)</p>
     * @param Wb [in] {@code Workbook}
     */
    @ComMethod(name = "WorkbookDeactivate", dispId = 0x621)
    void WorkbookDeactivate(Workbook Wb);
            
    /**
     * <p>id(0x622)</p>
     * <p>vtableId(18)</p>
     * @param Wb [in] {@code Workbook}
     * @param Cancel [inout] {@code Boolean}
     */
    @ComMethod(name = "WorkbookBeforeClose", dispId = 0x622)
    void WorkbookBeforeClose(Workbook Wb,
            VARIANT Cancel);
            
    /**
     * <p>id(0x623)</p>
     * <p>vtableId(19)</p>
     * @param Wb [in] {@code Workbook}
     * @param SaveAsUI [in] {@code Boolean}
     * @param Cancel [inout] {@code Boolean}
     */
    @ComMethod(name = "WorkbookBeforeSave", dispId = 0x623)
    void WorkbookBeforeSave(Workbook Wb,
            Boolean SaveAsUI,
            VARIANT Cancel);
            
    /**
     * <p>id(0x624)</p>
     * <p>vtableId(20)</p>
     * @param Wb [in] {@code Workbook}
     * @param Cancel [inout] {@code Boolean}
     */
    @ComMethod(name = "WorkbookBeforePrint", dispId = 0x624)
    void WorkbookBeforePrint(Workbook Wb,
            VARIANT Cancel);
            
    /**
     * <p>id(0x625)</p>
     * <p>vtableId(21)</p>
     * @param Wb [in] {@code Workbook}
     * @param Sh [in] {@code com.sun.jna.platform.win32.COM.util.IDispatch}
     */
    @ComMethod(name = "WorkbookNewSheet", dispId = 0x625)
    void WorkbookNewSheet(Workbook Wb,
            com.sun.jna.platform.win32.COM.util.IDispatch Sh);
            
    /**
     * <p>id(0x626)</p>
     * <p>vtableId(22)</p>
     * @param Wb [in] {@code Workbook}
     */
    @ComMethod(name = "WorkbookAddinInstall", dispId = 0x626)
    void WorkbookAddinInstall(Workbook Wb);
            
    /**
     * <p>id(0x627)</p>
     * <p>vtableId(23)</p>
     * @param Wb [in] {@code Workbook}
     */
    @ComMethod(name = "WorkbookAddinUninstall", dispId = 0x627)
    void WorkbookAddinUninstall(Workbook Wb);
            
    /**
     * <p>id(0x612)</p>
     * <p>vtableId(24)</p>
     * @param Wb [in] {@code Workbook}
     * @param Wn [in] {@code Window}
     */
    @ComMethod(name = "WindowResize", dispId = 0x612)
    void WindowResize(Workbook Wb,
            Window Wn);
            
    /**
     * <p>id(0x614)</p>
     * <p>vtableId(25)</p>
     * @param Wb [in] {@code Workbook}
     * @param Wn [in] {@code Window}
     */
    @ComMethod(name = "WindowActivate", dispId = 0x614)
    void WindowActivate(Workbook Wb,
            Window Wn);
            
    /**
     * <p>id(0x615)</p>
     * <p>vtableId(26)</p>
     * @param Wb [in] {@code Workbook}
     * @param Wn [in] {@code Window}
     */
    @ComMethod(name = "WindowDeactivate", dispId = 0x615)
    void WindowDeactivate(Workbook Wb,
            Window Wn);
            
    /**
     * <p>id(0x73e)</p>
     * <p>vtableId(27)</p>
     * @param Sh [in] {@code com.sun.jna.platform.win32.COM.util.IDispatch}
     * @param Target [in] {@code Hyperlink}
     */
    @ComMethod(name = "SheetFollowHyperlink", dispId = 0x73e)
    void SheetFollowHyperlink(com.sun.jna.platform.win32.COM.util.IDispatch Sh,
            Hyperlink Target);
            
    /**
     * <p>id(0x86d)</p>
     * <p>vtableId(28)</p>
     * @param Sh [in] {@code com.sun.jna.platform.win32.COM.util.IDispatch}
     * @param Target [in] {@code PivotTable}
     */
    @ComMethod(name = "SheetPivotTableUpdate", dispId = 0x86d)
    void SheetPivotTableUpdate(com.sun.jna.platform.win32.COM.util.IDispatch Sh,
            PivotTable Target);
            
    /**
     * <p>id(0x870)</p>
     * <p>vtableId(29)</p>
     * @param Wb [in] {@code Workbook}
     * @param Target [in] {@code PivotTable}
     */
    @ComMethod(name = "WorkbookPivotTableCloseConnection", dispId = 0x870)
    void WorkbookPivotTableCloseConnection(Workbook Wb,
            PivotTable Target);
            
    /**
     * <p>id(0x871)</p>
     * <p>vtableId(30)</p>
     * @param Wb [in] {@code Workbook}
     * @param Target [in] {@code PivotTable}
     */
    @ComMethod(name = "WorkbookPivotTableOpenConnection", dispId = 0x871)
    void WorkbookPivotTableOpenConnection(Workbook Wb,
            PivotTable Target);
            
    /**
     * <p>id(0x8f1)</p>
     * <p>vtableId(31)</p>
     * @param Wb [in] {@code Workbook}
     * @param SyncEventType [in] {@code eu.doppel_helix.jna.tlb.office2.MsoSyncEventType}
     */
    @ComMethod(name = "WorkbookSync", dispId = 0x8f1)
    void WorkbookSync(Workbook Wb,
            eu.doppel_helix.jna.tlb.office2.MsoSyncEventType SyncEventType);
            
    /**
     * <p>id(0x8f2)</p>
     * <p>vtableId(32)</p>
     * @param Wb [in] {@code Workbook}
     * @param Map [in] {@code XmlMap}
     * @param Url [in] {@code String}
     * @param IsRefresh [in] {@code Boolean}
     * @param Cancel [inout] {@code Boolean}
     */
    @ComMethod(name = "WorkbookBeforeXmlImport", dispId = 0x8f2)
    void WorkbookBeforeXmlImport(Workbook Wb,
            XmlMap Map,
            String Url,
            Boolean IsRefresh,
            VARIANT Cancel);
            
    /**
     * <p>id(0x8f3)</p>
     * <p>vtableId(33)</p>
     * @param Wb [in] {@code Workbook}
     * @param Map [in] {@code XmlMap}
     * @param IsRefresh [in] {@code Boolean}
     * @param Result [in] {@code XlXmlImportResult}
     */
    @ComMethod(name = "WorkbookAfterXmlImport", dispId = 0x8f3)
    void WorkbookAfterXmlImport(Workbook Wb,
            XmlMap Map,
            Boolean IsRefresh,
            XlXmlImportResult Result);
            
    /**
     * <p>id(0x8f4)</p>
     * <p>vtableId(34)</p>
     * @param Wb [in] {@code Workbook}
     * @param Map [in] {@code XmlMap}
     * @param Url [in] {@code String}
     * @param Cancel [inout] {@code Boolean}
     */
    @ComMethod(name = "WorkbookBeforeXmlExport", dispId = 0x8f4)
    void WorkbookBeforeXmlExport(Workbook Wb,
            XmlMap Map,
            String Url,
            VARIANT Cancel);
            
    /**
     * <p>id(0x8f5)</p>
     * <p>vtableId(35)</p>
     * @param Wb [in] {@code Workbook}
     * @param Map [in] {@code XmlMap}
     * @param Url [in] {@code String}
     * @param Result [in] {@code XlXmlExportResult}
     */
    @ComMethod(name = "WorkbookAfterXmlExport", dispId = 0x8f5)
    void WorkbookAfterXmlExport(Workbook Wb,
            XmlMap Map,
            String Url,
            XlXmlExportResult Result);
            
    /**
     * <p>id(0xa33)</p>
     * <p>vtableId(36)</p>
     * @param Wb [in] {@code Workbook}
     * @param Description [in] {@code String}
     * @param Sheet [in] {@code String}
     * @param Success [in] {@code Boolean}
     */
    @ComMethod(name = "WorkbookRowsetComplete", dispId = 0xa33)
    void WorkbookRowsetComplete(Workbook Wb,
            String Description,
            String Sheet,
            Boolean Success);
            
    /**
     * <p>id(0xa34)</p>
     * <p>vtableId(37)</p>
     */
    @ComMethod(name = "AfterCalculate", dispId = 0xa34)
    void AfterCalculate();
            
    /**
     * <p>id(0xb4f)</p>
     * <p>vtableId(38)</p>
     * @param Sh [in] {@code com.sun.jna.platform.win32.COM.util.IDispatch}
     * @param TargetPivotTable [in] {@code PivotTable}
     * @param TargetRange [in] {@code Range}
     */
    @ComMethod(name = "SheetPivotTableAfterValueChange", dispId = 0xb4f)
    void SheetPivotTableAfterValueChange(com.sun.jna.platform.win32.COM.util.IDispatch Sh,
            PivotTable TargetPivotTable,
            Range TargetRange);
            
    /**
     * <p>id(0xb50)</p>
     * <p>vtableId(39)</p>
     * @param Sh [in] {@code com.sun.jna.platform.win32.COM.util.IDispatch}
     * @param TargetPivotTable [in] {@code PivotTable}
     * @param ValueChangeStart [in] {@code Integer}
     * @param ValueChangeEnd [in] {@code Integer}
     * @param Cancel [inout] {@code Boolean}
     */
    @ComMethod(name = "SheetPivotTableBeforeAllocateChanges", dispId = 0xb50)
    void SheetPivotTableBeforeAllocateChanges(com.sun.jna.platform.win32.COM.util.IDispatch Sh,
            PivotTable TargetPivotTable,
            Integer ValueChangeStart,
            Integer ValueChangeEnd,
            VARIANT Cancel);
            
    /**
     * <p>id(0xb51)</p>
     * <p>vtableId(40)</p>
     * @param Sh [in] {@code com.sun.jna.platform.win32.COM.util.IDispatch}
     * @param TargetPivotTable [in] {@code PivotTable}
     * @param ValueChangeStart [in] {@code Integer}
     * @param ValueChangeEnd [in] {@code Integer}
     * @param Cancel [inout] {@code Boolean}
     */
    @ComMethod(name = "SheetPivotTableBeforeCommitChanges", dispId = 0xb51)
    void SheetPivotTableBeforeCommitChanges(com.sun.jna.platform.win32.COM.util.IDispatch Sh,
            PivotTable TargetPivotTable,
            Integer ValueChangeStart,
            Integer ValueChangeEnd,
            VARIANT Cancel);
            
    /**
     * <p>id(0xb52)</p>
     * <p>vtableId(41)</p>
     * @param Sh [in] {@code com.sun.jna.platform.win32.COM.util.IDispatch}
     * @param TargetPivotTable [in] {@code PivotTable}
     * @param ValueChangeStart [in] {@code Integer}
     * @param ValueChangeEnd [in] {@code Integer}
     */
    @ComMethod(name = "SheetPivotTableBeforeDiscardChanges", dispId = 0xb52)
    void SheetPivotTableBeforeDiscardChanges(com.sun.jna.platform.win32.COM.util.IDispatch Sh,
            PivotTable TargetPivotTable,
            Integer ValueChangeStart,
            Integer ValueChangeEnd);
            
    /**
     * <p>id(0xb57)</p>
     * <p>vtableId(42)</p>
     * @param Pvw [in] {@code ProtectedViewWindow}
     */
    @ComMethod(name = "ProtectedViewWindowOpen", dispId = 0xb57)
    void ProtectedViewWindowOpen(ProtectedViewWindow Pvw);
            
    /**
     * <p>id(0xb59)</p>
     * <p>vtableId(43)</p>
     * @param Pvw [in] {@code ProtectedViewWindow}
     * @param Cancel [inout] {@code Boolean}
     */
    @ComMethod(name = "ProtectedViewWindowBeforeEdit", dispId = 0xb59)
    void ProtectedViewWindowBeforeEdit(ProtectedViewWindow Pvw,
            VARIANT Cancel);
            
    /**
     * <p>id(0xb5a)</p>
     * <p>vtableId(44)</p>
     * @param Pvw [in] {@code ProtectedViewWindow}
     * @param Reason [in] {@code XlProtectedViewCloseReason}
     * @param Cancel [inout] {@code Boolean}
     */
    @ComMethod(name = "ProtectedViewWindowBeforeClose", dispId = 0xb5a)
    void ProtectedViewWindowBeforeClose(ProtectedViewWindow Pvw,
            XlProtectedViewCloseReason Reason,
            VARIANT Cancel);
            
    /**
     * <p>id(0xb5c)</p>
     * <p>vtableId(45)</p>
     * @param Pvw [in] {@code ProtectedViewWindow}
     */
    @ComMethod(name = "ProtectedViewWindowResize", dispId = 0xb5c)
    void ProtectedViewWindowResize(ProtectedViewWindow Pvw);
            
    /**
     * <p>id(0xb5d)</p>
     * <p>vtableId(46)</p>
     * @param Pvw [in] {@code ProtectedViewWindow}
     */
    @ComMethod(name = "ProtectedViewWindowActivate", dispId = 0xb5d)
    void ProtectedViewWindowActivate(ProtectedViewWindow Pvw);
            
    /**
     * <p>id(0xb5e)</p>
     * <p>vtableId(47)</p>
     * @param Pvw [in] {@code ProtectedViewWindow}
     */
    @ComMethod(name = "ProtectedViewWindowDeactivate", dispId = 0xb5e)
    void ProtectedViewWindowDeactivate(ProtectedViewWindow Pvw);
            
    /**
     * <p>id(0xb5f)</p>
     * <p>vtableId(48)</p>
     * @param Wb [in] {@code Workbook}
     * @param Success [in] {@code Boolean}
     */
    @ComMethod(name = "WorkbookAfterSave", dispId = 0xb5f)
    void WorkbookAfterSave(Workbook Wb,
            Boolean Success);
            
    /**
     * <p>id(0xb60)</p>
     * <p>vtableId(49)</p>
     * @param Wb [in] {@code Workbook}
     * @param Ch [in] {@code Chart}
     */
    @ComMethod(name = "WorkbookNewChart", dispId = 0xb60)
    void WorkbookNewChart(Workbook Wb,
            Chart Ch);
            
    /**
     * <p>id(0xc03)</p>
     * <p>vtableId(50)</p>
     * @param Sh [in] {@code com.sun.jna.platform.win32.COM.util.IDispatch}
     */
    @ComMethod(name = "SheetLensGalleryRenderComplete", dispId = 0xc03)
    void SheetLensGalleryRenderComplete(com.sun.jna.platform.win32.COM.util.IDispatch Sh);
            
    /**
     * <p>id(0xc04)</p>
     * <p>vtableId(51)</p>
     * @param Sh [in] {@code com.sun.jna.platform.win32.COM.util.IDispatch}
     * @param Target [in] {@code TableObject}
     */
    @ComMethod(name = "SheetTableUpdate", dispId = 0xc04)
    void SheetTableUpdate(com.sun.jna.platform.win32.COM.util.IDispatch Sh,
            TableObject Target);
            
    /**
     * <p>id(0xc08)</p>
     * <p>vtableId(52)</p>
     * @param Wb [in] {@code Workbook}
     * @param Changes [in] {@code ModelChanges}
     */
    @ComMethod(name = "WorkbookModelChange", dispId = 0xc08)
    void WorkbookModelChange(Workbook Wb,
            ModelChanges Changes);
            
    /**
     * <p>id(0xc07)</p>
     * <p>vtableId(53)</p>
     * @param Sh [in] {@code com.sun.jna.platform.win32.COM.util.IDispatch}
     */
    @ComMethod(name = "SheetBeforeDelete", dispId = 0xc07)
    void SheetBeforeDelete(com.sun.jna.platform.win32.COM.util.IDispatch Sh);
            
    
}