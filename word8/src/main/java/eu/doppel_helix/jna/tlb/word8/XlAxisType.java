
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum XlAxisType implements IComEnum {
    
    /**
     * (1)
     */
    xlCategory(1),
    
    /**
     * (3)
     */
    xlSeriesAxis(3),
    
    /**
     * (2)
     */
    xlValue(2),
    ;

    private XlAxisType(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}