
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({AD022562-7990-3B64-BA65-8C3A19B7D173})</p>
 */
public enum WdRowHeightRule implements IComEnum {
    
    /**
     * (0)
     */
    wdRowHeightAuto(0),
    
    /**
     * (1)
     */
    wdRowHeightAtLeast(1),
    
    /**
     * (2)
     */
    wdRowHeightExactly(2),
    ;

    private WdRowHeightRule(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}