
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum OlCalendarMailFormat implements IComEnum {
    
    /**
     * (0)
     */
    olCalendarMailFormatDailySchedule(0),
    
    /**
     * (1)
     */
    olCalendarMailFormatEventList(1),
    ;

    private OlCalendarMailFormat(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}