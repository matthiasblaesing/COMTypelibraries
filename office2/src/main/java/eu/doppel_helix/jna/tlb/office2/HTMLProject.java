
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000C0356-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000C0356-0000-0000-C000-000000000046}")
public interface HTMLProject extends IUnknown, IRawDispatchHandle, IDispatch {
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
    @ComProperty(name = "State", dispId = 0x0)
    MsoHTMLProjectState getState();
            
    /**
     * <p>id(0x1)</p>
     */
    @ComMethod(name = "RefreshProject", dispId = 0x1)
    void RefreshProject(Boolean Refresh);
            
    /**
     * <p>id(0x2)</p>
     */
    @ComMethod(name = "RefreshDocument", dispId = 0x2)
    void RefreshDocument(Boolean Refresh);
            
    /**
     * <p>id(0x3)</p>
     */
    @ComProperty(name = "HTMLProjectItems", dispId = 0x3)
    HTMLProjectItems getHTMLProjectItems();
            
    /**
     * <p>id(0x4)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x4)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * <p>id(0x5)</p>
     */
    @ComMethod(name = "Open", dispId = 0x5)
    void Open(MsoHTMLProjectOpen OpenKind);
            
    
}