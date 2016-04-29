
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum MsoBroadcastCapabilities implements IComEnum {
    
    /**
     * (1)
     */
    BroadcastCapFileSizeLimited(1),
    
    /**
     * (2)
     */
    BroadcastCapSupportsMeetingNotes(2),
    
    /**
     * (4)
     */
    BroadcastCapSupportsUpdateDoc(4),
    ;

    private MsoBroadcastCapabilities(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}