
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum XlDynamicFilterCriteria implements IComEnum {
    
    /**
     * (1)
     */
    xlFilterToday(1),
    
    /**
     * (2)
     */
    xlFilterYesterday(2),
    
    /**
     * (3)
     */
    xlFilterTomorrow(3),
    
    /**
     * (4)
     */
    xlFilterThisWeek(4),
    
    /**
     * (5)
     */
    xlFilterLastWeek(5),
    
    /**
     * (6)
     */
    xlFilterNextWeek(6),
    
    /**
     * (7)
     */
    xlFilterThisMonth(7),
    
    /**
     * (8)
     */
    xlFilterLastMonth(8),
    
    /**
     * (9)
     */
    xlFilterNextMonth(9),
    
    /**
     * (10)
     */
    xlFilterThisQuarter(10),
    
    /**
     * (11)
     */
    xlFilterLastQuarter(11),
    
    /**
     * (12)
     */
    xlFilterNextQuarter(12),
    
    /**
     * (13)
     */
    xlFilterThisYear(13),
    
    /**
     * (14)
     */
    xlFilterLastYear(14),
    
    /**
     * (15)
     */
    xlFilterNextYear(15),
    
    /**
     * (16)
     */
    xlFilterYearToDate(16),
    
    /**
     * (17)
     */
    xlFilterAllDatesInPeriodQuarter1(17),
    
    /**
     * (18)
     */
    xlFilterAllDatesInPeriodQuarter2(18),
    
    /**
     * (19)
     */
    xlFilterAllDatesInPeriodQuarter3(19),
    
    /**
     * (20)
     */
    xlFilterAllDatesInPeriodQuarter4(20),
    
    /**
     * (21)
     */
    xlFilterAllDatesInPeriodJanuary(21),
    
    /**
     * (22)
     */
    xlFilterAllDatesInPeriodFebruray(22),
    
    /**
     * (23)
     */
    xlFilterAllDatesInPeriodMarch(23),
    
    /**
     * (24)
     */
    xlFilterAllDatesInPeriodApril(24),
    
    /**
     * (25)
     */
    xlFilterAllDatesInPeriodMay(25),
    
    /**
     * (26)
     */
    xlFilterAllDatesInPeriodJune(26),
    
    /**
     * (27)
     */
    xlFilterAllDatesInPeriodJuly(27),
    
    /**
     * (28)
     */
    xlFilterAllDatesInPeriodAugust(28),
    
    /**
     * (29)
     */
    xlFilterAllDatesInPeriodSeptember(29),
    
    /**
     * (30)
     */
    xlFilterAllDatesInPeriodOctober(30),
    
    /**
     * (31)
     */
    xlFilterAllDatesInPeriodNovember(31),
    
    /**
     * (32)
     */
    xlFilterAllDatesInPeriodDecember(32),
    
    /**
     * (33)
     */
    xlFilterAboveAverage(33),
    
    /**
     * (34)
     */
    xlFilterBelowAverage(34),
    ;

    private XlDynamicFilterCriteria(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}