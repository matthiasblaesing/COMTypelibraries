
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({8BE9FF6B-231C-32F4-8F21-FD47474070BA})</p>
 */
public enum WdIMEMode implements IComEnum {
    
    /**
     * (0)
     */
    wdIMEModeNoControl(0),
    
    /**
     * (1)
     */
    wdIMEModeOn(1),
    
    /**
     * (2)
     */
    wdIMEModeOff(2),
    
    /**
     * (4)
     */
    wdIMEModeHiragana(4),
    
    /**
     * (5)
     */
    wdIMEModeKatakana(5),
    
    /**
     * (6)
     */
    wdIMEModeKatakanaHalf(6),
    
    /**
     * (7)
     */
    wdIMEModeAlphaFull(7),
    
    /**
     * (8)
     */
    wdIMEModeAlpha(8),
    
    /**
     * (9)
     */
    wdIMEModeHangulFull(9),
    
    /**
     * (10)
     */
    wdIMEModeHangul(10),
    ;

    private WdIMEMode(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}