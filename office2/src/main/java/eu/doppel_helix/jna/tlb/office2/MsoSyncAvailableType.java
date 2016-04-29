
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum MsoSyncAvailableType implements IComEnum {
    
    /**
     * (0)
     */
    msoSyncAvailableNone(0),
    
    /**
     * (1)
     */
    msoSyncAvailableOffline(1),
    
    /**
     * (2)
     */
    msoSyncAvailableAnywhere(2),
    ;

    private MsoSyncAvailableType(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}