
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum OlFormatDateTime implements IComEnum {
    
    /**
     * (1)
     */
    olFormatDateTimeLongDayDateTime(1),
    
    /**
     * (2)
     */
    olFormatDateTimeShortDateTime(2),
    
    /**
     * (3)
     */
    olFormatDateTimeShortDayDateTime(3),
    
    /**
     * (4)
     */
    olFormatDateTimeShortDayMonthDateTime(4),
    
    /**
     * (5)
     */
    OlFormatDateTimeLongDayDate(5),
    
    /**
     * (6)
     */
    olFormatDateTimeLongDate(6),
    
    /**
     * (7)
     */
    olFormatDateTimeLongDateReversed(7),
    
    /**
     * (8)
     */
    olFormatDateTimeShortDate(8),
    
    /**
     * (9)
     */
    olFormatDateTimeShortDateNumOnly(9),
    
    /**
     * (10)
     */
    olFormatDateTimeShortDayMonth(10),
    
    /**
     * (11)
     */
    olFormatDateTimeShortMonthYear(11),
    
    /**
     * (12)
     */
    olFormatDateTimeShortMonthYearNumOnly(12),
    
    /**
     * (13)
     */
    olFormatDateTimeShortDayDate(13),
    
    /**
     * (15)
     */
    olFormatDateTimeLongTime(15),
    
    /**
     * (16)
     */
    olFormatDateTimeShortTime(16),
    
    /**
     * (17)
     */
    olFormatDateTimeBestFit(17),
    ;

    private OlFormatDateTime(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}