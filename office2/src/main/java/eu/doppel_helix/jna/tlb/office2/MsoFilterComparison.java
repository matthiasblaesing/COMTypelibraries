
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum MsoFilterComparison implements IComEnum {
    
    /**
     * (0)
     */
    msoFilterComparisonEqual(0),
    
    /**
     * (1)
     */
    msoFilterComparisonNotEqual(1),
    
    /**
     * (2)
     */
    msoFilterComparisonLessThan(2),
    
    /**
     * (3)
     */
    msoFilterComparisonGreaterThan(3),
    
    /**
     * (4)
     */
    msoFilterComparisonLessThanEqual(4),
    
    /**
     * (5)
     */
    msoFilterComparisonGreaterThanEqual(5),
    
    /**
     * (6)
     */
    msoFilterComparisonIsBlank(6),
    
    /**
     * (7)
     */
    msoFilterComparisonIsNotBlank(7),
    
    /**
     * (8)
     */
    msoFilterComparisonContains(8),
    
    /**
     * (9)
     */
    msoFilterComparisonNotContains(9),
    ;

    private MsoFilterComparison(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}