
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum XlCalcMemNumberFormatType implements IComEnum {
    
    /**
     * (0)
     */
    xlNumberFormatTypeDefault(0),
    
    /**
     * (1)
     */
    xlNumberFormatTypeNumber(1),
    
    /**
     * (2)
     */
    xlNumberFormatTypePercent(2),
    ;

    private XlCalcMemNumberFormatType(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}