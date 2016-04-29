
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({2F1B54DB-4A60-3B71-9EB6-7AE77033B5B5})</p>
 */
public enum WdCalendarType implements IComEnum {
    
    /**
     * (0)
     */
    wdCalendarWestern(0),
    
    /**
     * (1)
     */
    wdCalendarArabic(1),
    
    /**
     * (2)
     */
    wdCalendarHebrew(2),
    
    /**
     * (3)
     */
    wdCalendarTaiwan(3),
    
    /**
     * (4)
     */
    wdCalendarJapan(4),
    
    /**
     * (5)
     */
    wdCalendarThai(5),
    
    /**
     * (6)
     */
    wdCalendarKorean(6),
    
    /**
     * (7)
     */
    wdCalendarSakaEra(7),
    
    /**
     * (8)
     */
    wdCalendarTranslitEnglish(8),
    
    /**
     * (9)
     */
    wdCalendarTranslitFrench(9),
    
    /**
     * (13)
     */
    wdCalendarUmalqura(13),
    ;

    private WdCalendarType(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}