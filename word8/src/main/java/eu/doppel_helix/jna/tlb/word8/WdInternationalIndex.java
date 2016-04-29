
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({5077203F-7859-39B5-BF08-8308BDE14529})</p>
 */
public enum WdInternationalIndex implements IComEnum {
    
    /**
     * (17)
     */
    wdListSeparator(17),
    
    /**
     * (18)
     */
    wdDecimalSeparator(18),
    
    /**
     * (19)
     */
    wdThousandsSeparator(19),
    
    /**
     * (20)
     */
    wdCurrencyCode(20),
    
    /**
     * (21)
     */
    wd24HourClock(21),
    
    /**
     * (22)
     */
    wdInternationalAM(22),
    
    /**
     * (23)
     */
    wdInternationalPM(23),
    
    /**
     * (24)
     */
    wdTimeSeparator(24),
    
    /**
     * (25)
     */
    wdDateSeparator(25),
    
    /**
     * (26)
     */
    wdProductLanguageID(26),
    ;

    private WdInternationalIndex(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}