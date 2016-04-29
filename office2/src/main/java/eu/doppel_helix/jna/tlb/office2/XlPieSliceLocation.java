
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({B270C821-56A3-4F6D-9274-74E6CDF4D10C})</p>
 */
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