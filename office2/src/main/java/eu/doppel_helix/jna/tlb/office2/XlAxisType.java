
package eu.doppel_helix.jna.tlb.office2;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({23D8FDAA-ABF3-4735-99B8-F234EA2BE64C})</p>
 */
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