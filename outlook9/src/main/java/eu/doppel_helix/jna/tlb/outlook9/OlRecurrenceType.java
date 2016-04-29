
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum OlRecurrenceType implements IComEnum {
    
    /**
     * (0)
     */
    olRecursDaily(0),
    
    /**
     * (1)
     */
    olRecursWeekly(1),
    
    /**
     * (2)
     */
    olRecursMonthly(2),
    
    /**
     * (3)
     */
    olRecursMonthNth(3),
    
    /**
     * (5)
     */
    olRecursYearly(5),
    
    /**
     * (6)
     */
    olRecursYearNth(6),
    ;

    private OlRecurrenceType(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}