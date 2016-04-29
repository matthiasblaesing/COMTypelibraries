
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum XlEnableCancelKey implements IComEnum {
    
    /**
     * (0)
     */
    xlDisabled(0),
    
    /**
     * (2)
     */
    xlErrorHandler(2),
    
    /**
     * (1)
     */
    xlInterrupt(1),
    ;

    private XlEnableCancelKey(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}