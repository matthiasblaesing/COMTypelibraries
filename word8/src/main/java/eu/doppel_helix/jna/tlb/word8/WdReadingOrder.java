
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({1A41F606-6AEF-37E5-A4AA-799EBE04CFA2})</p>
 */
public enum WdReadingOrder implements IComEnum {
    
    /**
     * (0)
     */
    wdReadingOrderRtl(0),
    
    /**
     * (1)
     */
    wdReadingOrderLtr(1),
    ;

    private WdReadingOrder(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}