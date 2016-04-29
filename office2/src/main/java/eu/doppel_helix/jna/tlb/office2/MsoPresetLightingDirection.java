
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum MsoPresetLightingDirection implements IComEnum {
    
    /**
     * (-2)
     */
    msoPresetLightingDirectionMixed(-2),
    
    /**
     * (1)
     */
    msoLightingTopLeft(1),
    
    /**
     * (2)
     */
    msoLightingTop(2),
    
    /**
     * (3)
     */
    msoLightingTopRight(3),
    
    /**
     * (4)
     */
    msoLightingLeft(4),
    
    /**
     * (5)
     */
    msoLightingNone(5),
    
    /**
     * (6)
     */
    msoLightingRight(6),
    
    /**
     * (7)
     */
    msoLightingBottomLeft(7),
    
    /**
     * (8)
     */
    msoLightingBottom(8),
    
    /**
     * (9)
     */
    msoLightingBottomRight(9),
    ;

    private MsoPresetLightingDirection(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}