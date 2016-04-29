
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({9B5F3357-A13F-3EE2-8123-33E385D2FD51})</p>
 */
public enum WdHeadingSeparator implements IComEnum {
    
    /**
     * (0)
     */
    wdHeadingSeparatorNone(0),
    
    /**
     * (1)
     */
    wdHeadingSeparatorBlankLine(1),
    
    /**
     * (2)
     */
    wdHeadingSeparatorLetter(2),
    
    /**
     * (3)
     */
    wdHeadingSeparatorLetterLow(3),
    
    /**
     * (4)
     */
    wdHeadingSeparatorLetterFull(4),
    ;

    private WdHeadingSeparator(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}