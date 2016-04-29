
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum MsoFilterConjunction implements IComEnum {
    
    /**
     * (0)
     */
    msoFilterConjunctionAnd(0),
    
    /**
     * (1)
     */
    msoFilterConjunctionOr(1),
    ;

    private MsoFilterConjunction(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}