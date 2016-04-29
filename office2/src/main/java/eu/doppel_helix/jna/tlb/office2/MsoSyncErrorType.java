
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum MsoSyncErrorType implements IComEnum {
    
    /**
     * (0)
     */
    msoSyncErrorNone(0),
    
    /**
     * (1)
     */
    msoSyncErrorUnauthorizedUser(1),
    
    /**
     * (2)
     */
    msoSyncErrorCouldNotConnect(2),
    
    /**
     * (3)
     */
    msoSyncErrorOutOfSpace(3),
    
    /**
     * (4)
     */
    msoSyncErrorFileNotFound(4),
    
    /**
     * (5)
     */
    msoSyncErrorFileTooLarge(5),
    
    /**
     * (6)
     */
    msoSyncErrorFileInUse(6),
    
    /**
     * (7)
     */
    msoSyncErrorVirusUpload(7),
    
    /**
     * (8)
     */
    msoSyncErrorVirusDownload(8),
    
    /**
     * (9)
     */
    msoSyncErrorUnknownUpload(9),
    
    /**
     * (10)
     */
    msoSyncErrorUnknownDownload(10),
    
    /**
     * (11)
     */
    msoSyncErrorCouldNotOpen(11),
    
    /**
     * (12)
     */
    msoSyncErrorCouldNotUpdate(12),
    
    /**
     * (13)
     */
    msoSyncErrorCouldNotCompare(13),
    
    /**
     * (14)
     */
    msoSyncErrorCouldNotResolve(14),
    
    /**
     * (15)
     */
    msoSyncErrorNoNetwork(15),
    
    /**
     * (16)
     */
    msoSyncErrorUnknown(16),
    ;

    private MsoSyncErrorType(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}