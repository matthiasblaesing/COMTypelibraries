
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000CD900-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000CD900-0000-0000-C000-000000000046}")
public interface WorkflowTask extends IUnknown, IRawDispatchHandle, IDispatch {
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
     * <p>id(0x1)</p>
     */
    @ComProperty(name = "Id", dispId = 0x1)
    String getId();
            
    /**
     * <p>id(0x2)</p>
     */
    @ComProperty(name = "ListID", dispId = 0x2)
    String getListID();
            
    /**
     * <p>id(0x3)</p>
     */
    @ComProperty(name = "WorkflowID", dispId = 0x3)
    String getWorkflowID();
            
    /**
     * <p>id(0x4)</p>
     */
    @ComProperty(name = "Name", dispId = 0x4)
    String getName();
            
    /**
     * <p>id(0x5)</p>
     */
    @ComProperty(name = "Description", dispId = 0x5)
    String getDescription();
            
    /**
     * <p>id(0x6)</p>
     */
    @ComProperty(name = "AssignedTo", dispId = 0x6)
    String getAssignedTo();
            
    /**
     * <p>id(0x7)</p>
     */
    @ComProperty(name = "CreatedBy", dispId = 0x7)
    String getCreatedBy();
            
    /**
     * <p>id(0x8)</p>
     */
    @ComProperty(name = "DueDate", dispId = 0x8)
    java.util.Date getDueDate();
            
    /**
     * <p>id(0x9)</p>
     */
    @ComProperty(name = "CreatedDate", dispId = 0x9)
    java.util.Date getCreatedDate();
            
    /**
     * <p>id(0xa)</p>
     */
    @ComMethod(name = "Show", dispId = 0xa)
    Integer Show();
            
    
}