
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000C0386-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000C0386-0000-0000-C000-000000000046}")
public interface Sync {
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
    @ComProperty(name = "Status", dispId = 0x0)
    MsoSyncStatusType getStatus();
            
    /**
     * <p>id(0x1)</p>
     */
    @ComProperty(name = "WorkspaceLastChangedBy", dispId = 0x1)
    String getWorkspaceLastChangedBy();
            
    /**
     * <p>id(0x2)</p>
     */
    @ComProperty(name = "LastSyncTime", dispId = 0x2)
    Object getLastSyncTime();
            
    /**
     * <p>id(0x4)</p>
     */
    @ComProperty(name = "ErrorType", dispId = 0x4)
    MsoSyncErrorType getErrorType();
            
    /**
     * <p>id(0x6)</p>
     */
    @ComMethod(name = "GetUpdate", dispId = 0x6)
    void GetUpdate();
            
    /**
     * <p>id(0x7)</p>
     */
    @ComMethod(name = "PutUpdate", dispId = 0x7)
    void PutUpdate();
            
    /**
     * <p>id(0x8)</p>
     */
    @ComMethod(name = "OpenVersion", dispId = 0x8)
    void OpenVersion(MsoSyncVersionType SyncVersionType);
            
    /**
     * <p>id(0x9)</p>
     */
    @ComMethod(name = "ResolveConflict", dispId = 0x9)
    void ResolveConflict(MsoSyncConflictResolutionType SyncConflictResolution);
            
    /**
     * <p>id(0xa)</p>
     */
    @ComMethod(name = "Unsuspend", dispId = 0xa)
    void Unsuspend();
            
    /**
     * <p>id(0xe)</p>
     */
    @ComProperty(name = "Parent", dispId = 0xe)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    
}