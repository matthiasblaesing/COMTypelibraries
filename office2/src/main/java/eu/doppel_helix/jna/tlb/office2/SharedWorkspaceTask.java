
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000C0379-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000C0379-0000-0000-C000-000000000046}")
public interface SharedWorkspaceTask extends IUnknown, IRawDispatchHandle, IDispatch {
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
    @ComProperty(name = "Title", dispId = 0x0)
    String getTitle();
            
    /**
     * <p>id(0x0)</p>
     */
    @ComProperty(name = "Title", dispId = 0x0)
    void setTitle(String param0);
            
    /**
     * <p>id(0x1)</p>
     */
    @ComProperty(name = "AssignedTo", dispId = 0x1)
    String getAssignedTo();
            
    /**
     * <p>id(0x1)</p>
     */
    @ComProperty(name = "AssignedTo", dispId = 0x1)
    void setAssignedTo(String param0);
            
    /**
     * <p>id(0x2)</p>
     */
    @ComProperty(name = "Status", dispId = 0x2)
    MsoSharedWorkspaceTaskStatus getStatus();
            
    /**
     * <p>id(0x2)</p>
     */
    @ComProperty(name = "Status", dispId = 0x2)
    void setStatus(MsoSharedWorkspaceTaskStatus param0);
            
    /**
     * <p>id(0x3)</p>
     */
    @ComProperty(name = "Priority", dispId = 0x3)
    MsoSharedWorkspaceTaskPriority getPriority();
            
    /**
     * <p>id(0x3)</p>
     */
    @ComProperty(name = "Priority", dispId = 0x3)
    void setPriority(MsoSharedWorkspaceTaskPriority param0);
            
    /**
     * <p>id(0x4)</p>
     */
    @ComProperty(name = "Description", dispId = 0x4)
    String getDescription();
            
    /**
     * <p>id(0x4)</p>
     */
    @ComProperty(name = "Description", dispId = 0x4)
    void setDescription(String param0);
            
    /**
     * <p>id(0x5)</p>
     */
    @ComProperty(name = "DueDate", dispId = 0x5)
    Object getDueDate();
            
    /**
     * <p>id(0x5)</p>
     */
    @ComProperty(name = "DueDate", dispId = 0x5)
    void setDueDate(Object param0);
            
    /**
     * <p>id(0x6)</p>
     */
    @ComProperty(name = "CreatedBy", dispId = 0x6)
    String getCreatedBy();
            
    /**
     * <p>id(0x7)</p>
     */
    @ComProperty(name = "CreatedDate", dispId = 0x7)
    Object getCreatedDate();
            
    /**
     * <p>id(0x8)</p>
     */
    @ComProperty(name = "ModifiedBy", dispId = 0x8)
    String getModifiedBy();
            
    /**
     * <p>id(0x9)</p>
     */
    @ComProperty(name = "ModifiedDate", dispId = 0x9)
    Object getModifiedDate();
            
    /**
     * <p>id(0xa)</p>
     */
    @ComMethod(name = "Save", dispId = 0xa)
    void Save();
            
    /**
     * <p>id(0xb)</p>
     */
    @ComMethod(name = "Delete", dispId = 0xb)
    void Delete();
            
    /**
     * <p>id(0xc)</p>
     */
    @ComProperty(name = "Parent", dispId = 0xc)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    
}