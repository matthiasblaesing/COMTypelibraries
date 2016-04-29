
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum XlCalculationState implements IComEnum {
    
    /**
     * (0)
     */
    xlDone(0),
    
    /**
     * (1)
     */
    xlCalculating(1),
    
    /**
     * (2)
     */
    xlPending(2),
    ;

    private XlCalculationState(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}