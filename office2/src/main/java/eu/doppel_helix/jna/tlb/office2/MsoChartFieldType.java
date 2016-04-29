
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum MsoChartFieldType implements IComEnum {
    
    /**
     * (1)
     */
    msoChartFieldBubbleSize(1),
    
    /**
     * (2)
     */
    msoChartFieldCategoryName(2),
    
    /**
     * (3)
     */
    msoChartFieldPercentage(3),
    
    /**
     * (4)
     */
    msoChartFieldSeriesName(4),
    
    /**
     * (5)
     */
    msoChartFieldValue(5),
    
    /**
     * (6)
     */
    msoChartFieldFormula(6),
    
    /**
     * (7)
     */
    msoChartFieldRange(7),
    ;

    private MsoChartFieldType(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}