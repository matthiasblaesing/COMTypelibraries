
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({EC986BD6-35C2-368D-94D8-AC3850019ABA})</p>
 */
public enum WdRowAlignment implements IComEnum {
    
    /**
     * (0)
     */
    wdAlignRowLeft(0),
    
    /**
     * (1)
     */
    wdAlignRowCenter(1),
    
    /**
     * (2)
     */
    wdAlignRowRight(2),
    ;

    private WdRowAlignment(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}