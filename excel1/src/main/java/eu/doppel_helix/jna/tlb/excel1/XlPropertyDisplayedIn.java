
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum XlPropertyDisplayedIn implements IComEnum {
    
    /**
     * (1)
     */
    xlDisplayPropertyInPivotTable(1),
    
    /**
     * (2)
     */
    xlDisplayPropertyInTooltip(2),
    
    /**
     * (3)
     */
    xlDisplayPropertyInPivotTableAndTooltip(3),
    ;

    private XlPropertyDisplayedIn(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}