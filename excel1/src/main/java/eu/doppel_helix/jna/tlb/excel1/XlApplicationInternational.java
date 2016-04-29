
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum XlApplicationInternational implements IComEnum {
    
    /**
     * (33)
     */
    xl24HourClock(33),
    
    /**
     * (43)
     */
    xl4DigitYears(43),
    
    /**
     * (16)
     */
    xlAlternateArraySeparator(16),
    
    /**
     * (14)
     */
    xlColumnSeparator(14),
    
    /**
     * (1)
     */
    xlCountryCode(1),
    
    /**
     * (2)
     */
    xlCountrySetting(2),
    
    /**
     * (37)
     */
    xlCurrencyBefore(37),
    
    /**
     * (25)
     */
    xlCurrencyCode(25),
    
    /**
     * (27)
     */
    xlCurrencyDigits(27),
    
    /**
     * (40)
     */
    xlCurrencyLeadingZeros(40),
    
    /**
     * (38)
     */
    xlCurrencyMinusSign(38),
    
    /**
     * (28)
     */
    xlCurrencyNegative(28),
    
    /**
     * (36)
     */
    xlCurrencySpaceBefore(36),
    
    /**
     * (39)
     */
    xlCurrencyTrailingZeros(39),
    
    /**
     * (32)
     */
    xlDateOrder(32),
    
    /**
     * (17)
     */
    xlDateSeparator(17),
    
    /**
     * (21)
     */
    xlDayCode(21),
    
    /**
     * (42)
     */
    xlDayLeadingZero(42),
    
    /**
     * (3)
     */
    xlDecimalSeparator(3),
    
    /**
     * (26)
     */
    xlGeneralFormatName(26),
    
    /**
     * (22)
     */
    xlHourCode(22),
    
    /**
     * (12)
     */
    xlLeftBrace(12),
    
    /**
     * (10)
     */
    xlLeftBracket(10),
    
    /**
     * (5)
     */
    xlListSeparator(5),
    
    /**
     * (9)
     */
    xlLowerCaseColumnLetter(9),
    
    /**
     * (8)
     */
    xlLowerCaseRowLetter(8),
    
    /**
     * (44)
     */
    xlMDY(44),
    
    /**
     * (35)
     */
    xlMetric(35),
    
    /**
     * (23)
     */
    xlMinuteCode(23),
    
    /**
     * (20)
     */
    xlMonthCode(20),
    
    /**
     * (41)
     */
    xlMonthLeadingZero(41),
    
    /**
     * (30)
     */
    xlMonthNameChars(30),
    
    /**
     * (29)
     */
    xlNoncurrencyDigits(29),
    
    /**
     * (34)
     */
    xlNonEnglishFunctions(34),
    
    /**
     * (13)
     */
    xlRightBrace(13),
    
    /**
     * (11)
     */
    xlRightBracket(11),
    
    /**
     * (15)
     */
    xlRowSeparator(15),
    
    /**
     * (24)
     */
    xlSecondCode(24),
    
    /**
     * (4)
     */
    xlThousandsSeparator(4),
    
    /**
     * (45)
     */
    xlTimeLeadingZero(45),
    
    /**
     * (18)
     */
    xlTimeSeparator(18),
    
    /**
     * (7)
     */
    xlUpperCaseColumnLetter(7),
    
    /**
     * (6)
     */
    xlUpperCaseRowLetter(6),
    
    /**
     * (31)
     */
    xlWeekdayNameChars(31),
    
    /**
     * (19)
     */
    xlYearCode(19),
    ;

    private XlApplicationInternational(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}