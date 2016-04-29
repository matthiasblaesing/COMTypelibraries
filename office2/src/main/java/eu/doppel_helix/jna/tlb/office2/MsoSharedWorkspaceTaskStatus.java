
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum MsoSharedWorkspaceTaskStatus implements IComEnum {
    
    /**
     * (1)
     */
    msoSharedWorkspaceTaskStatusNotStarted(1),
    
    /**
     * (2)
     */
    msoSharedWorkspaceTaskStatusInProgress(2),
    
    /**
     * (3)
     */
    msoSharedWorkspaceTaskStatusCompleted(3),
    
    /**
     * (4)
     */
    msoSharedWorkspaceTaskStatusDeferred(4),
    
    /**
     * (5)
     */
    msoSharedWorkspaceTaskStatusWaiting(5),
    ;

    private MsoSharedWorkspaceTaskStatus(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}