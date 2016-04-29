
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum XlPivotLineType implements IComEnum {
    
    /**
     * (0)
     */
    xlPivotLineRegular(0),
    
    /**
     * (1)
     */
    xlPivotLineSubtotal(1),
    
    /**
     * (2)
     */
    xlPivotLineGrandTotal(2),
    
    /**
     * (3)
     */
    xlPivotLineBlank(3),
    ;

    private XlPivotLineType(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}