
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00063043-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{00063043-0000-0000-C000-000000000046}")
public interface Action {
    /**
     * <p>id(0xf000)</p>
     */
    @ComProperty(name = "Application", dispId = 0xf000)
    _Application getApplication();
            
    /**
     * <p>id(0xf00a)</p>
     */
    @ComProperty(name = "Class", dispId = 0xf00a)
    OlObjectClass get_Class();
            
    /**
     * <p>id(0xf00b)</p>
     */
    @ComProperty(name = "Session", dispId = 0xf00b)
    _NameSpace getSession();
            
    /**
     * <p>id(0xf001)</p>
     */
    @ComProperty(name = "Parent", dispId = 0xf001)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * <p>id(0x64)</p>
     */
    @ComProperty(name = "CopyLike", dispId = 0x64)
    OlActionCopyLike getCopyLike();
            
    /**
     * <p>id(0x64)</p>
     */
    @ComProperty(name = "CopyLike", dispId = 0x64)
    void setCopyLike(OlActionCopyLike param0);
            
    /**
     * <p>id(0x67)</p>
     */
    @ComProperty(name = "Enabled", dispId = 0x67)
    Boolean getEnabled();
            
    /**
     * <p>id(0x67)</p>
     */
    @ComProperty(name = "Enabled", dispId = 0x67)
    void setEnabled(Boolean param0);
            
    /**
     * <p>id(0x1a)</p>
     */
    @ComProperty(name = "MessageClass", dispId = 0x1a)
    String getMessageClass();
            
    /**
     * <p>id(0x1a)</p>
     */
    @ComProperty(name = "MessageClass", dispId = 0x1a)
    void setMessageClass(String param0);
            
    /**
     * <p>id(0x3001)</p>
     */
    @ComProperty(name = "Name", dispId = 0x3001)
    String getName();
            
    /**
     * <p>id(0x3001)</p>
     */
    @ComProperty(name = "Name", dispId = 0x3001)
    void setName(String param0);
            
    /**
     * <p>id(0x3d)</p>
     */
    @ComProperty(name = "Prefix", dispId = 0x3d)
    String getPrefix();
            
    /**
     * <p>id(0x3d)</p>
     */
    @ComProperty(name = "Prefix", dispId = 0x3d)
    void setPrefix(String param0);
            
    /**
     * <p>id(0x65)</p>
     */
    @ComProperty(name = "ReplyStyle", dispId = 0x65)
    OlActionReplyStyle getReplyStyle();
            
    /**
     * <p>id(0x65)</p>
     */
    @ComProperty(name = "ReplyStyle", dispId = 0x65)
    void setReplyStyle(OlActionReplyStyle param0);
            
    /**
     * <p>id(0x66)</p>
     */
    @ComProperty(name = "ResponseStyle", dispId = 0x66)
    OlActionResponseStyle getResponseStyle();
            
    /**
     * <p>id(0x66)</p>
     */
    @ComProperty(name = "ResponseStyle", dispId = 0x66)
    void setResponseStyle(OlActionResponseStyle param0);
            
    /**
     * <p>id(0x69)</p>
     */
    @ComProperty(name = "ShowOn", dispId = 0x69)
    OlActionShowOn getShowOn();
            
    /**
     * <p>id(0x69)</p>
     */
    @ComProperty(name = "ShowOn", dispId = 0x69)
    void setShowOn(OlActionShowOn param0);
            
    /**
     * <p>id(0x6c)</p>
     */
    @ComMethod(name = "Delete", dispId = 0x6c)
    void Delete();
            
    /**
     * <p>id(0x6a)</p>
     */
    @ComMethod(name = "Execute", dispId = 0x6a)
    com.sun.jna.platform.win32.COM.util.IDispatch Execute();
            
    
}