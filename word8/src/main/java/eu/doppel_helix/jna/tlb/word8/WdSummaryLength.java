
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({E4E5B4E7-B80E-3791-A642-F574F355AE9A})</p>
 */
public enum WdSummaryLength implements IComEnum {
    
    /**
     * (-2)
     */
    wd10Sentences(-2),
    
    /**
     * (-3)
     */
    wd20Sentences(-3),
    
    /**
     * (-4)
     */
    wd100Words(-4),
    
    /**
     * (-5)
     */
    wd500Words(-5),
    
    /**
     * (-6)
     */
    wd10Percent(-6),
    
    /**
     * (-7)
     */
    wd25Percent(-7),
    
    /**
     * (-8)
     */
    wd50Percent(-8),
    
    /**
     * (-9)
     */
    wd75Percent(-9),
    ;

    private WdSummaryLength(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}