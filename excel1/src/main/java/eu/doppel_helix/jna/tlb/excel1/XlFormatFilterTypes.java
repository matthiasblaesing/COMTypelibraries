
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum XlFormatFilterTypes implements IComEnum {
    
    /**
     * (0)
     */
    xlFilterBottom(0),
    
    /**
     * (1)
     */
    xlFilterTop(1),
    
    /**
     * (2)
     */
    xlFilterBottomPercent(2),
    
    /**
     * (3)
     */
    xlFilterTopPercent(3),
    ;

    private XlFormatFilterTypes(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}