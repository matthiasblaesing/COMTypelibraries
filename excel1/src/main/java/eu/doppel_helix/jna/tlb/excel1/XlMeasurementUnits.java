
package eu.doppel_helix.jna.tlb.excel1;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum XlMeasurementUnits implements IComEnum {
    
    /**
     * (0)
     */
    xlInches(0),
    
    /**
     * (1)
     */
    xlCentimeters(1),
    
    /**
     * (2)
     */
    xlMillimeters(2),
    ;

    private XlMeasurementUnits(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}