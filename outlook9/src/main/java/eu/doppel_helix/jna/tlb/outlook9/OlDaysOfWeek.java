
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum OlDaysOfWeek implements IComEnum {
    
    /**
     * (1)
     */
    olSunday(1),
    
    /**
     * (2)
     */
    olMonday(2),
    
    /**
     * (4)
     */
    olTuesday(4),
    
    /**
     * (8)
     */
    olWednesday(8),
    
    /**
     * (16)
     */
    olThursday(16),
    
    /**
     * (32)
     */
    olFriday(32),
    
    /**
     * (64)
     */
    olSaturday(64),
    ;

    private OlDaysOfWeek(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}