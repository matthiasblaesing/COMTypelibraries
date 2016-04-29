
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({8793E9D7-BF93-3E72-AEF2-566795531B56})</p>
 */
public enum WdMeasurementUnits implements IComEnum {
    
    /**
     * (0)
     */
    wdInches(0),
    
    /**
     * (1)
     */
    wdCentimeters(1),
    
    /**
     * (2)
     */
    wdMillimeters(2),
    
    /**
     * (3)
     */
    wdPoints(3),
    
    /**
     * (4)
     */
    wdPicas(4),
    ;

    private WdMeasurementUnits(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}