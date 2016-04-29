
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum OlRecurrenceState implements IComEnum {
    
    /**
     * (0)
     */
    olApptNotRecurring(0),
    
    /**
     * (1)
     */
    olApptMaster(1),
    
    /**
     * (2)
     */
    olApptOccurrence(2),
    
    /**
     * (3)
     */
    olApptException(3),
    ;

    private OlRecurrenceState(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}