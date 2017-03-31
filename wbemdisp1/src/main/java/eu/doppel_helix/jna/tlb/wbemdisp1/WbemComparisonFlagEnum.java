
package eu.doppel_helix.jna.tlb.wbemdisp1;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * Defines settings for object comparison
 *
 * <p>uuid({4A249B79-FC9A-11D1-8B1E-00600806D9B6})</p>
 */
public enum WbemComparisonFlagEnum implements IComEnum {
    
    /**
     * (0)
     */
    wbemComparisonFlagIncludeAll(0),
    
    /**
     * (1)
     */
    wbemComparisonFlagIgnoreQualifiers(1),
    
    /**
     * (2)
     */
    wbemComparisonFlagIgnoreObjectSource(2),
    
    /**
     * (4)
     */
    wbemComparisonFlagIgnoreDefaultValues(4),
    
    /**
     * (8)
     */
    wbemComparisonFlagIgnoreClass(8),
    
    /**
     * (16)
     */
    wbemComparisonFlagIgnoreCase(16),
    
    /**
     * (32)
     */
    wbemComparisonFlagIgnoreFlavor(32),
    ;

    private WbemComparisonFlagEnum(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}