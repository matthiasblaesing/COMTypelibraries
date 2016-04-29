
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({AC8A429B-81FF-3CA5-910E-A03F96533295})</p>
 */
public enum WdLetterheadLocation implements IComEnum {
    
    /**
     * (0)
     */
    wdLetterTop(0),
    
    /**
     * (1)
     */
    wdLetterBottom(1),
    
    /**
     * (2)
     */
    wdLetterLeft(2),
    
    /**
     * (3)
     */
    wdLetterRight(3),
    ;

    private WdLetterheadLocation(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}