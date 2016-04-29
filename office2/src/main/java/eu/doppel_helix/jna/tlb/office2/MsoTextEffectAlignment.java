
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum MsoTextEffectAlignment implements IComEnum {
    
    /**
     * (-2)
     */
    msoTextEffectAlignmentMixed(-2),
    
    /**
     * (1)
     */
    msoTextEffectAlignmentLeft(1),
    
    /**
     * (2)
     */
    msoTextEffectAlignmentCentered(2),
    
    /**
     * (3)
     */
    msoTextEffectAlignmentRight(3),
    
    /**
     * (4)
     */
    msoTextEffectAlignmentLetterJustify(4),
    
    /**
     * (5)
     */
    msoTextEffectAlignmentWordJustify(5),
    
    /**
     * (6)
     */
    msoTextEffectAlignmentStretchJustify(6),
    ;

    private MsoTextEffectAlignment(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}