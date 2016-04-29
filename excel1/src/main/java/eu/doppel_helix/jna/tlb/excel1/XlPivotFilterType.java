
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum XlPivotFilterType implements IComEnum {
    
    /**
     * (1)
     */
    xlTopCount(1),
    
    /**
     * (2)
     */
    xlBottomCount(2),
    
    /**
     * (3)
     */
    xlTopPercent(3),
    
    /**
     * (4)
     */
    xlBottomPercent(4),
    
    /**
     * (5)
     */
    xlTopSum(5),
    
    /**
     * (6)
     */
    xlBottomSum(6),
    
    /**
     * (7)
     */
    xlValueEquals(7),
    
    /**
     * (8)
     */
    xlValueDoesNotEqual(8),
    
    /**
     * (9)
     */
    xlValueIsGreaterThan(9),
    
    /**
     * (10)
     */
    xlValueIsGreaterThanOrEqualTo(10),
    
    /**
     * (11)
     */
    xlValueIsLessThan(11),
    
    /**
     * (12)
     */
    xlValueIsLessThanOrEqualTo(12),
    
    /**
     * (13)
     */
    xlValueIsBetween(13),
    
    /**
     * (14)
     */
    xlValueIsNotBetween(14),
    
    /**
     * (15)
     */
    xlCaptionEquals(15),
    
    /**
     * (16)
     */
    xlCaptionDoesNotEqual(16),
    
    /**
     * (17)
     */
    xlCaptionBeginsWith(17),
    
    /**
     * (18)
     */
    xlCaptionDoesNotBeginWith(18),
    
    /**
     * (19)
     */
    xlCaptionEndsWith(19),
    
    /**
     * (20)
     */
    xlCaptionDoesNotEndWith(20),
    
    /**
     * (21)
     */
    xlCaptionContains(21),
    
    /**
     * (22)
     */
    xlCaptionDoesNotContain(22),
    
    /**
     * (23)
     */
    xlCaptionIsGreaterThan(23),
    
    /**
     * (24)
     */
    xlCaptionIsGreaterThanOrEqualTo(24),
    
    /**
     * (25)
     */
    xlCaptionIsLessThan(25),
    
    /**
     * (26)
     */
    xlCaptionIsLessThanOrEqualTo(26),
    
    /**
     * (27)
     */
    xlCaptionIsBetween(27),
    
    /**
     * (28)
     */
    xlCaptionIsNotBetween(28),
    
    /**
     * (29)
     */
    xlSpecificDate(29),
    
    /**
     * (30)
     */
    xlNotSpecificDate(30),
    
    /**
     * (31)
     */
    xlBefore(31),
    
    /**
     * (32)
     */
    xlBeforeOrEqualTo(32),
    
    /**
     * (33)
     */
    xlAfter(33),
    
    /**
     * (34)
     */
    xlAfterOrEqualTo(34),
    
    /**
     * (35)
     */
    xlDateBetween(35),
    
    /**
     * (36)
     */
    xlDateNotBetween(36),
    
    /**
     * (37)
     */
    xlDateTomorrow(37),
    
    /**
     * (38)
     */
    xlDateToday(38),
    
    /**
     * (39)
     */
    xlDateYesterday(39),
    
    /**
     * (40)
     */
    xlDateNextWeek(40),
    
    /**
     * (41)
     */
    xlDateThisWeek(41),
    
    /**
     * (42)
     */
    xlDateLastWeek(42),
    
    /**
     * (43)
     */
    xlDateNextMonth(43),
    
    /**
     * (44)
     */
    xlDateThisMonth(44),
    
    /**
     * (45)
     */
    xlDateLastMonth(45),
    
    /**
     * (46)
     */
    xlDateNextQuarter(46),
    
    /**
     * (47)
     */
    xlDateThisQuarter(47),
    
    /**
     * (48)
     */
    xlDateLastQuarter(48),
    
    /**
     * (49)
     */
    xlDateNextYear(49),
    
    /**
     * (50)
     */
    xlDateThisYear(50),
    
    /**
     * (51)
     */
    xlDateLastYear(51),
    
    /**
     * (52)
     */
    xlYearToDate(52),
    
    /**
     * (53)
     */
    xlAllDatesInPeriodQuarter1(53),
    
    /**
     * (54)
     */
    xlAllDatesInPeriodQuarter2(54),
    
    /**
     * (55)
     */
    xlAllDatesInPeriodQuarter3(55),
    
    /**
     * (56)
     */
    xlAllDatesInPeriodQuarter4(56),
    
    /**
     * (57)
     */
    xlAllDatesInPeriodJanuary(57),
    
    /**
     * (58)
     */
    xlAllDatesInPeriodFebruary(58),
    
    /**
     * (59)
     */
    xlAllDatesInPeriodMarch(59),
    
    /**
     * (60)
     */
    xlAllDatesInPeriodApril(60),
    
    /**
     * (61)
     */
    xlAllDatesInPeriodMay(61),
    
    /**
     * (62)
     */
    xlAllDatesInPeriodJune(62),
    
    /**
     * (63)
     */
    xlAllDatesInPeriodJuly(63),
    
    /**
     * (64)
     */
    xlAllDatesInPeriodAugust(64),
    
    /**
     * (65)
     */
    xlAllDatesInPeriodSeptember(65),
    
    /**
     * (66)
     */
    xlAllDatesInPeriodOctober(66),
    
    /**
     * (67)
     */
    xlAllDatesInPeriodNovember(67),
    
    /**
     * (68)
     */
    xlAllDatesInPeriodDecember(68),
    ;

    private XlPivotFilterType(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}