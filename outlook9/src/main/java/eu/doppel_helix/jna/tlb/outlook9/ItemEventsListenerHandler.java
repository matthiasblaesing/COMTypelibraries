
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.util.AbstractComEventCallbackListener;
import com.sun.jna.platform.win32.COM.util.annotation.ComEventCallback;
import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({0006303A-0000-0000-C000-000000000046})</p>
 */
public abstract class ItemEventsListenerHandler extends AbstractComEventCallbackListener implements ItemEventsListener {
    @Override
    public void errorReceivingCallbackEvent(java.lang.String string, java.lang.Exception excptn) {
    }

    /**
     * <p>id(0xf003)</p>
     */
    @Override
    public void Open(VARIANT Cancel){
    }
            
    /**
     * <p>id(0xf006)</p>
     */
    @Override
    public void CustomAction(com.sun.jna.platform.win32.COM.util.IDispatch Action,
            com.sun.jna.platform.win32.COM.util.IDispatch Response,
            VARIANT Cancel){
    }
            
    /**
     * <p>id(0xf008)</p>
     */
    @Override
    public void CustomPropertyChange(String Name){
    }
            
    /**
     * <p>id(0xf468)</p>
     */
    @Override
    public void Forward(com.sun.jna.platform.win32.COM.util.IDispatch Forward,
            VARIANT Cancel){
    }
            
    /**
     * <p>id(0xf004)</p>
     */
    @Override
    public void Close(VARIANT Cancel){
    }
            
    /**
     * <p>id(0xf009)</p>
     */
    @Override
    public void PropertyChange(String Name){
    }
            
    /**
     * <p>id(0xf001)</p>
     */
    @Override
    public void Read(){
    }
            
    /**
     * <p>id(0xf466)</p>
     */
    @Override
    public void Reply(com.sun.jna.platform.win32.COM.util.IDispatch Response,
            VARIANT Cancel){
    }
            
    /**
     * <p>id(0xf467)</p>
     */
    @Override
    public void ReplyAll(com.sun.jna.platform.win32.COM.util.IDispatch Response,
            VARIANT Cancel){
    }
            
    /**
     * <p>id(0xf005)</p>
     */
    @Override
    public void Send(VARIANT Cancel){
    }
            
    /**
     * <p>id(0xf002)</p>
     */
    @Override
    public void Write(VARIANT Cancel){
    }
            
    /**
     * <p>id(0xf00a)</p>
     */
    @Override
    public void BeforeCheckNames(VARIANT Cancel){
    }
            
    /**
     * <p>id(0xf00b)</p>
     */
    @Override
    public void AttachmentAdd(Attachment Attachment){
    }
            
    /**
     * <p>id(0xf00c)</p>
     */
    @Override
    public void AttachmentRead(Attachment Attachment){
    }
            
    /**
     * <p>id(0xf00d)</p>
     */
    @Override
    public void BeforeAttachmentSave(Attachment Attachment,
            VARIANT Cancel){
    }
            
    
}