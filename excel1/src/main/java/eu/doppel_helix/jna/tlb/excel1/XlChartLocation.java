
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum XlChartLocation implements IComEnum {
    
    /**
     * (1)
     */
    xlLocationAsNewSheet(1),
    
    /**
     * (2)
     */
    xlLocationAsObject(2),
    
    /**
     * (3)
     */
    xlLocationAutomatic(3),
    ;

    private XlChartLocation(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}