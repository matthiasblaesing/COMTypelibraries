
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({98E477B0-5AC3-3A32-8B67-108CCA2440E2})</p>
 */
public enum WdHeaderFooterIndex implements IComEnum {
    
    /**
     * (1)
     */
    wdHeaderFooterPrimary(1),
    
    /**
     * (2)
     */
    wdHeaderFooterFirstPage(2),
    
    /**
     * (3)
     */
    wdHeaderFooterEvenPages(3),
    ;

    private WdHeaderFooterIndex(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}