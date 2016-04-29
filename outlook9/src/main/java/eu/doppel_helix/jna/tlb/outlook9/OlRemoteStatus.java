
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum OlRemoteStatus implements IComEnum {
    
    /**
     * (0)
     */
    olRemoteStatusNone(0),
    
    /**
     * (1)
     */
    olUnMarked(1),
    
    /**
     * (2)
     */
    olMarkedForDownload(2),
    
    /**
     * (3)
     */
    olMarkedForCopy(3),
    
    /**
     * (4)
     */
    olMarkedForDelete(4),
    ;

    private OlRemoteStatus(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}