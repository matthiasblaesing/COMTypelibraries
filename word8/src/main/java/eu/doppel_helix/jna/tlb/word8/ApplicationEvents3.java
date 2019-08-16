
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00020A00-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{00020A00-0000-0000-C000-000000000046}")
public interface ApplicationEvents3 extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x1)</p>
     * <p>vtableId(7)</p>
     */
    @ComMethod(name = "Startup", dispId = 0x1)
    void Startup();
            
    /**
     * <p>id(0x2)</p>
     * <p>vtableId(8)</p>
     */
    @ComMethod(name = "Quit", dispId = 0x2)
    void Quit();
            
    /**
     * <p>id(0x3)</p>
     * <p>vtableId(9)</p>
     */
    @ComMethod(name = "DocumentChange", dispId = 0x3)
    void DocumentChange();
            
    /**
     * <p>id(0x4)</p>
     * <p>vtableId(10)</p>
     * @param Doc [in] {@code Document}
     */
    @ComMethod(name = "DocumentOpen", dispId = 0x4)
    void DocumentOpen(Document Doc);
            
    /**
     * <p>id(0x6)</p>
     * <p>vtableId(11)</p>
     * @param Doc [in] {@code Document}
     * @param Cancel [in] {@code Boolean}
     */
    @ComMethod(name = "DocumentBeforeClose", dispId = 0x6)
    void DocumentBeforeClose(Document Doc,
            Boolean Cancel);
            
    /**
     * <p>id(0x7)</p>
     * <p>vtableId(12)</p>
     * @param Doc [in] {@code Document}
     * @param Cancel [in] {@code Boolean}
     */
    @ComMethod(name = "DocumentBeforePrint", dispId = 0x7)
    void DocumentBeforePrint(Document Doc,
            Boolean Cancel);
            
    /**
     * <p>id(0x8)</p>
     * <p>vtableId(13)</p>
     * @param Doc [in] {@code Document}
     * @param SaveAsUI [in] {@code Boolean}
     * @param Cancel [in] {@code Boolean}
     */
    @ComMethod(name = "DocumentBeforeSave", dispId = 0x8)
    void DocumentBeforeSave(Document Doc,
            Boolean SaveAsUI,
            Boolean Cancel);
            
    /**
     * <p>id(0x9)</p>
     * <p>vtableId(14)</p>
     * @param Doc [in] {@code Document}
     */
    @ComMethod(name = "NewDocument", dispId = 0x9)
    void NewDocument(Document Doc);
            
    /**
     * <p>id(0xa)</p>
     * <p>vtableId(15)</p>
     * @param Doc [in] {@code Document}
     * @param Wn [in] {@code Window}
     */
    @ComMethod(name = "WindowActivate", dispId = 0xa)
    void WindowActivate(Document Doc,
            Window Wn);
            
    /**
     * <p>id(0xb)</p>
     * <p>vtableId(16)</p>
     * @param Doc [in] {@code Document}
     * @param Wn [in] {@code Window}
     */
    @ComMethod(name = "WindowDeactivate", dispId = 0xb)
    void WindowDeactivate(Document Doc,
            Window Wn);
            
    /**
     * <p>id(0xc)</p>
     * <p>vtableId(17)</p>
     * @param Sel [in] {@code Selection}
     */
    @ComMethod(name = "WindowSelectionChange", dispId = 0xc)
    void WindowSelectionChange(Selection Sel);
            
    /**
     * <p>id(0xd)</p>
     * <p>vtableId(18)</p>
     * @param Sel [in] {@code Selection}
     * @param Cancel [in] {@code Boolean}
     */
    @ComMethod(name = "WindowBeforeRightClick", dispId = 0xd)
    void WindowBeforeRightClick(Selection Sel,
            Boolean Cancel);
            
    /**
     * <p>id(0xe)</p>
     * <p>vtableId(19)</p>
     * @param Sel [in] {@code Selection}
     * @param Cancel [in] {@code Boolean}
     */
    @ComMethod(name = "WindowBeforeDoubleClick", dispId = 0xe)
    void WindowBeforeDoubleClick(Selection Sel,
            Boolean Cancel);
            
    /**
     * <p>id(0xf)</p>
     * <p>vtableId(20)</p>
     * @param Doc [in] {@code Document}
     */
    @ComMethod(name = "EPostagePropertyDialog", dispId = 0xf)
    void EPostagePropertyDialog(Document Doc);
            
    /**
     * <p>id(0x10)</p>
     * <p>vtableId(21)</p>
     * @param Doc [in] {@code Document}
     */
    @ComMethod(name = "EPostageInsert", dispId = 0x10)
    void EPostageInsert(Document Doc);
            
    /**
     * <p>id(0x11)</p>
     * <p>vtableId(22)</p>
     * @param Doc [in] {@code Document}
     * @param DocResult [in] {@code Document}
     */
    @ComMethod(name = "MailMergeAfterMerge", dispId = 0x11)
    void MailMergeAfterMerge(Document Doc,
            Document DocResult);
            
    /**
     * <p>id(0x12)</p>
     * <p>vtableId(23)</p>
     * @param Doc [in] {@code Document}
     */
    @ComMethod(name = "MailMergeAfterRecordMerge", dispId = 0x12)
    void MailMergeAfterRecordMerge(Document Doc);
            
    /**
     * <p>id(0x13)</p>
     * <p>vtableId(24)</p>
     * @param Doc [in] {@code Document}
     * @param StartRecord [in] {@code Integer}
     * @param EndRecord [in] {@code Integer}
     * @param Cancel [in] {@code Boolean}
     */
    @ComMethod(name = "MailMergeBeforeMerge", dispId = 0x13)
    void MailMergeBeforeMerge(Document Doc,
            Integer StartRecord,
            Integer EndRecord,
            Boolean Cancel);
            
    /**
     * <p>id(0x14)</p>
     * <p>vtableId(25)</p>
     * @param Doc [in] {@code Document}
     * @param Cancel [in] {@code Boolean}
     */
    @ComMethod(name = "MailMergeBeforeRecordMerge", dispId = 0x14)
    void MailMergeBeforeRecordMerge(Document Doc,
            Boolean Cancel);
            
    /**
     * <p>id(0x15)</p>
     * <p>vtableId(26)</p>
     * @param Doc [in] {@code Document}
     */
    @ComMethod(name = "MailMergeDataSourceLoad", dispId = 0x15)
    void MailMergeDataSourceLoad(Document Doc);
            
    /**
     * <p>id(0x16)</p>
     * <p>vtableId(27)</p>
     * @param Doc [in] {@code Document}
     * @param Handled [in] {@code Boolean}
     */
    @ComMethod(name = "MailMergeDataSourceValidate", dispId = 0x16)
    void MailMergeDataSourceValidate(Document Doc,
            Boolean Handled);
            
    /**
     * <p>id(0x17)</p>
     * <p>vtableId(28)</p>
     * @param Doc [in] {@code Document}
     */
    @ComMethod(name = "MailMergeWizardSendToCustom", dispId = 0x17)
    void MailMergeWizardSendToCustom(Document Doc);
            
    /**
     * <p>id(0x18)</p>
     * <p>vtableId(29)</p>
     * @param Doc [in] {@code Document}
     * @param FromState [in] {@code Integer}
     * @param ToState [in] {@code Integer}
     * @param Handled [in] {@code Boolean}
     */
    @ComMethod(name = "MailMergeWizardStateChange", dispId = 0x18)
    void MailMergeWizardStateChange(Document Doc,
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
    void WindowSize(Document Doc,
            Window Wn);
            
    
}