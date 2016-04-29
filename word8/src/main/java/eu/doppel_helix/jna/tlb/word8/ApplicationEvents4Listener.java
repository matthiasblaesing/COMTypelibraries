
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.annotation.ComEventCallback;
import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00020A01-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{00020A01-0000-0000-C000-000000000046}")
public interface ApplicationEvents4Listener {
    /**
     * <p>id(0x1)</p>
     */
    @ComEventCallback(dispid = 0x1)
    void Startup();
            
    /**
     * <p>id(0x2)</p>
     */
    @ComEventCallback(dispid = 0x2)
    void Quit();
            
    /**
     * <p>id(0x3)</p>
     */
    @ComEventCallback(dispid = 0x3)
    void DocumentChange();
            
    /**
     * <p>id(0x4)</p>
     */
    @ComEventCallback(dispid = 0x4)
    void DocumentOpen(Document Doc);
            
    /**
     * <p>id(0x6)</p>
     */
    @ComEventCallback(dispid = 0x6)
    void DocumentBeforeClose(Document Doc,
            VARIANT Cancel);
            
    /**
     * <p>id(0x7)</p>
     */
    @ComEventCallback(dispid = 0x7)
    void DocumentBeforePrint(Document Doc,
            VARIANT Cancel);
            
    /**
     * <p>id(0x8)</p>
     */
    @ComEventCallback(dispid = 0x8)
    void DocumentBeforeSave(Document Doc,
            Boolean SaveAsUI,
            VARIANT Cancel);
            
    /**
     * <p>id(0x9)</p>
     */
    @ComEventCallback(dispid = 0x9)
    void NewDocument(Document Doc);
            
    /**
     * <p>id(0xa)</p>
     */
    @ComEventCallback(dispid = 0xa)
    void WindowActivate(Document Doc,
            Window Wn);
            
    /**
     * <p>id(0xb)</p>
     */
    @ComEventCallback(dispid = 0xb)
    void WindowDeactivate(Document Doc,
            Window Wn);
            
    /**
     * <p>id(0xc)</p>
     */
    @ComEventCallback(dispid = 0xc)
    void WindowSelectionChange(Selection Sel);
            
    /**
     * <p>id(0xd)</p>
     */
    @ComEventCallback(dispid = 0xd)
    void WindowBeforeRightClick(Selection Sel,
            VARIANT Cancel);
            
    /**
     * <p>id(0xe)</p>
     */
    @ComEventCallback(dispid = 0xe)
    void WindowBeforeDoubleClick(Selection Sel,
            VARIANT Cancel);
            
    /**
     * <p>id(0xf)</p>
     */
    @ComEventCallback(dispid = 0xf)
    void EPostagePropertyDialog(Document Doc);
            
    /**
     * <p>id(0x10)</p>
     */
    @ComEventCallback(dispid = 0x10)
    void EPostageInsert(Document Doc);
            
    /**
     * <p>id(0x11)</p>
     */
    @ComEventCallback(dispid = 0x11)
    void MailMergeAfterMerge(Document Doc,
            Document DocResult);
            
    /**
     * <p>id(0x12)</p>
     */
    @ComEventCallback(dispid = 0x12)
    void MailMergeAfterRecordMerge(Document Doc);
            
    /**
     * <p>id(0x13)</p>
     */
    @ComEventCallback(dispid = 0x13)
    void MailMergeBeforeMerge(Document Doc,
            Integer StartRecord,
            Integer EndRecord,
            VARIANT Cancel);
            
    /**
     * <p>id(0x14)</p>
     */
    @ComEventCallback(dispid = 0x14)
    void MailMergeBeforeRecordMerge(Document Doc,
            VARIANT Cancel);
            
    /**
     * <p>id(0x15)</p>
     */
    @ComEventCallback(dispid = 0x15)
    void MailMergeDataSourceLoad(Document Doc);
            
    /**
     * <p>id(0x16)</p>
     */
    @ComEventCallback(dispid = 0x16)
    void MailMergeDataSourceValidate(Document Doc,
            Boolean Handled);
            
    /**
     * <p>id(0x17)</p>
     */
    @ComEventCallback(dispid = 0x17)
    void MailMergeWizardSendToCustom(Document Doc);
            
    /**
     * <p>id(0x18)</p>
     */
    @ComEventCallback(dispid = 0x18)
    void MailMergeWizardStateChange(Document Doc,
            Integer FromState,
            Integer ToState,
            Boolean Handled);
            
    /**
     * <p>id(0x19)</p>
     */
    @ComEventCallback(dispid = 0x19)
    void WindowSize(Document Doc,
            Window Wn);
            
    /**
     * <p>id(0x1a)</p>
     */
    @ComEventCallback(dispid = 0x1a)
    void XMLSelectionChange(Selection Sel,
            XMLNode OldXMLNode,
            XMLNode NewXMLNode,
            Integer Reason);
            
    /**
     * <p>id(0x1b)</p>
     */
    @ComEventCallback(dispid = 0x1b)
    void XMLValidationError(XMLNode XMLNode);
            
    /**
     * <p>id(0x1c)</p>
     */
    @ComEventCallback(dispid = 0x1c)
    void DocumentSync(Document Doc,
            eu.doppel_helix.jna.tlb.office2.MsoSyncEventType SyncEventType);
            
    /**
     * <p>id(0x1d)</p>
     */
    @ComEventCallback(dispid = 0x1d)
    void EPostageInsertEx(Document Doc,
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
    @ComEventCallback(dispid = 0x1e)
    void MailMergeDataSourceValidate2(Document Doc,
            VARIANT Handled);
            
    /**
     * <p>id(0x1f)</p>
     */
    @ComEventCallback(dispid = 0x1f)
    void ProtectedViewWindowOpen(ProtectedViewWindow PvWindow);
            
    /**
     * <p>id(0x20)</p>
     */
    @ComEventCallback(dispid = 0x20)
    void ProtectedViewWindowBeforeEdit(ProtectedViewWindow PvWindow,
            VARIANT Cancel);
            
    /**
     * <p>id(0x21)</p>
     */
    @ComEventCallback(dispid = 0x21)
    void ProtectedViewWindowBeforeClose(ProtectedViewWindow PvWindow,
            Integer CloseReason,
            VARIANT Cancel);
            
    /**
     * <p>id(0x22)</p>
     */
    @ComEventCallback(dispid = 0x22)
    void ProtectedViewWindowSize(ProtectedViewWindow PvWindow);
            
    /**
     * <p>id(0x23)</p>
     */
    @ComEventCallback(dispid = 0x23)
    void ProtectedViewWindowActivate(ProtectedViewWindow PvWindow);
            
    /**
     * <p>id(0x24)</p>
     */
    @ComEventCallback(dispid = 0x24)
    void ProtectedViewWindowDeactivate(ProtectedViewWindow PvWindow);
            
    
}