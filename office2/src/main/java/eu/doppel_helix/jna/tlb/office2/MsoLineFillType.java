
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum MsoLineFillType implements IComEnum {
    
    /**
     * (-2)
     */
    msoLineFillMixed(-2),
    
    /**
     * (0)
     */
    msoLineFillNone(0),
    
    /**
     * (1)
     */
    msoLineFillSolid(1),
    
    /**
     * (2)
     */
    msoLineFillPatterned(2),
    
    /**
     * (3)
     */
    msoLineFillGradient(3),
    
    /**
     * (4)
     */
    msoLineFillTextured(4),
    
    /**
     * (5)
     */
    msoLineFillBackground(5),
    
    /**
     * (6)
     */
    msoLineFillPicture(6),
    ;

    private MsoLineFillType(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}