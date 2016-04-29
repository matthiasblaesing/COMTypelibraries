
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum XlTimePeriods implements IComEnum {
    
    /**
     * (0)
     */
    xlToday(0),
    
    /**
     * (1)
     */
    xlYesterday(1),
    
    /**
     * (2)
     */
    xlLast7Days(2),
    
    /**
     * (3)
     */
    xlThisWeek(3),
    
    /**
     * (4)
     */
    xlLastWeek(4),
    
    /**
     * (5)
     */
    xlLastMonth(5),
    
    /**
     * (6)
     */
    xlTomorrow(6),
    
    /**
     * (7)
     */
    xlNextWeek(7),
    
    /**
     * (8)
     */
    xlNextMonth(8),
    
    /**
     * (9)
     */
    xlThisMonth(9),
    ;

    private XlTimePeriods(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}