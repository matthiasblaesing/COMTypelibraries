
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({296798C9-94F4-30FF-BAE0-D5B892E9E5C0})</p>
 */
public enum WdMailMergeComparison implements IComEnum {
    
    /**
     * (0)
     */
    wdMergeIfEqual(0),
    
    /**
     * (1)
     */
    wdMergeIfNotEqual(1),
    
    /**
     * (2)
     */
    wdMergeIfLessThan(2),
    
    /**
     * (3)
     */
    wdMergeIfGreaterThan(3),
    
    /**
     * (4)
     */
    wdMergeIfLessThanOrEqual(4),
    
    /**
     * (5)
     */
    wdMergeIfGreaterThanOrEqual(5),
    
    /**
     * (6)
     */
    wdMergeIfIsBlank(6),
    
    /**
     * (7)
     */
    wdMergeIfIsNotBlank(7),
    ;

    private WdMailMergeComparison(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}