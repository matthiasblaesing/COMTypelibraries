
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum XlSortOn implements IComEnum {
    
    /**
     * (0)
     */
    xlSortOnValues(0),
    
    /**
     * (1)
     */
    xlSortOnCellColor(1),
    
    /**
     * (2)
     */
    xlSortOnFontColor(2),
    
    /**
     * (3)
     */
    xlSortOnIcon(3),
    ;

    private XlSortOn(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}