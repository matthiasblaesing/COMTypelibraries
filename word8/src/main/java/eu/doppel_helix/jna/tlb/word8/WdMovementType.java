
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({4EDBFF52-62D3-38CC-99D1-0FFEF9BCAD4A})</p>
 */
public enum WdMovementType implements IComEnum {
    
    /**
     * (0)
     */
    wdMove(0),
    
    /**
     * (1)
     */
    wdExtend(1),
    ;

    private WdMovementType(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}