
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum XlAllocationMethod implements IComEnum {
    
    /**
     * (1)
     */
    xlEqualAllocation(1),
    
    /**
     * (2)
     */
    xlWeightedAllocation(2),
    ;

    private XlAllocationMethod(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}