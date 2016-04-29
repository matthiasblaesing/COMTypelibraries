
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({30F5093A-00F9-3458-981B-0B1993B64BBB})</p>
 */
public enum WdIndexSortBy implements IComEnum {
    
    /**
     * (0)
     */
    wdIndexSortByStroke(0),
    
    /**
     * (1)
     */
    wdIndexSortBySyllable(1),
    ;

    private WdIndexSortBy(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}