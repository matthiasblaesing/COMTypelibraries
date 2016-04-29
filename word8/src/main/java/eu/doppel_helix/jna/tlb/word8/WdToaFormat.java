
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({B12AC10C-DAC9-3348-BD2B-29A0A270196B})</p>
 */
public enum WdToaFormat implements IComEnum {
    
    /**
     * (0)
     */
    wdTOATemplate(0),
    
    /**
     * (1)
     */
    wdTOAClassic(1),
    
    /**
     * (2)
     */
    wdTOADistinctive(2),
    
    /**
     * (3)
     */
    wdTOAFormal(3),
    
    /**
     * (4)
     */
    wdTOASimple(4),
    ;

    private WdToaFormat(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}