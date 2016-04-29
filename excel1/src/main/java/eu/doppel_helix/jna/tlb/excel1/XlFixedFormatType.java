
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum XlFixedFormatType implements IComEnum {
    
    /**
     * (0)
     */
    xlTypePDF(0),
    
    /**
     * (1)
     */
    xlTypeXPS(1),
    ;

    private XlFixedFormatType(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}