
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({C2BF1CFD-253F-35BF-90B4-74AC41756A39})</p>
 */
public enum WdBorderType implements IComEnum {
    
    /**
     * (-1)
     */
    wdBorderTop(-1),
    
    /**
     * (-2)
     */
    wdBorderLeft(-2),
    
    /**
     * (-3)
     */
    wdBorderBottom(-3),
    
    /**
     * (-4)
     */
    wdBorderRight(-4),
    
    /**
     * (-5)
     */
    wdBorderHorizontal(-5),
    
    /**
     * (-6)
     */
    wdBorderVertical(-6),
    
    /**
     * (-7)
     */
    wdBorderDiagonalDown(-7),
    
    /**
     * (-8)
     */
    wdBorderDiagonalUp(-8),
    ;

    private WdBorderType(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}