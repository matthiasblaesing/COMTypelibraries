
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum XlDataBarNegativeColorType implements IComEnum {
    
    /**
     * (0)
     */
    xlDataBarColor(0),
    
    /**
     * (1)
     */
    xlDataBarSameAsPositive(1),
    ;

    private XlDataBarNegativeColorType(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}