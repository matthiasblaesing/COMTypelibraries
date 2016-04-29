
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum XlAutoFillType implements IComEnum {
    
    /**
     * (1)
     */
    xlFillCopy(1),
    
    /**
     * (5)
     */
    xlFillDays(5),
    
    /**
     * (0)
     */
    xlFillDefault(0),
    
    /**
     * (3)
     */
    xlFillFormats(3),
    
    /**
     * (7)
     */
    xlFillMonths(7),
    
    /**
     * (2)
     */
    xlFillSeries(2),
    
    /**
     * (4)
     */
    xlFillValues(4),
    
    /**
     * (6)
     */
    xlFillWeekdays(6),
    
    /**
     * (8)
     */
    xlFillYears(8),
    
    /**
     * (10)
     */
    xlGrowthTrend(10),
    
    /**
     * (9)
     */
    xlLinearTrend(9),
    
    /**
     * (11)
     */
    xlFlashFill(11),
    ;

    private XlAutoFillType(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}