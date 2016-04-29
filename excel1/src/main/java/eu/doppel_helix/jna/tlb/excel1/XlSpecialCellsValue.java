
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum XlSpecialCellsValue implements IComEnum {
    
    /**
     * (16)
     */
    xlErrors(16),
    
    /**
     * (4)
     */
    xlLogical(4),
    
    /**
     * (1)
     */
    xlNumbers(1),
    
    /**
     * (2)
     */
    xlTextValues(2),
    ;

    private XlSpecialCellsValue(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}