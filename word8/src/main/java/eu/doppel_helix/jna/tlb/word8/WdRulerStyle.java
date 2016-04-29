
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({B8749705-255F-370D-B1DD-4B027F6DE5B6})</p>
 */
public enum WdRulerStyle implements IComEnum {
    
    /**
     * (0)
     */
    wdAdjustNone(0),
    
    /**
     * (1)
     */
    wdAdjustProportional(1),
    
    /**
     * (2)
     */
    wdAdjustFirstColumn(2),
    
    /**
     * (3)
     */
    wdAdjustSameWidth(3),
    ;

    private WdRulerStyle(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}