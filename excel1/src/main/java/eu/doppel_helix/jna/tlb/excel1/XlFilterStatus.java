
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum XlFilterStatus implements IComEnum {
    
    /**
     * (0)
     */
    xlFilterStatusOK(0),
    
    /**
     * (1)
     */
    xlFilterStatusDateWrongOrder(1),
    
    /**
     * (2)
     */
    xlFilterStatusDateHasTime(2),
    
    /**
     * (3)
     */
    xlFilterStatusInvalidDate(3),
    ;

    private XlFilterStatus(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}