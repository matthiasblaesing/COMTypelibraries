
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({381BE070-999B-3575-ADC6-68FC392AF3D3})</p>
 */
public enum WdTocFormat implements IComEnum {
    
    /**
     * (0)
     */
    wdTOCTemplate(0),
    
    /**
     * (1)
     */
    wdTOCClassic(1),
    
    /**
     * (2)
     */
    wdTOCDistinctive(2),
    
    /**
     * (3)
     */
    wdTOCFancy(3),
    
    /**
     * (4)
     */
    wdTOCModern(4),
    
    /**
     * (5)
     */
    wdTOCFormal(5),
    
    /**
     * (6)
     */
    wdTOCSimple(6),
    ;

    private WdTocFormat(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}