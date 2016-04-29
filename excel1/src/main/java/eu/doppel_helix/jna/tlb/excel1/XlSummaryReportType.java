
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum XlSummaryReportType implements IComEnum {
    
    /**
     * (-4148)
     */
    xlSummaryPivotTable(-4148),
    
    /**
     * (1)
     */
    xlStandardSummary(1),
    ;

    private XlSummaryReportType(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}