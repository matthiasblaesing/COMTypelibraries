
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum OlTrackingStatus implements IComEnum {
    
    /**
     * (0)
     */
    olTrackingNone(0),
    
    /**
     * (1)
     */
    olTrackingDelivered(1),
    
    /**
     * (2)
     */
    olTrackingNotDelivered(2),
    
    /**
     * (3)
     */
    olTrackingNotRead(3),
    
    /**
     * (4)
     */
    olTrackingRecallFailure(4),
    
    /**
     * (5)
     */
    olTrackingRecallSuccess(5),
    
    /**
     * (6)
     */
    olTrackingRead(6),
    
    /**
     * (7)
     */
    olTrackingReplied(7),
    ;

    private OlTrackingStatus(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}