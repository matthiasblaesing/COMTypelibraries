
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000C037B-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000C037B-0000-0000-C000-000000000046}")
public interface SharedWorkspaceFile {
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
    @ComProperty(name = "URL", dispId = 0x0)
    String getURL();
            
    /**
     * <p>id(0x1)</p>
     */
    @ComProperty(name = "CreatedBy", dispId = 0x1)
    String getCreatedBy();
            
    /**
     * <p>id(0x2)</p>
     */
    @ComProperty(name = "CreatedDate", dispId = 0x2)
    Object getCreatedDate();
            
    /**
     * <p>id(0x3)</p>
     */
    @ComProperty(name = "ModifiedBy", dispId = 0x3)
    String getModifiedBy();
            
    /**
     * <p>id(0x4)</p>
     */
    @ComProperty(name = "ModifiedDate", dispId = 0x4)
    Object getModifiedDate();
            
    /**
     * <p>id(0x5)</p>
     */
    @ComMethod(name = "Delete", dispId = 0x5)
    void Delete();
            
    /**
     * <p>id(0x6)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x6)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    
}