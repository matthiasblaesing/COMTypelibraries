
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00063043-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{00063043-0000-0000-C000-000000000046}")
public interface Action extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0xf000)</p>
     * <p>vtableId(7)</p>
     */
    @ComProperty(name = "Application", dispId = 0xf000)
    _Application getApplication();
            
    /**
     * <p>id(0xf00a)</p>
     * <p>vtableId(8)</p>
     */
    @ComProperty(name = "Class", dispId = 0xf00a)
    OlObjectClass get_Class();
            
    /**
     * <p>id(0xf00b)</p>
     * <p>vtableId(9)</p>
     */
    @ComProperty(name = "Session", dispId = 0xf00b)
    _NameSpace getSession();
            
    /**
     * <p>id(0xf001)</p>
     * <p>vtableId(10)</p>
     */
    @ComProperty(name = "Parent", dispId = 0xf001)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * <p>id(0x64)</p>
     * <p>vtableId(11)</p>
     */
    @ComProperty(name = "CopyLike", dispId = 0x64)
    OlActionCopyLike getCopyLike();
            
    /**
     * <p>id(0x64)</p>
     * <p>vtableId(12)</p>
     * @param param0 [in] {@code OlActionCopyLike}
     */
    @ComProperty(name = "CopyLike", dispId = 0x64)
    void setCopyLike(OlActionCopyLike param0);
            
    /**
     * <p>id(0x67)</p>
     * <p>vtableId(13)</p>
     */
    @ComProperty(name = "Enabled", dispId = 0x67)
    Boolean getEnabled();
            
    /**
     * <p>id(0x67)</p>
     * <p>vtableId(14)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "Enabled", dispId = 0x67)
    void setEnabled(Boolean param0);
            
    /**
     * <p>id(0x1a)</p>
     * <p>vtableId(15)</p>
     */
    @ComProperty(name = "MessageClass", dispId = 0x1a)
    String getMessageClass();
            
    /**
     * <p>id(0x1a)</p>
     * <p>vtableId(16)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "MessageClass", dispId = 0x1a)
    void setMessageClass(String param0);
            
    /**
     * <p>id(0x3001)</p>
     * <p>vtableId(17)</p>
     */
    @ComProperty(name = "Name", dispId = 0x3001)
    String getName();
            
    /**
     * <p>id(0x3001)</p>
     * <p>vtableId(18)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "Name", dispId = 0x3001)
    void setName(String param0);
            
    /**
     * <p>id(0x3d)</p>
     * <p>vtableId(19)</p>
     */
    @ComProperty(name = "Prefix", dispId = 0x3d)
    String getPrefix();
            
    /**
     * <p>id(0x3d)</p>
     * <p>vtableId(20)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "Prefix", dispId = 0x3d)
    void setPrefix(String param0);
            
    /**
     * <p>id(0x65)</p>
     * <p>vtableId(21)</p>
     */
    @ComProperty(name = "ReplyStyle", dispId = 0x65)
    OlActionReplyStyle getReplyStyle();
            
    /**
     * <p>id(0x65)</p>
     * <p>vtableId(22)</p>
     * @param param0 [in] {@code OlActionReplyStyle}
     */
    @ComProperty(name = "ReplyStyle", dispId = 0x65)
    void setReplyStyle(OlActionReplyStyle param0);
            
    /**
     * <p>id(0x66)</p>
     * <p>vtableId(23)</p>
     */
    @ComProperty(name = "ResponseStyle", dispId = 0x66)
    OlActionResponseStyle getResponseStyle();
            
    /**
     * <p>id(0x66)</p>
     * <p>vtableId(24)</p>
     * @param param0 [in] {@code OlActionResponseStyle}
     */
    @ComProperty(name = "ResponseStyle", dispId = 0x66)
    void setResponseStyle(OlActionResponseStyle param0);
            
    /**
     * <p>id(0x69)</p>
     * <p>vtableId(25)</p>
     */
    @ComProperty(name = "ShowOn", dispId = 0x69)
    OlActionShowOn getShowOn();
            
    /**
     * <p>id(0x69)</p>
     * <p>vtableId(26)</p>
     * @param param0 [in] {@code OlActionShowOn}
     */
    @ComProperty(name = "ShowOn", dispId = 0x69)
    void setShowOn(OlActionShowOn param0);
            
    /**
     * <p>id(0x6c)</p>
     * <p>vtableId(27)</p>
     */
    @ComMethod(name = "Delete", dispId = 0x6c)
    void Delete();
            
    /**
     * <p>id(0x6a)</p>
     * <p>vtableId(28)</p>
     */
    @ComMethod(name = "Execute", dispId = 0x6a)
    com.sun.jna.platform.win32.COM.util.IDispatch Execute();
            
    
}