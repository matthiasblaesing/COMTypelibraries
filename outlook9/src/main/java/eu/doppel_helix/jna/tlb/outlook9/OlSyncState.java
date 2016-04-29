
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum OlSyncState implements IComEnum {
    
    /**
     * (0)
     */
    olSyncStopped(0),
    
    /**
     * (1)
     */
    olSyncStarted(1),
    ;

    private OlSyncState(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}