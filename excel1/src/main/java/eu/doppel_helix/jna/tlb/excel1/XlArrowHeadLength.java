
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum XlArrowHeadLength implements IComEnum {
    
    /**
     * (3)
     */
    xlArrowHeadLengthLong(3),
    
    /**
     * (-4138)
     */
    xlArrowHeadLengthMedium(-4138),
    
    /**
     * (1)
     */
    xlArrowHeadLengthShort(1),
    ;

    private XlArrowHeadLength(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}