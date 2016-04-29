
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({B81E5359-6200-3CCB-9B49-8BE46F9A9FEA})</p>
 */
public enum WdIndexFormat implements IComEnum {
    
    /**
     * (0)
     */
    wdIndexTemplate(0),
    
    /**
     * (1)
     */
    wdIndexClassic(1),
    
    /**
     * (2)
     */
    wdIndexFancy(2),
    
    /**
     * (3)
     */
    wdIndexModern(3),
    
    /**
     * (4)
     */
    wdIndexBulleted(4),
    
    /**
     * (5)
     */
    wdIndexFormal(5),
    
    /**
     * (6)
     */
    wdIndexSimple(6),
    ;

    private WdIndexFormat(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}