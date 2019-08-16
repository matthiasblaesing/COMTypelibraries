
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({0006302B-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{0006302B-0000-0000-C000-000000000046}")
public interface ItemEvents_10 extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0xf003)</p>
     * @param Cancel [inout] {@code Boolean}
     */
    @ComMethod(name = "Open", dispId = 0xf003)
    com.sun.jna.platform.win32.WinNT.HRESULT Open(VARIANT Cancel);
            
    /**
     * <p>id(0xf006)</p>
     * @param Action [in] {@code com.sun.jna.platform.win32.COM.util.IDispatch}
     * @param Response [in] {@code com.sun.jna.platform.win32.COM.util.IDispatch}
     * @param Cancel [inout] {@code Boolean}
     */
    @ComMethod(name = "CustomAction", dispId = 0xf006)
    com.sun.jna.platform.win32.WinNT.HRESULT CustomAction(com.sun.jna.platform.win32.COM.util.IDispatch Action,
            com.sun.jna.platform.win32.COM.util.IDispatch Response,
            VARIANT Cancel);
            
    /**
     * <p>id(0xf008)</p>
     * @param Name [in] {@code String}
     */
    @ComMethod(name = "CustomPropertyChange", dispId = 0xf008)
    com.sun.jna.platform.win32.WinNT.HRESULT CustomPropertyChange(String Name);
            
    /**
     * <p>id(0xf468)</p>
     * @param Forward [in] {@code com.sun.jna.platform.win32.COM.util.IDispatch}
     * @param Cancel [inout] {@code Boolean}
     */
    @ComMethod(name = "Forward", dispId = 0xf468)
    com.sun.jna.platform.win32.WinNT.HRESULT Forward(com.sun.jna.platform.win32.COM.util.IDispatch Forward,
            VARIANT Cancel);
            
    /**
     * <p>id(0xf004)</p>
     * @param Cancel [inout] {@code Boolean}
     */
    @ComMethod(name = "Close", dispId = 0xf004)
    com.sun.jna.platform.win32.WinNT.HRESULT Close(VARIANT Cancel);
            
    /**
     * <p>id(0xf009)</p>
     * @param Name [in] {@code String}
     */
    @ComMethod(name = "PropertyChange", dispId = 0xf009)
    com.sun.jna.platform.win32.WinNT.HRESULT PropertyChange(String Name);
            
    /**
     * <p>id(0xf001)</p>
     */
    @ComMethod(name = "Read", dispId = 0xf001)
    com.sun.jna.platform.win32.WinNT.HRESULT Read();
            
    /**
     * <p>id(0xf466)</p>
     * @param Response [in] {@code com.sun.jna.platform.win32.COM.util.IDispatch}
     * @param Cancel [inout] {@code Boolean}
     */
    @ComMethod(name = "Reply", dispId = 0xf466)
    com.sun.jna.platform.win32.WinNT.HRESULT Reply(com.sun.jna.platform.win32.COM.util.IDispatch Response,
            VARIANT Cancel);
            
    /**
     * <p>id(0xf467)</p>
     * @param Response [in] {@code com.sun.jna.platform.win32.COM.util.IDispatch}
     * @param Cancel [inout] {@code Boolean}
     */
    @ComMethod(name = "ReplyAll", dispId = 0xf467)
    com.sun.jna.platform.win32.WinNT.HRESULT ReplyAll(com.sun.jna.platform.win32.COM.util.IDispatch Response,
            VARIANT Cancel);
            
    /**
     * <p>id(0xf005)</p>
     * @param Cancel [inout] {@code Boolean}
     */
    @ComMethod(name = "Send", dispId = 0xf005)
    com.sun.jna.platform.win32.WinNT.HRESULT Send(VARIANT Cancel);
            
    /**
     * <p>id(0xf002)</p>
     * @param Cancel [inout] {@code Boolean}
     */
    @ComMethod(name = "Write", dispId = 0xf002)
    com.sun.jna.platform.win32.WinNT.HRESULT Write(VARIANT Cancel);
            
    /**
     * <p>id(0xf00a)</p>
     * @param Cancel [inout] {@code Boolean}
     */
    @ComMethod(name = "BeforeCheckNames", dispId = 0xf00a)
    com.sun.jna.platform.win32.WinNT.HRESULT BeforeCheckNames(VARIANT Cancel);
            
    /**
     * <p>id(0xf00b)</p>
     * @param Attachment [in] {@code Attachment}
     */
    @ComMethod(name = "AttachmentAdd", dispId = 0xf00b)
    com.sun.jna.platform.win32.WinNT.HRESULT AttachmentAdd(Attachment Attachment);
            
    /**
     * <p>id(0xf00c)</p>
     * @param Attachment [in] {@code Attachment}
     */
    @ComMethod(name = "AttachmentRead", dispId = 0xf00c)
    com.sun.jna.platform.win32.WinNT.HRESULT AttachmentRead(Attachment Attachment);
            
    /**
     * <p>id(0xf00d)</p>
     * @param Attachment [in] {@code Attachment}
     * @param Cancel [inout] {@code Boolean}
     */
    @ComMethod(name = "BeforeAttachmentSave", dispId = 0xf00d)
    com.sun.jna.platform.win32.WinNT.HRESULT BeforeAttachmentSave(Attachment Attachment,
            VARIANT Cancel);
            
    /**
     * <p>id(0xfa75)</p>
     * @param Item [in] {@code com.sun.jna.platform.win32.COM.util.IDispatch}
     * @param Cancel [inout] {@code Boolean}
     */
    @ComMethod(name = "BeforeDelete", dispId = 0xfa75)
    void BeforeDelete(com.sun.jna.platform.win32.COM.util.IDispatch Item,
            VARIANT Cancel);
            
    /**
     * <p>id(0xfbae)</p>
     * @param Attachment [in] {@code Attachment}
     */
    @ComMethod(name = "AttachmentRemove", dispId = 0xfbae)
    void AttachmentRemove(Attachment Attachment);
            
    /**
     * <p>id(0xfbb0)</p>
     * @param Attachment [in] {@code Attachment}
     * @param Cancel [inout] {@code Boolean}
     */
    @ComMethod(name = "BeforeAttachmentAdd", dispId = 0xfbb0)
    void BeforeAttachmentAdd(Attachment Attachment,
            VARIANT Cancel);
            
    /**
     * <p>id(0xfbaf)</p>
     * @param Attachment [in] {@code Attachment}
     * @param Cancel [inout] {@code Boolean}
     */
    @ComMethod(name = "BeforeAttachmentPreview", dispId = 0xfbaf)
    void BeforeAttachmentPreview(Attachment Attachment,
            VARIANT Cancel);
            
    /**
     * <p>id(0xfbab)</p>
     * @param Attachment [in] {@code Attachment}
     * @param Cancel [inout] {@code Boolean}
     */
    @ComMethod(name = "BeforeAttachmentRead", dispId = 0xfbab)
    void BeforeAttachmentRead(Attachment Attachment,
            VARIANT Cancel);
            
    /**
     * <p>id(0xfbb2)</p>
     * @param Attachment [in] {@code Attachment}
     * @param Cancel [inout] {@code Boolean}
     */
    @ComMethod(name = "BeforeAttachmentWriteToTempFile", dispId = 0xfbb2)
    void BeforeAttachmentWriteToTempFile(Attachment Attachment,
            VARIANT Cancel);
            
    /**
     * <p>id(0xfbad)</p>
     */
    @ComMethod(name = "Unload", dispId = 0xfbad)
    void Unload();
            
    /**
     * <p>id(0xfc02)</p>
     * @param Cancel [inout] {@code Boolean}
     */
    @ComMethod(name = "BeforeAutoSave", dispId = 0xfc02)
    void BeforeAutoSave(VARIANT Cancel);
            
    /**
     * <p>id(0xfc8c)</p>
     */
    @ComMethod(name = "BeforeRead", dispId = 0xfc8c)
    void BeforeRead();
            
    /**
     * <p>id(0xfc8d)</p>
     */
    @ComMethod(name = "AfterWrite", dispId = 0xfc8d)
    void AfterWrite();
            
    /**
     * <p>id(0xfc8f)</p>
     * @param Cancel [inout] {@code Boolean}
     */
    @ComMethod(name = "ReadComplete", dispId = 0xfc8f)
    com.sun.jna.platform.win32.WinNT.HRESULT ReadComplete(VARIANT Cancel);
            
    
}