
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({589E54F8-90C3-3C76-910B-4E6CBF21068D})</p>
 */
public enum WdLetterStyle implements IComEnum {
    
    /**
     * (0)
     */
    wdFullBlock(0),
    
    /**
     * (1)
     */
    wdModifiedBlock(1),
    
    /**
     * (2)
     */
    wdSemiBlock(2),
    ;

    private WdLetterStyle(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}