
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum XlPieSliceLocation implements IComEnum {
    
    /**
     * (1)
     */
    xlHorizontalCoordinate(1),
    
    /**
     * (2)
     */
    xlVerticalCoordinate(2),
    ;

    private XlPieSliceLocation(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}