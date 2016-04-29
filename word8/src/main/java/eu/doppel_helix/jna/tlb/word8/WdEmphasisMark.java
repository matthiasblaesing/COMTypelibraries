
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({9F76AA71-557E-3BF3-AC54-72E6D099B16B})</p>
 */
public enum WdEmphasisMark implements IComEnum {
    
    /**
     * (0)
     */
    wdEmphasisMarkNone(0),
    
    /**
     * (1)
     */
    wdEmphasisMarkOverSolidCircle(1),
    
    /**
     * (2)
     */
    wdEmphasisMarkOverComma(2),
    
    /**
     * (3)
     */
    wdEmphasisMarkOverWhiteCircle(3),
    
    /**
     * (4)
     */
    wdEmphasisMarkUnderSolidCircle(4),
    ;

    private WdEmphasisMark(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}