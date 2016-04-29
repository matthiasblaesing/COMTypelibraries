
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00020A01-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{00020A01-0000-0000-C000-000000000046}")
public interface ApplicationEvents4 {
    /**
     * <p>id(0x1)</p>
     */
    @ComMethod(name = "Startup", dispId = 0x1)
    void Startup();
            
    /**
     * <p>id(0x2)</p>
     */
    @ComMethod(name = "Quit", dispId = 0x2)
    void Quit();
            
    /**
     * <p>id(0x3)</p>
     */
    @ComMethod(name = "DocumentChange", dispId = 0x3)
    void DocumentChange();
            
    /**
     * <p>id(0x4)</p>
     */
    @ComMethod(name = "DocumentOpen", dispId = 0x4)
    void DocumentOpen(Document Doc);
            
    /**
     * <p>id(0x6)</p>
     */
    @ComMethod(name = "DocumentBeforeClose", dispId = 0x6)
    void DocumentBeforeClose(Document Doc,
            VARIANT Cancel);
            
    /**
     * <p>id(0x7)</p>
     */
    @ComMethod(name = "DocumentBeforePrint", dispId = 0x7)
    void DocumentBeforePrint(Document Doc,
            VARIANT Cancel);
            
    /**
     * <p>id(0x8)</p>
     */
    @ComMethod(name = "DocumentBeforeSave", dispId = 0x8)
    void DocumentBeforeSave(Document Doc,
            Boolean SaveAsUI,
            VARIANT Cancel);
            
    /**
     * <p>id(0x9)</p>
     */
    @ComMethod(name = "NewDocument", dispId = 0x9)
    void NewDocument(Document Doc);
            
    /**
     * <p>id(0xa)</p>
     */
    @ComMethod(name = "WindowActivate", dispId = 0xa)
    void WindowActivate(Document Doc,
            Window Wn);
            
    /**
     * <p>id(0xb)</p>
     */
    @ComMethod(name = "WindowDeactivate", dispId = 0xb)
    void WindowDeactivate(Document Doc,
            Window Wn);
            
    /**
     * <p>id(0xc)</p>
     */
    @ComMethod(name = "WindowSelectionChange", dispId = 0xc)
    void WindowSelectionChange(Selection Sel);
            
    /**
     * <p>id(0xd)</p>
     */
    @ComMethod(name = "WindowBeforeRightClick", dispId = 0xd)
    void WindowBeforeRightClick(Selection Sel,
            VARIANT Cancel);
            
    /**
     * <p>id(0xe)</p>
     */
    @ComMethod(name = "WindowBeforeDoubleClick", dispId = 0xe)
    void WindowBeforeDoubleClick(Selection Sel,
            VARIANT Cancel);
            
    /**
     * <p>id(0xf)</p>
     */
    @ComMethod(name = "EPostagePropertyDialog", dispId = 0xf)
    void EPostagePropertyDialog(Document Doc);
            
    /**
     * <p>id(0x10)</p>
     */
    @ComMethod(name = "EPostageInsert", dispId = 0x10)
    void EPostageInsert(Document Doc);
            
    /**
     * <p>id(0x11)</p>
     */
    @ComMethod(name = "MailMergeAfterMerge", dispId = 0x11)
    void MailMergeAfterMerge(Document Doc,
            Document DocResult);
            
    /**
     * <p>id(0x12)</p>
     */
    @ComMethod(name = "MailMergeAfterRecordMerge", dispId = 0x12)
    void MailMergeAfterRecordMerge(Document Doc);
            
    /**
     * <p>id(0x13)</p>
     */
    @ComMethod(name = "MailMergeBeforeMerge", dispId = 0x13)
    void MailMergeBeforeMerge(Document Doc,
            Integer StartRecord,
            Integer EndRecord,
            VARIANT Cancel);
            
    /**
     * <p>id(0x14)</p>
     */
    @ComMethod(name = "MailMergeBeforeRecordMerge", dispId = 0x14)
    void MailMergeBeforeRecordMerge(Document Doc,
            VARIANT Cancel);
            
    /**
     * <p>id(0x15)</p>
     */
    @ComMethod(name = "MailMergeDataSourceLoad", dispId = 0x15)
    void MailMergeDataSourceLoad(Document Doc);
            
    /**
     * <p>id(0x16)</p>
     */
    @ComMethod(name = "MailMergeDataSourceValidate", dispId = 0x16)
    void MailMergeDataSourceValidate(Document Doc,
            Boolean Handled);
            
    /**
     * <p>id(0x17)</p>
     */
    @ComMethod(name = "MailMergeWizardSendToCustom", dispId = 0x17)
    void MailMergeWizardSendToCustom(Document Doc);
            
    /**
     * <p>id(0x18)</p>
     */
    @ComMethod(name = "MailMergeWizardStateChange", dispId = 0x18)
    void MailMergeWizardStateChange(Document Doc,
            Integer FromState,
            Integer ToState,
            Boolean Handled);
            
    /**
     * <p>id(0x19)</p>
     */
    @ComMethod(name = "WindowSize", dispId = 0x19)
    void WindowSize(Document Doc,
            Window Wn);
            
    /**
     * <p>id(0x1a)</p>
     */
    @ComMethod(name = "XMLSelectionChange", dispId = 0x1a)
    void XMLSelectionChange(Selection Sel,
            XMLNode OldXMLNode,
            XMLNode NewXMLNode,
            Integer Reason);
            
    /**
     * <p>id(0x1b)</p>
     */
    @ComMethod(name = "XMLValidationError", dispId = 0x1b)
    void XMLValidationError(XMLNode XMLNode);
            
    /**
     * <p>id(0x1c)</p>
     */
    @ComMethod(name = "DocumentSync", dispId = 0x1c)
    void DocumentSync(Document Doc,
            eu.doppel_helix.jna.tlb.office2.MsoSyncEventType SyncEventType);
            
    /**
     * <p>id(0x1d)</p>
     */
    @ComMethod(name = "EPostageInsertEx", dispId = 0x1d)
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
    @ComMethod(name = "MailMergeDataSourceValidate2", dispId = 0x1e)
    void MailMergeDataSourceValidate2(Document Doc,
            VARIANT Handled);
            
    /**
     * <p>id(0x1f)</p>
     */
    @ComMethod(name = "ProtectedViewWindowOpen", dispId = 0x1f)
    void ProtectedViewWindowOpen(ProtectedViewWindow PvWindow);
            
    /**
     * <p>id(0x20)</p>
     */
    @ComMethod(name = "ProtectedViewWindowBeforeEdit", dispId = 0x20)
    void ProtectedViewWindowBeforeEdit(ProtectedViewWindow PvWindow,
            VARIANT Cancel);
            
    /**
     * <p>id(0x21)</p>
     */
    @ComMethod(name = "ProtectedViewWindowBeforeClose", dispId = 0x21)
    void ProtectedViewWindowBeforeClose(ProtectedViewWindow PvWindow,
            Integer CloseReason,
            VARIANT Cancel);
            
    /**
     * <p>id(0x22)</p>
     */
    @ComMethod(name = "ProtectedViewWindowSize", dispId = 0x22)
    void ProtectedViewWindowSize(ProtectedViewWindow PvWindow);
            
    /**
     * <p>id(0x23)</p>
     */
    @ComMethod(name = "ProtectedViewWindowActivate", dispId = 0x23)
    void ProtectedViewWindowActivate(ProtectedViewWindow PvWindow);
            
    /**
     * <p>id(0x24)</p>
     */
    @ComMethod(name = "ProtectedViewWindowDeactivate", dispId = 0x24)
    void ProtectedViewWindowDeactivate(ProtectedViewWindow PvWindow);
            
    
}