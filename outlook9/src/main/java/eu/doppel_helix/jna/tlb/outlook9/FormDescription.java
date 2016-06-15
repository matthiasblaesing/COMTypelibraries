
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00063046-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{00063046-0000-0000-C000-000000000046}")
public interface FormDescription extends IUnknown, IRawDispatchHandle, IDispatch {
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
     * <p>id(0x3304)</p>
     */
    @ComProperty(name = "Category", dispId = 0x3304)
    String getCategory();
            
    /**
     * <p>id(0x3304)</p>
     */
    @ComProperty(name = "Category", dispId = 0x3304)
    void setCategory(String param0);
            
    /**
     * <p>id(0x3305)</p>
     */
    @ComProperty(name = "CategorySub", dispId = 0x3305)
    String getCategorySub();
            
    /**
     * <p>id(0x3305)</p>
     */
    @ComProperty(name = "CategorySub", dispId = 0x3305)
    void setCategorySub(String param0);
            
    /**
     * <p>id(0x3004)</p>
     */
    @ComProperty(name = "Comment", dispId = 0x3004)
    String getComment();
            
    /**
     * <p>id(0x3004)</p>
     */
    @ComProperty(name = "Comment", dispId = 0x3004)
    void setComment(String param0);
            
    /**
     * <p>id(0x3303)</p>
     */
    @ComProperty(name = "ContactName", dispId = 0x3303)
    String getContactName();
            
    /**
     * <p>id(0x3303)</p>
     */
    @ComProperty(name = "ContactName", dispId = 0x3303)
    void setContactName(String param0);
            
    /**
     * <p>id(0x3001)</p>
     */
    @ComProperty(name = "DisplayName", dispId = 0x3001)
    String getDisplayName();
            
    /**
     * <p>id(0x3001)</p>
     */
    @ComProperty(name = "DisplayName", dispId = 0x3001)
    void setDisplayName(String param0);
            
    /**
     * <p>id(0x3307)</p>
     */
    @ComProperty(name = "Hidden", dispId = 0x3307)
    Boolean getHidden();
            
    /**
     * <p>id(0x3307)</p>
     */
    @ComProperty(name = "Hidden", dispId = 0x3307)
    void setHidden(Boolean param0);
            
    /**
     * <p>id(0xffd)</p>
     */
    @ComProperty(name = "Icon", dispId = 0xffd)
    String getIcon();
            
    /**
     * <p>id(0xffd)</p>
     */
    @ComProperty(name = "Icon", dispId = 0xffd)
    void setIcon(String param0);
            
    /**
     * <p>id(0x66)</p>
     */
    @ComProperty(name = "Locked", dispId = 0x66)
    Boolean getLocked();
            
    /**
     * <p>id(0x66)</p>
     */
    @ComProperty(name = "Locked", dispId = 0x66)
    void setLocked(Boolean param0);
            
    /**
     * <p>id(0x1a)</p>
     */
    @ComProperty(name = "MessageClass", dispId = 0x1a)
    String getMessageClass();
            
    /**
     * <p>id(0xffc)</p>
     */
    @ComProperty(name = "MiniIcon", dispId = 0xffc)
    String getMiniIcon();
            
    /**
     * <p>id(0xffc)</p>
     */
    @ComProperty(name = "MiniIcon", dispId = 0xffc)
    void setMiniIcon(String param0);
            
    /**
     * <p>id(0xf01d)</p>
     */
    @ComProperty(name = "Name", dispId = 0xf01d)
    String getName();
            
    /**
     * <p>id(0xf01d)</p>
     */
    @ComProperty(name = "Name", dispId = 0xf01d)
    void setName(String param0);
            
    /**
     * <p>id(0x68)</p>
     */
    @ComProperty(name = "Number", dispId = 0x68)
    String getNumber();
            
    /**
     * <p>id(0x68)</p>
     */
    @ComProperty(name = "Number", dispId = 0x68)
    void setNumber(String param0);
            
    /**
     * <p>id(0x65)</p>
     */
    @ComProperty(name = "OneOff", dispId = 0x65)
    Boolean getOneOff();
            
    /**
     * <p>id(0x65)</p>
     */
    @ComProperty(name = "OneOff", dispId = 0x65)
    void setOneOff(Boolean param0);
            
    /**
     * <p>id(0x67)</p>
     */
    @ComProperty(name = "Password", dispId = 0x67)
    String getPassword();
            
    /**
     * <p>id(0x67)</p>
     */
    @ComProperty(name = "Password", dispId = 0x67)
    void setPassword(String param0);
            
    /**
     * <p>id(0x6d)</p>
     */
    @ComProperty(name = "ScriptText", dispId = 0x6d)
    String getScriptText();
            
    /**
     * <p>id(0x6a)</p>
     */
    @ComProperty(name = "Template", dispId = 0x6a)
    String getTemplate();
            
    /**
     * <p>id(0x6a)</p>
     */
    @ComProperty(name = "Template", dispId = 0x6a)
    void setTemplate(String param0);
            
    /**
     * <p>id(0x69)</p>
     */
    @ComProperty(name = "UseWordMail", dispId = 0x69)
    Boolean getUseWordMail();
            
    /**
     * <p>id(0x69)</p>
     */
    @ComProperty(name = "UseWordMail", dispId = 0x69)
    void setUseWordMail(Boolean param0);
            
    /**
     * <p>id(0x3301)</p>
     */
    @ComProperty(name = "Version", dispId = 0x3301)
    String getVersion();
            
    /**
     * <p>id(0x3301)</p>
     */
    @ComProperty(name = "Version", dispId = 0x3301)
    void setVersion(String param0);
            
    /**
     * <p>id(0x6b)</p>
     */
    @ComMethod(name = "PublishForm", dispId = 0x6b)
    void PublishForm(OlFormRegistry Registry,
            Object Folder);
            
    
}