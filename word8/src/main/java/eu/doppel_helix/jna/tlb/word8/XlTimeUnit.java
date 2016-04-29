
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum XlTimeUnit implements IComEnum {
    
    /**
     * (0)
     */
    xlDays(0),
    
    /**
     * (1)
     */
    xlMonths(1),
    
    /**
     * (2)
     */
    xlYears(2),
    ;

    private XlTimeUnit(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}