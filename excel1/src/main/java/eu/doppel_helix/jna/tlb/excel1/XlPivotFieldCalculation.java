
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum XlPivotFieldCalculation implements IComEnum {
    
    /**
     * (2)
     */
    xlDifferenceFrom(2),
    
    /**
     * (9)
     */
    xlIndex(9),
    
    /**
     * (-4143)
     */
    xlNoAdditionalCalculation(-4143),
    
    /**
     * (4)
     */
    xlPercentDifferenceFrom(4),
    
    /**
     * (3)
     */
    xlPercentOf(3),
    
    /**
     * (7)
     */
    xlPercentOfColumn(7),
    
    /**
     * (6)
     */
    xlPercentOfRow(6),
    
    /**
     * (8)
     */
    xlPercentOfTotal(8),
    
    /**
     * (5)
     */
    xlRunningTotal(5),
    
    /**
     * (10)
     */
    xlPercentOfParentRow(10),
    
    /**
     * (11)
     */
    xlPercentOfParentColumn(11),
    
    /**
     * (12)
     */
    xlPercentOfParent(12),
    
    /**
     * (13)
     */
    xlPercentRunningTotal(13),
    
    /**
     * (14)
     */
    xlRankAscending(14),
    
    /**
     * (15)
     */
    xlRankDecending(15),
    ;

    private XlPivotFieldCalculation(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}