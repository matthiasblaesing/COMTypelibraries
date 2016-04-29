
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum MsoPresetExtrusionDirection implements IComEnum {
    
    /**
     * (-2)
     */
    msoPresetExtrusionDirectionMixed(-2),
    
    /**
     * (1)
     */
    msoExtrusionBottomRight(1),
    
    /**
     * (2)
     */
    msoExtrusionBottom(2),
    
    /**
     * (3)
     */
    msoExtrusionBottomLeft(3),
    
    /**
     * (4)
     */
    msoExtrusionRight(4),
    
    /**
     * (5)
     */
    msoExtrusionNone(5),
    
    /**
     * (6)
     */
    msoExtrusionLeft(6),
    
    /**
     * (7)
     */
    msoExtrusionTopRight(7),
    
    /**
     * (8)
     */
    msoExtrusionTop(8),
    
    /**
     * (9)
     */
    msoExtrusionTopLeft(9),
    ;

    private MsoPresetExtrusionDirection(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}