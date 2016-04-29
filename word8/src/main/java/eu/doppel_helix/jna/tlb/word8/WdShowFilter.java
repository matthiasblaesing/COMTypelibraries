
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({7D94A0AD-E266-362E-B1A3-2A69D3DBD7D2})</p>
 */
public enum WdShowFilter implements IComEnum {
    
    /**
     * (0)
     */
    wdShowFilterStylesAvailable(0),
    
    /**
     * (1)
     */
    wdShowFilterStylesInUse(1),
    
    /**
     * (2)
     */
    wdShowFilterStylesAll(2),
    
    /**
     * (3)
     */
    wdShowFilterFormattingInUse(3),
    
    /**
     * (4)
     */
    wdShowFilterFormattingAvailable(4),
    
    /**
     * (5)
     */
    wdShowFilterFormattingRecommended(5),
    ;

    private WdShowFilter(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}