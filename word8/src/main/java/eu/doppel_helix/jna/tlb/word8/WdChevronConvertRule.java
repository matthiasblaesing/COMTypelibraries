
package eu.doppel_helix.jna.tlb.word8;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({7B607C60-CFFC-318E-BDB6-60B025B19545})</p>
 */
public enum WdChevronConvertRule implements IComEnum {
    
    /**
     * (0)
     */
    wdNeverConvert(0),
    
    /**
     * (1)
     */
    wdAlwaysConvert(1),
    
    /**
     * (2)
     */
    wdAskToNotConvert(2),
    
    /**
     * (3)
     */
    wdAskToConvert(3),
    ;

    private WdChevronConvertRule(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}