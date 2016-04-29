
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum XlSummaryColumn implements IComEnum {
    
    /**
     * (-4131)
     */
    xlSummaryOnLeft(-4131),
    
    /**
     * (-4152)
     */
    xlSummaryOnRight(-4152),
    ;

    private XlSummaryColumn(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}