
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum XlPrintLocation implements IComEnum {
    
    /**
     * (1)
     */
    xlPrintSheetEnd(1),
    
    /**
     * (16)
     */
    xlPrintInPlace(16),
    
    /**
     * (-4142)
     */
    xlPrintNoComments(-4142),
    ;

    private XlPrintLocation(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}