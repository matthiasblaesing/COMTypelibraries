
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({E99F6EC3-9FC0-370C-AE31-1A0452AC413A})</p>
 */
public enum WdCalendarTypeBi implements IComEnum {
    
    /**
     * (99)
     */
    wdCalendarTypeBidi(99),
    
    /**
     * (100)
     */
    wdCalendarTypeGregorian(100),
    ;

    private WdCalendarTypeBi(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}