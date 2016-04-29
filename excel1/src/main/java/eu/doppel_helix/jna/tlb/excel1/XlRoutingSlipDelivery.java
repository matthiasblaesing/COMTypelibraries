
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum XlRoutingSlipDelivery implements IComEnum {
    
    /**
     * (2)
     */
    xlAllAtOnce(2),
    
    /**
     * (1)
     */
    xlOneAfterAnother(1),
    ;

    private XlRoutingSlipDelivery(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}