
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum MsoFillType implements IComEnum {
    
    /**
     * (-2)
     */
    msoFillMixed(-2),
    
    /**
     * (1)
     */
    msoFillSolid(1),
    
    /**
     * (2)
     */
    msoFillPatterned(2),
    
    /**
     * (3)
     */
    msoFillGradient(3),
    
    /**
     * (4)
     */
    msoFillTextured(4),
    
    /**
     * (5)
     */
    msoFillBackground(5),
    
    /**
     * (6)
     */
    msoFillPicture(6),
    ;

    private MsoFillType(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}