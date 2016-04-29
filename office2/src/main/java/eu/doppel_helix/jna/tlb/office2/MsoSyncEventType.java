
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum MsoSyncEventType implements IComEnum {
    
    /**
     * (0)
     */
    msoSyncEventDownloadInitiated(0),
    
    /**
     * (1)
     */
    msoSyncEventDownloadSucceeded(1),
    
    /**
     * (2)
     */
    msoSyncEventDownloadFailed(2),
    
    /**
     * (3)
     */
    msoSyncEventUploadInitiated(3),
    
    /**
     * (4)
     */
    msoSyncEventUploadSucceeded(4),
    
    /**
     * (5)
     */
    msoSyncEventUploadFailed(5),
    
    /**
     * (6)
     */
    msoSyncEventDownloadNoChange(6),
    
    /**
     * (7)
     */
    msoSyncEventOffline(7),
    ;

    private MsoSyncEventType(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}