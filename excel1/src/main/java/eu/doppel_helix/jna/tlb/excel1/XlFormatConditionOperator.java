
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum XlFormatConditionOperator implements IComEnum {
    
    /**
     * (1)
     */
    xlBetween(1),
    
    /**
     * (2)
     */
    xlNotBetween(2),
    
    /**
     * (3)
     */
    xlEqual(3),
    
    /**
     * (4)
     */
    xlNotEqual(4),
    
    /**
     * (5)
     */
    xlGreater(5),
    
    /**
     * (6)
     */
    xlLess(6),
    
    /**
     * (7)
     */
    xlGreaterEqual(7),
    
    /**
     * (8)
     */
    xlLessEqual(8),
    ;

    private XlFormatConditionOperator(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}