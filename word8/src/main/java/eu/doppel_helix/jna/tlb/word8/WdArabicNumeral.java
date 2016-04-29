
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({E6AB5A96-2FF7-37FA-B555-65573AF645BC})</p>
 */
public enum WdArabicNumeral implements IComEnum {
    
    /**
     * (0)
     */
    wdNumeralArabic(0),
    
    /**
     * (1)
     */
    wdNumeralHindi(1),
    
    /**
     * (2)
     */
    wdNumeralContext(2),
    
    /**
     * (3)
     */
    wdNumeralSystem(3),
    ;

    private WdArabicNumeral(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}