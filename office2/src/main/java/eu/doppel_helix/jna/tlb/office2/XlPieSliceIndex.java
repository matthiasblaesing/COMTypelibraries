
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({2B4C8AB7-6E70-422A-B7CC-206452289F16})</p>
 */
public enum XlPieSliceIndex implements IComEnum {
    
    /**
     * (1)
     */
    xlOuterCounterClockwisePoint(1),
    
    /**
     * (2)
     */
    xlOuterCenterPoint(2),
    
    /**
     * (3)
     */
    xlOuterClockwisePoint(3),
    
    /**
     * (4)
     */
    xlMidClockwiseRadiusPoint(4),
    
    /**
     * (5)
     */
    xlCenterPoint(5),
    
    /**
     * (6)
     */
    xlMidCounterClockwiseRadiusPoint(6),
    
    /**
     * (7)
     */
    xlInnerClockwisePoint(7),
    
    /**
     * (8)
     */
    xlInnerCenterPoint(8),
    
    /**
     * (9)
     */
    xlInnerCounterClockwisePoint(9),
    ;

    private XlPieSliceIndex(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}