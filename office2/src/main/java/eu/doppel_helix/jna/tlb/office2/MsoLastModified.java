
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum MsoLastModified implements IComEnum {
    
    /**
     * (1)
     */
    msoLastModifiedYesterday(1),
    
    /**
     * (2)
     */
    msoLastModifiedToday(2),
    
    /**
     * (3)
     */
    msoLastModifiedLastWeek(3),
    
    /**
     * (4)
     */
    msoLastModifiedThisWeek(4),
    
    /**
     * (5)
     */
    msoLastModifiedLastMonth(5),
    
    /**
     * (6)
     */
    msoLastModifiedThisMonth(6),
    
    /**
     * (7)
     */
    msoLastModifiedAnyTime(7),
    ;

    private MsoLastModified(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}