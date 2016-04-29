
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum MsoArrowheadWidth implements IComEnum {
    
    /**
     * (-2)
     */
    msoArrowheadWidthMixed(-2),
    
    /**
     * (1)
     */
    msoArrowheadNarrow(1),
    
    /**
     * (2)
     */
    msoArrowheadWidthMedium(2),
    
    /**
     * (3)
     */
    msoArrowheadWide(3),
    ;

    private MsoArrowheadWidth(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}