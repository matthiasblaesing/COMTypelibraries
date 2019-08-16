
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00020A01-0001-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{00020A01-0001-0000-C000-000000000046}")
public interface IApplicationEvents4 extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x1)</p>
     * <p>vtableId(7)</p>
     */
    @ComMethod(name = "Startup", dispId = 0x1)
    com.sun.jna.platform.win32.WinNT.HRESULT Startup();
            
    /**
     * <p>id(0x2)</p>
     * <p>vtableId(8)</p>
     */
    @ComMethod(name = "Quit", dispId = 0x2)
    com.sun.jna.platform.win32.WinNT.HRESULT Quit();
            
    /**
     * <p>id(0x3)</p>
     * <p>vtableId(9)</p>
     */
    @ComMethod(name = "DocumentChange", dispId = 0x3)
    com.sun.jna.platform.win32.WinNT.HRESULT DocumentChange();
            
    /**
     * <p>id(0x4)</p>
     * <p>vtableId(10)</p>
     * @param Doc [in] {@code Document}
     */
    @ComMethod(name = "DocumentOpen", dispId = 0x4)
    com.sun.jna.platform.win32.WinNT.HRESULT DocumentOpen(Document Doc);
            
    /**
     * <p>id(0x6)</p>
     * <p>vtableId(11)</p>
     * @param Doc [in] {@code Document}
     * @param Cancel [inout] {@code Boolean}
     */
    @ComMethod(name = "DocumentBeforeClose", dispId = 0x6)
    com.sun.jna.platform.win32.WinNT.HRESULT DocumentBeforeClose(Document Doc,
            VARIANT Cancel);
            
    /**
     * <p>id(0x7)</p>
     * <p>vtableId(12)</p>
     * @param Doc [in] {@code Document}
     * @param Cancel [inout] {@code Boolean}
     */
    @ComMethod(name = "DocumentBeforePrint", dispId = 0x7)
    com.sun.jna.platform.win32.WinNT.HRESULT DocumentBeforePrint(Document Doc,
            VARIANT Cancel);
            
    /**
     * <p>id(0x8)</p>
     * <p>vtableId(13)</p>
     * @param Doc [in] {@code Document}
     * @param SaveAsUI [in] {@code Boolean}
     * @param Cancel [inout] {@code Boolean}
     */
    @ComMethod(name = "DocumentBeforeSave", dispId = 0x8)
    com.sun.jna.platform.win32.WinNT.HRESULT DocumentBeforeSave(Document Doc,
            Boolean SaveAsUI,
            VARIANT Cancel);
            
    /**
     * <p>id(0x9)</p>
     * <p>vtableId(14)</p>
     * @param Doc [in] {@code Document}
     */
    @ComMethod(name = "NewDocument", dispId = 0x9)
    com.sun.jna.platform.win32.WinNT.HRESULT NewDocument(Document Doc);
            
    /**
     * <p>id(0xa)</p>
     * <p>vtableId(15)</p>
     * @param Doc [in] {@code Document}
     * @param Wn [in] {@code Window}
     */
    @ComMethod(name = "WindowActivate", dispId = 0xa)
    com.sun.jna.platform.win32.WinNT.HRESULT WindowActivate(Document Doc,
            Window Wn);
            
    /**
     * <p>id(0xb)</p>
     * <p>vtableId(16)</p>
     * @param Doc [in] {@code Document}
     * @param Wn [in] {@code Window}
     */
    @ComMethod(name = "WindowDeactivate", dispId = 0xb)
    com.sun.jna.platform.win32.WinNT.HRESULT WindowDeactivate(Document Doc,
            Window Wn);
            
    /**
     * <p>id(0xc)</p>
     * <p>vtableId(17)</p>
     * @param Sel [in] {@code Selection}
     */
    @ComMethod(name = "WindowSelectionChange", dispId = 0xc)
    com.sun.jna.platform.win32.WinNT.HRESULT WindowSelectionChange(Selection Sel);
            
    /**
     * <p>id(0xd)</p>
     * <p>vtableId(18)</p>
     * @param Sel [in] {@code Selection}
     * @param Cancel [inout] {@code Boolean}
     */
    @ComMethod(name = "WindowBeforeRightClick", dispId = 0xd)
    com.sun.jna.platform.win32.WinNT.HRESULT WindowBeforeRightClick(Selection Sel,
            VARIANT Cancel);
            
    /**
     * <p>id(0xe)</p>
     * <p>vtableId(19)</p>
     * @param Sel [in] {@code Selection}
     * @param Cancel [inout] {@code Boolean}
     */
    @ComMethod(name = "WindowBeforeDoubleClick", dispId = 0xe)
    com.sun.jna.platform.win32.WinNT.HRESULT WindowBeforeDoubleClick(Selection Sel,
            VARIANT Cancel);
            
    /**
     * <p>id(0xf)</p>
     * <p>vtableId(20)</p>
     * @param Doc [in] {@code Document}
     */
    @ComMethod(name = "EPostagePropertyDialog", dispId = 0xf)
    com.sun.jna.platform.win32.WinNT.HRESULT EPostagePropertyDialog(Document Doc);
            
    /**
     * <p>id(0x10)</p>
     * <p>vtableId(21)</p>
     * @param Doc [in] {@code Document}
     */
    @ComMethod(name = "EPostageInsert", dispId = 0x10)
    com.sun.jna.platform.win32.WinNT.HRESULT EPostageInsert(Document Doc);
            
    /**
     * <p>id(0x11)</p>
     * <p>vtableId(22)</p>
     * @param Doc [in] {@code Document}
     * @param DocResult [in] {@code Document}
     */
    @ComMethod(name = "MailMergeAfterMerge", dispId = 0x11)
    com.sun.jna.platform.win32.WinNT.HRESULT MailMergeAfterMerge(Document Doc,
            Document DocResult);
            
    /**
     * <p>id(0x12)</p>
     * <p>vtableId(23)</p>
     * @param Doc [in] {@code Document}
     */
    @ComMethod(name = "MailMergeAfterRecordMerge", dispId = 0x12)
    com.sun.jna.platform.win32.WinNT.HRESULT MailMergeAfterRecordMerge(Document Doc);
            
    /**
     * <p>id(0x13)</p>
     * <p>vtableId(24)</p>
     * @param Doc [in] {@code Document}
     * @param StartRecord [in] {@code Integer}
     * @param EndRecord [in] {@code Integer}
     * @param Cancel [inout] {@code Boolean}
     */
    @ComMethod(name = "MailMergeBeforeMerge", dispId = 0x13)
    com.sun.jna.platform.win32.WinNT.HRESULT MailMergeBeforeMerge(Document Doc,
            Integer StartRecord,
            Integer EndRecord,
            VARIANT Cancel);
            
    /**
     * <p>id(0x14)</p>
     * <p>vtableId(25)</p>
     * @param Doc [in] {@code Document}
     * @param Cancel [inout] {@code Boolean}
     */
    @ComMethod(name = "MailMergeBeforeRecordMerge", dispId = 0x14)
    com.sun.jna.platform.win32.WinNT.HRESULT MailMergeBeforeRecordMerge(Document Doc,
            VARIANT Cancel);
            
    /**
     * <p>id(0x15)</p>
     * <p>vtableId(26)</p>
     * @param Doc [in] {@code Document}
     */
    @ComMethod(name = "MailMergeDataSourceLoad", dispId = 0x15)
    com.sun.jna.platform.win32.WinNT.HRESULT MailMergeDataSourceLoad(Document Doc);
            
    /**
     * <p>id(0x16)</p>
     * <p>vtableId(27)</p>
     * @param Doc [in] {@code Document}
     * @param Handled [in] {@code Boolean}
     */
    @ComMethod(name = "MailMergeDataSourceValidate", dispId = 0x16)
    com.sun.jna.platform.win32.WinNT.HRESULT MailMergeDataSourceValidate(Document Doc,
            Boolean Handled);
            
    /**
     * <p>id(0x17)</p>
     * <p>vtableId(28)</p>
     * @param Doc [in] {@code Document}
     */
    @ComMethod(name = "MailMergeWizardSendToCustom", dispId = 0x17)
    com.sun.jna.platform.win32.WinNT.HRESULT MailMergeWizardSendToCustom(Document Doc);
            
    /**
     * <p>id(0x18)</p>
     * <p>vtableId(29)</p>
     * @param Doc [in] {@code Document}
     * @param FromState [in] {@code Integer}
     * @param ToState [in] {@code Integer}
     * @param Handled [in] {@code Boolean}
     */
    @ComMethod(name = "MailMergeWizardStateChange", dispId = 0x18)
    com.sun.jna.platform.win32.WinNT.HRESULT MailMergeWizardStateChange(Document Doc,
            Integer FromState,
            Integer ToState,
            Boolean Handled);
            
    /**
     * <p>id(0x19)</p>
     * <p>vtableId(30)</p>
     * @param Doc [in] {@code Document}
     * @param Wn [in] {@code Window}
     */
    @ComMethod(name = "WindowSize", dispId = 0x19)
    com.sun.jna.platform.win32.WinNT.HRESULT WindowSize(Document Doc,
            Window Wn);
            
    /**
     * <p>id(0x1a)</p>
     * <p>vtableId(31)</p>
     * @param Sel [in] {@code Selection}
     * @param OldXMLNode [in] {@code XMLNode}
     * @param NewXMLNode [in] {@code XMLNode}
     * @param Reason [in] {@code Integer}
     */
    @ComMethod(name = "XMLSelectionChange", dispId = 0x1a)
    com.sun.jna.platform.win32.WinNT.HRESULT XMLSelectionChange(Selection Sel,
            XMLNode OldXMLNode,
            XMLNode NewXMLNode,
            Integer Reason);
            
    /**
     * <p>id(0x1b)</p>
     * <p>vtableId(32)</p>
     * @param XMLNode [in] {@code XMLNode}
     */
    @ComMethod(name = "XMLValidationError", dispId = 0x1b)
    com.sun.jna.platform.win32.WinNT.HRESULT XMLValidationError(XMLNode XMLNode);
            
    /**
     * <p>id(0x1c)</p>
     * <p>vtableId(33)</p>
     * @param Doc [in] {@code Document}
     * @param SyncEventType [in] {@code eu.doppel_helix.jna.tlb.office2.MsoSyncEventType}
     */
    @ComMethod(name = "DocumentSync", dispId = 0x1c)
    com.sun.jna.platform.win32.WinNT.HRESULT DocumentSync(Document Doc,
            eu.doppel_helix.jna.tlb.office2.MsoSyncEventType SyncEventType);
            
    /**
     * <p>id(0x1d)</p>
     * <p>vtableId(34)</p>
     * @param Doc [in] {@code Document}
     * @param cpDeliveryAddrStart [in] {@code Integer}
     * @param cpDeliveryAddrEnd [in] {@code Integer}
     * @param cpReturnAddrStart [in] {@code Integer}
     * @param cpReturnAddrEnd [in] {@code Integer}
     * @param xaWidth [in] {@code Integer}
     * @param yaHeight [in] {@code Integer}
     * @param bstrPrinterName [in] {@code String}
     * @param bstrPaperFeed [in] {@code String}
     * @param fPrint [in] {@code Boolean}
     * @param fCancel [inout] {@code Boolean}
     */
    @ComMethod(name = "EPostageInsertEx", dispId = 0x1d)
    com.sun.jna.platform.win32.WinNT.HRESULT EPostageInsertEx(Document Doc,
            Integer cpDeliveryAddrStart,
            Integer cpDeliveryAddrEnd,
            Integer cpReturnAddrStart,
            Integer cpReturnAddrEnd,
            Integer xaWidth,
            Integer yaHeight,
            String bstrPrinterName,
            String bstrPaperFeed,
            Boolean fPrint,
            VARIANT fCancel);
            
    /**
     * <p>id(0x1e)</p>
     * <p>vtableId(35)</p>
     * @param Doc [in] {@code Document}
     * @param Handled [inout] {@code Boolean}
     */
    @ComMethod(name = "MailMergeDataSourceValidate2", dispId = 0x1e)
    com.sun.jna.platform.win32.WinNT.HRESULT MailMergeDataSourceValidate2(Document Doc,
            VARIANT Handled);
            
    /**
     * <p>id(0x1f)</p>
     * <p>vtableId(36)</p>
     * @param PvWindow [in] {@code ProtectedViewWindow}
     */
    @ComMethod(name = "ProtectedViewWindowOpen", dispId = 0x1f)
    com.sun.jna.platform.win32.WinNT.HRESULT ProtectedViewWindowOpen(ProtectedViewWindow PvWindow);
            
    /**
     * <p>id(0x20)</p>
     * <p>vtableId(37)</p>
     * @param PvWindow [in] {@code ProtectedViewWindow}
     * @param Cancel [inout] {@code Boolean}
     */
    @ComMethod(name = "ProtectedViewWindowBeforeEdit", dispId = 0x20)
    com.sun.jna.platform.win32.WinNT.HRESULT ProtectedViewWindowBeforeEdit(ProtectedViewWindow PvWindow,
            VARIANT Cancel);
            
    /**
     * <p>id(0x21)</p>
     * <p>vtableId(38)</p>
     * @param PvWindow [in] {@code ProtectedViewWindow}
     * @param CloseReason [in] {@code Integer}
     * @param Cancel [inout] {@code Boolean}
     */
    @ComMethod(name = "ProtectedViewWindowBeforeClose", dispId = 0x21)
    com.sun.jna.platform.win32.WinNT.HRESULT ProtectedViewWindowBeforeClose(ProtectedViewWindow PvWindow,
            Integer CloseReason,
            VARIANT Cancel);
            
    /**
     * <p>id(0x22)</p>
     * <p>vtableId(39)</p>
     * @param PvWindow [in] {@code ProtectedViewWindow}
     */
    @ComMethod(name = "ProtectedViewWindowSize", dispId = 0x22)
    com.sun.jna.platform.win32.WinNT.HRESULT ProtectedViewWindowSize(ProtectedViewWindow PvWindow);
            
    /**
     * <p>id(0x23)</p>
     * <p>vtableId(40)</p>
     * @param PvWindow [in] {@code ProtectedViewWindow}
     */
    @ComMethod(name = "ProtectedViewWindowActivate", dispId = 0x23)
    com.sun.jna.platform.win32.WinNT.HRESULT ProtectedViewWindowActivate(ProtectedViewWindow PvWindow);
            
    /**
     * <p>id(0x24)</p>
     * <p>vtableId(41)</p>
     * @param PvWindow [in] {@code ProtectedViewWindow}
     */
    @ComMethod(name = "ProtectedViewWindowDeactivate", dispId = 0x24)
    com.sun.jna.platform.win32.WinNT.HRESULT ProtectedViewWindowDeactivate(ProtectedViewWindow PvWindow);
            
    
}