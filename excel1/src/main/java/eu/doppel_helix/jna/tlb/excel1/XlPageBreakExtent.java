
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum XlPageBreakExtent implements IComEnum {
    
    /**
     * (1)
     */
    xlPageBreakFull(1),
    
    /**
     * (2)
     */
    xlPageBreakPartial(2),
    ;

    private XlPageBreakExtent(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}