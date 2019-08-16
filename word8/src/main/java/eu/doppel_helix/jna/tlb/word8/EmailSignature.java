
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000209DC-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000209DC-0000-0000-C000-000000000046}")
public interface EmailSignature extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x64)</p>
     * <p>vtableId(7)</p>
     */
    @ComProperty(name = "Application", dispId = 0x64)
    Application getApplication();
            
    /**
     * <p>id(0x65)</p>
     * <p>vtableId(8)</p>
     */
    @ComProperty(name = "Creator", dispId = 0x65)
    Integer getCreator();
            
    /**
     * <p>id(0x66)</p>
     * <p>vtableId(9)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x66)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * <p>id(0x67)</p>
     * <p>vtableId(10)</p>
     */
    @ComProperty(name = "NewMessageSignature", dispId = 0x67)
    String getNewMessageSignature();
            
    /**
     * <p>id(0x67)</p>
     * <p>vtableId(11)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "NewMessageSignature", dispId = 0x67)
    void setNewMessageSignature(String param0);
            
    /**
     * <p>id(0x68)</p>
     * <p>vtableId(12)</p>
     */
    @ComProperty(name = "ReplyMessageSignature", dispId = 0x68)
    String getReplyMessageSignature();
            
    /**
     * <p>id(0x68)</p>
     * <p>vtableId(13)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "ReplyMessageSignature", dispId = 0x68)
    void setReplyMessageSignature(String param0);
            
    /**
     * <p>id(0x69)</p>
     * <p>vtableId(14)</p>
     */
    @ComProperty(name = "EmailSignatureEntries", dispId = 0x69)
    EmailSignatureEntries getEmailSignatureEntries();
            
    
}