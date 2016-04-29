
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({760A1DA4-732F-3807-9348-F1523975D7CB})</p>
 */
public enum WdSalutationType implements IComEnum {
    
    /**
     * (0)
     */
    wdSalutationInformal(0),
    
    /**
     * (1)
     */
    wdSalutationFormal(1),
    
    /**
     * (2)
     */
    wdSalutationBusiness(2),
    
    /**
     * (3)
     */
    wdSalutationOther(3),
    ;

    private WdSalutationType(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}