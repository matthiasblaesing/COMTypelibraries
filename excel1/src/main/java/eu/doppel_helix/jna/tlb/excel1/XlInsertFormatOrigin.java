
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum XlInsertFormatOrigin implements IComEnum {
    
    /**
     * (0)
     */
    xlFormatFromLeftOrAbove(0),
    
    /**
     * (1)
     */
    xlFormatFromRightOrBelow(1),
    ;

    private XlInsertFormatOrigin(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}