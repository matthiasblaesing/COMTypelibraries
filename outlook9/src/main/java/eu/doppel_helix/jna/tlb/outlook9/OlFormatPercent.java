
package eu.doppel_helix.jna.tlb.outlook9;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum OlFormatPercent implements IComEnum {
    
    /**
     * (1)
     */
    olFormatPercentRounded(1),
    
    /**
     * (2)
     */
    olFormatPercent1Decimal(2),
    
    /**
     * (3)
     */
    olFormatPercent2Decimal(3),
    
    /**
     * (4)
     */
    olFormatPercentAllDigits(4),
    ;

    private OlFormatPercent(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}