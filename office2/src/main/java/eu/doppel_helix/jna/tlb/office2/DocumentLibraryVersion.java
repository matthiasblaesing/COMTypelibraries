
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000C0387-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000C0387-0000-0000-C000-000000000046}")
public interface DocumentLibraryVersion extends IUnknown, IRawDispatchHandle, IDispatch {
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
    @ComProperty(name = "Modified", dispId = 0x0)
    Object getModified();
            
    /**
     * <p>id(0x1)</p>
     */
    @ComProperty(name = "Index", dispId = 0x1)
    Integer getIndex();
            
    /**
     * <p>id(0x2)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x2)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * <p>id(0x3)</p>
     */
    @ComProperty(name = "ModifiedBy", dispId = 0x3)
    String getModifiedBy();
            
    /**
     * <p>id(0x4)</p>
     */
    @ComProperty(name = "Comments", dispId = 0x4)
    String getComments();
            
    /**
     * <p>id(0x5)</p>
     */
    @ComMethod(name = "Delete", dispId = 0x5)
    void Delete();
            
    /**
     * <p>id(0x6)</p>
     */
    @ComMethod(name = "Open", dispId = 0x6)
    com.sun.jna.platform.win32.COM.util.IDispatch Open();
            
    /**
     * <p>id(0x7)</p>
     */
    @ComMethod(name = "Restore", dispId = 0x7)
    com.sun.jna.platform.win32.COM.util.IDispatch Restore();
            
    
}