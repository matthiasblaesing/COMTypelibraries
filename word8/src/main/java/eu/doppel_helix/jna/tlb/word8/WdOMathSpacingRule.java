
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({8DBAA8CB-E1D0-3531-AD9E-9E8F08E651CA})</p>
 */
public enum WdOMathSpacingRule implements IComEnum {
    
    /**
     * (0)
     */
    wdOMathSpacingSingle(0),
    
    /**
     * (1)
     */
    wdOMathSpacing1pt5(1),
    
    /**
     * (2)
     */
    wdOMathSpacingDouble(2),
    
    /**
     * (3)
     */
    wdOMathSpacingExactly(3),
    
    /**
     * (4)
     */
    wdOMathSpacingMultiple(4),
    ;

    private WdOMathSpacingRule(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}