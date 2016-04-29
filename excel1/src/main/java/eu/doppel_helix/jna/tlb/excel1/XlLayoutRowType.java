
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum XlLayoutRowType implements IComEnum {
    
    /**
     * (0)
     */
    xlCompactRow(0),
    
    /**
     * (1)
     */
    xlTabularRow(1),
    
    /**
     * (2)
     */
    xlOutlineRow(2),
    ;

    private XlLayoutRowType(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}