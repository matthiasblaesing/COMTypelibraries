
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum XlDataSeriesDate implements IComEnum {
    
    /**
     * (1)
     */
    xlDay(1),
    
    /**
     * (3)
     */
    xlMonth(3),
    
    /**
     * (2)
     */
    xlWeekday(2),
    
    /**
     * (4)
     */
    xlYear(4),
    ;

    private XlDataSeriesDate(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}