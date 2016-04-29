
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum XlConditionValueTypes implements IComEnum {
    
    /**
     * (-1)
     */
    xlConditionValueNone(-1),
    
    /**
     * (0)
     */
    xlConditionValueNumber(0),
    
    /**
     * (1)
     */
    xlConditionValueLowestValue(1),
    
    /**
     * (2)
     */
    xlConditionValueHighestValue(2),
    
    /**
     * (3)
     */
    xlConditionValuePercent(3),
    
    /**
     * (4)
     */
    xlConditionValueFormula(4),
    
    /**
     * (5)
     */
    xlConditionValuePercentile(5),
    
    /**
     * (6)
     */
    xlConditionValueAutomaticMin(6),
    
    /**
     * (7)
     */
    xlConditionValueAutomaticMax(7),
    ;

    private XlConditionValueTypes(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}