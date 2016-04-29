
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum MsoTextOrientation implements IComEnum {
    
    /**
     * (-2)
     */
    msoTextOrientationMixed(-2),
    
    /**
     * (1)
     */
    msoTextOrientationHorizontal(1),
    
    /**
     * (2)
     */
    msoTextOrientationUpward(2),
    
    /**
     * (3)
     */
    msoTextOrientationDownward(3),
    
    /**
     * (4)
     */
    msoTextOrientationVerticalFarEast(4),
    
    /**
     * (5)
     */
    msoTextOrientationVertical(5),
    
    /**
     * (6)
     */
    msoTextOrientationHorizontalRotatedFarEast(6),
    ;

    private MsoTextOrientation(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}