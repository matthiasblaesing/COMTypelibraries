
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum MsoTextStrike implements IComEnum {
    
    /**
     * (-2)
     */
    msoStrikeMixed(-2),
    
    /**
     * (0)
     */
    msoNoStrike(0),
    
    /**
     * (1)
     */
    msoSingleStrike(1),
    
    /**
     * (2)
     */
    msoDoubleStrike(2),
    ;

    private MsoTextStrike(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}