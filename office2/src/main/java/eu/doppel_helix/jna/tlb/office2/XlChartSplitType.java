
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({732091CB-0A8D-44BC-B977-418CCB37B552})</p>
 */
public enum XlChartSplitType implements IComEnum {
    
    /**
     * (1)
     */
    xlSplitByPosition(1),
    
    /**
     * (3)
     */
    xlSplitByPercentValue(3),
    
    /**
     * (4)
     */
    xlSplitByCustomSplit(4),
    
    /**
     * (2)
     */
    xlSplitByValue(2),
    ;

    private XlChartSplitType(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}