
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.util.AbstractComEventCallbackListener;
import com.sun.jna.platform.win32.COM.util.annotation.ComEventCallback;
import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({0006302B-0000-0000-C000-000000000046})</p>
 */
public abstract class ItemEvents_10ListenerHandler extends AbstractComEventCallbackListener implements ItemEvents_10Listener {
    @Override
    public void errorReceivingCallbackEvent(java.lang.String string, java.lang.Exception excptn) {
    }

    /**
     * <p>id(0xf003)</p>
     */
    @Override
    public abstract com.sun.jna.platform.win32.WinNT.HRESULT Open(VARIANT Cancel);
            
    /**
     * <p>id(0xf006)</p>
     */
    @Override
    public abstract com.sun.jna.platform.win32.WinNT.HRESULT CustomAction(com.sun.jna.platform.win32.COM.util.IDispatch Action,
            com.sun.jna.platform.win32.COM.util.IDispatch Response,
            VARIANT Cancel);
            
    /**
     * <p>id(0xf008)</p>
     */
    @Override
    public abstract com.sun.jna.platform.win32.WinNT.HRESULT CustomPropertyChange(String Name);
            
    /**
     * <p>id(0xf468)</p>
     */
    @Override
    public abstract com.sun.jna.platform.win32.WinNT.HRESULT Forward(com.sun.jna.platform.win32.COM.util.IDispatch Forward,
            VARIANT Cancel);
            
    /**
     * <p>id(0xf004)</p>
     */
    @Override
    public abstract com.sun.jna.platform.win32.WinNT.HRESULT Close(VARIANT Cancel);
            
    /**
     * <p>id(0xf009)</p>
     */
    @Override
    public abstract com.sun.jna.platform.win32.WinNT.HRESULT PropertyChange(String Name);
            
    /**
     * <p>id(0xf001)</p>
     */
    @Override
    public abstract com.sun.jna.platform.win32.WinNT.HRESULT Read();
            
    /**
     * <p>id(0xf466)</p>
     */
    @Override
    public abstract com.sun.jna.platform.win32.WinNT.HRESULT Reply(com.sun.jna.platform.win32.COM.util.IDispatch Response,
            VARIANT Cancel);
            
    /**
     * <p>id(0xf467)</p>
     */
    @Override
    public abstract com.sun.jna.platform.win32.WinNT.HRESULT ReplyAll(com.sun.jna.platform.win32.COM.util.IDispatch Response,
            VARIANT Cancel);
            
    /**
     * <p>id(0xf005)</p>
     */
    @Override
    public abstract com.sun.jna.platform.win32.WinNT.HRESULT Send(VARIANT Cancel);
            
    /**
     * <p>id(0xf002)</p>
     */
    @Override
    public abstract com.sun.jna.platform.win32.WinNT.HRESULT Write(VARIANT Cancel);
            
    /**
     * <p>id(0xf00a)</p>
     */
    @Override
    public abstract com.sun.jna.platform.win32.WinNT.HRESULT BeforeCheckNames(VARIANT Cancel);
            
    /**
     * <p>id(0xf00b)</p>
     */
    @Override
    public abstract com.sun.jna.platform.win32.WinNT.HRESULT AttachmentAdd(Attachment Attachment);
            
    /**
     * <p>id(0xf00c)</p>
     */
    @Override
    public abstract com.sun.jna.platform.win32.WinNT.HRESULT AttachmentRead(Attachment Attachment);
            
    /**
     * <p>id(0xf00d)</p>
     */
    @Override
    public abstract com.sun.jna.platform.win32.WinNT.HRESULT BeforeAttachmentSave(Attachment Attachment,
            VARIANT Cancel);
            
    /**
     * <p>id(0xfa75)</p>
     */
    @Override
    public void BeforeDelete(com.sun.jna.platform.win32.COM.util.IDispatch Item,
            VARIANT Cancel){
    }
            
    /**
     * <p>id(0xfbae)</p>
     */
    @Override
    public void AttachmentRemove(Attachment Attachment){
    }
            
    /**
     * <p>id(0xfbb0)</p>
     */
    @Override
    public void BeforeAttachmentAdd(Attachment Attachment,
            VARIANT Cancel){
    }
            
    /**
     * <p>id(0xfbaf)</p>
     */
    @Override
    public void BeforeAttachmentPreview(Attachment Attachment,
            VARIANT Cancel){
    }
            
    /**
     * <p>id(0xfbab)</p>
     */
    @Override
    public void BeforeAttachmentRead(Attachment Attachment,
            VARIANT Cancel){
    }
            
    /**
     * <p>id(0xfbb2)</p>
     */
    @Override
    public void BeforeAttachmentWriteToTempFile(Attachment Attachment,
            VARIANT Cancel){
    }
            
    /**
     * <p>id(0xfbad)</p>
     */
    @Override
    public void Unload(){
    }
            
    /**
     * <p>id(0xfc02)</p>
     */
    @Override
    public void BeforeAutoSave(VARIANT Cancel){
    }
            
    /**
     * <p>id(0xfc8c)</p>
     */
    @Override
    public void BeforeRead(){
    }
            
    /**
     * <p>id(0xfc8d)</p>
     */
    @Override
    public void AfterWrite(){
    }
            
    /**
     * <p>id(0xfc8f)</p>
     */
    @Override
    public abstract com.sun.jna.platform.win32.WinNT.HRESULT ReadComplete(VARIANT Cancel);
            
    
}