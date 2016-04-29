
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({E185D7DA-3CBF-3644-806E-5F683669AF8E})</p>
 */
public enum WdNumberType implements IComEnum {
    
    /**
     * (1)
     */
    wdNumberParagraph(1),
    
    /**
     * (2)
     */
    wdNumberListNum(2),
    
    /**
     * (3)
     */
    wdNumberAllNumbers(3),
    ;

    private WdNumberType(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}