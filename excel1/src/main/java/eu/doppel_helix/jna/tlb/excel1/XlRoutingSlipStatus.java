
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum XlRoutingSlipStatus implements IComEnum {
    
    /**
     * (0)
     */
    xlNotYetRouted(0),
    
    /**
     * (2)
     */
    xlRoutingComplete(2),
    
    /**
     * (1)
     */
    xlRoutingInProgress(1),
    ;

    private XlRoutingSlipStatus(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}