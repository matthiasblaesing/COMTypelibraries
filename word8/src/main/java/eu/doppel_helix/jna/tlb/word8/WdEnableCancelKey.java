
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({A8E563F3-4ACB-3B98-9507-13D0C7421517})</p>
 */
public enum WdEnableCancelKey implements IComEnum {
    
    /**
     * (0)
     */
    wdCancelDisabled(0),
    
    /**
     * (1)
     */
    wdCancelInterrupt(1),
    ;

    private WdEnableCancelKey(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}