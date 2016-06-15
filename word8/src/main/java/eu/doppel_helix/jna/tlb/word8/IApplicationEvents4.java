
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
     */
    @ComMethod(name = "Startup", dispId = 0x1)
    com.sun.jna.platform.win32.WinNT.HRESULT Startup();
            
    /**
     * <p>id(0x2)</p>
     */
    @ComMethod(name = "Quit", dispId = 0x2)
    com.sun.jna.platform.win32.WinNT.HRESULT Quit();
            
    /**
     * <p>id(0x3)</p>
     */
    @ComMethod(name = "DocumentChange", dispId = 0x3)
    com.sun.jna.platform.win32.WinNT.HRESULT DocumentChange();
            
    /**
     * <p>id(0x4)</p>
     */
    @ComMethod(name = "DocumentOpen", dispId = 0x4)
    com.sun.jna.platform.win32.WinNT.HRESULT DocumentOpen(Document Doc);
            
    /**
     * <p>id(0x6)</p>
     */
    @ComMethod(name = "DocumentBeforeClose", dispId = 0x6)
    com.sun.jna.platform.win32.WinNT.HRESULT DocumentBeforeClose(Document Doc,
            VARIANT Cancel);
            
    /**
     * <p>id(0x7)</p>
     */
    @ComMethod(name = "DocumentBeforePrint", dispId = 0x7)
    com.sun.jna.platform.win32.WinNT.HRESULT DocumentBeforePrint(Document Doc,
            VARIANT Cancel);
            
    /**
     * <p>id(0x8)</p>
     */
    @ComMethod(name = "DocumentBeforeSave", dispId = 0x8)
    com.sun.jna.platform.win32.WinNT.HRESULT DocumentBeforeSave(Document Doc,
            Boolean SaveAsUI,
            VARIANT Cancel);
            
    /**
     * <p>id(0x9)</p>
     */
    @ComMethod(name = "NewDocument", dispId = 0x9)
    com.sun.jna.platform.win32.WinNT.HRESULT NewDocument(Document Doc);
            
    /**
     * <p>id(0xa)</p>
     */
    @ComMethod(name = "WindowActivate", dispId = 0xa)
    com.sun.jna.platform.win32.WinNT.HRESULT WindowActivate(Document Doc,
            Window Wn);
            
    /**
     * <p>id(0xb)</p>
     */
    @ComMethod(name = "WindowDeactivate", dispId = 0xb)
    com.sun.jna.platform.win32.WinNT.HRESULT WindowDeactivate(Document Doc,
            Window Wn);
            
    /**
     * <p>id(0xc)</p>
     */
    @ComMethod(name = "WindowSelectionChange", dispId = 0xc)
    com.sun.jna.platform.win32.WinNT.HRESULT WindowSelectionChange(Selection Sel);
            
    /**
     * <p>id(0xd)</p>
     */
    @ComMethod(name = "WindowBeforeRightClick", dispId = 0xd)
    com.sun.jna.platform.win32.WinNT.HRESULT WindowBeforeRightClick(Selection Sel,
            VARIANT Cancel);
            
    /**
     * <p>id(0xe)</p>
     */
    @ComMethod(name = "WindowBeforeDoubleClick", dispId = 0xe)
    com.sun.jna.platform.win32.WinNT.HRESULT WindowBeforeDoubleClick(Selection Sel,
            VARIANT Cancel);
            
    /**
     * <p>id(0xf)</p>
     */
    @ComMethod(name = "EPostagePropertyDialog", dispId = 0xf)
    com.sun.jna.platform.win32.WinNT.HRESULT EPostagePropertyDialog(Document Doc);
            
    /**
     * <p>id(0x10)</p>
     */
    @ComMethod(name = "EPostageInsert", dispId = 0x10)
    com.sun.jna.platform.win32.WinNT.HRESULT EPostageInsert(Document Doc);
            
    /**
     * <p>id(0x11)</p>
     */
    @ComMethod(name = "MailMergeAfterMerge", dispId = 0x11)
    com.sun.jna.platform.win32.WinNT.HRESULT MailMergeAfterMerge(Document Doc,
            Document DocResult);
            
    /**
     * <p>id(0x12)</p>
     */
    @ComMethod(name = "MailMergeAfterRecordMerge", dispId = 0x12)
    com.sun.jna.platform.win32.WinNT.HRESULT MailMergeAfterRecordMerge(Document Doc);
            
    /**
     * <p>id(0x13)</p>
     */
    @ComMethod(name = "MailMergeBeforeMerge", dispId = 0x13)
    com.sun.jna.platform.win32.WinNT.HRESULT MailMergeBeforeMerge(Document Doc,
            Integer StartRecord,
            Integer EndRecord,
            VARIANT Cancel);
            
    /**
     * <p>id(0x14)</p>
     */
    @ComMethod(name = "MailMergeBeforeRecordMerge", dispId = 0x14)
    com.sun.jna.platform.win32.WinNT.HRESULT MailMergeBeforeRecordMerge(Document Doc,
            VARIANT Cancel);
            
    /**
     * <p>id(0x15)</p>
     */
    @ComMethod(name = "MailMergeDataSourceLoad", dispId = 0x15)
    com.sun.jna.platform.win32.WinNT.HRESULT MailMergeDataSourceLoad(Document Doc);
            
    /**
     * <p>id(0x16)</p>
     */
    @ComMethod(name = "MailMergeDataSourceValidate", dispId = 0x16)
    com.sun.jna.platform.win32.WinNT.HRESULT MailMergeDataSourceValidate(Document Doc,
            Boolean Handled);
            
    /**
     * <p>id(0x17)</p>
     */
    @ComMethod(name = "MailMergeWizardSendToCustom", dispId = 0x17)
    com.sun.jna.platform.win32.WinNT.HRESULT MailMergeWizardSendToCustom(Document Doc);
            
    /**
     * <p>id(0x18)</p>
     */
    @ComMethod(name = "MailMergeWizardStateChange", dispId = 0x18)
    com.sun.jna.platform.win32.WinNT.HRESULT MailMergeWizardStateChange(Document Doc,
            Integer FromState,
            Integer ToState,
            Boolean Handled);
            
    /**
     * <p>id(0x19)</p>
     */
    @ComMethod(name = "WindowSize", dispId = 0x19)
    com.sun.jna.platform.win32.WinNT.HRESULT WindowSize(Document Doc,
            Window Wn);
            
    /**
     * <p>id(0x1a)</p>
     */
    @ComMethod(name = "XMLSelectionChange", dispId = 0x1a)
    com.sun.jna.platform.win32.WinNT.HRESULT XMLSelectionChange(Selection Sel,
            XMLNode OldXMLNode,
            XMLNode NewXMLNode,
            Integer Reason);
            
    /**
     * <p>id(0x1b)</p>
     */
    @ComMethod(name = "XMLValidationError", dispId = 0x1b)
    com.sun.jna.platform.win32.WinNT.HRESULT XMLValidationError(XMLNode XMLNode);
            
    /**
     * <p>id(0x1c)</p>
     */
    @ComMethod(name = "DocumentSync", dispId = 0x1c)
    com.sun.jna.platform.win32.WinNT.HRESULT DocumentSync(Document Doc,
            eu.doppel_helix.jna.tlb.office2.MsoSyncEventType SyncEventType);
            
    /**
     * <p>id(0x1d)</p>
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
     */
    @ComMethod(name = "MailMergeDataSourceValidate2", dispId = 0x1e)
    com.sun.jna.platform.win32.WinNT.HRESULT MailMergeDataSourceValidate2(Document Doc,
            VARIANT Handled);
            
    /**
     * <p>id(0x1f)</p>
     */
    @ComMethod(name = "ProtectedViewWindowOpen", dispId = 0x1f)
    com.sun.jna.platform.win32.WinNT.HRESULT ProtectedViewWindowOpen(ProtectedViewWindow PvWindow);
            
    /**
     * <p>id(0x20)</p>
     */
    @ComMethod(name = "ProtectedViewWindowBeforeEdit", dispId = 0x20)
    com.sun.jna.platform.win32.WinNT.HRESULT ProtectedViewWindowBeforeEdit(ProtectedViewWindow PvWindow,
            VARIANT Cancel);
            
    /**
     * <p>id(0x21)</p>
     */
    @ComMethod(name = "ProtectedViewWindowBeforeClose", dispId = 0x21)
    com.sun.jna.platform.win32.WinNT.HRESULT ProtectedViewWindowBeforeClose(ProtectedViewWindow PvWindow,
            Integer CloseReason,
            VARIANT Cancel);
            
    /**
     * <p>id(0x22)</p>
     */
    @ComMethod(name = "ProtectedViewWindowSize", dispId = 0x22)
    com.sun.jna.platform.win32.WinNT.HRESULT ProtectedViewWindowSize(ProtectedViewWindow PvWindow);
            
    /**
     * <p>id(0x23)</p>
     */
    @ComMethod(name = "ProtectedViewWindowActivate", dispId = 0x23)
    com.sun.jna.platform.win32.WinNT.HRESULT ProtectedViewWindowActivate(ProtectedViewWindow PvWindow);
            
    /**
     * <p>id(0x24)</p>
     */
    @ComMethod(name = "ProtectedViewWindowDeactivate", dispId = 0x24)
    com.sun.jna.platform.win32.WinNT.HRESULT ProtectedViewWindowDeactivate(ProtectedViewWindow PvWindow);
            
    
}