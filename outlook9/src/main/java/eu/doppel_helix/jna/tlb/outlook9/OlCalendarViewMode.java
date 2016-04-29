
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum OlCalendarViewMode implements IComEnum {
    
    /**
     * (0)
     */
    olCalendarViewDay(0),
    
    /**
     * (1)
     */
    olCalendarViewWeek(1),
    
    /**
     * (2)
     */
    olCalendarViewMonth(2),
    
    /**
     * (3)
     */
    olCalendarViewMultiDay(3),
    
    /**
     * (4)
     */
    olCalendarView5DayWeek(4),
    ;

    private OlCalendarViewMode(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}