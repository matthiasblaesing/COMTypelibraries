
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({37F5F8CF-B92C-34D1-90CC-30ACB9334AB5})</p>
 */
public enum WdRoutingSlipDelivery implements IComEnum {
    
    /**
     * (0)
     */
    wdOneAfterAnother(0),
    
    /**
     * (1)
     */
    wdAllAtOnce(1),
    ;

    private WdRoutingSlipDelivery(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}