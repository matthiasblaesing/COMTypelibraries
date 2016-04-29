
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum XlSummaryRow implements IComEnum {
    
    /**
     * (0)
     */
    xlSummaryAbove(0),
    
    /**
     * (1)
     */
    xlSummaryBelow(1),
    ;

    private XlSummaryRow(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}