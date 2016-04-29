
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({2C1156B5-27D4-329B-B946-C3C66207AE75})</p>
 */
public enum WdLineEndingType implements IComEnum {
    
    /**
     * (0)
     */
    wdCRLF(0),
    
    /**
     * (1)
     */
    wdCROnly(1),
    
    /**
     * (2)
     */
    wdLFOnly(2),
    
    /**
     * (3)
     */
    wdLFCR(3),
    
    /**
     * (4)
     */
    wdLSPS(4),
    ;

    private WdLineEndingType(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}