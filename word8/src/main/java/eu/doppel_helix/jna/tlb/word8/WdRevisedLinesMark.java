
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({44D14FEA-48E8-37D1-8446-AF942183D346})</p>
 */
public enum WdRevisedLinesMark implements IComEnum {
    
    /**
     * (0)
     */
    wdRevisedLinesMarkNone(0),
    
    /**
     * (1)
     */
    wdRevisedLinesMarkLeftBorder(1),
    
    /**
     * (2)
     */
    wdRevisedLinesMarkRightBorder(2),
    
    /**
     * (3)
     */
    wdRevisedLinesMarkOutsideBorder(3),
    ;

    private WdRevisedLinesMark(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}