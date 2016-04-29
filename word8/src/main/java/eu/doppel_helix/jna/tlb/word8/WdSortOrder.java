
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({B0CA07BD-9184-32B2-B361-D1D839787D06})</p>
 */
public enum WdSortOrder implements IComEnum {
    
    /**
     * (0)
     */
    wdSortOrderAscending(0),
    
    /**
     * (1)
     */
    wdSortOrderDescending(1),
    ;

    private WdSortOrder(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}