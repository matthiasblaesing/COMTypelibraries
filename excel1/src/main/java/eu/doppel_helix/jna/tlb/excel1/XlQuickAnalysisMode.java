
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum XlQuickAnalysisMode implements IComEnum {
    
    /**
     * (0)
     */
    xlLensOnly(0),
    
    /**
     * (1)
     */
    xlFormatConditions(1),
    
    /**
     * (2)
     */
    xlRecommendedCharts(2),
    
    /**
     * (3)
     */
    xlTotals(3),
    
    /**
     * (4)
     */
    xlTables(4),
    
    /**
     * (5)
     */
    xlSparklines(5),
    ;

    private XlQuickAnalysisMode(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}