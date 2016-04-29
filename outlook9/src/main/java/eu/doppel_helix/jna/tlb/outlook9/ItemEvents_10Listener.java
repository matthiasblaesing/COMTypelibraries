
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.util.annotation.ComEventCallback;
import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({0006302B-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{0006302B-0000-0000-C000-000000000046}")
public interface ItemEvents_10Listener {
    /**
     * <p>id(0xf003)</p>
     */
    @ComEventCallback(dispid = 0xf003)
    com.sun.jna.platform.win32.WinNT.HRESULT Open(VARIANT Cancel);
            
    /**
     * <p>id(0xf006)</p>
     */
    @ComEventCallback(dispid = 0xf006)
    com.sun.jna.platform.win32.WinNT.HRESULT CustomAction(com.sun.jna.platform.win32.COM.util.IDispatch Action,
            com.sun.jna.platform.win32.COM.util.IDispatch Response,
            VARIANT Cancel);
            
    /**
     * <p>id(0xf008)</p>
     */
    @ComEventCallback(dispid = 0xf008)
    com.sun.jna.platform.win32.WinNT.HRESULT CustomPropertyChange(String Name);
            
    /**
     * <p>id(0xf468)</p>
     */
    @ComEventCallback(dispid = 0xf468)
    com.sun.jna.platform.win32.WinNT.HRESULT Forward(com.sun.jna.platform.win32.COM.util.IDispatch Forward,
            VARIANT Cancel);
            
    /**
     * <p>id(0xf004)</p>
     */
    @ComEventCallback(dispid = 0xf004)
    com.sun.jna.platform.win32.WinNT.HRESULT Close(VARIANT Cancel);
            
    /**
     * <p>id(0xf009)</p>
     */
    @ComEventCallback(dispid = 0xf009)
    com.sun.jna.platform.win32.WinNT.HRESULT PropertyChange(String Name);
            
    /**
     * <p>id(0xf001)</p>
     */
    @ComEventCallback(dispid = 0xf001)
    com.sun.jna.platform.win32.WinNT.HRESULT Read();
            
    /**
     * <p>id(0xf466)</p>
     */
    @ComEventCallback(dispid = 0xf466)
    com.sun.jna.platform.win32.WinNT.HRESULT Reply(com.sun.jna.platform.win32.COM.util.IDispatch Response,
            VARIANT Cancel);
            
    /**
     * <p>id(0xf467)</p>
     */
    @ComEventCallback(dispid = 0xf467)
    com.sun.jna.platform.win32.WinNT.HRESULT ReplyAll(com.sun.jna.platform.win32.COM.util.IDispatch Response,
            VARIANT Cancel);
            
    /**
     * <p>id(0xf005)</p>
     */
    @ComEventCallback(dispid = 0xf005)
    com.sun.jna.platform.win32.WinNT.HRESULT Send(VARIANT Cancel);
            
    /**
     * <p>id(0xf002)</p>
     */
    @ComEventCallback(dispid = 0xf002)
    com.sun.jna.platform.win32.WinNT.HRESULT Write(VARIANT Cancel);
            
    /**
     * <p>id(0xf00a)</p>
     */
    @ComEventCallback(dispid = 0xf00a)
    com.sun.jna.platform.win32.WinNT.HRESULT BeforeCheckNames(VARIANT Cancel);
            
    /**
     * <p>id(0xf00b)</p>
     */
    @ComEventCallback(dispid = 0xf00b)
    com.sun.jna.platform.win32.WinNT.HRESULT AttachmentAdd(Attachment Attachment);
            
    /**
     * <p>id(0xf00c)</p>
     */
    @ComEventCallback(dispid = 0xf00c)
    com.sun.jna.platform.win32.WinNT.HRESULT AttachmentRead(Attachment Attachment);
            
    /**
     * <p>id(0xf00d)</p>
     */
    @ComEventCallback(dispid = 0xf00d)
    com.sun.jna.platform.win32.WinNT.HRESULT BeforeAttachmentSave(Attachment Attachment,
            VARIANT Cancel);
            
    /**
     * <p>id(0xfa75)</p>
     */
    @ComEventCallback(dispid = 0xfa75)
    void BeforeDelete(com.sun.jna.platform.win32.COM.util.IDispatch Item,
            VARIANT Cancel);
            
    /**
     * <p>id(0xfbae)</p>
     */
    @ComEventCallback(dispid = 0xfbae)
    void AttachmentRemove(Attachment Attachment);
            
    /**
     * <p>id(0xfbb0)</p>
     */
    @ComEventCallback(dispid = 0xfbb0)
    void BeforeAttachmentAdd(Attachment Attachment,
            VARIANT Cancel);
            
    /**
     * <p>id(0xfbaf)</p>
     */
    @ComEventCallback(dispid = 0xfbaf)
    void BeforeAttachmentPreview(Attachment Attachment,
            VARIANT Cancel);
            
    /**
     * <p>id(0xfbab)</p>
     */
    @ComEventCallback(dispid = 0xfbab)
    void BeforeAttachmentRead(Attachment Attachment,
            VARIANT Cancel);
            
    /**
     * <p>id(0xfbb2)</p>
     */
    @ComEventCallback(dispid = 0xfbb2)
    void BeforeAttachmentWriteToTempFile(Attachment Attachment,
            VARIANT Cancel);
            
    /**
     * <p>id(0xfbad)</p>
     */
    @ComEventCallback(dispid = 0xfbad)
    void Unload();
            
    /**
     * <p>id(0xfc02)</p>
     */
    @ComEventCallback(dispid = 0xfc02)
    void BeforeAutoSave(VARIANT Cancel);
            
    /**
     * <p>id(0xfc8c)</p>
     */
    @ComEventCallback(dispid = 0xfc8c)
    void BeforeRead();
            
    /**
     * <p>id(0xfc8d)</p>
     */
    @ComEventCallback(dispid = 0xfc8d)
    void AfterWrite();
            
    /**
     * <p>id(0xfc8f)</p>
     */
    @ComEventCallback(dispid = 0xfc8f)
    com.sun.jna.platform.win32.WinNT.HRESULT ReadComplete(VARIANT Cancel);
            
    
}