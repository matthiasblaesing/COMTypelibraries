
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum MsoGradientStyle implements IComEnum {
    
    /**
     * (-2)
     */
    msoGradientMixed(-2),
    
    /**
     * (1)
     */
    msoGradientHorizontal(1),
    
    /**
     * (2)
     */
    msoGradientVertical(2),
    
    /**
     * (3)
     */
    msoGradientDiagonalUp(3),
    
    /**
     * (4)
     */
    msoGradientDiagonalDown(4),
    
    /**
     * (5)
     */
    msoGradientFromCorner(5),
    
    /**
     * (6)
     */
    msoGradientFromTitle(6),
    
    /**
     * (7)
     */
    msoGradientFromCenter(7),
    ;

    private MsoGradientStyle(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}