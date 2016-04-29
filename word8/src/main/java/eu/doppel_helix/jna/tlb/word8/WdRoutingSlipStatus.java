
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({FAB5FFAC-8DCB-3EC9-8554-51DCECAE5C3C})</p>
 */
public enum WdRoutingSlipStatus implements IComEnum {
    
    /**
     * (0)
     */
    wdNotYetRouted(0),
    
    /**
     * (1)
     */
    wdRouteInProgress(1),
    
    /**
     * (2)
     */
    wdRouteComplete(2),
    ;

    private WdRoutingSlipStatus(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}