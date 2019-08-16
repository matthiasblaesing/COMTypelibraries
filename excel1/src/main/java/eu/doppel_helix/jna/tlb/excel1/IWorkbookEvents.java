
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00024412-0001-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{00024412-0001-0000-C000-000000000046}")
public interface IWorkbookEvents extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x783)</p>
     * <p>vtableId(7)</p>
     */
    @ComMethod(name = "Open", dispId = 0x783)
    com.sun.jna.platform.win32.WinNT.HRESULT Open();
            
    /**
     * <p>id(0x130)</p>
     * <p>vtableId(8)</p>
     */
    @ComMethod(name = "Activate", dispId = 0x130)
    com.sun.jna.platform.win32.WinNT.HRESULT Activate();
            
    /**
     * <p>id(0x5fa)</p>
     * <p>vtableId(9)</p>
     */
    @ComMethod(name = "Deactivate", dispId = 0x5fa)
    com.sun.jna.platform.win32.WinNT.HRESULT Deactivate();
            
    /**
     * <p>id(0x60a)</p>
     * <p>vtableId(10)</p>
     * @param Cancel [inout] {@code Boolean}
     */
    @ComMethod(name = "BeforeClose", dispId = 0x60a)
    com.sun.jna.platform.win32.WinNT.HRESULT BeforeClose(VARIANT Cancel);
            
    /**
     * <p>id(0x60b)</p>
     * <p>vtableId(11)</p>
     * @param SaveAsUI [in] {@code Boolean}
     * @param Cancel [inout] {@code Boolean}
     */
    @ComMethod(name = "BeforeSave", dispId = 0x60b)
    com.sun.jna.platform.win32.WinNT.HRESULT BeforeSave(Boolean SaveAsUI,
            VARIANT Cancel);
            
    /**
     * <p>id(0x60d)</p>
     * <p>vtableId(12)</p>
     * @param Cancel [inout] {@code Boolean}
     */
    @ComMethod(name = "BeforePrint", dispId = 0x60d)
    com.sun.jna.platform.win32.WinNT.HRESULT BeforePrint(VARIANT Cancel);
            
    /**
     * <p>id(0x60e)</p>
     * <p>vtableId(13)</p>
     * @param Sh [in] {@code com.sun.jna.platform.win32.COM.util.IDispatch}
     */
    @ComMethod(name = "NewSheet", dispId = 0x60e)
    com.sun.jna.platform.win32.WinNT.HRESULT NewSheet(com.sun.jna.platform.win32.COM.util.IDispatch Sh);
            
    /**
     * <p>id(0x610)</p>
     * <p>vtableId(14)</p>
     */
    @ComMethod(name = "AddinInstall", dispId = 0x610)
    com.sun.jna.platform.win32.WinNT.HRESULT AddinInstall();
            
    /**
     * <p>id(0x611)</p>
     * <p>vtableId(15)</p>
     */
    @ComMethod(name = "AddinUninstall", dispId = 0x611)
    com.sun.jna.platform.win32.WinNT.HRESULT AddinUninstall();
            
    /**
     * <p>id(0x612)</p>
     * <p>vtableId(16)</p>
     * @param Wn [in] {@code Window}
     */
    @ComMethod(name = "WindowResize", dispId = 0x612)
    com.sun.jna.platform.win32.WinNT.HRESULT WindowResize(Window Wn);
            
    /**
     * <p>id(0x614)</p>
     * <p>vtableId(17)</p>
     * @param Wn [in] {@code Window}
     */
    @ComMethod(name = "WindowActivate", dispId = 0x614)
    com.sun.jna.platform.win32.WinNT.HRESULT WindowActivate(Window Wn);
            
    /**
     * <p>id(0x615)</p>
     * <p>vtableId(18)</p>
     * @param Wn [in] {@code Window}
     */
    @ComMethod(name = "WindowDeactivate", dispId = 0x615)
    com.sun.jna.platform.win32.WinNT.HRESULT WindowDeactivate(Window Wn);
            
    /**
     * <p>id(0x616)</p>
     * <p>vtableId(19)</p>
     * @param Sh [in] {@code com.sun.jna.platform.win32.COM.util.IDispatch}
     * @param Target [in] {@code Range}
     */
    @ComMethod(name = "SheetSelectionChange", dispId = 0x616)
    com.sun.jna.platform.win32.WinNT.HRESULT SheetSelectionChange(com.sun.jna.platform.win32.COM.util.IDispatch Sh,
            Range Target);
            
    /**
     * <p>id(0x617)</p>
     * <p>vtableId(20)</p>
     * @param Sh [in] {@code com.sun.jna.platform.win32.COM.util.IDispatch}
     * @param Target [in] {@code Range}
     * @param Cancel [inout] {@code Boolean}
     */
    @ComMethod(name = "SheetBeforeDoubleClick", dispId = 0x617)
    com.sun.jna.platform.win32.WinNT.HRESULT SheetBeforeDoubleClick(com.sun.jna.platform.win32.COM.util.IDispatch Sh,
            Range Target,
            VARIANT Cancel);
            
    /**
     * <p>id(0x618)</p>
     * <p>vtableId(21)</p>
     * @param Sh [in] {@code com.sun.jna.platform.win32.COM.util.IDispatch}
     * @param Target [in] {@code Range}
     * @param Cancel [inout] {@code Boolean}
     */
    @ComMethod(name = "SheetBeforeRightClick", dispId = 0x618)
    com.sun.jna.platform.win32.WinNT.HRESULT SheetBeforeRightClick(com.sun.jna.platform.win32.COM.util.IDispatch Sh,
            Range Target,
            VARIANT Cancel);
            
    /**
     * <p>id(0x619)</p>
     * <p>vtableId(22)</p>
     * @param Sh [in] {@code com.sun.jna.platform.win32.COM.util.IDispatch}
     */
    @ComMethod(name = "SheetActivate", dispId = 0x619)
    com.sun.jna.platform.win32.WinNT.HRESULT SheetActivate(com.sun.jna.platform.win32.COM.util.IDispatch Sh);
            
    /**
     * <p>id(0x61a)</p>
     * <p>vtableId(23)</p>
     * @param Sh [in] {@code com.sun.jna.platform.win32.COM.util.IDispatch}
     */
    @ComMethod(name = "SheetDeactivate", dispId = 0x61a)
    com.sun.jna.platform.win32.WinNT.HRESULT SheetDeactivate(com.sun.jna.platform.win32.COM.util.IDispatch Sh);
            
    /**
     * <p>id(0x61b)</p>
     * <p>vtableId(24)</p>
     * @param Sh [in] {@code com.sun.jna.platform.win32.COM.util.IDispatch}
     */
    @ComMethod(name = "SheetCalculate", dispId = 0x61b)
    com.sun.jna.platform.win32.WinNT.HRESULT SheetCalculate(com.sun.jna.platform.win32.COM.util.IDispatch Sh);
            
    /**
     * <p>id(0x61c)</p>
     * <p>vtableId(25)</p>
     * @param Sh [in] {@code com.sun.jna.platform.win32.COM.util.IDispatch}
     * @param Target [in] {@code Range}
     */
    @ComMethod(name = "SheetChange", dispId = 0x61c)
    com.sun.jna.platform.win32.WinNT.HRESULT SheetChange(com.sun.jna.platform.win32.COM.util.IDispatch Sh,
            Range Target);
            
    /**
     * <p>id(0x73e)</p>
     * <p>vtableId(26)</p>
     * @param Sh [in] {@code com.sun.jna.platform.win32.COM.util.IDispatch}
     * @param Target [in] {@code Hyperlink}
     */
    @ComMethod(name = "SheetFollowHyperlink", dispId = 0x73e)
    com.sun.jna.platform.win32.WinNT.HRESULT SheetFollowHyperlink(com.sun.jna.platform.win32.COM.util.IDispatch Sh,
            Hyperlink Target);
            
    /**
     * <p>id(0x86d)</p>
     * <p>vtableId(27)</p>
     * @param Sh [in] {@code com.sun.jna.platform.win32.COM.util.IDispatch}
     * @param Target [in] {@code PivotTable}
     */
    @ComMethod(name = "SheetPivotTableUpdate", dispId = 0x86d)
    com.sun.jna.platform.win32.WinNT.HRESULT SheetPivotTableUpdate(com.sun.jna.platform.win32.COM.util.IDispatch Sh,
            PivotTable Target);
            
    /**
     * <p>id(0x86e)</p>
     * <p>vtableId(28)</p>
     * @param Target [in] {@code PivotTable}
     */
    @ComMethod(name = "PivotTableCloseConnection", dispId = 0x86e)
    com.sun.jna.platform.win32.WinNT.HRESULT PivotTableCloseConnection(PivotTable Target);
            
    /**
     * <p>id(0x86f)</p>
     * <p>vtableId(29)</p>
     * @param Target [in] {@code PivotTable}
     */
    @ComMethod(name = "PivotTableOpenConnection", dispId = 0x86f)
    com.sun.jna.platform.win32.WinNT.HRESULT PivotTableOpenConnection(PivotTable Target);
            
    /**
     * <p>id(0x8da)</p>
     * <p>vtableId(30)</p>
     * @param SyncEventType [in] {@code eu.doppel_helix.jna.tlb.office2.MsoSyncEventType}
     */
    @ComMethod(name = "Sync", dispId = 0x8da)
    com.sun.jna.platform.win32.WinNT.HRESULT Sync(eu.doppel_helix.jna.tlb.office2.MsoSyncEventType SyncEventType);
            
    /**
     * <p>id(0x8eb)</p>
     * <p>vtableId(31)</p>
     * @param Map [in] {@code XmlMap}
     * @param Url [in] {@code String}
     * @param IsRefresh [in] {@code Boolean}
     * @param Cancel [inout] {@code Boolean}
     */
    @ComMethod(name = "BeforeXmlImport", dispId = 0x8eb)
    com.sun.jna.platform.win32.WinNT.HRESULT BeforeXmlImport(XmlMap Map,
            String Url,
            Boolean IsRefresh,
            VARIANT Cancel);
            
    /**
     * <p>id(0x8ed)</p>
     * <p>vtableId(32)</p>
     * @param Map [in] {@code XmlMap}
     * @param IsRefresh [in] {@code Boolean}
     * @param Result [in] {@code XlXmlImportResult}
     */
    @ComMethod(name = "AfterXmlImport", dispId = 0x8ed)
    com.sun.jna.platform.win32.WinNT.HRESULT AfterXmlImport(XmlMap Map,
            Boolean IsRefresh,
            XlXmlImportResult Result);
            
    /**
     * <p>id(0x8ef)</p>
     * <p>vtableId(33)</p>
     * @param Map [in] {@code XmlMap}
     * @param Url [in] {@code String}
     * @param Cancel [inout] {@code Boolean}
     */
    @ComMethod(name = "BeforeXmlExport", dispId = 0x8ef)
    com.sun.jna.platform.win32.WinNT.HRESULT BeforeXmlExport(XmlMap Map,
            String Url,
            VARIANT Cancel);
            
    /**
     * <p>id(0x8f0)</p>
     * <p>vtableId(34)</p>
     * @param Map [in] {@code XmlMap}
     * @param Url [in] {@code String}
     * @param Result [in] {@code XlXmlExportResult}
     */
    @ComMethod(name = "AfterXmlExport", dispId = 0x8f0)
    com.sun.jna.platform.win32.WinNT.HRESULT AfterXmlExport(XmlMap Map,
            String Url,
            XlXmlExportResult Result);
            
    /**
     * <p>id(0xa32)</p>
     * <p>vtableId(35)</p>
     * @param Description [in] {@code String}
     * @param Sheet [in] {@code String}
     * @param Success [in] {@code Boolean}
     */
    @ComMethod(name = "RowsetComplete", dispId = 0xa32)
    com.sun.jna.platform.win32.WinNT.HRESULT RowsetComplete(String Description,
            String Sheet,
            Boolean Success);
            
    /**
     * <p>id(0xb4f)</p>
     * <p>vtableId(36)</p>
     * @param Sh [in] {@code com.sun.jna.platform.win32.COM.util.IDispatch}
     * @param TargetPivotTable [in] {@code PivotTable}
     * @param TargetRange [in] {@code Range}
     */
    @ComMethod(name = "SheetPivotTableAfterValueChange", dispId = 0xb4f)
    com.sun.jna.platform.win32.WinNT.HRESULT SheetPivotTableAfterValueChange(com.sun.jna.platform.win32.COM.util.IDispatch Sh,
            PivotTable TargetPivotTable,
            Range TargetRange);
            
    /**
     * <p>id(0xb50)</p>
     * <p>vtableId(37)</p>
     * @param Sh [in] {@code com.sun.jna.platform.win32.COM.util.IDispatch}
     * @param TargetPivotTable [in] {@code PivotTable}
     * @param ValueChangeStart [in] {@code Integer}
     * @param ValueChangeEnd [in] {@code Integer}
     * @param Cancel [inout] {@code Boolean}
     */
    @ComMethod(name = "SheetPivotTableBeforeAllocateChanges", dispId = 0xb50)
    com.sun.jna.platform.win32.WinNT.HRESULT SheetPivotTableBeforeAllocateChanges(com.sun.jna.platform.win32.COM.util.IDispatch Sh,
            PivotTable TargetPivotTable,
            Integer ValueChangeStart,
            Integer ValueChangeEnd,
            VARIANT Cancel);
            
    /**
     * <p>id(0xb51)</p>
     * <p>vtableId(38)</p>
     * @param Sh [in] {@code com.sun.jna.platform.win32.COM.util.IDispatch}
     * @param TargetPivotTable [in] {@code PivotTable}
     * @param ValueChangeStart [in] {@code Integer}
     * @param ValueChangeEnd [in] {@code Integer}
     * @param Cancel [inout] {@code Boolean}
     */
    @ComMethod(name = "SheetPivotTableBeforeCommitChanges", dispId = 0xb51)
    com.sun.jna.platform.win32.WinNT.HRESULT SheetPivotTableBeforeCommitChanges(com.sun.jna.platform.win32.COM.util.IDispatch Sh,
            PivotTable TargetPivotTable,
            Integer ValueChangeStart,
            Integer ValueChangeEnd,
            VARIANT Cancel);
            
    /**
     * <p>id(0xb52)</p>
     * <p>vtableId(39)</p>
     * @param Sh [in] {@code com.sun.jna.platform.win32.COM.util.IDispatch}
     * @param TargetPivotTable [in] {@code PivotTable}
     * @param ValueChangeStart [in] {@code Integer}
     * @param ValueChangeEnd [in] {@code Integer}
     */
    @ComMethod(name = "SheetPivotTableBeforeDiscardChanges", dispId = 0xb52)
    com.sun.jna.platform.win32.WinNT.HRESULT SheetPivotTableBeforeDiscardChanges(com.sun.jna.platform.win32.COM.util.IDispatch Sh,
            PivotTable TargetPivotTable,
            Integer ValueChangeStart,
            Integer ValueChangeEnd);
            
    /**
     * <p>id(0xb53)</p>
     * <p>vtableId(40)</p>
     * @param Sh [in] {@code com.sun.jna.platform.win32.COM.util.IDispatch}
     * @param Target [in] {@code PivotTable}
     */
    @ComMethod(name = "SheetPivotTableChangeSync", dispId = 0xb53)
    com.sun.jna.platform.win32.WinNT.HRESULT SheetPivotTableChangeSync(com.sun.jna.platform.win32.COM.util.IDispatch Sh,
            PivotTable Target);
            
    /**
     * <p>id(0xb54)</p>
     * <p>vtableId(41)</p>
     * @param Success [in] {@code Boolean}
     */
    @ComMethod(name = "AfterSave", dispId = 0xb54)
    com.sun.jna.platform.win32.WinNT.HRESULT AfterSave(Boolean Success);
            
    /**
     * <p>id(0xb55)</p>
     * <p>vtableId(42)</p>
     * @param Ch [in] {@code Chart}
     */
    @ComMethod(name = "NewChart", dispId = 0xb55)
    com.sun.jna.platform.win32.WinNT.HRESULT NewChart(Chart Ch);
            
    /**
     * <p>id(0xc03)</p>
     * <p>vtableId(43)</p>
     * @param Sh [in] {@code com.sun.jna.platform.win32.COM.util.IDispatch}
     */
    @ComMethod(name = "SheetLensGalleryRenderComplete", dispId = 0xc03)
    com.sun.jna.platform.win32.WinNT.HRESULT SheetLensGalleryRenderComplete(com.sun.jna.platform.win32.COM.util.IDispatch Sh);
            
    /**
     * <p>id(0xc04)</p>
     * <p>vtableId(44)</p>
     * @param Sh [in] {@code com.sun.jna.platform.win32.COM.util.IDispatch}
     * @param Target [in] {@code TableObject}
     */
    @ComMethod(name = "SheetTableUpdate", dispId = 0xc04)
    com.sun.jna.platform.win32.WinNT.HRESULT SheetTableUpdate(com.sun.jna.platform.win32.COM.util.IDispatch Sh,
            TableObject Target);
            
    /**
     * <p>id(0xc05)</p>
     * <p>vtableId(45)</p>
     * @param Changes [in] {@code ModelChanges}
     */
    @ComMethod(name = "ModelChange", dispId = 0xc05)
    com.sun.jna.platform.win32.WinNT.HRESULT ModelChange(ModelChanges Changes);
            
    /**
     * <p>id(0xc07)</p>
     * <p>vtableId(46)</p>
     * @param Sh [in] {@code com.sun.jna.platform.win32.COM.util.IDispatch}
     */
    @ComMethod(name = "SheetBeforeDelete", dispId = 0xc07)
    com.sun.jna.platform.win32.WinNT.HRESULT SheetBeforeDelete(com.sun.jna.platform.win32.COM.util.IDispatch Sh);
            
    
}