
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum XlTotalsCalculation implements IComEnum {
    
    /**
     * (0)
     */
    xlTotalsCalculationNone(0),
    
    /**
     * (1)
     */
    xlTotalsCalculationSum(1),
    
    /**
     * (2)
     */
    xlTotalsCalculationAverage(2),
    
    /**
     * (3)
     */
    xlTotalsCalculationCount(3),
    
    /**
     * (4)
     */
    xlTotalsCalculationCountNums(4),
    
    /**
     * (5)
     */
    xlTotalsCalculationMin(5),
    
    /**
     * (6)
     */
    xlTotalsCalculationMax(6),
    
    /**
     * (7)
     */
    xlTotalsCalculationStdDev(7),
    
    /**
     * (8)
     */
    xlTotalsCalculationVar(8),
    
    /**
     * (9)
     */
    xlTotalsCalculationCustom(9),
    ;

    private XlTotalsCalculation(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}