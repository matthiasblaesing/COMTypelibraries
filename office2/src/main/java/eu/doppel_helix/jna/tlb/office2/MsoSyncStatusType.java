
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum MsoSyncStatusType implements IComEnum {
    
    /**
     * (0)
     */
    msoSyncStatusNoSharedWorkspace(0),
    
    /**
     * (0)
     */
    msoSyncStatusNotRoaming(0),
    
    /**
     * (1)
     */
    msoSyncStatusLatest(1),
    
    /**
     * (2)
     */
    msoSyncStatusNewerAvailable(2),
    
    /**
     * (3)
     */
    msoSyncStatusLocalChanges(3),
    
    /**
     * (4)
     */
    msoSyncStatusConflict(4),
    
    /**
     * (5)
     */
    msoSyncStatusSuspended(5),
    
    /**
     * (6)
     */
    msoSyncStatusError(6),
    ;

    private MsoSyncStatusType(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}