
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.AbstractComEventCallbackListener;
import com.sun.jna.platform.win32.COM.util.annotation.ComEventCallback;
import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00020A00-0000-0000-C000-000000000046})</p>
 */
public abstract class ApplicationEvents3ListenerHandler extends AbstractComEventCallbackListener implements ApplicationEvents3Listener {
    @Override
    public void errorReceivingCallbackEvent(java.lang.String string, java.lang.Exception excptn) {
    }

    /**
     * <p>id(0x1)</p>
     */
    @Override
    public void Startup(){
    }
            
    /**
     * <p>id(0x2)</p>
     */
    @Override
    public void Quit(){
    }
            
    /**
     * <p>id(0x3)</p>
     */
    @Override
    public void DocumentChange(){
    }
            
    /**
     * <p>id(0x4)</p>
     */
    @Override
    public void DocumentOpen(Document Doc){
    }
            
    /**
     * <p>id(0x6)</p>
     */
    @Override
    public void DocumentBeforeClose(Document Doc,
            Boolean Cancel){
    }
            
    /**
     * <p>id(0x7)</p>
     */
    @Override
    public void DocumentBeforePrint(Document Doc,
            Boolean Cancel){
    }
            
    /**
     * <p>id(0x8)</p>
     */
    @Override
    public void DocumentBeforeSave(Document Doc,
            Boolean SaveAsUI,
            Boolean Cancel){
    }
            
    /**
     * <p>id(0x9)</p>
     */
    @Override
    public void NewDocument(Document Doc){
    }
            
    /**
     * <p>id(0xa)</p>
     */
    @Override
    public void WindowActivate(Document Doc,
            Window Wn){
    }
            
    /**
     * <p>id(0xb)</p>
     */
    @Override
    public void WindowDeactivate(Document Doc,
            Window Wn){
    }
            
    /**
     * <p>id(0xc)</p>
     */
    @Override
    public void WindowSelectionChange(Selection Sel){
    }
            
    /**
     * <p>id(0xd)</p>
     */
    @Override
    public void WindowBeforeRightClick(Selection Sel,
            Boolean Cancel){
    }
            
    /**
     * <p>id(0xe)</p>
     */
    @Override
    public void WindowBeforeDoubleClick(Selection Sel,
            Boolean Cancel){
    }
            
    /**
     * <p>id(0xf)</p>
     */
    @Override
    public void EPostagePropertyDialog(Document Doc){
    }
            
    /**
     * <p>id(0x10)</p>
     */
    @Override
    public void EPostageInsert(Document Doc){
    }
            
    /**
     * <p>id(0x11)</p>
     */
    @Override
    public void MailMergeAfterMerge(Document Doc,
            Document DocResult){
    }
            
    /**
     * <p>id(0x12)</p>
     */
    @Override
    public void MailMergeAfterRecordMerge(Document Doc){
    }
            
    /**
     * <p>id(0x13)</p>
     */
    @Override
    public void MailMergeBeforeMerge(Document Doc,
            Integer StartRecord,
            Integer EndRecord,
            Boolean Cancel){
    }
            
    /**
     * <p>id(0x14)</p>
     */
    @Override
    public void MailMergeBeforeRecordMerge(Document Doc,
            Boolean Cancel){
    }
            
    /**
     * <p>id(0x15)</p>
     */
    @Override
    public void MailMergeDataSourceLoad(Document Doc){
    }
            
    /**
     * <p>id(0x16)</p>
     */
    @Override
    public void MailMergeDataSourceValidate(Document Doc,
            Boolean Handled){
    }
            
    /**
     * <p>id(0x17)</p>
     */
    @Override
    public void MailMergeWizardSendToCustom(Document Doc){
    }
            
    /**
     * <p>id(0x18)</p>
     */
    @Override
    public void MailMergeWizardStateChange(Document Doc,
            Integer FromState,
            Integer ToState,
            Boolean Handled){
    }
            
    /**
     * <p>id(0x19)</p>
     */
    @Override
    public void WindowSize(Document Doc,
            Window Wn){
    }
            
    
}