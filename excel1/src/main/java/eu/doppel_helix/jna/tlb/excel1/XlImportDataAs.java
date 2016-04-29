
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum XlImportDataAs implements IComEnum {
    
    /**
     * (0)
     */
    xlQueryTable(0),
    
    /**
     * (1)
     */
    xlPivotTableReport(1),
    
    /**
     * (2)
     */
    xlTable(2),
    ;

    private XlImportDataAs(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}