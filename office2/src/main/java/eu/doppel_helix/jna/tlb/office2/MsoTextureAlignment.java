
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum MsoTextureAlignment implements IComEnum {
    
    /**
     * (-2)
     */
    msoTextureAlignmentMixed(-2),
    
    /**
     * (0)
     */
    msoTextureTopLeft(0),
    
    /**
     * (1)
     */
    msoTextureTop(1),
    
    /**
     * (2)
     */
    msoTextureTopRight(2),
    
    /**
     * (3)
     */
    msoTextureLeft(3),
    
    /**
     * (4)
     */
    msoTextureCenter(4),
    
    /**
     * (5)
     */
    msoTextureRight(5),
    
    /**
     * (6)
     */
    msoTextureBottomLeft(6),
    
    /**
     * (7)
     */
    msoTextureBottom(7),
    
    /**
     * (8)
     */
    msoTextureBottomRight(8),
    ;

    private MsoTextureAlignment(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}