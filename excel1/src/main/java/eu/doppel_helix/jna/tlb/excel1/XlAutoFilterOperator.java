
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum XlAutoFilterOperator implements IComEnum {
    
    /**
     * (1)
     */
    xlAnd(1),
    
    /**
     * (4)
     */
    xlBottom10Items(4),
    
    /**
     * (6)
     */
    xlBottom10Percent(6),
    
    /**
     * (2)
     */
    xlOr(2),
    
    /**
     * (3)
     */
    xlTop10Items(3),
    
    /**
     * (5)
     */
    xlTop10Percent(5),
    
    /**
     * (7)
     */
    xlFilterValues(7),
    
    /**
     * (8)
     */
    xlFilterCellColor(8),
    
    /**
     * (9)
     */
    xlFilterFontColor(9),
    
    /**
     * (10)
     */
    xlFilterIcon(10),
    
    /**
     * (11)
     */
    xlFilterDynamic(11),
    
    /**
     * (12)
     */
    xlFilterNoFill(12),
    
    /**
     * (13)
     */
    xlFilterAutomaticFontColor(13),
    
    /**
     * (14)
     */
    xlFilterNoIcon(14),
    ;

    private XlAutoFilterOperator(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}