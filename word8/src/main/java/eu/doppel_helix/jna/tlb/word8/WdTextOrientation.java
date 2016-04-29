
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({C1432471-5CCA-3C20-88BE-740332643664})</p>
 */
public enum WdTextOrientation implements IComEnum {
    
    /**
     * (0)
     */
    wdTextOrientationHorizontal(0),
    
    /**
     * (2)
     */
    wdTextOrientationUpward(2),
    
    /**
     * (3)
     */
    wdTextOrientationDownward(3),
    
    /**
     * (1)
     */
    wdTextOrientationVerticalFarEast(1),
    
    /**
     * (4)
     */
    wdTextOrientationHorizontalRotatedFarEast(4),
    
    /**
     * (5)
     */
    wdTextOrientationVertical(5),
    ;

    private WdTextOrientation(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}