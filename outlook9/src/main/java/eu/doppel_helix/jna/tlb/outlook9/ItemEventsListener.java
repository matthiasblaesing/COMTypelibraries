
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.util.annotation.ComEventCallback;
import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({0006303A-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{0006303A-0000-0000-C000-000000000046}")
public interface ItemEventsListener {
    /**
     * <p>id(0xf003)</p>
     */
    @ComEventCallback(dispid = 0xf003)
    void Open(VARIANT Cancel);
            
    /**
     * <p>id(0xf006)</p>
     */
    @ComEventCallback(dispid = 0xf006)
    void CustomAction(com.sun.jna.platform.win32.COM.util.IDispatch Action,
            com.sun.jna.platform.win32.COM.util.IDispatch Response,
            VARIANT Cancel);
            
    /**
     * <p>id(0xf008)</p>
     */
    @ComEventCallback(dispid = 0xf008)
    void CustomPropertyChange(String Name);
            
    /**
     * <p>id(0xf468)</p>
     */
    @ComEventCallback(dispid = 0xf468)
    void Forward(com.sun.jna.platform.win32.COM.util.IDispatch Forward,
            VARIANT Cancel);
            
    /**
     * <p>id(0xf004)</p>
     */
    @ComEventCallback(dispid = 0xf004)
    void Close(VARIANT Cancel);
            
    /**
     * <p>id(0xf009)</p>
     */
    @ComEventCallback(dispid = 0xf009)
    void PropertyChange(String Name);
            
    /**
     * <p>id(0xf001)</p>
     */
    @ComEventCallback(dispid = 0xf001)
    void Read();
            
    /**
     * <p>id(0xf466)</p>
     */
    @ComEventCallback(dispid = 0xf466)
    void Reply(com.sun.jna.platform.win32.COM.util.IDispatch Response,
            VARIANT Cancel);
            
    /**
     * <p>id(0xf467)</p>
     */
    @ComEventCallback(dispid = 0xf467)
    void ReplyAll(com.sun.jna.platform.win32.COM.util.IDispatch Response,
            VARIANT Cancel);
            
    /**
     * <p>id(0xf005)</p>
     */
    @ComEventCallback(dispid = 0xf005)
    void Send(VARIANT Cancel);
            
    /**
     * <p>id(0xf002)</p>
     */
    @ComEventCallback(dispid = 0xf002)
    void Write(VARIANT Cancel);
            
    /**
     * <p>id(0xf00a)</p>
     */
    @ComEventCallback(dispid = 0xf00a)
    void BeforeCheckNames(VARIANT Cancel);
            
    /**
     * <p>id(0xf00b)</p>
     */
    @ComEventCallback(dispid = 0xf00b)
    void AttachmentAdd(Attachment Attachment);
            
    /**
     * <p>id(0xf00c)</p>
     */
    @ComEventCallback(dispid = 0xf00c)
    void AttachmentRead(Attachment Attachment);
            
    /**
     * <p>id(0xf00d)</p>
     */
    @ComEventCallback(dispid = 0xf00d)
    void BeforeAttachmentSave(Attachment Attachment,
            VARIANT Cancel);
            
    
}