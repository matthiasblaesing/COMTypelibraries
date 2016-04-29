
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum MsoBaselineAlignment implements IComEnum {
    
    /**
     * (-2)
     */
    msoBaselineAlignMixed(-2),
    
    /**
     * (1)
     */
    msoBaselineAlignBaseline(1),
    
    /**
     * (2)
     */
    msoBaselineAlignTop(2),
    
    /**
     * (3)
     */
    msoBaselineAlignCenter(3),
    
    /**
     * (4)
     */
    msoBaselineAlignFarEast50(4),
    
    /**
     * (5)
     */
    msoBaselineAlignAuto(5),
    ;

    private MsoBaselineAlignment(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}