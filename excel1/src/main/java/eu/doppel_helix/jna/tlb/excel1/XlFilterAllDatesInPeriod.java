
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum XlFilterAllDatesInPeriod implements IComEnum {
    
    /**
     * (0)
     */
    xlFilterAllDatesInPeriodYear(0),
    
    /**
     * (1)
     */
    xlFilterAllDatesInPeriodMonth(1),
    
    /**
     * (2)
     */
    xlFilterAllDatesInPeriodDay(2),
    
    /**
     * (3)
     */
    xlFilterAllDatesInPeriodHour(3),
    
    /**
     * (4)
     */
    xlFilterAllDatesInPeriodMinute(4),
    
    /**
     * (5)
     */
    xlFilterAllDatesInPeriodSecond(5),
    ;

    private XlFilterAllDatesInPeriod(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}