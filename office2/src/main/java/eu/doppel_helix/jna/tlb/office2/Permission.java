
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000C0376-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000C0376-0000-0000-C000-000000000046}")
public interface Permission extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x60020000)</p>
     */
    @ComProperty(name = "Application", dispId = 0x60020000)
    com.sun.jna.platform.win32.COM.util.IDispatch getApplication();
            
    /**
     * <p>id(0x60020001)</p>
     */
    @ComProperty(name = "Creator", dispId = 0x60020001)
    Integer getCreator();
            
    /**
     * <p>id(0x0)</p>
     */
    @ComProperty(name = "Item", dispId = 0x0)
    UserPermission getItem(Object Index);
            
    /**
     * <p>id(0x1)</p>
     */
    @ComProperty(name = "Count", dispId = 0x1)
    Integer getCount();
            
    /**
     * <p>id(0x2)</p>
     */
    @ComProperty(name = "EnableTrustedBrowser", dispId = 0x2)
    Boolean getEnableTrustedBrowser();
            
    /**
     * <p>id(0x2)</p>
     */
    @ComProperty(name = "EnableTrustedBrowser", dispId = 0x2)
    void setEnableTrustedBrowser(Boolean param0);
            
    /**
     * <p>id(0x3)</p>
     */
    @ComMethod(name = "Add", dispId = 0x3)
    UserPermission Add(String UserId,
            Object Permission,
            Object ExpirationDate);
            
    /**
     * <p>id(0x4)</p>
     */
    @ComMethod(name = "ApplyPolicy", dispId = 0x4)
    void ApplyPolicy(String FileName);
            
    /**
     * <p>id(0x5)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x5)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * <p>id(0x6)</p>
     */
    @ComMethod(name = "RemoveAll", dispId = 0x6)
    void RemoveAll();
            
    /**
     * <p>id(0x7)</p>
     */
    @ComProperty(name = "Enabled", dispId = 0x7)
    Boolean getEnabled();
            
    /**
     * <p>id(0x7)</p>
     */
    @ComProperty(name = "Enabled", dispId = 0x7)
    void setEnabled(Boolean param0);
            
    /**
     * <p>id(0x8)</p>
     */
    @ComProperty(name = "RequestPermissionURL", dispId = 0x8)
    String getRequestPermissionURL();
            
    /**
     * <p>id(0x8)</p>
     */
    @ComProperty(name = "RequestPermissionURL", dispId = 0x8)
    void setRequestPermissionURL(String param0);
            
    /**
     * <p>id(0x9)</p>
     */
    @ComProperty(name = "PolicyName", dispId = 0x9)
    String getPolicyName();
            
    /**
     * <p>id(0xa)</p>
     */
    @ComProperty(name = "PolicyDescription", dispId = 0xa)
    String getPolicyDescription();
            
    /**
     * <p>id(0xb)</p>
     */
    @ComProperty(name = "StoreLicenses", dispId = 0xb)
    Boolean getStoreLicenses();
            
    /**
     * <p>id(0xb)</p>
     */
    @ComProperty(name = "StoreLicenses", dispId = 0xb)
    void setStoreLicenses(Boolean param0);
            
    /**
     * <p>id(0xc)</p>
     */
    @ComProperty(name = "DocumentAuthor", dispId = 0xc)
    String getDocumentAuthor();
            
    /**
     * <p>id(0xc)</p>
     */
    @ComProperty(name = "DocumentAuthor", dispId = 0xc)
    void setDocumentAuthor(String param0);
            
    /**
     * <p>id(0xd)</p>
     */
    @ComProperty(name = "PermissionFromPolicy", dispId = 0xd)
    Boolean getPermissionFromPolicy();
            
    
}