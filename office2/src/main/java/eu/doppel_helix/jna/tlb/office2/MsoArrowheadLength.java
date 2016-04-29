
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum MsoArrowheadLength implements IComEnum {
    
    /**
     * (-2)
     */
    msoArrowheadLengthMixed(-2),
    
    /**
     * (1)
     */
    msoArrowheadShort(1),
    
    /**
     * (2)
     */
    msoArrowheadLengthMedium(2),
    
    /**
     * (3)
     */
    msoArrowheadLong(3),
    ;

    private MsoArrowheadLength(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}